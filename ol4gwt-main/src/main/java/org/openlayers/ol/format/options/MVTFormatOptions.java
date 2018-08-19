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

package org.openlayers.ol.format.options;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import net.sourceforge.htmlunit.corejs.javascript.annotations.JSConstructor;

/**
 * {@link org.openlayers.ol.format.MVTFormat} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class MVTFormatOptions {
    // TODO: featureClass
//    featureClass	undefined | function | function
//    Class for features returned by ol.format.MVT#readFeatures. Set to ol.Feature to get full editing and geometry support at the cost of decreased rendering performance. The default is ol.render.Feature, which is optimized for rendering and hit detection.
    /**
     * Geometry name to use when creating features. Default is 'geometry'.
     */
    @JsProperty
    public String geometryName;
    /**
     * Name of the feature attribute that holds the layer name. Default is 'layer'.
     */
    @JsProperty
    String layerName;
    /**
     * Layers to read features from. If not provided, features will be read from all layers.
     */
    @JsProperty
    String[] layers;

    @JSConstructor
    public MVTFormatOptions() {}
}
