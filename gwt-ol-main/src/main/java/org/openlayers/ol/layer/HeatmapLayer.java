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

package org.openlayers.ol.layer;

import jsinterop.annotations.*;
import net.sourceforge.htmlunit.corejs.javascript.annotations.JSConstructor;
import org.openlayers.ol.events.ObjectEvent;
import org.openlayers.ol.layer.options.HeatmapLayerOptions;

/**
 * Layer for rendering vector data as a heatmap. Note that any property set in the options is set as a
 * {@link org.openlayers.ol.Object} property on the layer object;
 * for example, setting title: 'My Title' in the options means that title is
 * observable, and has get/set accessors.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.layer", name = "Heatmap")
public class HeatmapLayer extends VectorLayer {
    @JsConstructor
    public HeatmapLayer() {}

    @JSConstructor
    public HeatmapLayer(HeatmapLayerOptions options) {}

    /**
     * Return the blur size in pixels.
     * @return Blur size in pixels.
     */
    @JsMethod
    public native double getBlur();

    /**
     * Return the gradient colors as array of strings.
     * @return Colors.
     */
    @JsMethod
    public native String[] getGradient();

    /**
     * Return the size of the radius in pixels.
     * @return Radius size in pixel.
     */
    @JsMethod
    public native double getRadius();

    /**
     * Set the blur size in pixels.
     * @param blur Blur size in pixels.
     */
    @JsMethod
    public native void setBlur(double blur);

    /**
     * Set the gradient colors as array of strings.
     * @param colors Gradient.
     */
    @JsMethod
    public native void setGradient(String[] colors);

    /**
     * Set the size of the radius in pixels.
     * @param radius Radius size in pixel.
     */
    @JsMethod
    public native void setRadius(double radius);

    @JsFunction
    public interface ChangeBlurListener {
        @JsOverlay
        String TYPE = "change:blur";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }

    @JsFunction
    public interface ChangeGradientListener {
        @JsOverlay
        String TYPE = "change:gradient";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }

    @JsFunction
    public interface ChangeRadiusListener {
        @JsOverlay
        String TYPE = "change:radius";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }
}
