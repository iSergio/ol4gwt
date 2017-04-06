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
import org.openlayers.ol.Map;
import org.openlayers.ol.Object;
import org.openlayers.ol.events.ObjectEvent;
import org.openlayers.ol.interaction.options.InteractionOptions;

/**
 * Abstract base class; normally only used for creating subclasses and not instantiated in apps. User actions that
 * change the state of the map. Some are similar to controls, but are not associated with a DOM element.
 * For example, ol.interaction.KeyboardZoom is functionally the same as ol.control.Zoom, but triggered by a
 * keyboard event not a button element event. Although interactions do not have a DOM element, some of them do
 * render vectors and so are visible on the screen.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.interaction", name = "Interaction")
public abstract class Interaction extends Object {
    @JsConstructor
    protected Interaction() {}

    @JsConstructor
    protected Interaction(InteractionOptions options) {}

    /**
     * Get the map associated with this interaction.
     * @return Map.
     */
    @JsMethod
    public native Map getMap();

    /**
     * Activate or deactivate the interaction.
     * @param active Active.
     */
    @JsMethod
    public native void setActive(boolean active);


    @JsFunction
    public interface ChangeActiveListener {
        @JsOverlay
        String TYPE = "change:active";
        /**
         * true if the interaction is active, false otherwise.
         */
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }
}
