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

package org.openlayers.ol.style;

import jsinterop.annotations.*;
import org.openlayers.ol.Color;
import org.openlayers.ol.style.options.FillStyleOptions;

/**
 * Set fill style for vector features.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.style", name = "Fill")
public class FillStyle {
    @JsConstructor
    public FillStyle() {}

    @JsConstructor
    public FillStyle(FillStyleOptions options) {}

    /**
     * Simple create {@link FillStyle} from color.
     * @param color Color which used in options
     * @return FillStyle
     */
    @JsOverlay
    public static FillStyle craete(Color color) {
        FillStyleOptions options = new FillStyleOptions();
        options.color = color;
        return new FillStyle(options);
    }

    /**
     * Simple create {@link FillStyle} from color.
     * @param colorStr Color string which used in options
     * @return FillStyle
     */
    @JsOverlay
    public static FillStyle craete(String colorStr) {
        FillStyleOptions options = new FillStyleOptions();
        options.colorStr = colorStr;
        return new FillStyle(options);
    }

    /**
     * Clones the style. The color is not cloned if it is an ol.ColorLike.
     * @return The cloned style.
     */
    @JsMethod
    public native FillStyle clone();

    /**
     * Get the fill color.
     * @return Color.
     */
    @JsMethod
    public native Color getColor();

    /**
     * Set the color.
     * @param color Color.
     */
    @JsMethod
    public native void setColor(Color color);

    /**
     * Set the color.
     * @param color Color.
     */
    @JsMethod
    public native void setColor(String color);

}
