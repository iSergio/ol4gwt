package org.openlayers.ol.layer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public enum VectorRenderType {
    /**
     * Vector layers are rendered as images. Great performance, but point symbols and texts are always rotated with the
     * view and pixels are scaled during zoom animations.
     */
    IMAGE("image"),
    /**
     * VVector layers are rendered as vectors. Most accurate rendering even during animations, but slower performance.
     */
    VECTOR("vector");

    private static final Map<String, VectorRenderType> ENUM_MAP = new HashMap<>();
    static {
        for (VectorRenderType value : values()) {
            ENUM_MAP.put(value.value, value);
        }
    }

    private final String value;

    VectorRenderType(String value) {
        this.value = value;
    }

    public static VectorRenderType fromValue(String value) {
        return ENUM_MAP.get(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
