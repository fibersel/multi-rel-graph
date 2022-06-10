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

import org.xtext.example.s2c.cypher.AnonymousPatternPart;
import org.xtext.example.s2c.cypher.CypherPackage;
import org.xtext.example.s2c.cypher.PatternPart;
import org.xtext.example.s2c.cypher.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.s2c.cypher.impl.PatternPartImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.example.s2c.cypher.impl.PatternPartImpl#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternPartImpl extends MinimalEObjectImpl.Container implements PatternPart
{
  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected VariableDeclaration var;

  /**
   * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPart()
   * @generated
   * @ordered
   */
  protected AnonymousPatternPart part;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PatternPartImpl()
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
    return CypherPackage.Literals.PATTERN_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableDeclaration getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar(VariableDeclaration newVar, NotificationChain msgs)
  {
    VariableDeclaration oldVar = var;
    var = newVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CypherPackage.PATTERN_PART__VAR, oldVar, newVar);
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
  public void setVar(VariableDeclaration newVar)
  {
    if (newVar != var)
    {
      NotificationChain msgs = null;
      if (var != null)
        msgs = ((InternalEObject)var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CypherPackage.PATTERN_PART__VAR, null, msgs);
      if (newVar != null)
        msgs = ((InternalEObject)newVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CypherPackage.PATTERN_PART__VAR, null, msgs);
      msgs = basicSetVar(newVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CypherPackage.PATTERN_PART__VAR, newVar, newVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AnonymousPatternPart getPart()
  {
    return part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPart(AnonymousPatternPart newPart, NotificationChain msgs)
  {
    AnonymousPatternPart oldPart = part;
    part = newPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CypherPackage.PATTERN_PART__PART, oldPart, newPart);
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
  public void setPart(AnonymousPatternPart newPart)
  {
    if (newPart != part)
    {
      NotificationChain msgs = null;
      if (part != null)
        msgs = ((InternalEObject)part).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CypherPackage.PATTERN_PART__PART, null, msgs);
      if (newPart != null)
        msgs = ((InternalEObject)newPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CypherPackage.PATTERN_PART__PART, null, msgs);
      msgs = basicSetPart(newPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CypherPackage.PATTERN_PART__PART, newPart, newPart));
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
      case CypherPackage.PATTERN_PART__VAR:
        return basicSetVar(null, msgs);
      case CypherPackage.PATTERN_PART__PART:
        return basicSetPart(null, msgs);
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
      case CypherPackage.PATTERN_PART__VAR:
        return getVar();
      case CypherPackage.PATTERN_PART__PART:
        return getPart();
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
      case CypherPackage.PATTERN_PART__VAR:
        setVar((VariableDeclaration)newValue);
        return;
      case CypherPackage.PATTERN_PART__PART:
        setPart((AnonymousPatternPart)newValue);
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
      case CypherPackage.PATTERN_PART__VAR:
        setVar((VariableDeclaration)null);
        return;
      case CypherPackage.PATTERN_PART__PART:
        setPart((AnonymousPatternPart)null);
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
      case CypherPackage.PATTERN_PART__VAR:
        return var != null;
      case CypherPackage.PATTERN_PART__PART:
        return part != null;
    }
    return super.eIsSet(featureID);
  }

} //PatternPartImpl
