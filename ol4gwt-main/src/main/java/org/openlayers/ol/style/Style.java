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

import com.google.gwt.core.client.JsArray;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.StyleGeometryFunction;
import org.openlayers.ol.geom.Geometry;
import org.openlayers.ol.render.State;
import org.openlayers.ol.style.options.StyleOptions;

/**
 * Container for vector feature rendering styles. Any changes made to the style or its children through set*() methods
 * will not take effect until the feature or layer that uses the style is re-rendered.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.style", name = "Style")
public class Style {
    @JsConstructor
    public Style() {}

    @JsConstructor
    public Style(StyleOptions options) {}

    /**
     * Clones the style.
     * @return The cloned style.
     */
    @JsMethod
    public native Style clone();

    /**
     * Get the fill style.
     * @return Fill style.
     */
    @JsMethod
    public native FillStyle getFill();

    /**
     * Get the geometry to be rendered.
     * @return  Feature property or geometry or function that returns the geometry that will be rendered with this style.
     */
    @JsMethod
    public native Geometry getGeometry();
    /**
     * Get the geometry to be rendered.
     * @return  Feature property or geometry or function that returns the geometry that will be rendered with this style.
     */
    @JsMethod(name = "getGeoemtry")
    public native String getGeometryStr();

    /**
     * Get the function used to generate a geometry for rendering.
     * @return Function that is called with a feature and returns the geometry to render instead of the feature's geometry.
     */
    @JsMethod
    public native StyleGeometryFunction getGeometryFunction();

    /**
     * Get the image style.
     * @return Image style.
     */
    @JsMethod
    public native ImageStyle getImage();

    /**
     * Get the custom renderer function that was configured with #setRenderer or the renderer constructor option.
     * @return Custom renderer function.
     */
    @JsMethod
    public native RenderFunction getRenderer();

    /**
     * Get the stroke style.
     * @return Stroke style.
     */
    @JsMethod
    public native StrokeStyle getStroke();

    /**
     * Get the text style.
     * @return Text style.
     */
    @JsMethod
    public native TextStyle getText();

    /**
     * Get the z-index for the style.
     * @return ZIndex.
     */
    public native int getZIndex();

    /**
     * Set the fill style.
     * @param fill Fill style.
     */
    @JsMethod
    public native void setFill(FillStyle fill);

    /**
     * Set a geometry that is rendered instead of the feature's geometry.
     * @param geometry Feature property or geometry or function returning a geometry to render for this style.
     */
    @JsMethod
    public native void setGeometry(String geometry);

    /**
     * Set a geometry that is rendered instead of the feature's geometry.
     * @param geometry Feature property or geometry or function returning a geometry to render for this style.
     */
    @JsMethod
    public native void setGeometry(Geometry geometry);

    /**
     * Set a geometry that is rendered instead of the feature's geometry.
     * @param geometry Feature property or geometry or function returning a geometry to render for this style.
     */
    @JsMethod
    public native void setGeometry(StyleGeometryFunction geometry);

    /**
     * Set the image style.
     * @param image Image style.
     */
    @JsMethod
    public native void setImage(ImageStyle image);

    /**
     * Sets a custom renderer function for this style. When set, fill, stroke and image options of the style will be ignored.
     * @param renderer render Custom renderer function.
     */
    @JsMethod
    public native void setRenderer(RenderFunction renderer);

    /**
     * Set the stroke style.
     * @param stroke Stroke style.
     */
    @JsMethod
    public native void setStroke(StrokeStyle stroke);

    /**
     * Set the text style.
     * @param text Text style.
     */
    @JsMethod
    public native void setText(TextStyle text);
    /**
     * Set the z-index.
     * @param zIndex ZIndex.
     */
    @JsMethod
    public native void setZIndex(int zIndex);

    @JsFunction
    public interface RenderFunction {
        void function(double[] pixels, State state);
    }
}
