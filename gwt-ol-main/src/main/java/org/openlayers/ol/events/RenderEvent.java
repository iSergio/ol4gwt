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
import org.openlayers.ol.Object;
import org.openlayers.ol.render.VectorContext;
import org.openlayers.olx.FrameState;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.render", name = "Event")
public class RenderEvent extends Event {
    /**
     * Canvas context. Only available when a Canvas renderer is used, null otherwise.
     */
    @JsProperty
    public Object context;
    /**
     * An object representing the current render frame state.
     */
    @JsProperty
    public FrameState frameState;
    /**
     * WebGL context. Only available when a WebGL renderer is used, null otherwise.
     */
    @JsProperty
    public Object glContext;
    /**
     * For canvas, this is an instance of ol.render.canvas.Immediate.
     */
    @JsProperty
    public VectorContext vectorContext;
}
