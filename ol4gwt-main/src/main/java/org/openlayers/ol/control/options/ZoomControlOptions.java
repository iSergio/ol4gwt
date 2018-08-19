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
 * {@link org.openlayers.ol.control.ZoomControl} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ZoomControlOptions extends ControlOptions {
    /**
     * Animation duration in milliseconds. Default is 250.
     */
    @JsProperty
    public double duration;
    /**
     * CSS class name. Default is ol-zoom.
     */
    @JsProperty
    public String className;
    /**
     * Text label to use for the zoom-in button. Default is +. Instead of text, also a Node (e.g. a span element) can be used.
     */
    @JsProperty
    public String zoomInLabel;
    /**
     * Text label to use for the zoom-out button. Default is -. Instead of text, also a Node (e.g. a span element) can be used.
     */
    @JsProperty
    public String zoomOutLabel;
    /**
     * Text label to use for the button tip. Default is Zoom in
     */
    @JsProperty
    public String zoomInTipLabel;
    /**
     * Text label to use for the button tip. Default is Zoom out
     */
    @JsProperty
    public String zoomOutTipLabel;
    /**
     * The zoom delta applied on each click.
     */
    @JsProperty
    public double delta;


    @JsConstructor
    public ZoomControlOptions() {}
}
