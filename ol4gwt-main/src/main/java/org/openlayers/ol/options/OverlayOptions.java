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

import com.google.gwt.dom.client.Element;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Coordinate;
import org.openlayers.olx.OverlayPanOptions;

/**
 * {@link org.openlayers.ol.Overlay} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class OverlayOptions {
    /**
     * Set the overlay id. The overlay id can be used with the {@link ol.Map#getOverlayById} method.
     */
    @JsProperty
    public String id;
    /**
     * The overlay element.
     */
    @JsProperty
    public Element element;
    /**
     * Offsets in pixels used when positioning the overlay. The first element in the array is the horizontal offset.
     * A positive value shifts the overlay right. The second element in the array is the vertical offset.
     * A positive value shifts the overlay down. Default is [0, 0].
     */
    @JsProperty
    public double[] offset;
    /**
     * The overlay position in map projection.
     */
    @JsProperty
    public Coordinate position;
    /**
     * Defines how the overlay is actually positioned with respect to its position property.
     * Possible values are 'bottom-left', 'bottom-center', 'bottom-right', 'center-left', 'center-center', 'center-right',
     * 'top-left', 'top-center', and 'top-right'. Default is 'top-left'.
     * {@link org.openlayers.ol.OverlayPositioning}
     */
    @JsProperty
    public String positioning;
    /**
     * Whether event propagation to the map viewport should be stopped. Default is true. If true the overlay is placed in
     * the same container as that of the controls (CSS class name ol-overlaycontainer-stopevent);
     * if false it is placed in the container with CSS class name ol-overlaycontainer.
     */
    @JsProperty
    public boolean stopEvent;
    /**
     * Whether the overlay is inserted first in the overlay container, or appended. Default is true. If the overlay is
     * placed in the same container as that of the controls (see the stopEvent option) you will probably set
     * insertFirst to true so the overlay is displayed below the controls.
     */
    @JsProperty
    public boolean insertFirst;
    /**
     * If set to true the map is panned when calling setPosition, so that the overlay is entirely visible in the current viewport.
     * The default is false.
     */
    @JsProperty
    public boolean autoPan;
    /**
     * The animation options used to pan the overlay into view. This animation is only used when autoPan is enabled.
     * A duration and easing may be provided to customize the animation.
     */
    @JsProperty
    public OverlayPanOptions autoPanAnimation;
    /**
     * The margin (in pixels) between the overlay and the borders of the map when autopanning. The default is 20.
     */
    @JsProperty
    public double autoPanMargin;

    @JsConstructor
    public OverlayOptions() {}
}
