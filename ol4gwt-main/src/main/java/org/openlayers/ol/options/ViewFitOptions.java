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
import org.openlayers.ol.Size;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ViewFitOptions {
    /**
     * The size in pixels of the box to fit the extent into. Default is the current size of the first map in the DOM that
     * uses this view, or [100, 100] if no such map is found.
     */
    @JsProperty
    public Size size;
    /**
     * Padding (in pixels) to be cleared inside the view. Values in the array are top, right, bottom and left padding.
     * Default is [0, 0, 0, 0].
     */
    @JsProperty
    public double[] padding;
    /**
     * Constrain the resolution. Default is true.
     */
    @JsProperty
    public boolean constrainResolution;
    /**
     * Get the nearest extent. Default is false.
     */
    @JsProperty
    public boolean nearest;
    /**
     * Minimum resolution that we zoom to. Default is 0.
     */
    @JsProperty
    public double minResolution;
    /**
     * Maximum zoom level that we zoom to. If minResolution is given, this property is ignored.
     */
    @JsProperty
    public int maxZoom;
    /**
     * The duration of the animation in milliseconds. By default, there is no animations.
     */
    @JsProperty
    public double duration;
//TODO: easing
//    easing	undefined | function
//    The easing function used during the animation (defaults to ol.easing.inAndOut). The function will be called for each frame with a number representing a fraction of the animation's duration. The function should return a number between 0 and 1 representing the progress toward the destination state.

    @JsConstructor
    public ViewFitOptions() {}
}
