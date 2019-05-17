package org.openlayers.ol.render;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Feature;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "render")
public class Render {
    /**
     * A function to be used when sorting features before rendering. It takes two instances of {@link Feature} or module:ol/render/Feature and returns a {number}.
     */
    @JsFunction
    public interface OrderFunction {
        int function(Feature a, Feature b);
    }
}