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

package org.openlayers.ol.style.options;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.StyleGeometryFunction;
import org.openlayers.ol.geom.Geometry;
import org.openlayers.ol.style.FillStyle;
import org.openlayers.ol.style.ImageStyle;
import org.openlayers.ol.style.StrokeStyle;
import org.openlayers.ol.style.TextStyle;

/**
 * {@link org.openlayers.ol.style.Style} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class StyleOptions {
    /**
     * Feature property or geometry or function returning a geometry to render for this style.
     */
    @JsProperty
    public Geometry geometry;
    /**
     * Feature property or geometry or function returning a geometry to render for this style.
     */
    @JsProperty(name = "geometry")
    public String geometryStr;
    /**
     * Feature property or geometry or function returning a geometry to render for this style.
     */
    @JsProperty(name = "geometry")
    public StyleGeometryFunction geometryFunction;
    /**
     * Fill style.
     */
    @JsProperty
    public FillStyle fill;
    /**
     * Image style.
     */
    @JsProperty
    public ImageStyle image;
    /**
     * Stroke style.
     */
    @JsProperty
    public StrokeStyle stroke;
    /**
     * Text style.
     */
    @JsProperty
    public TextStyle text;
    /**
     * Z index.
     */
    @JsProperty
    public int zIndex;

    @JsConstructor
    public StyleOptions() {}
}
