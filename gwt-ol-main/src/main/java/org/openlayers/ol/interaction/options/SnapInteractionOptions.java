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
import org.openlayers.ol.Collection;
import org.openlayers.ol.Feature;
import org.openlayers.ol.source.VectorSource;

/**
 * {@link org.openlayers.ol.interaction.SnapInteraction} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class SnapInteractionOptions {
    /**
     * Snap to these features. Either this option or source should be provided.
     */
    @JsProperty
    public Collection<Feature> features;
    /**
     * Snap to edges. Default is true.
     */
    @JsProperty
    public boolean edge;
    /**
     * Snap to vertices. Default is true.
     */
    @JsProperty
    public boolean vertex;
    /**
     * Pixel tolerance for considering the pointer close enough to a segment or vertex for snapping. Default is 10 pixels.
     */
    @JsProperty
    public double pixelTolerance;
    /**
     * Snap to features from this source. Either this option or features should be provided
     */
    @JsProperty
    public VectorSource source;

    @JsConstructor
    public SnapInteractionOptions() {}
}
