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
import org.openlayers.ol.Coordinate;
import org.openlayers.ol.ImageLoadFunctionType;
import org.openlayers.ol.events.ImageEvent;
import org.openlayers.ol.proj.Projection;
import org.openlayers.ol.source.options.ImageWMSSourceOptions;

/**
 * Source for WMS servers providing single, untiled images.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.source", name = "ImageWMS")
public class ImageWMSSource extends ImageSource {
    @JsConstructor
    public ImageWMSSource() {
        super(new ImageWMSSourceOptions());
    }
    @JsConstructor
    public ImageWMSSource(ImageWMSSourceOptions options) {
        super(options);
    }

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
     * Return the image load function of the source.
     * @return The image load function.
     */
    @JsMethod
    public native ImageLoadFunctionType getImageLoadFunction();

    /**
     * Get the user-provided params, i.e. those passed to the constructor through the "params" option,
     * and possibly updated using the updateParams method.
     * @return Params.
     */
    @JsMethod
    public native Object getParams();

    /**
     * Return the URL used for this WMS source.
     * @return URL.
     */
    @JsMethod
    public native String getUrl();

    /**
     * Set the URL to use for requests.
     * @param url URL.
     */
    @JsMethod
    public native void setUrl(String url);

    /**
     * Update the user-provided params.
     * @param params Params.
     */
    @JsMethod
    public native void updateParams(Object params);

    /**
     * Set the image load function of the source.
     * @param imageLoadFunction Image load function.
     */
    @JsMethod
    public native void setImageLoadFunction(ImageLoadFunctionType imageLoadFunction);

    @JsFunction
    public interface ImageLoadEndListener {
        @JsOverlay
        String TYPE = "imageloadend";

        void function(ImageEvent event);
    }

    @JsFunction
    public interface ImageLoadErrorListener {
        @JsOverlay
        String TYPE = "imageloaderror";

        void function(ImageEvent event);
    }

    @JsFunction
    public interface ImageLoadStartListener {
        @JsOverlay
        String TYPE = "imageloadstart";

        void function(ImageEvent event);
    }
}
