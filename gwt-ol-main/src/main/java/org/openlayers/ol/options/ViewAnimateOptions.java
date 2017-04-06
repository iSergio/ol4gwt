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

package org.openlayers.ol.options;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Coordinate;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ViewAnimateOptions {
    /**
     * The center of the view at the end of the animation.
     */
    @JsProperty
    public Coordinate center;
    /**
     * The zoom level of the view at the end of the animation. This takes precedence over resolution.
     */
    @JsProperty
    public int zoom;
    /**
     * The resolution of the view at the end of the animation. If zoom is also provided, this option will be ignored.
     */
    @JsProperty
    public double resolution;
    /**
     * The rotation of the view at the end of the animation.
     */
    @JsProperty
    public double rotation;
    /**
     * Optional anchor to remained fixed during a rotation or resolution animation.
     */
    @JsProperty
    public Coordinate anchor;
    /**
     * The duration of the animation in milliseconds (defaults to 1000).
     */
    @JsProperty
    public double duration;

// TODO: easing
//    easing	undefined | function
//    The easing function used during the animation (defaults to ol.easing.inAndOut). The function will be called for each frame with a number representing a fraction of the animation's duration. The function should return a number between 0 and 1 representing the progress toward the destination state.

    @JsConstructor
    public ViewAnimateOptions() {}
}
