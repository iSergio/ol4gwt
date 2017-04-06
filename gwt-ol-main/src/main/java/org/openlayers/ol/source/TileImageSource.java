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

package org.openlayers.ol.source;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.proj.Projection;
import org.openlayers.ol.source.options.TileImageSourceOptions;
import org.openlayers.ol.tilegrid.TileGrid;

/**
 * Base class for sources providing images divided into a tile grid.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.source", name = "TileImage")
public class TileImageSource extends UrlTileSource {
    @JsConstructor
    protected TileImageSource() {}
    @JsConstructor
    public TileImageSource(TileImageSourceOptions options) {}

    /**
     * Sets whether to render reprojection edges or not (usually for debugging).
     * @param render Render the edges.
     */
    @JsMethod
    public native void setRenderReprojectionEdges(boolean render);

    /**
     * Sets the tile grid to use when reprojecting the tiles to the given projection instead of the
     * default tile grid for the projection.
     *
     * This can be useful when the default tile grid cannot be created (e.g. projection has no extent defined)
     * or for optimization reasons (custom tile size, resolutions, ...).
     * @param projection Projection.
     * @param tilegrid Tile grid to use for the projection.
     */
    @JsMethod
    public native void setTileGridForProjection(Projection projection, TileGrid tilegrid);
}
