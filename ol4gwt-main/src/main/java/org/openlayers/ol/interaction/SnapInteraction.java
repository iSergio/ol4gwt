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

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Feature;
import org.openlayers.ol.interaction.options.SnapInteractionOptions;

/**
 * Handles snapping of vector features while modifying or drawing them. The features can come from a {@link org.openlayers.ol.source.VectorSource} or
 * {@link org.openlayers.ol.Collection} Any interaction object that allows the user to interact with the features
 * using the mouse can benefit from the snapping, as long as it is added before.
 *
 * The snap interaction modifies map browser event coordinate and pixel properties to force the snap to occur
 * to any interaction that them.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.interaction", name = "Snap")
public class SnapInteraction {
    @JsConstructor
    public SnapInteraction() {}

    @JsConstructor
    public SnapInteraction(SnapInteractionOptions options) {}

    /**
     * Add a feature to the collection of features that we may snap to.
     * @param feature Feature.
     * @param listen Whether to listen to the feature change or not Defaults to true.
     */
    @JsMethod
    public native void addFeature(Feature feature, boolean listen);

    /**
     * Remove a feature from the collection of features that we may snap to.
     * @param feature Feature
     * @param unlisten Whether to unlisten to the feature change or not. Defaults to true.
     */
    @JsMethod
    public native void removeFeature(Feature feature, boolean unlisten);
}
