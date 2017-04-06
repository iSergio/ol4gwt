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
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.CoordinateFormatType;
import org.openlayers.ol.control.options.MousePositionControlOptions;
import org.openlayers.ol.events.MapEvent;
import org.openlayers.ol.events.ObjectEvent;
import org.openlayers.ol.proj.Projection;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.control", name = "MousePosition")
public class MousePositionControl extends Control {
    @JsConstructor
    public MousePositionControl() {
        super(new MousePositionControlOptions());
    }

    @JsConstructor
    public MousePositionControl(MousePositionControlOptions options) {
        super(options);
    }

    /**
     * Update the mouseposition element.
     * @param mapEvent Map event.
     */
    @JsMethod
    public static native void render(MapEvent mapEvent);

    /**
     * Return the coordinate format type used to render the current position or undefined.
     * @return The format to render the current position in.
     */
    @JsMethod
    public native CoordinateFormatType getCoordinateFormat();

    /**
     * Return the projection that is used to report the mouse position.
     * @return The projection to report mouse position in.
     */
    @JsMethod
    public native Projection getProjection();

    /**
     * Set the coordinate format type used to render the current position.
     * @param format The format to render the current position in.
     */
    @JsMethod
    public native void setCoordinateFormat(CoordinateFormatType format);

    /**
     * Set the projection that is used to report the mouse position.
     * @param projection The projection to report mouse position in.
     */
    @JsMethod
    public native void setProjection(Projection projection);

    @JsFunction
    public interface ChangeCoordinateFormatListener {
        String TYPE = "change:coordinateFormat";
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }

    @JsFunction
    public interface ChangeProjectionListener {
        String TYPE = "change:projection";
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }
}
