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

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.style.options.TextStyleOptions;

/**
 * Set text style for vector features.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.style", name = "Text")
public class TextStyle {
    @JsConstructor
    public TextStyle() {}

    @JsConstructor
    public TextStyle(TextStyleOptions options) {}

    /**
     * Clones the style.
     * @return The cloned style.
     */
    @JsMethod
    public native TextStyle clone();

    /**
     * Get the fill style for the text.
     * @return Fill style.
     */
    @JsMethod
    public native FillStyle getFill();

    /**
     * Get the font name.
     * @return Font.
     */
    @JsMethod
    public native String getFont();

    /**
     * Get the x-offset for the text.
     * @return Horizontal text offset.
     */
    @JsMethod
    public native int getOffsetX();

    /**
     * Get the y-offset for the text.
     * @return Vertical text offset.
     */
    @JsMethod
    public native int getOffsetY();

    /**
     * Determine whether the text rotates with the map.
     * @return Rotate with map.
     */
    @JsMethod
    public native boolean getRotateWithView();

    /**
     * Get the text rotation.
     * @return Rotation.
     */
    @JsMethod
    public native double getRotation();

    /**
     * Get the text scale.
     * @return Scale.
     */
    @JsMethod
    public native double getScale();

    /**
     * Get the stroke style for the text.
      * @return Stroke style.
     */
    @JsMethod
    public native StrokeStyle getStroke();

    /**
     * Get the text to be rendered.
     * @return Text.
     */
    @JsMethod
    public native String getText();

    /**
     * Get the text alignment.
     * @return Text align.
     */
    @JsMethod
    public native String getTextAlign();

    /**
     * Get the text baseline.
     * @return Text baseline.
     */
    @JsMethod
    public native String getTextBaseline();

    /**
     * Set the fill.
     * @param fill Fill style.
     */
    @JsMethod
    public native void setFill(FillStyle fill);

    /**
     * Set the font.
     * @param font Font.
     */
    @JsMethod
    public native void setFont(String font);

    /**
     * Set the x offset.
     * @param offsetX Horizontal text offset.
     */
    @JsMethod
    public native void setOffsetX(int offsetX);

    /**
     * Set the y offset.
     * @param offsetY Vertical text offset.
     */
    @JsMethod
    public native void setOffsetY(int offsetY);

    /**
     * Set the rotation.
     * @param rotation Rotation.
     */
    @JsMethod
    public native void setRotation(double rotation);

    /**
     * Set the scale.
     * @param scale Scale.
     */
    @JsMethod
    public native void setScale(double scale);

    /**
     * Set the stroke.
     * @param stroke Stroke style.
     */
    @JsMethod
    public native void setStroke(StrokeStyle stroke);

    /**
     * Set the text.
     * @param text Text.
     */
    @JsMethod
    public native void setText(String text);

    /**
     * Set the text alignment.
     * @param textAlign Text align.
     */
    @JsMethod
    public native void setTextAlign(String textAlign);

    /**
     * Set the text baseline.
     * @param textBaseline Text baseline.
     */
    @JsMethod
    public native void setTextBaseline(String textBaseline);
}
