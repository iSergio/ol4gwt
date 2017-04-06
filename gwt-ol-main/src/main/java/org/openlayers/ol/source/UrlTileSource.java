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

import jsinterop.annotations.*;
import org.openlayers.ol.events.TileSourceEvent;
import org.openlayers.ol.source.options.UrlTileSourceOptions;

/**
 * Base class for sources providing tiles divided into a tile grid over http.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.source", name = "UrlTile")
public class UrlTileSource extends TileSource {
    @JsConstructor
    protected UrlTileSource() {}

    @JsConstructor
    public UrlTileSource(UrlTileSourceOptions options) {}

// TODO: TileLoadFunctionType, TileUrlFunctionType
//    TileLoadFunctionType getTileLoadFunction();
//    TileUrlFunctionType getTileUrlFunction();

    /**
     * Return the URLs used for this source. When a tileUrlFunction is used instead of url or urls, null will be returned.
     * @return URLs.
     */
    @JsMethod
    public native String[] getUrls();

// TODO: setTileLoadFunction, setTileUrlFunction
//    setTileLoadFunction(tileLoadFunction)
//    setTileUrlFunction(tileUrlFunction, opt_key)


    /**
     * Set the URL to use for requests.
     * @param url URL.
     */
    @JsMethod
    public native void setUrl(String url);

    /**
     * Set the URLs to use for requests.
     * @param urls URLs.
     */
    @JsMethod
    public native void setUrls(String[] urls);

    @JsFunction
    public interface TileLoadStartListener {
        @JsOverlay
        String TYPE = "tileloadstart";

        void function(TileSourceEvent event);
    }

    @JsFunction
    public interface TileLoadEndListener {
        @JsOverlay
        String TYPE = "tileloadend";

        void function(TileSourceEvent event);
    }

    @JsFunction
    public interface TileLoadErrorListener {
        @JsOverlay
        String TYPE = "tileloaderror";

        void function(TileSourceEvent event);
    }
}
