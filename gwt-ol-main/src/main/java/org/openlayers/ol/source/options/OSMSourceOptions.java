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
 * {@link org.openlayers.ol.source.OSMSource} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class OSMSourceOptions extends UrlTileSourceOptions {
    /**
     * Attributions.
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
     * Max zoom. Default is 19.
     */
    @JsProperty
    public int maxZoom;
    /**
     * Whether the layer is opaque.
     */
    @JsProperty
    public boolean opaque;
    /**
     * Maximum allowed reprojection error (in pixels). Default is 0.5. Higher values can increase
     * reprojection performance, but decrease precision.
     */
    @JsProperty
    public double reprojectionErrorThreshold;
    //TODO: TileLoadFunctionType
    /**
     * URL template. Must include {x}, {y} or {-y}, and {z} placeholders. A {?-?} template pattern,
     * for example subdomain{a-f}.domain.com, may be used instead of defining each one separately in the urls option.
     */
    @JsProperty
    public String url;
    /**
     * Whether to wrap the world horizontally. The default, undefined, is to request out-of-bounds tiles from the server.
     * When set to false, only one world will be rendered. When set to true, tiles will be requested for one world only,
     * but they will be wrapped horizontally to render multiple worlds.
     */
    @JsProperty
    public boolean wrapX;

    @JsConstructor
    public OSMSourceOptions() {}
}
