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
 * Multi-linestring geometry.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.geom", name = "MultiLineString")
public class MultiLineString extends SimpleGeometry {
    /**
     * Multi-linestring geometry.
     * @param coordinates Coordinates.
     */
    @JsConstructor
    public MultiLineString(Coordinate[][] coordinates) {}

    /**
     * Multi-linestring geometry.
     * @param coordinates Coordinates.
     * @param layout {@link GeometryLayout} Layout.
     */
    @JsConstructor
    public MultiLineString(Coordinate[][] coordinates, String layout) {}

    /**
     * Append the passed linestring to the multilinestring.
     * @param lineString LineString.
     */
    @JsMethod
    public native void appendLineString(LineString lineString);

    /**
     * Make a complete copy of the geometry.
     * @return Clone.
     */
    @JsMethod
    public native MultiLineString clone();

    /**
     * Returns the coordinate at m using linear interpolation, or null if no such coordinate exists.
     *
     * extrapolate controls extrapolation beyond the range of Ms in the MultiLineString. If opt_extrapolate is true then
     * Ms less than the first M will return the first coordinate and Ms greater than the last M will return the last coordinate.
     *
     * interpolate controls interpolation between consecutive LineStrings within the MultiLineString. If opt_interpolate
     * is true the coordinates will be linearly interpolated between the last coordinate of one LineString and the
     * first coordinate of the next LineString. If opt_interpolate is false then the function will return null for Ms
     * falling between LineStrings.
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
     *
     * interpolate controls interpolation between consecutive LineStrings within the MultiLineString. If opt_interpolate
     * is true the coordinates will be linearly interpolated between the last coordinate of one LineString and the
     * first coordinate of the next LineString. If opt_interpolate is false then the function will return null for Ms
     * falling between LineStrings.
     * @param m M.
     * @param extrapolate Extrapolate. Default is false.
     * @return Coordinate.
     */
    @JsMethod
    public native Coordinate getCoordinateAtM(int m, boolean extrapolate);

    /**
     * Returns the coordinate at m using linear interpolation, or null if no such coordinate exists.
     *
     * extrapolate controls extrapolation beyond the range of Ms in the MultiLineString. If opt_extrapolate is true then
     * Ms less than the first M will return the first coordinate and Ms greater than the last M will return the last coordinate.
     *
     * interpolate controls interpolation between consecutive LineStrings within the MultiLineString. If opt_interpolate
     * is true the coordinates will be linearly interpolated between the last coordinate of one LineString and the
     * first coordinate of the next LineString. If opt_interpolate is false then the function will return null for Ms
     * falling between LineStrings.
     * @param m M.
     * @param extrapolate Extrapolate. Default is false.
     * @param interpolate Interpolate. Default is false.
     * @return Coordinate.
     */
    @JsMethod
    public native Coordinate getCoordinateAtM(int m, boolean extrapolate, boolean interpolate);

    /**
     * Return the coordinates of the multilinestring.
     * @return Coordinates.
     */
    @JsMethod
    public native Coordinate[][] getCoordinates();

    /**
     * Return the linestring at the specified index.
     * @param index Index.
     * @return LineString.
     */
    @JsMethod
    public native LineString getLineString(int index);

    /**
     * Return the linestrings of this multilinestring.
     * @return LineStrings.
     */
    @JsMethod
    public native LineString[] getLineStrings();

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
     * Set the coordinates of the multilinestring.
     * @param coordinates Coordinates.
     * @param layout {@link GeometryLayout} Layout.
     */
    @JsMethod
    public native void setCoordinates(Coordinate[][] coordinates, String layout);
}
