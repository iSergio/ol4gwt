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
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Feature;
import org.openlayers.ol.Object;
import org.openlayers.ol.format.options.FormatReadOptions;
import org.openlayers.ol.format.options.FormatWriteOptions;
import org.openlayers.ol.format.options.KMLFormatOptions;
import org.openlayers.ol.proj.Projection;

/**
 * Feature format for reading and writing data in the KML format.
 *
 * Note that the KML format uses the URL() constructor. Older browsers such as IE which do not support this
 * will need a URL polyfill to be loaded before use.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.format", name = "KML")
public class KMLFormat extends XMLFeatureFormat {
    @JsConstructor
    public KMLFormat() {}

    @JsConstructor
    public KMLFormat(KMLFormatOptions options) {}

    /**
     * Read the first feature from a KML source. MultiGeometries are converted into GeometryCollections if they are a
     * mix of geometry types, and into MultiPoint/ MultiLineString/MultiPolygon if they are all of the same type.
     * @param source Source.
     * @return Feature.
     */
    @JsMethod
    public native Feature readFeature(String source);

    /**
     * Read the first feature from a KML source. MultiGeometries are converted into GeometryCollections if they are a
     * mix of geometry types, and into MultiPoint/ MultiLineString/MultiPolygon if they are all of the same type.
     * @param source Source.
     * @param options Read options.
     * @return Feature.
     */
    @JsMethod
    public native Feature readFeature(String source, FormatReadOptions options);

    /**
     * Read the first feature from a KML source. MultiGeometries are converted into GeometryCollections if they are a
     * mix of geometry types, and into MultiPoint/ MultiLineString/MultiPolygon if they are all of the same type.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format is assigned (where set).
     *                       If the projection can not be derived from the data and if no defaultDataProjection is
     *                       set for a format, the features will not be reprojected.
     * @param featureProjection Projection of the feature geometries created by the format reader. If not provided,
     *                          features will be returned in the dataProjection.
     * @return Feature.
     */
    @JsOverlay
    public Feature readFeature(String source, Projection dataProjection, Projection featureProjection) {
        FormatReadOptions options = new FormatReadOptions();
        options.dataProjection = dataProjection;
        options.featureProjection = featureProjection;
        return readFeature(source, options);
    }

    /**
     * Read the first feature from a KML source. MultiGeometries are converted into GeometryCollections if they are a
     * mix of geometry types, and into MultiPoint/ MultiLineString/MultiPolygon if they are all of the same type.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format is assigned (where set).
     *                       If the projection can not be derived from the data and if no defaultDataProjection is
     *                       set for a format, the features will not be reprojected.
     * @param featureProjection Projection of the feature geometries created by the format reader. If not provided,
     *                          features will be returned in the dataProjection.
     * @return Feature.
     */
    @JsOverlay
    public Feature readFeature(String source, String dataProjection, String featureProjection) {
        FormatReadOptions options = new FormatReadOptions();
        options.dataProjection = Projection.create(dataProjection);
        options.featureProjection = Projection.create(featureProjection);
        return readFeature(source, options);
    }

    /**
     * Read all features from a KML source. MultiGeometries are converted into GeometryCollections if they are a mix of
     * geometry types, and into MultiPoint/ MultiLineString/MultiPolygon if they are all of the same type.
     * @param source Source.
     * @return Features.
     */
    @JsMethod
    public native Feature[] readFeatures(String source);

    /**
     * Read all features from a KML source. MultiGeometries are converted into GeometryCollections if they are a mix of
     * geometry types, and into MultiPoint/ MultiLineString/MultiPolygon if they are all of the same type.
     * @param source Source.
     * @param options Read options.
     * @return Features.
     */
    @JsMethod
    public native Feature[] readFeatures(String source, FormatReadOptions options);

    /**
     * Read all features from a KML source. MultiGeometries are converted into GeometryCollections if they are a mix of
     * geometry types, and into MultiPoint/ MultiLineString/MultiPolygon if they are all of the same type.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format is assigned (where set).
     *                       If the projection can not be derived from the data and if no defaultDataProjection is
     *                       set for a format, the features will not be reprojected.
     * @param featureProjection Projection of the feature geometries created by the format reader. If not provided,
     *                          features will be returned in the dataProjection.
     * @return Feature.
     */
    @JsOverlay
    public Feature[] readFeatures(String source, Projection dataProjection, Projection featureProjection) {
        FormatReadOptions options = new FormatReadOptions();
        options.dataProjection = dataProjection;
        options.featureProjection = featureProjection;
        return readFeatures(source, options);
    }

    /**
     * Read all features from a KML source. MultiGeometries are converted into GeometryCollections if they are a mix of
     * geometry types, and into MultiPoint/ MultiLineString/MultiPolygon if they are all of the same type.
     * @param source Source.
     * @param dataProjection Projection of the data we are reading. If not provided, the projection will be derived
     *                       from the data (where possible) or the defaultDataProjection of the format is assigned (where set).
     *                       If the projection can not be derived from the data and if no defaultDataProjection is
     *                       set for a format, the features will not be reprojected.
     * @param featureProjection Projection of the feature geometries created by the format reader. If not provided,
     *                          features will be returned in the dataProjection.
     * @return Feature.
     */
    @JsOverlay
    public Feature[] readFeatures(String source, String dataProjection, String featureProjection) {
        FormatReadOptions options = new FormatReadOptions();
        options.dataProjection = Projection.create(dataProjection);
        options.featureProjection = Projection.create(featureProjection);
        return readFeatures(source, options);
    }

    /**
     * Read the name of the KML.
     * @param source Souce.
     * @return Name.
     */
    @JsMethod
    public native String readName(String source);

    /**
     * Read the network links of the KML.
     * @param source Source.
     * @return Network links.
     */
    @JsMethod
    public native Object[] readNetworkLinks(String source);

    /**
     * Read the projection from a KML source.
     * @param source Source.
     * @return Projection.
     */
    @JsMethod
    public native Projection readProjection(String source);

    /**
     * Read the regions of the KML.
     * @param source Source.
     * @return Regions.
     */
    @JsMethod
    public native Object[] readRegion(String source);

    /**
     *
     * @param node Node.
     * @return Region.
     */
    @JsMethod
    public native Object[] readRegionFromNode(Node node);

    /**
     * Encode an array of features in the KML format. GeometryCollections, MultiPoints, MultiLineStrings,
     * and MultiPolygons are output as MultiGeometries.
     * @param features Features.
     * @return Result.
     */
    @JsMethod
    public native String writeFeatures(Feature[] features);

    /**
     * Encode an array of features in the KML format. GeometryCollections, MultiPoints, MultiLineStrings,
     * and MultiPolygons are output as MultiGeometries.
     * @param features Features.
     * @param options Options.
     * @return Result.
     */
    @JsMethod
    public native String writeFeatures(Feature[] features, FormatWriteOptions options);

    /**
     * Encode an array of features in the KML format as an XML node. GeometryCollections, MultiPoints, MultiLineStrings,
     * and MultiPolygons are output as MultiGeometries.
     * @param features Features.
     * @return Node.
     */
    @JsMethod
    public native Node writeFeaturesNode(Feature[] features);

    /**
     * Encode an array of features in the KML format as an XML node. GeometryCollections, MultiPoints, MultiLineStrings,
     * and MultiPolygons are output as MultiGeometries.
     * @param features Features.
     * @param options Options.
     * @return Node.
     */
    @JsMethod
    public native Node writeFeaturesNode(Feature[] features, FormatWriteOptions options);
}
