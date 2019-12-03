/**
 * generated by Xtext 2.20.0-SNAPSHOT
 */
package hu.bme.mit.temalab.railmap.railLinesMap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gauge</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.temalab.railmap.railLinesMap.RailLinesMapPackage#getGauge()
 * @model
 * @generated
 */
public enum Gauge implements Enumerator
{
  /**
   * The '<em><b>STANDARD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STANDARD_VALUE
   * @generated
   * @ordered
   */
  STANDARD(0, "STANDARD", "standard gauge"),

  /**
   * The '<em><b>NARROW</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NARROW_VALUE
   * @generated
   * @ordered
   */
  NARROW(1, "NARROW", "narrow gauge"),

  /**
   * The '<em><b>BROAD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BROAD_VALUE
   * @generated
   * @ordered
   */
  BROAD(2, "BROAD", "broad gauge");

  /**
   * The '<em><b>STANDARD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STANDARD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STANDARD
   * @model literal="standard gauge"
   * @generated
   * @ordered
   */
  public static final int STANDARD_VALUE = 0;

  /**
   * The '<em><b>NARROW</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NARROW</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NARROW
   * @model literal="narrow gauge"
   * @generated
   * @ordered
   */
  public static final int NARROW_VALUE = 1;

  /**
   * The '<em><b>BROAD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BROAD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BROAD
   * @model literal="broad gauge"
   * @generated
   * @ordered
   */
  public static final int BROAD_VALUE = 2;

  /**
   * An array of all the '<em><b>Gauge</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Gauge[] VALUES_ARRAY =
    new Gauge[]
    {
      STANDARD,
      NARROW,
      BROAD,
    };

  /**
   * A public read-only list of all the '<em><b>Gauge</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Gauge> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Gauge</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Gauge get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Gauge result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Gauge</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Gauge getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Gauge result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Gauge</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Gauge get(int value)
  {
    switch (value)
    {
      case STANDARD_VALUE: return STANDARD;
      case NARROW_VALUE: return NARROW;
      case BROAD_VALUE: return BROAD;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Gauge(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Gauge
