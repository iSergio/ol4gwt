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
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Coordinate;
import org.openlayers.ol.source.options.TileUTFGridSourceOptions;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.source", name = "TileUTFGrid")
public class TileUTFGridSource extends TileSource {
    @JsConstructor
    public TileUTFGridSource(TileUTFGridSourceOptions options) {}

    /**
     * Calls the callback (synchronously by default) with the available data for given coordinate and resolution
     * (or null if not yet loaded or in case of an error).
     * @param coordinate Coordinate.
     * @param resolution Resolution.
     * @param callback Callback.
     */
    @JsMethod
    public native void forDataAtCoordinateAndResolution(Coordinate coordinate, double resolution, DataAtCoordinateAndResolutionCallback callback);

    /**
     * Calls the callback (synchronously by default) with the available data for given coordinate and resolution
     * (or null if not yet loaded or in case of an error).
     * @param coordinate Coordinate.
     * @param resolution Resolution.
     * @param callback Callback.
     * @param t The object to use as this in the callback
     */
    @JsMethod
    public native void forDataAtCoordinateAndResolution(Coordinate coordinate, double resolution, DataAtCoordinateAndResolutionCallback callback, Object t);

    /**
     * Calls the callback (synchronously by default) with the available data for given coordinate and resolution
     * (or null if not yet loaded or in case of an error).
     * @param coordinate Coordinate.
     * @param resolution Resolution.
     * @param callback Callback.
     * @param t The object to use as this in the callback
     * @param request If true the callback is always async. The tile data is requested if not yet loaded.
     */
    @JsMethod
    public native void forDataAtCoordinateAndResolution(Coordinate coordinate, double resolution, DataAtCoordinateAndResolutionCallback callback, Object t, boolean request);

    /**
     * Return the template from TileJSON.
     * @return The template from TileJSON.
     */
    @JsMethod
    public native String getTemplate();

    @JsFunction
    public interface DataAtCoordinateAndResolutionCallback {
        void function();
    }
}
