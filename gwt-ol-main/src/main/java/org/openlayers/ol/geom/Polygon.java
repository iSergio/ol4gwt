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
import org.openlayers.ol.Sphere;

/**
 * Polygon geometry.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.geom", name = "Polygon")
public class Polygon extends SimpleGeometry {
    /**
     * Polygon geometry.
     * @param coordinates Array of linear rings that define the polygon. The first linear ring of the array defines the
     *                    outer-boundary or surface of the polygon. Each subsequent linear ring defines a hole in the
     *                    surface of the polygon. A linear ring is an array of vertices' coordinates where the first
     *                    coordinate and the last are equivalent.
     */
    @JsConstructor
    public Polygon(Coordinate[][] coordinates) {}

    /**
     * Polygon geometry.
     * @param coordinates Array of linear rings that define the polygon. The first linear ring of the array defines the
     *                    outer-boundary or surface of the polygon. Each subsequent linear ring defines a hole in the
     *                    surface of the polygon. A linear ring is an array of vertices' coordinates where the first
     *                    coordinate and the last are equivalent.
     * @param layout {@link GeometryLayout}
     */
    @JsConstructor
    public Polygon(Coordinate[][] coordinates, String layout) {}

    /**
     * Create an approximation of a circle on the surface of a sphere.
     * @param sphere The sphere.
     * @param center Center ([lon, lat] in degrees).
     * @param radius The great-circle distance from the center to the polygon vertices.
     * @return The "circular" polygon.
     */
    @JsMethod
    public static native Polygon circular(Sphere sphere, Coordinate center, double radius);

    /**
     * Create an approximation of a circle on the surface of a sphere.
     * @param sphere The sphere.
     * @param center Center ([lon, lat] in degrees).
     * @param radius The great-circle distance from the center to the polygon vertices.
     * @param n Optional number of vertices for the resulting polygon. Default is 32.
     * @return The "circular" polygon.
     */
    @JsMethod
    public static native Polygon circular(Sphere sphere, Coordinate center, double radius, int n);

    /**
     * Create a regular polygon from a circle.
     * @param circle Circle geometry.
     * @return Polygon geometry.
     */
    @JsMethod
    public static native Polygon fromCircle(Circle circle);

    /**
     * Create a regular polygon from a circle.
     * @param circle Circle geometry.
     * @param sides Number of sides of the polygon. Default is 32.
     * @return Polygon geometry.
     */
    @JsMethod
    public static native Polygon fromCircle(Circle circle, int sides);

    /**
     * Create a regular polygon from a circle.
     * @param circle Circle geometry.
     * @param sides Number of sides of the polygon. Default is 32.
     * @param angle Start angle for the first vertex of the polygon in radians. Default is 0.
     * @return Polygon geometry.
     */
    @JsMethod
    public static native Polygon fromCircle(Circle circle, int sides, double angle);

    /**
     * Create a polygon from an extent. The layout used is XY.
     * @param extent The extent.
     * @return The polygon.
     */
    @JsMethod
    public static native Polygon fromExtent(Extent extent);

    /**
     * Append the passed linear ring to this polygon.
     * @param linearRing Linear ring.
     */
    @JsMethod
    public native void appendLinearRing(LinearRing linearRing);

    /**
     * Make a complete copy of the geometry.
     * @return Clone.
     */
    @JsMethod
    public native Polygon clone();

    /**
     * Return the area of the polygon on projected plane.
     * @return Area (on projected plane).
     */
    @JsMethod
    public native double getArea();

    /**
     * Get the coordinate array for this geometry. This array has the structure of a GeoJSON coordinate array for polygons.
     * @return Coordinates.
     */
    @JsMethod
    public native Coordinate[][] getCoordinates();

    /**
     * Get the coordinate array for this geometry. This array has the structure of a GeoJSON coordinate array for polygons.
     * @param right Orient coordinates according to the right-hand rule (counter-clockwise for exterior and clockwise for
     *              interior rings). If false, coordinates will be oriented according to the left-hand rule
     *              (clockwise for exterior and counter-clockwise for interior rings). By default, coordinate orientation
     *              will depend on how the geometry was constructed.
     * @return Coordinates.
     */
    @JsMethod
    public native Coordinate[][] getCoordinates(double right);

    /**
     * Return an interior point of the polygon.
     * @return Interior point.
     */
    @JsMethod
    public native Point getInteriorPoint();

    /**
     * Return the Nth linear ring of the polygon geometry. Return null if the given index is out of range. The exterior
     * linear ring is available at index 0 and the interior rings at index 1 and beyond.
     * @param index Index.
     * @return Linear ring.
     */
    @JsMethod
    public native LinearRing getLinearRing(int index);

    /**
     * Return the number of rings of the polygon, this includes the exterior ring and any interior rings.
     * @return Number of rings.
     */
    @JsMethod
    public native int getLinearRingCount();

    /**
     * Return the linear rings of the polygon.
     * @return Linear rings.
     */
    @JsMethod
    public native LinearRing[] getLinearRings();

    /**
     * Get the type of this geometry.
     * @return {@link GeometryType} Geometry type.
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
     * Set the coordinates of the polygon.
     * @param coordinates Coordinates.
     * @param layout {@link GeometryLayout} Layout.
     */
    @JsMethod
    public native void setCoordinates(Coordinate[][] coordinates, String layout);
}
