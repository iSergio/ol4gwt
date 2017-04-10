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

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;

/**
 * Represents a <PropertyIsLike> comparison operator.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.format.filter", name = "IsLike")
public class IsLikeFilter extends ComparisonFilter {
    /**
     *
     * @param propertyName Name of the context property to compare.
     * @param pattern Text pattern.
     */
    @JsConstructor
    public IsLikeFilter(String propertyName, String pattern) {}

    /**
     *
     * @param propertyName Name of the context property to compare.
     * @param pattern Text pattern.
     * @param wildCard Pattern character which matches any sequence of zero or more string characters. Default is '*'.
     */
    @JsConstructor
    public IsLikeFilter(String propertyName, String pattern, String wildCard) {}

    /**
     *
     * @param propertyName Name of the context property to compare.
     * @param pattern Text pattern.
     * @param wildCard Pattern character which matches any sequence of zero or more string characters. Default is '*'.
     * @param singleChar pattern character which matches any single string character. Default is '.'.
     */
    @JsConstructor
    public IsLikeFilter(String propertyName, String pattern, String wildCard, String singleChar) {}

    /**
     *
     * @param propertyName Name of the context property to compare.
     * @param pattern Text pattern.
     * @param wildCard Pattern character which matches any sequence of zero or more string characters. Default is '*'.
     * @param singleChar pattern character which matches any single string character. Default is '.'.
     * @param escapeChar Escape character which can be used to escape the pattern characters. Default is '!'.
     */
    @JsConstructor
    public IsLikeFilter(String propertyName, String pattern, String wildCard, String singleChar, String escapeChar) {}

    /**
     *
     * @param propertyName Name of the context property to compare.
     * @param pattern Text pattern.
     * @param wildCard Pattern character which matches any sequence of zero or more string characters. Default is '*'.
     * @param singleChar pattern character which matches any single string character. Default is '.'.
     * @param escapeChar Escape character which can be used to escape the pattern characters. Default is '!'.
     * @param matchCase Case-sensitive?
     */
    @JsConstructor
    public IsLikeFilter(String propertyName, String pattern, String wildCard, String singleChar, String escapeChar, boolean matchCase) {}
}
