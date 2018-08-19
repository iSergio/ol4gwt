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

package org.openlayers.ol.layer;

import java.util.HashMap;
import java.util.Map;

/**
 * Render mode for vector tiles
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public enum VectorTileRenderType {
    /**
     * Vector tiles are rendered as images. Great performance, but point symbols and texts are always rotated with the
     * view and pixels are scaled during zoom animations.
     */
    IMAGE("image"),
    /**
     * Polygon and line elements are rendered as images, so pixels are scaled during zoom animations.
     * Point symbols and texts are accurately rendered as vectors and can stay upright on rotated views.
     */
    HYBRID("hybrid"),
    /**
     * Vector tiles are rendered as vectors. Most accurate rendering even during animations, but slower performance
     * than the other options.
     */
    VECTOR("vector");

    private static final Map<String, VectorTileRenderType> ENUM_MAP = new HashMap<>();
    static {
        for (VectorTileRenderType value : values()) {
            ENUM_MAP.put(value.value, value);
        }
    }

    private final String value;

    VectorTileRenderType(String value) {
        this.value = value;
    }

    public static VectorTileRenderType fromValue(String value) {
        return ENUM_MAP.get(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
