/**
 * generated by Xtext 2.18.0.M3
 */
package io.github.abelgomez.asyncapi.asyncApi.impl;

import io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage;
import io.github.abelgomez.asyncapi.asyncApi.GuaranteeTerm;
import io.github.abelgomez.asyncapi.asyncApi.Sla;

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
 * An implementation of the model object '<em><b>Sla</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SlaImpl#getGuaranteeTerm <em>Guarantee Term</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlaImpl extends MinimalEObjectImpl.Container implements Sla
{
  /**
   * The cached value of the '{@link #getGuaranteeTerm() <em>Guarantee Term</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuaranteeTerm()
   * @generated
   * @ordered
   */
  protected EList<GuaranteeTerm> guaranteeTerm;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SlaImpl()
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
    return AsyncApiPackage.Literals.SLA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<GuaranteeTerm> getGuaranteeTerm()
  {
    if (guaranteeTerm == null)
    {
      guaranteeTerm = new EObjectContainmentEList<GuaranteeTerm>(GuaranteeTerm.class, this, AsyncApiPackage.SLA__GUARANTEE_TERM);
    }
    return guaranteeTerm;
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
      case AsyncApiPackage.SLA__GUARANTEE_TERM:
        return ((InternalEList<?>)getGuaranteeTerm()).basicRemove(otherEnd, msgs);
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
      case AsyncApiPackage.SLA__GUARANTEE_TERM:
        return getGuaranteeTerm();
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
      case AsyncApiPackage.SLA__GUARANTEE_TERM:
        getGuaranteeTerm().clear();
        getGuaranteeTerm().addAll((Collection<? extends GuaranteeTerm>)newValue);
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
      case AsyncApiPackage.SLA__GUARANTEE_TERM:
        getGuaranteeTerm().clear();
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
      case AsyncApiPackage.SLA__GUARANTEE_TERM:
        return guaranteeTerm != null && !guaranteeTerm.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SlaImpl
