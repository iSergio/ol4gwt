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
import org.openlayers.ol.format.options.WKTFormatOptions;
import org.openlayers.ol.geom.Geometry;
import org.openlayers.ol.proj.Projection;

/**
 * Geometry format for reading and writing data in the WellKnownText (WKT) format.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.format", name = "WKT")
public class WKTFormat extends TextFeatureFormat {
    @JsConstructor
    public WKTFormat() {}

    @JsConstructor
    public WKTFormat(WKTFormatOptions options) {}

    /**
     * Create WKTFormat object by splitCollection option.
     * @param splitCollection Whether to split GeometryCollections into multiple features on reading
     * @return WKTFormat object.
     */
    @JsOverlay
    public static WKTFormat create(boolean splitCollection) {
        WKTFormatOptions options = new WKTFormatOptions();
        options.splitCollection = splitCollection;
        return new WKTFormat(options);
    }

    /**
     * Read a feature from a WKT source.
     * @return Read options.
     */
    @JsMethod
    public native Feature readFeature(String source);

    /**
     * Read a feature from a WKT source.
     * @param options Source.
     * @return Read options.
     */
    @JsMethod
    public native Feature readFeature(String source, FormatReadOptions options);

    /**
     * Read a feature from a WKT source.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format
     *                       is assigned (where set). If the projection can not be derived from the data and if no
     *                       defaultDataProjection is set for a format, the features will not be reprojected.
     * @param featureProjection Projection of the feature geometries created by the format reader. If not provided,
     *                          features will be returned in the dataProjection.
     * @return
     */
    @JsOverlay
    public Feature readFeature(String source, Projection dataProjection, Projection featureProjection) {
        FormatReadOptions options = new FormatReadOptions();
        options.dataProjection = dataProjection;
        options.featureProjection = featureProjection;
        return readFeature(source, options);
    }

    /**
     * Read a feature from a WKT source.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format
     *                       is assigned (where set). If the projection can not be derived from the data and if no
     *                       defaultDataProjection is set for a format, the features will not be reprojected.
     * @param featureProjection Projection of the feature geometries created by the format reader. If not provided,
     *                          features will be returned in the dataProjection.
     * @return
     */
    @JsOverlay
    public Feature readFeature(String source, String dataProjection, String featureProjection) {
        FormatReadOptions options = new FormatReadOptions();
        options.dataProjection = Projection.create(dataProjection);
        options.featureProjection = Projection.create(featureProjection);
        return readFeature(source, options);
    }

    /**
     * Read all features from a WKT source.
     * @param source Source.
     * @return Features.
     */
    @JsMethod
    public native Feature[] readFeatures(String source);

    /**
     * Read all features from a WKT source.
     * @param source Source.
     * @param options Read options.
     * @return Features.
     */
    @JsMethod
    public native Feature[] readFeatures(String source, FormatReadOptions options);

    /**
     * Read a feature from a WKT source.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format
     *                       is assigned (where set). If the projection can not be derived from the data and if no
     *                       defaultDataProjection is set for a format, the features will not be reprojected.
     * @param featureProjection Projection of the feature geometries created by the format reader. If not provided,
     *                          features will be returned in the dataProjection.
     * @return
     */
    @JsOverlay
    public Feature[] readFeatures(String source, Projection dataProjection, Projection featureProjection) {
        FormatReadOptions options = new FormatReadOptions();
        options.dataProjection = dataProjection;
        options.featureProjection = featureProjection;
        return readFeatures(source, options);
    }

    /**
     * Read a feature from a WKT source.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format
     *                       is assigned (where set). If the projection can not be derived from the data and if no
     *                       defaultDataProjection is set for a format, the features will not be reprojected.
     * @param featureProjection Projection of the feature geometries created by the format reader. If not provided,
     *                          features will be returned in the dataProjection.
     * @return
     */
    @JsOverlay
    public Feature[] readFeatures(String source, String dataProjection, String featureProjection) {
        FormatReadOptions options = new FormatReadOptions();
        options.dataProjection = Projection.create(dataProjection);
        options.featureProjection = Projection.create(featureProjection);
        return readFeatures(source, options);
    }

    /**
     * Read a single geometry from a WKT source.
     * @param source Source.
     * @param options Read options.
     * @return Geometry.
     */
    @JsMethod
    public native Geometry readGeometry(String source, FormatReadOptions options);

    /**
     * Read a single geometry from a WKT source.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format
     *                       is assigned (where set). If the projection can not be derived from the data and if no
     *                       defaultDataProjection is set for a format, the features will not be reprojected.
     * @param featureProjection Projection of the feature geometries created by the format reader. If not provided,
     *                          features will be returned in the dataProjection.
     * @return
     */
    @JsOverlay
    public Geometry readGeometry(String source, Projection dataProjection, Projection featureProjection) {
        FormatReadOptions options = new FormatReadOptions();
        options.dataProjection = dataProjection;
        options.featureProjection = featureProjection;
        return readGeometry(source, options);
    }

    /**
     * Read a single geometry from a WKT source.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format
     *                       is assigned (where set). If the projection can not be derived from the data and if no
     *                       defaultDataProjection is set for a format, the features will not be reprojected.
     * @param featureProjection Projection of the feature geometries created by the format reader. If not provided,
     *                          features will be returned in the dataProjection.
     * @return
     */
    @JsOverlay
    public Geometry readGeometry(String source, String dataProjection, String featureProjection) {
        FormatReadOptions options = new FormatReadOptions();
        options.dataProjection = Projection.create(dataProjection);
        options.featureProjection = Projection.create(featureProjection);
        return readGeometry(source, options);
    }

    /**
     * Encode a feature as a WKT string.
     * @param feature Feature.
     * @return WKT string.
     */
    @JsMethod
    public native String writeFeature(Feature feature);

    /**
     * Encode a feature as a WKT string.
     * @param feature Feature.
     * @param options Write options.
     * @return WKT string.
     */
    @JsMethod
    public native String writeFeature(Feature feature, FormatWriteOptions options);

    /**
     * Encode an array of features as a WKT string.
     * @param features Features.
     * @return WKT string.
     */
    @JsMethod
    public native String writeFeatures(Feature[] features);

    /**
     * Encode an array of features as a WKT string.
     * @param features Features.
     * @param options Write options.
     * @return WKT string.
     */
    @JsMethod
    public native String writeFeatures(Feature[] features, FormatWriteOptions options);

    /**
     * Write a single geometry as a WKT string.
     * @param geometry Geometry.
     * @return WKT string.
     */
    @JsMethod
    public native String writeGeometry(Geometry geometry);
}
