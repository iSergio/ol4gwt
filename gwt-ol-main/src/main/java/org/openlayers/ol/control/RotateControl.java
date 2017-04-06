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
import org.openlayers.ol.control.options.RotateControlOptions;
import org.openlayers.ol.events.MapEvent;

/**
 * A button control to reset rotation to 0. To style this control use css selector .ol-rotate.
 * A .ol-hidden css selector is added to the button when the rotation is 0.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.control", name = "Rotate")
public class RotateControl extends Control {
    @JsConstructor
    public RotateControl() {
        super(new RotateControlOptions());
    }

    @JsConstructor
    public RotateControl(RotateControlOptions options) {
        super(options);
    }

    /**
     * Update the rotate control element.
     * @param mapEvent Map event.
     */
    @JsMethod
    public static native void render(MapEvent mapEvent);
}
