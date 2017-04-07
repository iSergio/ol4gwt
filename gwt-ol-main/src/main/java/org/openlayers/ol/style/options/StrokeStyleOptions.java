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
 * {@link org.openlayers.ol.style.StrokeStyle} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class StrokeStyleOptions {
    /**
     * A color, gradient or pattern. See ol.color and ol.colorlike for possible formats. Default null;
     * if null, the Canvas/renderer default black will be used.
     */
    @JsProperty
    public Color color;
    /**
     * A color, gradient or pattern. See ol.color and ol.colorlike for possible formats. Default null;
     * if null, the Canvas/renderer default black will be used.
     */
    @JsProperty(name = "color")
    public String colorStr;
    /**
     * Line cap style: butt, round, or square. Default is round.
     */
    @JsProperty
    public String lineCap;
    /**
     * Line join style: bevel, round, or miter. Default is round.
     */
    @JsProperty
    public String lineJoin;
    /**
     * Line dash pattern. Default is undefined (no dash). Please note that Internet Explorer 10 and lower do not
     * support the setLineDash method on the CanvasRenderingContext2D and therefore this option will have no visual effect in these browsers.
     */
    @JsProperty
    public double[] lineDash;
    /**
     * Line dash offset. Default is '0'.
     */
    @JsProperty
    public double lineDashOffset;
    /**
     * Miter limit. Default is 10.
     */
    @JsProperty
    public double miterLimit;
    /**
     * Width.
     */
    @JsProperty
    public int width;


    @JsConstructor
    public StrokeStyleOptions() {}
}
