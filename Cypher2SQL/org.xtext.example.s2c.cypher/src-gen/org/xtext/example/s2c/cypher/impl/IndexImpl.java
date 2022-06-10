/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.s2c.cypher.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.s2c.cypher.CypherPackage;
import org.xtext.example.s2c.cypher.Index;
import org.xtext.example.s2c.cypher.NodeLabel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.s2c.cypher.impl.IndexImpl#getNodeLabel <em>Node Label</em>}</li>
 *   <li>{@link org.xtext.example.s2c.cypher.impl.IndexImpl#getPropertyKeyName <em>Property Key Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndexImpl extends MinimalEObjectImpl.Container implements Index
{
  /**
   * The cached value of the '{@link #getNodeLabel() <em>Node Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeLabel()
   * @generated
   * @ordered
   */
  protected NodeLabel nodeLabel;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IndexImpl()
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
    return CypherPackage.Literals.INDEX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NodeLabel getNodeLabel()
  {
    return nodeLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNodeLabel(NodeLabel newNodeLabel, NotificationChain msgs)
  {
    NodeLabel oldNodeLabel = nodeLabel;
    nodeLabel = newNodeLabel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CypherPackage.INDEX__NODE_LABEL, oldNodeLabel, newNodeLabel);
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
  public void setNodeLabel(NodeLabel newNodeLabel)
  {
    if (newNodeLabel != nodeLabel)
    {
      NotificationChain msgs = null;
      if (nodeLabel != null)
        msgs = ((InternalEObject)nodeLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CypherPackage.INDEX__NODE_LABEL, null, msgs);
      if (newNodeLabel != null)
        msgs = ((InternalEObject)newNodeLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CypherPackage.INDEX__NODE_LABEL, null, msgs);
      msgs = basicSetNodeLabel(newNodeLabel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CypherPackage.INDEX__NODE_LABEL, newNodeLabel, newNodeLabel));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CypherPackage.INDEX__PROPERTY_KEY_NAME, oldPropertyKeyName, propertyKeyName));
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
      case CypherPackage.INDEX__NODE_LABEL:
        return basicSetNodeLabel(null, msgs);
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
      case CypherPackage.INDEX__NODE_LABEL:
        return getNodeLabel();
      case CypherPackage.INDEX__PROPERTY_KEY_NAME:
        return getPropertyKeyName();
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
      case CypherPackage.INDEX__NODE_LABEL:
        setNodeLabel((NodeLabel)newValue);
        return;
      case CypherPackage.INDEX__PROPERTY_KEY_NAME:
        setPropertyKeyName((String)newValue);
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
      case CypherPackage.INDEX__NODE_LABEL:
        setNodeLabel((NodeLabel)null);
        return;
      case CypherPackage.INDEX__PROPERTY_KEY_NAME:
        setPropertyKeyName(PROPERTY_KEY_NAME_EDEFAULT);
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
      case CypherPackage.INDEX__NODE_LABEL:
        return nodeLabel != null;
      case CypherPackage.INDEX__PROPERTY_KEY_NAME:
        return PROPERTY_KEY_NAME_EDEFAULT == null ? propertyKeyName != null : !PROPERTY_KEY_NAME_EDEFAULT.equals(propertyKeyName);
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
    result.append(')');
    return result.toString();
  }

} //IndexImpl
