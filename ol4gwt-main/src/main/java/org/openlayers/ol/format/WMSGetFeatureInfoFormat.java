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
import org.openlayers.ol.format.options.WMSGetFeatureInfoFormatOptions;
import org.openlayers.ol.proj.Projection;

/**
 * Format for reading WMSGetFeatureInfo format. It uses ol.format.GML2 to read features.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.format", name = "WMSGetFeatureInfo")
public class WMSGetFeatureInfoFormat extends XMLFeatureFormat {
    @JsConstructor
    public WMSGetFeatureInfoFormat() {}

    @JsConstructor
    public WMSGetFeatureInfoFormat(WMSGetFeatureInfoFormatOptions options) {}

    @JsOverlay
    public WMSGetFeatureInfoFormat create(String[] layers) {
        WMSGetFeatureInfoFormatOptions options = new WMSGetFeatureInfoFormatOptions();
        options.layers = layers;
        return new WMSGetFeatureInfoFormat(options);
    }

    /**
     * Read all features from a WMSGetFeatureInfo response.
     * @param source Source.
     * @return Features.
     */
    @JsMethod
    public native Feature[] readFeatures(String source);

    /**
     * Read all features from a WMSGetFeatureInfo response.
     * @param source Source.
     * @param options Options.
     * @return Features.
     */
    @JsMethod
    public native Feature[] readFeatures(String source, FormatReadOptions options);

    /**
     * Read all features from a WMSGetFeatureInfo response.
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
     * Read all features from a WMSGetFeatureInfo response.
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
}
