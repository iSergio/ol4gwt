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

package org.openlayers.ol.layer;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.layer.options.VectorLayerOptions;
import org.openlayers.ol.source.VectorSource;
import org.openlayers.ol.style.Style;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.layer", name = "Vector")
public class VectorLayer extends Layer {
    @JsConstructor
    public VectorLayer(VectorLayerOptions options) {
        super(options);
    }

    /**
     * Return the associated vectorsource of the layer.
     * @return Source.
     */
    @JsMethod
    public native VectorSource getSource();
    /**
     * Get the style for features. This returns whatever was passed to the style option at construction or to the setStyle method.
     * @return Layer style.
     */
    @JsMethod
    public native Style[] getStyle();
// TODO: StyleFunction
//    /**
//     * Get the style function.
//     * @return Layer style function.
//     */
//    @JsMethod
//    public native StyleFunction getStyleFunction();
    /**
     * Set the style for features. This can be a single style object, an array of styles, or a function that takes a
     * feature and resolution and returns an array of styles. If it is undefined the default style is used.
     * If it is null the layer has no style (a null style), so only features that have their own styles will be
     * rendered in the layer. See ol.style for information on the default style.
     * @param style Layer style.
     */
    @JsMethod
    public native void setStyle(Style style);
    /**
     * Set the style for features. This can be a single style object, an array of styles, or a function that takes a
     * feature and resolution and returns an array of styles. If it is undefined the default style is used.
     * If it is null the layer has no style (a null style), so only features that have their own styles will be
     * rendered in the layer. See ol.style for information on the default style.
     * @param style Layer style.
     */
    @JsMethod
    public native void setStyle(Style[] style);
// TODO: StyleFunction
//    /**
//     * Set the style for features. This can be a single style object, an array of styles, or a function that takes a
//     * feature and resolution and returns an array of styles. If it is undefined the default style is used.
//     * If it is null the layer has no style (a null style), so only features that have their own styles will be
//     * rendered in the layer. See ol.style for information on the default style.
//     * @param style Layer style.
//     */
//    @JsMethod
//    public native void setStyle(StyleFunction style);
}
