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
import org.openlayers.ol.Extent;
import org.openlayers.ol.TransformFunction;

/**
 * An array of {@link Geometry} objects.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.geom", name = "GeometryCollection")
public class GeometryCollection extends Geometry {
    @JsConstructor
    public GeometryCollection() {}

    /**
     *
     * @param geometries Geometries.
     */
    @JsConstructor
    public GeometryCollection(Geometry[] geometries) {}

    /**
     * Apply a transform function to each coordinate of the geometry. The geometry is modified in place. If you do not
     * want the geometry modified in place, first clone() it and then use this function on the clone.
     * @param transformFn Transform.
     */
    @JsMethod
    public native void applyTransform(TransformFunction transformFn);

    /**
     * Make a complete copy of the geometry.
     * @return Clone.
     */
    @JsMethod
    public native GeometryCollection clone();

    /**
     * Return the geometries that make up this geometry collection.
     * @return Geometries.
     */
    @JsMethod
    public native Geometry[] getGeometries();

    /**
     * Get the type of this geometry.
     * @return Geometry type.
     */
    @JsMethod
    public native String getType();

    /**
     * Test if the geometry and the passed extent intersect.
     * @param extent Extent.
     * @return true if the geometry and the extent intersect.
     */
    @JsMethod
    public native boolean intersectsExtent(Extent extent);

    /**
     * Set the geometries that make up this geometry collection.
     * @param geometries Geometries.
     */
    @JsMethod
    public native void setGeometries(Geometry[] geometries);

    /**
     * Translate the geometry.
     * @param deltaX Delta X.
     * @param deltaY Delta Y.
     */
    @JsMethod
    public native void translate(double deltaX, double deltaY);
}
