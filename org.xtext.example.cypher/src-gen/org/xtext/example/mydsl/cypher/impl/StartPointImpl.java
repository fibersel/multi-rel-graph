/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.cypher.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.cypher.CypherPackage;
import org.xtext.example.mydsl.cypher.Lookup;
import org.xtext.example.mydsl.cypher.StartPoint;
import org.xtext.example.mydsl.cypher.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cypher.impl.StartPointImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cypher.impl.StartPointImpl#getLookup <em>Lookup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartPointImpl extends MinimalEObjectImpl.Container implements StartPoint
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected VariableDeclaration variable;

  /**
   * The cached value of the '{@link #getLookup() <em>Lookup</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLookup()
   * @generated
   * @ordered
   */
  protected Lookup lookup;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StartPointImpl()
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
    return CypherPackage.Literals.START_POINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableDeclaration getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(VariableDeclaration newVariable, NotificationChain msgs)
  {
    VariableDeclaration oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CypherPackage.START_POINT__VARIABLE, oldVariable, newVariable);
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
  public void setVariable(VariableDeclaration newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CypherPackage.START_POINT__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CypherPackage.START_POINT__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CypherPackage.START_POINT__VARIABLE, newVariable, newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lookup getLookup()
  {
    return lookup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLookup(Lookup newLookup, NotificationChain msgs)
  {
    Lookup oldLookup = lookup;
    lookup = newLookup;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CypherPackage.START_POINT__LOOKUP, oldLookup, newLookup);
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
  public void setLookup(Lookup newLookup)
  {
    if (newLookup != lookup)
    {
      NotificationChain msgs = null;
      if (lookup != null)
        msgs = ((InternalEObject)lookup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CypherPackage.START_POINT__LOOKUP, null, msgs);
      if (newLookup != null)
        msgs = ((InternalEObject)newLookup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CypherPackage.START_POINT__LOOKUP, null, msgs);
      msgs = basicSetLookup(newLookup, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CypherPackage.START_POINT__LOOKUP, newLookup, newLookup));
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
      case CypherPackage.START_POINT__VARIABLE:
        return basicSetVariable(null, msgs);
      case CypherPackage.START_POINT__LOOKUP:
        return basicSetLookup(null, msgs);
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
      case CypherPackage.START_POINT__VARIABLE:
        return getVariable();
      case CypherPackage.START_POINT__LOOKUP:
        return getLookup();
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
      case CypherPackage.START_POINT__VARIABLE:
        setVariable((VariableDeclaration)newValue);
        return;
      case CypherPackage.START_POINT__LOOKUP:
        setLookup((Lookup)newValue);
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
      case CypherPackage.START_POINT__VARIABLE:
        setVariable((VariableDeclaration)null);
        return;
      case CypherPackage.START_POINT__LOOKUP:
        setLookup((Lookup)null);
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
      case CypherPackage.START_POINT__VARIABLE:
        return variable != null;
      case CypherPackage.START_POINT__LOOKUP:
        return lookup != null;
    }
    return super.eIsSet(featureID);
  }

} //StartPointImpl
