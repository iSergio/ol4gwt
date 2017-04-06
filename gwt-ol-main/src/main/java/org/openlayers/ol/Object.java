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

import jsinterop.annotations.*;
import org.openlayers.ol.events.ObjectEvent;

/**
 * Abstract base class; normally only used for creating subclasses and not instantiated in apps.
 * Most non-trivial classes inherit from this.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol", name = "Object")
public abstract class Object extends Observable {
    @JsConstructor
    protected Object() {}

    /**
     * Gets a value.
     * @param key Key name.
     * @return Value.
     */
    @JsMethod
    public native Object get(String key);

    /**
     * Get a list of object property names.
     * @return List of property names.
     */
    @JsMethod
    public native String[] getKeys();

    /**
     * Get an object of all property names and values.
     * @return Object
     */
    @JsMethod
    public native Object getProperties();

    /**
     * Sets a value.
     * @param key Key name.
     * @param value Value.
     */
    @JsMethod
    public native void set(String key, Object value);

    /**
     * Sets a value.
     * @param key Key name.
     * @param value Value.
     */
    @JsMethod
    public native void set(String key, String value);

    /**
     * Sets a value.
     * @param key Key name.
     * @param value Value.
     * @param silent Update without triggering an event.
     */
    @JsMethod
    public native void set(String key, Object value, boolean silent);

    /**
     * Sets a collection of key-value pairs. Note that this changes any existing properties and adds
     * new ones (it does not remove any existing properties).
     * @param values Values.
     */
    @JsMethod
    public native void setProperties(Object[] values);

    /**
     * Sets a collection of key-value pairs. Note that this changes any existing properties and adds
     * new ones (it does not remove any existing properties).
     * @param values Values.
     * @param silent Update without triggering an event.
     */
    @JsMethod
    public native void setProperties(Object[] values, boolean silent);

    /**
     * Unsets a property.
     * @param key Key name.
     */
    @JsMethod
    public native void unset(String key);

    /**
     * Unsets a property.
     * @param key Key name.
     * @param silent Unset without triggering an event.
     */
    @JsMethod
    public native void unset(String key, boolean silent);

    /**
     * Triggered when a property is changed.
     */
    @JsFunction
    public interface PropertyChangeListener {
        @JsOverlay
        String TYPE = "propertychange";
        void function(ObjectEvent event);
    }
}
