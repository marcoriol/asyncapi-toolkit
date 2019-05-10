/**
 * generated by Xtext 2.17.0
 */
package io.github.abelgomez.asyncapi.asyncApi.impl;

import io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage;
import io.github.abelgomez.asyncapi.asyncApi.Components;
import io.github.abelgomez.asyncapi.asyncApi.NamedMessage;
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
		if (schemas == null) {
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
		if (messages == null) {
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
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case AsyncApiPackage.COMPONENTS__SCHEMAS:
				return ((InternalEList<?>)getSchemas()).basicRemove(otherEnd, msgs);
			case AsyncApiPackage.COMPONENTS__MESSAGES:
				return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
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
		switch (featureID) {
			case AsyncApiPackage.COMPONENTS__SCHEMAS:
				return getSchemas();
			case AsyncApiPackage.COMPONENTS__MESSAGES:
				return getMessages();
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
		switch (featureID) {
			case AsyncApiPackage.COMPONENTS__SCHEMAS:
				getSchemas().clear();
				getSchemas().addAll((Collection<? extends NamedSchema>)newValue);
				return;
			case AsyncApiPackage.COMPONENTS__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends NamedMessage>)newValue);
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
		switch (featureID) {
			case AsyncApiPackage.COMPONENTS__SCHEMAS:
				getSchemas().clear();
				return;
			case AsyncApiPackage.COMPONENTS__MESSAGES:
				getMessages().clear();
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
		switch (featureID) {
			case AsyncApiPackage.COMPONENTS__SCHEMAS:
				return schemas != null && !schemas.isEmpty();
			case AsyncApiPackage.COMPONENTS__MESSAGES:
				return messages != null && !messages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentsImpl