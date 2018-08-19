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

package org.openlayers.ol.style.options;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * {@link org.openlayers.ol.style.AtlasManagerStyle} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class AtlasManagerStyleOptions {
    /**
     * The size in pixels of the first atlas image. If no value is given the ol.INITIAL_ATLAS_SIZE compile-time constant will be used.
     */
    @JsProperty
    public double initialSize;
    /**
     * The maximum size in pixels of atlas images. If no value is given then the ol.MAX_ATLAS_SIZE compile-time constant will be used.
     * And if ol.MAX_ATLAS_SIZE is set to -1 (the default) then ol.WEBGL_MAX_TEXTURE_SIZE will used if WebGL is supported.
     * Otherwise 2048 is used.
     */
    @JsProperty
    public double maxSize;
    /**
     * The space in pixels between images (default: 1).
     */
    @JsProperty
    public double space;

    @JsConstructor
    public AtlasManagerStyleOptions() {}
}
