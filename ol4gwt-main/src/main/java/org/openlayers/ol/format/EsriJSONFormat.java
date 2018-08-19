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
import org.openlayers.ol.format.options.EsriJSONFormatOptions;
import org.openlayers.ol.format.options.FormatReadOptions;
import org.openlayers.ol.format.options.FormatWriteOptions;
import org.openlayers.ol.geom.Geometry;
import org.openlayers.ol.proj.Projection;

/**
 * Feature format for reading and writing data in the EsriJSON format.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.format", name = "EsriJSON")
public class EsriJSONFormat extends JSONFeatureFormat {
    @JsConstructor
    public EsriJSONFormat() {}

    @JsConstructor
    public EsriJSONFormat(EsriJSONFormatOptions options) {}

    public static EsriJSONFormat create(String geometryName) {
        EsriJSONFormatOptions options = new EsriJSONFormatOptions();
        options.geometryName = geometryName;
        return new EsriJSONFormat(options);
    }

    /**
     * Read a feature from a EsriJSON Feature source. Only works for Feature, use readFeatures to read FeatureCollection source.
     * @param source Source.
     * @param options Read options.
     * @return Feature.
     */
    @JsMethod
    public native Feature readFeature(String source, FormatReadOptions options);

    /**
     * Read a feature from a EsriJSON Feature source. Only works for Feature, use readFeatures to read FeatureCollection source.
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
    public Feature readFeature(String source, Projection dataProjection, Projection featureProjection) {
        FormatReadOptions options = new FormatReadOptions();
        options.dataProjection = dataProjection;
        options.featureProjection = featureProjection;
        return readFeature(source, options);
    }

    /**
     * Read a feature from a EsriJSON Feature source. Only works for Feature, use readFeatures to read FeatureCollection source.
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
    public Feature readFeature(String source, String dataProjection, String featureProjection) {
        FormatReadOptions options = new FormatReadOptions();
        options.dataProjection = Projection.create(dataProjection);
        options.featureProjection = Projection.create(featureProjection);
        return readFeature(source, options);
    }

   /**
    * Read all features from a EsriJSON source. Works with both Feature and FeatureCollection sources.
    * @param source Source.
    * @param options Read options.
    * @return Features.
    */
    @JsMethod
    public native Feature[] readFeatures(String source, FormatReadOptions options);

    /**
     * Read all features from a EsriJSON source. Works with both Feature and FeatureCollection sources.
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
    public Feature[] readFeatures(String source, Projection dataProjection, Projection featureProjection) {
        FormatReadOptions options = new FormatReadOptions();
        options.dataProjection = dataProjection;
        options.featureProjection = featureProjection;
        return readFeatures(source, options);
    }

    /**
     * Read all features from a EsriJSON source. Works with both Feature and FeatureCollection sources.
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
    public Feature[] readFeatures(String source, String dataProjection, String featureProjection) {
        FormatReadOptions options = new FormatReadOptions();
        options.dataProjection = Projection.create(dataProjection);
        options.featureProjection = Projection.create(featureProjection);
        return readFeatures(source, options);
    }

    /**
     * Read a geometry from a EsriJSON source.
     * @param source Source.
     * @param options Read options.
     * @return Geometry.
     */
    @JsMethod
    public native Geometry readGeometry(String source, FormatReadOptions options);

    /**
     * Read a geometry from a EsriJSON source.
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
    public Geometry readGeometry(String source, Projection dataProjection, Projection featureProjection) {
        FormatReadOptions options = new FormatReadOptions();
        options.dataProjection = dataProjection;
        options.featureProjection = featureProjection;
        return readGeometry(source, options);
    }

    /**
     * Read a geometry from a EsriJSON source.
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
    public Geometry readGeometry(String source, String dataProjection, String featureProjection) {
        FormatReadOptions options = new FormatReadOptions();
        options.dataProjection = Projection.create(dataProjection);
        options.featureProjection = Projection.create(featureProjection);
        return readGeometry(source, options);
    }

    /**
     * Read the projection from a EsriJSON source.
     * @param source Source.
     * @return Projection.
     */
    @JsMethod
    public native Projection readProjection(String source);

    /**
     * Encode a feature as a EsriJSON Feature string.
     * @param feature Feature.
     * @return EsriJSON.
     */
    @JsMethod
    public native String writeFeature(Feature feature);

    /**
     * Encode a feature as a EsriJSON Feature string.
     * @param feature Feature.
     * @param options Write options.
     * @return EsriJSON.
     */
    @JsMethod
    public native String writeFeature(Feature feature, FormatWriteOptions options);

    /**
     * Encode a feature as a esriJSON Feature object.
     * @param feature Feature.
     * @return Object.
     */
    @JsMethod
    public native Object writeFeatureObject(Feature feature);

    /**
     * Encode a feature as a esriJSON Feature object.
     * @param feature Feature.
     * @param options Write options.
     * @return Object.
     */
    @JsMethod
    public native Object writeFeatureObject(Feature feature, FormatWriteOptions options);

    /**
     * Encode an array of features as EsriJSON.
     * @param features Features.
     * @return EsriJSON.
     */
    @JsMethod
    public native String writeFeatures(Feature[] features);

    /**
     * Encode an array of features as EsriJSON.
     * @param features Features.
     * @param options Write options.
     * @return EsriJSON.
     */
    @JsMethod
    public native String writeFeatures(Feature[] features, FormatWriteOptions options);

    /**
     * Encode an array of features as a EsriJSON object.
     * @param features Features.
     * @return EsriJSON Object.
     */
    @JsMethod
    public native Object writeFeaturesObject(Feature[] features);

    /**
     * Encode an array of features as a EsriJSON object.
     * @param features Features.
     * @param options Write options.
     * @return EsriJSON Object.
     */
    @JsMethod
    public native Object writeFeaturesObject(Feature[] features, FormatWriteOptions options);

    /**
     * Encode a geometry as a EsriJSON string.
     * @param geometry Geometry.
     * @return EsriJSON.
     */
    @JsMethod
    public native String writeGeometry(Geometry geometry);

    /**
     * Encode a geometry as a EsriJSON string.
     * @param geometry Geometry.
     * @param options Write options.
     * @return EsriJSON.
     */
    @JsMethod
    public native String writeGeometry(Geometry geometry, FormatWriteOptions options);

    /**
     * Encode a geometry as a EsriJSON object.
     * @param geometry Geometry.
     * @return Object.
     */
    @JsMethod
    public native Object writeGeometryObject(Geometry geometry);

    /**
     * Encode a geometry as a EsriJSON object.
     * @param geometry Geometry.
     * @param options Write options.
     * @return Object.
     */
    @JsMethod
    public native Object writeGeometryObject(Geometry geometry, FormatWriteOptions options);
}
