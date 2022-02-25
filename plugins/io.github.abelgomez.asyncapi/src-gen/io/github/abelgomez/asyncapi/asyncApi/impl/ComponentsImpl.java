/**
 * generated by Xtext 2.25.0
 */
package io.github.abelgomez.asyncapi.asyncApi.impl;

import io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage;
import io.github.abelgomez.asyncapi.asyncApi.Components;
import io.github.abelgomez.asyncapi.asyncApi.NamedMessage;
import io.github.abelgomez.asyncapi.asyncApi.NamedMessageTrait;
import io.github.abelgomez.asyncapi.asyncApi.NamedOperationTrait;
import io.github.abelgomez.asyncapi.asyncApi.NamedParameter;
import io.github.abelgomez.asyncapi.asyncApi.NamedQoSMetric;
import io.github.abelgomez.asyncapi.asyncApi.NamedSchema;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Components</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.ComponentsImpl#getSchemas <em>Schemas</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.ComponentsImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.ComponentsImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.ComponentsImpl#getOperationTraits <em>Operation Traits</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.ComponentsImpl#getMessageTraits <em>Message Traits</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.ComponentsImpl#getQosMetrics <em>Qos Metrics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentsImpl extends MinimalEObjectImpl.Container implements Components
{
  /**
   * The cached value of the '{@link #getSchemas() <em>Schemas</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchemas()
   * @generated
   * @ordered
   */
  protected EList<NamedSchema> schemas;

  /**
   * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessages()
   * @generated
   * @ordered
   */
  protected EList<NamedMessage> messages;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<NamedParameter> parameters;

  /**
   * The cached value of the '{@link #getOperationTraits() <em>Operation Traits</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperationTraits()
   * @generated
   * @ordered
   */
  protected EList<NamedOperationTrait> operationTraits;

  /**
   * The cached value of the '{@link #getMessageTraits() <em>Message Traits</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessageTraits()
   * @generated
   * @ordered
   */
  protected EList<NamedMessageTrait> messageTraits;

  /**
   * The cached value of the '{@link #getQosMetrics() <em>Qos Metrics</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQosMetrics()
   * @generated
   * @ordered
   */
  protected EList<NamedQoSMetric> qosMetrics;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AsyncApiPackage.Literals.COMPONENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<NamedSchema> getSchemas()
  {
    if (schemas == null)
    {
      schemas = new EObjectContainmentEList<NamedSchema>(NamedSchema.class, this, AsyncApiPackage.COMPONENTS__SCHEMAS);
    }
    return schemas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<NamedMessage> getMessages()
  {
    if (messages == null)
    {
      messages = new EObjectContainmentEList<NamedMessage>(NamedMessage.class, this, AsyncApiPackage.COMPONENTS__MESSAGES);
    }
    return messages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<NamedParameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<NamedParameter>(NamedParameter.class, this, AsyncApiPackage.COMPONENTS__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<NamedOperationTrait> getOperationTraits()
  {
    if (operationTraits == null)
    {
      operationTraits = new EObjectContainmentEList<NamedOperationTrait>(NamedOperationTrait.class, this, AsyncApiPackage.COMPONENTS__OPERATION_TRAITS);
    }
    return operationTraits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<NamedMessageTrait> getMessageTraits()
  {
    if (messageTraits == null)
    {
      messageTraits = new EObjectContainmentEList<NamedMessageTrait>(NamedMessageTrait.class, this, AsyncApiPackage.COMPONENTS__MESSAGE_TRAITS);
    }
    return messageTraits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<NamedQoSMetric> getQosMetrics()
  {
    if (qosMetrics == null)
    {
      qosMetrics = new EObjectContainmentEList<NamedQoSMetric>(NamedQoSMetric.class, this, AsyncApiPackage.COMPONENTS__QOS_METRICS);
    }
    return qosMetrics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AsyncApiPackage.COMPONENTS__SCHEMAS:
        return ((InternalEList<?>)getSchemas()).basicRemove(otherEnd, msgs);
      case AsyncApiPackage.COMPONENTS__MESSAGES:
        return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
      case AsyncApiPackage.COMPONENTS__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case AsyncApiPackage.COMPONENTS__OPERATION_TRAITS:
        return ((InternalEList<?>)getOperationTraits()).basicRemove(otherEnd, msgs);
      case AsyncApiPackage.COMPONENTS__MESSAGE_TRAITS:
        return ((InternalEList<?>)getMessageTraits()).basicRemove(otherEnd, msgs);
      case AsyncApiPackage.COMPONENTS__QOS_METRICS:
        return ((InternalEList<?>)getQosMetrics()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AsyncApiPackage.COMPONENTS__SCHEMAS:
        return getSchemas();
      case AsyncApiPackage.COMPONENTS__MESSAGES:
        return getMessages();
      case AsyncApiPackage.COMPONENTS__PARAMETERS:
        return getParameters();
      case AsyncApiPackage.COMPONENTS__OPERATION_TRAITS:
        return getOperationTraits();
      case AsyncApiPackage.COMPONENTS__MESSAGE_TRAITS:
        return getMessageTraits();
      case AsyncApiPackage.COMPONENTS__QOS_METRICS:
        return getQosMetrics();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AsyncApiPackage.COMPONENTS__SCHEMAS:
        getSchemas().clear();
        getSchemas().addAll((Collection<? extends NamedSchema>)newValue);
        return;
      case AsyncApiPackage.COMPONENTS__MESSAGES:
        getMessages().clear();
        getMessages().addAll((Collection<? extends NamedMessage>)newValue);
        return;
      case AsyncApiPackage.COMPONENTS__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends NamedParameter>)newValue);
        return;
      case AsyncApiPackage.COMPONENTS__OPERATION_TRAITS:
        getOperationTraits().clear();
        getOperationTraits().addAll((Collection<? extends NamedOperationTrait>)newValue);
        return;
      case AsyncApiPackage.COMPONENTS__MESSAGE_TRAITS:
        getMessageTraits().clear();
        getMessageTraits().addAll((Collection<? extends NamedMessageTrait>)newValue);
        return;
      case AsyncApiPackage.COMPONENTS__QOS_METRICS:
        getQosMetrics().clear();
        getQosMetrics().addAll((Collection<? extends NamedQoSMetric>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AsyncApiPackage.COMPONENTS__SCHEMAS:
        getSchemas().clear();
        return;
      case AsyncApiPackage.COMPONENTS__MESSAGES:
        getMessages().clear();
        return;
      case AsyncApiPackage.COMPONENTS__PARAMETERS:
        getParameters().clear();
        return;
      case AsyncApiPackage.COMPONENTS__OPERATION_TRAITS:
        getOperationTraits().clear();
        return;
      case AsyncApiPackage.COMPONENTS__MESSAGE_TRAITS:
        getMessageTraits().clear();
        return;
      case AsyncApiPackage.COMPONENTS__QOS_METRICS:
        getQosMetrics().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AsyncApiPackage.COMPONENTS__SCHEMAS:
        return schemas != null && !schemas.isEmpty();
      case AsyncApiPackage.COMPONENTS__MESSAGES:
        return messages != null && !messages.isEmpty();
      case AsyncApiPackage.COMPONENTS__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case AsyncApiPackage.COMPONENTS__OPERATION_TRAITS:
        return operationTraits != null && !operationTraits.isEmpty();
      case AsyncApiPackage.COMPONENTS__MESSAGE_TRAITS:
        return messageTraits != null && !messageTraits.isEmpty();
      case AsyncApiPackage.COMPONENTS__QOS_METRICS:
        return qosMetrics != null && !qosMetrics.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ComponentsImpl
