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

package org.openlayers.ol.interaction;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Collection;
import org.openlayers.ol.Feature;
import org.openlayers.ol.events.MapBrowserEvent;
import org.openlayers.ol.interaction.options.SelectInteractionOptions;
import org.openlayers.ol.layer.VectorLayer;

import java.util.Map;

/**
 * Interaction for selecting vector features. By default, selected features are styled differently,
 * so this interaction can be used for visual highlighting, as well as selecting features for other actions,
 * such as modification or output. There are three ways of controlling which features are selected:
 * using the browser event as defined by the condition and optionally the toggle, add/remove, and multi options;
 * a layers filter; and a further feature filter using the filter option.
 *
 * Selected features are added to an internal unmanaged layer.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.interaction", name = "Select")
public class SelectInteraction extends Interaction {
    @JsConstructor
    public SelectInteraction() {}

    @JsConstructor
    public SelectInteraction(SelectInteractionOptions options) {}

    /**
     * Handles the map browser event and may change the selected state of features.
     * @param mapBrowserEvent Map browser event.
     * @return false to stop event propagation.
     */
    @JsMethod
    public static native boolean handleEvent(MapBrowserEvent mapBrowserEvent);

    /**
     * Get the selected features.
     * @return Features collection.
     */
    @JsMethod
    public native Collection<Feature> getFeatures();

    /**
     * Returns the Hit-detection tolerance.
     * @return Hit tolerance in pixels.
     */
    @JsMethod
    public native double getHitTolerance();

    /**
     * Returns the associated vectorlayer of the (last) selected feature. Note that this will not work with any
     * programmatic method like pushing features to collection.
     * @param feature eature
     * @return Layer.
     */
    @JsMethod
    public native VectorLayer getLayer(Feature feature);

    /**
     * Hit-detection tolerance. Pixels inside the radius around the given position will be checked for features.
     * This only works for the canvas renderer and not for WebGL.
     * @param hitTolerance Hit tolerance in pixels.
     */
    @JsMethod
    public native void setHitTolerance(double hitTolerance);

    /**
     * Remove the interaction from its current map, if any, and attach it to a new map, if any.
     * Pass null to just remove the interaction from the current map.
     * @param map  Map.
     */
    @JsMethod
    public native void setMap(Map map);
}
