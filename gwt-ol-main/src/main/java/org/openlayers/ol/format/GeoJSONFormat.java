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
import org.openlayers.ol.format.options.GeoJSONFormatOptions;
import org.openlayers.ol.format.options.GeoJSONFormatReadOptions;
import org.openlayers.ol.format.options.GeoJSONFormatWriteOptions;
import org.openlayers.ol.geom.Geometry;
import org.openlayers.ol.proj.Projection;

/**
 * Feature format for reading and writing data in the GeoJSON format.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.format", name = "GeoJSON")
public class GeoJSONFormat extends JSONFeatureFormat {
    @JsConstructor
    public GeoJSONFormat() {}

    @JsConstructor
    public GeoJSONFormat(GeoJSONFormatOptions options) {}

    /**
     * Read a feature from a GeoJSON Feature source. Only works for Feature or geometry types.
     * Use ol.format.GeoJSON#readFeatures to read FeatureCollection source.
     * @param source Source.
     * @return Feature.
     */
    @JsMethod
    public native Feature readFeature(String source);

    /**
     * Read a feature from a GeoJSON Feature source. Only works for Feature or geometry types.
     * Use ol.format.GeoJSON#readFeatures to read FeatureCollection source.
     * @param source Source.
     * @param options {@link GeoJSONFormatReadOptions} Read options.
     * @return Feature.
     */
    @JsMethod
    public native Feature readFeature(String source, GeoJSONFormatReadOptions options);

    /**
     * Read a feature from a GeoJSON Feature source. Only works for Feature or geometry types.
     * Use ol.format.GeoJSON#readFeatures to read FeatureCollection source.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format is assigned
     *                       (where set). If the projection can not be derived from the data and if no defaultDataProjection
     *                       is set for a format, the features will not be reprojected.
     * @param featureProjection Projection of the feature geometries created by the format reader. If not provided,
     *                          features will be returned in the dataProjection.
     * @return Feature.
     */
    @JsOverlay
    public final Feature readFeature(String source, Projection dataProjection, Projection featureProjection) {
        GeoJSONFormatReadOptions options = new GeoJSONFormatReadOptions();
        options.dataProjection = dataProjection;
        options.featureProjection = featureProjection;
        return readFeature(source, options);
    }

    /**
     * Read all features from a GeoJSON source. Works for all GeoJSON types. If the source includes only geometries,
     * features will be created with those geometries.
     * @param source Source.
     * @return Features.
     */
    @JsMethod
    public native Feature[] readFeatures(String source);

    /**
     * Read all features from a GeoJSON source. Works for all GeoJSON types. If the source includes only geometries,
     * features will be created with those geometries.
     * @param source Source.
     * @param options Read options.
     * @return Features.
     */
    @JsMethod
    public native Feature[] readFeatures(String source, GeoJSONFormatReadOptions options);

    /**
     * Read all features from a GeoJSON source. Works for all GeoJSON types. If the source includes only geometries,
     * features will be created with those geometries.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format is assigned
     *                       (where set). If the projection can not be derived from the data and if no defaultDataProjection
     *                       is set for a format, the features will not be reprojected.
     * @param featureProjection Projection of the feature geometries created by the format reader. If not provided,
     *                          features will be returned in the dataProjection.
     * @return Features.
     */
    @JsOverlay
    public final Feature[] readFeatures(String source, Projection dataProjection, Projection featureProjection) {
        GeoJSONFormatReadOptions options = new GeoJSONFormatReadOptions();
        options.dataProjection = dataProjection;
        options.featureProjection = featureProjection;
        return readFeatures(source, options);
    }

    /**
     * Read a geometry from a GeoJSON source.
     * @param source Source.
     * @param options Read options.
     * @return Geometry.
     */
    @JsMethod
    public native Geometry readGeometry(String source, GeoJSONFormatReadOptions options);

    /**
     * Read a geometry from a GeoJSON source.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format is assigned
     *                       (where set). If the projection can not be derived from the data and if no defaultDataProjection
     *                       is set for a format, the features will not be reprojected.
     * @param featureProjection Projection of the feature geometries created by the format reader. If not provided,
     *                          features will be returned in the dataProjection.
     * @return Geometry.
     */
    @JsOverlay
    public final Geometry readGeometry(String source, Projection dataProjection, Projection featureProjection) {
        GeoJSONFormatReadOptions options = new GeoJSONFormatReadOptions();
        options.dataProjection = dataProjection;
        options.featureProjection = featureProjection;
        return readGeometry(source, options);
    }

    /**
     * Read the projection from a GeoJSON source.
     * @param source Source.
     * @return Projection.
     */
    @JsMethod
    public native Projection readProjection(String source);

    /**
     * Encode a feature as a GeoJSON Feature string.
     * @param feature Feature.
     * @param options Write options.
     * @return GeoJSON.
     */
    @JsMethod
    public native String writeFeature(Feature feature, GeoJSONFormatWriteOptions options);

    /**
     * Encode a feature as a GeoJSON Feature object.
     * @param feature Feature.
     * @param options Write options.
     * @return Object.
     */
    @JsMethod
    public native Object writeFeatureObject(Feature feature, GeoJSONFormatWriteOptions options);

    /**
     * Encode an array of features as GeoJSON.
     * @param features  Features.
     * @param options Write options.
     * @return GeoJSON.
     */
    @JsMethod
    public native String writeFeatures(Feature[] features, GeoJSONFormatWriteOptions options);

    /**
     * Encode an array of features as a GeoJSON object.
     * @param features Features.
     * @param options Write options.
     * @return GeoJSON Object.
     */
    @JsMethod
    public native Object writeFeaturesObject(Feature[] features, GeoJSONFormatWriteOptions options);

    /**
     * Encode a geometry as a GeoJSON string.
     * @param geometry Geometry.
     * @param options Write options.
     * @return GeoJSON.
     */
    @JsMethod
    public native String writeGeometry(Geometry geometry, GeoJSONFormatWriteOptions options);

    /**
     * Encode a geometry as a GeoJSON object.
     * @param geometry Geometry.
     * @param options Write options.
     * @return Object.
     */
    @JsMethod
    public native Object writeGeometryObject(Geometry geometry, GeoJSONFormatWriteOptions options);
}
