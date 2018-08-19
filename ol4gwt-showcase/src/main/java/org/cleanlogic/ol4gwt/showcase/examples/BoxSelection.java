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
import com.google.gwt.dom.client.StyleInjector;
import com.google.gwt.user.client.ui.*;
import org.cleanlogic.ol4gwt.showcase.basic.AbstractExample;
import org.cleanlogic.ol4gwt.showcase.components.store.ShowcaseExampleStore;
import org.openlayers.ol.*;
import org.openlayers.ol.events.Condition;
import org.openlayers.ol.events.DragBoxInteractionEvent;
import org.openlayers.ol.format.GeoJSONFormat;
import org.openlayers.ol.interaction.DragBoxInteraction;
import org.openlayers.ol.interaction.SelectInteraction;
import org.openlayers.ol.interaction.options.DragBoxInteractionOptions;
import org.openlayers.ol.layer.BaseLayer;
import org.openlayers.ol.layer.TileLayer;
import org.openlayers.ol.layer.VectorLayer;
import org.openlayers.ol.options.MapOptions;
import org.openlayers.ol.options.ViewOptions;
import org.openlayers.ol.source.OSMSource;
import org.openlayers.ol.source.VectorSource;
import org.openlayers.ol.source.options.VectorSourceOptions;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class BoxSelection extends AbstractExample {

    @Inject
    public BoxSelection(ShowcaseExampleStore store) {
        super("Box Selection", "Box selection", new String[]{"Map", "View", "condition", "GeoJSON", "DragBox", "Select", "TileLayer", "VectorLayer", "OSM", "VectorSource"}, store);
    }

    @Override
    public void buildPanel() {
        // Inject style
        StyleInjector.inject(".ol-dragbox {background-color: rgba(255,255,255,0.4);border-color: rgba(100,150,0,1);}");

        VectorSourceOptions vectorSourceOptions = new VectorSourceOptions();
        vectorSourceOptions.url = "https://openlayers.org/en/v4.0.1/examples/data/geojson/countries.geojson";
        vectorSourceOptions.format = new GeoJSONFormat();
        final VectorLayer vectorLayer = VectorLayer.create(new VectorSource(vectorSourceOptions));

        TileLayer tileLayer = TileLayer.create(new OSMSource());

        ViewOptions viewOptions = new ViewOptions();
        viewOptions.center = Coordinate.create(0, 0);
        viewOptions.zoom = 2;

        MapOptions mapOptions = new MapOptions();
        mapOptions.layers = new Collection<>(new BaseLayer[] {tileLayer, vectorLayer});
        mapOptions.view = new View(viewOptions);

        MapPanel mapPanel = new MapPanel(mapOptions);
        mapPanel.setHeight("300px");

        final HTML infoHTML = new HTML();

        final SelectInteraction selectInteraction = new SelectInteraction();
        mapPanel.getMap().addInteraction(selectInteraction);

        DragBoxInteractionOptions dragBoxInteractionOptions = new DragBoxInteractionOptions();
        dragBoxInteractionOptions.condition = Condition.platformModifierKeyOnly();
        final DragBoxInteraction dragBoxInteraction = new DragBoxInteraction(dragBoxInteractionOptions);
        mapPanel.getMap().addInteraction(dragBoxInteraction);

        final Collection<Feature> selectedFeatures = selectInteraction.getFeatures();

        DragBoxInteraction.BoxStartListener boxStartListener = new DragBoxInteraction.BoxStartListener() {
            @Override
            public void function(DragBoxInteractionEvent event) {
                selectedFeatures.clear();
                infoHTML.setHTML("");
            }
        };
        DragBoxInteraction.BoxEndListener boxEndListener = new DragBoxInteraction.BoxEndListener() {
            @Override
            public void function(DragBoxInteractionEvent event) {
                final List<String> info = new ArrayList<>();
                Extent extent = dragBoxInteraction.getGeometry().getExtent();
                vectorLayer.getSource().forEachFeatureIntersectingExtent(extent, new VectorSource.Callback() {
                    @Override
                    public void function(Feature feature) {
                        selectedFeatures.push(feature);
                        info.add(feature.get("name").toString());
                    }
                });
                if (info.size() > 0) {
                    infoHTML.setHTML(info.toString());
                }
            }
        };

        dragBoxInteraction.on(DragBoxInteraction.BoxStartListener.TYPE, (Observable.Listener)boxStartListener);
        dragBoxInteraction.on(DragBoxInteraction.BoxEndListener.TYPE, (Observable.Listener)boxEndListener);

        mapPanel.getMap().on("click", new Observable.Listener() {
            @Override
            public void function() {
                selectedFeatures.clear();
                infoHTML.setHTML("");
            }
        });

        String description = "<p>This example shows how to use a DragBox interaction to select features. Selected features are added to the feature overlay of a select interaction (ol.interaction.Select) for highlighting. <br /><br />Use Ctrl+Drag (Command+Drag on Mac) to draw boxes.</p>";

        contentPanel.add(mapPanel);
        contentPanel.add(infoHTML);
        contentPanel.add(new HTML(description));

        initWidget(contentPanel);
    }

    @Override
    public String[] getSourceCodeURLs() {
        String[] sourceCodeURLs = new String[1];
        sourceCodeURLs[0] = GWT.getModuleBaseURL() + "examples/" + "BoxSelection.txt";
        return sourceCodeURLs;
    }
}
