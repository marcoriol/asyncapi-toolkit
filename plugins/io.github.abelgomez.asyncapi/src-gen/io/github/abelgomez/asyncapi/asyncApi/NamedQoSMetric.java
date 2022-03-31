/**
 * generated by Xtext 2.26.0
 */
package io.github.abelgomez.asyncapi.asyncApi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Qo SMetric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.NamedQoSMetric#getName <em>Name</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.NamedQoSMetric#getQosMetric <em>Qos Metric</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getNamedQoSMetric()
 * @model
 * @generated
 */
public interface NamedQoSMetric extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getNamedQoSMetric_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.NamedQoSMetric#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Qos Metric</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qos Metric</em>' containment reference.
   * @see #setQosMetric(AbstractQoSMetric)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getNamedQoSMetric_QosMetric()
   * @model containment="true"
   * @generated
   */
  AbstractQoSMetric getQosMetric();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.NamedQoSMetric#getQosMetric <em>Qos Metric</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qos Metric</em>' containment reference.
   * @see #getQosMetric()
   * @generated
   */
  void setQosMetric(AbstractQoSMetric value);

} // NamedQoSMetric
