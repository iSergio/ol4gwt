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
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import org.openlayers.ol.EventsConditionType;
import org.openlayers.ol.events.Condition;
import org.openlayers.ol.interaction.options.DragRotateAndZoomInteractionOptions;

/**
 * Allows the user to zoom and rotate the map by clicking and dragging on the map. By default, this interaction is
 * limited to when the shift key is held down.
 *
 * This interaction is only supported for mouse devices.
 *
 * And this interaction is not included in the default interactions.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.interaction", name = "DragRotateAndZoom")
public class DragRotateAndZoomInteraction extends PointerInteraction {
    @JsConstructor
    public DragRotateAndZoomInteraction() {}

    @JsConstructor
    public DragRotateAndZoomInteraction(DragRotateAndZoomInteractionOptions options) {}

    /**
     * Create {@link DragRotateAndZoomInteraction} instance by separated options.
     * @param condition A function that takes an {@link org.openlayers.ol.events.MapBrowserEvent} and returns a boolean to indicate whether that event should be handled.
     *                  Default is {@link Condition#shiftKeyOnly()} ()}
     * @return DragRotate interaction.
     */
    @JsOverlay
    public static DragRotateAndZoomInteraction create(EventsConditionType condition) {
        DragRotateAndZoomInteractionOptions options = new DragRotateAndZoomInteractionOptions();
        options.condition = condition;
        return new DragRotateAndZoomInteraction();
    }

    /**
     * Create {@link DragRotateAndZoomInteraction} instance by separated options.
     * @param condition A function that takes an {@link org.openlayers.ol.events.MapBrowserEvent} and returns a boolean to indicate whether that event should be handled.
     *                  Default is {@link Condition#shiftKeyOnly()} ()}
     * @param duration Animation duration in milliseconds. Default is 400.
     * @return DragRotate interaction.
     */
    @JsOverlay
    public static DragRotateAndZoomInteraction create(EventsConditionType condition, double duration) {
        DragRotateAndZoomInteractionOptions options = new DragRotateAndZoomInteractionOptions();
        options.condition = condition;
        options.duration = duration;
        return new DragRotateAndZoomInteraction();
    }
}
