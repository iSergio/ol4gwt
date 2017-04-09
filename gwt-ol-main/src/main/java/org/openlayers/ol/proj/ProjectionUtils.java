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

package org.openlayers.ol.proj;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Coordinate;
import org.openlayers.ol.Extent;
import org.openlayers.ol.TransformFunction;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol", name = "proj")
public class ProjectionUtils {
    /**
     * Registers coordinate transform functions to convert coordinates between the source projection and the destination
     * projection. The forward and inverse functions convert coordinate pairs; this function converts these into the
     * functions used internally which also handle extents and coordinate arrays.
     * @param source Source projection.
     * @param destination Destination projection.
     * @param forward The forward transform function (that is, from the source projection to the destination projection)
     *                that takes a {@link Coordinate} as argument and returns the transformed {@link Coordinate}.
     * @param inverse The inverse transform function (that is, from the destination projection to the source projection)
     *                that takes a {@link Coordinate} as argument and returns the transformed {@link Coordinate}.
     */
    @JsMethod
    public native static void addCoordinateTransforms(Projection source, Projection destination, Forward forward, Inverse inverse);

    /**
     * Registers transformation functions that don't alter coordinates. Those allow to transform between projections with equal meaning.
     * @param projections Projections.
     */
    @JsMethod
    public native static void addEquivalentProjections(Projection[] projections);

    /**
     * Add a Projection object to the list of supported projections that can be looked up by their code.
     * @param projection Projection instance.
     */
    @JsMethod
    public native static void addProjection(Projection projection);

    /**
     * Checks if two projections are the same, that is every coordinate in one projection does represent the same
     * geographic point as the same coordinate in the other projection.
     * @param projection1 Projection 1.
     * @param projection2 Projection 2.
     * @return Equivalent.
     */
    @JsMethod
    public native static boolean equivalent(Projection projection1, Projection projection2);

    /**
     * Transforms a coordinate from longitude/latitude to a different projection.
     * @param coordinate Coordinate as longitude and latitude, i.e. an array with longitude as 1st and latitude as 2nd element.
     * @param projection Target projection. The default is Web Mercator, i.e. 'EPSG:3857'.
     * @return Coordinate projected to the target projection.
     */
    @JsMethod
    public native static Coordinate fromLonLat(Coordinate coordinate, String projection);

    /**
     * Transforms a coordinate from longitude/latitude to a different projection.
     * @param coordinate Coordinate as longitude and latitude, i.e. an array with longitude as 1st and latitude as 2nd element.
     * @param projection Target projection. The default is Web Mercator, i.e. 'EPSG:3857'.
     * @return Coordinate projected to the target projection.
     */
    @JsMethod
    public native static Coordinate fromLonLat(Coordinate coordinate, Projection projection);

    /**
     * Fetches a Projection object for the code specified.
     * @param projectionLike Either a code string which is a combination of authority and identifier such as "EPSG:4326",
     *                       or an existing projection object, or undefined.
     * @return Projection object, or null if not in list.
     */
    @JsMethod
    public static native Projection get(String projectionLike);

    /**
     * Fetches a Projection object for the code specified.
     * @param projectionLike Either a code string which is a combination of authority and identifier such as "EPSG:4326",
     *                       or an existing projection object, or undefined.
     * @return Projection object, or null if not in list.
     */
    @JsMethod
    public static native Projection get(Projection projectionLike);

    /**
     * Get the resolution of the point in degrees or distance units. For projections with degrees as the unit this
     * will simply return the provided resolution. For other projections the point resolution is estimated by
     * transforming the 'point' pixel to EPSG:4326, measuring its width and height on the normal sphere,
     * and taking the average of the width and height.
     * @param projection The projection.
     * @param resolution Nominal resolution in projection units.
     * @param point Point to find adjusted resolution at.
     * @return Point resolution at point in projection units.
     */
    @JsMethod
    public static native double getPointResolution(Projection projection, double resolution, Coordinate point);

    /**
     * Given the projection-like objects, searches for a transformation function to convert a coordinates array
     * from the source projection to the destination projection.
     * @param source Source.
     * @param destination Destination.
     * @return Transform function.
     */
    @JsMethod
    public static native TransformFunction getTransform(Projection source, Projection destination);

//    ol.proj.setProj4(proj4)

    /**
     * Transforms a coordinate to longitude/latitude.
     * @param coordinate Projected coordinate.
     * @param projection Projection of the coordinate. The default is Web Mercator, i.e. 'EPSG:3857'.
     * @return Coordinate as longitude and latitude, i.e. an array with longitude as 1st and latitude as 2nd element.
     */
    @JsMethod
    public static native Coordinate toLonLat(Coordinate coordinate, String projection);

    /**
     * Transforms a coordinate to longitude/latitude.
     * @param coordinate Projected coordinate.
     * @param projection Projection of the coordinate. The default is Web Mercator, i.e. 'EPSG:3857'.
     * @return Coordinate as longitude and latitude, i.e. an array with longitude as 1st and latitude as 2nd element.
     */
    @JsMethod
    public static native Coordinate toLonLat(Coordinate coordinate, Projection projection);

    /**
     * Transforms a coordinate from source projection to destination projection. This returns a new coordinate
     * (and does not modify the original).
     * @param coordinate Coordinate.
     * @param source Source projection-like.
     * @param destination Destination projection-like.
     * @return Coordinate.
     */
    @JsMethod
    public static native Coordinate transform(Coordinate coordinate, String source, String destination);

    /**
     * Transforms a coordinate from source projection to destination projection. This returns a new coordinate
     * (and does not modify the original).
     * @param coordinate Coordinate.
     * @param source Source projection-like.
     * @param destination Destination projection-like.
     * @return Coordinate.
     */
    @JsMethod
    public static native Coordinate transform(Coordinate coordinate, Projection source, Projection destination);

    /**
     * Transforms an extent from source projection to destination projection.
     * This returns a new extent (and does not modify the original).
     * @param extent The extent to transform.
     * @param source Source projection-like.
     * @param destination Destination projection-like.
     * @return The transformed extent.
     */
    @JsMethod
    public static native Extent transformExtent(Extent extent, String source, String destination);

    /**
     * Transforms an extent from source projection to destination projection.
     * This returns a new extent (and does not modify the original).
     * @param extent The extent to transform.
     * @param source Source projection-like.
     * @param destination Destination projection-like.
     * @return The transformed extent.
     */
    @JsMethod
    public static native Extent transformExtent(Extent extent, Projection source, Projection destination);

    @JsFunction
    public interface Forward {
        Coordinate function(Coordinate coordinate);
    }

    @JsFunction
    public interface Inverse {
        Coordinate function(Coordinate coordinate);
    }
}
