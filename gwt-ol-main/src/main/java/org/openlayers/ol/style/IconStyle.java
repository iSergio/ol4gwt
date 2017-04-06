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
import org.openlayers.ol.Color;
import org.openlayers.ol.Image;
import org.openlayers.ol.Size;
import org.openlayers.ol.style.options.IconStyleOptions;

/**
 * Set icon style for vector features.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.style", name = "Icon")
public class IconStyle extends ImageStyle {
    @JsConstructor
    public IconStyle() {}

    @JsConstructor
    public IconStyle(IconStyleOptions options) {}

    /**
     * Clones the style.
     * @return The cloned style.
     */
    @JsMethod
    public native IconStyle clone();

    /**
     * Get the anchor point in pixels. The anchor determines the center point for the symbolizer.
     * @return Anchor.
     */
    @JsMethod
    public native double[] getAnchor();

    /**
     * Get the icon color.
      * @return Color.
     */
    @JsMethod
    public native Color getColor();

    /**
     * Get the image icon.
     * @param pixelRatio Pixel ratio.
     * @return Image or Canvas element.
     */
    @JsMethod
    public native Image getImage(double pixelRatio);

    /**
     * Get the origin of the symbolizer.
     * @return Origin.
     */
    @JsMethod
    public native double[] getOrigin();

    /**
     * Get the size of the symbolizer (in pixels).
     * @return Size.
     */
    @JsMethod
    public native Size getSize();

    /**
     * Get the image URL.
     * @return Image src.
     */
    @JsMethod
    public native String getSrc();

    /**
     * Load not yet loaded URI. When rendering a feature with an icon style, the vector renderer will automatically
     * call this method. However, you might want to call this method yourself for preloading or other purposes.
     */
    @JsMethod
    public native void load();
}
