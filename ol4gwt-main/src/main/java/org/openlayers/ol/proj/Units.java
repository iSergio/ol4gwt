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

package org.openlayers.ol.proj;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import java.util.HashMap;
import java.util.Map;

/**
 * Projection units.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public enum Units {
    DEGREES("degrees"),
    FEET("ft"),
    METERS("m"),
    PIXELS("pixels"),
    TILE_PIXELS("tile-pixels"),
    USFEET("us-ft");

    private final static Map<String, Units> ENUM_MAP = new HashMap<>();
    static {
        for (Units value : values()) {
            ENUM_MAP.put(value.value, value);
        }
    }

    private static final Map<Units, Double> METERS_PER_UNIT = new HashMap<>();
    static {
        // use the radius of the Normal sphere
        METERS_PER_UNIT.put(Units.DEGREES, 2 * Math.PI * 6370997 / 360);
        METERS_PER_UNIT.put(Units.FEET, 0.3048);
        METERS_PER_UNIT.put(Units.METERS, 1.0);
        METERS_PER_UNIT.put(Units.USFEET, 1200.0 / 3937.0);
    }

    private final String value;

    Units(String value) {
        this.value = value;
    }

    public static Units fromValue(String value) {
        return ENUM_MAP.get(value);
    }

    public double getMetersPerUnit() {
        return Units.getMetersPerUnit(this);
    }

    public static double getMetersPerUnit(Units units) {
        return METERS_PER_UNIT.get(units);
    }

    @Override
    public String toString() {
        return value;
    }
}
