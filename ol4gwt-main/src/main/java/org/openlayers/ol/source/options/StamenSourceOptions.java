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

/**
 * {@link org.openlayers.ol.source.StamenSource} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class StamenSourceOptions extends UrlTileSourceOptions {
    /**
     * Cache size. Default is 2048.
     */
    @JsProperty
    public int cacheSize;
    /**
     * Layer. Required.
     */
    @JsProperty
    public String layer;
    /**
     * Minimum zoom.
     */
    @JsProperty
    public int minZoom;
    /**
     * Maximum zoom.
     */
    @JsProperty
    public int maxZoom;
    /**
     * Whether the layer is opaque.
     */
    @JsProperty
    public boolean opaque;
    /**
     * Maximum allowed reprojection error (in pixels). Default is 0.5. Higher values can increase reprojection performance,
     * but decrease precision.
     */
    @JsProperty
    public double reprojectionErrorThreshold;
//TODO: TileLoadFunctionType
//    /**
//     * Optional function to load a tile given a URL.
//     */
//    public TileLoadFunctionType tileLoadFunction;
    /**
     * URL template. Must include {x}, {y} or {-y}, and {z} placeholders.
     */
    @JsProperty
    public String url;

    @JsConstructor
    public StamenSourceOptions() {}
}
