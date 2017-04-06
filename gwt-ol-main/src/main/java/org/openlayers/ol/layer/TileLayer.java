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

package org.openlayers.ol.layer;

import jsinterop.annotations.*;
import org.openlayers.ol.events.ObjectEvent;
import org.openlayers.ol.layer.options.TileLayerOptions;
import org.openlayers.ol.source.TileSource;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.layer", name = "Tile")
public class TileLayer extends Layer {
    @JsConstructor
    public TileLayer(TileLayerOptions options) {
        super(options);
    }

    /**
     * Return the level as number to which we will preload tiles up to.
     * @return The level to preload tiles up to.
     */
    @JsMethod
    public native int getPreload();

    /**
     * Whether we use interim tiles on error.
     * @return Use interim tiles on error.
     */
    @JsMethod
    public native int getUseInterimTilesOnError();

    /**
     * Set the level as number to which we will preload tiles up to.
     * @param preload The level to preload tiles up to.
     */
    @JsMethod
    public native void setPreload(int preload);

    /**
     * Set whether we use interim tiles on error.
     * @param useInterimTilesOnError Use interim tiles on error.
     */
    @JsMethod
    public native void setUseInterimTilesOnError(int useInterimTilesOnError);

    @JsFunction
    public interface ChangePreloadListener {
        @JsOverlay
        String TYPE = "change:preload";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }

    @JsFunction
    public interface UseInterimTilesOnErrorListener {
        @JsOverlay
        String TYPE = "change:useInterimTilesOnError";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }
}
