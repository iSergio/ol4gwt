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

package org.openlayers.ol.extent;

import java.util.HashMap;
import java.util.Map;

/**
 * Relationship to an extent.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public enum Relationship {
    UNKNOWN(0),
    INTERSECTING(1),
    ABOVE(2),
    RIGHT(4),
    BELOW(8),
    LEFT(16);

    private static final Map<Integer, Relationship> ENUM_MAP = new HashMap<>();
    static {
        for (Relationship value : values()) {
            ENUM_MAP.put(value.value, value);
        }
    }

    private final Integer value;

    Relationship(Integer value) {
        this.value = value;
    }

    public static Relationship fromValue(Integer value) {
        return ENUM_MAP.get(value);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
