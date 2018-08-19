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
import org.openlayers.ol.interaction.options.DragRotateInteractionOptions;

/**
 * Allows the user to rotate the map by clicking and dragging on the map, normally combined with an ol.events.condition
 * that limits it to when the alt and shift keys are held down.
 *
 * This interaction is only supported for mouse devices.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.interaction", name = "DragRotate")
public class DragRotateInteraction extends PointerInteraction {
    @JsConstructor
    public DragRotateInteraction() {}

    @JsConstructor
    public DragRotateInteraction(DragRotateInteractionOptions options) {}

    /**
     * Create {@link DragRotateInteraction} instance by separated options.
     * @param condition A function that takes an {@link org.openlayers.ol.events.MapBrowserEvent} and returns a boolean to indicate whether that event should be handled.
     *                  Default is {@link Condition#altShiftKeysOnly()}
     * @return DragRotate interaction.
     */
    @JsOverlay
    public static DragRotateInteraction create(EventsConditionType condition) {
        DragRotateInteractionOptions options = new DragRotateInteractionOptions();
        options.condition = condition;
        return new DragRotateInteraction();
    }

    /**
     * Create {@link DragRotateInteraction} instance by separated options.
     * @param condition A function that takes an {@link org.openlayers.ol.events.MapBrowserEvent} and returns a boolean to indicate whether that event should be handled.
     *                  Default is {@link Condition#altShiftKeysOnly()}
     * @param duration Animation duration in milliseconds. Default is 250.
     * @return DragRotate interaction.
     */
    @JsOverlay
    public static DragRotateInteraction create(EventsConditionType condition, double duration) {
        DragRotateInteractionOptions options = new DragRotateInteractionOptions();
        options.condition = condition;
        options.duration = duration;
        return new DragRotateInteraction();
    }
}
