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
import org.openlayers.ol.style.FillStyle;
import org.openlayers.ol.style.StrokeStyle;

/**
 * {@link org.openlayers.ol.style.TextStyle} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class TextStyleOptions {
    /**
     * Font style as CSS 'font' value, see: https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/font.
     * Default is '10px sans-serif'
     */
    @JsProperty
    public String font;
    /**
     * Horizontal text offset in pixels. A positive will shift the text right. Default is 0.
     */
    @JsProperty
    public int offsetX;
    /**
     * Vertical text offset in pixels. A positive will shift the text down. Default is 0.
     */
    @JsProperty
    public int offsetY;
    /**
     * Scale.
     */
    @JsProperty
    public double scale;
    /**
     * Whether to rotate the text with the view. Default is false.
     */
    @JsProperty
    public boolean rotateWithView;
    /**
     * Rotation in radians (positive rotation clockwise). Default is 0.
     */
    @JsProperty
    public double rotation;
    /**
     * Text content.
     */
    @JsProperty
    public String text;
    //TODO: textAlign enum
    /**
     * Text alignment. Possible values: 'left', 'right', 'center', 'end' or 'start'. Default is 'start'.
     */
    @JsProperty
    public String textAlign;
    //TODO: textBaseline enum
    /**
     * Text base line. Possible values: 'bottom', 'top', 'middle', 'alphabetic', 'hanging', 'ideographic'. Default is 'alphabetic'.
     */
    @JsProperty
    public String textBaseline;
    /**
     * Fill style. If none is provided, we'll use a dark fill-style (#333).
     */
    @JsProperty
    public FillStyle fill;
    /**
     * Stroke style.
     */
    @JsProperty
    public StrokeStyle stroke;

    @JsConstructor
    public TextStyleOptions() {}
}
