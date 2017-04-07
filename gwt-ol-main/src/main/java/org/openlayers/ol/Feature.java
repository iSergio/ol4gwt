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

package org.openlayers.ol;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.geom.Geometry;
import org.openlayers.ol.options.FeatureOptions;
import org.openlayers.ol.style.Style;

/**
 * A vector object for geographic features with a geometry and other attribute properties, similar to the features in
 * vector file formats like GeoJSON.
 *
 * Features can be styled individually with setStyle; otherwise they use the style of their vector layer.
 *
 * Note that attribute properties are set as ol.Object properties on the feature object, so they are observable,
 * and have get/set accessors.
 *
 * Typically, a feature has a single geometry property. You can set the geometry using the setGeometry method and get it
 * with getGeometry. It is possible to store more than one geometry on a feature using attribute properties.
 * By default, the geometry used for rendering is identified by the property name geometry. If you want to use another
 * geometry property for rendering, use the setGeometryName method to change the attribute property associated with the
 * geometry for the feature.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol", name = "Feature")
public class Feature extends Object {
    @JsConstructor
    public Feature(Geometry geometry) {}

    @JsConstructor
    public Feature(FeatureOptions options) {}

    /**
     * Clone this feature. If the original feature has a geometry it is also cloned. The feature id is not set in the clone.
     * @return The clone.
     */
    @JsMethod
    public native Feature clone();

    /**
     * Get the feature's default geometry. A feature may have any number of named geometries.
     * The "default" geometry (the one that is rendered by default) is set when calling ol.Feature#setGeometry.
     * @return The default geometry for the feature.
     */
    @JsMethod
    public native Geometry getGeometry();

    /**
     * Get the name of the feature's default geometry. By default, the default geometry is named geometry.
     * @return Get the property name associated with the default geometry for this feature.
     */
    @JsMethod
    public native String getGeometryName();

    /**
     * Get the feature identifier. This is a stable identifier for the feature and is either set when reading data from a
     * remote source or set explicitly by calling ol.Feature#setId.
     * @return Id.
     */
    @JsMethod
    public native String getId();
    /**
     * Get the feature's style. Will return what was provided to the ol.Feature#setStyle method.
     * @return The feature style.
     */
    @JsMethod
    public native Style getStyle();
// TODO: FeatureStyleFunction
//    /**
//     * Get the feature's style function.
//     * @return Return a function representing the current style of this feature.
//     */
//    @JsMethod
//    public native FeatureStyleFunction getStyleFunction();

    /**
     * Set the default geometry for the feature. This will update the property with the name returned by {@link #getGeometryName()}.
     * @param geometry The new geometry.
     */
    @JsMethod
    public native void setGeometry(Geometry geometry);

    /**
     * Set the property name to be used when getting the feature's default geometry. When calling {@link #getGeometry()},
     * the value of the property with this name will be returned.
     * @param name The property name of the default geometry.
     */
    @JsMethod
    public native void setGeometryName(String name);

    /**
     * Set the feature id. The feature id is considered stable and may be used when requesting features or comparing
     * identifiers returned from a remote source.
     * The feature id can be used with the {@link org.openlayers.ol.source.VectorSource} method.
     * @param id The feature id.
     */
    @JsMethod
    public native void setId(String id);
    /**
     * Set the style for the feature. This can be a single style object, an array of styles, or a function that takes a
     * resolution and returns an array of styles. If it is null the feature has no style (a null style).
     * @param style Style for this feature.
     */
    @JsMethod
    public native void setStyle(Style style);
    /**
     * Set the style for the feature. This can be a single style object, an array of styles, or a function that takes a
     * resolution and returns an array of styles. If it is null the feature has no style (a null style).
     * @param style Style for this feature.
     */
    @JsMethod
    public native void setStyle(Style[] style);
// TODO: FeatureStyleFunction
//    /**
//     * Set the style for the feature. This can be a single style object, an array of styles, or a function that takes a
//     * resolution and returns an array of styles. If it is null the feature has no style (a null style).
//     * @param style Style for this feature.
//     */
//    @JsMethod
//    public native void setStyle(FeatureStyleFunction style);
    /**
     * Set the style for the feature. This can be a single style object, an array of styles, or a function that takes a
     * resolution and returns an array of styles. If it is null the feature has no style (a null style).
     * @param style Style for this feature.
     */
    @JsMethod
    public native void setStyle(StyleFunction style);
}
