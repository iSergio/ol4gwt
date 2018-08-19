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
import org.openlayers.ol.events.CollectionEvent;
import org.openlayers.ol.events.Event;
import org.openlayers.ol.events.ObjectEvent;

/**
 * An expanded version of standard JS Array, adding convenience methods for manipulation. Add and remove changes to the
 * Collection trigger a Collection event. Note that this does not cover changes to the objects within the Collection;
 * they trigger events on the appropriate object, not on the Collection as a whole.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol", name = "Collection")
public class Collection<T extends Object> extends Object {
    @JsConstructor
    public Collection() {}

    @JsConstructor
    public Collection(T[] array) {}

    /**
     * Remove all elements from the collection.
     */
    @JsMethod
    public native void clear();

    /**
     * Get the length of this collection.
     * @return The length of the array.
     */
    @JsMethod
    public native int getLength();

    /**
     * Insert an element at the provided index.
     * @param index Index.
     * @param elem  Element.
     */
    @JsMethod
    public native void insertAt(int index, T elem);

    /**
     * Get the element at the provided index.
     * @param index Index.
     * @return Element.
     */
    @JsMethod
    public native T item(int index);

    /**
     * Remove the last element of the collection and return it. Return undefined if the collection is empty.
     * @return Element.
     */
    @JsMethod
    public native T pop();

    /**
     * Insert the provided element at the end of the collection.
     * @param elem Element.
     * @return Length.
     */
    @JsMethod
    public native Number push(T elem);

    /**Remove the first occurrence of an element from the collection.
     * Remove the first occurrence of an element from the collection.
     * @param elem Element.
     * @return The removed element or undefined if none found.
     */
    @JsMethod
    public native T remove(T elem);

    /**
     * Remove the element at the provided index and return it. Return undefined if the collection does not contain this index.
     * @param index Index.
     * @return The removed element or undefined if the collection does not contain this index.
     */
    @JsMethod
    public native T removeAt(int index);

    /**
     * Set the element at the provided index.
     * @param index Index.
     * @param elem Element.
     */
    @JsMethod
    public native void setAt(int index, T elem);

    @JsFunction
    public interface AddListener<T extends Object> {
        @JsOverlay
        String TYPE = "add";
        void function(CollectionEvent<T> event);
    }

    @JsFunction
    public interface ChangeLengthListener<T extends Object> {
        @JsOverlay
        String TYPE = "change:length";
        void function(ObjectEvent<T> event);
    }

    @JsFunction
    public interface PropertyChangeListener<T extends Object> {
        @JsOverlay
        String TYPE = "propertychange";
        void function(ObjectEvent<T> event);
    }

    @JsFunction
    public interface RemoveListener<T extends Object> {
        @JsOverlay
        String TYPE = "propertychange";
        void function(CollectionEvent<T> event);
    }
}
