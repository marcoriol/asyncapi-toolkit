/**
 * generated by Xtext 2.25.0
 */
package io.github.abelgomez.asyncapi.asyncApi.impl;

import io.github.abelgomez.asyncapi.asyncApi.AbstractOperationTrait;
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage;
import io.github.abelgomez.asyncapi.asyncApi.NamedOperationTrait;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Operation Trait</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.NamedOperationTraitImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.NamedOperationTraitImpl#getOperationTrait <em>Operation Trait</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedOperationTraitImpl extends MinimalEObjectImpl.Container implements NamedOperationTrait
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getOperationTrait() <em>Operation Trait</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperationTrait()
   * @generated
   * @ordered
   */
  protected AbstractOperationTrait operationTrait;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamedOperationTraitImpl()
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
    return AsyncApiPackage.Literals.NAMED_OPERATION_TRAIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.NAMED_OPERATION_TRAIT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractOperationTrait getOperationTrait()
  {
    return operationTrait;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperationTrait(AbstractOperationTrait newOperationTrait, NotificationChain msgs)
  {
    AbstractOperationTrait oldOperationTrait = operationTrait;
    operationTrait = newOperationTrait;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsyncApiPackage.NAMED_OPERATION_TRAIT__OPERATION_TRAIT, oldOperationTrait, newOperationTrait);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOperationTrait(AbstractOperationTrait newOperationTrait)
  {
    if (newOperationTrait != operationTrait)
    {
      NotificationChain msgs = null;
      if (operationTrait != null)
        msgs = ((InternalEObject)operationTrait).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.NAMED_OPERATION_TRAIT__OPERATION_TRAIT, null, msgs);
      if (newOperationTrait != null)
        msgs = ((InternalEObject)newOperationTrait).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.NAMED_OPERATION_TRAIT__OPERATION_TRAIT, null, msgs);
      msgs = basicSetOperationTrait(newOperationTrait, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.NAMED_OPERATION_TRAIT__OPERATION_TRAIT, newOperationTrait, newOperationTrait));
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
      case AsyncApiPackage.NAMED_OPERATION_TRAIT__OPERATION_TRAIT:
        return basicSetOperationTrait(null, msgs);
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
      case AsyncApiPackage.NAMED_OPERATION_TRAIT__NAME:
        return getName();
      case AsyncApiPackage.NAMED_OPERATION_TRAIT__OPERATION_TRAIT:
        return getOperationTrait();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AsyncApiPackage.NAMED_OPERATION_TRAIT__NAME:
        setName((String)newValue);
        return;
      case AsyncApiPackage.NAMED_OPERATION_TRAIT__OPERATION_TRAIT:
        setOperationTrait((AbstractOperationTrait)newValue);
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
      case AsyncApiPackage.NAMED_OPERATION_TRAIT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AsyncApiPackage.NAMED_OPERATION_TRAIT__OPERATION_TRAIT:
        setOperationTrait((AbstractOperationTrait)null);
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
      case AsyncApiPackage.NAMED_OPERATION_TRAIT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AsyncApiPackage.NAMED_OPERATION_TRAIT__OPERATION_TRAIT:
        return operationTrait != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //NamedOperationTraitImpl
