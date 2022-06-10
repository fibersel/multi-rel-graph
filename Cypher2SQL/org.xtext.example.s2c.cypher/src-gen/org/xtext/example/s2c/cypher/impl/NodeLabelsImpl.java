/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.s2c.cypher.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.s2c.cypher.CypherPackage;
import org.xtext.example.s2c.cypher.NodeLabel;
import org.xtext.example.s2c.cypher.NodeLabels;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Labels</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.s2c.cypher.impl.NodeLabelsImpl#getNodeLabels <em>Node Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeLabelsImpl extends MinimalEObjectImpl.Container implements NodeLabels
{
  /**
   * The cached value of the '{@link #getNodeLabels() <em>Node Labels</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeLabels()
   * @generated
   * @ordered
   */
  protected EList<NodeLabel> nodeLabels;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeLabelsImpl()
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
    return CypherPackage.Literals.NODE_LABELS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<NodeLabel> getNodeLabels()
  {
    if (nodeLabels == null)
    {
      nodeLabels = new EObjectContainmentEList<NodeLabel>(NodeLabel.class, this, CypherPackage.NODE_LABELS__NODE_LABELS);
    }
    return nodeLabels;
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
      case CypherPackage.NODE_LABELS__NODE_LABELS:
        return ((InternalEList<?>)getNodeLabels()).basicRemove(otherEnd, msgs);
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
      case CypherPackage.NODE_LABELS__NODE_LABELS:
        return getNodeLabels();
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
      case CypherPackage.NODE_LABELS__NODE_LABELS:
        getNodeLabels().clear();
        getNodeLabels().addAll((Collection<? extends NodeLabel>)newValue);
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
      case CypherPackage.NODE_LABELS__NODE_LABELS:
        getNodeLabels().clear();
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
      case CypherPackage.NODE_LABELS__NODE_LABELS:
        return nodeLabels != null && !nodeLabels.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NodeLabelsImpl
