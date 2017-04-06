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

package org.openlayers.ol.layer.options;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Extent;

/**
 * {@link org.openlayers.ol.layer.BaseLayer} options.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class BaseLayerOptions {
    /**
     * Opacity (0, 1). Default is 1.
     */
    @JsProperty
    public float opacity;
    /**
     * Visibility. Default is true.
     */
    @JsProperty
    public boolean visible;
    /**
     * The bounding extent for layer rendering. The layer will not be rendered outside of this extent.
     */
    @JsProperty
    public Extent extent;
    /**
     * The z-index for layer rendering. At rendering time, the layers will be ordered, first by Z-index and then by position.
     * The default Z-index is 0.
     */
    @JsProperty
    public int zIndex;
    /**
     * The minimum resolution (inclusive) at which this layer will be visible.
     */
    @JsProperty
    public double minResolution;
    /**
     * The maximum resolution (exclusive) below which this layer will be visible.
     */
    @JsProperty
    public double maxResolution;

    @JsConstructor
    public BaseLayerOptions() {}
}
