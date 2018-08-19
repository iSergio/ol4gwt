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
import org.openlayers.ol.Extent;
import org.openlayers.ol.Object;
import org.openlayers.ol.proj.Projection;

/**
 * Abstract base class; normally only used for creating subclasses and not instantiated in apps. Base class for vector geometries.
 *
 * To get notified of changes to the geometry, register a listener for the generic change event on your geometry instance.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.geom", name = "Geometry")
public abstract class Geometry extends Object {
    @JsConstructor
    protected Geometry() {}

    /**
     * Get the type of this geometry.
     * @return {@link GeometryType} Geometry type.
     */
    public native String getType();
    /**
     * Return the closest point of the geometry to the passed point as coordinate.
     * @param point Point.
     * @return Closest point.
     */
    @JsMethod
    public native Coordinate getClosestPoint(Coordinate point);

    /**
     * Return the closest point of the geometry to the passed point as coordinate.
     * @param point Point.
     * @param closestPoint Closest point.
     * @return Closest point.
     */
    @JsMethod
    public native Coordinate getClosestPoint(Coordinate point, Coordinate closestPoint);

    /**
     * Get the extent of the geometry.
     * @return extent Extent.
     */
    @JsMethod
    public native Extent getExtent();

    /**
     * Get the extent of the geometry.
     * @param extent Extent.
     * @return extent Extent.
     */
    @JsMethod
    public native Extent getExtent(Extent extent);

    /**
     * Returns true if this geometry includes the specified coordinate.
     * If the coordinate is on the boundary of the geometry, returns false.
     * @param coordinate Coordinate.
     * @return Contains coordinate.
     */
    @JsMethod
    public native boolean intersectsCoordinate(Coordinate coordinate);

    /**
     * Rotate the geometry around a given coordinate. This modifies the geometry coordinates in place.
     * @param angle Rotation angle in radians.
     * @param anchor The rotation center.
     */
    @JsMethod
    public native void rotate(double angle, Coordinate anchor);

    /**
     * Scale the geometry (with an optional origin). This modifies the geometry coordinates in place.
     * @param sx The scaling factor in the x-direction.
     */
    @JsMethod
    public native void scale(double sx);

    /**
     * Scale the geometry (with an optional origin). This modifies the geometry coordinates in place.
     * @param sx The scaling factor in the x-direction.
     * @param sy The scaling factor in the y-direction (defaults to sx).
     */
    @JsMethod
    public native void scale(double sx, double sy);

    /**
     * Scale the geometry (with an optional origin). This modifies the geometry coordinates in place.
     * @param sx The scaling factor in the x-direction.
     * @param sy The scaling factor in the y-direction (defaults to sx).
     * @param anchor The scale origin (defaults to the center of the geometry extent).
     */
    @JsMethod
    public native void scale(double sx, double sy, Coordinate anchor);

    /**
     * Create a simplified version of this geometry. For linestrings, this uses the the Douglas Peucker algorithm.
     * For polygons, a quantization-based simplification is used to preserve topology.
     * @param tolerance The tolerance distance for simplification.
     * @return A new, simplified version of the original geometry.
     */
    @JsMethod
    public native Geometry simplify(double tolerance);

    /**
     * Transform each coordinate of the geometry from one coordinate reference system to another.
     * The geometry is modified in place. For example, a line will be transformed to a line and a circle to a circle.
     * If you do not want the geometry modified in place, first clone() it and then use this function on the clone.
     * @param source The current projection. Can be a string identifier or a ol.proj.Projection object.
     * @param destination The desired projection. Can be a string identifier or a ol.proj.Projection object.
     * @return This geometry. Note that original geometry is modified in place.
     */
    @JsMethod
    public native Geometry transform(Projection source, Projection destination);

    /**
     * Transform each coordinate of the geometry from one coordinate reference system to another.
     * The geometry is modified in place. For example, a line will be transformed to a line and a circle to a circle.
     * If you do not want the geometry modified in place, first clone() it and then use this function on the clone.
     * @param source The current projection. Can be a string identifier or a ol.proj.Projection object.
     * @param destination The desired projection. Can be a string identifier or a ol.proj.Projection object.
     * @return This geometry. Note that original geometry is modified in place.
     */
    @JsMethod
    public native Geometry transform(String source, String destination);
}
