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
import org.openlayers.ol.source.options.ImageMapGuideSourceOptions;

/**
 * Source for images from Mapguide servers
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.source", name = "ImageMapGuide")
public class ImageMapGuideSource extends ImageSource {
    @JsConstructor
    public ImageMapGuideSource(ImageMapGuideSourceOptions options) {
        super(options);
    }

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
     * Set the image load function of the MapGuide source.
     * @param imageLoadFunction Image load function.
     */
    @JsMethod
    public native void setImageLoadFunction(ImageLoadFunctionType imageLoadFunction);

    /**
     * Update the user-provided params.
     * @param params Params.
     */
    @JsMethod
    public native void updateParams(Object params);

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
