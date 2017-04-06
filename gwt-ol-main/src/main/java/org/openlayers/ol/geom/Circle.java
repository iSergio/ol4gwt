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
import org.openlayers.ol.proj.Projection;

/**
 * Circle geometry.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.geom", name = "Circle")
public class Circle extends SimpleGeometry {
    /**
     * Circle geometry.
     * @param center Center.
     */
    @JsConstructor
    public Circle(Coordinate center) {}

    /**
     * Circle geometry.
     * @param center Center.
     * @param radius Radius.
     */
    @JsConstructor
    public Circle(Coordinate center, double radius) {}

    /**
     * Circle geometry.
     * @param center Center.
     * @param radius Radius.
     * @param layout Layout.
     */
    @JsConstructor
    public Circle(Coordinate center, double radius, GeometryLayout layout) {}

    /**
     * Make a complete copy of the geometry.
     * @return Clone
     */
    @JsMethod
    public native Circle clone();

    /**
     * Return the center of the circle as coordinate.
     * @return Center.
     */
    @JsMethod
    public native Coordinate getCenter();

    /**
     * Return the radius of the circle.
     * @return Radius.
     */
    @JsMethod
    public native double getRadius();

    /**
     * Get the type of this geometry.
     * @return Geometry type.
     */
    @JsMethod
    public native GeometryType getType();

    /**
     * Test if the geometry and the passed extent intersect.
     * @param extent Extent.
     * @return true if the geometry and the extent intersect.
     */
    @JsMethod
    public native boolean intersectsExtent(Extent extent);

    /**
     * Set the center (as coordinate) and the radius (as number) of the circle.
     * @param center Center.
     * @param radius Radius.
     */
    @JsMethod
    public native void setCenterAndRadius(Coordinate center, double radius);

    /**
     * Set the center (as coordinate) and the radius (as number) of the circle.
     * @param center Center.
     * @param radius Radius.
     * @param layout Layout.
     */
    @JsMethod
    public native void setCenterAndRadius(Coordinate center, double radius, GeometryLayout layout);

    /**
     * Set the radius of the circle. The radius is in the units of the projection.
     * @param radius Radius.
     */
    @JsMethod
    public native void setRadius(double radius);

    /**
     * Transform each coordinate of the circle from one coordinate reference system to another. The geometry is modified in place.
     * If you do not want the geometry modified in place, first clone() it and then use this function on the clone.
     *
     * Internally a circle is currently represented by two points: the center of the circle [cx, cy], and the point to the
     * right of the circle [cx + r, cy]. This transform function just transforms these two points.
     * So the resulting geometry is also a circle, and that circle does not correspond to the shape that would be
     * obtained by transforming every point of the original circle.
     * @param source The current projection. Can be a string identifier or a ol.proj.Projection object.
     * @param destination The desired projection. Can be a string identifier or a ol.proj.Projection object.
     * @return This geometry. Note that original geometry is modified in place.
     */
    @JsMethod
    public native Circle transform(String source, String destination);

    /**
     * Transform each coordinate of the circle from one coordinate reference system to another. The geometry is modified in place.
     * If you do not want the geometry modified in place, first clone() it and then use this function on the clone.
     *
     * Internally a circle is currently represented by two points: the center of the circle [cx, cy], and the point to the
     * right of the circle [cx + r, cy]. This transform function just transforms these two points.
     * So the resulting geometry is also a circle, and that circle does not correspond to the shape that would be
     * obtained by transforming every point of the original circle.
     * @param source The current projection. Can be a string identifier or a ol.proj.Projection object.
     * @param destination The desired projection. Can be a string identifier or a ol.proj.Projection object.
     * @return This geometry. Note that original geometry is modified in place.
     */
    @JsMethod
    public native Circle transform(Projection source, Projection destination);
}
