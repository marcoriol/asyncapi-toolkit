/**
 * generated by Xtext 2.18.0.M3
 */
package io.github.abelgomez.asyncapi.asyncApi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Async API</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.AsyncAPI#getVersion <em>Version</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.AsyncAPI#getInfo <em>Info</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.AsyncAPI#getServers <em>Servers</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.AsyncAPI#getChannels <em>Channels</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.AsyncAPI#getComponents <em>Components</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.AsyncAPI#getSla <em>Sla</em>}</li>
 * </ul>
 *
 * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getAsyncAPI()
 * @model
 * @generated
 */
public interface AsyncAPI extends EObject
{
  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * The literals are from the enumeration {@link io.github.abelgomez.asyncapi.asyncApi.VersionNumber}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see io.github.abelgomez.asyncapi.asyncApi.VersionNumber
   * @see #setVersion(VersionNumber)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getAsyncAPI_Version()
   * @model
   * @generated
   */
  VersionNumber getVersion();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.AsyncAPI#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see io.github.abelgomez.asyncapi.asyncApi.VersionNumber
   * @see #getVersion()
   * @generated
   */
  void setVersion(VersionNumber value);

  /**
   * Returns the value of the '<em><b>Info</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Info</em>' containment reference.
   * @see #setInfo(Info)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getAsyncAPI_Info()
   * @model containment="true"
   * @generated
   */
  Info getInfo();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.AsyncAPI#getInfo <em>Info</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Info</em>' containment reference.
   * @see #getInfo()
   * @generated
   */
  void setInfo(Info value);

  /**
   * Returns the value of the '<em><b>Servers</b></em>' containment reference list.
   * The list contents are of type {@link io.github.abelgomez.asyncapi.asyncApi.Server}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Servers</em>' containment reference list.
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getAsyncAPI_Servers()
   * @model containment="true"
   * @generated
   */
  EList<Server> getServers();

  /**
   * Returns the value of the '<em><b>Channels</b></em>' containment reference list.
   * The list contents are of type {@link io.github.abelgomez.asyncapi.asyncApi.Channel}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Channels</em>' containment reference list.
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getAsyncAPI_Channels()
   * @model containment="true"
   * @generated
   */
  EList<Channel> getChannels();

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference.
   * @see #setComponents(Components)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getAsyncAPI_Components()
   * @model containment="true"
   * @generated
   */
  Components getComponents();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.AsyncAPI#getComponents <em>Components</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Components</em>' containment reference.
   * @see #getComponents()
   * @generated
   */
  void setComponents(Components value);

  /**
   * Returns the value of the '<em><b>Sla</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sla</em>' containment reference.
   * @see #setSla(Sla)
   * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage#getAsyncAPI_Sla()
   * @model containment="true"
   * @generated
   */
  Sla getSla();

  /**
   * Sets the value of the '{@link io.github.abelgomez.asyncapi.asyncApi.AsyncAPI#getSla <em>Sla</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sla</em>' containment reference.
   * @see #getSla()
   * @generated
   */
  void setSla(Sla value);

} // AsyncAPI
