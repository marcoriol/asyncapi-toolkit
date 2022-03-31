/**
 * generated by Xtext 2.26.0
 */
package io.github.abelgomez.asyncapi.asyncApi.impl;

import io.github.abelgomez.asyncapi.asyncApi.AbstractQoSMetric;
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage;
import io.github.abelgomez.asyncapi.asyncApi.AtomicBooleanCondition;
import io.github.abelgomez.asyncapi.asyncApi.Operator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Boolean Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.AtomicBooleanConditionImpl#getQosMetric <em>Qos Metric</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.AtomicBooleanConditionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.AtomicBooleanConditionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicBooleanConditionImpl extends BooleanConditionImpl implements AtomicBooleanCondition
{
  /**
   * The cached value of the '{@link #getQosMetric() <em>Qos Metric</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQosMetric()
   * @generated
   * @ordered
   */
  protected AbstractQoSMetric qosMetric;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final Operator OPERATOR_EDEFAULT = Operator.GREATER;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected Operator operator = OPERATOR_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtomicBooleanConditionImpl()
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
    return AsyncApiPackage.Literals.ATOMIC_BOOLEAN_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractQoSMetric getQosMetric()
  {
    return qosMetric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQosMetric(AbstractQoSMetric newQosMetric, NotificationChain msgs)
  {
    AbstractQoSMetric oldQosMetric = qosMetric;
    qosMetric = newQosMetric;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsyncApiPackage.ATOMIC_BOOLEAN_CONDITION__QOS_METRIC, oldQosMetric, newQosMetric);
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
  public void setQosMetric(AbstractQoSMetric newQosMetric)
  {
    if (newQosMetric != qosMetric)
    {
      NotificationChain msgs = null;
      if (qosMetric != null)
        msgs = ((InternalEObject)qosMetric).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.ATOMIC_BOOLEAN_CONDITION__QOS_METRIC, null, msgs);
      if (newQosMetric != null)
        msgs = ((InternalEObject)newQosMetric).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.ATOMIC_BOOLEAN_CONDITION__QOS_METRIC, null, msgs);
      msgs = basicSetQosMetric(newQosMetric, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.ATOMIC_BOOLEAN_CONDITION__QOS_METRIC, newQosMetric, newQosMetric));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Operator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOperator(Operator newOperator)
  {
    Operator oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.ATOMIC_BOOLEAN_CONDITION__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.ATOMIC_BOOLEAN_CONDITION__VALUE, oldValue, value));
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
      case AsyncApiPackage.ATOMIC_BOOLEAN_CONDITION__QOS_METRIC:
        return basicSetQosMetric(null, msgs);
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
      case AsyncApiPackage.ATOMIC_BOOLEAN_CONDITION__QOS_METRIC:
        return getQosMetric();
      case AsyncApiPackage.ATOMIC_BOOLEAN_CONDITION__OPERATOR:
        return getOperator();
      case AsyncApiPackage.ATOMIC_BOOLEAN_CONDITION__VALUE:
        return getValue();
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
      case AsyncApiPackage.ATOMIC_BOOLEAN_CONDITION__QOS_METRIC:
        setQosMetric((AbstractQoSMetric)newValue);
        return;
      case AsyncApiPackage.ATOMIC_BOOLEAN_CONDITION__OPERATOR:
        setOperator((Operator)newValue);
        return;
      case AsyncApiPackage.ATOMIC_BOOLEAN_CONDITION__VALUE:
        setValue((String)newValue);
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
      case AsyncApiPackage.ATOMIC_BOOLEAN_CONDITION__QOS_METRIC:
        setQosMetric((AbstractQoSMetric)null);
        return;
      case AsyncApiPackage.ATOMIC_BOOLEAN_CONDITION__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case AsyncApiPackage.ATOMIC_BOOLEAN_CONDITION__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case AsyncApiPackage.ATOMIC_BOOLEAN_CONDITION__QOS_METRIC:
        return qosMetric != null;
      case AsyncApiPackage.ATOMIC_BOOLEAN_CONDITION__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case AsyncApiPackage.ATOMIC_BOOLEAN_CONDITION__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
    result.append(" (operator: ");
    result.append(operator);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //AtomicBooleanConditionImpl
