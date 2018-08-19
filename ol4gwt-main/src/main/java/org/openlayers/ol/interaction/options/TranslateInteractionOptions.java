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
import org.openlayers.ol.layer.Layer;

/**
 * {@link org.openlayers.ol.interaction.TranslateInteraction} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class TranslateInteractionOptions {
    /**
     * Only features contained in this collection will be able to be translated. If not specified, all features on the
     * map will be able to be translated.
     */
    @JsProperty
    public Collection<Feature> features;
    /**
     * A list of layers from which features should be translated. Alternatively, a filter function can be provided.
     * The function will be called for each layer in the map and should return true for layers that you want to be
     * translatable. If the option is absent, all visible layers will be considered translatable.
     */
    @JsProperty
    public Layer[] layers;
    /**
     * Hit-detection tolerance. Pixels inside the radius around the given position will be checked for features.
     * This only works for the canvas renderer and not for WebGL.
     */
    @JsProperty
    public double hitTolerance;

    @JsConstructor
    public TranslateInteractionOptions() {}
}
