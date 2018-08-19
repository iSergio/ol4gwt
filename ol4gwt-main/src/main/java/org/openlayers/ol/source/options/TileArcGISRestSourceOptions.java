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
 * {@link org.openlayers.ol.source.TileArcGISRestSource} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class TileArcGISRestSourceOptions extends UrlTileSourceOptions {
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
     * ArcGIS Rest parameters. This field is optional. Service defaults will be used for any fields not specified.
     * FORMAT is PNG32 by default. F is IMAGE by default. TRANSPARENT is true by default. BBOX,SIZE,BBOXSR, andIMAGESRwill be
     * set dynamically. SetLAYERS` to override the default service layer visibility.
     * See http://resources.arcgis.com/en/help/arcgis-rest-api/index.html#/Export_Map/02r3000000v7000000/ for further reference.
     */
    @JsProperty
    public Object params;
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
//TODO: TileLoadFunctionType
//    /**
//     * Optional function to load a tile given a URL.
//     */
//    @JsProperty
//    public TileLoadFunctionType tileLoadFunction;
    /**
     * ArcGIS Rest service URL for a Map Service or Image Service. The url should include /MapServer or /ImageServer.
     */
    @JsProperty
    public String url;
    /**
     * Whether to wrap the world horizontally. Default is true.
     */
    @JsProperty
    public boolean wrapX;
    /**
     * ArcGIS Rest service urls. Use this instead of url when the ArcGIS Service supports multiple urls for export requests.
     */
    @JsProperty
    public String[] urls;


    @JsConstructor
    public TileArcGISRestSourceOptions() {}
}
