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
import org.openlayers.ol.Kinetic;
import org.openlayers.ol.events.Condition;
import org.openlayers.ol.interaction.options.DragPanInteractionOptions;

/**
 * Allows the user to pan the map by dragging the map.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.interaction", name = "DragPan")
public class DragPanInteraction extends PointerInteraction {
    @JsConstructor
    public DragPanInteraction() {}

    @JsConstructor
    public DragPanInteraction(DragPanInteractionOptions options) {}

    /**
     *
     * @param condition A function that takes an {@link org.openlayers.ol.events.MapBrowserEvent} and returns a boolean
     *                  to indicate whether that event should be handled. Default is {@link Condition#noModifierKeys()}.
     * @return DragPan interaction.
     */
    @JsOverlay
    public static DragPanInteraction create(EventsConditionType condition) {
        DragPanInteractionOptions options = new DragPanInteractionOptions();
        options.condition = condition;
        return new DragPanInteraction(options);
    }

    /**
     *
     * @param condition A function that takes an {@link org.openlayers.ol.events.MapBrowserEvent} and returns a boolean
     *                  to indicate whether that event should be handled. Default is {@link Condition#noModifierKeys()}.
     * @param kinetic Kinetic inertia to apply to the pan.
     * @return DragPan interaction.
     */
    @JsOverlay
    public static DragPanInteraction create(EventsConditionType condition, Kinetic kinetic) {
        DragPanInteractionOptions options = new DragPanInteractionOptions();
        options.condition = condition;
        options.kinetic = kinetic;
        return new DragPanInteraction(options);
    }
}
