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

/**
 * {@link org.openlayers.ol.interaction.MouseWheelZoomInteraction} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class MouseWheelZoomInteractionOptions {
    /**
     * Animation duration in milliseconds. Default is 250.
     */
    @JsProperty
    public double duration;
    /**
     * Mouse wheel timeout duration in milliseconds. Default is 80.
     */
    @JsProperty
    public double timeout;
    /**
     * Enable zooming using the mouse's location as the anchor. Default is true. When set to false, zooming in and out
     * will zoom to the center of the screen instead of zooming on the mouse's location.
     */
    @JsProperty
    public boolean useAnchor;

    @JsConstructor
    public MouseWheelZoomInteractionOptions() {}
}
