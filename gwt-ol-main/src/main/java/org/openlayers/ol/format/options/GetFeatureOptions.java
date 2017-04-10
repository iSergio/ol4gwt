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

package org.openlayers.ol.format.options;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Extent;

/**
 * {@link org.openlayers.ol.format.WFSFormat#writeGetFeature(GetFeatureOptions)} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class GetFeatureOptions {
    /**
     * The namespace URI used for features. Required.
     */
    @JsProperty
    public String featureNS;
    /**
     * The prefix for the feature namespace. Required.
     */
    @JsProperty
    public String featurePrefix;
    /**
     * The feature type names. Required.
     */
    @JsProperty
    public String[] featureTypes;
    /**
     * SRS name. No srsName attribute will be set on geometries when this is not provided.
     */
    @JsProperty
    public String srsName;
    /**
     * Handle.
     */
    @JsProperty
    public String handle;
    /**
     * Output format.
     */
    @JsProperty
    public String outputFormat;
    /**
     * Maximum number of features to fetch.
     */
    @JsProperty
    public int maxFeatures;
    /**
     * Geometry name to use in a BBOX filter.
     */
    @JsProperty
    public String geometryName;
    /**
     * Optional list of property names to serialize.
     */
    @JsProperty
    public String[] propertyNames;
    /**
     * Start index to use for WFS paging. This is a WFS 2.0 feature backported to WFS 1.1.0 by some Web Feature Services.
     */
    @JsProperty
    public int startIndex;
    /**
     * Number of features to retrieve when paging. This is a WFS 2.0 feature backported to WFS 1.1.0 by some Web Feature
     * Services. Please note that some Web Feature Services have repurposed maxfeatures instead.
     */
    @JsProperty
    public int count;
    /**
     * Extent to use for the BBOX filter.
     */
    @JsProperty
    public Extent bbox;
//TODO: format.Filter
//    filter	ol.format.filter.Filter | undefined
//    Filter condition. See ol.format.filter for more information.
    /**
     * Indicates what response should be returned, E.g. hits only includes the numberOfFeatures attribute in the response and no features.
     */
    @JsProperty
    public String resultType;

    @JsConstructor
    public GetFeatureOptions() {}
}
