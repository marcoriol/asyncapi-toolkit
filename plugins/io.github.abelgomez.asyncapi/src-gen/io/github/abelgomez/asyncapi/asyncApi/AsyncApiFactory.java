/**
 * generated by Xtext 2.17.0
 */
package io.github.abelgomez.asyncapi.asyncApi;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage
 * @generated
 */
public interface AsyncApiFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  AsyncApiFactory eINSTANCE = io.github.abelgomez.asyncapi.asyncApi.impl.AsyncApiFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Async API</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Async API</em>'.
	 * @generated
	 */
  AsyncAPI createAsyncAPI();

  /**
	 * Returns a new object of class '<em>Info</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Info</em>'.
	 * @generated
	 */
  Info createInfo();

  /**
	 * Returns a new object of class '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact</em>'.
	 * @generated
	 */
  Contact createContact();

  /**
	 * Returns a new object of class '<em>License</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>License</em>'.
	 * @generated
	 */
  License createLicense();

  /**
	 * Returns a new object of class '<em>Server</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server</em>'.
	 * @generated
	 */
  Server createServer();

  /**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
  Variable createVariable();

  /**
	 * Returns a new object of class '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel</em>'.
	 * @generated
	 */
  Channel createChannel();

  /**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
  Operation createOperation();

  /**
	 * Returns a new object of class '<em>Abstract Message</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Message</em>'.
	 * @generated
	 */
  AbstractMessage createAbstractMessage();

  /**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
  Message createMessage();

  /**
	 * Returns a new object of class '<em>Named Message</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Message</em>'.
	 * @generated
	 */
  NamedMessage createNamedMessage();

  /**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
  Tag createTag();

  /**
	 * Returns a new object of class '<em>Abstract Schema</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Schema</em>'.
	 * @generated
	 */
  AbstractSchema createAbstractSchema();

  /**
	 * Returns a new object of class '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema</em>'.
	 * @generated
	 */
  Schema createSchema();

  /**
	 * Returns a new object of class '<em>Named Schema</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Schema</em>'.
	 * @generated
	 */
  NamedSchema createNamedSchema();

  /**
	 * Returns a new object of class '<em>Abstract Parameter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Parameter</em>'.
	 * @generated
	 */
  AbstractParameter createAbstractParameter();

  /**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
  Parameter createParameter();

  /**
	 * Returns a new object of class '<em>Named Parameter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Parameter</em>'.
	 * @generated
	 */
  NamedParameter createNamedParameter();

  /**
	 * Returns a new object of class '<em>Abstract Operation Trait</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Operation Trait</em>'.
	 * @generated
	 */
  AbstractOperationTrait createAbstractOperationTrait();

  /**
	 * Returns a new object of class '<em>Operation Trait</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Trait</em>'.
	 * @generated
	 */
  OperationTrait createOperationTrait();

  /**
	 * Returns a new object of class '<em>Named Operation Trait</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Operation Trait</em>'.
	 * @generated
	 */
  NamedOperationTrait createNamedOperationTrait();

  /**
	 * Returns a new object of class '<em>Abstract Message Trait</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Message Trait</em>'.
	 * @generated
	 */
  AbstractMessageTrait createAbstractMessageTrait();

  /**
	 * Returns a new object of class '<em>Message Trait</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Trait</em>'.
	 * @generated
	 */
  MessageTrait createMessageTrait();

  /**
	 * Returns a new object of class '<em>Named Message Trait</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Message Trait</em>'.
	 * @generated
	 */
  NamedMessageTrait createNamedMessageTrait();

  /**
	 * Returns a new object of class '<em>Components</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Components</em>'.
	 * @generated
	 */
  Components createComponents();

  /**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
  Reference createReference();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  AsyncApiPackage getAsyncApiPackage();

} //AsyncApiFactory
