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

package org.openlayers.ol.source;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.source.options.ImageVectorSourceOptions;

/**
 * An image source whose images are canvas elements into which vector features read from a vector source ({@link VectorSource})
 * are drawn. An ol.source.ImageVector object is to be used as the source of an image layer ({@link org.openlayers.ol.layer.ImageLayer}).
 * Image layers are rotated, scaled, and translated, as opposed to being re-rendered, during animations and interactions.
 * So, like any other image layer, an image layer configured with an ol.source.ImageVector will exhibit this behaviour.
 * This is in contrast to a vector layer, where vector features are re-drawn during animations and interactions.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.source", name = "ImageCanvas")
public class ImageVectorSource extends ImageCanvasSource {
    @JsConstructor
    public ImageVectorSource(ImageVectorSourceOptions options) {}

    /**
     * Get a reference to the wrapped source.
     * @return Source.
     */
    @JsMethod
    public native VectorSource getSource();
//TODO: Style
//    /**
//     * Get the style for features. This returns whatever was passed to the style option at construction or to the setStyle method.
//     * @return Layer style.
//     */
//    @JsMethod
//    public native Style[] getStyle();
//TODO: StyleFunction
//    /**
//     * Get the style for features. This returns whatever was passed to the style option at construction or to the setStyle method.
//     * @return Layer style.
//     */
//    @JsMethod
//    public native StyleFunction getStyleFunction();
//TODO: Style
//    /**
//     * Set the style for features. This can be a single style object, an array of styles, or a function that takes a
//     * feature and resolution and returns an array of styles. If it is undefined the default style is used.
//     * If it is null the layer has no style (a null style), so only features that have their own styles will be
//     * rendered in the layer. See ol.style for information on the default style.
//     * @param style Layer style.
//     */
//    @JsMethod
//    public native void setStyle(Style style);
//TODO: Style[]
//    /**
//     * Set the style for features. This can be a single style object, an array of styles, or a function that takes a
//     * feature and resolution and returns an array of styles. If it is undefined the default style is used.
//     * If it is null the layer has no style (a null style), so only features that have their own styles will be
//     * rendered in the layer. See ol.style for information on the default style.
//     * @param style Layer style.
//     */
//    @JsMethod
//    public native void setStyle(Style[] style);
//TODO: StyleFunction
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
