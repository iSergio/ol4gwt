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
import org.openlayers.ol.Image;
import org.openlayers.ol.Size;
import org.openlayers.ol.style.IconAnchorUnits;
import org.openlayers.ol.style.IconOrigin;

/**
 * {@link org.openlayers.ol.style.IconStyle} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class IconStyleOptions {
    /**
     * Anchor. Default value is [0.5, 0.5] (icon center).
     */
    @JsProperty
    public double[] anchor;
    /**
     * Origin of the anchor: bottom-left, bottom-right, top-left or top-right. Default is top-left.
     * {@link IconOrigin}
     */
    @JsProperty
    public String anchorOrigin;
    /**
     * Units in which the anchor x value is specified. A value of 'fraction' indicates the x value is a fraction of the icon.
     * A value of 'pixels' indicates the x value in pixels. Default is 'fraction'.
     * {@link IconAnchorUnits}
     */
    @JsProperty
    public String anchorXUnits;
    /**
     * Units in which the anchor y value is specified. A value of 'fraction' indicates the y value is a fraction of the icon.
     * A value of 'pixels' indicates the y value in pixels. Default is 'fraction'.
     * {@link IconAnchorUnits}
     */
    @JsProperty
    public String anchorYUnits;
    /**
     * Color to tint the icon. If not specified, the icon will be left as is.
     */
    @JsProperty
    public Color color;
    /**
     * The crossOrigin attribute for loaded images. Note that you must provide a crossOrigin value if you are using the
     * WebGL renderer or if you want to access pixel data with the Canvas renderer.
     * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
     */
    @JsProperty
    public String crossOrigin;
    /**
     * Image object for the icon. If the src option is not provided then the provided image must already be loaded.
     * And in that case, it is required to provide the size of the image, with the imgSize option.
     */
    @JsProperty
    public Image img;
    /**
     * Offset, which, together with the size and the offset origin, define the sub-rectangle to use from the original icon image.
     * Default value is [0, 0].
     */
    @JsProperty
    public double[] offset;
    /**
     * Origin of the offset: bottom-left, bottom-right, top-left or top-right. Default is top-left.
     * {@link IconOrigin}
     */
    @JsProperty
    public String offsetOrigin;
    /**
     * Opacity of the icon. Default is 1.
     */
    @JsProperty
    public double opacity;
    /**
     * Scale.
     */
    @JsProperty
    public double scale;
    /**
     * If true integral numbers of pixels are used as the X and Y pixel coordinate when drawing the icon in the output canvas.
     * If false fractional numbers may be used. Using true allows for "sharp" rendering (no blur), while using false
     * allows for "accurate" rendering. Note that accuracy is important if the icon's position is animated.
     * Without it, the icon may jitter noticeably. Default value is true.
     */
    @JsProperty
    public boolean snapToPixel;
    /**
     * Whether to rotate the icon with the view. Default is false.
     */
    @JsProperty
    public boolean rotateWithView;
    /**
     * Rotation in radians (positive rotation clockwise). Default is 0.
     */
    @JsProperty
    public double rotation;
    /**
     * Icon size in pixel. Can be used together with offset to define the sub-rectangle to use from the origin (sprite) icon image.
     */
    @JsProperty
    public Size size;
    /**
     * Image size in pixels. Only required if img is set and src is not, and for SVG images in Internet Explorer 11.
     * The provided imgSize needs to match the actual size of the image.
     */
    @JsProperty
    public Size imgSize;
    /**
     * Image source URI. Required.
     */
    @JsProperty
    public String src;

    @JsConstructor
    public IconStyleOptions() {}
}
