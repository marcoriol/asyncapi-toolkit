/**
 * generated by Xtext 2.26.0
 */
package io.github.abelgomez.asyncapi.asyncApi.impl;

import io.github.abelgomez.asyncapi.asyncApi.AbstractSchema;
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage;
import io.github.abelgomez.asyncapi.asyncApi.MessageTrait;
import io.github.abelgomez.asyncapi.asyncApi.Tag;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Trait</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.MessageTraitImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.MessageTraitImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.MessageTraitImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.MessageTraitImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.MessageTraitImpl#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageTraitImpl extends AbstractMessageTraitImpl implements MessageTrait
{
  /**
   * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummary()
   * @generated
   * @ordered
   */
  protected static final String SUMMARY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummary()
   * @generated
   * @ordered
   */
  protected String summary = SUMMARY_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getDeprecated() <em>Deprecated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeprecated()
   * @generated
   * @ordered
   */
  protected static final io.github.abelgomez.asyncapi.asyncApi.Boolean DEPRECATED_EDEFAULT = io.github.abelgomez.asyncapi.asyncApi.Boolean._FALSE;

  /**
   * The cached value of the '{@link #getDeprecated() <em>Deprecated</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeprecated()
   * @generated
   * @ordered
   */
  protected io.github.abelgomez.asyncapi.asyncApi.Boolean deprecated = DEPRECATED_EDEFAULT;

  /**
   * The cached value of the '{@link #getHeaders() <em>Headers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeaders()
   * @generated
   * @ordered
   */
  protected AbstractSchema headers;

  /**
   * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTags()
   * @generated
   * @ordered
   */
  protected EList<Tag> tags;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageTraitImpl()
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
    return AsyncApiPackage.Literals.MESSAGE_TRAIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSummary()
  {
    return summary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSummary(String newSummary)
  {
    String oldSummary = summary;
    summary = newSummary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.MESSAGE_TRAIT__SUMMARY, oldSummary, summary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.MESSAGE_TRAIT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public io.github.abelgomez.asyncapi.asyncApi.Boolean getDeprecated()
  {
    return deprecated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDeprecated(io.github.abelgomez.asyncapi.asyncApi.Boolean newDeprecated)
  {
    io.github.abelgomez.asyncapi.asyncApi.Boolean oldDeprecated = deprecated;
    deprecated = newDeprecated == null ? DEPRECATED_EDEFAULT : newDeprecated;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.MESSAGE_TRAIT__DEPRECATED, oldDeprecated, deprecated));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractSchema getHeaders()
  {
    return headers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeaders(AbstractSchema newHeaders, NotificationChain msgs)
  {
    AbstractSchema oldHeaders = headers;
    headers = newHeaders;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsyncApiPackage.MESSAGE_TRAIT__HEADERS, oldHeaders, newHeaders);
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
  public void setHeaders(AbstractSchema newHeaders)
  {
    if (newHeaders != headers)
    {
      NotificationChain msgs = null;
      if (headers != null)
        msgs = ((InternalEObject)headers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.MESSAGE_TRAIT__HEADERS, null, msgs);
      if (newHeaders != null)
        msgs = ((InternalEObject)newHeaders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.MESSAGE_TRAIT__HEADERS, null, msgs);
      msgs = basicSetHeaders(newHeaders, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.MESSAGE_TRAIT__HEADERS, newHeaders, newHeaders));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Tag> getTags()
  {
    if (tags == null)
    {
      tags = new EObjectContainmentEList<Tag>(Tag.class, this, AsyncApiPackage.MESSAGE_TRAIT__TAGS);
    }
    return tags;
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
      case AsyncApiPackage.MESSAGE_TRAIT__HEADERS:
        return basicSetHeaders(null, msgs);
      case AsyncApiPackage.MESSAGE_TRAIT__TAGS:
        return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
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
      case AsyncApiPackage.MESSAGE_TRAIT__SUMMARY:
        return getSummary();
      case AsyncApiPackage.MESSAGE_TRAIT__DESCRIPTION:
        return getDescription();
      case AsyncApiPackage.MESSAGE_TRAIT__DEPRECATED:
        return getDeprecated();
      case AsyncApiPackage.MESSAGE_TRAIT__HEADERS:
        return getHeaders();
      case AsyncApiPackage.MESSAGE_TRAIT__TAGS:
        return getTags();
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
      case AsyncApiPackage.MESSAGE_TRAIT__SUMMARY:
        setSummary((String)newValue);
        return;
      case AsyncApiPackage.MESSAGE_TRAIT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case AsyncApiPackage.MESSAGE_TRAIT__DEPRECATED:
        setDeprecated((io.github.abelgomez.asyncapi.asyncApi.Boolean)newValue);
        return;
      case AsyncApiPackage.MESSAGE_TRAIT__HEADERS:
        setHeaders((AbstractSchema)newValue);
        return;
      case AsyncApiPackage.MESSAGE_TRAIT__TAGS:
        getTags().clear();
        getTags().addAll((Collection<? extends Tag>)newValue);
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
      case AsyncApiPackage.MESSAGE_TRAIT__SUMMARY:
        setSummary(SUMMARY_EDEFAULT);
        return;
      case AsyncApiPackage.MESSAGE_TRAIT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case AsyncApiPackage.MESSAGE_TRAIT__DEPRECATED:
        setDeprecated(DEPRECATED_EDEFAULT);
        return;
      case AsyncApiPackage.MESSAGE_TRAIT__HEADERS:
        setHeaders((AbstractSchema)null);
        return;
      case AsyncApiPackage.MESSAGE_TRAIT__TAGS:
        getTags().clear();
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
      case AsyncApiPackage.MESSAGE_TRAIT__SUMMARY:
        return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
      case AsyncApiPackage.MESSAGE_TRAIT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case AsyncApiPackage.MESSAGE_TRAIT__DEPRECATED:
        return deprecated != DEPRECATED_EDEFAULT;
      case AsyncApiPackage.MESSAGE_TRAIT__HEADERS:
        return headers != null;
      case AsyncApiPackage.MESSAGE_TRAIT__TAGS:
        return tags != null && !tags.isEmpty();
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
    result.append(" (summary: ");
    result.append(summary);
    result.append(", description: ");
    result.append(description);
    result.append(", deprecated: ");
    result.append(deprecated);
    result.append(')');
    return result.toString();
  }

} //MessageTraitImpl
