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

package org.openlayers.ol.format.options;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Object;

/**
 * {@link org.openlayers.ol.format.GPXFormat} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class GPXFormatOptions {
    /**
     * Callback function to process extensions nodes. To prevent memory leaks, this callback function must not store any
     * references to the node. Note that the extensions node is not allowed in GPX 1.0.
     * Moreover, only extensions nodes from wpt, rte and trk can be processed, as those are directly mapped to a feature.
     */
    @JsProperty
    public ReadExtensions readExtensions;

    @JsFunction
    public interface ReadExtensions {
        Object function(Object... objects);
    }
}
