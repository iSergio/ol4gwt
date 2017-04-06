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
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Coordinate;

/**
 * Linear ring geometry. Only used as part of polygon; cannot be rendered on its own.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "LinearRing")
public class LinearRing extends SimpleGeometry {
    /**
     * Linear ring geometry. Only used as part of polygon; cannot be rendered on its own.
     * @param coordinates Coordinates.
     */
    @JsConstructor
    public LinearRing(Coordinate[] coordinates) {}

    /**
     * Linear ring geometry. Only used as part of polygon; cannot be rendered on its own.
     * @param coordinates Coordinates.
     * @param layout {@link GeometryLayout} Layout.
     */
    @JsConstructor
    public LinearRing(Coordinate[] coordinates, String layout) {}

    /**
     * Return the area of the linear ring on projected plane.
     * @return Area (on projected plane).
     */
    @JsMethod
    public native double getArea();

    /**
     * Return the coordinates of the linear ring.
     * @return Coordinates.
     */
    @JsMethod
    public native Coordinate[] getCoordinates();

    /**
     * Get the type of this geometry.
     * @return {@link GeometryType} Geometry type.
     */
    @JsMethod
    public native String getType();

    /**
     * Set the coordinates of the linear ring.
     * @param coordinates Coordinates.
     */
    @JsMethod
    public native void setCoordinates(Coordinate[] coordinates);

    /**
     * Set the coordinates of the linear ring.
     * @param coordinates Coordinates.
     * @param layout {@link GeometryLayout} Layout.
     */
    @JsMethod
    public native void setCoordinates(Coordinate[] coordinates, String layout);
}
