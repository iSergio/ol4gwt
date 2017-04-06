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

package org.openlayers.ol;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.Event;
import jsinterop.annotations.*;
import org.openlayers.ol.control.Control;
import org.openlayers.ol.events.ObjectEvent;
import org.openlayers.ol.interaction.Interaction;
import org.openlayers.ol.layer.BaseLayer;
import org.openlayers.ol.layer.LayerGroup;
import org.openlayers.ol.options.MapOptions;

/**
 * The map is the core component of OpenLayers.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol", name = "Map")
public class Map extends Object {
    @JsConstructor
    public Map(MapOptions options) {}

    /**
     * Add the given control to the map.
     * @param control Control.
     */
    @JsMethod
    public native void addControl(Control control);

    /**
     * Add the given interaction to the map.
     * @param interaction Interaction to add.
     */
    @JsMethod
    public native void addInteraction(Interaction interaction);

    /**
     * Adds the given layer to the top of this map. If you want to add a layer elsewhere in the stack, use getLayers()
     * and the methods available on ol.Collection.
     * @param layer Layer.
     */
    @JsMethod
    public native void addLayer(BaseLayer layer);

    /**
     * Add the given overlay to the map.
     * @param overlay Overlay.
     */
    @JsMethod
    public native void addOverlay(Overlay overlay);

    /**
     * Detect features that intersect a pixel on the viewport, and execute a callback with each intersecting feature.
     * Layers included in the detection can be configured through opt_layerFilter.
     * @param pixel Pixel.
     * @param callback Feature callback. The callback will be called with two arguments. The first argument is one feature or
     *                 render feature at the pixel, the second is the layer of the feature and will be null for
     *                 unmanaged layers. To stop detection, callback functions can return a truthy value.
     */
    @JsMethod
    public native void forEachFeatureAtPixel(Pixel pixel, EachFeatureAtPixelCallback callback);

    //TODO :forEachLayerAtPixel

    /**
     * Get the map controls. Modifying this collection changes the controls associated with the map.
     * @return Controls.
     */
    @JsMethod
    public native Collection<Control> getControls();

    /**
     * Get the coordinate for a given pixel. This returns a coordinate in the map view projection.
     * @param pixel Pixel position in the map viewport.
     * @return The coordinate for the pixel position.
     */
    @JsMethod
    public native Coordinate getCoordinateFromPixel(Pixel pixel);

    /**
     * Returns the coordinate in view projection for a browser event.
     * @param event Event.
     * @return Coordinate.
     */
    @JsMethod
    public native Coordinate getEventCoordinate(Event event);

    /**
     * Returns the map pixel position for a browser event relative to the viewport.
     * @param event Event.
     * @return Pixel.
     */
    @JsMethod
    public native Pixel getEventPixel(Event event);

    /**
     * Get the map interactions. Modifying this collection changes the interactions associated with the map.
     * Interactions are used for e.g. pan, zoom and rotate.
     * @return Interactions.
     */
    @JsMethod
    public native Collection<Interaction> getInteractions();

    /**
     * Get the layergroup associated with this map.
     * @return A layer group containing the layers in this map.
     */
    @JsMethod
    public native LayerGroup getLayerGroup();

    /**
     * Get the collection of layers associated with this map.
     * @return Layers.
     */
    @JsMethod
    public native Collection<BaseLayer> getLayers();

    /**
     * Get an overlay by its identifier (the value returned by overlay.getId()). Note that the index treats string and
     * numeric identifiers as the same. So map.getOverlayById(2) will return an overlay with id '2' or 2.
     * @param id Overlay identifier.
     * @return Overlay.
     */
    @JsMethod
    public native Overlay getOverlayById(String id);

    /**
     * Get the map overlays. Modifying this collection changes the overlays associated with the map.
     * @return Overlays.
     */
    @JsMethod
    public native Collection<Overlay> getOverlays();

    /**
     * Get the pixel for a coordinate. This takes a coordinate in the map view projection and returns the corresponding pixel.
     * @param coordinate A map coordinate.
     * @return A pixel position in the map viewport.
     */
    @JsMethod
    public native Pixel getPixelFromCoordinate(Coordinate coordinate);

    /**
     * Get the size of this map.
     * @return The size in pixels of the map in the DOM.
     */
    @JsMethod
    public native Size getSize();

    /**
     * Get the target in which this map is rendered. Note that this returns what is entered as an option or in setTarget:
     * if that was an element, it returns an element; if a string, it returns that.
     * @return The Element or id of the Element that the map is rendered in.
     */
    @JsMethod
    public native Element getTarget();

    /**
     * Get the DOM element into which this map is rendered. In contrast to getTarget this method always return an Element,
     * or null if the map has no target.
     * @return The element that the map is rendered in.
     */
    @JsMethod
    public native Element getTargetElement();

    /**
     * Get the view associated with this map. A view manages properties such as center and resolution.
     * @return The view that controls this map.
     */
    @JsMethod
    public native View getView();

    /**
     * Get the element that serves as the map viewport.
     * @return Viewport.
     */
    @JsMethod
    public native Element getViewport();

    /**
     * Detect if features intersect a pixel on the viewport. Layers included in the detection can be configured through opt_layerFilter.
     * @param pixel Pixel.
     * @return Is there a feature at the given pixel?
     */
    //TODO: opt_options for hasFeatureAtPixel
    @JsMethod
    public native boolean hasFeatureAtPixel(Pixel pixel);

    /**
     * Remove the given control from the map.
     * @param control Control.
     * @return The removed control (or undefined if the control was not found).
     */
    @JsMethod
    public native Control removeControl(Control control);

    /**
     * Remove the given interaction from the map.
     * @param interaction Interaction to remove.
     * @return The removed interaction (or undefined if the interaction was not found).
     */
    @JsMethod
    public native Interaction removeInteraction(Interaction interaction);

    /**
     * Removes the given layer from the map.
     * @param layer Layer.
     * @return The removed layer (or undefined if the layer was not found).
     */
    @JsMethod
    public native BaseLayer removeLayer(BaseLayer layer);

    /**
     * Remove the given overlay from the map.
     * @param overlay Overlay.
     * @return The removed overlay (or undefined if the overlay was not found).
     */
    @JsMethod
    public native Overlay removeOverlay(Overlay overlay);

    /**
     * Request a map rendering (at the next animation frame).
     */
    @JsMethod
    public native void render();

    /**
     * Requests an immediate render in a synchronous manner.
     */
    @JsMethod
    public native void renderSync();

    /**
     * Sets the layergroup of this map.
     * @param layerGroup A layer group containing the layers in this map.
     */
    @JsMethod
    public native void setLayerGroup(LayerGroup layerGroup);

    /**
     * Set the size of this map.
     * @param size The size in pixels of the map in the DOM.
     */
    @JsMethod
    public native void setSize(Size size);

    /**
     * Set the target element to render this map into.
     * @param target The Element or id of the Element that the map is rendered in.
     */
    @JsMethod
    public native void setTarget(Element target);

    /**
     * Set the view for this map.
     * @param view The view that controls this map.
     */
    @JsMethod
    public native void setView(View view);

    /**
     * Force a recalculation of the map viewport size. This should be called when third-party code changes the size of the map viewport.
     */
    @JsMethod
    public native void updateSize();

    @JsFunction
    public interface ChangeLayerGroupListener {
        @JsOverlay
        String TYPE = "change:layerGroup";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }

    @JsFunction
    public interface ChangeSizeListener {
        @JsOverlay
        String TYPE = "change:size";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }

    @JsFunction
    public interface ChangeTargetListener {
        @JsOverlay
        String TYPE = "change:target";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }

    @JsFunction
    public interface ChangeViewListener {
        @JsOverlay
        String TYPE = "change:view";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }

    @JsFunction
    public interface EachFeatureAtPixelCallback {
        boolean function(Feature feature, BaseLayer layer);
    }
}
