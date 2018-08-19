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

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import net.sourceforge.htmlunit.corejs.javascript.annotations.JSConstructor;
import org.openlayers.ol.proj.Projection;
import org.openlayers.ol.tilegrid.TileGrid;

/**
 * {@link org.openlayers.ol.source.TileDebugSource} options.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class TileDebugSourceOptions extends TileSourceOptions {
    /**
     * Projection.
     */
    @JsProperty
    public Projection projection;
    /**
     * Tile grid.
     */
    @JsProperty
    public TileGrid tileGrid;
    /**
     * Whether to wrap the world horizontally. Default is true.
     */
    @JsProperty
    public boolean wrapX;

    @JSConstructor
    public TileDebugSourceOptions() {}
}
