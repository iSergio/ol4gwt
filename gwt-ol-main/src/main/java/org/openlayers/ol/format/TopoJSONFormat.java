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

package org.openlayers.ol.format;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Feature;
import org.openlayers.ol.format.options.TopoJSONFormatOptions;
import org.openlayers.ol.proj.Projection;

/**
 * Feature format for reading data in the TopoJSON format.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.format", name = "TopoJSON")
public class TopoJSONFormat extends JSONFeatureFormat {
    @JsConstructor
    public TopoJSONFormat() {}

    @JsConstructor
    public TopoJSONFormat(TopoJSONFormatOptions options) {}

    @JsOverlay
    public static TopoJSONFormat create(Projection defaultDataProjection) {
        TopoJSONFormatOptions options = new TopoJSONFormatOptions();
        options.defaultDataProjection = defaultDataProjection;
        return new TopoJSONFormat(options);
    }

    @JsOverlay
    public static TopoJSONFormat create(String defaultDataProjection) {
        TopoJSONFormatOptions options = new TopoJSONFormatOptions();
        options.defaultDataProjection = Projection.create(defaultDataProjection);
        return new TopoJSONFormat(options);
    }

    /**
     * Read the projection from a TopoJSON source.
     * @param source Source.
     * @return Projection.
     */
    @JsMethod
    public native Projection readProjection(String source);

    /**
     * ead all features from a TopoJSON source.
     * @param source Source.
     * @return Features.
     */
    @JsMethod
    public native Feature[] readFeatures(String source);
}
