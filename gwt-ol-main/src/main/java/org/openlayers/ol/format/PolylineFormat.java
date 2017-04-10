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

package org.openlayers.ol.format;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Feature;
import org.openlayers.ol.format.options.FormatReadOptions;
import org.openlayers.ol.format.options.FormatWriteOptions;
import org.openlayers.ol.format.options.PolylineFormatOptions;
import org.openlayers.ol.geom.Geometry;
import org.openlayers.ol.geom.GeometryLayout;
import org.openlayers.ol.proj.Projection;

/**
 * Feature format for reading and writing data in the Encoded Polyline Algorithm Format.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.format", name = "Polyline")
public class PolylineFormat {
    @JsConstructor
    public PolylineFormat() {}

    @JsConstructor
    public PolylineFormat(PolylineFormatOptions options) {}

    @JsOverlay
    public static PolylineFormat create(double factor, GeometryLayout geometryLayout) {
        PolylineFormatOptions options = new PolylineFormatOptions();
        options.factor = factor;
        options.geometryLayout = geometryLayout.toString();
        return new PolylineFormat(options);
    }

    @JsOverlay
    public static PolylineFormat create(double factor) {
        PolylineFormatOptions options = new PolylineFormatOptions();
        options.factor = factor;
        return new PolylineFormat(options);
    }

    @JsOverlay
    public static PolylineFormat create(GeometryLayout geometryLayout) {
        PolylineFormatOptions options = new PolylineFormatOptions();
        options.geometryLayout = geometryLayout.toString();
        return new PolylineFormat(options);
    }

    /**
     * Decode a list of n-dimensional points from an encoded string
     * @param encoded An encoded string.
     * @param stride The number of dimension of the points in the encoded string.
     * @return A list of n-dimensional points.
     */
    @JsMethod
    public static native double[] decodeDeltas(String encoded, double stride);

    /**
     * Decode a list of n-dimensional points from an encoded string
     * @param encoded An encoded string.
     * @param stride The number of dimension of the points in the encoded string.
     * @param factor The factor by which the resulting numbers will be divided. Default is 1e5.
     * @return A list of n-dimensional points.
     */
    @JsMethod
    public static native double[] decodeDeltas(String encoded, double stride, double factor);

    /**
     * Decode a list of floating point numbers from an encoded string
     * @param encoded An encoded string.
     * @return A list of floating point numbers.
     */
    @JsMethod
    public static native double[] decodeFloats(String encoded);

    /**
     * Decode a list of floating point numbers from an encoded string
     * @param encoded An encoded string.
     * @param factor The factor by which the result will be divided. Default is 1e5.
     * @return A list of floating point numbers.
     */
    @JsMethod
    public static native double[] decodeFloats(String encoded, double factor);

    /**
     * Encode a list of n-dimensional points and return an encoded string
     *
     * Attention: This function will modify the passed array!
     * @param numbers A list of n-dimensional points.
     * @param stride The number of dimension of the points in the list.
     * @return The encoded string.
     */
    @JsMethod
    public static native String encodeDeltas(double[] numbers, double stride);

    /**
     * Encode a list of n-dimensional points and return an encoded string
     *
     * Attention: This function will modify the passed array!
     * @param numbers A list of n-dimensional points.
     * @param stride The number of dimension of the points in the list.
     * @param factor The factor by which the numbers will be multiplied. The remaining decimal places will get rounded away.
     *               Default is 1e5.
     * @return The encoded string.
     */
    @JsMethod
    public static native String encodeDeltas(double[] numbers, double stride, double factor);

    /**
     * Encode a list of floating point numbers and return an encoded string
     * @param numbers A list of floating point numbers.
     * @return The encoded string.
     */
    @JsMethod
    public static native String encodeFloats(double[] numbers);

    /**
     * Encode a list of floating point numbers and return an encoded string
     * @param numbers A list of floating point numbers.
     * @param factor The factor by which the numbers will be multiplied. The remaining decimal places will get rounded away.
     *               Default is 1e5.
     * @return The encoded string.
     */
    @JsMethod
    public static native String encodeFloats(double[] numbers, double factor);

    /**
     * Read the feature from the Polyline source. The coordinates are assumed to be in two dimensions and in latitude, longitude order.
     * @param source Source.
     * @param options Read options.
     * @return Feature.
     */
    @JsMethod
    public native Feature readFeature(String source, FormatReadOptions options);

    /**
     * Read the feature from the Polyline source. The coordinates are assumed to be in two dimensions and in latitude, longitude order.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format
     *                       is assigned (where set). If the projection can not be derived from the data and if no
     *                       defaultDataProjection is set for a format, the features will not be reprojected.
     * @param featureProjection Projection of the feature geometries created by the format reader. If not provided,
     *                          features will be returned in the dataProjection.
     * @return Feature.
     */
    @JsOverlay
    public Feature readFeature(String source, Projection dataProjection, Projection featureProjection) {
        FormatReadOptions options = new FormatReadOptions();
        options.dataProjection = dataProjection;
        options.featureProjection = featureProjection;
        return readFeature(source, options);
    }

    /**
     * Read the feature from the Polyline source. The coordinates are assumed to be in two dimensions and in latitude, longitude order.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format
     *                       is assigned (where set). If the projection can not be derived from the data and if no
     *                       defaultDataProjection is set for a format, the features will not be reprojected.
     * @param featureProjection Projection of the feature geometries created by the format reader. If not provided,
     *                          features will be returned in the dataProjection.
     * @return Feature.
     */
    @JsOverlay
    public Feature readFeature(String source, String dataProjection, String featureProjection) {
        FormatReadOptions options = new FormatReadOptions();
        options.dataProjection = Projection.create(dataProjection);
        options.featureProjection = Projection.create(featureProjection);
        return readFeature(source, options);
    }

    /**
     * Read the feature from the source. As Polyline sources contain a single feature, this will return the feature in an array.
     * @param source Source.
     * @param options Read options.
     * @return Features.
     */
    @JsMethod
    public native Feature[] readFeatures(String source, FormatReadOptions options);

    /**
     * Read the feature from the source. As Polyline sources contain a single feature, this will return the feature in an array.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format
     *                       is assigned (where set). If the projection can not be derived from the data and if no
     *                       defaultDataProjection is set for a format, the features will not be reprojected.
     * @param featureProjection Projection of the feature geometries created by the format reader. If not provided,
     *                          features will be returned in the dataProjection.
     * @return Features.
     */
    @JsOverlay
    public Feature[] readFeatures(String source, Projection dataProjection, Projection featureProjection) {
        FormatReadOptions options = new FormatReadOptions();
        options.dataProjection = dataProjection;
        options.featureProjection = featureProjection;
        return readFeatures(source, options);
    }

    /**
     * Read the feature from the source. As Polyline sources contain a single feature, this will return the feature in an array.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format
     *                       is assigned (where set). If the projection can not be derived from the data and if no
     *                       defaultDataProjection is set for a format, the features will not be reprojected.
     * @param featureProjection Projection of the feature geometries created by the format reader. If not provided,
     *                          features will be returned in the dataProjection.
     * @return Features.
     */
    @JsOverlay
    public Feature[] readFeatures(String source, String dataProjection, String featureProjection) {
        FormatReadOptions options = new FormatReadOptions();
        options.dataProjection = Projection.create(dataProjection);
        options.featureProjection = Projection.create(featureProjection);
        return readFeatures(source, options);
    }

    /**
     * Read the geometry from the source.
     * @param source Source.
     * @param options Read options.
     * @return Geometry.
     */
    @JsMethod
    public native Geometry readGeometry(String source, FormatReadOptions options);

    /**
     * Read the geometry from the source.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format
     *                       is assigned (where set). If the projection can not be derived from the data and if no
     *                       defaultDataProjection is set for a format, the features will not be reprojected.
     * @param featureProjection Projection of the feature geometries created by the format reader. If not provided,
     *                          features will be returned in the dataProjection.
     * @return Geometry.
     */
    @JsOverlay
    public Geometry readGeometry(String source, Projection dataProjection, Projection featureProjection) {
        FormatReadOptions options = new FormatReadOptions();
        options.dataProjection = dataProjection;
        options.featureProjection = featureProjection;
        return readGeometry(source, options);
    }

    /**
     * Read the geometry from the source.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format
     *                       is assigned (where set). If the projection can not be derived from the data and if no
     *                       defaultDataProjection is set for a format, the features will not be reprojected.
     * @param featureProjection Projection of the feature geometries created by the format reader. If not provided,
     *                          features will be returned in the dataProjection.
     * @return Geometry.
     */
    @JsOverlay
    public Geometry readGeometry(String source, String dataProjection, String featureProjection) {
        FormatReadOptions options = new FormatReadOptions();
        options.dataProjection = Projection.create(dataProjection);
        options.featureProjection = Projection.create(featureProjection);
        return readGeometry(source, options);
    }

    /**
     * Read the projection from a Polyline source.
     * @param source Source.
     * @return Projection.
     */
    @JsMethod
    public native Projection readProjection(String source);

    /**
     * Write a single geometry in Polyline format.
     * @param geometry Geometry.
     * @param options Write options.
     * @return Geometry.
     */
    @JsMethod
    public native String writeGeometry(Geometry geometry, FormatWriteOptions options);
}
