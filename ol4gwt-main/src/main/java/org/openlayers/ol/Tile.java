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

package org.openlayers.ol;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * Base class for tiles.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol", name = "Tile")
public class Tile {
    @JsConstructor
    public Tile() {}

    /**
     * Get the tile coordinate for this tile.
     * @return The tile coordinate.
     */
    @JsMethod
    public native TileCoord getTileCoord();

    /**
     * Load the image or retry if loading previously failed. Loading is taken care of by the tile queue, and calling this
     * method is only needed for preloading or for reloading in case of an error.
     */
    @JsMethod
    public native void load();
}
