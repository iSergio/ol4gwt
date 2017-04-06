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

package org.openlayers.ol.interaction.options;

import jsinterop.annotations.*;
import org.openlayers.ol.Object;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class InteractionOptions {
    /**
     * Method called by the map to notify the interaction that a browser event was dispatched to the map.
     * The function may return false to prevent the propagation of the event to other interactions in the map's
     * interactions chain. Required.
     */
    @JsProperty
    public HandleEventListener handleEvent;

    @JsConstructor
    public InteractionOptions() {}

    @JsFunction
    public interface HandleEventListener {
        boolean function(Object... objects);
    }
}
