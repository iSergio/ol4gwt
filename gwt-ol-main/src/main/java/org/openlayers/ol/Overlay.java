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

package org.openlayers.ol;

import com.google.gwt.dom.client.Element;
import jsinterop.annotations.*;
import org.openlayers.ol.events.ObjectEvent;
import org.openlayers.ol.options.OverlayOptions;

/**
 * An element to be displayed over the map and attached to a single map location. Like {@link org.openlayers.ol.control.Control},
 * Overlays are visible widgets. Unlike Controls, they are not in a fixed position on the screen,
 * but are tied to a geographical coordinate, so panning the map will move an Overlay but not a Control.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol", name = "Object")
public class Overlay extends Object {
    @JsConstructor
    public Overlay(OverlayOptions options) {}

    /**
     * Get the DOM element of this overlay
     * @return The Element containing the overlay.
     */
    @JsMethod
    public native Element getElement();

    /**
     * Get the overlay identifier which is set on constructor.
     * @return Id.
     */
    @JsMethod
    public native String getId();

    /**
     * Get the map associated with this overlay.
     * @return The map that the overlay is part of.
     */
    @JsMethod
    public native Map getMap();

    /**
     * Get the offset of this overlay.
     * @return The offset.
     */
    @JsMethod
    public native double[] getOffset();

    /**
     * Get the current position of this overlay.
     * @return The spatial point that the overlay is anchored at.
     */
    @JsMethod
    public native Coordinate getPosition();

    /**
     * Get the current positioning of this overlay.
     * {@link OverlayPositioning}
     * @return How the overlay is positioned relative to its point on the map.
     */
    @JsMethod
    public native String getPositioning();

    /**
     * Set the DOM element to be associated with this overlay.
     * @param element The Element containing the overlay.
     */
    @JsMethod
    public native void setElement(Element element);

    /**
     * Set the map to be associated with this overlay.
     * @param map The map that the overlay is part of.
     */
    @JsMethod
    public native void setMap(Map map);

    /**
     * Set the offset for this overlay.
     * @param offset Offset.
     */
    @JsMethod
    public native void setOffset(double[] offset);

    /**
     * Set the position for this overlay. If the position is undefined the overlay is hidden.
     * @param position The spatial point that the overlay is anchored at.
     */
    @JsMethod
    public native void setPosition(Coordinate position);

    /**
     * Set the positioning for this overlay.
     * @param positioning {@link OverlayPositioning} how the overlay is positioned relative to its point on the map.
     */
    @JsMethod
    public native void setPositioning(String positioning);

    @JsFunction
    public interface ChangeElementListener {
        @JsOverlay
        String TYPE = "change:element";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }

    @JsFunction
    public interface ChangeMapListener {
        @JsOverlay
        String TYPE = "change:map";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }

    @JsFunction
    public interface ChangeOffsetListener {
        @JsOverlay
        String TYPE = "change:offset";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }

    @JsFunction
    public interface ChangePositionListener {
        @JsOverlay
        String TYPE = "change:position";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }

    @JsFunction
    public interface ChangePositioningListener {
        @JsOverlay
        String TYPE = "change:positioning";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }
}
