/**
 * generated by Xtext 2.20.0-SNAPSHOT
 */
package hu.bme.mit.temalab.railmap.railLinesMap.impl;

import hu.bme.mit.temalab.railmap.railLinesMap.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RailLinesMapFactoryImpl extends EFactoryImpl implements RailLinesMapFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RailLinesMapFactory init()
  {
    try
    {
      RailLinesMapFactory theRailLinesMapFactory = (RailLinesMapFactory)EPackage.Registry.INSTANCE.getEFactory(RailLinesMapPackage.eNS_URI);
      if (theRailLinesMapFactory != null)
      {
        return theRailLinesMapFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RailLinesMapFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RailLinesMapFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RailLinesMapPackage.RAIL_LINE_MAP: return createRailLineMap();
      case RailLinesMapPackage.STATION: return createStation();
      case RailLinesMapPackage.CONNECTION: return createConnection();
      case RailLinesMapPackage.TURNOUT: return createTurnout();
      case RailLinesMapPackage.LOCATION: return createLocation();
      case RailLinesMapPackage.STATION_TRACK_LOCATION: return createStationTrackLocation();
      case RailLinesMapPackage.TURNOUT_END_LOCATION: return createTurnoutEndLocation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RailLinesMapPackage.TURNOUT_END:
        return createTurnoutEndFromString(eDataType, initialValue);
      case RailLinesMapPackage.GAUGE:
        return createGaugeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RailLinesMapPackage.TURNOUT_END:
        return convertTurnoutEndToString(eDataType, instanceValue);
      case RailLinesMapPackage.GAUGE:
        return convertGaugeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RailLineMap createRailLineMap()
  {
    RailLineMapImpl railLineMap = new RailLineMapImpl();
    return railLineMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Station createStation()
  {
    StationImpl station = new StationImpl();
    return station;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Connection createConnection()
  {
    ConnectionImpl connection = new ConnectionImpl();
    return connection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Turnout createTurnout()
  {
    TurnoutImpl turnout = new TurnoutImpl();
    return turnout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Location createLocation()
  {
    LocationImpl location = new LocationImpl();
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StationTrackLocation createStationTrackLocation()
  {
    StationTrackLocationImpl stationTrackLocation = new StationTrackLocationImpl();
    return stationTrackLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TurnoutEndLocation createTurnoutEndLocation()
  {
    TurnoutEndLocationImpl turnoutEndLocation = new TurnoutEndLocationImpl();
    return turnoutEndLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TurnoutEnd createTurnoutEndFromString(EDataType eDataType, String initialValue)
  {
    TurnoutEnd result = TurnoutEnd.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTurnoutEndToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Gauge createGaugeFromString(EDataType eDataType, String initialValue)
  {
    Gauge result = Gauge.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertGaugeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RailLinesMapPackage getRailLinesMapPackage()
  {
    return (RailLinesMapPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RailLinesMapPackage getPackage()
  {
    return RailLinesMapPackage.eINSTANCE;
  }

} //RailLinesMapFactoryImpl
