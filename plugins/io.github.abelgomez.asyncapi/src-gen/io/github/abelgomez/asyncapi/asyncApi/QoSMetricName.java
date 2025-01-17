/**
 * generated by Xtext 2.18.0.M3
 */
package io.github.abelgomez.asyncapi.asyncApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Qo SMetric Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getQoSMetricName()
 * @model
 * @generated
 */
public enum QoSMetricName implements Enumerator
{
  /**
   * The '<em><b>Latency</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LATENCY_VALUE
   * @generated
   * @ordered
   */
  LATENCY(0, "latency", "\"latency\""),

  /**
   * The '<em><b>Availability</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AVAILABILITY_VALUE
   * @generated
   * @ordered
   */
  AVAILABILITY(1, "availability", "\"availability\"");

  /**
   * The '<em><b>Latency</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LATENCY
   * @model name="latency" literal="\"latency\""
   * @generated
   * @ordered
   */
  public static final int LATENCY_VALUE = 0;

  /**
   * The '<em><b>Availability</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AVAILABILITY
   * @model name="availability" literal="\"availability\""
   * @generated
   * @ordered
   */
  public static final int AVAILABILITY_VALUE = 1;

  /**
   * An array of all the '<em><b>Qo SMetric Name</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final QoSMetricName[] VALUES_ARRAY =
    new QoSMetricName[]
    {
      LATENCY,
      AVAILABILITY,
    };

  /**
   * A public read-only list of all the '<em><b>Qo SMetric Name</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<QoSMetricName> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Qo SMetric Name</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static QoSMetricName get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      QoSMetricName result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Qo SMetric Name</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static QoSMetricName getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      QoSMetricName result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Qo SMetric Name</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static QoSMetricName get(int value)
  {
    switch (value)
    {
      case LATENCY_VALUE: return LATENCY;
      case AVAILABILITY_VALUE: return AVAILABILITY;
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
  private QoSMetricName(int value, String name, String literal)
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
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
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
  
} //QoSMetricName
