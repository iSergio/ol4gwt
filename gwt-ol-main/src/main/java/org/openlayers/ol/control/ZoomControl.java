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
import jsinterop.annotations.JsType;
import org.openlayers.ol.control.options.ZoomControlOptions;

/**
 * A control with 2 buttons, one for zoom in and one for zoom out. This control is one of the default controls of a map.
 * To style this control use css selectors .ol-zoom-in and .ol-zoom-out.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.control", name = "Zoom")
public class ZoomControl extends Control {
    @JsConstructor
    public ZoomControl() {
        super(new ZoomControlOptions());
    }

    @JsConstructor
    public ZoomControl(ZoomControlOptions options) {
        super(options);
    }
}
