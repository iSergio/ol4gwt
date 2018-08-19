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
import org.openlayers.ol.tilegrid.TileGrid;
import org.openlayers.olx.LogoOptions;

/**
 * {@link org.openlayers.ol.source.TileWMSSource} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class TileWMSSourceOptions extends UrlTileSourceOptions {
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
     * WMS request parameters. At least a LAYERS param is required. STYLES is '' by default. VERSION is 1.3.0 by default.
     * WIDTH, HEIGHT, BBOX and CRS (SRS for WMS version < 1.3.0) will be set dynamically. Required.
     */
    @JsProperty
    public Object params;
    /**
     * The crossOrigin attribute for loaded images. Note that you must provide a crossOrigin value if you are using the
     * WebGL renderer or if you want to access pixel data with the Canvas renderer.
     * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
     */
    @JsProperty
    public String crossOrigin;
    /**
     * The size in pixels of the gutter around image tiles to ignore. By setting this property to a non-zero value,
     * images will be requested that are wider and taller than the tile size by a value of 2 x gutter. Defaults to zero.
     * Using a non-zero value allows artifacts of rendering at tile edges to be ignored. If you control the WMS
     * service it is recommended to address "artifacts at tile edges" issues by properly configuring the WMS service.
     * For example, MapServer has a tile_map_edge_buffer configuration parameter for this. See http://mapserver.org/output/tile_mode.html.
     */
    @JsProperty
    public double gutter;
    /**
     * Use the ol.Map#pixelRatio value when requesting the image from the remote server. Default is true.
     */
    @JsProperty
    public boolean hidpi;
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
     * Tile grid. Base this on the resolutions, tilesize and extent supported by the server. If this is not defined,
     * a default grid will be used: if there is a projection extent, the grid will be based on that; if not,
     * a grid based on a global extent with origin at 0,0 will be used.
     */
    @JsProperty
    public TileGrid tileGrid;
    /**
     * Projection.
     */
    @JsProperty
    public Projection projection;
    /**
     * Maximum allowed reprojection error (in pixels). Default is 0.5. Higher values can increase reprojection performance,
     * but decrease precision.
     */
    @JsProperty
    public double reprojectionErrorThreshold;
    /**
     * The type of the remote WMS server. Currently only used when hidpi is true. Default is undefined.
     */
    @JsProperty
    public String serverType;
//TODO: TileLoadFunctionType
//    /**
//     * Optional function to load a tile given a URL.
//     */
//    @JsProperty
//    public TileLoadFunctionType tileLoadFunction;
    /**
     * WMS service URL.
     */
    @JsProperty
    public String url;
    /**
     * WMS service urls. Use this instead of url when the WMS supports multiple urls for GetMap requests.
     */
    @JsProperty
    public String[] urls;
    /**
     * Whether to wrap the world horizontally. When set to false, only one world will be rendered. When true,
     * tiles will be requested for one world only, but they will be wrapped horizontally to render multiple worlds.
     * The default is true.
     */
    @JsProperty
    public boolean wrapX;

    @JsConstructor
    public TileWMSSourceOptions() {}
}
