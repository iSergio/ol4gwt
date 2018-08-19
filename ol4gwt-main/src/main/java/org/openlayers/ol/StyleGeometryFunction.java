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
import org.openlayers.ol.geom.Geometry;

/**
 * A function that takes an ol.Feature as argument and returns an ol.geom.Geometry that will be rendered and styled for the feature.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsFunction
public interface StyleGeometryFunction {
    Geometry function(Feature feature);
}