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

package org.openlayers.ol.tilegrid.options;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Coordinate;
import org.openlayers.ol.Extent;
import org.openlayers.ol.Size;

/**
 * {@link org.openlayers.ol.tilegrid.TileGrid} options
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class TileGridOptions {
    /**
     * Extent for the tile grid. No tiles outside this extent will be requested by ol.source.Tile sources.
     * When no origin or origins are configured, the origin will be set to the top-left corner of the extent.
     */
    @JsProperty
    public Extent extent;
    /**
     * Minimum zoom. Default is 0.
     */
    @JsProperty
    public int minZoom;
    /**
     * The tile grid origin, i.e. where the x and y axes meet ([z, 0, 0]). Tile coordinates increase left to right and upwards.
     * If not specified, extent or origins must be provided.
     */
    @JsProperty
    public Coordinate origin;
    /**
     * Tile grid origins, i.e. where the x and y axes meet ([z, 0, 0]), for each zoom level.
     * If given, the array length should match the length of the resolutions array, i.e. each resolution can have a
     * different origin. Tile coordinates increase left to right and upwards. If not specified, extent or origin must be provided.
     */
    @JsProperty
    public Coordinate[] origins;
    /**
     * Resolutions. The array index of each resolution needs to match the zoom level. This means that even if a
     * minZoom is configured, the resolutions array will have a length of maxZoom + 1. Required.
     */
    @JsProperty
    public double[] resolutions;
    /**
     * Tile size. Default is [256, 256].
     */
    @JsProperty
    public Size tileSize;
    /**
     * Tile sizes. If given, the array length should match the length of the resolutions array, i.e. each resolution can have a different tile size.
     */
    @JsProperty
    public Size[] tileSizes;

    @JsConstructor
    public TileGridOptions() {}
}
