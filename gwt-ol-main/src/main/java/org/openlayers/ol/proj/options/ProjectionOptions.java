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

package org.openlayers.ol.proj.options;

import org.openlayers.ol.Extent;
import org.openlayers.ol.proj.Units;

/**
 * {@link org.openlayers.ol.proj.Projection} options.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ProjectionOptions {
    /**
     * The SRS identifier code, e.g. EPSG:4326. Required.
     */
    public String code;
    /**
     * Units. Required unless a proj4 projection is defined for code.
     */
    public Units units;
    /**
     * The validity extent for the SRS.
     */
    public Extent extentl;
    /**
     * The axis orientation as specified in Proj4. The default is enu.
     */
    public String axisOrientation;
    /**
     * Whether the projection is valid for the whole globe. Default is false.
     */
    public boolean global;
    /**
     * The meters per unit for the SRS. If not provided, the units are used to get the meters per unit from the ol.proj.METERS_PER_UNIT lookup table.
     */
    public double metersPerUnit;
    /**
     * The world extent for the SRS.
     */
    public Extent worldExtent;
// TODO: getPointResolution
//    public getPointResolution	function | undefined
//    Function to determine resolution at a point. The function is called with a {number} view resolution and an {ol.Coordinate} as arguments, and returns the {number} resolution at the passed coordinate.
}
