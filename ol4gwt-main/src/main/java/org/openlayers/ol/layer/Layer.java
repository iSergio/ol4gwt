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
import org.openlayers.ol.Map;
import org.openlayers.ol.events.ObjectEvent;
import org.openlayers.ol.events.RenderEvent;
import org.openlayers.ol.layer.options.LayerOptions;
import org.openlayers.ol.source.Source;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.layer", name = "Layer")
public abstract class Layer extends BaseLayer {
    @JSConstructor
    protected Layer() {}

    @JsConstructor
    protected Layer(LayerOptions options) {
        super(options);
    }

    /**
     * Get the layer source.
     * @return  The layer source (or null if not yet set).
     */
    @JsMethod
    public native Source getSource();

    /**
     * Sets the layer to be rendered on top of other layers on a map. The map will not manage this layer in its layers collection,
     * and the callback in ol.Map#forEachLayerAtPixel will receive null as layer. This is useful for temporary layers.
     * To remove an unmanaged layer from the map, use #setMap(null).
     *
     * To add the layer to a map and have it managed by the map, use ol.Map#addLayer instead.
     * @param map Map.
     */
    @JsMethod
    public native void setMap(Map map);

    /**
     * Set the layer source.
     * @param source The layer source.
     */
    @JsMethod
    public native void setSource(Source source);

    @JsFunction
    public interface ChangeSourceListener {
        @JsOverlay
        String TYPE = "change:source";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }

    @JsFunction
    public interface PostComposeListener {
        @JsOverlay
        String type = "postcompose";

        void function(RenderEvent event);
    }

    @JsFunction
    public interface PreComposeListener {
        @JsOverlay
        String type = "precompose";

        void function(RenderEvent event);
    }

    @JsFunction
    public interface RenderListener {
        @JsOverlay
        String type = "render";

        void function(RenderEvent event);
    }
}
