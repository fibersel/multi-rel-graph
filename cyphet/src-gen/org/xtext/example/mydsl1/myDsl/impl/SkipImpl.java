/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl1.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl1.myDsl.Expression;
import org.xtext.example.mydsl1.myDsl.MyDslPackage;
import org.xtext.example.mydsl1.myDsl.Skip;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.SkipImpl#getSkip <em>Skip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkipImpl extends MinimalEObjectImpl.Container implements Skip
{
  /**
   * The cached value of the '{@link #getSkip() <em>Skip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSkip()
   * @generated
   * @ordered
   */
  protected Expression skip;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SkipImpl()
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
    return MyDslPackage.Literals.SKIP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getSkip()
  {
    return skip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSkip(Expression newSkip, NotificationChain msgs)
  {
    Expression oldSkip = skip;
    skip = newSkip;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SKIP__SKIP, oldSkip, newSkip);
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
  public void setSkip(Expression newSkip)
  {
    if (newSkip != skip)
    {
      NotificationChain msgs = null;
      if (skip != null)
        msgs = ((InternalEObject)skip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SKIP__SKIP, null, msgs);
      if (newSkip != null)
        msgs = ((InternalEObject)newSkip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SKIP__SKIP, null, msgs);
      msgs = basicSetSkip(newSkip, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SKIP__SKIP, newSkip, newSkip));
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
      case MyDslPackage.SKIP__SKIP:
        return basicSetSkip(null, msgs);
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
      case MyDslPackage.SKIP__SKIP:
        return getSkip();
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
      case MyDslPackage.SKIP__SKIP:
        setSkip((Expression)newValue);
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
      case MyDslPackage.SKIP__SKIP:
        setSkip((Expression)null);
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
      case MyDslPackage.SKIP__SKIP:
        return skip != null;
    }
    return super.eIsSet(featureID);
  }

} //SkipImpl
