/**
 * generated by Xtext 2.17.0
 */
package io.github.abelgomez.asyncapi.asyncApi.impl;

import io.github.abelgomez.asyncapi.asyncApi.AsyncAPI;
import io.github.abelgomez.asyncapi.asyncApi.AsyncApiPackage;
import io.github.abelgomez.asyncapi.asyncApi.Channel;
import io.github.abelgomez.asyncapi.asyncApi.Components;
import io.github.abelgomez.asyncapi.asyncApi.Info;
import io.github.abelgomez.asyncapi.asyncApi.Server;
import io.github.abelgomez.asyncapi.asyncApi.VersionNumber;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Async API</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.AsyncAPIImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.AsyncAPIImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.AsyncAPIImpl#getServers <em>Servers</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.AsyncAPIImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link io.github.abelgomez.asyncapi.asyncApi.impl.AsyncAPIImpl#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsyncAPIImpl extends MinimalEObjectImpl.Container implements AsyncAPI
{
  /**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
  protected static final VersionNumber VERSION_EDEFAULT = VersionNumber._200;

  /**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
  protected VersionNumber version = VERSION_EDEFAULT;

  /**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
  protected Info info;

  /**
	 * The cached value of the '{@link #getServers() <em>Servers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getServers()
	 * @generated
	 * @ordered
	 */
  protected EList<Server> servers;

  /**
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
  protected EList<Channel> channels;

  /**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
  protected Components components;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AsyncAPIImpl()
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
		return AsyncApiPackage.Literals.ASYNC_API;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public VersionNumber getVersion()
  {
		return version;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setVersion(VersionNumber newVersion)
  {
		VersionNumber oldVersion = version;
		version = newVersion == null ? VERSION_EDEFAULT : newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.ASYNC_API__VERSION, oldVersion, version));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Info getInfo()
  {
		return info;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetInfo(Info newInfo, NotificationChain msgs)
  {
		Info oldInfo = info;
		info = newInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsyncApiPackage.ASYNC_API__INFO, oldInfo, newInfo);
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
  public void setInfo(Info newInfo)
  {
		if (newInfo != info) {
			NotificationChain msgs = null;
			if (info != null)
				msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.ASYNC_API__INFO, null, msgs);
			if (newInfo != null)
				msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.ASYNC_API__INFO, null, msgs);
			msgs = basicSetInfo(newInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.ASYNC_API__INFO, newInfo, newInfo));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EList<Server> getServers()
  {
		if (servers == null) {
			servers = new EObjectContainmentEList<Server>(Server.class, this, AsyncApiPackage.ASYNC_API__SERVERS);
		}
		return servers;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EList<Channel> getChannels()
  {
		if (channels == null) {
			channels = new EObjectContainmentEList<Channel>(Channel.class, this, AsyncApiPackage.ASYNC_API__CHANNELS);
		}
		return channels;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Components getComponents()
  {
		return components;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetComponents(Components newComponents, NotificationChain msgs)
  {
		Components oldComponents = components;
		components = newComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsyncApiPackage.ASYNC_API__COMPONENTS, oldComponents, newComponents);
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
  public void setComponents(Components newComponents)
  {
		if (newComponents != components) {
			NotificationChain msgs = null;
			if (components != null)
				msgs = ((InternalEObject)components).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.ASYNC_API__COMPONENTS, null, msgs);
			if (newComponents != null)
				msgs = ((InternalEObject)newComponents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsyncApiPackage.ASYNC_API__COMPONENTS, null, msgs);
			msgs = basicSetComponents(newComponents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsyncApiPackage.ASYNC_API__COMPONENTS, newComponents, newComponents));
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
			case AsyncApiPackage.ASYNC_API__INFO:
				return basicSetInfo(null, msgs);
			case AsyncApiPackage.ASYNC_API__SERVERS:
				return ((InternalEList<?>)getServers()).basicRemove(otherEnd, msgs);
			case AsyncApiPackage.ASYNC_API__CHANNELS:
				return ((InternalEList<?>)getChannels()).basicRemove(otherEnd, msgs);
			case AsyncApiPackage.ASYNC_API__COMPONENTS:
				return basicSetComponents(null, msgs);
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
			case AsyncApiPackage.ASYNC_API__VERSION:
				return getVersion();
			case AsyncApiPackage.ASYNC_API__INFO:
				return getInfo();
			case AsyncApiPackage.ASYNC_API__SERVERS:
				return getServers();
			case AsyncApiPackage.ASYNC_API__CHANNELS:
				return getChannels();
			case AsyncApiPackage.ASYNC_API__COMPONENTS:
				return getComponents();
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
			case AsyncApiPackage.ASYNC_API__VERSION:
				setVersion((VersionNumber)newValue);
				return;
			case AsyncApiPackage.ASYNC_API__INFO:
				setInfo((Info)newValue);
				return;
			case AsyncApiPackage.ASYNC_API__SERVERS:
				getServers().clear();
				getServers().addAll((Collection<? extends Server>)newValue);
				return;
			case AsyncApiPackage.ASYNC_API__CHANNELS:
				getChannels().clear();
				getChannels().addAll((Collection<? extends Channel>)newValue);
				return;
			case AsyncApiPackage.ASYNC_API__COMPONENTS:
				setComponents((Components)newValue);
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
			case AsyncApiPackage.ASYNC_API__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case AsyncApiPackage.ASYNC_API__INFO:
				setInfo((Info)null);
				return;
			case AsyncApiPackage.ASYNC_API__SERVERS:
				getServers().clear();
				return;
			case AsyncApiPackage.ASYNC_API__CHANNELS:
				getChannels().clear();
				return;
			case AsyncApiPackage.ASYNC_API__COMPONENTS:
				setComponents((Components)null);
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
			case AsyncApiPackage.ASYNC_API__VERSION:
				return version != VERSION_EDEFAULT;
			case AsyncApiPackage.ASYNC_API__INFO:
				return info != null;
			case AsyncApiPackage.ASYNC_API__SERVERS:
				return servers != null && !servers.isEmpty();
			case AsyncApiPackage.ASYNC_API__CHANNELS:
				return channels != null && !channels.isEmpty();
			case AsyncApiPackage.ASYNC_API__COMPONENTS:
				return components != null;
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
		result.append(" (version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //AsyncAPIImpl
