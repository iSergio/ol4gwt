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

package org.openlayers.ol.source.options;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Attribution;
import org.openlayers.ol.Extent;
import org.openlayers.ol.Feature;
import org.openlayers.ol.format.FeatureFormat;
import org.openlayers.ol.geom.Point;
import org.openlayers.ol.geom.Polygon;
import org.openlayers.ol.proj.Projection;
import org.openlayers.ol.source.VectorSource;

/**
 * {@link org.openlayers.ol.source.ClusterSource} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ClusterSourceOptions extends SourceOptions {
    /**
     * Attributions.
     */
    public Attribution attributions;
    /**
     * Minimum distance in pixels between clusters. Default is 20.
     */
    public double distance;
    /**
     * Extent.
     */
    public Extent extent;
    /**
     * Function that takes an ol.Feature as argument and returns an ol.geom.Point as cluster calculation point for the
     * feature. When a feature should not be considered for clustering, the function should return null.
     *
     * See {@link Polygon#getInteriorPoint()} for a way to get a cluster calculation point for polygons.
     */
    public GeometryFunction geometryFunction;
    /**
     * Format.
     */
    public FeatureFormat format;
    /**
     * Logo.
     */
    public String logo;
    /**
     * Projection.
     */
    public Projection projection;
    /**
     * Source. Required.
     */
    public VectorSource source;
    /**
     * WrapX. Default is true
     */
    public boolean wrapX;

    @JsConstructor
    public ClusterSourceOptions() {}

    @JsFunction
    public interface GeometryFunction {
        Point function(Feature feature);
    }
}
