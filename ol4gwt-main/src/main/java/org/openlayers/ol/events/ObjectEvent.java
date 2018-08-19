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
import org.openlayers.ol.Object;
import org.openlayers.ol.events.Event;

/**
 * Events emitted by{@link Object} instances are instances of this type.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol.Object", name = "Event")
public class ObjectEvent<T extends Object> extends Event {
    /**
     * The name of the property whose value is changing.
     */
    @JsProperty
    public String key;
    /**
     * The old value. To get the new value use e.target.get(e.key) where e is the event object.
     */
    @JsProperty
    public T oldValue;
    /**
     * The event target.
     */
    @JsProperty
    public Object target;
    /**
     * The event type.
     */
    @JsProperty
    public String type;

    @JsConstructor
    public ObjectEvent() {}
}
