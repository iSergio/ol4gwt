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

package org.openlayers.ol.format.filter;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Extent;
import org.openlayers.ol.geom.Geometry;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.format", name = "filter")
public class FilterUtils {
    /**
     * Create a logical <And> operator between two or more filter conditions.
     * @param conditions Filter conditions.
     * @return <And> operator.
     */
    @JsMethod
    public static native AndFilter and(Filter... conditions);

    /**
     * Create a <BBOX> operator to test whether a geometry-valued property intersects a fixed bounding box
     * @param geometryName Geometry name to use.
     * @param extent Extent.
     * @return <BBOX> operator.
     */
    @JsMethod
    public static native BboxFilter bbox(String geometryName, Extent extent);

    /**
     * Create a <BBOX> operator to test whether a geometry-valued property intersects a fixed bounding box
     * @param geometryName Geometry name to use.
     * @param extent Extent.
     * @param srsName SRS name. No srsName attribute will be set on geometries when this is not provided.
     * @return <BBOX> operator.
     */
    @JsMethod
    public static native BboxFilter bbox(String geometryName, Extent extent, String srsName);

    /**
     * Creates a <PropertyIsBetween> comparison operator to test whether an expression value lies within a
     * range given by a lower and upper bound (inclusive).
     * @param propertyName  Name of the context property to compare.
     * @param lowerBoundary The lower bound of the range.
     * @param upperBoundary The upper bound of the range.
     * @return <PropertyIsBetween> operator.
     */
    @JsMethod
    public static native IsBetweenFilter between(String propertyName, double lowerBoundary, double upperBoundary);

    /**
     * Creates a <PropertyIsEqualTo> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @return <PropertyIsEqualTo> operator.
     */
    @JsMethod
    public static native EqualToFilter equalTo(String propertyName, String expression);

    /**
     * Creates a <PropertyIsEqualTo> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @param matchCase Case-sensitive?
     * @return <PropertyIsEqualTo> operator.
     */
    @JsMethod
    public static native EqualToFilter equalTo(String propertyName, String expression, boolean matchCase);

    /**
     * Creates a <PropertyIsGreaterThan> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @return <PropertyIsGreaterThan> operator.
     */
    @JsMethod
    public static native GreaterThanFilter greaterThan(String propertyName, double expression);

    /**
     * Creates a <PropertyIsGreaterThanOrEqualTo> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @return <PropertyIsGreaterThanOrEqualTo> operator.
     */
    @JsMethod
    public static native GreaterThanOrEqualToFilter greaterThanOrEqualTo(String propertyName, double expression);

    /**
     * Create a <Intersects> operator to test whether a geometry-valued property intersects a given geometry.
     * @param geometryName Geometry name to use.
     * @param geometry Geometry.
     * @return <Intersects> operator.
     */
    @JsMethod
    public static native IntersectsFilter intersects(String geometryName, Geometry geometry);

    /**
     * Create a <Intersects> operator to test whether a geometry-valued property intersects a given geometry.
     * @param geometryName Geometry name to use.
     * @param geometry Geometry.
     * @param srsName SRS name. No srsName attribute will be set on geometries when this is not provided.
     * @return <Intersects> operator.
     */
    @JsMethod
    public static native IntersectsFilter intersects(String geometryName, Geometry geometry, String srsName);

    /**
     * Creates a <PropertyIsNull> comparison operator to test whether a property value is null.
     * @param propertyName Name of the context property to compare.
     * @return <PropertyIsNull> operator.
     */
    @JsMethod
    public static native IsNullFilter isNull(String propertyName);

    /**
     * Creates a <PropertyIsLessThan> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @return <PropertyIsLessThan> operator.
     */
    @JsMethod
    public static native LessThanFilter lessThan(String propertyName, double expression);

    /**
     * Creates a <PropertyIsLessThanOrEqualTo> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @return <PropertyIsLessThanOrEqualTo> operator.
     */
    @JsMethod
    public static native LessThanOrEqualToFilter lessThanOrEqualTo(String propertyName, double expression);

    /**
     * Represents a <PropertyIsLike> comparison operator that matches a string property value against a text pattern.
     * @param propertyName Name of the context property to compare.
     * @param pattern Text pattern.
     * @return <PropertyIsLike> operator.
     */
    @JsMethod
    public static native IsLikeFilter like(String propertyName, String pattern);

    /**
     * Represents a <PropertyIsLike> comparison operator that matches a string property value against a text pattern.
     * @param propertyName Name of the context property to compare.
     * @param pattern Text pattern.
     * @param wildCard Pattern character which matches any sequence of zero or more string characters. Default is '*'.
     * @return <PropertyIsLike> operator.
     */
    @JsMethod
    public static native IsLikeFilter like(String propertyName, String pattern, String wildCard);

