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

package org.openlayers.ol.interaction;

import jsinterop.annotations.*;
import org.openlayers.ol.events.MapBrowserEvent;
import org.openlayers.ol.events.ModifyInteractionEvent;
import org.openlayers.ol.interaction.options.ModifyInteractionOptions;

/**
 * Interaction for modifying feature geometries.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.interaction", name = "Modify")
public class ModifyInteraction extends PointerInteraction {
    @JsConstructor
    public ModifyInteraction(ModifyInteractionOptions options) {}

    /**
     * Handles the map browser event and may modify the geometry.
     * @param mapBrowserEvent Map browser event.
     * @return false to stop event propagation.
     */
    @JsMethod
    public static native boolean handleEvent(MapBrowserEvent mapBrowserEvent);

    /**
     * Removes the vertex currently being pointed.
     * @return True when a vertex was removed.
     */
    @JsMethod
    public native boolean removePoint();

    /**
     * Triggered upon feature modification end
     */
    @JsFunction
    public interface ModifyStartListener {
        @JsOverlay
        String TYPE = "modifystart";

        void function(ModifyInteractionEvent event);
    }

    /**
     * Triggered upon feature modification end
     */
    @JsFunction
    public interface ModifyEndListener {
        @JsOverlay
        String TYPE = "modifystart";

        void function(ModifyInteractionEvent event);
    }
}
