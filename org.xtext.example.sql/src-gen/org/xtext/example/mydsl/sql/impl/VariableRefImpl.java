/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.sql.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.sql.SqlPackage;
import org.xtext.example.mydsl.sql.VariableDeclaration;
import org.xtext.example.mydsl.sql.VariableRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.sql.impl.VariableRefImpl#getVariableRef <em>Variable Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableRefImpl extends ExpressionImpl implements VariableRef
{
  /**
   * The cached value of the '{@link #getVariableRef() <em>Variable Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableRef()
   * @generated
   * @ordered
   */
  protected VariableDeclaration variableRef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableRefImpl()
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
    return SqlPackage.Literals.VARIABLE_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableDeclaration getVariableRef()
  {
    return variableRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariableRef(VariableDeclaration newVariableRef, NotificationChain msgs)
  {
    VariableDeclaration oldVariableRef = variableRef;
    variableRef = newVariableRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlPackage.VARIABLE_REF__VARIABLE_REF, oldVariableRef, newVariableRef);
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
  public void setVariableRef(VariableDeclaration newVariableRef)
  {
    if (newVariableRef != variableRef)
    {
      NotificationChain msgs = null;
      if (variableRef != null)
        msgs = ((InternalEObject)variableRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlPackage.VARIABLE_REF__VARIABLE_REF, null, msgs);
      if (newVariableRef != null)
        msgs = ((InternalEObject)newVariableRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlPackage.VARIABLE_REF__VARIABLE_REF, null, msgs);
      msgs = basicSetVariableRef(newVariableRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.VARIABLE_REF__VARIABLE_REF, newVariableRef, newVariableRef));
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
      case SqlPackage.VARIABLE_REF__VARIABLE_REF:
        return basicSetVariableRef(null, msgs);
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
      case SqlPackage.VARIABLE_REF__VARIABLE_REF:
        return getVariableRef();
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
      case SqlPackage.VARIABLE_REF__VARIABLE_REF:
        setVariableRef((VariableDeclaration)newValue);
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
      case SqlPackage.VARIABLE_REF__VARIABLE_REF:
        setVariableRef((VariableDeclaration)null);
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
      case SqlPackage.VARIABLE_REF__VARIABLE_REF:
        return variableRef != null;
    }
    return super.eIsSet(featureID);
  }

} //VariableRefImpl