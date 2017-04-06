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
import org.openlayers.ol.Extent;
import org.openlayers.ol.ImageLoadFunctionType;
import org.openlayers.ol.Size;
import org.openlayers.ol.proj.Projection;
import org.openlayers.olx.LogoOptions;

/**
 * {@link org.openlayers.ol.source.ImageStaticSource} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ImageStaticSourceOptions extends ImageSourceOptions {
    /**
     * Attributions.
     */
    @JsProperty
    public Attribution attributions;
    /**
     * The crossOrigin attribute for loaded images. Note that you must provide a crossOrigin value if you are using the
     * WebGL renderer or if you want to access pixel data with the Canvas renderer.
     * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
     */
    @JsProperty
    public String crossOrigin;
    /**
     * Extent of the image in map coordinates. This is the [left, bottom, right, top] map coordinates of your image. Required.
     */
    @JsProperty
    public Extent imageExtent;
    /**
     * Optional function to load an image given a URL.
     */
    @JsProperty
    public ImageLoadFunctionType imageLoadFunction;
    /**
     * Optional logo.
     */
    @JsProperty
    public String logo;
    /**
     * Optional logo.
     */
    @JsProperty(name = "logo")
    public LogoOptions logoOptions;
    /**
     * Projection.
     */
    @JsProperty
    public Projection projection;
    /**
     * Size of the image in pixels. Usually the image size is auto-detected, so this only needs to be set if
     * auto-detection fails for some reason.
     */
    @JsProperty
    public Size imageSize;
    /**
     * Image URL. Required.
     */
    @JsProperty
    public String url;

    @JsConstructor
    public ImageStaticSourceOptions() {}
}
