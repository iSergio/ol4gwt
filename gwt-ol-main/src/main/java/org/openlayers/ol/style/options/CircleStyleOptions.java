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
import jsinterop.annotations.JsType;
import org.openlayers.ol.style.AtlasManagerStyle;
import org.openlayers.ol.style.FillStyle;
import org.openlayers.ol.style.StrokeStyle;

/**
 * {@link org.openlayers.ol.style.CircleStyle} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class CircleStyleOptions {
    /**
     * Fill style.
     */
    public FillStyle fill;
    /**
     * Circle radius. Required.
     */
    public double radius;
    /**
     * If true integral numbers of pixels are used as the X and Y pixel coordinate when drawing the circle in the output canvas.
     * If false fractional numbers may be used. Using true allows for "sharp" rendering (no blur), while using false allows
     * for "accurate" rendering. Note that accuracy is important if the circle's position is animated. Without it,
     * the circle may jitter noticeably. Default value is true.
     */
    public boolean snapToPixel;
    /**
     * Stroke style.
     */
    public StrokeStyle stroke;
    /**
     * The atlas manager to use for this circle. When using WebGL it is recommended to use an atlas manager to avoid texture switching.
     * If an atlas manager is given, the circle is added to an atlas. By default no atlas manager is used.
     */
    public AtlasManagerStyle atlasManager;

    @JsConstructor
    public CircleStyleOptions() {}
}
