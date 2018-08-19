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
import org.openlayers.ol.control.options.FullScreenControlOptions;

/**
 * Provides a button that when clicked fills up the full screen with the map. The full screen source element is by
 * default the element containing the map viewport unless overriden by providing the source option. In which case,
 * the dom element introduced using this parameter will be displayed in full screen.
 *
 * When in full screen mode, a close button is shown to exit full screen mode. The Fullscreen API is used to toggle the
 * map in full screen mode.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.control", name = "FullScreen")
public class FullScreenControl extends Control {
    @JsConstructor
    public FullScreenControl() {
        super(new FullScreenControlOptions());
    }

    @JsConstructor
    public FullScreenControl(FullScreenControlOptions options) {
        super(options);
    }
}
