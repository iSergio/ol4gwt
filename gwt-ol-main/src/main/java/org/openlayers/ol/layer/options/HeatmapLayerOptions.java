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
import org.openlayers.ol.source.VectorSource;

/**
 * {@link org.openlayers.ol.layer.HeatmapLayer} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "object")
public class HeatmapLayerOptions {
    /**
     * The color gradient of the heatmap, specified as an array of CSS color strings.
     * Default is ['#00f', '#0ff', '#0f0', '#ff0', '#f00'].
     */
    @JsProperty
    public String[] gradient;
    /**
     * Radius size in pixels. Default is 8.
     */
    @JsProperty
    public double radius;
    /**
     * Blur size in pixels. Default is 15.
     */
    @JsProperty
    public double blur;
    /**
     * Shadow size in pixels. Default is 250.
     */
    @JsProperty
    public double shadow;
    /**
     * The feature attribute to use for the weight or a function that returns a weight from a feature.
     * Weight values should range from 0 to 1 (and values outside will be clamped to that range). Default is weight. Required.
     */
    @JsProperty
    public String weight;
    /**
     * The bounding extent for layer rendering. The layer will not be rendered outside of this extent.
     */
    @JsProperty
    public Extent extent;
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
    /**
     * Opacity. 0-1. Default is 1.
     */
    @JsProperty
    public double opacity;
    /**
     * Source. Required.
     */
    @JsProperty
    public VectorSource source;
    /**
     * Visibility. Default is true (visible).
     */
    @JsProperty
    public boolean visible;

    @JsConstructor
    public HeatmapLayerOptions() {}
}
