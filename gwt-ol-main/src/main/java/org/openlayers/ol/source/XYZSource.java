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
import jsinterop.annotations.JsType;
import org.openlayers.ol.source.options.XYZSourceOptions;

/**
 * Layer source for tile data with URLs in a set XYZ format that are defined in a URL template. By default, this follows
 * the widely-used Google grid where x 0 and y 0 are in the top left. Grids like TMS where x 0 and y 0 are in the
 * bottom left can be used by using the {-y} placeholder in the URL template, so long as the source does not
 * have a custom tile grid. In this case, ol.source.TileImage can be used with a tileUrlFunction such as:
 *
 * tileUrlFunction:
 *      function(coordinate) { return 'http://mapserver.com/' + coordinate[0] + '/' + coordinate[1] + '/' + coordinate[2] + '.png'; }
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.source", name = "XYZ")
public class XYZSource extends TileImageSource {
    @JsConstructor
    public XYZSource() {}

    @JsConstructor
    public XYZSource(XYZSourceOptions options) {}
}
