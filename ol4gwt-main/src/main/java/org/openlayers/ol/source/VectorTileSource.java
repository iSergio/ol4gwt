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

import jsinterop.annotations.JsType;
import org.openlayers.ol.source.options.VectorTileSourceOptions;

/**
 * Class for layer sources providing vector data divided into a tile grid, to be used with {@link VectorTileLayer}.
 * Although this source receives tiles with vector features from the server, it is not meant for feature editing.
 * Features are optimized for rendering, their geometries are clipped at or near tile boundaries and simplified for a
 * view resolution. See {@link VectorSource} for vector sources that are suitable for feature editing.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.source", name = "VectorTile")
public class VectorTileSource extends UrlTileSource {
    public VectorTileSource(VectorTileSourceOptions options) {}
}
