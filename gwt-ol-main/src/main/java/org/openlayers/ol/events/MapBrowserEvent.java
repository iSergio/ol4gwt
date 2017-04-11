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

package org.openlayers.ol.events;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Coordinate;
import org.openlayers.ol.Pixel;

/**
 * Events emitted as map browser events are instances of this type. See ol.Map for which events trigger a map browser event.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol", name = "MapBrowserEvent")
public class MapBrowserEvent extends MapEvent {
    /**
     * The coordinate in view projection corresponding to the original browser event.
     */
    @JsProperty
    public Coordinate coordinate;
    /**
     * Indicates if the map is currently being dragged. Only set for POINTERDRAG and POINTERMOVE events. Default is false.
     */
    @JsProperty
    public boolean dragging;
    /**
     * The original browser event.
     */
    @JsProperty
    public Event originalEvent;
    /**
     * The map pixel relative to the viewport corresponding to the original browser event.
     */
    @JsProperty
    public Pixel pixel;
}
