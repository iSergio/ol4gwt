package org.openlayers.ol.events;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Feature;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.interaction", name = "Event")
public class SelectEvent extends Event {
    /**
     * Deselected features array.
     */
    @JsProperty
    public Feature[] deselected;

    /**
     * Selected features array.
     */
    @JsProperty
    public Feature[] selected;

    @JsConstructor
    private SelectEvent() {
        super();
    }
}
