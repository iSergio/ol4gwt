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
import org.openlayers.ol.Image;
import org.openlayers.ol.Size;
import org.openlayers.ol.style.options.RegularShapeStyleOptions;

/**
 * Set regular shape style for vector features. The resulting shape will be a regular polygon when radius is provided,
 * or a star when radius1 and radius2 are provided.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.style", name = "RegularShape")
public class RegularShapeStyle extends ImageStyle {
    @JsConstructor
    protected RegularShapeStyle() {}

    @JsConstructor
    public RegularShapeStyle(RegularShapeStyleOptions options) {}

    /**
     * Clones the style. If an atlasmanager was provided to the original style it will be used in the cloned style, too.
     * @return The cloned style.
     */
    @JsMethod
    public native RegularShapeStyle clone();

    /**
     * Get the anchor point in pixels. The anchor determines the center point for the symbolizer.
     * @return Anchor.
     */
    @JsMethod
    public native double[] getAnchor();

    /**
     * Get the angle used in generating the shape.
     * @return Shape's rotation in radians.
     */
    @JsMethod
    public native double getAngle();

    /**
     * Get the fill style for the shape.
     * @return Fill style.
     */
    @JsMethod
    public native FillStyle getFill();

    /**
     * Get the image element for the symbolizer.
     * @param pixelRatio Pixel ratio.
     * @return Image element.
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
     * Get the number of points for generating the shape.
     * @return Number of points for stars and regular polygons.
     */
    @JsMethod
    public native int getPoints();

    /**
     * Get the (primary) radius for the shape.
     * @return Radius.
     */
    @JsMethod
    public native double getRadius();

    /**
     * Get the secondary radius for the shape.
     * @return Radius2.
     */
    @JsMethod
    public native double getRadius2();

    /**
     * Get the size of the symbolizer (in pixels).
     * @return Size.
     */
    @JsMethod
    public native Size getSize();

    /**
     * Get the stroke style for the shape.
     * @return Stroke style.
     */
    @JsMethod
    public native StrokeStyle getStroke();
}
