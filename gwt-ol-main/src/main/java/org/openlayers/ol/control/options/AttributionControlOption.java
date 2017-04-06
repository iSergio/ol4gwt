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

/**
 * {@link org.openlayers.ol.control.AttributionControl} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class AttributionControlOption extends ControlOptions {
    /**
     * CSS class name.
     * Default is ol-attribution.
     */
    @JsProperty
    public String className;
    /**
     * Specify if attributions can be collapsed. If you use an OSM source, should be set to false — see OSM Copyright —
     * Default is true.
     */
    @JsProperty
    public boolean collapsible;
    /**
     * Specify if attributions should be collapsed at startup.
     * Default is true.
     */
    @JsProperty
    public boolean collapsed;
    /**
     * Text label to use for the button tip. Default is Attributions
     */
    @JsProperty
    public String tipLabel;
    /**
     * Text label to use for the collapsed attributions button. Default is i.
     * Instead of text, also a Node (e.g. a span element) can be used.
     */
    @JsProperty
    public String label;
    /**
     * Text label to use for the expanded attributions button. Default is ».
     * Instead of text, also a Node (e.g. a span element) can be used.
     */
    @JsProperty
    public String collapseLabel;

    @JsConstructor
    public AttributionControlOption() {}
}
