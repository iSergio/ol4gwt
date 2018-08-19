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

import java.util.HashMap;
import java.util.Map;

/**
 * Generic change event. Triggered when the revision counter is increased.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public enum EventType {
    CHANGE("change"),

    CLICK("click"),
    DBLCLICK("dblclick"),
    DRAGENTER("dragenter"),
    DRAGOVER("dragover"),
    DROP("drop"),
    ERROR("error"),
    KEYDOWN("keydown"),
    KEYPRESS("keypress"),
    LOAD("load"),
    MOUSEDOWN("mousedown"),
    MOUSEMOVE("mousemove"),
    MOUSEOUT("mouseout"),
    MOUSEUP("mouseup"),
    MOUSEWHEEL("mousewheel"),
    MSPOINTERDOWN("mspointerdown"),
    RESIZE("resize"),
    TOUCHSTART("touchstart"),
    TOUCHMOVE("touchmove"),
    TOUCHEND("touchend"),
    WHEEL("wheel");

    private final static Map<String, EventType> ENUM_MAP = new HashMap<>();
    static {
        for (EventType value : values()) {
            ENUM_MAP.put(value.value, value);
        }
    }

    private final String value;

    EventType(String value) {
        this.value = value;
    }

    public static EventType fromValue(String value) {
        return ENUM_MAP.get(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
