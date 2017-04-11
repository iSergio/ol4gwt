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
import org.openlayers.ol.Extent;
import org.openlayers.ol.Object;
import org.openlayers.ol.events.ObjectEvent;
import org.openlayers.ol.layer.options.BaseLayerOptions;

/**
 * Abstract base class; normally only used for creating subclasses and not instantiated in apps.
 * Note that with ol.layer.Base and all its subclasses, any property set in the options is set as a
 * ol.Object property on the layer object, so is observable, and has get/set accessors.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.layer", name = "Base")
public abstract class BaseLayer extends Object {
    @JsConstructor
    protected BaseLayer() {}

    @JsConstructor
    protected BaseLayer(BaseLayerOptions options) {}

    /**
     * Return the extent of the layer or undefined if it will be visible regardless of extent.
     * @return The layer extent.
     */
    @JsMethod
    public native Extent getExtent();

    /**
     * Return the maximum resolution of the layer.
     * @return The maximum resolution of the layer.
     */
    @JsMethod
    public native double getMaxResolution();

    /**
     * Return the minimum resolution of the layer.
     * @return The minimum resolution of the layer.
     */
    @JsMethod
    public native double getMinResolution();

    /**
     * Return the opacity of the layer (between 0 and 1).
     * @return The opacity of the layer.
     */
    @JsMethod
    public native double getOpacity();

    /**
     * Return the visibility of the layer (true or false).
     * @return The visibility of the layer.
     */
    @JsMethod
    public native boolean getVisible();

    /**
     * Return the Z-index of the layer, which is used to order layers before rendering. The default Z-index is 0.
     * @return The Z-index of the layer.
     */
    @JsMethod
    public native int getZIndex();

    /**
     * Set the extent at which the layer is visible. If undefined, the layer will be visible at all extents.
     * @param extent The extent of the layer.
     */
    @JsMethod
    public native void setExtent(Extent extent);

    /**
     * Set the maximum resolution at which the layer is visible.
     * @param maxResolution The maximum resolution of the layer.
     */
    @JsMethod
    public native void setMaxResolution(double maxResolution);

    /**
     * Set the minimum resolution at which the layer is visible.
     * @param minResolution The minimum resolution of the layer.
     */
    @JsMethod
    public native void setMinResolution(double minResolution);

    /**
     * Set the opacity of the layer, allowed values range from 0 to 1.
     * @param opacity The opacity of the layer.
     */
    @JsMethod
    public native void setOpacity(double opacity);

    /**
     * Set the visibility of the layer (true or false).
     * @param visible The visibility of the layer.
     */
    @JsMethod
    public native void setVisible(boolean visible);

    /**
     * Set Z-index of the layer, which is used to order layers before rendering. The default Z-index is 0.
     * @param zindex The z-index of the layer.
     */
    @JsMethod
    public native void setZIndex(int zindex);

    @JsFunction
    public interface ChangeExtentListener {
        @JsOverlay
        String TYPE = "change:extent";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }

    @JsFunction
    public interface ChangeMaxResolutionListener {
        @JsOverlay
        String TYPE = "change:maxResolution";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }

    @JsFunction
    public interface ChangeMinResolutionListener {
        @JsOverlay
        String TYPE = "change:minResolution";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }

    @JsFunction
    public interface ChangeOpacityListener {
        @JsOverlay
        String TYPE = "change:opacity";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }

    @JsFunction
    public interface ChangeVisibleListener {
        @JsOverlay
        String TYPE = "change:visible";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }

    @JsFunction
    public interface ChangeZIndexListener {
        @JsOverlay
        String TYPE = "change:zIndex";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }
}
