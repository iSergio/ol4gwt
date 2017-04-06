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

import jsinterop.annotations.*;
import org.openlayers.ol.events.ObjectEvent;
import org.openlayers.ol.geom.SimpleGeometry;
import org.openlayers.ol.options.ViewAnimateOptions;
import org.openlayers.ol.options.ViewFitOptions;
import org.openlayers.ol.options.ViewOptions;
import org.openlayers.ol.proj.Projection;

/**
 * An ol.View object represents a simple 2D view of the map.
 *
 * This is the object to act upon to change the center, resolution, and rotation of the map.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol", name = "View")
public class View extends Object {
    @JsConstructor
    public View(ViewOptions options) {}

    /**
     * Animate the view. The view's center, zoom (or resolution), and rotation can
     * be animated for smooth transitions between view states.
     */
    @JsMethod
    public native void animate();

    /**
     * Animate the view. The view's center, zoom (or resolution), and rotation can
     * be animated for smooth transitions between view states.
     * @param options {@link ViewAnimateOptions}
     */
    @JsMethod
    public native void animate(ViewAnimateOptions options);

    /**
     * Calculate the extent for the current view state and the passed size. The size is the pixel dimensions of the box
     * into which the calculated extent should fit. In most cases you want to get the extent of the entire map, that is map.getSize().
     * @param size Box pixel size. If not provided, the size of the first map that uses this view will be used.
     * @return Extent.
     */
    @JsMethod
    public native Extent calculateExtent(Size size);

    /**
     * Calculate the extent for the current view state and the passed size. The size is the pixel dimensions of the box
     * into which the calculated extent should fit. In most cases you want to get the extent of the entire map, that is map.getSize().
     * @return Extent.
     */
    @JsMethod
    public native Extent calculateExtent();

    /**
     * Center on coordinate and view position.
     * @param coordinate Coordinate.
     * @param size Box pixel size.
     * @param position Position on the view to center on.
     */
    @JsMethod
    public native void centerOn(Coordinate coordinate, Size size, Pixel position);

    /**
     * Get the constrained center of this view.
     * @param center Center.
     * @return Constrained center.
     */
    @JsMethod
    public native Coordinate constrainCenter(Coordinate center);

    /**
     * Get the constrained resolution of this view.
     * @param resolution Resolution.
     * @return Constrained resolution.
     */
    @JsMethod
    public native double constrainResolution(double resolution);

    /**
     * Get the constrained resolution of this view.
     * @param resolution Resolution.
     * @param delta Delta. Default is 0.
     * @return Constrained resolution.
     */
    @JsMethod
    public native double constrainResolution(double resolution, double delta);

    /**
     * Get the constrained resolution of this view.
     * @param resolution Resolution.
     * @param delta Delta. Default is 0.
     * @param direction Direction. Default is 0.
     * @return Constrained resolution.
     */
    @JsMethod
    public native double constrainResolution(double resolution, double delta, double direction);

    /**
     * Get the constrained rotation of this view.
     * @param rotation Rotation.
     * @return Constrained rotation.
     */
    @JsMethod
    public native double constrainRotation(double rotation);

    /**
     * Get the constrained rotation of this view.
     * @param rotation Rotation.
     * @param delta Delta. Default is 0.
     * @return Constrained rotation.
     */
    @JsMethod
    public native double constrainRotation(double rotation, double delta);

    /**
     * Fit the given geometry or extent based on the given map size and border. The size is pixel dimensions of the box
     * to fit the extent into. In most cases you will want to use the map size, that is map.getSize(). Takes care of the map angle.
     * @param extent The extent to fit the view to.
     */
    @JsMethod
    public native void fit(SimpleGeometry extent);

    /**
     * Fit the given geometry or extent based on the given map size and border. The size is pixel dimensions of the box
     * to fit the extent into. In most cases you will want to use the map size, that is map.getSize(). Takes care of the map angle.
     * @param extent The extent to fit the view to.
     * @param options {@link ViewFitOptions}
     */
    @JsMethod
    public native void fit(SimpleGeometry extent, ViewFitOptions options);

    /**
     * Fit the given geometry or extent based on the given map size and border. The size is pixel dimensions of the box
     * to fit the extent into. In most cases you will want to use the map size, that is map.getSize(). Takes care of the map angle.
     * @param extent The extent to fit the view to.
     */
    @JsMethod
    public native void fit(Extent extent);

    /**
     * Fit the given geometry or extent based on the given map size and border. The size is pixel dimensions of the box
     * to fit the extent into. In most cases you will want to use the map size, that is map.getSize(). Takes care of the map angle.
     * @param extent The extent to fit the view to.
     * @param options {@link ViewFitOptions}
     */
    @JsMethod
    public native void fit(Extent extent, ViewFitOptions options);

    /**
     * Get the view center.
     * @return The center of the view.
     */
    @JsMethod
    public native Coordinate getCenter();

    /**
     * Get the maximum resolution of the view.
     * @return The maximum resolution of the view.
     */
    @JsMethod
    public native double getMaxResolution();

    /**
     * Get the minimum resolution of the view.
     * @return The minimum resolution of the view.
     */
    @JsMethod
    public native double getMinResolution();

    /**
     * Get the view projection.
     * @return The projection of the view.
     */
    @JsMethod
    public native Projection getProjection();

    /**
     * Get the view resolution.
     * @return The resolution of the view.
     */
    @JsMethod
    public native double getResolution();

    /**
     * Get the resolutions for the view. This returns the array of resolutions passed to the constructor of
     * the {ol.View}, or undefined if none were given.
     * @return The resolutions of the view.
     */
    @JsMethod
    public native double[] getResolutions();

    /**
     * Get the view rotation.
     * @return The rotation of the view in radians.
     */
    @JsMethod
    public native double getRotation();

    /**
     * Get the current zoom level. Return undefined if the current resolution is undefined or not within the "resolution constraints".
     * @return Zoom.
     */
    @JsMethod
    public native int getZoom();

    /**
     * Rotate the view around a given coordinate.
     * @param rotation New rotation value for the view.
     */
    @JsMethod
    public native void rotate(double rotation);

    /**
     * Rotate the view around a given coordinate.
     * @param rotation New rotation value for the view.
     * @param anchor The rotation center.
     */
    @JsMethod
    public native void rotate(double rotation, Coordinate anchor);

    /**
     * Set the center of the current view.
     * @param center The center of the view.
     */
    @JsMethod
    public native void setCenter(Coordinate center);

    /**
     * Set the resolution for this view.
     * @param resolution The resolution of the view.
     */
    @JsMethod
    public native void setResolution(double resolution);

    /**
     * Set the rotation for this view.
     * @param rotation The rotation of the view in radians.
     */
    @JsMethod
    public native void setRotation(double rotation);

    /**
     * Zoom to a specific zoom level.
     * @param zoom Zoom level.
     */
    @JsMethod
    public native void setZoom(int zoom);

    @JsFunction
    public interface ChangeCenterListener {
        @JsOverlay
        String TYPE = "change:center";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }

    @JsFunction
    public interface ChangeResolutionListener {
        @JsOverlay
        String TYPE = "change:resolution";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }

    @JsFunction
    public interface ChangeRotationListener {
        @JsOverlay
        String TYPE = "change:rotation";
        @JsOverlay
        String OBSERVABLE = TYPE.split(":")[1];

        void function(ObjectEvent event);
    }
}
