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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.cypher.CypherPackage;
import org.xtext.example.mydsl.cypher.Expression;
import org.xtext.example.mydsl.cypher.NodeLabel;
import org.xtext.example.mydsl.cypher.NodeLabels;
import org.xtext.example.mydsl.cypher.PatternElement;
import org.xtext.example.mydsl.cypher.PropertyExpression;
import org.xtext.example.mydsl.cypher.PropertyLookup;
import org.xtext.example.mydsl.cypher.ShortestPathPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shortest Path Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cypher.impl.ShortestPathPatternImpl#getNodeLabels <em>Node Labels</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cypher.impl.ShortestPathPatternImpl#getPropertyLookups <em>Property Lookups</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cypher.impl.ShortestPathPatternImpl#getPatternElement <em>Pattern Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShortestPathPatternImpl extends AnonymousPatternPartImpl implements ShortestPathPattern
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
   * The cached value of the '{@link #getPropertyLookups() <em>Property Lookups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyLookups()
   * @generated
   * @ordered
   */
  protected EList<PropertyLookup> propertyLookups;

  /**
   * The cached value of the '{@link #getPatternElement() <em>Pattern Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatternElement()
   * @generated
   * @ordered
   */
  protected PatternElement patternElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ShortestPathPatternImpl()
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
    return CypherPackage.Literals.SHORTEST_PATH_PATTERN;
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
      nodeLabels = new EObjectContainmentEList<NodeLabel>(NodeLabel.class, this, CypherPackage.SHORTEST_PATH_PATTERN__NODE_LABELS);
    }
    return nodeLabels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PropertyLookup> getPropertyLookups()
  {
    if (propertyLookups == null)
    {
      propertyLookups = new EObjectContainmentEList<PropertyLookup>(PropertyLookup.class, this, CypherPackage.SHORTEST_PATH_PATTERN__PROPERTY_LOOKUPS);
    }
    return propertyLookups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PatternElement getPatternElement()
  {
    return patternElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPatternElement(PatternElement newPatternElement, NotificationChain msgs)
  {
    PatternElement oldPatternElement = patternElement;
    patternElement = newPatternElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CypherPackage.SHORTEST_PATH_PATTERN__PATTERN_ELEMENT, oldPatternElement, newPatternElement);
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
  public void setPatternElement(PatternElement newPatternElement)
  {
    if (newPatternElement != patternElement)
    {
      NotificationChain msgs = null;
      if (patternElement != null)
        msgs = ((InternalEObject)patternElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CypherPackage.SHORTEST_PATH_PATTERN__PATTERN_ELEMENT, null, msgs);
      if (newPatternElement != null)
        msgs = ((InternalEObject)newPatternElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CypherPackage.SHORTEST_PATH_PATTERN__PATTERN_ELEMENT, null, msgs);
      msgs = basicSetPatternElement(newPatternElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CypherPackage.SHORTEST_PATH_PATTERN__PATTERN_ELEMENT, newPatternElement, newPatternElement));
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
      case CypherPackage.SHORTEST_PATH_PATTERN__NODE_LABELS:
        return ((InternalEList<?>)getNodeLabels()).basicRemove(otherEnd, msgs);
      case CypherPackage.SHORTEST_PATH_PATTERN__PROPERTY_LOOKUPS:
        return ((InternalEList<?>)getPropertyLookups()).basicRemove(otherEnd, msgs);
      case CypherPackage.SHORTEST_PATH_PATTERN__PATTERN_ELEMENT:
        return basicSetPatternElement(null, msgs);
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
      case CypherPackage.SHORTEST_PATH_PATTERN__NODE_LABELS:
        return getNodeLabels();
      case CypherPackage.SHORTEST_PATH_PATTERN__PROPERTY_LOOKUPS:
        return getPropertyLookups();
      case CypherPackage.SHORTEST_PATH_PATTERN__PATTERN_ELEMENT:
        return getPatternElement();
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
      case CypherPackage.SHORTEST_PATH_PATTERN__NODE_LABELS:
        getNodeLabels().clear();
        getNodeLabels().addAll((Collection<? extends NodeLabel>)newValue);
        return;
      case CypherPackage.SHORTEST_PATH_PATTERN__PROPERTY_LOOKUPS:
        getPropertyLookups().clear();
        getPropertyLookups().addAll((Collection<? extends PropertyLookup>)newValue);
        return;
      case CypherPackage.SHORTEST_PATH_PATTERN__PATTERN_ELEMENT:
        setPatternElement((PatternElement)newValue);
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
      case CypherPackage.SHORTEST_PATH_PATTERN__NODE_LABELS:
        getNodeLabels().clear();
        return;
      case CypherPackage.SHORTEST_PATH_PATTERN__PROPERTY_LOOKUPS:
        getPropertyLookups().clear();
        return;
      case CypherPackage.SHORTEST_PATH_PATTERN__PATTERN_ELEMENT:
        setPatternElement((PatternElement)null);
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
      case CypherPackage.SHORTEST_PATH_PATTERN__NODE_LABELS:
        return nodeLabels != null && !nodeLabels.isEmpty();
      case CypherPackage.SHORTEST_PATH_PATTERN__PROPERTY_LOOKUPS:
        return propertyLookups != null && !propertyLookups.isEmpty();
      case CypherPackage.SHORTEST_PATH_PATTERN__PATTERN_ELEMENT:
        return patternElement != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == NodeLabels.class)
    {
      switch (derivedFeatureID)
      {
        case CypherPackage.SHORTEST_PATH_PATTERN__NODE_LABELS: return CypherPackage.NODE_LABELS__NODE_LABELS;
        default: return -1;
      }
    }
    if (baseClass == PropertyExpression.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Expression.class)
    {
      switch (derivedFeatureID)
      {
        case CypherPackage.SHORTEST_PATH_PATTERN__PROPERTY_LOOKUPS: return CypherPackage.EXPRESSION__PROPERTY_LOOKUPS;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == NodeLabels.class)
    {
      switch (baseFeatureID)
      {
        case CypherPackage.NODE_LABELS__NODE_LABELS: return CypherPackage.SHORTEST_PATH_PATTERN__NODE_LABELS;
        default: return -1;
      }
    }
    if (baseClass == PropertyExpression.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Expression.class)
    {
      switch (baseFeatureID)
      {
        case CypherPackage.EXPRESSION__PROPERTY_LOOKUPS: return CypherPackage.SHORTEST_PATH_PATTERN__PROPERTY_LOOKUPS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //ShortestPathPatternImpl
