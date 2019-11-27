/**
 * generated by Xtext 2.20.0-SNAPSHOT
 */
package hu.bme.mit.temalab.railmap.railLinesMap.util;

import hu.bme.mit.temalab.railmap.railLinesMap.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.temalab.railmap.railLinesMap.RailLinesMapPackage
 * @generated
 */
public class RailLinesMapAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RailLinesMapPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RailLinesMapAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RailLinesMapPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RailLinesMapSwitch<Adapter> modelSwitch =
    new RailLinesMapSwitch<Adapter>()
    {
      @Override
      public Adapter caseRailLineMap(RailLineMap object)
      {
        return createRailLineMapAdapter();
      }
      @Override
      public Adapter caseStation(Station object)
      {
        return createStationAdapter();
      }
      @Override
      public Adapter caseConnection(Connection object)
      {
        return createConnectionAdapter();
      }
      @Override
      public Adapter caseTurnout(Turnout object)
      {
        return createTurnoutAdapter();
      }
      @Override
      public Adapter caseLocation(Location object)
      {
        return createLocationAdapter();
      }
      @Override
      public Adapter caseStationTrackLocation(StationTrackLocation object)
      {
        return createStationTrackLocationAdapter();
      }
      @Override
      public Adapter caseTurnoutEndLocation(TurnoutEndLocation object)
      {
        return createTurnoutEndLocationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.temalab.railmap.railLinesMap.RailLineMap <em>Rail Line Map</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.RailLineMap
   * @generated
   */
  public Adapter createRailLineMapAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.temalab.railmap.railLinesMap.Station <em>Station</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.Station
   * @generated
   */
  public Adapter createStationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.temalab.railmap.railLinesMap.Connection <em>Connection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.Connection
   * @generated
   */
  public Adapter createConnectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.temalab.railmap.railLinesMap.Turnout <em>Turnout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.Turnout
   * @generated
   */
  public Adapter createTurnoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.temalab.railmap.railLinesMap.Location <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.Location
   * @generated
   */
  public Adapter createLocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.temalab.railmap.railLinesMap.StationTrackLocation <em>Station Track Location</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.StationTrackLocation
   * @generated
   */
  public Adapter createStationTrackLocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.mit.temalab.railmap.railLinesMap.TurnoutEndLocation <em>Turnout End Location</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.mit.temalab.railmap.railLinesMap.TurnoutEndLocation
   * @generated
   */
  public Adapter createTurnoutEndLocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RailLinesMapAdapterFactory
