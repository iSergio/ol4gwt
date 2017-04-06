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
 * The geometry type
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.geom", name = "GeometryType")
public class GeometryType {
    @JsProperty(name = "")
    public native String POINT();
    @JsProperty(name = "")
    public native String LINE_STRING();
    @JsProperty(name = "")
    public native String LINEAR_RING();
    @JsProperty(name = "")
    public native String POLYGON();
    @JsProperty(name = "")
    public native String MULTI_POINT();
    @JsProperty(name = "")
    public native String MULTI_LINE_STRING();
    @JsProperty(name = "")
    public native String MULTI_POLYGON();
    @JsProperty(name = "")
    public native String GEOMETRY_COLLECTION();
    @JsProperty(name = "")
    public native String CIRCLE();

    @JsConstructor
    private GeometryType() {}
}
