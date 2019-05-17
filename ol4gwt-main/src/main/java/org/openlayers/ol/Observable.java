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
import org.openlayers.ol.events.Event;

/**
 * Abstract base class; normally only used for creating subclasses and not instantiated in apps.
 * An event target providing convenient methods for listener registration and unregistration.
 * A generic change event is always available through ol.Observable#changed.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol", name = "Observable")
public abstract class Observable {
    @JsConstructor
    protected Observable() {}

    /**
     * Removes an event listener using the key returned by {@link #on} or {@link #once}.
     * @param key The key returned by on() or once() (or an array of keys).
     */
    @JsMethod
    public native void unByKey(EventsKey key);

    /**
     * Removes an event listener using the key returned by {@link #on} or {@link #once}.
     * @param key The key returned by on() or once() (or an array of keys).
     */
    @JsMethod
    public native void unByKey(EventsKey[] key);

    /**
     * Increases the revision counter and dispatches a 'change' event.
     */
    @JsMethod
    public native void changed();

    /**
     * Dispatches an event and calls all listeners listening for events of this type.
     * The event parameter can either be a string or an Object with a type property.
     * @param event Event object.
     */
    @JsMethod
    public native void dispatchEvent(Event event);

    /**
     * Dispatches an event and calls all listeners listening for events of this type.
     * The event parameter can either be a string or an Object with a type property.
     * @param event Event object.
     */
    @JsMethod
    public native void dispatchEvent(String event);

    /**
     * Get the version number for this object. Each time the object is modified, its version number will be incremented.
     * @return Revision.
     */
    @JsMethod
    public native Number getRevision();

    /**
     * Listen once for a certain type of event.
     * @param type The event type or array of event types.
     * @param listener The listener function.
     */
    @JsMethod
    public native void on(String[] type, Listener listener);

    /**
     * Listen once for a certain type of event.
     * @param type The event type or array of event types.
     * @param listener The listener function.
     * @param source The object to use as this in listener.
     */
    @JsMethod
    public native void on(String[] type, Listener listener, Object source);

    /**
     * Listen once for a certain type of event.
     * @param type The event type or array of event types.
     * @param listener The listener function.
     */
    @JsMethod
    public native void on(String type, Listener listener);

    /**
     * Listen once for a certain type of event.
     * @param type The event type or array of event types.
     * @param listener The listener function.
     * @param source The object to use as this in listener.
     */
    @JsMethod
    public native void on(String type, Listener listener, Object source);

    /**
     * Listen once for a certain type of event.
     * @param type The event type or array of event types.
     * @param listener function
     * @return Unique key for the listener. If called with an array of event types as the first argument,
     * the return will be an array of keys.
     */
    @JsMethod
    public native EventsKey[] once(String type, Listener listener);

    /**
     * Listen once for a certain type of event.
     * @param type The event type or array of event types.
     * @param listener function
     * @return Unique key for the listener. If called with an array of event types as the first argument,
     * the return will be an array of keys.
     */
    @JsMethod
    public native EventsKey[] once(String[] type, Listener listener);

    /**
     * Listen once for a certain type of event.
     * @param type The event type or array of event types.
     * @param listener function
     * @param source The object to use as this in listener.
     * @return Unique key for the listener. If called with an array of event types as the first argument,
     * the return will be an array of keys.
     */
    @JsMethod
    public native EventsKey[] once(String type, Listener listener, Object source);

    /**
     * Listen once for a certain type of event.
     * @param type The event type or array of event types.
     * @param listener function
     * @param source The object to use as this in listener.
     * @return Unique key for the listener. If called with an array of event types as the first argument,
     * the return will be an array of keys.
     */
    @JsMethod
    public native EventsKey[] once(String type[], Listener listener, Object source);

    /**
     * Unlisten for a certain type of event.
     * @param type The event type or array of event types.
     * @param listener The listener function.
     */
    @JsMethod
    public native void un(String type, Listener listener);

    /**
     * Unlisten for a certain type of event.
     * @param type The event type or array of event types.
     * @param listener The listener function.
     */
    @JsMethod
    public native void un(String type[], Listener listener);

    /**
     * Unlisten for a certain type of event.
     * @param type The event type or array of event types.
     * @param listener The listener function.
     * @param source The object which was used as this by the listener.
     */
    @JsMethod
    public native void un(String type, Listener listener, Object source);

    /**
     * Unlisten for a certain type of event.
     * @param type The event type or array of event types.
     * @param listener The listener function.
     * @param source The object which was used as this by the listener.
     */
    @JsMethod
    public native void un(String type[], Listener listener, Object source);

    /**
     * Not use this interface instance, only for casts.
     */
    @JsFunction
    public interface Listener {
        void function(Event event);
    }

    /**
     * Generic change event. Triggered when the revision counter is increased.
     */
    @JsFunction
    public interface ChangeListener {
        @JsOverlay
        String TYPE = "change";
        void function(Event event);
    }
}
