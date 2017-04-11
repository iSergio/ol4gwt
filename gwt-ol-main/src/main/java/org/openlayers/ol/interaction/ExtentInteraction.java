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
import org.openlayers.ol.Extent;
import org.openlayers.ol.interaction.options.ExtentInteractionOptions;

/**
 * Allows the user to draw a vector box by clicking and dragging on the map. Once drawn, the vector box can be modified
 * by dragging its vertices or edges. This interaction is only supported for mouse devices.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.interaction", name = "Extent")
public class ExtentInteraction extends PointerInteraction {
    @JsConstructor
    public ExtentInteraction() {}

    @JsConstructor
    public ExtentInteraction(ExtentInteractionOptions options) {}

    /**
     * Returns the current drawn extent in the view projection
     * @return Drawn extent in the view projection.
     */
    @JsMethod
    public native Extent getExtent();

    /**
     * Manually sets the drawn extent, using the view projection.
     * @param extent Extent
     */
    @JsMethod
    public native void setExtent(Extent extent);
}
