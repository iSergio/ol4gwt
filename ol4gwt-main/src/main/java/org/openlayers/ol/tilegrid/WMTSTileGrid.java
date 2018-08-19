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
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Extent;
import org.openlayers.ol.tilegrid.options.WMTSTileGridOptions;

/**
 * Set the grid pattern for sources accessing WMTS tiled-image servers.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.tilegrid", name = "WMTS")
public class WMTSTileGrid extends TileGrid {
    @JsConstructor
    public WMTSTileGrid(WMTSTileGridOptions options) {}

    /**
     * Create a tile grid from a WMTS capabilities matrix set and an optional TileMatrixSetLimits.
     * @param matrixSet An object representing a matrixSet in the capabilities document.
     * @return WMTS tileGrid instance.
     */
    @JsMethod
    public native WMTSTileGrid createFromCapabilitiesMatrixSet(Object matrixSet);

    /**
     * Create a tile grid from a WMTS capabilities matrix set and an optional TileMatrixSetLimits.
     * @param matrixSet An object representing a matrixSet in the capabilities document.
     * @param extent An optional extent to restrict the tile ranges the server provides.
     * @return WMTS tileGrid instance.
     */
    @JsMethod
    public native WMTSTileGrid createFromCapabilitiesMatrixSet(Object matrixSet, Extent extent);

    /**
     * Create a tile grid from a WMTS capabilities matrix set and an optional TileMatrixSetLimits.
     * @param matrixSet An object representing a matrixSet in the capabilities document.
     * @param extent An optional extent to restrict the tile ranges the server provides.
     * @param matrixLimits An optional object representing the available matrices for tileGrid.
     * @return WMTS tileGrid instance.
     */
    @JsMethod
    public native WMTSTileGrid createFromCapabilitiesMatrixSet(Object matrixSet, Extent extent, Object[] matrixLimits);

    /**
     * Get the list of matrix identifiers.
     * @return MatrixIds.
     */
    @JsMethod
    public native String[] getMatrixIds();
}
