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
import jsinterop.annotations.JsType;
import org.openlayers.ol.Coordinate;
import org.openlayers.ol.Extent;

/**
 * Multi-polygon geometry.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.geom", name = "MultiPolygon")
public class MultiPolygon extends SimpleGeometry {
    /**
     * Multi-polygon geometry.
     * @param coordinates Coordinates.
     */
    @JsConstructor
    public MultiPolygon(Coordinate[][][] coordinates) {}

    /**
     * Multi-polygon geometry.
     * @param coordinates Coordinates.
     * @param layout Layout.
     */
    @JsConstructor
    public MultiPolygon(Coordinate[][][] coordinates, String layout) {}

    /**
     * Append the passed polygon to this multipolygon.
     * @param polygon Polygon.
     */
    public native void appendPolygon(Polygon polygon);

    /**
     * Make a complete copy of the geometry.
     * @return Clone.
     */
    public native MultiPolygon clone();

    /**
     * Return the area of the multipolygon on projected plane.
     * @return Area (on projected plane).
     */
    public native double getArea();

    /**
     * Get the coordinate array for this geometry. This array has the structure of a GeoJSON coordinate array for multi-polygons.
     * @return Coordinates.
     */
    public native Coordinate[][][] getCoordinates();

    /**
     * Get the coordinate array for this geometry. This array has the structure of a GeoJSON coordinate array for multi-polygons.
     * @param right Orient coordinates according to the right-hand rule (counter-clockwise for exterior and clockwise for
     *              interior rings). If false, coordinates will be oriented according to the left-hand rule
     *              (clockwise for exterior and counter-clockwise for interior rings). By default,
     *              coordinate orientation will depend on how the geometry was constructed.
     * @return Coordinates.
     */
    public native Coordinate[][][] getCoordinates(boolean right);

    /**
     * Return the interior points as multipoint.
     * @return Interior points.
     */
    public native MultiPoint getInteriorPoints();

    /**
     * Return the polygon at the specified index.
     * @param index Index.
     * @return Polygon.
     */
    public native Polygon getPolygon(int index);

    /**
     * Return the polygons of this multipolygon.
     * @return Polygons.
     */
    public native Polygon[] getPolygons();

    /**
     * Get the type of this geometry.
     * @return {@link GeometryType}
     */
    public native String getType();

    /**
     * Test if the geometry and the passed extent intersect.
     * @param extent Extent.
     * @return true if the geometry and the extent intersect.
     */
    public native boolean intersectsExtent(Extent extent);

    /**
     * Set the coordinates of the multipolygon.
     * @param coordinates Coordinates.
     */
    public native void setCoordinates(Coordinate[][][] coordinates);

    /**
     * Set the coordinates of the multipolygon.
     * @param coordinates Coordinates.
     * @param layout {@link GeometryLayout}
     */
    public native void setCoordinates(Coordinate[][][] coordinates, String layout);
}
