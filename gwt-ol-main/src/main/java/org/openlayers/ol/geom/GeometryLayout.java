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

package org.openlayers.ol.geom;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * The coordinate layout for geometries, indicating whether a 3rd or 4th z ('Z') or measure ('M') coordinate is available.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.geom", name = "GeometryLayout")
public class GeometryLayout {
    @JsProperty(name = "XY")
    public native String XY();
    @JsProperty(name = "XYZ")
    public native String XYZ();
    @JsProperty(name = "XYM")
    public native String XYM();
    @JsProperty(name = "XYZM")
    public native String XYZM();

    @JsConstructor
    private GeometryLayout() {}
}
