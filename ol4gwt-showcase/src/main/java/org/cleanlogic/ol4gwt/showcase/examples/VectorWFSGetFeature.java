/*
 * Copyright 2017 iserge.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cleanlogic.ol4gwt.showcase.examples;

import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.*;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.xml.client.Node;
import org.cleanlogic.ol4gwt.showcase.basic.AbstractExample;
import org.cleanlogic.ol4gwt.showcase.components.store.ShowcaseExampleStore;
import org.openlayers.js.XMLSerializer;
import org.openlayers.ol.*;
import org.openlayers.ol.format.GeoJSONFormat;
import org.openlayers.ol.format.WFSFormat;
import org.openlayers.ol.format.filter.EqualToFilter;
import org.openlayers.ol.format.filter.Filter;
import org.openlayers.ol.format.filter.FilterUtils;
import org.openlayers.ol.format.filter.IsLikeFilter;
import org.openlayers.ol.format.options.GetFeatureOptions;
import org.openlayers.ol.layer.BaseLayer;
import org.openlayers.ol.layer.TileLayer;
import org.openlayers.ol.layer.VectorLayer;
import org.openlayers.ol.layer.options.VectorLayerOptions;
import org.openlayers.ol.options.MapOptions;
import org.openlayers.ol.options.ViewOptions;
import org.openlayers.ol.source.BingMapsSource;
import org.openlayers.ol.source.VectorSource;
import org.openlayers.ol.source.options.BingMapsSourceOptions;
import org.openlayers.ol.style.StrokeStyle;
import org.openlayers.ol.style.Style;
import org.openlayers.ol.style.options.StyleOptions;

import javax.inject.Inject;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class VectorWFSGetFeature extends AbstractExample {
    private VectorSource vectorSource = new VectorSource();

    @Inject
    public VectorWFSGetFeature(ShowcaseExampleStore store) {
        super("Vector WFS GetFeature", "OpenStreetMap", new String[]{"Map", "View", "WFS", "GeoJSON", "TileLayer", "VectorLayer", "BingMapsSource", "VectorSource", "StrokeStyle", "Style"}, store);
    }

    @Override
    public void buildPanel() {
        StyleOptions styleOptions = new StyleOptions();
        styleOptions.stroke = StrokeStyle.create(Color.create(0, 0, 255, 1.0), 2);
        VectorLayerOptions vectorLayerOptions = new VectorLayerOptions();
        vectorLayerOptions.source = vectorSource;
//        vectorLayerOptions.style = new Style[] {new Style(styleOptions)};
        VectorLayer vectorLayer = new VectorLayer(vectorLayerOptions);

        BingMapsSourceOptions bingMapsSourceOptions = new BingMapsSourceOptions();
        bingMapsSourceOptions.imagerySet = "Aerial";
        bingMapsSourceOptions.key = "AkGbxXx6tDWf1swIhPJyoAVp06H0s0gDTYslNWWHZ6RoPqMpB9ld5FY1WutX8UoF";
        TileLayer raster = TileLayer.create(new BingMapsSource(bingMapsSourceOptions));

        ViewOptions viewOptions = new ViewOptions();
        viewOptions.center = Coordinate.create(-8908887.277395891, 5381918.072437216);
        viewOptions.maxZoom = 19;
        viewOptions.zoom = 12;

        MapOptions mapOptions = new MapOptions();
        mapOptions.layers = new Collection<>(new BaseLayer[] {raster, vectorLayer});
        mapOptions.view = new View(viewOptions);

        final MapPanel mapPanel = new MapPanel(mapOptions);
        mapPanel.setHeight("400px");

        Filter filter = FilterUtils.and(
                new IsLikeFilter("name", "Mississippi*"),
                new EqualToFilter("waterway", "riverbank")
        );

        GetFeatureOptions getFeatureOptions = new GetFeatureOptions();
        getFeatureOptions.srsName = "EPSG:3857";
        getFeatureOptions.featureNS = "http://openstreemap.org";
        getFeatureOptions.featurePrefix = "osm";
        getFeatureOptions.featureTypes = new String[] {"water_areas"};
        getFeatureOptions.outputFormat = "application/json";
        getFeatureOptions.filter = filter;
        WFSFormat wfsFormat = new WFSFormat();
        Node node = wfsFormat.writeGetFeature(getFeatureOptions);
        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, "https://ahocevar.com/geoserver/wfs");
        requestBuilder.setRequestData(new XMLSerializer().serializeToString(node));
        requestBuilder.setCallback(new RequestCallback() {
            @Override
            public void onResponseReceived(Request request, Response response) {
                GeoJSONFormat format = new GeoJSONFormat();
                Feature[] features = format.readFeatures(response.getText());
                vectorSource.addFeatures(features);
                mapPanel.getMap().getView().fit(vectorSource.getExtent());
            }

            @Override
            public void onError(Request request, Throwable throwable) {
                GWT.log(throwable.toString());
            }
        });

        contentPanel.add(new HTML("<p>This example generates a GetFeature request which uses a PropertyIsEqualTo and a PropertyIsLike filter, and then posts the request to load the features that match the query.</p>"));
        contentPanel.add(mapPanel);

        initWidget(contentPanel);
        try {
            requestBuilder.send();
        } catch (RequestException ex) {
            GWT.log(ex.getLocalizedMessage());
        }
    }

    @Override
    public String[] getSourceCodeURLs() {
        String[] sourceCodeURLs = new String[1];
        sourceCodeURLs[0] = GWT.getModuleBaseURL() + "examples/" + "VectorWFSGetFeature.txt";
        return sourceCodeURLs;
    }
}