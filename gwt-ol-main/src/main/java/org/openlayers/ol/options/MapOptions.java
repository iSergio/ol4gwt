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
import org.openlayers.ol.Collection;
import org.openlayers.ol.Object;
import org.openlayers.ol.Overlay;
import org.openlayers.ol.View;
import org.openlayers.ol.control.Control;
import org.openlayers.ol.interaction.Interaction;
import org.openlayers.ol.layer.BaseLayer;
import org.openlayers.olx.LogoOptions;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class MapOptions {
    /**
     * Controls initially added to the map. If not specified, ol.control.defaults() is used.
     */
    @JsProperty
    public Control[] controls;
    /**
     * Controls initially added to the map. If not specified, ol.control.defaults() is used.
     */
    @JsProperty(name = "controls")
    public Collection<Control> controlCollection;
    /**
     * The ratio between physical pixels and device-independent pixels (dips) on the device.
     * If undefined then it gets set by using window.devicePixelRatio.
     */
    @JsProperty
    public double pixelRatio;
    /**
     * Interactions that are initially added to the map. If not specified, ol.interaction.defaults() is used.
     */
    @JsProperty
    public Interaction[] interactions;
    /**
     * Interactions that are initially added to the map. If not specified, ol.interaction.defaults() is used.
     */
    @JsProperty(name = "interactions")
    public Collection<Interaction> interactionCollection;
    /**
     * The element to listen to keyboard events on. This determines when the KeyboardPan and KeyboardZoom interactions trigger.
     * For example, if this option is set to document the keyboard interactions will always trigger.
     * If this option is not specified, the element the library listens to keyboard events on is the map target
     * (i.e. the user-provided div for the map). If this is not document the target element needs to be focused for
     * key events to be emitted, requiring that the target element has a tabindex attribute.
     */
    @JsProperty
    public Element keyboardEventTarget;
    /**
     * Layers. If this is not defined, a map with no layers will be rendered. Note that layers are rendered in the order
     * supplied, so if you want, for example, a vector layer to appear on top of a tile layer, it must come after the tile layer.
     */
    @JsProperty
    public Collection<BaseLayer> layers;
    /**
     * When set to true, tiles will be loaded during animations. This may improve the user experience, but can also make
     * animations stutter on devices with slow memory. Default is false.
     */
    @JsProperty
    public boolean loadTilesWhileAnimating;
    /**
     * When set to true, tiles will be loaded while interacting with the map. This may improve the user experience, but
     * can also make map panning and zooming choppy on devices with slow memory. Default is false.
     */
    @JsProperty
    public boolean loadTilesWhileInteracting;
    /**
     * The map logo. A logo to be displayed on the map at all times. If a string is provided, it will be set as the image
     * source of the logo. If an object is provided, the src property should be the URL for an image and the href property
     * should be a URL for creating a link. If an element is provided, the element will be used. To disable the map logo,
     * set the option to false. By default, the OpenLayers logo is shown.
     */
    @JsProperty
    public String logo;
    /**
     * The map logo. A logo to be displayed on the map at all times. If a string is provided, it will be set as the image
     * source of the logo. If an object is provided, the src property should be the URL for an image and the href property
     * should be a URL for creating a link. If an element is provided, the element will be used. To disable the map logo,
     * set the option to false. By default, the OpenLayers logo is shown.
     */
    @JsProperty(name = "logo")
    public boolean logoVisible;
    /**
     * The map logo. A logo to be displayed on the map at all times. If a string is provided, it will be set as the image
     * source of the logo. If an object is provided, the src property should be the URL for an image and the href property
     * should be a URL for creating a link. If an element is provided, the element will be used. To disable the map logo,
     * set the option to false. By default, the OpenLayers logo is shown.
     */
    @JsProperty(name = "logo")
    public Element logoElement;
    /**
     * The map logo. A logo to be displayed on the map at all times. If a string is provided, it will be set as the image
     * source of the logo. If an object is provided, the src property should be the URL for an image and the href property
     * should be a URL for creating a link. If an element is provided, the element will be used. To disable the map logo,
     * set the option to false. By default, the OpenLayers logo is shown.
     */
    @JsProperty(name = "logo")
    public LogoOptions logoOptions;
    /**
     * Overlays initially added to the map. By default, no overlays are added.
     */
    @JsProperty
    public Overlay[] overlays;
    /**
     * Overlays initially added to the map. By default, no overlays are added.
     */
    @JsProperty
    public Collection<Overlay> overlayCollection;
    /**
     * Renderer. By default, Canvas and WebGL renderers are tested for support in that order, and the first supported used.
     * Specify a ol.renderer.Type here to use a specific renderer. Note that the Canvas renderer fully supports vector data,
     * but WebGL can only render Point geometries.
     */
    @JsProperty
    public Object renderer;
    /**
     * The container for the map, either the element itself or the id of the element. If not specified at construction time,
     * ol.Map#setTarget must be called for the map to be rendered.
     */
    @JsProperty
    public Element target;
    /**
     * The map's view. No layer sources will be fetched unless this is specified at construction time or through ol.Map#setView.
     */
    @JsProperty
    public View view;

    @JsConstructor
    public MapOptions() {}
}
