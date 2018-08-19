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

import com.google.gwt.xml.client.Node;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Feature;
import org.openlayers.ol.format.options.FormatReadOptions;
import org.openlayers.ol.format.options.FormatWriteOptions;
import org.openlayers.ol.format.options.GPXFormatOptions;
import org.openlayers.ol.proj.Projection;

/**
 * Feature format for reading and writing data in the GPX format.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.format", name = "GPX")
public class GPXFormat extends XMLFeatureFormat {
    @JsConstructor
    public GPXFormat() {}

    @JsConstructor
    public GPXFormat(GPXFormatOptions options) {}

    @JsOverlay
    public static GPXFormat create(GPXFormatOptions.ReadExtensions readExtensions) {
        GPXFormatOptions options = new GPXFormatOptions();
        options.readExtensions = readExtensions;
        return new GPXFormat(options);
    }

    /**
     * Read the first feature from a GPX source. Routes (<rte>) are converted into LineString geometries,
     * and tracks (<trk>) into MultiLineString. Any properties on route and track waypoints are ignored.
     * @param source Source.
     * @return Feature.
     */
    @JsMethod
    public native Feature readFeature(String source);

    /**
     * Read the first feature from a GPX source. Routes (<rte>) are converted into LineString geometries,
     * and tracks (<trk>) into MultiLineString. Any properties on route and track waypoints are ignored.
     * @param source Source.
     * @param options Read options.
     * @return Feature.
     */
    @JsMethod
    public native Feature readFeature(String source, FormatReadOptions options);

    /**
     * Read the first feature from a GPX source. Routes (<rte>) are converted into LineString geometries,
     * and tracks (<trk>) into MultiLineString. Any properties on route and track waypoints are ignored.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format is assigned (where set).
     *                       If the projection can not be derived from the data and if no defaultDataProjection is
     *                       set for a format, the features will not be reprojected.
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
     * Read the first feature from a GPX source. Routes (<rte>) are converted into LineString geometries,
     * and tracks (<trk>) into MultiLineString. Any properties on route and track waypoints are ignored.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format is assigned (where set).
     *                       If the projection can not be derived from the data and if no defaultDataProjection is
     *                       set for a format, the features will not be reprojected.
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
     * Read all features from a GPX source. Routes (<rte>) are converted into LineString geometries, and tracks (<trk>)
     * into MultiLineString. Any properties on route and track waypoints are ignored.
     * @param source Source.
     * @return Features.
     */
    @JsMethod
    public native Feature[] readFeatures(String source);

    /**
     * Read all features from a GPX source. Routes (<rte>) are converted into LineString geometries, and tracks (<trk>)
     * into MultiLineString. Any properties on route and track waypoints are ignored.
     * @param source Source.
     * @param options Read options.
     * @return Features.
     */
    @JsMethod
    public native Feature[] readFeatures(String source, FormatReadOptions options);

    /**
     * Read all features from a GPX source. Routes (<rte>) are converted into LineString geometries, and tracks (<trk>)
     * into MultiLineString. Any properties on route and track waypoints are ignored.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format is assigned (where set).
     *                       If the projection can not be derived from the data and if no defaultDataProjection is
     *                       set for a format, the features will not be reprojected.
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
     * Read all features from a GPX source. Routes (<rte>) are converted into LineString geometries, and tracks (<trk>)
     * into MultiLineString. Any properties on route and track waypoints are ignored.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format is assigned (where set).
     *                       If the projection can not be derived from the data and if no defaultDataProjection is
     *                       set for a format, the features will not be reprojected.
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
     * Read the projection from a GPX source.
     * @param source Source.
     * @return Projection.
     */
    @JsMethod
    public native Projection readProjection(String source);

    /**
     * Encode an array of features in the GPX format. LineString geometries are output as routes (<rte>),
     * and MultiLineString as tracks (<trk>).
     * @param features Features.
     * @return Result.
     */
    @JsMethod
    public native String writeFeatures(Feature[] features);

    /**
     * Encode an array of features in the GPX format. LineString geometries are output as routes (<rte>),
     * and MultiLineString as tracks (<trk>).
     * @param features Features.
     * @param options Write options.
     * @return Result.
     */
    @JsMethod
    public native String writeFeatures(Feature[] features, FormatWriteOptions options);

    /**
     * Encode an array of features in the GPX format as an XML node. LineString geometries are output as routes (<rte>),
     * and MultiLineString as tracks (<trk>).
     * @param features Features.
     * @return  Node.
     */
    @JsMethod
    public native Node writeFeaturesNode(Feature[] features);

    /**
     * Encode an array of features in the GPX format as an XML node. LineString geometries are output as routes (<rte>),
     * and MultiLineString as tracks (<trk>).
     * @param features Features.
     * @param options Options.
     * @return  Node.
     */
    @JsMethod
    public native Node writeFeaturesNode(Feature[] features, FormatWriteOptions options);
}
