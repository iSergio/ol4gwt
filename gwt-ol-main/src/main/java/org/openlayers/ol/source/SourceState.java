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

package org.openlayers.ol.source;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.proj.Units;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public enum SourceState {
    UNDEFINED("undefined"),
    LOADING("loading"),
    READY("ready"),
    ERROR("error");

    private static final Map<String, SourceState> ENUM_MAP = new HashMap<>();
    static {
        for (SourceState sourceState : values()) {
            ENUM_MAP.put(sourceState.value, sourceState);
        }
    }

    private final String value;

    SourceState(String value) {
        this.value = value;
    }

    public static SourceState fromValue(String value) {
        return ENUM_MAP.get(value);
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
