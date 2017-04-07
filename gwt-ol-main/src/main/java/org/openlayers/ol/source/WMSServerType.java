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

import java.util.HashMap;
import java.util.Map;

/**
 * Available server types: 'carmentaserver', 'geoserver', 'mapserver', 'qgis'.
 * These are servers that have vendor parameters beyond the WMS specification that OpenLayers can make use of.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public enum WMSServerType {
    CARMENTA_SERVER("carmentaserver"),
    GEOSERVER("geoserver"),
    MAPSERVER("mapserver"),
    QGIS("qgis");

    private final static Map<String, WMSServerType> ENUM_MAP = new HashMap<>();
    static {
        for (WMSServerType value : values()) {
            ENUM_MAP.put(value.value, value);
        }
    }

    private final String value;

    WMSServerType(String value) {
        this.value = value;
    }

    public static WMSServerType fromValue(String value) {
        return ENUM_MAP.get(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
