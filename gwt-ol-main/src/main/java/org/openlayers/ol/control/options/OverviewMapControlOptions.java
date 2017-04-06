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

package org.openlayers.ol.control.options;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Collection;
import org.openlayers.ol.View;
import org.openlayers.ol.layer.Layer;

/**
 * {@link org.openlayers.ol.control.OverviewMapControl} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class OverviewMapControlOptions extends ControlOptions {
    /**
     * Whether the control should start collapsed or not (expanded). Default to true.
     */
    @JsProperty
    public boolean collapsed;
    /**
     * Text label to use for the expanded overviewmap button. Default is «. Instead of text, also a Node (e.g. a span element) can be used.
     */
    @JsProperty
    public String collapseLabel;
    /**
     * Whether the control can be collapsed or not. Default to true.
     */
    @JsProperty
    public boolean collapsible;
    /**
     * Text label to use for the collapsed overviewmap button. Default is ». Instead of text, also a Node (e.g. a span element) can be used.
     */
    @JsProperty
    public String label;
    /**
     * Layers for the overview map. If not set, then all main map layers are used instead.
     */
    @JsProperty(name = "layers")
    public Layer[] layers;
    /**
     * Layers for the overview map. If not set, then all main map layers are used instead.
     */
    @JsProperty(name = "layers")
    public Collection<Layer> layersCollection;
    /**
     * Text label to use for the button tip. Default is Overview map
     */
    @JsProperty
    public String tipLabel;
    /**
     * Custom view for the overview map. If not provided, a default view with an EPSG:3857 projection will be used.
     */
    @JsProperty
    public View view;


    @JsConstructor
    public OverviewMapControlOptions() {}
}
