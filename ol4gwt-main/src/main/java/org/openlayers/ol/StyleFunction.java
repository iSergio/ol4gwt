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

import jsinterop.annotations.JsFunction;
import org.openlayers.ol.style.Style;

/**
 * A function that takes an ol.Feature and a {number} representing the view's resolution.
 * The function should return a ol.style.Style or an array of them. This way e.g. a vector layer can be styled.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsFunction
public interface StyleFunction {
    Style[] function(Feature feature, double resolution);
}
