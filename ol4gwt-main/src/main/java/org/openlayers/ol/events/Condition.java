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
import org.openlayers.ol.EventsConditionType;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.events", name = "condition")
public class Condition {
    /**
     * Return true if only the alt-key is pressed, false otherwise (e.g. when additionally the shift-key is pressed).
     * @return True if only the alt key is pressed.
     */
    @JsProperty(name = "altKeyOnly")
    public static native EventsConditionType altKeyOnly();

    /**
     * Return true if only the alt-key and shift-key is pressed, false otherwise 
     * (e.g. when additionally the platform-modifier-key is pressed).
     * @return True if only the alt and shift keys are pressed.
     */
    @JsProperty(name = "altShiftKeysOnly")
    public static native EventsConditionType altShiftKeysOnly();

    /**
     * Return always true.
     * @return True.
     */
    @JsProperty(name = "always")
    public static native EventsConditionType always();

    /**
     * Return true if the event is a click event, false otherwise.
     * @return True if the event is a map click event.
     */
    @JsProperty(name = "click")
    public static native EventsConditionType click();

    /**
     * Return true if the event is a map dblclick event, false otherwise.
     * @return True if the event is a map dblclick event.
     */
    @JsProperty(name = "doubleClick")
    public static native EventsConditionType doubleClick();

    /**
     * Return true if the event originates from a mouse device.
     * @return True if the event originates from a mouse device.
     */
    @JsProperty(name = "mouseOnly")
    public static native EventsConditionType mouseOnly();

    /**
     * Return always false.
     * @return False.
     */
    @JsProperty(name = "never")
    public static native EventsConditionType never();

    /**
     * Return true if no modifier key (alt-, shift- or platform-modifier-key) is pressed.
     * @return True only if there no modifier keys are pressed.
     */
    @JsProperty(name = "noModifierKeys")
    public static native EventsConditionType noModifierKeys();

    /**
     * Return true if only the platform-modifier-key (the meta-key on Mac, ctrl-key otherwise) is pressed,
     * false otherwise (e.g. when additionally the shift-key is pressed).
     * @return True if only the platform modifier key is pressed.
     */
    @JsProperty(name = "platformModifierKeyOnly")
    public static native EventsConditionType platformModifierKeyOnly();

    /**
     * Return true if the browser event is a pointermove event, false otherwise.
     * @return True if the browser event is a pointermove event.
     */
    @JsProperty(name = "pointerMove")
    public static native EventsConditionType pointerMove();

    /**
     * Return true if the event originates from a primary pointer in contact with the surface or if the left mouse button is pressed.
     * @return True if the event originates from a primary pointer.
     */
    @JsProperty(name = "primaryAction")
    public static native EventsConditionType primaryAction();

    /**
     * Return true if only the shift-key is pressed, false otherwise (e.g. when additionally the alt-key is pressed).
     * @return True if only the shift key is pressed.
     */
    @JsProperty(name = "shiftKeyOnly")
    public static native EventsConditionType shiftKeyOnly();

    /**
     * Return true if the event is a map singleclick event, false otherwise.
     * @return True if the event is a map singleclick event.
     */
    @JsProperty(name = "singleClick")
    public static native EventsConditionType singleClick();

    /**
     * Return true if the target element is not editable, i.e. not a <input>-, <select>- or <textarea>-element, false otherwise.
     * @return True only if the target element is not editable.
     */
    @JsProperty(name = "targetNotEditable")
    public static native EventsConditionType targetNotEditable();
}
