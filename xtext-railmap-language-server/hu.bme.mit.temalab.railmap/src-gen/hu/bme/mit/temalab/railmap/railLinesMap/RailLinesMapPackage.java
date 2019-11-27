/**
 * generated by Xtext 2.20.0-SNAPSHOT
 */
package hu.bme.mit.temalab.railmap.railLinesMap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.temalab.railmap.railLinesMap.RailLinesMapFactory
 * @model kind="package"
 * @generated
 */
public interface RailLinesMapPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "railLinesMap";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bme.hu/mit/temalab/railmap/RailLinesMap";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "railLinesMap";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RailLinesMapPackage eINSTANCE = hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLinesMapPackageImpl.init();

  /**
   * The meta object id for the '{@link hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLineMapImpl <em>Rail Line Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLineMapImpl
   * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLinesMapPackageImpl#getRailLineMap()
   * @generated
   */
  int RAIL_LINE_MAP = 0;

  /**
   * The feature id for the '<em><b>Map Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAIL_LINE_MAP__MAP_NAME = 0;

  /**
   * The feature id for the '<em><b>Stations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAIL_LINE_MAP__STATIONS = 1;

  /**
   * The feature id for the '<em><b>Turnouts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAIL_LINE_MAP__TURNOUTS = 2;

  /**
   * The feature id for the '<em><b>Connections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAIL_LINE_MAP__CONNECTIONS = 3;

  /**
   * The number of structural features of the '<em>Rail Line Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RAIL_LINE_MAP_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link hu.bme.mit.temalab.railmap.railLinesMap.impl.StationImpl <em>Station</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.StationImpl
   * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLinesMapPackageImpl#getStation()
   * @generated
   */
  int STATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Tracks</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATION__TRACKS = 1;

  /**
   * The number of structural features of the '<em>Station</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.temalab.railmap.railLinesMap.impl.ConnectionImpl <em>Connection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.ConnectionImpl
   * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLinesMapPackageImpl#getConnection()
   * @generated
   */
  int CONNECTION = 2;

  /**
   * The feature id for the '<em><b>Src</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__SRC = 0;

  /**
   * The feature id for the '<em><b>Dst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__DST = 1;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__LENGTH = 2;

  /**
   * The feature id for the '<em><b>Gauge</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION__GAUGE = 3;

  /**
   * The number of structural features of the '<em>Connection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link hu.bme.mit.temalab.railmap.railLinesMap.impl.TurnoutImpl <em>Turnout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.TurnoutImpl
   * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLinesMapPackageImpl#getTurnout()
   * @generated
   */
  int TURNOUT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURNOUT__NAME = 0;

  /**
   * The number of structural features of the '<em>Turnout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURNOUT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.temalab.railmap.railLinesMap.impl.LocationImpl <em>Location</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.LocationImpl
   * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLinesMapPackageImpl#getLocation()
   * @generated
   */
  int LOCATION = 4;

  /**
   * The number of structural features of the '<em>Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.temalab.railmap.railLinesMap.impl.StationTrackLocationImpl <em>Station Track Location</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.StationTrackLocationImpl
   * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLinesMapPackageImpl#getStationTrackLocation()
   * @generated
   */
  int STATION_TRACK_LOCATION = 5;

  /**
   * The feature id for the '<em><b>Station</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATION_TRACK_LOCATION__STATION = LOCATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Track</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATION_TRACK_LOCATION__TRACK = LOCATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Station Track Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATION_TRACK_LOCATION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.temalab.railmap.railLinesMap.impl.TurnoutEndLocationImpl <em>Turnout End Location</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.TurnoutEndLocationImpl
   * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLinesMapPackageImpl#getTurnoutEndLocation()
   * @generated
   */
  int TURNOUT_END_LOCATION = 6;

  /**
   * The feature id for the '<em><b>Turnout</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURNOUT_END_LOCATION__TURNOUT = LOCATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURNOUT_END_LOCATION__END = LOCATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Turnout End Location</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TURNOUT_END_LOCATION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.temalab.railmap.railLinesMap.TurnoutEnd <em>Turnout End</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.temalab.railmap.railLinesMap.TurnoutEnd
   * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLinesMapPackageImpl#getTurnoutEnd()
   * @generated
   */
  int TURNOUT_END = 7;

  /**
   * The meta object id for the '{@link hu.bme.mit.temalab.railmap.railLinesMap.Gauge <em>Gauge</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.temalab.railmap.railLinesMap.Gauge
   * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLinesMapPackageImpl#getGauge()
   * @generated
   */
  int GAUGE = 8;


  /**
   * Returns the meta object for class '{@link hu.bme.mit.temalab.railmap.railLinesMap.RailLineMap <em>Rail Line Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rail Line Map</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.RailLineMap
   * @generated
   */
  EClass getRailLineMap();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.temalab.railmap.railLinesMap.RailLineMap#getMapName <em>Map Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Map Name</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.RailLineMap#getMapName()
   * @see #getRailLineMap()
   * @generated
   */
  EAttribute getRailLineMap_MapName();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.temalab.railmap.railLinesMap.RailLineMap#getStations <em>Stations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stations</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.RailLineMap#getStations()
   * @see #getRailLineMap()
   * @generated
   */
  EReference getRailLineMap_Stations();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.temalab.railmap.railLinesMap.RailLineMap#getTurnouts <em>Turnouts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Turnouts</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.RailLineMap#getTurnouts()
   * @see #getRailLineMap()
   * @generated
   */
  EReference getRailLineMap_Turnouts();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.temalab.railmap.railLinesMap.RailLineMap#getConnections <em>Connections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Connections</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.RailLineMap#getConnections()
   * @see #getRailLineMap()
   * @generated
   */
  EReference getRailLineMap_Connections();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.temalab.railmap.railLinesMap.Station <em>Station</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Station</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.Station
   * @generated
   */
  EClass getStation();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.temalab.railmap.railLinesMap.Station#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.Station#getName()
   * @see #getStation()
   * @generated
   */
  EAttribute getStation_Name();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.temalab.railmap.railLinesMap.Station#getTracks <em>Tracks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tracks</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.Station#getTracks()
   * @see #getStation()
   * @generated
   */
  EAttribute getStation_Tracks();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.temalab.railmap.railLinesMap.Connection <em>Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connection</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.Connection
   * @generated
   */
  EClass getConnection();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.temalab.railmap.railLinesMap.Connection#getSrc <em>Src</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Src</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.Connection#getSrc()
   * @see #getConnection()
   * @generated
   */
  EReference getConnection_Src();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.temalab.railmap.railLinesMap.Connection#getDst <em>Dst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dst</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.Connection#getDst()
   * @see #getConnection()
   * @generated
   */
  EReference getConnection_Dst();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.temalab.railmap.railLinesMap.Connection#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.Connection#getLength()
   * @see #getConnection()
   * @generated
   */
  EAttribute getConnection_Length();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.temalab.railmap.railLinesMap.Connection#getGauge <em>Gauge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gauge</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.Connection#getGauge()
   * @see #getConnection()
   * @generated
   */
  EAttribute getConnection_Gauge();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.temalab.railmap.railLinesMap.Turnout <em>Turnout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Turnout</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.Turnout
   * @generated
   */
  EClass getTurnout();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.temalab.railmap.railLinesMap.Turnout#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.Turnout#getName()
   * @see #getTurnout()
   * @generated
   */
  EAttribute getTurnout_Name();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.temalab.railmap.railLinesMap.Location <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Location</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.Location
   * @generated
   */
  EClass getLocation();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.temalab.railmap.railLinesMap.StationTrackLocation <em>Station Track Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Station Track Location</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.StationTrackLocation
   * @generated
   */
  EClass getStationTrackLocation();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.temalab.railmap.railLinesMap.StationTrackLocation#getStation <em>Station</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Station</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.StationTrackLocation#getStation()
   * @see #getStationTrackLocation()
   * @generated
   */
  EReference getStationTrackLocation_Station();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.temalab.railmap.railLinesMap.StationTrackLocation#getTrack <em>Track</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Track</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.StationTrackLocation#getTrack()
   * @see #getStationTrackLocation()
   * @generated
   */
  EAttribute getStationTrackLocation_Track();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.temalab.railmap.railLinesMap.TurnoutEndLocation <em>Turnout End Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Turnout End Location</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.TurnoutEndLocation
   * @generated
   */
  EClass getTurnoutEndLocation();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.temalab.railmap.railLinesMap.TurnoutEndLocation#getTurnout <em>Turnout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Turnout</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.TurnoutEndLocation#getTurnout()
   * @see #getTurnoutEndLocation()
   * @generated
   */
  EReference getTurnoutEndLocation_Turnout();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.temalab.railmap.railLinesMap.TurnoutEndLocation#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.TurnoutEndLocation#getEnd()
   * @see #getTurnoutEndLocation()
   * @generated
   */
  EAttribute getTurnoutEndLocation_End();

  /**
   * Returns the meta object for enum '{@link hu.bme.mit.temalab.railmap.railLinesMap.TurnoutEnd <em>Turnout End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Turnout End</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.TurnoutEnd
   * @generated
   */
  EEnum getTurnoutEnd();

  /**
   * Returns the meta object for enum '{@link hu.bme.mit.temalab.railmap.railLinesMap.Gauge <em>Gauge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Gauge</em>'.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.Gauge
   * @generated
   */
  EEnum getGauge();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RailLinesMapFactory getRailLinesMapFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLineMapImpl <em>Rail Line Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLineMapImpl
     * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLinesMapPackageImpl#getRailLineMap()
     * @generated
     */
    EClass RAIL_LINE_MAP = eINSTANCE.getRailLineMap();

    /**
     * The meta object literal for the '<em><b>Map Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RAIL_LINE_MAP__MAP_NAME = eINSTANCE.getRailLineMap_MapName();

    /**
     * The meta object literal for the '<em><b>Stations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RAIL_LINE_MAP__STATIONS = eINSTANCE.getRailLineMap_Stations();

    /**
     * The meta object literal for the '<em><b>Turnouts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RAIL_LINE_MAP__TURNOUTS = eINSTANCE.getRailLineMap_Turnouts();

    /**
     * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RAIL_LINE_MAP__CONNECTIONS = eINSTANCE.getRailLineMap_Connections();

    /**
     * The meta object literal for the '{@link hu.bme.mit.temalab.railmap.railLinesMap.impl.StationImpl <em>Station</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.StationImpl
     * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLinesMapPackageImpl#getStation()
     * @generated
     */
    EClass STATION = eINSTANCE.getStation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATION__NAME = eINSTANCE.getStation_Name();

    /**
     * The meta object literal for the '<em><b>Tracks</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATION__TRACKS = eINSTANCE.getStation_Tracks();

    /**
     * The meta object literal for the '{@link hu.bme.mit.temalab.railmap.railLinesMap.impl.ConnectionImpl <em>Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.ConnectionImpl
     * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLinesMapPackageImpl#getConnection()
     * @generated
     */
    EClass CONNECTION = eINSTANCE.getConnection();

    /**
     * The meta object literal for the '<em><b>Src</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION__SRC = eINSTANCE.getConnection_Src();

    /**
     * The meta object literal for the '<em><b>Dst</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION__DST = eINSTANCE.getConnection_Dst();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTION__LENGTH = eINSTANCE.getConnection_Length();

    /**
     * The meta object literal for the '<em><b>Gauge</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTION__GAUGE = eINSTANCE.getConnection_Gauge();

    /**
     * The meta object literal for the '{@link hu.bme.mit.temalab.railmap.railLinesMap.impl.TurnoutImpl <em>Turnout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.TurnoutImpl
     * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLinesMapPackageImpl#getTurnout()
     * @generated
     */
    EClass TURNOUT = eINSTANCE.getTurnout();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TURNOUT__NAME = eINSTANCE.getTurnout_Name();

    /**
     * The meta object literal for the '{@link hu.bme.mit.temalab.railmap.railLinesMap.impl.LocationImpl <em>Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.LocationImpl
     * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLinesMapPackageImpl#getLocation()
     * @generated
     */
    EClass LOCATION = eINSTANCE.getLocation();

    /**
     * The meta object literal for the '{@link hu.bme.mit.temalab.railmap.railLinesMap.impl.StationTrackLocationImpl <em>Station Track Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.StationTrackLocationImpl
     * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLinesMapPackageImpl#getStationTrackLocation()
     * @generated
     */
    EClass STATION_TRACK_LOCATION = eINSTANCE.getStationTrackLocation();

    /**
     * The meta object literal for the '<em><b>Station</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATION_TRACK_LOCATION__STATION = eINSTANCE.getStationTrackLocation_Station();

    /**
     * The meta object literal for the '<em><b>Track</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATION_TRACK_LOCATION__TRACK = eINSTANCE.getStationTrackLocation_Track();

    /**
     * The meta object literal for the '{@link hu.bme.mit.temalab.railmap.railLinesMap.impl.TurnoutEndLocationImpl <em>Turnout End Location</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.TurnoutEndLocationImpl
     * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLinesMapPackageImpl#getTurnoutEndLocation()
     * @generated
     */
    EClass TURNOUT_END_LOCATION = eINSTANCE.getTurnoutEndLocation();

    /**
     * The meta object literal for the '<em><b>Turnout</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TURNOUT_END_LOCATION__TURNOUT = eINSTANCE.getTurnoutEndLocation_Turnout();

    /**
     * The meta object literal for the '<em><b>End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TURNOUT_END_LOCATION__END = eINSTANCE.getTurnoutEndLocation_End();

    /**
     * The meta object literal for the '{@link hu.bme.mit.temalab.railmap.railLinesMap.TurnoutEnd <em>Turnout End</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.temalab.railmap.railLinesMap.TurnoutEnd
     * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLinesMapPackageImpl#getTurnoutEnd()
     * @generated
     */
    EEnum TURNOUT_END = eINSTANCE.getTurnoutEnd();

    /**
     * The meta object literal for the '{@link hu.bme.mit.temalab.railmap.railLinesMap.Gauge <em>Gauge</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.temalab.railmap.railLinesMap.Gauge
     * @see hu.bme.mit.temalab.railmap.railLinesMap.impl.RailLinesMapPackageImpl#getGauge()
     * @generated
     */
    EEnum GAUGE = eINSTANCE.getGauge();

  }

} //RailLinesMapPackage