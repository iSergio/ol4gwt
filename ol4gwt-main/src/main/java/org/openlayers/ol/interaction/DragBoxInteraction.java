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
import org.openlayers.ol.events.DragBoxInteractionEvent;
import org.openlayers.ol.geom.Geometry;
import org.openlayers.ol.interaction.options.DragBoxInteractionOptions;

/**
 * Allows the user to draw a vector box by clicking and dragging on the map, normally combined with an ol.events.condition
 * that limits it to when the shift or other key is held down. This is used, for example, for zooming to a
 * specific area of the map (see ol.interaction.DragZoom and ol.interaction.DragRotateAndZoom).
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.interaction", name = "DragBox")
public class DragBoxInteraction extends PointerInteraction {
    @JsConstructor
    public DragBoxInteraction() {}

    @JsConstructor
    public DragBoxInteraction(DragBoxInteractionOptions options) {}

    /**
     * Returns geometry of last drawn box.
     * @return Geometry.
     */
    @JsMethod
    public native Geometry getGeometry();

    /**
     * Triggered on drag when box is active.
     */
    @JsFunction
    public interface BoxDragListener {
        @JsOverlay
        String TYPE = "boxdrag";

        void function(DragBoxInteractionEvent event);
    }

    /**
     * Triggered upon drag box end.
     */
    @JsFunction
    public interface BoxEndListener {
        @JsOverlay
        String TYPE = "boxend";

        void function(DragBoxInteractionEvent event);
    }

    /**
     * Triggered upon drag box start.
     */
    @JsFunction
    public interface BoxStartListener {
        @JsOverlay
        String TYPE = "boxstart";

        void function(DragBoxInteractionEvent event);
    }
}
