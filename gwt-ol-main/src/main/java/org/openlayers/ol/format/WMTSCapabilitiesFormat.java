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

import com.google.gwt.xml.client.Document;
import com.google.gwt.xml.client.Node;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Object;

/**
 * Format for reading WMTS capabilities data.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.format", name = "WMTSCapabilities")
public class WMTSCapabilitiesFormat extends XMLFormat {
    @JsConstructor
    public WMTSCapabilitiesFormat() {}

    /**
     * Read a WMTS capabilities document.
     * @param source The XML source.
     * @return An object representing the WMTS capabilities.
     */
    @JsMethod
    public native Object read(String source);

    /**
     * Read a WMTS capabilities document.
     * @param source The XML source.
     * @return An object representing the WMTS capabilities.
     */
    @JsMethod
    public native Object read(Document source);

    /**
     * Read a WMTS capabilities document.
     * @param source The XML source.
     * @return An object representing the WMTS capabilities.
     */
    @JsMethod
    public native Object read(Node source);
}
