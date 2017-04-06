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
import org.openlayers.ol.source.options.TileArcGISRestSourceOptions;

/**
 * Layer source for tile data from ArcGIS Rest services. Map and Image Services are supported.
 *
 * For cached ArcGIS services, better performance is available using the {@link XYZSource} data source.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.source", name = "TileArcGISRest")
public class TileArcGISRestSource extends TileImageSource {
    @JsConstructor
    public TileArcGISRestSource() {}

    @JsConstructor
    public TileArcGISRestSource(TileArcGISRestSourceOptions options) {}

    /**
     * Get the user-provided params, i.e. those passed to the constructor through the "params" option,
     * and possibly updated using the updateParams method.
     * @return Params.
     */
    @JsProperty
    public native Object getParams();

    /**
     * Update the user-provided params.
     * @param params Params.
     */
    @JsProperty
    public native void updateParams(Object params);
}
