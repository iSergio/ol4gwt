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

import jsinterop.annotations.*;
import org.openlayers.ol.Object;

/**
 * Events emitted by {@link org.openlayers.ol.Collection} instances are instances of this type.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.Collection", name = "Event")
public class CollectionEvent<T extends Object> extends Event {
    /**
     * The element that is added to or removed from the collection.
     */
    @JsProperty
    public T element;

    @JsConstructor
    public CollectionEvent() {}
}
