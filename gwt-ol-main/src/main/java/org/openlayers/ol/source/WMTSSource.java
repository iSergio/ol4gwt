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
import org.openlayers.ol.source.options.WMTSSourceOptions;

/**
 * Layer source for tile data from WMTS servers.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class WMTSSource extends TileImageSource {
    @JsConstructor
    public WMTSSource(WMTSSourceOptions options) {}

    /**
     * Generate source options from a capabilities object.
     * @param wmtsCap An object representing the capabilities document.
     * @param config Configuration properties for the layer. Defaults for the layer will apply if not provided.
     * @return WMTS source options object.
     */
    @JsMethod
    public native WMTSSourceOptions optionsFromCapabilities(Object wmtsCap, Object config);

    /**
     * Get the dimensions, i.e. those passed to the constructor through the "dimensions" option, and possibly
     * updated using the updateDimensions method.
     * @return Dimensions.
     */
    @JsMethod
    public native Object getDimensions();

    /**
     * Return the image format of the WMTS source.
     * @return Format.
     */
    @JsMethod
    public native String getFormat();

    /**
     * Return the layer of the WMTS source.
     * @return Layer.
     */
    @JsMethod
    public native String getLayer();

    /**
     * Return the matrix set of the WMTS source.
     * @return MatrixSet.
     */
    @JsMethod
    public native String getMatrixSet();

    /**
     * Return the request encoding, either "KVP" or "REST".
     * @return Request encoding.
     */
    @JsMethod
    public native String getRequestEncoding();

    /**
     * Return the style of the WMTS source.
     * @return Style.
     */
    @JsMethod
    public native String getStyle();

    /**
     * Return the version of the WMTS source.
     * @return Version.
     */
    @JsMethod
    public native String getVersion();

    /**
     * Update the dimensions.
     * @param dimensions Dimensions.
     */
    @JsMethod
    public native void updateDimensions(Object dimensions);
}
