/**
 * generated by Xtext 2.18.0.M3
 */
package io.github.abelgomez.asyncapi.asyncApi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo SMetric Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.QoSMetricReference#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getQoSMetricReference()
 * @model
 * @generated
 */
public interface QoSMetricReference extends AbstractQoSMetric
{
  /**
   * Returns the value of the '<em><b>Metric</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metric</em>' reference.
   * @see #setMetric(QoSMetric)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getQoSMetricReference_Metric()
   * @model
   * @generated
   */
  QoSMetric getMetric();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.QoSMetricReference#getMetric <em>Metric</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metric</em>' reference.
   * @see #getMetric()
   * @generated
   */
  void setMetric(QoSMetric value);

} // QoSMetricReference