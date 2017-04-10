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
import org.openlayers.ol.WFSFeatureCollectionMetadata;
import org.openlayers.ol.WFSTransactionResponse;
import org.openlayers.ol.format.options.FormatReadOptions;
import org.openlayers.ol.format.options.GetFeatureOptions;
import org.openlayers.ol.format.options.TransactionOptions;
import org.openlayers.ol.format.options.WFSFormatOptions;
import org.openlayers.ol.proj.Projection;

/**
 * Feature format for reading and writing data in the WFS format. By default, supports WFS version 1.1.0.
 * You can pass a GML format as option if you want to read a WFS that contains GML2 (WFS 1.0.0).
 * Also see {@link GMLBaseFormat} which is used by this format.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.format", name = "WFS")
public class WFSFormat extends XMLFeatureFormat {
    @JsConstructor
    public WFSFormat() {}

    @JsConstructor
    public WFSFormat(WFSFormatOptions options) {}

    /**
     * Read feature collection metadata of the source.
     * @param source  Source.
     * @return FeatureCollection metadata.
     */
    @JsMethod
    public native WFSFeatureCollectionMetadata readFeatureCollectionMetadata(String source);

    /**
     * Read all features from a WFS FeatureCollection.
     * @param source Source.
     * @return Features.
     */
    @JsMethod
    public native Feature[] readFeatures(String source);

    /**
     * Read all features from a WFS FeatureCollection.
     * @param source Source.
     * @param options Read options.
     * @return Features.
     */
    @JsMethod
    public native Feature[] readFeatures(String source, FormatReadOptions options);

    /**
     * Read all features from a WFS FeatureCollection.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format is assigned (where set).
     *                       If the projection can not be derived from the data and if no defaultDataProjection is
     *                       set for a format, the features will not be reprojected.
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
     * Read all features from a WFS FeatureCollection.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format is assigned (where set).
     *                       If the projection can not be derived from the data and if no defaultDataProjection is
     *                       set for a format, the features will not be reprojected.
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
     * Read the projection from a WFS source.
     * @param source Source.
     * @return Projection.
     */
    @JsMethod
    public native Projection readProjection(String source);

    /**
     * Read transaction response of the source.
     * @param source Source.
     * @return Transaction response.
     */
    @JsMethod
    public native WFSTransactionResponse readTransactionResponse(String source);

    /**
     * Encode format as WFS GetFeature and return the Node.
     * @param options Options.
     * @return Result.
     */
    @JsMethod
    public native Node writeGetFeature(GetFeatureOptions options);

    /**
     * Encode format as WFS Transaction and return the Node.
     * @param inserts The features to insert.
     * @param updates The features to update.
     * @param deletes The features to delete.
     * @param options Options.
     * @return Result.
     */
    @JsMethod
    public native Node writeTransaction(Feature[] inserts, Feature[] updates, Feature[] deletes, TransactionOptions options);
}
