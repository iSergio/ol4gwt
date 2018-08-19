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
import org.openlayers.ol.ImageLoadFunctionType;
import org.openlayers.ol.proj.Projection;

/**
 * {@link org.openlayers.ol.source.ImageMapGuideSource} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ImageMapGuideSourceOptions extends ImageSourceOptions {
    /**
     * The mapagent url.
     */
    @JsProperty
    public String url;
    /**
     * The display resolution. Default is 96.
     */
    @JsProperty
    public double displayDpi;
    /**
     * The meters-per-unit value. Default is 1.
     */
    @JsProperty
    public double metersPerUnit;
    /**
     * Use the ol.Map#pixelRatio value when requesting the image from the remote server. Default is true.
     */
    @JsProperty
    public boolean hidpi;
    /**
     * If true, will use GETDYNAMICMAPOVERLAYIMAGE.
     */
    @JsProperty
    public boolean useOverlay;
    /**
     * Projection.
     */
    @JsProperty
    public Projection projection;
    /**
     * Ratio. 1 means image requests are the size of the map viewport, 2 means twice the width and height of the map viewport,
     * and so on. Must be 1 or higher. Default is 1.
     */
    @JsProperty
    public double ratio;
    /**
     * Resolutions. If specified, requests will be made for these resolutions only.
     */
    @JsProperty
    public double[] resolutions;
    /**
     * Optional function to load an image given a URL.
     */
    @JsProperty
    public ImageLoadFunctionType imageLoadFunction;
    /**
     * Additional parameters.
     */
    @JsProperty
    public Object params;

    @JsConstructor
    public ImageMapGuideSourceOptions() {}

}
