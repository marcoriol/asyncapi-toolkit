/**
 * generated by Xtext 2.18.0.M3
 */
package io.github.abelgomez.asyncapi.asyncApi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Info#getTitle <em>Title</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Info#getVersion <em>Version</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Info#getDescription <em>Description</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Info#getTermsOfService <em>Terms Of Service</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Info#getContact <em>Contact</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Info#getLicense <em>License</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.Info#getBasePackage <em>Base Package</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getInfo()
 * @model
 * @generated
 */
public interface Info extends EObject
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getInfo_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Info#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getInfo_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Info#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getInfo_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Info#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Terms Of Service</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Terms Of Service</em>' attribute.
   * @see #setTermsOfService(String)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getInfo_TermsOfService()
   * @model
   * @generated
   */
  String getTermsOfService();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Info#getTermsOfService <em>Terms Of Service</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Terms Of Service</em>' attribute.
   * @see #getTermsOfService()
   * @generated
   */
  void setTermsOfService(String value);

  /**
   * Returns the value of the '<em><b>Contact</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contact</em>' containment reference.
   * @see #setContact(Contact)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getInfo_Contact()
   * @model containment="true"
   * @generated
   */
  Contact getContact();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Info#getContact <em>Contact</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contact</em>' containment reference.
   * @see #getContact()
   * @generated
   */
  void setContact(Contact value);

  /**
   * Returns the value of the '<em><b>License</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>License</em>' containment reference.
   * @see #setLicense(License)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getInfo_License()
   * @model containment="true"
   * @generated
   */
  License getLicense();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Info#getLicense <em>License</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>License</em>' containment reference.
   * @see #getLicense()
   * @generated
   */
  void setLicense(License value);

  /**
   * Returns the value of the '<em><b>Base Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Package</em>' attribute.
   * @see #setBasePackage(String)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getInfo_BasePackage()
   * @model
   * @generated
   */
  String getBasePackage();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.Info#getBasePackage <em>Base Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Package</em>' attribute.
   * @see #getBasePackage()
   * @generated
   */
  void setBasePackage(String value);

} // Info
