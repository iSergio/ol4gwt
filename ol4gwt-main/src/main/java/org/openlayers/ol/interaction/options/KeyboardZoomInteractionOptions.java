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

package org.openlayers.ol.interaction.options;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.EventsConditionType;

/**
 * {@link org.openlayers.ol.interaction.KeyboardZoomInteraction} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class KeyboardZoomInteractionOptions {
    /**
     * Animation duration in milliseconds. Default is 100.
     */
    @JsProperty
    public double duration;
    /**
     * A function that takes an ol.MapBrowserEvent and returns a boolean to indicate whether that event should be handled.
     * Default is ol.events.condition.targetNotEditable.
     */
    @JsProperty
    public EventsConditionType condition;
    /**
     * The amount to zoom on each key press. Default is 1.
     */
    @JsProperty
    public double delta;

    @JsConstructor
    public KeyboardZoomInteractionOptions() {}
}
