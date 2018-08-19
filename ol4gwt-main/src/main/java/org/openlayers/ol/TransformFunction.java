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

/**
 * A transform function accepts an array of input coordinate values, an optional output array, and an optional dimension
 * (default should be 2). The function transforms the input coordinate values, populates the output array,
 * and returns the output array.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsFunction
public interface TransformFunction {
    Coordinate[] function(Coordinate[] coordinates, int dimension);
}
