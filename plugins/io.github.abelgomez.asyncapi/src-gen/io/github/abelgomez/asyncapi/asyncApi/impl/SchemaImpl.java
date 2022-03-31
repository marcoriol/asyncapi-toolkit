/**
 * generated by Xtext 2.26.0
 */
package io.github.abelgomez.asyncapi.asyncApi.impl;

import io.github.abelgomez.asyncapi.asyncApi.AbstractSchema;
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage;
import io.github.abelgomez.asyncapi.asyncApi.JsonType;
import io.github.abelgomez.asyncapi.asyncApi.NamedSchema;
import io.github.abelgomez.asyncapi.asyncApi.Schema;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getType <em>Type</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getItems <em>Items</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.SchemaImpl#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaImpl extends AbstractSchemaImpl implements Schema
{
  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final JsonType TYPE_EDEFAULT = JsonType.STRING;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected JsonType type = TYPE_EDEFAULT;

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
   * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected static final String FORMAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected String format = FORMAT_EDEFAULT;

  /**
   * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinimum()
   * @generated
   * @ordered
   */
  protected static final int MINIMUM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinimum()
   * @generated
   * @ordered
   */
  protected int minimum = MINIMUM_EDEFAULT;

  /**
   * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaximum()
   * @generated
   * @ordered
   */
  protected static final int MAXIMUM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaximum()
   * @generated
   * @ordered
   */
  protected int maximum = MAXIMUM_EDEFAULT;

  /**
   * The default value of the '{@link #getMinItems() <em>Min Items</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinItems()
   * @generated
   * @ordered
   */
  protected static final int MIN_ITEMS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMinItems() <em>Min Items</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinItems()
   * @generated
   * @ordered
   */
  protected int minItems = MIN_ITEMS_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxItems() <em>Max Items</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxItems()
   * @generated
   * @ordered
   */
  protected static final int MAX_ITEMS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxItems() <em>Max Items</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxItems()
   * @generated
   * @ordered
   */
  protected int maxItems = MAX_ITEMS_EDEFAULT;

  /**
   * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected String default_ = DEFAULT_EDEFAULT;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<NamedSchema> properties;

  /**
   * The cached value of the '{@link #getEnum() <em>Enum</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnum()
   * @generated
   * @ordered
   */
  protected EList<String> enum_;

  /**
   * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItems()
   * @generated
   * @ordered
   */
  protected AbstractSchema items;

  /**
   * The cached value of the '{@link #getRequired() <em>Required</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequired()
   * @generated
   * @ordered
   */
  protected EList<String> required;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SchemaImpl()
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
    return AsyncApiPackage.Literals.SCHEMA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.SCHEMA__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JsonType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(JsonType newType)
  {
    JsonType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.SCHEMA__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.SCHEMA__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFormat()
  {
    return format;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFormat(String newFormat)
  {
    String oldFormat = format;
    format = newFormat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.SCHEMA__FORMAT, oldFormat, format));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMinimum()
  {
    return minimum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMinimum(int newMinimum)
  {
    int oldMinimum = minimum;
    minimum = newMinimum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.SCHEMA__MINIMUM, oldMinimum, minimum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMaximum()
  {
    return maximum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMaximum(int newMaximum)
  {
    int oldMaximum = maximum;
    maximum = newMaximum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.SCHEMA__MAXIMUM, oldMaximum, maximum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMinItems()
  {
    return minItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMinItems(int newMinItems)
  {
    int oldMinItems = minItems;
    minItems = newMinItems;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.SCHEMA__MIN_ITEMS, oldMinItems, minItems));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMaxItems()
  {
    return maxItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMaxItems(int newMaxItems)
  {
    int oldMaxItems = maxItems;
    maxItems = newMaxItems;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.SCHEMA__MAX_ITEMS, oldMaxItems, maxItems));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDefault(String newDefault)
  {
    String oldDefault = default_;
    default_ = newDefault;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.SCHEMA__DEFAULT, oldDefault, default_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<NamedSchema> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<NamedSchema>(NamedSchema.class, this, AsyncApiPackage.SCHEMA__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getEnum()
  {
    if (enum_ == null)
    {
      enum_ = new EDataTypeEList<String>(String.class, this, AsyncApiPackage.SCHEMA__ENUM);
    }
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractSchema getItems()
  {
    return items;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetItems(AbstractSchema newItems, NotificationChain msgs)
  {
    AbstractSchema oldItems = items;
    items = newItems;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsyncApiPackage.SCHEMA__ITEMS, oldItems, newItems);
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
  public void setItems(AbstractSchema newItems)
  {
    if (newItems != items)
    {
      NotificationChain msgs = null;
      if (items != null)
        msgs = ((InternalEObject)items).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.SCHEMA__ITEMS, null, msgs);
      if (newItems != null)
        msgs = ((InternalEObject)newItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.SCHEMA__ITEMS, null, msgs);
      msgs = basicSetItems(newItems, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.SCHEMA__ITEMS, newItems, newItems));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getRequired()
  {
    if (required == null)
    {
      required = new EDataTypeEList<String>(String.class, this, AsyncApiPackage.SCHEMA__REQUIRED);
    }
    return required;
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
      case AsyncApiPackage.SCHEMA__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case AsyncApiPackage.SCHEMA__ITEMS:
        return basicSetItems(null, msgs);
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
      case AsyncApiPackage.SCHEMA__TITLE:
        return getTitle();
      case AsyncApiPackage.SCHEMA__TYPE:
        return getType();
      case AsyncApiPackage.SCHEMA__DESCRIPTION:
        return getDescription();
      case AsyncApiPackage.SCHEMA__FORMAT:
        return getFormat();
      case AsyncApiPackage.SCHEMA__MINIMUM:
        return getMinimum();
      case AsyncApiPackage.SCHEMA__MAXIMUM:
        return getMaximum();
      case AsyncApiPackage.SCHEMA__MIN_ITEMS:
        return getMinItems();
      case AsyncApiPackage.SCHEMA__MAX_ITEMS:
        return getMaxItems();
      case AsyncApiPackage.SCHEMA__DEFAULT:
        return getDefault();
      case AsyncApiPackage.SCHEMA__PROPERTIES:
        return getProperties();
      case AsyncApiPackage.SCHEMA__ENUM:
        return getEnum();
      case AsyncApiPackage.SCHEMA__ITEMS:
        return getItems();
      case AsyncApiPackage.SCHEMA__REQUIRED:
        return getRequired();
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
      case AsyncApiPackage.SCHEMA__TITLE:
        setTitle((String)newValue);
        return;
      case AsyncApiPackage.SCHEMA__TYPE:
        setType((JsonType)newValue);
        return;
      case AsyncApiPackage.SCHEMA__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case AsyncApiPackage.SCHEMA__FORMAT:
        setFormat((String)newValue);
        return;
      case AsyncApiPackage.SCHEMA__MINIMUM:
        setMinimum((Integer)newValue);
        return;
      case AsyncApiPackage.SCHEMA__MAXIMUM:
        setMaximum((Integer)newValue);
        return;
      case AsyncApiPackage.SCHEMA__MIN_ITEMS:
        setMinItems((Integer)newValue);
        return;
      case AsyncApiPackage.SCHEMA__MAX_ITEMS:
        setMaxItems((Integer)newValue);
        return;
      case AsyncApiPackage.SCHEMA__DEFAULT:
        setDefault((String)newValue);
        return;
      case AsyncApiPackage.SCHEMA__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends NamedSchema>)newValue);
        return;
      case AsyncApiPackage.SCHEMA__ENUM:
        getEnum().clear();
        getEnum().addAll((Collection<? extends String>)newValue);
        return;
      case AsyncApiPackage.SCHEMA__ITEMS:
        setItems((AbstractSchema)newValue);
        return;
      case AsyncApiPackage.SCHEMA__REQUIRED:
        getRequired().clear();
        getRequired().addAll((Collection<? extends String>)newValue);
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
      case AsyncApiPackage.SCHEMA__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case AsyncApiPackage.SCHEMA__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case AsyncApiPackage.SCHEMA__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case AsyncApiPackage.SCHEMA__FORMAT:
        setFormat(FORMAT_EDEFAULT);
        return;
      case AsyncApiPackage.SCHEMA__MINIMUM:
        setMinimum(MINIMUM_EDEFAULT);
        return;
      case AsyncApiPackage.SCHEMA__MAXIMUM:
        setMaximum(MAXIMUM_EDEFAULT);
        return;
      case AsyncApiPackage.SCHEMA__MIN_ITEMS:
        setMinItems(MIN_ITEMS_EDEFAULT);
        return;
      case AsyncApiPackage.SCHEMA__MAX_ITEMS:
        setMaxItems(MAX_ITEMS_EDEFAULT);
        return;
      case AsyncApiPackage.SCHEMA__DEFAULT:
        setDefault(DEFAULT_EDEFAULT);
        return;
      case AsyncApiPackage.SCHEMA__PROPERTIES:
        getProperties().clear();
        return;
      case AsyncApiPackage.SCHEMA__ENUM:
        getEnum().clear();
        return;
      case AsyncApiPackage.SCHEMA__ITEMS:
        setItems((AbstractSchema)null);
        return;
      case AsyncApiPackage.SCHEMA__REQUIRED:
        getRequired().clear();
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
      case AsyncApiPackage.SCHEMA__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case AsyncApiPackage.SCHEMA__TYPE:
        return type != TYPE_EDEFAULT;
      case AsyncApiPackage.SCHEMA__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case AsyncApiPackage.SCHEMA__FORMAT:
        return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
      case AsyncApiPackage.SCHEMA__MINIMUM:
        return minimum != MINIMUM_EDEFAULT;
      case AsyncApiPackage.SCHEMA__MAXIMUM:
        return maximum != MAXIMUM_EDEFAULT;
      case AsyncApiPackage.SCHEMA__MIN_ITEMS:
        return minItems != MIN_ITEMS_EDEFAULT;
      case AsyncApiPackage.SCHEMA__MAX_ITEMS:
        return maxItems != MAX_ITEMS_EDEFAULT;
      case AsyncApiPackage.SCHEMA__DEFAULT:
        return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
      case AsyncApiPackage.SCHEMA__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case AsyncApiPackage.SCHEMA__ENUM:
        return enum_ != null && !enum_.isEmpty();
      case AsyncApiPackage.SCHEMA__ITEMS:
        return items != null;
      case AsyncApiPackage.SCHEMA__REQUIRED:
        return required != null && !required.isEmpty();
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
    result.append(" (title: ");
    result.append(title);
    result.append(", type: ");
    result.append(type);
    result.append(", description: ");
    result.append(description);
    result.append(", format: ");
    result.append(format);
    result.append(", minimum: ");
    result.append(minimum);
    result.append(", maximum: ");
    result.append(maximum);
    result.append(", minItems: ");
    result.append(minItems);
    result.append(", maxItems: ");
    result.append(maxItems);
    result.append(", default: ");
    result.append(default_);
    result.append(", enum: ");
    result.append(enum_);
    result.append(", required: ");
    result.append(required);
    result.append(')');
    return result.toString();
  }

} //SchemaImpl
