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
import org.openlayers.ol.ImageLoadFunctionType;
import org.openlayers.ol.events.ImageEvent;
import org.openlayers.ol.source.options.ImageArcGISRestSourceOptions;

/**
 * Source for data from ArcGIS Rest services providing single, untiled images. Useful when underlying map service has labels.
 *
 * If underlying map service is not using labels, take advantage of ol image caching and use {@link TileArcGISRestSource} data source.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.source", name = "ImageArcGISRest")
public class ImageArcGISRestSource extends ImageSource {
    @JsConstructor
    public ImageArcGISRestSource() {
        super(new ImageArcGISRestSourceOptions());
    }

    @JsConstructor
    public ImageArcGISRestSource(ImageArcGISRestSourceOptions options) {
        super(options);
    }

    /**
     * Return the image load function of the source.
     * @return The image load function.
     */
    @JsMethod
    public native ImageLoadFunctionType getImageLoadFunction();

    /**
     * Get the user-provided params, i.e. those passed to the constructor through the "params" option, and possibly
     * updated using the updateParams method.
     * @return Params.
     */
    @JsMethod
    public native Object getParams();

    /**
     * Return the URL used for this ArcGIS source.
     * @return URL.
     */
    @JsMethod
    public native String getUrl();

    /**
     * Set the image load function of the source.
     * @param imageLoadFunction Image load function.
     */
    @JsMethod
    public native void setImageLoadFunction(ImageLoadFunctionType imageLoadFunction);

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
     * Triggered when an image finishes loading.
     */
    @JsFunction
    public interface ImageLoadEndListener {
        @JsOverlay
        String TYPE = "imageloadend";

        void function(ImageEvent event);
    }

    /**
     * Triggered if image loading results in an error.
     */
    @JsFunction
    public interface ImageLoadErrorListener {
        @JsOverlay
        String TYPE = "imageloaderror";

        void function(ImageEvent event);
    }

    /**
     * Triggered when an image starts loading.
     */
    @JsFunction
    public interface ImageLoadStartListener {
        @JsOverlay
        String TYPE = "imageloadstart";

        void function(ImageEvent event);
    }
}
