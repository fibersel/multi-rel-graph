/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl1.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl1.myDsl.MyDslPackage;
import org.xtext.example.mydsl1.myDsl.PropertyLookup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Lookup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.PropertyLookupImpl#getPropertyKeyName <em>Property Key Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.PropertyLookupImpl#getPropertyOperator <em>Property Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyLookupImpl extends MinimalEObjectImpl.Container implements PropertyLookup
{
  /**
   * The default value of the '{@link #getPropertyKeyName() <em>Property Key Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyKeyName()
   * @generated
   * @ordered
   */
  protected static final String PROPERTY_KEY_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPropertyKeyName() <em>Property Key Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyKeyName()
   * @generated
   * @ordered
   */
  protected String propertyKeyName = PROPERTY_KEY_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPropertyOperator() <em>Property Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyOperator()
   * @generated
   * @ordered
   */
  protected static final String PROPERTY_OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPropertyOperator() <em>Property Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyOperator()
   * @generated
   * @ordered
   */
  protected String propertyOperator = PROPERTY_OPERATOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyLookupImpl()
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
    return MyDslPackage.Literals.PROPERTY_LOOKUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPropertyKeyName()
  {
    return propertyKeyName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPropertyKeyName(String newPropertyKeyName)
  {
    String oldPropertyKeyName = propertyKeyName;
    propertyKeyName = newPropertyKeyName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PROPERTY_LOOKUP__PROPERTY_KEY_NAME, oldPropertyKeyName, propertyKeyName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPropertyOperator()
  {
    return propertyOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPropertyOperator(String newPropertyOperator)
  {
    String oldPropertyOperator = propertyOperator;
    propertyOperator = newPropertyOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PROPERTY_LOOKUP__PROPERTY_OPERATOR, oldPropertyOperator, propertyOperator));
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
      case MyDslPackage.PROPERTY_LOOKUP__PROPERTY_KEY_NAME:
        return getPropertyKeyName();
      case MyDslPackage.PROPERTY_LOOKUP__PROPERTY_OPERATOR:
        return getPropertyOperator();
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
      case MyDslPackage.PROPERTY_LOOKUP__PROPERTY_KEY_NAME:
        setPropertyKeyName((String)newValue);
        return;
      case MyDslPackage.PROPERTY_LOOKUP__PROPERTY_OPERATOR:
        setPropertyOperator((String)newValue);
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
      case MyDslPackage.PROPERTY_LOOKUP__PROPERTY_KEY_NAME:
        setPropertyKeyName(PROPERTY_KEY_NAME_EDEFAULT);
        return;
      case MyDslPackage.PROPERTY_LOOKUP__PROPERTY_OPERATOR:
        setPropertyOperator(PROPERTY_OPERATOR_EDEFAULT);
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
      case MyDslPackage.PROPERTY_LOOKUP__PROPERTY_KEY_NAME:
        return PROPERTY_KEY_NAME_EDEFAULT == null ? propertyKeyName != null : !PROPERTY_KEY_NAME_EDEFAULT.equals(propertyKeyName);
      case MyDslPackage.PROPERTY_LOOKUP__PROPERTY_OPERATOR:
        return PROPERTY_OPERATOR_EDEFAULT == null ? propertyOperator != null : !PROPERTY_OPERATOR_EDEFAULT.equals(propertyOperator);
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
    result.append(" (propertyKeyName: ");
    result.append(propertyKeyName);
    result.append(", propertyOperator: ");
    result.append(propertyOperator);
    result.append(')');
    return result.toString();
  }

} //PropertyLookupImpl
