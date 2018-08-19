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

package org.cleanlogic.showcase.client.examples;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.HTML;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.cleanlogic.showcase.client.basic.AbstractExample;
import org.cleanlogic.showcase.client.components.store.ShowcaseExampleStore;
import org.openlayers.ol.*;
import org.openlayers.ol.Object;
import org.openlayers.ol.layer.BaseLayer;
import org.openlayers.ol.layer.TileLayer;
import org.openlayers.ol.layer.options.TileLayerOptions;
import org.openlayers.ol.options.MapOptions;
import org.openlayers.ol.options.ViewOptions;
import org.openlayers.ol.source.OSMSource;
import org.openlayers.ol.source.TileWMSSource;
import org.openlayers.ol.source.options.TileWMSSourceOptions;

import javax.inject.Inject;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class WMSTiled extends AbstractExample {

    @Inject
    public WMSTiled(ShowcaseExampleStore store) {
        super("WMS Tiled", "OpenStreetMap", new String[]{"Showcase", "OpenLayers", "OSMSource"}, store);
    }

    @Override
    public void buildPanel() {
        TileLayer osmLayer = TileLayer.create(new OSMSource());

        WMSParams wmsParams = new WMSParams();
        wmsParams.layers = "Глобальное векторное покрытие:-1";
        wmsParams.tiled = true;

        TileWMSSourceOptions tileWMSSourceOptions = new TileWMSSourceOptions();
        tileWMSSourceOptions.url = "http://127.0.0.1:8888/services/wms";
        tileWMSSourceOptions.params = wmsParams;

        TileLayerOptions tileLayerOptions = new TileLayerOptions();
        tileLayerOptions.extent = Extent.create(-13884991, 2870341, -7455066, 6338219);
        tileLayerOptions.source = new TileWMSSource(tileWMSSourceOptions);

        TileLayer wmsLayer = new TileLayer(tileLayerOptions);

        ViewOptions viewOptions = new ViewOptions();
        viewOptions.center = Coordinate.create(-10997148, 4569099);
        viewOptions.zoom = 4;

        MapOptions mapOptions = new MapOptions();
        mapOptions.layers = new Collection<>(new BaseLayer[] {osmLayer, wmsLayer});
        mapOptions.view = new View(viewOptions);

        MapPanel mapPanel = new MapPanel(mapOptions);
        mapPanel.setHeight("400px");

        contentPanel.add(mapPanel);
        contentPanel.add(new HTML("<p>WMS can be used as a Tile layer, as shown here, or as an Image layer, as shown in the Single Image WMS example example. Tiles can be cached, so the browser will not re-fetch data for areas that were viewed already. But there may be problems with repeated labels for WMS servers that are not aware of tiles, in which case single image WMS will produce better cartography.</p>"));

        initWidget(contentPanel);
    }

    @Override
    public String[] getSourceCodeURLs() {
        String[] sourceCodeURLs = new String[1];
        sourceCodeURLs[0] = GWT.getModuleBaseURL() + "examples/" + "OSM.txt";
        return sourceCodeURLs;
    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    private static class WMSParams extends Object {
        @JsProperty(name = "LAYERS")
        public String layers;
        @JsProperty(name = "TILED")
        public boolean tiled;

        @JsConstructor
        public WMSParams() {}
    }
}
