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
import org.openlayers.ol.interaction.options.PinchZoomInteractionOptions;

/**
 * Allows the user to zoom the map by pinching with two fingers on a touch screen.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.interaction", name = "PinchZoom")
public class PinchZoomInteraction extends PointerInteraction {
    @JsConstructor
    public PinchZoomInteraction() {}

    @JsConstructor
    public PinchZoomInteraction(PinchZoomInteractionOptions options) {}

    /**
     * Create PinchZoomInteraction instance by separated options.
     * @param duration Animation duration in milliseconds. Default is 400.
     * @return PinchZoomInteraction instance.
     */
    @JsOverlay
    public static PinchZoomInteraction create(double duration) {
        PinchZoomInteractionOptions options = new PinchZoomInteractionOptions();
        options.duration = duration;
        return new PinchZoomInteraction(options);
    }

    /**
     * Create PinchZoomInteraction instance by separated options.
     * @param duration Animation duration in milliseconds. Default is 400.
     * @param constrainResolution Zoom to the closest integer zoom level after the pinch gesture ends. Default is false.
     * @return PinchZoomInteraction instance.
     */
    @JsOverlay
    public static PinchZoomInteraction create(double duration, boolean constrainResolution) {
        PinchZoomInteractionOptions options = new PinchZoomInteractionOptions();
        options.duration = duration;
        options.constrainResolution = constrainResolution;
        return new PinchZoomInteraction(options);
    }
}
