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
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Attribution;
import org.openlayers.ol.source.options.OSMSourceOptions;

/**
 * Layer source for the OpenStreetMap tile server.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.source", name = "OSM")
public class OSMSource extends XYZSource {
    /**
     * The attribution containing a link to the OpenStreetMap Copyright and License page.
     */
    @JsProperty(name =  "ATTRIBUTION")
    public native Attribution ATTRIBUTION();

    @JsConstructor
    public OSMSource() {}

    @JsConstructor
    public OSMSource(OSMSourceOptions options) {}
}
