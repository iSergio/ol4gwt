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

import com.google.gwt.dom.client.CanvasElement;
import jsinterop.annotations.JsFunction;
import org.openlayers.ol.proj.Projection;

/**
 * A function returning the canvas element ({HTMLCanvasElement}) used by the source as an image.
 * The arguments passed to the function are: ol.Extent the image extent, {number} the image resolution,
 * {number} the device pixel ratio, ol.Size the image size, and ol.proj.Projection the image projection.
 * The canvas returned by this function is cached by the source. The this keyword inside the function references
 * the {@link org.openlayers.ol.source.ImageCanvasSource}
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsFunction
public interface CanvasFunctionType {
    CanvasElement function(Extent extent, double resolution, double devicePixelRatio, Size size, Projection projection);
}
