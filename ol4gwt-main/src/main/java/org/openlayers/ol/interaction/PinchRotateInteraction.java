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
import org.openlayers.ol.interaction.options.PinchRotateInteractionOptions;

/**
 * Allows the user to rotate the map by twisting with two fingers on a touch screen.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.interaction", name = "PinchRotate")
public class PinchRotateInteraction extends PointerInteraction {
    @JsConstructor
    public PinchRotateInteraction() {}

    @JsConstructor
    public PinchRotateInteraction(PinchRotateInteractionOptions options) {}

    /**
     * Create PinchRotateInteraction instance by options.
     * @param duration The duration of the animation in milliseconds. Default is 250.
     * @return PinchRotateInteraction instance.
     */
    @JsOverlay
    public static PinchRotateInteraction create(double duration) {
        PinchRotateInteractionOptions options = new PinchRotateInteractionOptions();
        options.duration = duration;
        return new PinchRotateInteraction(options);
    }

    /**
     * Create PinchRotateInteraction instance by options.
     * @param duration The duration of the animation in milliseconds. Default is 250.
     * @param threshold Minimal angle in radians to start a rotation. Default is 0.3.
     * @return PinchRotateInteraction instance.
     */
    @JsOverlay
    public static PinchRotateInteraction create(double duration, double threshold) {
        PinchRotateInteractionOptions options = new PinchRotateInteractionOptions();
        options.duration = duration;
        options.threshold = threshold;
        return new PinchRotateInteraction(options);
    }
}
