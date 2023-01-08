/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.cypher.impl;

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

import org.xtext.example.mydsl.cypher.ConfigurationOption;
import org.xtext.example.mydsl.cypher.CypherOption;
import org.xtext.example.mydsl.cypher.CypherPackage;
import org.xtext.example.mydsl.cypher.VersionNumber;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cypher.impl.CypherOptionImpl#getVersionNumber <em>Version Number</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cypher.impl.CypherOptionImpl#getConfigurationOption <em>Configuration Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CypherOptionImpl extends MinimalEObjectImpl.Container implements CypherOption
{
  /**
   * The cached value of the '{@link #getVersionNumber() <em>Version Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersionNumber()
   * @generated
   * @ordered
   */
  protected VersionNumber versionNumber;

  /**
   * The cached value of the '{@link #getConfigurationOption() <em>Configuration Option</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfigurationOption()
   * @generated
   * @ordered
   */
  protected EList<ConfigurationOption> configurationOption;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CypherOptionImpl()
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
    return CypherPackage.Literals.CYPHER_OPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VersionNumber getVersionNumber()
  {
    return versionNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVersionNumber(VersionNumber newVersionNumber, NotificationChain msgs)
  {
    VersionNumber oldVersionNumber = versionNumber;
    versionNumber = newVersionNumber;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CypherPackage.CYPHER_OPTION__VERSION_NUMBER, oldVersionNumber, newVersionNumber);
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
  public void setVersionNumber(VersionNumber newVersionNumber)
  {
    if (newVersionNumber != versionNumber)
    {
      NotificationChain msgs = null;
      if (versionNumber != null)
        msgs = ((InternalEObject)versionNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CypherPackage.CYPHER_OPTION__VERSION_NUMBER, null, msgs);
      if (newVersionNumber != null)
        msgs = ((InternalEObject)newVersionNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CypherPackage.CYPHER_OPTION__VERSION_NUMBER, null, msgs);
      msgs = basicSetVersionNumber(newVersionNumber, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CypherPackage.CYPHER_OPTION__VERSION_NUMBER, newVersionNumber, newVersionNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ConfigurationOption> getConfigurationOption()
  {
    if (configurationOption == null)
    {
      configurationOption = new EObjectContainmentEList<ConfigurationOption>(ConfigurationOption.class, this, CypherPackage.CYPHER_OPTION__CONFIGURATION_OPTION);
    }
    return configurationOption;
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
      case CypherPackage.CYPHER_OPTION__VERSION_NUMBER:
        return basicSetVersionNumber(null, msgs);
      case CypherPackage.CYPHER_OPTION__CONFIGURATION_OPTION:
        return ((InternalEList<?>)getConfigurationOption()).basicRemove(otherEnd, msgs);
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
      case CypherPackage.CYPHER_OPTION__VERSION_NUMBER:
        return getVersionNumber();
      case CypherPackage.CYPHER_OPTION__CONFIGURATION_OPTION:
        return getConfigurationOption();
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
      case CypherPackage.CYPHER_OPTION__VERSION_NUMBER:
        setVersionNumber((VersionNumber)newValue);
        return;
      case CypherPackage.CYPHER_OPTION__CONFIGURATION_OPTION:
        getConfigurationOption().clear();
        getConfigurationOption().addAll((Collection<? extends ConfigurationOption>)newValue);
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
      case CypherPackage.CYPHER_OPTION__VERSION_NUMBER:
        setVersionNumber((VersionNumber)null);
        return;
      case CypherPackage.CYPHER_OPTION__CONFIGURATION_OPTION:
        getConfigurationOption().clear();
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
      case CypherPackage.CYPHER_OPTION__VERSION_NUMBER:
        return versionNumber != null;
      case CypherPackage.CYPHER_OPTION__CONFIGURATION_OPTION:
        return configurationOption != null && !configurationOption.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CypherOptionImpl
