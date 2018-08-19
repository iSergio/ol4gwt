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
import org.openlayers.ol.format.FeatureFormat;
import org.openlayers.ol.proj.Projection;
import org.openlayers.ol.source.SourceState;
import org.openlayers.ol.tilegrid.TileGrid;
import org.openlayers.olx.LogoOptions;

/**
 * {@link org.openlayers.ol.source.VectorTileSource} options.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class VectorTileSourceOptions extends UrlTileSourceOptions {
    /**
     * Attributions.
     */
    @JsProperty
    public Attribution attributions;
    /**
     * Cache size. Default is 128.
     */
    @JsProperty
    public int cacheSize;
    /**
     * Feature format for tiles. Used and required by the default tileLoadFunction.
     */
    @JsProperty
    public FeatureFormat format;
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
     * This source may have overlapping geometries. Default is true. Setting this to false (e.g. for sources with
     * polygons that represent administrative boundaries or TopoJSON sources) allows the renderer to optimise
     * fill and stroke operations.
     */
    @JsProperty
    public boolean overlaps;
    /**
     * Projection.
     */
    @JsProperty
    public Projection projection;
    /**
     * Source state. {@link SourceState}
     */
    @JsProperty
    public String state;
    // TODO: tileClass
//    tileClass	function | undefined
//    Class used to instantiate image tiles. Default is ol.VectorTile.
    /**
     * Tile grid.
     */
    @JsProperty
    public TileGrid tileGrid;
    // TODO: tileLoadFunction
//    tileLoadFunction	ol.TileLoadFunctionType | undefined
//    Optional function to load a tile given a URL.
    /**
     * The pixel ratio used by the tile service. For example, if the tile service advertizes 256px by 256px
     * tiles but actually sends 512px by 512px tiles (for retina/hidpi devices)
     * then tilePixelRatio should be set to 2. Default is 1.
     */
    @JsProperty
    public double tilePixelRatio;
//TODO: TileUrlFunctionType
//    tileUrlFunction	ol.TileUrlFunctionType | undefined
//    Optional function to get tile URL given a tile coordinate and the projection.
    /**
     * URL template. Must include {x}, {y} or {-y}, and {z} placeholders. A {?-?} template pattern,
     * for example subdomain{a-f}.domain.com, may be used instead of defining each one separately in the urls option.
     */
    @JsProperty
    public String url;
    /**
     * An array of URL templates.
     */
    @JsProperty
    public String[] urls;
    /**
     * Whether to wrap the world horizontally. When set to false, only one world will be rendered. When set to true,
     * tiles will be wrapped horizontally to render multiple worlds. Default is true.
     */
    @JsProperty
    public boolean wrapX;

    @JsConstructor
    public VectorTileSourceOptions() {}
}
