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
import com.google.gwt.user.client.ui.HTML;
import org.cleanlogic.ol4gwt.showcase.basic.AbstractExample;
import org.cleanlogic.ol4gwt.showcase.components.store.ShowcaseExampleStore;
import org.openlayers.ol.*;
import org.openlayers.ol.layer.TileLayer;
import org.openlayers.ol.layer.options.TileLayerOptions;
import org.openlayers.ol.options.MapOptions;
import org.openlayers.ol.options.ViewOptions;
import org.openlayers.ol.source.OSMSource;

import javax.inject.Inject;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class OSM extends AbstractExample {

    @Inject
    public OSM(ShowcaseExampleStore store) {
        super("OSM", "OpenStreetMap", new String[]{"Showcase", "OpenLayers", "OSMSource"}, store);
    }

    @Override
    public void buildPanel() {
        TileLayerOptions tileLayerOptions = new TileLayerOptions();
        tileLayerOptions.source = new OSMSource();
        TileLayer tileLayer = new TileLayer(tileLayerOptions);

        ViewOptions viewOptions = new ViewOptions();
        viewOptions.center = new Coordinate(new double[] {-10997148, 4569099});
        viewOptions.zoom = 4;

        MapOptions mapOptions = new MapOptions();
        mapOptions.logoVisible = false;
        mapOptions.loadTilesWhileAnimating = true;
        mapOptions.loadTilesWhileInteracting = true;
        mapOptions.layers = new Collection<>();
        mapOptions.layers.push(tileLayer);
        mapOptions.view = new View(viewOptions);

        MapPanel mapPanel = new MapPanel(mapOptions);
        mapPanel.setHeight("400px");

        contentPanel.add(new HTML("<p>Use Viewer to start building new applications or easily embed Cesium into existing applications.</p>"));
        contentPanel.add(mapPanel);

        initWidget(contentPanel);
    }

    @Override
    public String[] getSourceCodeURLs() {
        String[] sourceCodeURLs = new String[1];
        sourceCodeURLs[0] = GWT.getModuleBaseURL() + "examples/" + "OSM.txt";
        return sourceCodeURLs;
    }
}
