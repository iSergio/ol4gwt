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

package org.openlayers.ol.control;

import com.google.gwt.dom.client.Element;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Map;
import org.openlayers.ol.Object;
import org.openlayers.ol.control.options.ControlOptions;

/**
 * A control is a visible widget with a DOM element in a fixed position on the screen. They can involve user input (buttons),
 * or be informational only; the position is determined using CSS. By default these are placed in the container with CSS
 * class name ol-overlaycontainer-stopevent, but can use any outside DOM element.
 *
 * The main advantage of having this as a control rather than a simple separate DOM element is that preventing propagation
 * is handled for you. Controls will also be ol.Objects in a ol.Collection, so you can use their methods.
 *
 * You can also extend this base for your own control class. See examples/custom-controls for an example of how to do this.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.control", name = "Control")
public class Control extends Object {
    @JsConstructor
    public Control(ControlOptions options) {}

    /**
     * Get the map associated with this control.
     * @return Map.
     */
    @JsMethod
    public native Map getMap();

    /**
     * Remove the control from its current map and attach it to the new map.
     * Subclasses may set up event handlers to get notified about changes to the map here.
     * @param map Map.
     */
    @JsMethod
    public native void setMap(Map map);

    /**
     * This function is used to set a target element for the control. It has no effect if it is called after the control
     * has been added to the map (i.e. after setMap is called on the control). If no target is set in the options passed
     * to the control constructor and if setTarget is not called then the control is added to the map's overlay container.
     * @param target Target.
     */
    @JsMethod
    public native void setTarget(Element target);

    /**
     * This function is used to set a target element for the control. It has no effect if it is called after the control
     * has been added to the map (i.e. after setMap is called on the control). If no target is set in the options passed
     * to the control constructor and if setTarget is not called then the control is added to the map's overlay container.
     * @param target Target.
     */
    @JsMethod
    public native void setTarget(String target);
}
