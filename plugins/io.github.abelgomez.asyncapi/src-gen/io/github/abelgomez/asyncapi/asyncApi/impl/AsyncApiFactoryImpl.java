/**
 * generated by Xtext 2.17.0
 */
package io.github.abelgomez.asyncapi.asyncApi.impl;

import io.github.abelgomez.asyncapi.asyncApi.AbstractMessage;
import io.github.abelgomez.asyncapi.asyncApi.AbstractMessageTrait;
import io.github.abelgomez.asyncapi.asyncApi.AbstractOperationTrait;
import io.github.abelgomez.asyncapi.asyncApi.AbstractParameter;
import io.github.abelgomez.asyncapi.asyncApi.AbstractSchema;
import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI;
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiFactory;
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage;
import io.github.abelgomez.asyncapi.asyncApi.Channel;
import io.github.abelgomez.asyncapi.asyncApi.Components;
import io.github.abelgomez.asyncapi.asyncApi.Contact;
import io.github.abelgomez.asyncapi.asyncApi.Info;
import io.github.abelgomez.asyncapi.asyncApi.JsonType;
import io.github.abelgomez.asyncapi.asyncApi.License;
import io.github.abelgomez.asyncapi.asyncApi.Message;
import io.github.abelgomez.asyncapi.asyncApi.MessageTrait;
import io.github.abelgomez.asyncapi.asyncApi.NamedMessage;
import io.github.abelgomez.asyncapi.asyncApi.NamedMessageTrait;
import io.github.abelgomez.asyncapi.asyncApi.NamedOperationTrait;
import io.github.abelgomez.asyncapi.asyncApi.NamedParameter;
import io.github.abelgomez.asyncapi.asyncApi.NamedSchema;
import io.github.abelgomez.asyncapi.asyncApi.Operation;
import io.github.abelgomez.asyncapi.asyncApi.OperationTrait;
import io.github.abelgomez.asyncapi.asyncApi.Parameter;
import io.github.abelgomez.asyncapi.asyncApi.Protocol;
import io.github.abelgomez.asyncapi.asyncApi.Reference;
import io.github.abelgomez.asyncapi.asyncApi.Schema;
import io.github.abelgomez.asyncapi.asyncApi.Server;
import io.github.abelgomez.asyncapi.asyncApi.Tag;
import io.github.abelgomez.asyncapi.asyncApi.Variable;
import io.github.abelgomez.asyncapi.asyncApi.VersionNumber;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AsyncApiFactoryImpl extends EFactoryImpl implements AsyncApiFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static AsyncApiFactory init()
  {
		try {
			AsyncApiFactory theAsyncApiFactory = (AsyncApiFactory)EPackage.Registry.INSTANCE.getEFactory(AsyncApiPackage.eNS_URI);
			if (theAsyncApiFactory != null) {
				return theAsyncApiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AsyncApiFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AsyncApiFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case AsyncApiPackage.ASYNC_API: return createAsyncAPI();
			case AsyncApiPackage.INFO: return createInfo();
			case AsyncApiPackage.CONTACT: return createContact();
			case AsyncApiPackage.LICENSE: return createLicense();
			case AsyncApiPackage.SERVER: return createServer();
			case AsyncApiPackage.VARIABLE: return createVariable();
			case AsyncApiPackage.CHANNEL: return createChannel();
			case AsyncApiPackage.OPERATION: return createOperation();
			case AsyncApiPackage.ABSTRACT_MESSAGE: return createAbstractMessage();
			case AsyncApiPackage.MESSAGE: return createMessage();
			case AsyncApiPackage.NAMED_MESSAGE: return createNamedMessage();
			case AsyncApiPackage.TAG: return createTag();
			case AsyncApiPackage.ABSTRACT_SCHEMA: return createAbstractSchema();
			case AsyncApiPackage.SCHEMA: return createSchema();
			case AsyncApiPackage.NAMED_SCHEMA: return createNamedSchema();
			case AsyncApiPackage.ABSTRACT_PARAMETER: return createAbstractParameter();
			case AsyncApiPackage.PARAMETER: return createParameter();
			case AsyncApiPackage.NAMED_PARAMETER: return createNamedParameter();
			case AsyncApiPackage.ABSTRACT_OPERATION_TRAIT: return createAbstractOperationTrait();
			case AsyncApiPackage.OPERATION_TRAIT: return createOperationTrait();
			case AsyncApiPackage.NAMED_OPERATION_TRAIT: return createNamedOperationTrait();
			case AsyncApiPackage.ABSTRACT_MESSAGE_TRAIT: return createAbstractMessageTrait();
			case AsyncApiPackage.MESSAGE_TRAIT: return createMessageTrait();
			case AsyncApiPackage.NAMED_MESSAGE_TRAIT: return createNamedMessageTrait();
			case AsyncApiPackage.COMPONENTS: return createComponents();
			case AsyncApiPackage.REFERENCE: return createReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case AsyncApiPackage.JSON_TYPE:
				return createJsonTypeFromString(eDataType, initialValue);
			case AsyncApiPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case AsyncApiPackage.VERSION_NUMBER:
				return createVersionNumberFromString(eDataType, initialValue);
			case AsyncApiPackage.PROTOCOL:
				return createProtocolFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case AsyncApiPackage.JSON_TYPE:
				return convertJsonTypeToString(eDataType, instanceValue);
			case AsyncApiPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case AsyncApiPackage.VERSION_NUMBER:
				return convertVersionNumberToString(eDataType, instanceValue);
			case AsyncApiPackage.PROTOCOL:
				return convertProtocolToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public AsyncAPI createAsyncAPI()
  {
		AsyncAPIImpl asyncAPI = new AsyncAPIImpl();
		return asyncAPI;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Info createInfo()
  {
		InfoImpl info = new InfoImpl();
		return info;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Contact createContact()
  {
		ContactImpl contact = new ContactImpl();
		return contact;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public License createLicense()
  {
		LicenseImpl license = new LicenseImpl();
		return license;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Server createServer()
  {
		ServerImpl server = new ServerImpl();
		return server;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Variable createVariable()
  {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Channel createChannel()
  {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Operation createOperation()
  {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public AbstractMessage createAbstractMessage()
  {
		AbstractMessageImpl abstractMessage = new AbstractMessageImpl();
		return abstractMessage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Message createMessage()
  {
		MessageImpl message = new MessageImpl();
		return message;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NamedMessage createNamedMessage()
  {
		NamedMessageImpl namedMessage = new NamedMessageImpl();
		return namedMessage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Tag createTag()
  {
		TagImpl tag = new TagImpl();
		return tag;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public AbstractSchema createAbstractSchema()
  {
		AbstractSchemaImpl abstractSchema = new AbstractSchemaImpl();
		return abstractSchema;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Schema createSchema()
  {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NamedSchema createNamedSchema()
  {
		NamedSchemaImpl namedSchema = new NamedSchemaImpl();
		return namedSchema;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public AbstractParameter createAbstractParameter()
  {
		AbstractParameterImpl abstractParameter = new AbstractParameterImpl();
		return abstractParameter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Parameter createParameter()
  {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NamedParameter createNamedParameter()
  {
		NamedParameterImpl namedParameter = new NamedParameterImpl();
		return namedParameter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public AbstractOperationTrait createAbstractOperationTrait()
  {
		AbstractOperationTraitImpl abstractOperationTrait = new AbstractOperationTraitImpl();
		return abstractOperationTrait;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public OperationTrait createOperationTrait()
  {
		OperationTraitImpl operationTrait = new OperationTraitImpl();
		return operationTrait;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NamedOperationTrait createNamedOperationTrait()
  {
		NamedOperationTraitImpl namedOperationTrait = new NamedOperationTraitImpl();
		return namedOperationTrait;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public AbstractMessageTrait createAbstractMessageTrait()
  {
		AbstractMessageTraitImpl abstractMessageTrait = new AbstractMessageTraitImpl();
		return abstractMessageTrait;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public MessageTrait createMessageTrait()
  {
		MessageTraitImpl messageTrait = new MessageTraitImpl();
		return messageTrait;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NamedMessageTrait createNamedMessageTrait()
  {
		NamedMessageTraitImpl namedMessageTrait = new NamedMessageTraitImpl();
		return namedMessageTrait;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Components createComponents()
  {
		ComponentsImpl components = new ComponentsImpl();
		return components;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Reference createReference()
  {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public JsonType createJsonTypeFromString(EDataType eDataType, String initialValue)
  {
		JsonType result = JsonType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertJsonTypeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public io.github.abelgomez.asyncapi.asyncApi.Boolean createBooleanFromString(EDataType eDataType, String initialValue)
  {
		io.github.abelgomez.asyncapi.asyncApi.Boolean result = io.github.abelgomez.asyncapi.asyncApi.Boolean.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertBooleanToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VersionNumber createVersionNumberFromString(EDataType eDataType, String initialValue)
  {
		VersionNumber result = VersionNumber.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertVersionNumberToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Protocol createProtocolFromString(EDataType eDataType, String initialValue)
  {
		Protocol result = Protocol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertProtocolToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public AsyncApiPackage getAsyncApiPackage()
  {
		return (AsyncApiPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static AsyncApiPackage getPackage()
  {
		return AsyncApiPackage.eINSTANCE;
	}

} //AsyncApiFactoryImpl
