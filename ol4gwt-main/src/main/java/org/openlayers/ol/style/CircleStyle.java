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

package org.openlayers.ol.style;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.style.options.CircleStyleOptions;

/**
 * Set circle style for vector features.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.style", name = "Circle")
public class CircleStyle extends RegularShapeStyle {
    @JsConstructor
    public CircleStyle() {}

    @JsConstructor
    public CircleStyle(CircleStyleOptions options) {}

    /**
     * Set the circle radius.
     * @param radius Circle radius.
     */
    @JsMethod
    public native void setRadius(double radius);
}
