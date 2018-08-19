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
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.source.options.CargoDBSourceOptions;

/**
 * Layer source for the CartoDB tiles.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.source", name = "CargoDB")
public class CargoDBSource extends XYZSource {
    @JsConstructor
    public CargoDBSource(CargoDBSourceOptions options) {}

    /**
     * Returns the current config.
     * @return The current configuration.
     */
    @JsMethod
    public native Object getConfig();

    /**
     * Sets the CartoDB config
     * @param config In the case of anonymous maps, a CartoDB configuration object.
     *               If using named maps, a key-value lookup with the template parameters.
     */
    @JsMethod
    public native void setConfig(Object config);

    /**
     * Updates the carto db config.
     * @param config a key-value lookup. Values will replace current values in the config.
     */
    @JsMethod
    public native void updateConfig(Object config);
}
