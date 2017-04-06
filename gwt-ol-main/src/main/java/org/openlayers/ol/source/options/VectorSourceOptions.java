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

package org.openlayers.ol.source.options;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Attribution;
import org.openlayers.ol.Collection;
import org.openlayers.ol.Feature;
import org.openlayers.ol.format.FeatureFormat;
import org.openlayers.olx.LogoOptions;

/**
 * Vector source options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class VectorSourceOptions extends SourceOptions {
    /**
     * Attributions.
     */
    @JsProperty
    public Attribution attributions;
    /**
     * Features. If provided as ol.Collection, the features in the source and the collection will stay in sync.
     */
    @JsProperty
    public Collection<Feature> features;
    /**
     * The feature format used by the XHR feature loader when url is set. Required if url is set, otherwise ignored.
     * Default is undefined.
     */
    @JsProperty
    public FeatureFormat format;
    // TODO: FeatureLoader
//    /**
//     * The loader function used to load features, from a remote source for example. If this is not set and url is set,
//     * the source will create and use an XHR feature loader.
//     */
//    @JsProperty
//    public FeatureLoader loader;
    /**
     * Logo.
     */
    @JsProperty
    public String logo;
    /**
     * Logo.
     */
    @JsProperty(name = "logo")
    public LogoOptions logoOptions;
    /**
     * This source may have overlapping geometries. Default is true. Setting this to false (e.g. for sources with
     * polygons that represent administrative boundaries or TopoJSON sources) allows the renderer to optimise fill and
     * stroke operations.
     */
    @JsProperty
    public boolean overlaps;
    // TODO: LoadingStrategy
//    /**
//     * The loading strategy to use. By default an ol.loadingstrategy.all strategy is used, a one-off strategy which
//     * loads all features at once.
//     */
//    @JsProperty
//    public LoadingStrategy strategy;
    /**
     * Setting this option instructs the source to load features using an XHR loader (see ol.featureloader.xhr).
     * Use a string and an ol.loadingstrategy.all for a one-off download of all features from the given URL.
     * Use a ol.FeatureUrlFunction to generate the url with other loading strategies. Requires format to be set as well.
     * When default XHR feature loader is provided, the features will be transformed from the data projection to the view
     * projection during parsing. If your remote data source does not advertise its projection properly,
     * this transformation will be incorrect. For some formats, the default projection (usually EPSG:4326) can be
     * overridden by setting the defaultDataProjection constructor option on the format. Note that if a source contains
     * non-feature data, such as a GeoJSON geometry or a KML NetworkLink, these will be ignored. Use a custom loader to load these.
     */
    @JsProperty
    public String url;
    // TODO: FeatureUrlFunction
//    /**
//     * Setting this option instructs the source to load features using an XHR loader (see ol.featureloader.xhr).
//     * Use a string and an ol.loadingstrategy.all for a one-off download of all features from the given URL.
//     * Use a ol.FeatureUrlFunction to generate the url with other loading strategies. Requires format to be set as well.
//     * When default XHR feature loader is provided, the features will be transformed from the data projection to the view
//     * projection during parsing. If your remote data source does not advertise its projection properly,
//     * this transformation will be incorrect. For some formats, the default projection (usually EPSG:4326) can be
//     * overridden by setting the defaultDataProjection constructor option on the format. Note that if a source contains
//     * non-feature data, such as a GeoJSON geometry or a KML NetworkLink, these will be ignored. Use a custom loader to load these.
//     */
//    @JsProperty(name = "url")
//    public FeatureUrlFunction urlFunction;
    /**
     * By default, an RTree is used as spatial index. When features are removed and added frequently,
     * and the total number of features is low, setting this to false may improve performance.
     *
     * Note that ol.source.Vector#getFeaturesInExtent, ol.source.Vector#getClosestFeatureToCoordinate and
     * ol.source.Vector#getExtent cannot be used when useSpatialIndex is set to false, and ol.source.Vector#forEachFeatureInExtent
     * will loop through all features.
     *
     * When set to false, the features will be maintained in an ol.Collection, which can be retrieved through
     * ol.source.Vector#getFeaturesCollection.
     *
     * The default is true.
     */
    @JsProperty
    public boolean useSpatialIndex;
    /**
     * Wrap the world horizontally. Default is true. For vector editing across the -180° and 180° meridians to
     * work properly, this should be set to false. The resulting geometry coordinates will then exceed the world bounds.
     */
    @JsProperty
    public boolean wrapX;

    @JsConstructor
    public VectorSourceOptions() {}
}
