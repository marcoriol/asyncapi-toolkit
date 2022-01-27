/**
 * generated by Xtext 2.17.0
 */
package io.github.abelgomez.asyncapi.asyncApi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Reference#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends AbstractMessage, AbstractSchema, AbstractParameter, AbstractOperationTrait, AbstractMessageTrait, AbstractQoSMetric
{
  /**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getReference_Uri()
	 * @model
	 * @generated
	 */
  String getUri();

  /**
	 * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Reference#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
  void setUri(String value);

} // Reference
