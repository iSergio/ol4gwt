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
import org.openlayers.ol.style.options.StrokeStyleOptions;

/**
 * Set stroke style for vector features. Note that the defaults given are the Canvas defaults, which will be used if
 * option is not defined. The get functions return whatever was entered in the options; they will not return the default.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.style", name = "Stroke")
public class StrokeStyle {
    @JsConstructor
    public StrokeStyle() {}

    @JsConstructor
    public StrokeStyle(StrokeStyleOptions options) {}

    @JsOverlay
    public static StrokeStyle create(Color color) {
        StrokeStyleOptions options = new StrokeStyleOptions();
        options.color = color;
        return new StrokeStyle(options);
    }

    @JsOverlay
    public static StrokeStyle create(String colorStr) {
        StrokeStyleOptions options = new StrokeStyleOptions();
        options.colorStr = colorStr;
        return new StrokeStyle(options);
    }

    /**
     * Clones the style.
     * @return The cloned style.
     */
    @JsMethod
    public native StrokeStyle clone();

    /**
     * Get the stroke color.
     * @return Color.
     */
    @JsMethod
    public native Color getColor();

    /**
     * Get the line cap type for the stroke.
     * @return Line cap.
     */
    @JsMethod
    public native String getLineCap();

    /**
     * Get the line dash style for the stroke.
     * @return Line dash.
     */
    @JsMethod
    public native double[] getLineDash();

    /**
     * Get the line dash offset for the stroke.
     * @return Line dash offset.
     */
    @JsMethod
    public native double getLineDashOffset();

    /**
     * Get the line join type for the stroke.
     * @return Line join.
     */
    @JsMethod
    public native String getLineJoin();

    /**
     * Get the miter limit for the stroke.
     * @return Miter limit.
     */
    @JsMethod
    public native double getMiterLimit();

    /**
     * Get the stroke width.
     * @return Width.
     */
    @JsMethod
    public native double getWidth();

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

    /**
     * Set the line cap.
     * @param lineCap Line cap.
     */
    @JsMethod
    public native void setLineCap(String lineCap);

    /**
     * Set the line dash.
     * Please note that Internet Explorer 10 and lower do not support the setLineDash method on the CanvasRenderingContext2D
     * and therefore this property will have no visual effect in these browsers.
     * @param lineDash Line dash.
     */
    @JsMethod
    public native void setLineDash(double[] lineDash);

    /**
     * Set the line dash offset.
     * @param lineDashOffset Line dash offset.
     */
    @JsMethod
    public native void setLineDashOffset(double lineDashOffset);

    /**
     * Set the line join.
     * @param lineJoin Line join.
     */
    public native void setLineJoin(String lineJoin);

    /**
     * Set the miter limit.
     * @param miterLimit Miter limit.
     */
    public native void setMiterLimit(double miterLimit);

    /**
     * Set the width.
     * @param width Width.
     */
    public native void setWidth(double width);

}
