package org.cleanlogic.ol4gwt.showcase.examples;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.HTML;
import org.cleanlogic.ol4gwt.showcase.basic.AbstractExample;
import org.cleanlogic.ol4gwt.showcase.components.store.ShowcaseExampleStore;
import org.cleanlogic.ol4gwt.showcase.examples.slider.Slider;
import org.cleanlogic.ol4gwt.showcase.examples.slider.SliderEvent;
import org.cleanlogic.ol4gwt.showcase.examples.slider.SliderListener;
import org.openlayers.ol.*;
import org.openlayers.ol.geom.Point;
import org.openlayers.ol.layer.BaseLayer;
import org.openlayers.ol.layer.TileLayer;
import org.openlayers.ol.layer.VectorLayer;
import org.openlayers.ol.layer.options.TileLayerOptions;
import org.openlayers.ol.layer.options.VectorLayerOptions;
import org.openlayers.ol.options.MapOptions;
import org.openlayers.ol.options.ViewOptions;
import org.openlayers.ol.source.ClusterSource;
import org.openlayers.ol.source.OSMSource;
import org.openlayers.ol.source.VectorSource;
import org.openlayers.ol.source.options.ClusterSourceOptions;
import org.openlayers.ol.source.options.VectorSourceOptions;
import org.openlayers.ol.style.*;
import org.openlayers.ol.style.options.CircleStyleOptions;
import org.openlayers.ol.style.options.StyleOptions;
import org.openlayers.ol.style.options.TextStyleOptions;

import javax.inject.Inject;
import java.lang.Object;
import java.util.HashMap;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Cluster extends AbstractExample {

    @Inject
    public Cluster(ShowcaseExampleStore store) {
        super("Cluster",
                "Clustered Features",
                new String[]{"Feature", "Map", "View",
                        "Point", "TileLayer", "VectorLayer",
                        "ClusterSource", "OSMSource", "VectorSource",
                        "CircleStyle", "FillStyle", "StrokeStyle",
                        "Style", "TextStyle"},
                store);
    }

    @Override
    public void buildPanel() {
        int count = 20000;
        Feature[] features = new Feature[count];
        int e = 4_500_000;
        for (int i = 0; i < count; ++i) {
            Coordinate coordinate = new Coordinate(new double[] {2 * e * Math.random() - e, 2 * e * Math.random() - e});
            features[i] = new Feature(new Point((coordinate)));
        }

        VectorSourceOptions vectorSourceOptions = new VectorSourceOptions();
        vectorSourceOptions.features = new Collection<>(features);
        VectorSource source = new VectorSource(vectorSourceOptions);

        ClusterSourceOptions clusterSourceOptions = new ClusterSourceOptions();
        clusterSourceOptions.source = source;
        clusterSourceOptions.distance = 40;
        final ClusterSource clusterSource = new ClusterSource(clusterSourceOptions);

        final java.util.Map<Integer, Style> styleCache = new HashMap<>();

        VectorLayerOptions vectorLayerOptions = new VectorLayerOptions();
        vectorLayerOptions.source = clusterSource;
        vectorLayerOptions.styleFunction = new StyleFunction() {
            @Override
            public Style[] function(Feature feature, double resolution) {
                int size = ((Feature[])((Object) feature.get("features"))).length;
                Style style = styleCache.get(size);
                if (style == null) {
                    CircleStyleOptions circleStyleOptions = new CircleStyleOptions();
                    circleStyleOptions.radius = 10;
                    circleStyleOptions.stroke = StrokeStyle.create("#fff");
                    circleStyleOptions.fill = FillStyle.craete("#3399CC");

                    TextStyleOptions textStyleOptions = new TextStyleOptions();
                    textStyleOptions.text = String.valueOf(size);
                    textStyleOptions.fill = FillStyle.craete("#fff");

                    StyleOptions styleOptions = new StyleOptions();
                    styleOptions.image = new CircleStyle(circleStyleOptions);
                    styleOptions.text = new TextStyle(textStyleOptions);

                    style = new Style(styleOptions);

                    styleCache.put(size, style);
                }
                return new Style[] {style};
            }
        };
        VectorLayer clusters = new VectorLayer(vectorLayerOptions);

        TileLayerOptions tileLayerOptions = new TileLayerOptions();
        tileLayerOptions.source = new OSMSource();
        TileLayer raster = new TileLayer(tileLayerOptions);

        ViewOptions viewOptions = new ViewOptions();
        viewOptions.center = Coordinate.create(0, 0);
        viewOptions.zoom = 2;

        MapOptions mapOptions = new MapOptions();
        mapOptions.layers = new Collection<>(new BaseLayer[] {raster, clusters});
        mapOptions.view = new View(viewOptions);

        MapPanel mapPanel = new MapPanel(mapOptions);
        mapPanel.setHeight("400px");

        Slider distanceSlider = new Slider("distance", 0, 100, 40);
        distanceSlider.setStep(1);
        distanceSlider.setWidth("100%");
        distanceSlider.addListener(new SliderListener() {
           @Override
           public void onStart(SliderEvent e) {

           }

           @Override
           public boolean onSlide(SliderEvent e) {
               Slider source = e.getSource();
               clusterSource.setDistance(source.getValue());
               return true;
           }

           @Override
           public void onChange(SliderEvent e) {

           }

           @Override
           public void onStop(SliderEvent e) {

           }
        });

        contentPanel.add(new HTML("<p>This example shows how to do clustering on point features.</p>"));
        contentPanel.add(mapPanel);
        contentPanel.add(distanceSlider);

        initWidget(contentPanel);
    }

    @Override
    public String[] getSourceCodeURLs() {
        String[] sourceCodeURLs = new String[1];
        sourceCodeURLs[0] = GWT.getModuleBaseURL() + "examples/" + "Cluster.txt";
        return sourceCodeURLs;
    }
}