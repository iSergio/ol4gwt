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
import org.openlayers.ol.proj.Projection;
import org.openlayers.olx.LogoOptions;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class CargoDBSourceOptions extends UrlTileSourceOptions {
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
     * Projection.
     */
    @JsProperty
    public Projection projection;
    /**
     * Optional max zoom level. Default is 18.
     */
    @JsProperty
    public int maxZoom;
    /**
     * Optional min zoom level. Default is 0.
     */
    @JsProperty
    public int minZoom;
    /**
     * Whether to wrap the world horizontally. The default, undefined, is to request out-of-bounds tiles from the server.
     * When set to false, only one world will be rendered. When set to true, tiles will be requested for one world only,
     * but they will be wrapped horizontally to render multiple worlds.
     */
    @JsProperty
    public boolean wrapX;
    /**
     * If using anonymous maps, the CartoDB config to use. See http://docs.cartodb.com/cartodb-platform/maps-api/anonymous-maps/
     * for more detail. If using named maps, a key-value lookup with the template parameters.
     * See http://docs.cartodb.com/cartodb-platform/maps-api/named-maps/ for more detail.
     */
    @JsProperty
    public Object config;
    /**
     * If using named maps, this will be the name of the template to load.
     * See http://docs.cartodb.com/cartodb-platform/maps-api/named-maps/ for more detail.
     */
    @JsProperty
    public String map;
    /**
     * CartoDB account name Required.
     */
    @JsProperty
    public String account;

    @JsConstructor
    public CargoDBSourceOptions() {}
}
