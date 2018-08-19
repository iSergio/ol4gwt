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

package org.openlayers.ol;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * Class to create objects that can be used with {@link org.openlayers.ol.geom.Polygon#circular}.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol", name = "Sphere")
public class Sphere {
    /**
     * @param radius Radius.
     */
    @JsConstructor
    public Sphere(double radius) {}

    /**
     * Returns the geodesic area for a list of coordinates.
     * Reference Robert. G. Chamberlain and William H. Duquette, "Some Algorithms for Polygons on a Sphere",
     * JPL Publication 07-03, Jet Propulsion Laboratory, Pasadena, CA, June 2007
     * @param coordinates List of coordinates of a linear ring. If the ring is oriented clockwise,
     *                    the area will be positive, otherwise it will be negative.
     * @return Area.
     */
    @JsMethod
    public native double geodesicArea(Coordinate[] coordinates);

    /**
     * Returns the distance from c1 to c2 using the haversine formula.
     * @param c1 Coordinate 1.
     * @param c2 Coordinate 2.
     * @return Haversine distance.
     */
    @JsMethod
    public native double haversineDistance(Coordinate c1, Coordinate c2);
}
