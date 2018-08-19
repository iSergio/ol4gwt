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

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import org.openlayers.ol.options.MapOptions;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class MapPanel extends SimplePanel {
    private Map map;

    public MapPanel(MapOptions options) {
        final Element element = getElement();
        element.setClassName("map");
        element.setId(Random.nextInt() + "-" + Random.nextInt() + "-" + Random.nextInt());
        RootPanel.getBodyElement().appendChild(element);
        options.target = element;
        map = new Map(options);

        addAttachHandler(new AttachEvent.Handler() {
            @Override
            public void onAttachOrDetach(AttachEvent attachEvent) {
                if (attachEvent.isAttached()) {
                    map.updateSize();
                } else {
                    element.removeAllChildren();
                    element.removeFromParent();
                }
            }
        });
    }

    public Map getMap() {
        return map;
    }
}
