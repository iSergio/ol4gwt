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
import org.openlayers.ol.interaction.options.MouseWheelZoomInteractionOptions;

/**
 * Allows the user to zoom the map by scrolling the mouse wheel.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.interaction", name = "MouseWheelZoom")
public class MouseWheelZoomInteraction extends Interaction {
    @JsConstructor
    public MouseWheelZoomInteraction() {}

    @JsConstructor
    public MouseWheelZoomInteraction(MouseWheelZoomInteractionOptions options) {}

    /**
     * Enable or disable using the mouse's location as an anchor when zooming
     * @param useAnchor true to zoom to the mouse's location, false to zoom to the center of the map
     */
    @JsMethod
    public native void setMouseAnchor(boolean useAnchor);
}
