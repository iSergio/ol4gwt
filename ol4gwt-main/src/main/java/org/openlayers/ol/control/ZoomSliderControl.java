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

package org.openlayers.ol.control;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.control.options.ZoomSliderControlOptions;
import org.openlayers.ol.events.MapEvent;

/**
 * A slider type of control for zooming.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.control", name = "ZoomSlider")
public class ZoomSliderControl extends Control {
    @JsConstructor
    public ZoomSliderControl() {
        super(new ZoomSliderControlOptions());
    }

    @JsConstructor
    public ZoomSliderControl(ZoomSliderControlOptions options) {
        super(options);
    }

    /**
     * Update the zoomslider element.
     * @param mapEvent Map event.
     */
    @JsMethod
    public static native void render(MapEvent mapEvent);
}
