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

package org.openlayers.ol.options;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Coordinate;
import org.openlayers.ol.Extent;
import org.openlayers.ol.proj.Projection;

/**
 * {@link org.openlayers.ol.View} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ViewOptions {
    /**
     * The initial center for the view. The coordinate system for the center is specified with the projection option.
     * Default is undefined, and layer sources will not be fetched if this is not set.
     */
    @JsProperty
    public Coordinate center;
    /**
     * Rotation constraint. false means no constraint. true means no constraint, but snap to zero near zero.
     * A number constrains the rotation to that number of values. For example, 4 will constrain the
     * rotation to 0, 90, 180, and 270 degrees. The default is true.
     */
    @JsProperty
    public double constrainRotation;
    /**
     * Enable rotation. Default is true. If false a rotation constraint that always sets the rotation to zero is used.
     * The constrainRotation option has no effect if enableRotation is false.
     */
    @JsProperty
    public boolean enableRotation;
    /**
     * The extent that constrains the center, in other words, center cannot be set outside this extent. Default is undefined.
     */
    @JsProperty
    public Extent extent;
    /**
     * The maximum resolution used to determine the resolution constraint. It is used together with minResolution (or maxZoom)
     * and zoomFactor. If unspecified it is calculated in such a way that the projection's validity extent fits in a 256x256 px tile.
     * If the projection is Spherical Mercator (the default) then maxResolution defaults to 40075016.68557849 / 256 = 156543.03392804097.
     */
    @JsProperty
    public double maxResolution;
    /**
     * The minimum resolution used to determine the resolution constraint. It is used together with maxResolution (or minZoom)
     * and zoomFactor. If unspecified it is calculated assuming 29 zoom levels (with a factor of 2). If the projection
     * is Spherical Mercator (the default) then minResolution
     * defaults to 40075016.68557849 / 256 / Math.pow(2, 28) = 0.0005831682455839253.
     */
    @JsProperty
    public double minResolution;
    /**
     * The maximum zoom level used to determine the resolution constraint. It is used together with minZoom
     * (or maxResolution) and zoomFactor. Default is 28. Note that if minResolution is also provided, it is given precedence over maxZoom.
     */
    @JsProperty
    public int maxZoom;
    /**
     * The minimum zoom level used to determine the resolution constraint. It is used together with maxZoom (or minResolution)
     * and zoomFactor. Default is 0. Note that if maxResolution is also provided, it is given precedence over minZoom.
     */
    @JsProperty
    public int minZoom;
    /**
     * The projection. Default is EPSG:3857 (Spherical Mercator).
     */
    @JsProperty
    public Projection projection;
    /**
     * The initial resolution for the view. The units are projection units per pixel (e.g. meters per pixel).
     * An alternative to setting this is to set zoom. Default is undefined, and layer sources will not be fetched
     * if neither this nor zoom are defined.
     */
    @JsProperty
    public double resolution;
    /**
     * Resolutions to determine the resolution constraint. If set the maxResolution, minResolution, minZoom, maxZoom,
     * and zoomFactor options are ignored.
     */
    @JsProperty
    public double[] resolutions;
    /**
     * The initial rotation for the view in radians (positive rotation clockwise). Default is 0.
     */
    @JsProperty
    public double rotation;
    /**
     * Only used if resolution is not defined. Zoom level used to calculate the initial resolution for the view.
     * The initial resolution is determined using the ol.View#constrainResolution method.
     */
    @JsProperty
    public int zoom;
    /**
     * The zoom factor used to determine the resolution constraint. Default is 2.
     */
    @JsProperty
    public double zoomFactor;

    @JsConstructor
    public ViewOptions() {}
}
