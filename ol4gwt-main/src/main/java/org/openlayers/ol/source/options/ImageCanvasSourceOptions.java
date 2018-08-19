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
import org.openlayers.ol.CanvasFunctionType;
import org.openlayers.ol.proj.Projection;
import org.openlayers.ol.source.SourceState;
import org.openlayers.olx.LogoOptions;

/**
 * {@link org.openlayers.ol.source.ImageCanvasSource} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ImageCanvasSourceOptions extends ImageSourceOptions {
    /**
     * Attributions.
     */
    @JsProperty
    public Attribution attributions;

    /**
     * Canvas function. The function returning the canvas element used by the source as an image.
     * The arguments passed to the function are: {ol.Extent} the image extent, {number} the image resolution, {number}
     * the device pixel ratio, {ol.Size} the image size, and {ol.proj.Projection} the image projection.
     * The canvas returned by this function is cached by the source. If the value returned by the function is
     * later changed then dispatchChangeEvent should be called on the source for the source to invalidate the
     * current cached image. Required.
     */
    @JsProperty
    public CanvasFunctionType canvasFunction;
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
     * Resolutions. If specified, new canvases will be created for these resolutions only.
     */
    @JsProperty
    public double[] resolutions;
    /**
     * Source state. {@link SourceState}.
     */
    @JsProperty
    public String state;

    @JsConstructor
    public ImageCanvasSourceOptions() {}
}
