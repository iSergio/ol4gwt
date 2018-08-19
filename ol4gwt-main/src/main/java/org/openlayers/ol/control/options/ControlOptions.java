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

package org.openlayers.ol.control.options;

import com.google.gwt.dom.client.Element;
import jsinterop.annotations.*;

/**
 * {@link org.openlayers.ol.control.Control} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ControlOptions {
    /**
     * The element is the control's container element. This only needs to be specified if you're developing a custom control.
     */
    @JsProperty
    public Element element;
    /**
     * Function called when the control should be re-rendered. This is called in a requestAnimationFrame callback.
     */
    @JsProperty
    public Render render;
    /**
     * Specify a target if you want the control to be rendered outside of the map's viewport.
     */
    @JsProperty
    public Element target;

    @JsConstructor
    public ControlOptions() {}

    @JsFunction
    public interface Render {
        void function();
    }
}
