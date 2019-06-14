package org.openlayers.ol.render;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.canvas.dom.client.Context2d;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Feature;
import org.openlayers.ol.geom.SimpleGeometry;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class State {
    /**
     * Canvas context that the layer is being rendered to.
     */
    @JsProperty
    public Context2d context;
    @JsProperty
    public Feature feature;
    @JsProperty
    public SimpleGeometry geometry;
    /**
     * Pixel ratio used by the layer renderer.
     */
    @JsProperty
    public double pixelRatio;
    /**
     * Resolution that the render batch was created and optimized for. This is not the view's resolution that is being rendered.
     */
    @JsProperty
    public double resolution;
    /**
     * Rotation of the rendered layer in radians.
     */
    @JsProperty
    public double rotation;
}
