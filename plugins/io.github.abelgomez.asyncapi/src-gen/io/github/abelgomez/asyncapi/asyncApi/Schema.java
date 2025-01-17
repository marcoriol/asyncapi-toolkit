/**
 * generated by Xtext 2.18.0.M3
 */
package io.github.abelgomez.asyncapi.asyncApi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getTitle <em>Title</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getType <em>Type</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getDescription <em>Description</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getFormat <em>Format</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getDefault <em>Default</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getProperties <em>Properties</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getEnum <em>Enum</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getItems <em>Items</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends AbstractSchema
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getSchema_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link io.github.abelgomez.asyncapi.asyncApi.JsonType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see io.github.abelgomez.asyncapi.asyncApi.JsonType
   * @see #setType(JsonType)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getSchema_Type()
   * @model
   * @generated
   */
  JsonType getType();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see io.github.abelgomez.asyncapi.asyncApi.JsonType
   * @see #getType()
   * @generated
   */
  void setType(JsonType value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getSchema_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Format</em>' attribute.
   * @see #setFormat(String)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getSchema_Format()
   * @model
   * @generated
   */
  String getFormat();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getFormat <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Format</em>' attribute.
   * @see #getFormat()
   * @generated
   */
  void setFormat(String value);

  /**
   * Returns the value of the '<em><b>Minimum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minimum</em>' attribute.
   * @see #setMinimum(int)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getSchema_Minimum()
   * @model
   * @generated
   */
  int getMinimum();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getMinimum <em>Minimum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minimum</em>' attribute.
   * @see #getMinimum()
   * @generated
   */
  void setMinimum(int value);

  /**
   * Returns the value of the '<em><b>Maximum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maximum</em>' attribute.
   * @see #setMaximum(int)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getSchema_Maximum()
   * @model
   * @generated
   */
  int getMaximum();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getMaximum <em>Maximum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maximum</em>' attribute.
   * @see #getMaximum()
   * @generated
   */
  void setMaximum(int value);

  /**
   * Returns the value of the '<em><b>Min Items</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Items</em>' attribute.
   * @see #setMinItems(int)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getSchema_MinItems()
   * @model
   * @generated
   */
  int getMinItems();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getMinItems <em>Min Items</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Items</em>' attribute.
   * @see #getMinItems()
   * @generated
   */
  void setMinItems(int value);

  /**
   * Returns the value of the '<em><b>Max Items</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Items</em>' attribute.
   * @see #setMaxItems(int)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getSchema_MaxItems()
   * @model
   * @generated
   */
  int getMaxItems();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getMaxItems <em>Max Items</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Items</em>' attribute.
   * @see #getMaxItems()
   * @generated
   */
  void setMaxItems(int value);

  /**
   * Returns the value of the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' attribute.
   * @see #setDefault(String)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getSchema_Default()
   * @model
   * @generated
   */
  String getDefault();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getDefault <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' attribute.
   * @see #getDefault()
   * @generated
   */
  void setDefault(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link io.github.abelgomez.asyncapi.asyncApi.NamedSchema}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getSchema_Properties()
   * @model containment="true"
   * @generated
   */
  EList<NamedSchema> getProperties();

  /**
   * Returns the value of the '<em><b>Enum</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum</em>' attribute list.
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getSchema_Enum()
   * @model unique="false"
   * @generated
   */
  EList<String> getEnum();

  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference.
   * @see #setItems(AbstractSchema)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getSchema_Items()
   * @model containment="true"
   * @generated
   */
  AbstractSchema getItems();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Schema#getItems <em>Items</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Items</em>' containment reference.
   * @see #getItems()
   * @generated
   */
  void setItems(AbstractSchema value);

  /**
   * Returns the value of the '<em><b>Required</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required</em>' attribute list.
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getSchema_Required()
   * @model unique="false"
   * @generated
   */
  EList<String> getRequired();

} // Schema
