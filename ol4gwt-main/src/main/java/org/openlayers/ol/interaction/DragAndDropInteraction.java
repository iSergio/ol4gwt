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
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsType;
import org.openlayers.ol.events.DragAndDropInteractionEvent;
import org.openlayers.ol.interaction.options.DragAndDropInteractionOptions;

/**
 * Handles input of vector data by drag and drop.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.interaction", name = "DragAndDrop")
public class DragAndDropInteraction extends Interaction {
    @JsConstructor
    public DragAndDropInteraction() {}

    @JsConstructor
    public DragAndDropInteraction(DragAndDropInteractionOptions options) {}

    @JsFunction
    public interface AddFeaturesListener {
        String TYPE = "addFeatures";

        void function(DragAndDropInteractionEvent event);
    }
}
