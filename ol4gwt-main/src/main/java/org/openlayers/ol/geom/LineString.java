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

/**
 * Linestring geometry.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.geom", name = "LineString")
public class LineString extends SimpleGeometry {
    /**
     * Linestring geometry.
     * @param coordinates Coordinates.
     */
    @JsConstructor
    public LineString(Coordinate[] coordinates) {}
    /**
     * Linestring geometry.
     * @param coordinates Coordinates.
     * @param layout Layout.
     */
    @JsConstructor
    public LineString(Coordinate[] coordinates, String layout) {}

    /**
     * Append the passed coordinate to the coordinates of the linestring.
     * @param coordinate Coordinate.
     */
    @JsMethod
    public native void appendCoordinate(Coordinate coordinate);

    /**
     * Make a complete copy of the geometry.
     * @return Clone.
     */
    @JsMethod
    public native LineString clone();

    //TODO: forEachSegment

    /**
     * Return the coordinate at the provided fraction along the linestring. The fraction is a number between 0 and 1,
     * where 0 is the start of the linestring and 1 is the end.
     * @param fraction Fraction.
     * @return Coordinate of the interpolated point.
     */
    @JsMethod
    public native Coordinate getCoordinateAt(double fraction);

    /**
     * Return the coordinate at the provided fraction along the linestring. The fraction is a number between 0 and 1,
     * where 0 is the start of the linestring and 1 is the end.
     * @param fraction Fraction.
     * @param dest Optional coordinate whose values will be modified. If not provided, a new coordinate will be returned.
     * @return Coordinate of the interpolated point.
     */
    @JsMethod
    public native Coordinate getCoordinateAt(double fraction, Coordinate dest);

    /**
     * Returns the coordinate at m using linear interpolation, or null if no such coordinate exists.
     *
     * extrapolate controls extrapolation beyond the range of Ms in the MultiLineString. If opt_extrapolate is true then
     * Ms less than the first M will return the first coordinate and Ms greater than the last M will return the last coordinate.
     * @param m M.
     * @return Coordinate.
     */
    @JsMethod
    public native Coordinate getCoordinateAtM(int m);

    /**
     * Returns the coordinate at m using linear interpolation, or null if no such coordinate exists.
     *
     * extrapolate controls extrapolation beyond the range of Ms in the MultiLineString. If opt_extrapolate is true then
     * Ms less than the first M will return the first coordinate and Ms greater than the last M will return the last coordinate.
     * @param m M.
     * @param extrapolate Extrapolate. Default is false.
     * @return Coordinate.
     */
    @JsMethod
    public native Coordinate getCoordinateAtM(int m, boolean extrapolate);

    /**
     * Return the coordinates of the linestring.
     * @return Coordinates.
     */
    @JsMethod
    public native Coordinate[] getCoordinates();

    /**
     * Return the length of the linestring on projected plane.
     * @return Length (on projected plane).
     */
    @JsMethod
    public native double getLength();

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
     * Set the coordinates of the linestring.
     * @param coordinates Coordinates.
     * @param layout Layout.
     */
    @JsMethod
    public native void setCoordinates(Coordinate[] coordinates, String layout);
}
