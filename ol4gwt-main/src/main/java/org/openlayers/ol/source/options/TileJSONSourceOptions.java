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

/**
 * {@link org.openlayers.ol.source.TileJSONSource} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class TileJSONSourceOptions extends UrlTileSourceOptions {
    /**
     * Optional attributions for the source. If provided, these will be used instead of any attribution data advertised
     * by the server. If not provided, any attributions advertised by the server will be used.
     */
    @JsProperty
    public Attribution attributions;
    /**
     * Cache size. Default is 2048.
     */
    @JsProperty
    public int cacheSize;
    /**
     * The crossOrigin attribute for loaded images. Note that you must provide a crossOrigin value if you are using the
     * WebGL renderer or if you want to access pixel data with the Canvas renderer.
     * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
     */
    @JsProperty
    public String crossOrigin;
    /**
     * Use JSONP with callback to load the TileJSON. Useful when the server does not support CORS. Default is false.
     */
    @JsProperty
    public boolean jsonp;
    /**
     * Maximum allowed reprojection error (in pixels). Default is 0.5. Higher values can increase
     * reprojection performance, but decrease precision.
     */
    @JsProperty
    public double reprojectionErrorThreshold;
//TODO: TileLoadFunctionType
//    /**
//     * Optional function to load a tile given a URL.
//     */
//    @JsProperty
//    public TileLoadFunctionType tileLoadFunction;
    /**
     * URL to the TileJSON file. Required.
     */
    @JsProperty
    public String url;
    /**
     * Whether to wrap the world horizontally. Default is true.
     */
    @JsProperty
    public boolean wrapX;

    @JsConstructor
    public TileJSONSourceOptions() {}
}
