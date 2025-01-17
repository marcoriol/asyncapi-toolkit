/**
 * generated by Xtext 2.18.0.M3
 */
package io.github.abelgomez.asyncapi.asyncApi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Message#getName <em>Name</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Message#getTitle <em>Title</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Message#getSummary <em>Summary</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Message#getDescription <em>Description</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Message#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Message#getHeaders <em>Headers</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Message#getTags <em>Tags</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Message#getPayload <em>Payload</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Message#getTraits <em>Traits</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends AbstractMessage
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getMessage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Message#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getMessage_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Message#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Summary</em>' attribute.
   * @see #setSummary(String)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getMessage_Summary()
   * @model
   * @generated
   */
  String getSummary();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Message#getSummary <em>Summary</em>}' attribute.
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
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getMessage_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Message#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
   * The literals are from the enumeration {@link io.github.abelgomez.asyncapi.asyncApi.Boolean}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deprecated</em>' attribute.
   * @see io.github.abelgomez.asyncapi.asyncApi.Boolean
   * @see #setDeprecated(io.github.abelgomez.asyncapi.asyncApi.Boolean)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getMessage_Deprecated()
   * @model
   * @generated
   */
  io.github.abelgomez.asyncapi.asyncApi.Boolean getDeprecated();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Message#getDeprecated <em>Deprecated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deprecated</em>' attribute.
   * @see io.github.abelgomez.asyncapi.asyncApi.Boolean
   * @see #getDeprecated()
   * @generated
   */
  void setDeprecated(io.github.abelgomez.asyncapi.asyncApi.Boolean value);

  /**
   * Returns the value of the '<em><b>Headers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Headers</em>' containment reference.
   * @see #setHeaders(AbstractSchema)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getMessage_Headers()
   * @model containment="true"
   * @generated
   */
  AbstractSchema getHeaders();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Message#getHeaders <em>Headers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Headers</em>' containment reference.
   * @see #getHeaders()
   * @generated
   */
  void setHeaders(AbstractSchema value);

  /**
   * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
   * The list contents are of type {@link io.github.abelgomez.asyncapi.asyncApi.Tag}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tags</em>' containment reference list.
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getMessage_Tags()
   * @model containment="true"
   * @generated
   */
  EList<Tag> getTags();

  /**
   * Returns the value of the '<em><b>Payload</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Payload</em>' containment reference.
   * @see #setPayload(AbstractSchema)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getMessage_Payload()
   * @model containment="true"
   * @generated
   */
  AbstractSchema getPayload();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Message#getPayload <em>Payload</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Payload</em>' containment reference.
   * @see #getPayload()
   * @generated
   */
  void setPayload(AbstractSchema value);

  /**
   * Returns the value of the '<em><b>Traits</b></em>' containment reference list.
   * The list contents are of type {@link io.github.abelgomez.asyncapi.asyncApi.AbstractMessageTrait}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Traits</em>' containment reference list.
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getMessage_Traits()
   * @model containment="true"
   * @generated
   */
  EList<AbstractMessageTrait> getTraits();

} // Message
