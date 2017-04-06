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

package org.openlayers.ol.layer;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.openlayers.ol.layer.options.ImageLayerOptions;
import org.openlayers.ol.layer.options.LayerOptions;
import org.openlayers.ol.source.ImageSource;

/**
 * Server-rendered images that are available for arbitrary extents and resolutions. Note that any property set in
 * the options is set as a ol.Object property on the layer object; for example, setting title: 'My Title' in the
 * options means that title is observable, and has get/set accessors.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.layer", name = "Image")
public class ImageLayer extends Layer {
    @JsConstructor
    protected ImageLayer() {
        super(new ImageLayerOptions());
    }

    @JsConstructor
    protected ImageLayer(ImageLayerOptions options) {
        super(options);
    }

    /**
     * Return the associated source of the image layer.
     * @return Source.
     */
    @JsMethod
    public native ImageSource getSource();
}
