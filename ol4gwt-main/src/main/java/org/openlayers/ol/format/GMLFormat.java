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

import com.google.gwt.xml.client.Node;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Feature;
import org.openlayers.ol.format.options.FormatWriteOptions;
import org.openlayers.ol.format.options.GMLFormatOptions;

/**
 * Feature format for reading and writing data in the GML format version 3.1.1.
 * Currently only supports GML 3.1.1 Simple Features profile.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.format", name = "GML")
public class GMLFormat extends GMLBaseFormat {
    @JsConstructor
    public GMLFormat() {}

    @JsConstructor
    public GMLFormat(GMLFormatOptions options) {}

    /**
     * Encode an array of features in GML 3.1.1 Simple Features.
     * @param features Features.
     * @return Result.
     */
    @JsMethod
    public native String writeFeatures(Feature[] features);

    /**
     * Encode an array of features in GML 3.1.1 Simple Features.
     * @param features Features.
     * @param options Options.
     * @return Result.
     */
    @JsMethod
    public native String writeFeatures(Feature[] features, FormatWriteOptions options);

    /**
     * Encode an array of features in the GML 3.1.1 format as an XML node.
     * @param features Features.
     * @return Node.
     */
    @JsMethod
    public native Node writeFeaturesNode(Feature[] features);

    /**
     * Encode an array of features in the GML 3.1.1 format as an XML node.
     * @param features Features.
     * @param options Options.
     * @return Node.
     */
    @JsMethod
    public native Node writeFeaturesNode(Feature[] features, FormatWriteOptions options);
}
