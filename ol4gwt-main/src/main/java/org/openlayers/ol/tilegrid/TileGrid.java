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

package org.openlayers.ol.tilegrid;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Coordinate;
import org.openlayers.ol.Extent;
import org.openlayers.ol.Size;
import org.openlayers.ol.TileCoord;
import org.openlayers.ol.tilegrid.options.TileGridOptions;

/**
 * Base class for setting the grid pattern for sources accessing tiled-image servers.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.tilegrid", name = "TileGrid")
public class TileGrid {
    @JsConstructor
    protected TileGrid() {}

    @JsConstructor
    public TileGrid(TileGridOptions options) {}

    /**
     * Call a function with each tile coordinate for a given extent and zoom level.
     * @param extent Extent.
     * @param zoom Zoom level.
     * @param callback Function called with each tile coordinate.
     */
    @JsMethod
    public native void forEachTileCoord(Extent extent, int zoom, EachTileCoordCallback callback);

    /**
     * Get the maximum zoom level for the grid.
     * @return Max zoom.
     */
    @JsMethod
    public native int getMaxZoom();

    /**
     * Get the minimum zoom level for the grid.
     * @return Min zoom.
     */
    @JsMethod
    public native int getMinZoom();

    /**
     * Get the origin for the grid at the given zoom level.
     * @param z Z.
     * @return Origin.
     */
    @JsMethod
    public native Coordinate getOrigin(int z);

    /**
     * Get the resolution for the given zoom level.
     * @param z Z.
     * @return Resolution.
     */
    @JsMethod
    public native double getResolution(int z);

    /**
     * Get the list of resolutions for the tile grid.
     * @return Resolutions.
     */
    @JsMethod
    public native double[] getResolutions();

    /**
     * Get the extent of a tile coordinate.
     * @param tileCoord Tile coordinate.
     * @return Extent.
     */
    @JsMethod
    public native Extent getTileCoordExtent(TileCoord tileCoord);

    /**
     * Get the extent of a tile coordinate.
     * @param tileCoord Tile coordinate.
     * @param extent Temporary extent object.
     * @return Extent.
     */
    @JsMethod
    public native Extent getTileCoordExtent(TileCoord tileCoord, Extent extent);

    /**
     * Get the tile coordinate for the given map coordinate and resolution. This method considers that coordinates that
     * intersect tile boundaries should be assigned the higher tile coordinate.
     * @param coordinate Coordinate.
     * @param resolution Resolution.
     * @return Tile coordinate.
     */
    @JsMethod
    public native TileCoord getTileCoordForCoordAndResolution(Coordinate coordinate, double resolution);

    /**
     * Get the tile coordinate for the given map coordinate and resolution. This method considers that coordinates that
     * intersect tile boundaries should be assigned the higher tile coordinate.
     * @param coordinate Coordinate.
     * @param resolution Resolution.
     * @param tileCoord Destination {@link TileCoord} object.
     * @return Tile coordinate.
     */
    @JsMethod
    public native TileCoord getTileCoordForCoordAndResolution(Coordinate coordinate, double resolution, TileCoord tileCoord);

    /**
     * Get a tile coordinate given a map coordinate and zoom level.
     * @param coordinate Coordinate.
     * @param z Zoom level.
     * @param tileCoord Destination {@link TileCoord} object.
     * @return Tile coordinate.
     */
    @JsMethod
    public native TileCoord getTileCoordForCoordAndZ(Coordinate coordinate, int z, TileCoord tileCoord);

    /**
     * Get the tile size for a zoom level. The type of the return value matches the tileSize or tileSizes that the tile
     * grid was configured with. To always get an ol.Size, run the result through ol.size.toSize().
     * @param z Z.
     * @return Tile size.
     */
    @JsMethod
    public native Size getTileSize(int z);

    /**
     *
     * @param resolution Resolution.
     * @return Z.
     */
    @JsMethod
    public native int getZForResolution(double resolution);

    /**
     *
     * @param resolution Resolution.
     * @param direction If 0, the nearest resolution will be used. If 1, the nearest lower resolution will be used.
     *                  If -1, the nearest higher resolution will be used. Default is 0.
     * @return Z.
     */
    @JsMethod
    public native int getZForResolution(double resolution, int direction);

    @JsFunction
    public interface EachTileCoordCallback {
        void function();
    }
}
