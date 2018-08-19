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
import org.openlayers.ol.events.RasterSourceEvent;
import org.openlayers.ol.source.options.RasterSourceOptions;

/**
 * A source that transforms data from any number of input sources using an array of ol.RasterOperation
 * functions to transform input pixel values into output pixel values.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.source", name = "Raster")
public class RasterSource extends ImageSource {
    @JsConstructor
    public RasterSource(RasterSourceOptions options) {
        super(options);
    }
//TODO: RasterOperation
//    /**
//     * Set the operation.
//     * @param operation New operation.
//     * @param lib Functions that will be available to operations run in a worker.
//     */
//    @JsMethod
//    public native void setOperation(RasterOperation operation, Object lib);

    @JsFunction
    public interface AfterOperationsListener {
        @JsOverlay
        String TYPE = "afteroperations";

        void function(RasterSourceEvent event);
    }

    @JsFunction
    public interface BeforeOperationsListener {
        @JsOverlay
        String TYPE = "beforeoperations";

        void function(RasterSourceEvent event);
    }
}
