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
import org.openlayers.ol.style.Style;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ModifyInteractionOptions {
    /**
     * A function that takes an ol.MapBrowserEvent and returns a boolean to indicate whether that event will be
     * considered to add or move a vertex to the sketch. Default is {@link Condition#primaryAction()}.
     */
    @JsProperty
    public EventsConditionType condition;
    /**
     * A function that takes an ol.MapBrowserEvent and returns a boolean to indicate whether that event should be handled.
     * By default, {@link Condition#singleClick()} with {@link Condition#noModifierKeys()} results in a vertex deletion.
     */
    @JsProperty
    public EventsConditionType deleteCondition;
    /**
     * Pixel tolerance for considering the pointer close enough to a segment or vertex for editing. Default is 10.
     */
    double pixelTolerance;
    /**
     * Style used for the features being modified. By default the default edit style is used (see {@link Style}).
     */
    @JsProperty(name = "style")
    public Style style;
    /**
     * Style used for the features being modified. By default the default edit style is used (see {@link Style}).
     */
    @JsProperty(name = "styles")
    public Style[] styles;
    /**
     * Style used for the features being modified. By default the default edit style is used (see {@link Style}).
     */
    @JsProperty(name = "styleFunction")
    public StyleFunction styleFunction;
    /**
     * The features the interaction works on. Required.
     */
    @JsProperty
    public Collection<Feature> features;
    /**
     * Wrap the world horizontally on the sketch overlay. Default is false.
     */
    @JsProperty
    public boolean wrapX;

    @JsConstructor
    public ModifyInteractionOptions() {}
}
