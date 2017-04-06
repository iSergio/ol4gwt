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

package org.openlayers.ol.control;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.control.options.ControlOptions;
import org.openlayers.ol.control.options.ScaleLineControlOptions;
import org.openlayers.ol.events.MapEvent;

/**
 * A control displaying rough y-axis distances, calculated for the center of the viewport. For conformal projections
 * (e.g. EPSG:3857, the default view projection in OpenLayers), the scale is valid for all directions.
 * No scale line will be shown when the y-axis distance of a pixel at the viewport center cannot be calculated in
 * the view projection. By default the scale line will show in the bottom left portion of the map,
 * but this can be changed by using the css selector .ol-scale-line.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.control", name = "ScaleLine")
public class ScaleLineControl extends Control {
    @JsConstructor
    public ScaleLineControl() {
        super(new ScaleLineControlOptions());
    }

    @JsConstructor
    public ScaleLineControl(ScaleLineControlOptions options) {
        super(options);
    }

    /**
     * Update the scale line element.
     * @param mapEvent Map event.
     */
    @JsMethod
    public static native void render(MapEvent mapEvent);

    /**
     * Return {@link ScaleLineUnits} the units to use in the scale line.
     * @return The units to use in the scale line.
     */
    @JsMethod
    public native String getUnits();

    /**
     * Set the units to use in the scale line.
     * @param units {@link ScaleLineUnits} The units to use in the scale line.
     */
    @JsMethod
    public native void setUnits(String units);
}
