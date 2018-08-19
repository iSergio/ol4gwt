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
 * Multi-point geometry.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.geom", name = "MultiPoint")
public class MultiPoint extends SimpleGeometry {
    /**
     * Multi-point geometry.
     * @param coordinates Coordinates.
     */
    @JsConstructor
    public MultiPoint(Coordinate[] coordinates) {}

    /**
     * Multi-point geometry.
     * @param coordinates Coordinates.
     * @param layout {@link GeometryLayout} Layout.
     */
    @JsConstructor
    public MultiPoint(Coordinate[] coordinates, String layout) {}

    /**
     * Append the passed point to this multipoint.
     * @param point Point.
     */
    @JsMethod
    public native void appendPoint(Point point);


    /**
     * Make a complete copy of the geometry.
     * @return Clone.
     */
    @JsMethod
    public native MultiPoint clone();

    /**
     * Return the coordinates of the multipoint.
     * @return Coordinates.
     */
    @JsMethod
    public native Coordinate[] getCoordinates();

    /**
     * Return the point at the specified index.
     * @param index Index.
     * @return Point.
     */
    @JsMethod
    public native Point getPoint(int index);

    /**
     * Return the points of this multipoint.
     * @return Points.
     */
    @JsMethod
    public native Point[] getPoints();

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
     * Set the coordinates of the multipoint.
     * @param coordinates Coordinates.
     * @param layout Layout.
     */
    @JsMethod
    public native void setCoordinates(Coordinate[] coordinates, String layout);
}
