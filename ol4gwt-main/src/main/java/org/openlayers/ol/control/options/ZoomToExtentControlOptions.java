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
import org.openlayers.ol.Extent;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ZoomToExtentControlOptions extends ControlOptions {
    /**
     * Class name. Default is ol-zoom-extent.
     */
    @JsProperty
    public String className;
    /**
     * Text label to use for the button. Default is E. Instead of text, also a Node (e.g. a span element) can be used.
     */
    @JsProperty
    public String label;
    /**
     * Text label to use for the button tip. Default is Zoom to extent
     */
    @JsProperty
    public String tipLabel;
    /**
     * The extent to zoom to. If undefined the validity extent of the view projection is used.
     */
    @JsProperty
    public Extent extent;

    @JsConstructor
    public ZoomToExtentControlOptions() {}
}
