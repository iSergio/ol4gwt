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

package org.openlayers.ol.layer.options;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Map;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class TileLayerOptions extends LayerOptions {
    /**
     * Preload. Load low-resolution tiles up to preload levels. By default preload is 0, which means no preloading.
     */
    @JsProperty
    public int preload;
    /**
     * Sets the layer as overlay on a map. The map will not manage this layer in its layers collection, and the layer will
     * be rendered on top. This is useful for temporary layers. The standard way to add a layer to a map and have it
     * managed by the map is to use ol.Map#addLayer.
     */
    @JsProperty
    public Map map;
    /**
     * Use interim tiles on error. Default is true.
     */
    @JsProperty
    public boolean useInterimTilesOnError;

    @JsConstructor
    public TileLayerOptions() {}
}
