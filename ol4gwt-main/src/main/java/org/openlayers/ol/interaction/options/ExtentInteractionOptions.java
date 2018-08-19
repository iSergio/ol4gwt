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

package org.openlayers.ol.interaction.options;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Extent;
import org.openlayers.ol.StyleFunction;
import org.openlayers.ol.style.Style;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ExtentInteractionOptions {
    /**
     * Initial extent. Defaults to no inital extent
     */
    @JsProperty
    public Extent extent;
    /**
     * Style for the drawn extent box. Defaults to ol.style.Style.createDefaultEditing()[ol.geom.GeometryType.POLYGON]
     */
    @JsProperty(name = "boxStyle")
    public Style boxStyle;
    /**
     * Style for the drawn extent box. Defaults to ol.style.Style.createDefaultEditing()[ol.geom.GeometryType.POLYGON]
     */
    @JsProperty(name = "boxStyleArray")
    public Style[] boxStyleArray;
    /**
     * Style for the drawn extent box. Defaults to ol.style.Style.createDefaultEditing()[ol.geom.GeometryType.POLYGON]
     */
    @JsProperty(name = "boxStyleFunction")
    public StyleFunction boxStyleFunction;
    /**
     * Style for the cursor used to draw the extent. Defaults to ol.style.Style.createDefaultEditing()[ol.geom.GeometryType.POINT]
     */
    @JsProperty(name = "pointerStyle")
    public Style pointerStyle;
    /**
     * Style for the cursor used to draw the extent. Defaults to ol.style.Style.createDefaultEditing()[ol.geom.GeometryType.POINT]
     */
    @JsProperty(name = "pointerStyleArray")
    public Style[] pointerStyleArray;
    /**
     * Style for the cursor used to draw the extent. Defaults to ol.style.Style.createDefaultEditing()[ol.geom.GeometryType.POINT]
     */
    @JsProperty(name = "pointerStyleFunction")
    public StyleFunction pointerStyleFunction;
    /**
     * Wrap the drawn extent across multiple maps in the X direction? Only affects visuals, not functionality. Defaults to false.
     */
    @JsProperty
    public boolean wrapX;

    @JsConstructor
    public ExtentInteractionOptions() {}
}
