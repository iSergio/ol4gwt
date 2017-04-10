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

package org.openlayers.ol.proj;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Extent;
import org.openlayers.ol.proj.options.ProjectionOptions;

/**
 * Projection definition class. One of these is created for each projection supported in the application and stored in
 * the ol.proj namespace. You can use these in applications, but this is not required, as API params and options
 * use ol.ProjectionLike which means the simple string code will suffice.
 *
 * You can use ol.proj.get to retrieve the object for a particular projection.
 *
 * The library includes definitions for EPSG:4326 and EPSG:3857, together with the following aliases:
 *  EPSG:4326: CRS:84, urn:ogc:def:crs:EPSG:6.6:4326, urn:ogc:def:crs:OGC:1.3:CRS84, urn:ogc:def:crs:OGC:2:84, http://www.opengis.net/gml/srs/epsg.xml#4326, urn:x-ogc:def:crs:EPSG:4326
 *  EPSG:3857: EPSG:102100, EPSG:102113, EPSG:900913, urn:ogc:def:crs:EPSG:6.18:3:3857, http://www.opengis.net/gml/srs/epsg.xml#3857
 * If you use proj4js, aliases can be added using proj4.defs(); see documentation. To set an alternative namespace for proj4, use ol.proj.setProj4.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.proj", name = "Projection")
public class Projection {
    @JsConstructor
    public Projection(ProjectionOptions options) {}

    public static Projection create(String code) {
        ProjectionOptions options = new ProjectionOptions();
        options.code = code;
        return new Projection(options);
    }

    /**
     * Get the code for this projection, e.g. 'EPSG:4326'.
     * @return Code.
     */
    @JsMethod
    public native String getCode();

    /**
     * Get the validity extent for this projection.
     * @return Extent.
     */
    @JsMethod
    public native Extent getExtent();

    /**
     * Get the amount of meters per unit of this projection. If the projection is not configured with metersPerUnit or
     * a units identifier, the return is undefined.
     * @return Meters.
     */
    @JsMethod
    public native double getMetersPerUnit();

    /**
     * Get the units of this projection.
     * @return {@link Units}.
     */
    @JsMethod
    public native String getUnits();

    /**
     * Get the world extent for this projection.
     * @return Extent.
     */
    @JsMethod
    public native Extent getWorldExtent();

    /**
     * Is this projection a global projection which spans the whole world?
     * @return Whether the projection is global.
     */
    @JsMethod
    public native boolean isGlobal();

    /**
     * Set the validity extent for this projection.
     * @param extent Extent.
     */
    @JsMethod
    public native void setExtent(Extent extent);

// TODO: setGetPointResolution
//    public native setGetPointResolution(func)

    /**
     * Set if the projection is a global projection which spans the whole world
     * @param global Whether the projection is global.
     */
    @JsMethod
    public native void setGlobal(boolean global);

    /**
     * Set the world extent for this projection.
     * @param worldExtent World extent [minlon, minlat, maxlon, maxlat].
     */
    @JsMethod
    public native void setWorldExtent(Extent worldExtent);
}
