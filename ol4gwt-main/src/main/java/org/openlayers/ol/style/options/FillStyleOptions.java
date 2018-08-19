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

package org.openlayers.ol.style.options;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Color;

/**
 * {@link org.openlayers.ol.style.FillStyle} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class FillStyleOptions {
    /**
     * A color, gradient or pattern. See ol.color and ol.colorlike for possible formats. Default null; if null, the
     * Canvas/renderer default black will be used.
     */
    @JsProperty
    public Color color;
    /**
     * A color, gradient or pattern. See ol.color and ol.colorlike for possible formats. Default null; if null, the
     * Canvas/renderer default black will be used.
     */
    @JsProperty(name = "color")
    public String colorStr;

    @JsConstructor
    public FillStyleOptions() {}
}
