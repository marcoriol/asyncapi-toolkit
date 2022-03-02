/**
 * generated by Xtext 2.18.0.M3
 */
package io.github.abelgomez.asyncapi.asyncApi.impl;

import io.github.abelgomez.asyncapi.asyncApi.AbstractMessageTrait;
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage;
import io.github.abelgomez.asyncapi.asyncApi.NamedMessageTrait;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Message Trait</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.NamedMessageTraitImpl#getName <em>Name</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.NamedMessageTraitImpl#getMessageTrait <em>Message Trait</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamedMessageTraitImpl extends MinimalEObjectImpl.Container implements NamedMessageTrait
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
   * The cached value of the '{@link #getMessageTrait() <em>Message Trait</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessageTrait()
   * @generated
   * @ordered
   */
  protected AbstractMessageTrait messageTrait;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamedMessageTraitImpl()
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
    return AsyncApiPackage.Literals.NAMED_MESSAGE_TRAIT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.NAMED_MESSAGE_TRAIT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractMessageTrait getMessageTrait()
  {
    return messageTrait;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMessageTrait(AbstractMessageTrait newMessageTrait, NotificationChain msgs)
  {
    AbstractMessageTrait oldMessageTrait = messageTrait;
    messageTrait = newMessageTrait;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsyncApiPackage.NAMED_MESSAGE_TRAIT__MESSAGE_TRAIT, oldMessageTrait, newMessageTrait);
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
  public void setMessageTrait(AbstractMessageTrait newMessageTrait)
  {
    if (newMessageTrait != messageTrait)
    {
      NotificationChain msgs = null;
      if (messageTrait != null)
        msgs = ((InternalEObject)messageTrait).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.NAMED_MESSAGE_TRAIT__MESSAGE_TRAIT, null, msgs);
      if (newMessageTrait != null)
        msgs = ((InternalEObject)newMessageTrait).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.NAMED_MESSAGE_TRAIT__MESSAGE_TRAIT, null, msgs);
      msgs = basicSetMessageTrait(newMessageTrait, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.NAMED_MESSAGE_TRAIT__MESSAGE_TRAIT, newMessageTrait, newMessageTrait));
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
      case AsyncApiPackage.NAMED_MESSAGE_TRAIT__MESSAGE_TRAIT:
        return basicSetMessageTrait(null, msgs);
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
      case AsyncApiPackage.NAMED_MESSAGE_TRAIT__NAME:
        return getName();
      case AsyncApiPackage.NAMED_MESSAGE_TRAIT__MESSAGE_TRAIT:
        return getMessageTrait();
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
      case AsyncApiPackage.NAMED_MESSAGE_TRAIT__NAME:
        setName((String)newValue);
        return;
      case AsyncApiPackage.NAMED_MESSAGE_TRAIT__MESSAGE_TRAIT:
        setMessageTrait((AbstractMessageTrait)newValue);
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
      case AsyncApiPackage.NAMED_MESSAGE_TRAIT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AsyncApiPackage.NAMED_MESSAGE_TRAIT__MESSAGE_TRAIT:
        setMessageTrait((AbstractMessageTrait)null);
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
      case AsyncApiPackage.NAMED_MESSAGE_TRAIT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AsyncApiPackage.NAMED_MESSAGE_TRAIT__MESSAGE_TRAIT:
        return messageTrait != null;
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

} //NamedMessageTraitImpl
