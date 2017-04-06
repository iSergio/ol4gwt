GWT-OL
==============
gwt-ol this wrapper for [OpenLayers](http://openlayers.org).

Based on GWT 2.8.0 adn JsInterop. All functional writed without JSNI, uses only JsFunction, JsContructor, JsProperty, 
JsMethod and other annotations of JsInterop.

This wrapper will strive for 100% implementation of the functional [OpenLayers](http://openlayers.org).

Java API looks like as JavaScript.
What was done:
- [x] OpenLayers API like as native JavaScript. Based on OpenLayers source code
- [x] Simple support Callback functions.
- [x] Full OpenLayers documentation in javadoc. You can see they on official [OpenLayers](http://openlayers.org/en/latest/doc/) or on site [gwt-ol Documentation](http://sergeserver.noip.me/docs/gwt-ol)
- [x] [Examples showcase](http://sergeserver.noip.me/gwt-cs-test/).
- [x] Integration with [gwt-olcs](https://github.com/iSergio/gwt-olcs)

Getting started
---------------
You not need include JavaScript of Cesium into main html file, injection realised in GWT code.
Now no need callback for ScriptInjection or AttachOrDetach, all worked "out from box".
See [Showcase](http://sergeserver.noip.me/gwt-cs-test/) or basic example:
```
public class OSM extends AbstractExample {

    @Inject
    public OSM(ShowcaseExampleStore store) {
        super("OSM", "OpenStreetMap", new String[]{"Showcase", "OpenLayers", "OSMSource"}, store);
    }

    @Override
    public void buildPanel() {
        TileLayerOptions tileLayerOptions = new TileLayerOptions();
        tileLayerOptions.source = new OSMSource();
        TileLayer tileLayer = new TileLayer(tileLayerOptions);

        ViewOptions viewOptions = new ViewOptions();
        viewOptions.center = new Coordinate(new double[] {-10997148, 4569099});
        viewOptions.zoom = 4;

        MapOptions mapOptions = new MapOptions();
        mapOptions.logoVisible = false;
        mapOptions.loadTilesWhileAnimating = true;
        mapOptions.loadTilesWhileInteracting = true;
        mapOptions.layers = new Collection<>();
        mapOptions.layers.push(tileLayer);
        mapOptions.view = new View(viewOptions);

        MapPanel mapPanel = new MapPanel(mapOptions);
        mapPanel.setHeight("400px");

        contentPanel.add(new HTML("<p>Use Viewer to start building new applications or easily embed Cesium into existing applications.</p>"));
        contentPanel.add(mapPanel);

        initWidget(contentPanel);
    }

    @Override
    public String[] getSourceCodeURLs() {
        String[] sourceCodeURLs = new String[1];
        sourceCodeURLs[0] = GWT.getModuleBaseURL() + "examples/" + "HelloWorld.txt";
        return sourceCodeURLs;
    }
}
```

### Build library and examples:
==
You need Java 8 for build examples.
 * mvn -U clean install