/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl1.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl1.myDsl.MyDslPackage;
import org.xtext.example.mydsl1.myDsl.StandaloneCall;
import org.xtext.example.mydsl1.myDsl.YieldItems;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standalone Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.StandaloneCallImpl#getInvocation <em>Invocation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.StandaloneCallImpl#getYieldItems <em>Yield Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StandaloneCallImpl extends QueryImpl implements StandaloneCall
{
  /**
   * The cached value of the '{@link #getInvocation() <em>Invocation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvocation()
   * @generated
   * @ordered
   */
  protected EObject invocation;

  /**
   * The cached value of the '{@link #getYieldItems() <em>Yield Items</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYieldItems()
   * @generated
   * @ordered
   */
  protected YieldItems yieldItems;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StandaloneCallImpl()
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
    return MyDslPackage.Literals.STANDALONE_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getInvocation()
  {
    return invocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInvocation(EObject newInvocation, NotificationChain msgs)
  {
    EObject oldInvocation = invocation;
    invocation = newInvocation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STANDALONE_CALL__INVOCATION, oldInvocation, newInvocation);
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
  public void setInvocation(EObject newInvocation)
  {
    if (newInvocation != invocation)
    {
      NotificationChain msgs = null;
      if (invocation != null)
        msgs = ((InternalEObject)invocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STANDALONE_CALL__INVOCATION, null, msgs);
      if (newInvocation != null)
        msgs = ((InternalEObject)newInvocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STANDALONE_CALL__INVOCATION, null, msgs);
      msgs = basicSetInvocation(newInvocation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STANDALONE_CALL__INVOCATION, newInvocation, newInvocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YieldItems getYieldItems()
  {
    return yieldItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetYieldItems(YieldItems newYieldItems, NotificationChain msgs)
  {
    YieldItems oldYieldItems = yieldItems;
    yieldItems = newYieldItems;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STANDALONE_CALL__YIELD_ITEMS, oldYieldItems, newYieldItems);
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
  public void setYieldItems(YieldItems newYieldItems)
  {
    if (newYieldItems != yieldItems)
    {
      NotificationChain msgs = null;
      if (yieldItems != null)
        msgs = ((InternalEObject)yieldItems).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STANDALONE_CALL__YIELD_ITEMS, null, msgs);
      if (newYieldItems != null)
        msgs = ((InternalEObject)newYieldItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STANDALONE_CALL__YIELD_ITEMS, null, msgs);
      msgs = basicSetYieldItems(newYieldItems, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STANDALONE_CALL__YIELD_ITEMS, newYieldItems, newYieldItems));
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
      case MyDslPackage.STANDALONE_CALL__INVOCATION:
        return basicSetInvocation(null, msgs);
      case MyDslPackage.STANDALONE_CALL__YIELD_ITEMS:
        return basicSetYieldItems(null, msgs);
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
      case MyDslPackage.STANDALONE_CALL__INVOCATION:
        return getInvocation();
      case MyDslPackage.STANDALONE_CALL__YIELD_ITEMS:
        return getYieldItems();
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
      case MyDslPackage.STANDALONE_CALL__INVOCATION:
        setInvocation((EObject)newValue);
        return;
      case MyDslPackage.STANDALONE_CALL__YIELD_ITEMS:
        setYieldItems((YieldItems)newValue);
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
      case MyDslPackage.STANDALONE_CALL__INVOCATION:
        setInvocation((EObject)null);
        return;
      case MyDslPackage.STANDALONE_CALL__YIELD_ITEMS:
        setYieldItems((YieldItems)null);
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
      case MyDslPackage.STANDALONE_CALL__INVOCATION:
        return invocation != null;
      case MyDslPackage.STANDALONE_CALL__YIELD_ITEMS:
        return yieldItems != null;
    }
    return super.eIsSet(featureID);
  }

} //StandaloneCallImpl
