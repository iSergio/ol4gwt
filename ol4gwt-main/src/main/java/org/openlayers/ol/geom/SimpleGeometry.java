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
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Coordinate;
import org.openlayers.ol.TransformFunction;

/**
 * Abstract base class; only used for creating subclasses; do not instantiate in apps, as cannot be rendered.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.geom", name = "SimpleGeometry")
public abstract class SimpleGeometry extends Geometry {
    @JsConstructor
    protected SimpleGeometry() {}

    /**
     * Apply a transform function to each coordinate of the geometry. The geometry is modified in place.
     * If you do not want the geometry modified in place, first clone() it and then use this function on the clone.
     * @param transformFn Transform.
     */
    @JsMethod
    public native void applyTransform(TransformFunction transformFn);

    /**
     * Return the first coordinate of the geometry.
     * @return First coordinate.
     */
    @JsMethod
    public native Coordinate getFirstCoordinate();

    /**
     * Return the last coordinate of the geometry.
     * @return Last point.
     */
    @JsMethod
    public native Coordinate getLastCoordinate();

    /**
     * Return the layout of the geometry.
     * @return {@link GeometryLayout}.
     */
    @JsMethod
    public native String getLayout();

    /**
     * Translate the geometry. This modifies the geometry coordinates in place.
     * If instead you want a new geometry, first clone() this geometry.
     * @param deltaX Delta X.
     * @param deltaY Delta Y.
     */
    public native void translate(double deltaX, double deltaY);
}
