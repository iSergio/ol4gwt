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

package org.openlayers.ol;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol", name = "OverlayPositioning")
public class OverlayPositioning {
    @JsProperty(name = "BOTTOM_LEFT")
    public native String BOTTOM_LEFT();
    @JsProperty(name = "BOTTOM_CENTER")
    public native String BOTTOM_CENTER();
    @JsProperty(name = "BOTTOM_RIGHT")
    public native String BOTTOM_RIGHT();
    @JsProperty(name = "CENTER_LEFT")
    public native String CENTER_LEFT();
    @JsProperty(name = "CENTER_CENTER")
    public native String CENTER_CENTER();
    @JsProperty(name = "CENTER_RIGHT")
    public native String CENTER_RIGHT();
    @JsProperty(name = "TOP_LEFT")
    public native String TOP_LEFT();
    @JsProperty(name = "TOP_CENTER")
    public native String TOP_CENTER();
    @JsProperty(name = "TOP_RIGHT")
    public native String TOP_RIGHT();

    @JsConstructor
    private OverlayPositioning() {}
}
