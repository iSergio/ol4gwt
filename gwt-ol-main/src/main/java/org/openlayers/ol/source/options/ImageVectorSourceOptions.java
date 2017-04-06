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

package org.openlayers.ol.source.options;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Attribution;
import org.openlayers.ol.proj.Projection;
import org.openlayers.ol.source.VectorSource;
import org.openlayers.olx.LogoOptions;

/**
 * {@link org.openlayers.ol.source.ImageVectorSource} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ImageVectorSourceOptions extends ImageSourceOptions {
    /**
     * Attributions.
     */
    @JsProperty
    public Attribution attributions;
    /**
     * Logo.
     */
    @JsProperty
    public String logo;
    /**
     * Logo.
     */
    @JsProperty(name = "logo")
    public LogoOptions logoOptions;
    /**
     * Projection.
     */
    @JsProperty
    public Projection projection;
    /**
     * Ratio. 1 means canvases are the size of the map viewport, 2 means twice the width and height of the map viewport,
     * and so on. Must be 1 or higher. Default is 1.5.
     */
    @JsProperty
    public double ratio;
    /**
     * The buffer around the viewport extent used by the renderer when getting features from the vector source for the
     * rendering or hit-detection. Recommended value: the size of the largest symbol, line width or label. Default is 100 pixels.
     */
    @JsProperty
    public double renderBuffer;
    /**
     * Resolutions. If specified, new canvases will be created for these resolutions only.
     */
    @JsProperty
    public double[] resolutions;
    /**
     * The vector source from which the vector features drawn in canvas elements are read. Required.
     */
    @JsProperty
    public VectorSource source;
//    TODO: Style
//    /**
//     * Style to use when rendering features to the canvas.
//     */
//    @JsProperty
//    public Style[] style;
//    //TODO: StyleFunction
//    /**
//     * Style to use when rendering features to the canvas.
//     */
//    @JsProperty(name = "style")
//    public StyleFunction styleFunction;

    @JsConstructor
    public ImageVectorSourceOptions() {}
}
