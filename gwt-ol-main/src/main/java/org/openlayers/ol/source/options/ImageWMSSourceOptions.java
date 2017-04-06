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
import org.openlayers.ol.ImageLoadFunctionType;
import org.openlayers.ol.proj.Projection;
import org.openlayers.olx.LogoOptions;

/**
 * {@link org.openlayers.ol.source.ImageWMSSource} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ImageWMSSourceOptions extends ImageSourceOptions {
    /**
     * Attributions.
     */
    @JsProperty
    public Attribution attributions;
    /**
     * The crossOrigin attribute for loaded images. Note that you must provide a crossOrigin value if you are using the
     * WebGL renderer or if you want to access pixel data with the Canvas renderer.
     * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
     */
    @JsProperty
    public String crossOrigin;
    /**
     * Use the ol.Map#pixelRatio value when requesting the image from the remote server. Default is true.
     */
    @JsProperty
    public boolean hidpi;
    /**
     * The type of the remote WMS server: mapserver, geoserver or qgis. Only needed if hidpi is true. Default is undefined.
     * {@link org.openlayers.ol.source.WMSServerType}
     */
    @JsProperty
    public String serverType;
    /**
     * Optional function to load an image given a URL.
     */
    @JsProperty
    public ImageLoadFunctionType imageLoadFunction;
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
     * WMS request parameters. At least a LAYERS param is required. STYLES is '' by default. VERSION is 1.3.0 by default.
     * WIDTH, HEIGHT, BBOX and CRS (SRS for WMS version < 1.3.0) will be set dynamically. Required.
     */
    @JsProperty
    public Object params;
    /**
     * Projection.
     */
    @JsProperty
    public Projection projection;
    /**
     * Ratio. 1 means image requests are the size of the map viewport, 2 means twice the width and height of the map
     * viewport, and so on. Must be 1 or higher. Default is 1.5.
     */
    @JsProperty
    public double ratio;
    /**
     * Resolutions. If specified, requests will be made for these resolutions only.
     */
    @JsProperty
    public double[] resolutions;
    /**
     * WMS service URL.
     */
    @JsProperty
    public String url;

    @JsConstructor
    public ImageWMSSourceOptions() {}
}
