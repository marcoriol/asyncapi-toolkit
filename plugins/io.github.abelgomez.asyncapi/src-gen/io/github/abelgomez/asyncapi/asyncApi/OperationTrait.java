/**
 * generated by Xtext 2.18.0.M3
 */
package io.github.abelgomez.asyncapi.asyncApi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Trait</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.OperationTrait#getOperationId <em>Operation Id</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.OperationTrait#getSummary <em>Summary</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.OperationTrait#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getOperationTrait()
 * @model
 * @generated
 */
public interface OperationTrait extends AbstractOperationTrait
{
  /**
   * Returns the value of the '<em><b>Operation Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation Id</em>' attribute.
   * @see #setOperationId(String)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getOperationTrait_OperationId()
   * @model
   * @generated
   */
  String getOperationId();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.OperationTrait#getOperationId <em>Operation Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation Id</em>' attribute.
   * @see #getOperationId()
   * @generated
   */
  void setOperationId(String value);

  /**
   * Returns the value of the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Summary</em>' attribute.
   * @see #setSummary(String)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getOperationTrait_Summary()
   * @model
   * @generated
   */
  String getSummary();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.OperationTrait#getSummary <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Summary</em>' attribute.
   * @see #getSummary()
   * @generated
   */
  void setSummary(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getOperationTrait_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.OperationTrait#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // OperationTrait
