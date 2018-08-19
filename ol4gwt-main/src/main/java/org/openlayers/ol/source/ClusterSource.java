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
import org.openlayers.ol.source.options.ClusterSourceOptions;

/**
 * Layer source to cluster vector data. Works out of the box with point geometries.
 * For other geometry types, or if not all geometries should be considered for clustering,
 * a custom geometryFunction can be defined.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.source", name = "Cluster")
public class ClusterSource extends VectorSource {
    @JsConstructor
    public ClusterSource(ClusterSourceOptions options) {}

    /**
     * Get a reference to the wrapped source.
     * @return Source.
     */
    @JsMethod
    public native VectorSource getSource();

    /**
     * Set the distance in pixels between clusters.
     * @param distance The distance in pixels.
     */
    @JsMethod
    public native void setDistance(double distance);
}