    /**
     * Represents a <PropertyIsLike> comparison operator that matches a string property value against a text pattern.
     * @param propertyName Name of the context property to compare.
     * @param pattern Text pattern.
     * @param wildCard Pattern character which matches any sequence of zero or more string characters. Default is '*'.
     * @param singleChar pattern character which matches any single string character. Default is '.'.
     * @return <PropertyIsLike> operator.
     */
    @JsMethod
    public static native IsLikeFilter like(String propertyName, String pattern, String wildCard, String singleChar);

    /**
     * Represents a <PropertyIsLike> comparison operator that matches a string property value against a text pattern.
     * @param propertyName Name of the context property to compare.
     * @param pattern Text pattern.
     * @param wildCard Pattern character which matches any sequence of zero or more string characters. Default is '*'.
     * @param singleChar pattern character which matches any single string character. Default is '.'.
     * @param escapeChar Escape character which can be used to escape the pattern characters. Default is '!'.
     * @return <PropertyIsLike> operator.
     */
    @JsMethod
    public static native IsLikeFilter like(String propertyName, String pattern, String wildCard, String singleChar, String escapeChar);

    /**
     * Represents a <PropertyIsLike> comparison operator that matches a string property value against a text pattern.
     * @param propertyName Name of the context property to compare.
     * @param pattern Text pattern.
     * @param wildCard Pattern character which matches any sequence of zero or more string characters. Default is '*'.
     * @param singleChar pattern character which matches any single string character. Default is '.'.
     * @param escapeChar Escape character which can be used to escape the pattern characters. Default is '!'.
     * @param matchCase Case-sensitive?
     * @return <PropertyIsLike> operator.
     */
    @JsMethod
    public static native IsLikeFilter like(String propertyName, String pattern, String wildCard, String singleChar, String escapeChar, boolean matchCase);

    /**
     * Represents a logical <Not> operator for a filter condition.
     * @param condition Filter condition.
     * @return <Not> operator.
     */
    @JsMethod
    public static native NotFilter not(Filter condition);

    /**
     * Creates a <PropertyIsNotEqualTo> comparison operator.
     * @param propertyName  Name of the context property to compare.
     * @param expression  The value to compare.
     * @return <PropertyIsNotEqualTo> operator.
     */
    @JsMethod
    public static native NotEqualToFilter notEqualTo(String propertyName, String expression);

    /**
     * Creates a <PropertyIsNotEqualTo> comparison operator.
     * @param propertyName  Name of the context property to compare.
     * @param expression  The value to compare.
     * @param matchCase Case-sensitive?
     * @return <PropertyIsNotEqualTo> operator.
     */
    @JsMethod
    public static native NotEqualToFilter notEqualTo(String propertyName, String expression, boolean matchCase);

    /**
     * Creates a <PropertyIsNotEqualTo> comparison operator.
     * @param propertyName  Name of the context property to compare.
     * @param expression  The value to compare.
     * @return <PropertyIsNotEqualTo> operator.
     */
    @JsMethod
    public static native NotEqualToFilter notEqualTo(String propertyName, double expression);

    /**
     * Creates a <PropertyIsNotEqualTo> comparison operator.
     * @param propertyName  Name of the context property to compare.
     * @param expression  The value to compare.
     * @param matchCase Case-sensitive?
     * @return <PropertyIsNotEqualTo> operator.
     */
    @JsMethod
    public static native NotEqualToFilter notEqualTo(String propertyName, double expression, boolean matchCase);

    /**
     * Create a logical <Or> operator between two or more filter conditions.
     * @param conditions Filter conditions.
     * @return <Or> operator.
     */
    @JsMethod
    public static native OrFilter or(Filter... conditions);

    /**
     * Create a <Within> operator to test whether a geometry-valued property is within a given geometry.
     * @param geometryName Geometry name to use.
     * @param geometry Geometry.
     * @return <Within> operator.
     */
    @JsMethod
    public static native WithinFilter within(String geometryName, Geometry geometry);

    /**
     * Create a <Within> operator to test whether a geometry-valued property is within a given geometry.
     * @param geometryName Geometry name to use.
     * @param geometry Geometry.
     * @param srsName SRS name. No srsName attribute will be set on geometries when this is not provided.
     * @return <Within> operator.
     */
    @JsMethod
    public static native WithinFilter within(String geometryName, Geometry geometry, String srsName);
}
