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

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Object;

/**
 * {@link org.openlayers.ol.format.GMLFormat} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class GMLFormatOptions {
    /**
     * Feature namespace. If not defined will be derived from GML. If multiple feature types have been configured which
     * come from different feature namespaces, this will be an object with the keys being the prefixes used in the
     * entries of featureType array. The values of the object will be the feature namespaces themselves.
     * So for instance there might be a featureType item topp:states in the featureType array and then there will
     * be a key topp in the featureNS object with value http://www.openplans.org/topp.
     */
    @JsProperty
    public Object featureNS;
    /**
     * Feature namespace. If not defined will be derived from GML. If multiple feature types have been configured which
     * come from different feature namespaces, this will be an object with the keys being the prefixes used in the
     * entries of featureType array. The values of the object will be the feature namespaces themselves.
     * So for instance there might be a featureType item topp:states in the featureType array and then there will
     * be a key topp in the featureNS object with value http://www.openplans.org/topp.
     */
    @JsProperty(name = "featureNS")
    public String featureNSStr;
    /**
     * Feature type(s) to parse. If multiple feature types need to be configured which come from different feature namespaces,
     * featureNS will be an object with the keys being the prefixes used in the entries of featureType array.
     * The values of the object will be the feature namespaces themselves. So for instance there might be a featureType
     * item topp:states and then there will be a key named topp in the featureNS object with value http://www.openplans.org/topp.
     */
    @JsProperty
    public String[] featureType;
    /**
     * srsName to use when writing geometries. Required.
     */
    @JsProperty
    public String srsName;
    /**
     * Write gml:Surface instead of gml:Polygon elements. This also affects the elements in multi-part geometries. Default is false.
     */
    @JsProperty
    public boolean surface;
    /**
     * Write gml:Curve instead of gml:LineString elements. This also affects the elements in multi-part geometries. Default is false.
     */
    @JsProperty
    public boolean curve;
    /**
     * Write gml:MultiCurve instead of gml:MultiLineString. Since the latter is deprecated in GML 3, the default is true.
     */
    @JsProperty
    public boolean multiCurve;
    /**
     * Write gml:multiSurface instead of gml:MultiPolygon. Since the latter is deprecated in GML 3, the default is true.
     */
    @JsProperty
    public boolean multiSurface;
    /**
     * Optional schemaLocation to use when writing out the GML, this will override the default provided.
     */
    @JsProperty
    public String schemaLocation;

    @JsConstructor
    public GMLFormatOptions() {}
}
