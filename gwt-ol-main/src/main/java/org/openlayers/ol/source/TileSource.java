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
import org.openlayers.ol.source.options.TileSourceOptions;
import org.openlayers.ol.tilegrid.TileGrid;

/**
 * Abstract base class; normally only used for creating subclasses and not instantiated in apps.
 * Base class for sources providing images divided into a tile grid.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.source", name = "Tile")
public abstract class TileSource extends Source {
    @JsConstructor
    protected TileSource() {}

    @JsConstructor
    protected TileSource(TileSourceOptions options) {}

    /**
     * Return the tile grid of the tile source.
     * @return Tile grid.
     */
    @JsMethod
    public native TileGrid getTileGrid();
}
