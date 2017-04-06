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
 * {@link org.openlayers.ol.control.RotateControl} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class RotateControlOptions extends ControlOptions {
    /**
     * CSS class name. Default is ol-rotate.
     */
    @JsProperty
    public String className;
    /**
     * Text label to use for the rotate button. Default is ⇧. Instead of text, also a Node (e.g. a span element) can be used.
     */
    @JsProperty
    public String label;
    /**
     * Text label to use for the rotate tip. Default is Reset rotation
     */
    @JsProperty
    public String tipLabel;
    /**
     * Animation duration in milliseconds. Default is 250.
     */
    @JsProperty
    public double duration;
    /**
     * Hide the control when rotation is 0. Default is true.
     */
    @JsProperty
    public boolean autoHide;

    // TODO: resetNorth
//    public resetNorth	function | undefined
//    Function called when the control is clicked. This will override the default resetNorth.

    @JsConstructor
    public RotateControlOptions() {}
}
