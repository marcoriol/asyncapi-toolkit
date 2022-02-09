/**
 * generated by Xtext 2.25.0
 */
package io.github.abelgomez.asyncapi.asyncApi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualifying Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.QualifyingCondition#getName <em>Name</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.QualifyingCondition#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getQualifyingCondition()
 * @model
 * @generated
 */
public interface QualifyingCondition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getQualifyingCondition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.QualifyingCondition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(BooleanCondition)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getQualifyingCondition_Condition()
   * @model containment="true"
   * @generated
   */
  BooleanCondition getCondition();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.QualifyingCondition#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(BooleanCondition value);

} // QualifyingCondition
