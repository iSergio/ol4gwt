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
 * {@link org.openlayers.ol.source.ImageArcGISRestSource} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ImageArcGISRestSourceOptions extends ImageSourceOptions {
    /**
     * Attributions.
     */
    @JsProperty
    public Attribution[] attributions;
    /**
     * The crossOrigin attribute for loaded images. Note that you must provide a crossOrigin value if you are using the
     * WebGL renderer or if you want to access pixel data with the Canvas renderer.
     * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
     */
    @JsProperty
    public String crossOrigin;
    /**
     * Use the {@link org.openlayers.ol.Map#pixelRatio} value when requesting the image from the remote server.
     * Default is true.
     */
    @JsProperty
    public boolean hidpi;
    /**
     * Logo.
     */
    @JsProperty
    public String logo;
    /**
     * Logo.
     */
    @JsProperty
    public LogoOptions logoOptions;
    /**
     * Optional function to load an image given a URL.
     */
    @JsProperty
    public ImageLoadFunctionType imageLoadFunction;
    /**
     * ArcGIS Rest parameters. This field is optional. Service defaults will be used for any fields not specified.
     * FORMAT is PNG32 by default. F is IMAGE by default. TRANSPARENT is true by default. BBOX,SIZE,BBOXSR, andIMAGESRwill
     * be set dynamically. SetLAYERS` to override the default service layer visibility.
     * See http://resources.arcgis.com/en/help/arcgis-rest-api/index.html#/Export_Map/02r3000000v7000000/ for further reference.
     */
    @JsProperty
    public Object params;
    /**
     * Projection.
     */
    @JsProperty
    public Projection projection;
    /**
     * Ratio. 1 means image requests are the size of the map viewport, 2 means twice the size of the map viewport, and so on.
     * Default is 1.5.
     */
    @JsProperty
    public double ratio;
    /**
     * Resolutions. If specified, requests will be made for these resolutions only.
     */
    @JsProperty
    public double[] resolutions;
    /**
     * ArcGIS Rest service URL for a Map Service or Image Service. The url should include /MapServer or /ImageServer.
     */
    @JsProperty
    public String url;

    @JsConstructor
    public ImageArcGISRestSourceOptions() {}
}
