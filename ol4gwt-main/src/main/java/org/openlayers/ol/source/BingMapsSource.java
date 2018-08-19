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
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Attribution;
import org.openlayers.ol.source.options.BingMapsSourceOptions;

/**
 * Layer source for Bing Maps tile data.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.source", name = "BingMaps")
public class BingMapsSource extends TileImageSource {
    @JsProperty(name = "TOS_ATTRIBUTION")
    public native Attribution TOS_ATTRIBUTION();

    @JsConstructor
    public BingMapsSource(BingMapsSourceOptions options) {}

    /**
     * Get the api key used for this source.
     * @return The api key.
     */
    @JsMethod
    public native String getApiKey();

    /**
     * Get the imagery set associated with this source.
     * @return The imagery set.
     */
    @JsMethod
    public native String getImagerySet();
}
