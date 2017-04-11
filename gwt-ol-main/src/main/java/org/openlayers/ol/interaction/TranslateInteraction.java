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
import org.openlayers.ol.interaction.options.TranslateInteractionOptions;

/**
 * Interaction for translating (moving) features.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.interaction", name = "Translate")
public class TranslateInteraction extends PointerInteraction {
    @JsConstructor
    public TranslateInteraction() {}

    @JsConstructor
    public TranslateInteraction(TranslateInteractionOptions options) {}

    /**
     * Returns the Hit-detection tolerance.
     * @return Hit tolerance in pixels.
     */
    @JsMethod
    public native double getHitTolerance();

    /**
     * Hit-detection tolerance. Pixels inside the radius around the given position will be checked for features.
     * This only works for the canvas renderer and not for WebGL.
     * @param hitTolerance Hit tolerance in pixels.
     */
    @JsMethod
    public native void setHitTolerance(double hitTolerance);
}
