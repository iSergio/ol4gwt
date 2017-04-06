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

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Render mode for vector tiles
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.layer", name = "VectorTileRenderType")
public class VectorTileRenderType {
    /**
     * Vector tiles are rendered as images. Great performance, but point symbols and texts are always rotated with the
     * view and pixels are scaled during zoom animations.
     */
    @JsProperty(name = "IMAGE")
    public static native String IMAGE();
    /**
     * Polygon and line elements are rendered as images, so pixels are scaled during zoom animations.
     * Point symbols and texts are accurately rendered as vectors and can stay upright on rotated views.
     */
    @JsProperty(name = "IMAGE")
    public static native String HYBRID();
    /**
     * Vector tiles are rendered as vectors. Most accurate rendering even during animations, but slower performance
     * than the other options.
     */
    @JsProperty(name = "IMAGE")
    public static native String VECTOR();

    @JsConstructor
    private VectorTileRenderType() {}
}
