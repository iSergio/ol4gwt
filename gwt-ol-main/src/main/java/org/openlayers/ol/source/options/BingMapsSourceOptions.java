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
 * {@link org.openlayers.ol.source.BingMapsSource} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class BingMapsSourceOptions extends UrlTileSourceOptions {
    /**
     * Cache size. Default is 2048.
     */
    @JsProperty
    public int cacheSize;
    /**
     * If true hidpi tiles will be requested. Default is false.
     */
    @JsProperty
    public boolean hidpi;
    /**
     * Culture code. Default is en-us.
     */
    @JsProperty
    public String culture;
    /**
     * Bing Maps API key. Get yours at http://www.bingmapsportal.com/. Required.
     */
    @JsProperty
    public String key;
    /**
     * Type of imagery. Required.
     */
    @JsProperty
    public String imagerySet;
    /**
     * Max zoom. Default is what's advertized by the BingMaps service (21 currently).
     */
    @JsProperty
    public int maxZoom;
    /**
     * Maximum allowed reprojection error (in pixels). Default is 0.5. Higher values can increase reprojection performance,
     * but decrease precision.
     */
    @JsProperty
    public double reprojectionErrorThreshold;
    //TODO: TileLoadFunctionType
    /**
     * Whether to wrap the world horizontally. Default is true.
     */
    @JsProperty
    public boolean wrapX;


    @JsConstructor
    public BingMapsSourceOptions() {}
}
