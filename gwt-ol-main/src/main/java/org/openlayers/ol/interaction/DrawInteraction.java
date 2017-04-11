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

package org.openlayers.ol.interaction;

import jsinterop.annotations.*;
import org.openlayers.ol.DrawGeometryFunctionType;
import org.openlayers.ol.Feature;
import org.openlayers.ol.events.DrawInteractionEvent;
import org.openlayers.ol.events.MapBrowserEvent;
import org.openlayers.ol.geom.GeometryType;
import org.openlayers.ol.interaction.options.DrawInteractionOptions;
import org.openlayers.ol.source.VectorSource;

/**
 * Interaction for drawing feature geometries.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.interaction", name = "Draw")
public class DrawInteraction extends PointerInteraction {
    @JsConstructor
    public DrawInteraction(DrawInteractionOptions options) {}

    /**
     * Create DrawInteraction instance by required {@link GeometryType}.
     * @param geometryType geometry type.
     * @return DrawInteraction instance.
     */
    @JsOverlay
    public static DrawInteraction create(VectorSource source, GeometryType geometryType) {
        DrawInteractionOptions options = new DrawInteractionOptions();
        options.source = source;
        options.type = geometryType.toString();
        return new DrawInteraction(options);
    }

    /**
     * Create DrawInteraction instance by required {@link GeometryType}.
     * @param geometryType geometry type.
     * @return DrawInteraction instance.
     */
    @JsOverlay
    public static DrawInteraction create(GeometryType geometryType) {
        DrawInteractionOptions options = new DrawInteractionOptions();
        options.type = geometryType.toString();
        return new DrawInteraction(options);
    }

    /**
     * Create a geometryFunction that will create a box-shaped polygon (aligned with the coordinate system axes).
     * Use this with the draw interaction and type: 'Circle' to return a box instead of a circle geometry.
     * @return Function that draws a box-shaped polygon.
     */
    @JsMethod
    public static native DrawGeometryFunctionType createBox();

    /**
     * Create a geometryFunction for type: 'Circle' that will create a regular polygon with a user specified number of
     * sides and start angle instead of an ol.geom.Circle geometry.
     * @return Function that draws a polygon.
     */
    @JsMethod
    public static native DrawGeometryFunctionType createRegularPolygon();

    /**
     * Create a geometryFunction for type: 'Circle' that will create a regular polygon with a user specified number of
     * sides and start angle instead of an ol.geom.Circle geometry.
     * @param sides Number of sides of the regular polygon. Default is 32.
     * @return Function that draws a polygon.
     */
    @JsMethod
    public static native DrawGeometryFunctionType createRegularPolygon(int sides);

    /**
     * Create a geometryFunction for type: 'Circle' that will create a regular polygon with a user specified number of
     * sides and start angle instead of an ol.geom.Circle geometry.
     * @param sides Number of sides of the regular polygon. Default is 32.
     * @param angle Angle of the first point in radians. 0 means East. Default is the angle defined by the heading
     *              from the center of the regular polygon to the current pointer position.
     * @return Function that draws a polygon.
     */
    @JsMethod
    public static native DrawGeometryFunctionType createRegularPolygon(int sides, double angle);

    /**
     * Handles the map browser event and may actually draw or finish the drawing.
     * @param event Map browser event.
     * @return false to stop event propagation.
     */
    @JsMethod
    public static native boolean handleEvent(MapBrowserEvent event);

    /**
     * Extend an existing geometry by adding additional points. This only works on features with LineString geometries,
     * where the interaction will extend lines by adding points to the end of the coordinates array.
     * @param feature Feature to be extended.
     */
    @JsMethod
    public native void extend(Feature feature);

    /**
     * Stop drawing and add the sketch feature to the target layer. The {@link DrawEventType#DRAWEND} event
     * is dispatched before inserting the feature.
     */
    @JsMethod
    public native void finishDrawing();

    /**
     * Remove last point of the feature currently being drawn.
     */
    @JsMethod
    public native void removeLastPoint();

    /**
     * Triggered upon feature draw end
     */
    @JsFunction
    public interface DrawEndListener {
        @JsOverlay
        String TYPE = "drawend";

        void function(DrawInteractionEvent event);
    }

    /**
     * Triggered upon feature draw start
     */
    @JsFunction
    public interface DrawStartListener {
        @JsOverlay
        String TYPE = "drawstart";

        void function(DrawInteractionEvent event);
    }
}
