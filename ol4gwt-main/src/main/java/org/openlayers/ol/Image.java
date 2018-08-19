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
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "ol", name = "Image")
public class Image extends ImageBase {
    @JsConstructor
    private Image() {}

    /**
     *
     * @return Image.
     */
    @JsMethod(name = "getImage")
    public native CanvasElement getImageCanvasElement();

    /**
     *
     * @param context Object.
     * @return Image.
     */
    @JsMethod(name = "getImage")
    public native CanvasElement getImageCanvasElement(Object context);

    /**
     * Load the image or retry if loading previously failed. Loading is taken care of by the tile queue, and calling this
     * method is only needed for preloading or for reloading in case of an error.
     */
    @JsMethod
    public native void load();
}
