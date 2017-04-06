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

package org.openlayers.ol.proj;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Projection units.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.proj", name = "Units")
public class Units {
    @JsProperty(name = "DEGREES")
    public native String DEGREES();
    @JsProperty(name = "FEET")
    public native String FEET();
    @JsProperty(name = "METERS")
    public native String METERS();
    @JsProperty(name = "PIXELS")
    public native String PIXELS();
    @JsProperty(name = "TILE_PIXELS")
    public native String TILE_PIXELS();
    @JsProperty(name = "USFEET")
    public native String USFEET();
}
