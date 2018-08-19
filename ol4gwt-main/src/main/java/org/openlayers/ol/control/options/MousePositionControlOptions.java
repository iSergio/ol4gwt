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

package org.openlayers.ol.control.options;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.CoordinateFormatType;
import org.openlayers.ol.proj.Projection;

/**
 * {@link org.openlayers.ol.control.MousePositionControl} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class MousePositionControlOptions extends ControlOptions {
    /**
     * CSS class name. Default is ol-mouse-position.
     */
    @JsProperty
    public String className;
    /**
     * Coordinate format.
     */
    @JsProperty
    public CoordinateFormatType coordinateFormat;
    /**
     * Projection.
     */
    @JsProperty
    public Projection projection;
    /**
     * Markup for undefined coordinates. Default is `` (empty string).
     */
    @JsProperty
    public String undefinedHTML;

    @JsConstructor
    public MousePositionControlOptions() {}
}
