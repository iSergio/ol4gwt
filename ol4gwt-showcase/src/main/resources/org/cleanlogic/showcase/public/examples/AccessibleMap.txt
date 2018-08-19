package org.cleanlogic.showcase.client.examples;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.*;
import org.cleanlogic.showcase.client.basic.AbstractExample;
import org.cleanlogic.showcase.client.components.store.ShowcaseExampleStore;
import org.openlayers.ol.Collection;
import org.openlayers.ol.Coordinate;
import org.openlayers.ol.MapPanel;
import org.openlayers.ol.View;
import org.openlayers.ol.layer.TileLayer;
import org.openlayers.ol.layer.options.TileLayerOptions;
import org.openlayers.ol.options.MapOptions;
import org.openlayers.ol.options.ViewOptions;
import org.openlayers.ol.source.OSMSource;

import javax.inject.Inject;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class AccessibleMap extends AbstractExample {

    @Inject
    public AccessibleMap(ShowcaseExampleStore store) {
        super("Accessible Map", "OpenStreetMap", new String[]{"Map", "View", "Control", "TileLayer", "OSMSource"}, store);
    }

    @Override
    public void buildPanel() {
        TileLayerOptions tileLayerOptions = new TileLayerOptions();
        tileLayerOptions.source = new OSMSource();
        TileLayer tileLayer = new TileLayer(tileLayerOptions);

        ViewOptions viewOptions = new ViewOptions();
        viewOptions.center = new Coordinate(new double[]{0, 0});
        viewOptions.zoom = 2;

        MapOptions mapOptions = new MapOptions();
        mapOptions.logoVisible = false;
        mapOptions.loadTilesWhileAnimating = true;
        mapOptions.loadTilesWhileInteracting = true;
        mapOptions.layers = new Collection<>();
        mapOptions.layers.push(tileLayer);
        mapOptions.view = new View(viewOptions);

        final MapPanel mapPanel = new MapPanel(mapOptions);
        mapPanel.setHeight("400px");

        PushButton zoomOutPBtn = new PushButton();
        zoomOutPBtn.setText("Zoom out");
        zoomOutPBtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                View view = mapPanel.getMap().getView();
                int zoom = view.getZoom();
                view.setZoom(zoom - 1);
            }
        });

        PushButton zoomInPBtn = new PushButton();
        zoomInPBtn.setText("Zoom in");
        zoomInPBtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                View view = mapPanel.getMap().getView();
                int zoom = view.getZoom();
                view.setZoom(zoom + 1);
            }
        });

        HorizontalPanel hPanel = new HorizontalPanel();
        hPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
        hPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
        hPanel.setSpacing(10);
        hPanel.add(zoomOutPBtn);
        hPanel.add(zoomInPBtn);

        String description = "<p>This page's map element has its tabindex attribute set to \"0\", that makes it focusable. To focus the map element you can either navigate to it using the \"tab\" key or use the skip link. When the map element is focused the + and - keys can be used to zoom in and out and the arrow keys can be used to pan.\n" +
                "\n" +
                "Clicking on the \"Zoom in\" and \"Zoom out\" buttons below the map zooms the map in and out. You can navigate to the buttons using the \"tab\" key, and press the \"enter\" key to trigger the zooming action.</p>";
        contentPanel.add(new HTML(description));
        contentPanel.add(mapPanel);
        contentPanel.add(hPanel);

        initWidget(contentPanel);
    }

    @Override
    public String[] getSourceCodeURLs() {
        String[] sourceCodeURLs = new String[1];
        sourceCodeURLs[0] = GWT.getModuleBaseURL() + "examples/" + "HelloWorld.txt";
        return sourceCodeURLs;
    }
}