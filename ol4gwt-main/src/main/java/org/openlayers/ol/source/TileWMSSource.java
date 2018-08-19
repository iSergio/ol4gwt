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
import jsinterop.annotations.JsType;
import org.openlayers.ol.Coordinate;
import org.openlayers.ol.proj.Projection;
import org.openlayers.ol.source.options.TileWMSSourceOptions;

/**
 * Layer source for tile data from WMS servers.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.source", name = "TileWMS")
public class TileWMSSource extends TileImageSource {
    @JsConstructor
    public TileWMSSource() {}

    @JsConstructor
    public TileWMSSource(TileWMSSourceOptions options) {}

    /**
     * Return the GetFeatureInfo URL for the passed coordinate, resolution, and projection. Return undefined if the
     * GetFeatureInfo URL cannot be constructed.
     * @param coordinate Coordinate.
     * @param resolution Resolution.
     * @param projection Projection.
     * @param params GetFeatureInfo params. INFO_FORMAT at least should be provided. If QUERY_LAYERS is not provided
     *               then the layers specified in the LAYERS parameter will be used. VERSION should not be specified here.
     * @return GetFeatureInfo URL.
     */
    @JsMethod
    public native String getGetFeatureInfoUrl(Coordinate coordinate, double resolution, String projection, Object params);

    /**
     * Return the GetFeatureInfo URL for the passed coordinate, resolution, and projection. Return undefined if the
     * GetFeatureInfo URL cannot be constructed.
     * @param coordinate Coordinate.
     * @param resolution Resolution.
     * @param projection Projection.
     * @param params GetFeatureInfo params. INFO_FORMAT at least should be provided. If QUERY_LAYERS is not provided
     *               then the layers specified in the LAYERS parameter will be used. VERSION should not be specified here.
     * @return GetFeatureInfo URL.
     */
    @JsMethod
    public native String getGetFeatureInfoUrl(Coordinate coordinate, double resolution, Projection projection, Object params);

    /**
     * Update the user-provided params.
     * @param params Params.
     */
    @JsMethod
    public native void updateParams(Object params);
}
