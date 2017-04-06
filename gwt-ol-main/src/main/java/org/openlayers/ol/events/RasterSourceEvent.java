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

package org.openlayers.ol.events;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import org.openlayers.ol.Extent;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.source.Raster", name = "Event")
public class RasterSourceEvent extends Event {
    /**
     * An object made available to all operations. This can be used by operations as a
     * storage object (e.g. for calculating statistics).
     */
    @JsProperty
    public Object data;
    /**
     * The raster extent.
     */
    @JsProperty
    public Extent extent;
    /**
     * The pixel resolution (map units per pixel).
     */
    @JsProperty
    public double resolution;

    @JsConstructor
    private RasterSourceEvent() {}
}
