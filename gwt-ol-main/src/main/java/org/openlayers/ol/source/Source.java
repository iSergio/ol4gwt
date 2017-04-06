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

package org.openlayers.ol.source;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Attribution;
import org.openlayers.ol.Object;
import org.openlayers.ol.proj.Projection;
import org.openlayers.ol.source.options.SourceOptions;
import org.openlayers.olx.LogoOptions;

/**
 * Abstract base class; normally only used for creating subclasses and not instantiated in apps.
 * Base class for {@link org.openlayers.ol.layer.Layer} sources.
 *
 * A generic change event is triggered when the state of the source changes.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.source", name = "Source")
public abstract class Source extends Object {
    @JsConstructor
    protected Source() {}

    @JsConstructor
    protected Source(SourceOptions options) {}

    /**
     * Get the attributions of the source.
     * @return Attributions.
     */
    @JsMethod
    public native Attribution[] getAttributions();

    /**
     * Get the logo of the source.
     * @return Logo.
     */
    @JsMethod
    public native String getLogo();

    /**
     * Get the logo of the source.
     * @return Logo.
     */
    @JsMethod
    public native LogoOptions getLogoOptions();

    /**
     * Get the projection of the source.
     * @return Projection.
     */
    @JsMethod
    public native Projection getProjection();

    /**
     * Get the state of the source, see ol.source.State for possible states.
     * @return State.
     */
    @JsMethod
    public native String getState();

    /**
     * Refreshes the source and finally dispatches a 'change' event.
     */
    @JsMethod
    public native void refresh();

    /**
     * Set the attributions of the source.
     * @param attributions Attributions. Can be passed as string, Array<string>, ol.Attribution, Array<ol.Attribution> or undefined.
     */
    @JsMethod
    public native void setAttributions(Attribution[] attributions);
}
