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

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * {@link org.openlayers.ol.source.TileUTFGridSource} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class TileUTFGridSourceOptions extends TileSourceOptions {
    /**
     * Use JSONP with callback to load the TileJSON. Useful when the server does not support CORS. Default is false.
     */
    @JsProperty
    public boolean jsonp;
    /**
     * If true the TileUTFGrid source loads the tiles based on their "visibility". This improves the speed of response,
     * but increases traffic. Note that if set to false, you need to pass true as
     * opt_request to the forDataAtCoordinateAndResolution method otherwise no data will ever be loaded. Default is true.
     */
    @JsProperty
    public boolean preemptive;
    /**
     * TileJSON configuration for this source. If not provided, url must be configured.
     */
    @JsProperty
    public Object tileJSON;
    /**
     * TileJSON endpoint that provides the configuration for this source. Request will be made through JSONP. If not provided, tileJSON must be configured.
     */
    @JsProperty
    public String url;

    @JsConstructor
    public TileUTFGridSourceOptions() {}
}
