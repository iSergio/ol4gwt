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
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.style.options.ImageStyleOptions;

/**
 * A base class used for creating subclasses and not instantiated in apps.
 * Base class for ol.style.Icon, ol.style.Circle and ol.style.RegularShape.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.style", name = "Image")
public class ImageStyle {
    @JsConstructor
    protected ImageStyle() {}

    @JsConstructor
    public ImageStyle(ImageStyleOptions options) {}

    /**
     * Get the symbolizer opacity.
     * @return Opacity.
     */
    @JsProperty
    public native double getOpacity();

    /**
     * Determine whether the symbolizer rotates with the map.
     * @return Rotate with map.
     */
    @JsProperty
    public native boolean getRotateWithView();

    /**
     * Get the symoblizer rotation.
     * @return Rotation.
     */
    @JsProperty
    public native double getRotation();

    /**
     * Get the symbolizer scale.
     * @return Scale.
     */
    @JsProperty
    public native double getScale();

    /**
     * Determine whether the symbolizer should be snapped to a pixel.
     * @return The symbolizer should snap to a pixel.
     */
    @JsProperty
    public native boolean getSnapToPixel();

    /**
     * Set the opacity.
     * @param opacity Opacity.
     */
    @JsProperty
    public native void setOpacity(double opacity);

    /**
     * Set the rotation.
     * @param rotation Rotation.
     */
    @JsProperty
    public native void setRotation(double rotation);

    /**
     * Set the scale.
     * @param scale Scale.
     */
    @JsProperty
    public native void setScale(double scale);
}
