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

import java.lang.*;
import java.lang.Object;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class Coordinate {
    @JsConstructor
    public Coordinate(double[] coordinate) {}

    @JsOverlay
    public static Coordinate create(double x, double y) {
        return new Coordinate(new double[] {x, y});
    }

    @JsOverlay
    public static Coordinate create(double x, double y, double z) {
        return new Coordinate(new double[] {x, y, z});
    }

    @JsOverlay
    public final double getX() {
        return JsUtils.get(this, 0);
    }

    @JsOverlay
    public final double getY() {
        return JsUtils.get(this, 1);
    }

    @JsOverlay
    public final double getZ() {
        return JsUtils.get(this, 2);
    }

    @JsOverlay
    public final String toString() {
        return "[" + getX() +
                "," +
                getY() +
                "," +
                getZ() +
                "]";
    }
}
