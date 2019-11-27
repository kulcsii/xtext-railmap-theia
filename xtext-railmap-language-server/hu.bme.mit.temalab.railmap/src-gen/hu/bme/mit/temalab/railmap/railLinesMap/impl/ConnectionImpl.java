/**
 * generated by Xtext 2.20.0-SNAPSHOT
 */
package hu.bme.mit.temalab.railmap.railLinesMap.impl;

import hu.bme.mit.temalab.railmap.railLinesMap.Connection;
import hu.bme.mit.temalab.railmap.railLinesMap.Gauge;
import hu.bme.mit.temalab.railmap.railLinesMap.Location;
import hu.bme.mit.temalab.railmap.railLinesMap.RailLinesMapPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.temalab.railmap.railLinesMap.impl.ConnectionImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link hu.bme.mit.temalab.railmap.railLinesMap.impl.ConnectionImpl#getDst <em>Dst</em>}</li>
 *   <li>{@link hu.bme.mit.temalab.railmap.railLinesMap.impl.ConnectionImpl#getLength <em>Length</em>}</li>
 *   <li>{@link hu.bme.mit.temalab.railmap.railLinesMap.impl.ConnectionImpl#getGauge <em>Gauge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection
{
  /**
   * The cached value of the '{@link #getSrc() <em>Src</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrc()
   * @generated
   * @ordered
   */
  protected Location src;

  /**
   * The cached value of the '{@link #getDst() <em>Dst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDst()
   * @generated
   * @ordered
   */
  protected Location dst;

  /**
   * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
  protected static final int LENGTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
  protected int length = LENGTH_EDEFAULT;

  /**
   * The default value of the '{@link #getGauge() <em>Gauge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGauge()
   * @generated
   * @ordered
   */
  protected static final Gauge GAUGE_EDEFAULT = Gauge.STANDARD;

  /**
   * The cached value of the '{@link #getGauge() <em>Gauge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGauge()
   * @generated
   * @ordered
   */
  protected Gauge gauge = GAUGE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnectionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RailLinesMapPackage.Literals.CONNECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Location getSrc()
  {
    return src;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSrc(Location newSrc, NotificationChain msgs)
  {
    Location oldSrc = src;
    src = newSrc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RailLinesMapPackage.CONNECTION__SRC, oldSrc, newSrc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSrc(Location newSrc)
  {
    if (newSrc != src)
    {
      NotificationChain msgs = null;
      if (src != null)
        msgs = ((InternalEObject)src).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RailLinesMapPackage.CONNECTION__SRC, null, msgs);
      if (newSrc != null)
        msgs = ((InternalEObject)newSrc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RailLinesMapPackage.CONNECTION__SRC, null, msgs);
      msgs = basicSetSrc(newSrc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RailLinesMapPackage.CONNECTION__SRC, newSrc, newSrc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Location getDst()
  {
    return dst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDst(Location newDst, NotificationChain msgs)
  {
    Location oldDst = dst;
    dst = newDst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RailLinesMapPackage.CONNECTION__DST, oldDst, newDst);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDst(Location newDst)
  {
    if (newDst != dst)
    {
      NotificationChain msgs = null;
      if (dst != null)
        msgs = ((InternalEObject)dst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RailLinesMapPackage.CONNECTION__DST, null, msgs);
      if (newDst != null)
        msgs = ((InternalEObject)newDst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RailLinesMapPackage.CONNECTION__DST, null, msgs);
      msgs = basicSetDst(newDst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RailLinesMapPackage.CONNECTION__DST, newDst, newDst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLength()
  {
    return length;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLength(int newLength)
  {
    int oldLength = length;
    length = newLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RailLinesMapPackage.CONNECTION__LENGTH, oldLength, length));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Gauge getGauge()
  {
    return gauge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGauge(Gauge newGauge)
  {
    Gauge oldGauge = gauge;
    gauge = newGauge == null ? GAUGE_EDEFAULT : newGauge;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RailLinesMapPackage.CONNECTION__GAUGE, oldGauge, gauge));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RailLinesMapPackage.CONNECTION__SRC:
        return basicSetSrc(null, msgs);
      case RailLinesMapPackage.CONNECTION__DST:
        return basicSetDst(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RailLinesMapPackage.CONNECTION__SRC:
        return getSrc();
      case RailLinesMapPackage.CONNECTION__DST:
        return getDst();
      case RailLinesMapPackage.CONNECTION__LENGTH:
        return getLength();
      case RailLinesMapPackage.CONNECTION__GAUGE:
        return getGauge();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RailLinesMapPackage.CONNECTION__SRC:
        setSrc((Location)newValue);
        return;
      case RailLinesMapPackage.CONNECTION__DST:
        setDst((Location)newValue);
        return;
      case RailLinesMapPackage.CONNECTION__LENGTH:
        setLength((Integer)newValue);
        return;
      case RailLinesMapPackage.CONNECTION__GAUGE:
        setGauge((Gauge)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RailLinesMapPackage.CONNECTION__SRC:
        setSrc((Location)null);
        return;
      case RailLinesMapPackage.CONNECTION__DST:
        setDst((Location)null);
        return;
      case RailLinesMapPackage.CONNECTION__LENGTH:
        setLength(LENGTH_EDEFAULT);
        return;
      case RailLinesMapPackage.CONNECTION__GAUGE:
        setGauge(GAUGE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RailLinesMapPackage.CONNECTION__SRC:
        return src != null;
      case RailLinesMapPackage.CONNECTION__DST:
        return dst != null;
      case RailLinesMapPackage.CONNECTION__LENGTH:
        return length != LENGTH_EDEFAULT;
      case RailLinesMapPackage.CONNECTION__GAUGE:
        return gauge != GAUGE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (length: ");
    result.append(length);
    result.append(", gauge: ");
    result.append(gauge);
    result.append(')');
    return result.toString();
  }

} //ConnectionImpl
