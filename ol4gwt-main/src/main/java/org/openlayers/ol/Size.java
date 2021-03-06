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

package org.openlayers.ol;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * An array of numbers representing a size: [width, height].
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class Size {
    @JsConstructor
    public Size(double[] array) {}

    @JsOverlay
    public static Size create(double width, double height) {
        return new Size(new double[] {width, height});
    }

    @JsOverlay
    public final double getWidth() {
        return JsUtils.get(this, 0);
    }

    @JsOverlay
    public final double getHeight() {
        return JsUtils.get(this, 1);
    }

    @JsOverlay
    public final String toString() {
        return "[" + getWidth() +
                "," +
                getHeight() +
                "]";
    }
}
