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
import org.openlayers.ol.Collection;
import org.openlayers.ol.events.ObjectEvent;
import org.openlayers.ol.layer.options.LayerGroupOptions;

/**
 * A {@link org.openlayers.ol.Collection} of layers that are handled together.
 *
 * A generic change event is triggered when the group/Collection changes.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.layer", name = "Group")
public class LayerGroup extends BaseLayer {
    @JsConstructor
    public LayerGroup() {
        super(new LayerGroupOptions());
    }

    @JsConstructor
    public LayerGroup(LayerGroupOptions options) {
        super(options);
    }

    /**
     * Returns the collection of layers in this group.
     * @return Collection of layers that are part of this group.
     */
    @JsMethod
    public native Collection<BaseLayer> getLayers();

    /**
     * Set the collection of layers in this group.
     * @param layers Collection of layers that are part of this group.
     */
    @JsMethod
    public native void setLayers(Collection<BaseLayer> layers);

    @JsFunction
    public interface ChangeLayersListener {
        @JsOverlay
        String TYPE = "change:layers";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }
}
