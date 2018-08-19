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
import org.openlayers.ol.*;
import org.openlayers.ol.events.Condition;
import org.openlayers.ol.source.VectorSource;
import org.openlayers.ol.style.Style;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class DrawInteractionOptions {
    /**
     * The maximum distance in pixels between "down" and "up" for a "up" event to be considered a "click"
     * event and actually add a point/vertex to the geometry being drawn. Default is 6 pixels.
     * That value was chosen for the draw interaction to behave correctly on mouse as well as on touch devices.
     */
    @JsProperty
    public double clickTolerance;
    /**
     * Destination collection for the drawn features.
     */
    @JsProperty
    public Collection<Feature> features;
    /**
     * Destination source for the drawn features.
     */
    @JsProperty
    public VectorSource source;
    /**
     * Pixel distance for snapping to the drawing finish. Default is 12.
     */
    @JsProperty
    public double snapTolerance;
    /**
     * Drawing type ('Point', 'LineString', 'Polygon', 'MultiPoint', 'MultiLineString', 'MultiPolygon' or 'Circle'). Required.
     */
    @JsProperty
    public String type;
    /**
     * The number of points that can be drawn before a polygon ring or line string is finished.
     * The default is no restriction.
     */
    @JsProperty
    public int maxPoints;
    /**
     * The number of points that must be drawn before a polygon ring or line string can be finished.
     * Default is 3 for polygon rings and 2 for line strings.
     */
    @JsProperty
    public int minPoints;
    /**
     * A function that takes an ol.MapBrowserEvent and returns a boolean to indicate whether the drawing can be finished.
     */
    @JsProperty
    public EventsConditionType finishCondition;
    /**
     * Style for sketch features.
     */
    @JsProperty
    public Style[] style;
    /**
     * Style for sketch features.
     */
    @JsProperty
    public StyleFunction styleFunction;
    /**
     * Function that is called when a geometry's coordinates are updated.
     */
    @JsProperty
    public DrawGeometryFunctionType geometryFunction;
    /**
     * Geometry name to use for features created by the draw interaction.
     */
    @JsProperty
    public String geometryName;
    /**
     * A function that takes an {@link org.openlayers.ol.events.MapBrowserEvent} and returns a boolean to indicate whether that event should be handled.
     * By default {@link Condition#noModifierKeys()}, i.e. a click, adds a vertex or deactivates freehand drawing.
     */
    @JsProperty
    public EventsConditionType condition;
    /**
     * Operate in freehand mode for lines, polygons, and circles. This makes the interaction always operate in
     * freehand mode and takes precedence over any freehandCondition option.
     */
    @JsProperty
    public boolean freehand;
    /**
     * Condition that activates freehand drawing for lines and polygons. This function takes an {@link org.openlayers.ol.events.MapBrowserEvent} and r
     * eturns a boolean to indicate whether that event should be handled.
     * The default is {@link Condition#shiftKeyOnly()}, meaning that the Shift key activates freehand drawing.
     */
    @JsProperty
    public EventsConditionType freehandCondition;
    /**
     * Wrap the world horizontally on the sketch overlay. Default is false.
     */
    @JsProperty
    public boolean wrapX;

    @JsConstructor
    public DrawInteractionOptions() {}
}
