/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl1.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl1.myDsl.All;
import org.xtext.example.mydsl1.myDsl.FilterExpression;
import org.xtext.example.mydsl1.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>All</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.AllImpl#getFilterExpression <em>Filter Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllImpl extends ExpressionImpl implements All
{
  /**
   * The cached value of the '{@link #getFilterExpression() <em>Filter Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilterExpression()
   * @generated
   * @ordered
   */
  protected FilterExpression filterExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AllImpl()
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
    return MyDslPackage.Literals.ALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FilterExpression getFilterExpression()
  {
    return filterExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilterExpression(FilterExpression newFilterExpression, NotificationChain msgs)
  {
    FilterExpression oldFilterExpression = filterExpression;
    filterExpression = newFilterExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ALL__FILTER_EXPRESSION, oldFilterExpression, newFilterExpression);
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
  public void setFilterExpression(FilterExpression newFilterExpression)
  {
    if (newFilterExpression != filterExpression)
    {
      NotificationChain msgs = null;
      if (filterExpression != null)
        msgs = ((InternalEObject)filterExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ALL__FILTER_EXPRESSION, null, msgs);
      if (newFilterExpression != null)
        msgs = ((InternalEObject)newFilterExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ALL__FILTER_EXPRESSION, null, msgs);
      msgs = basicSetFilterExpression(newFilterExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ALL__FILTER_EXPRESSION, newFilterExpression, newFilterExpression));
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
      case MyDslPackage.ALL__FILTER_EXPRESSION:
        return basicSetFilterExpression(null, msgs);
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
      case MyDslPackage.ALL__FILTER_EXPRESSION:
        return getFilterExpression();
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
      case MyDslPackage.ALL__FILTER_EXPRESSION:
        setFilterExpression((FilterExpression)newValue);
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
      case MyDslPackage.ALL__FILTER_EXPRESSION:
        setFilterExpression((FilterExpression)null);
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
      case MyDslPackage.ALL__FILTER_EXPRESSION:
        return filterExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //AllImpl
