/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl1.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl1.myDsl.MultiPartSubQuery;
import org.xtext.example.mydsl1.myDsl.MyDslPackage;
import org.xtext.example.mydsl1.myDsl.ReadingClause;
import org.xtext.example.mydsl1.myDsl.UpdatingClause;
import org.xtext.example.mydsl1.myDsl.With;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Part Sub Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.MultiPartSubQueryImpl#getReadingClauses <em>Reading Clauses</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.MultiPartSubQueryImpl#getUpdatingClauses <em>Updating Clauses</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.MultiPartSubQueryImpl#getWithPart <em>With Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiPartSubQueryImpl extends MinimalEObjectImpl.Container implements MultiPartSubQuery
{
  /**
   * The cached value of the '{@link #getReadingClauses() <em>Reading Clauses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReadingClauses()
   * @generated
   * @ordered
   */
  protected EList<ReadingClause> readingClauses;

  /**
   * The cached value of the '{@link #getUpdatingClauses() <em>Updating Clauses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdatingClauses()
   * @generated
   * @ordered
   */
  protected EList<UpdatingClause> updatingClauses;

  /**
   * The cached value of the '{@link #getWithPart() <em>With Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWithPart()
   * @generated
   * @ordered
   */
  protected With withPart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiPartSubQueryImpl()
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
    return MyDslPackage.Literals.MULTI_PART_SUB_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ReadingClause> getReadingClauses()
  {
    if (readingClauses == null)
    {
      readingClauses = new EObjectContainmentEList<ReadingClause>(ReadingClause.class, this, MyDslPackage.MULTI_PART_SUB_QUERY__READING_CLAUSES);
    }
    return readingClauses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<UpdatingClause> getUpdatingClauses()
  {
    if (updatingClauses == null)
    {
      updatingClauses = new EObjectContainmentEList<UpdatingClause>(UpdatingClause.class, this, MyDslPackage.MULTI_PART_SUB_QUERY__UPDATING_CLAUSES);
    }
    return updatingClauses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public With getWithPart()
  {
    return withPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWithPart(With newWithPart, NotificationChain msgs)
  {
    With oldWithPart = withPart;
    withPart = newWithPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.MULTI_PART_SUB_QUERY__WITH_PART, oldWithPart, newWithPart);
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
  public void setWithPart(With newWithPart)
  {
    if (newWithPart != withPart)
    {
      NotificationChain msgs = null;
      if (withPart != null)
        msgs = ((InternalEObject)withPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MULTI_PART_SUB_QUERY__WITH_PART, null, msgs);
      if (newWithPart != null)
        msgs = ((InternalEObject)newWithPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MULTI_PART_SUB_QUERY__WITH_PART, null, msgs);
      msgs = basicSetWithPart(newWithPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MULTI_PART_SUB_QUERY__WITH_PART, newWithPart, newWithPart));
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
      case MyDslPackage.MULTI_PART_SUB_QUERY__READING_CLAUSES:
        return ((InternalEList<?>)getReadingClauses()).basicRemove(otherEnd, msgs);
      case MyDslPackage.MULTI_PART_SUB_QUERY__UPDATING_CLAUSES:
        return ((InternalEList<?>)getUpdatingClauses()).basicRemove(otherEnd, msgs);
      case MyDslPackage.MULTI_PART_SUB_QUERY__WITH_PART:
        return basicSetWithPart(null, msgs);
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
      case MyDslPackage.MULTI_PART_SUB_QUERY__READING_CLAUSES:
        return getReadingClauses();
      case MyDslPackage.MULTI_PART_SUB_QUERY__UPDATING_CLAUSES:
        return getUpdatingClauses();
      case MyDslPackage.MULTI_PART_SUB_QUERY__WITH_PART:
        return getWithPart();
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
      case MyDslPackage.MULTI_PART_SUB_QUERY__READING_CLAUSES:
        getReadingClauses().clear();
        getReadingClauses().addAll((Collection<? extends ReadingClause>)newValue);
        return;
      case MyDslPackage.MULTI_PART_SUB_QUERY__UPDATING_CLAUSES:
        getUpdatingClauses().clear();
        getUpdatingClauses().addAll((Collection<? extends UpdatingClause>)newValue);
        return;
      case MyDslPackage.MULTI_PART_SUB_QUERY__WITH_PART:
        setWithPart((With)newValue);
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
      case MyDslPackage.MULTI_PART_SUB_QUERY__READING_CLAUSES:
        getReadingClauses().clear();
        return;
      case MyDslPackage.MULTI_PART_SUB_QUERY__UPDATING_CLAUSES:
        getUpdatingClauses().clear();
        return;
      case MyDslPackage.MULTI_PART_SUB_QUERY__WITH_PART:
        setWithPart((With)null);
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
      case MyDslPackage.MULTI_PART_SUB_QUERY__READING_CLAUSES:
        return readingClauses != null && !readingClauses.isEmpty();
      case MyDslPackage.MULTI_PART_SUB_QUERY__UPDATING_CLAUSES:
        return updatingClauses != null && !updatingClauses.isEmpty();
      case MyDslPackage.MULTI_PART_SUB_QUERY__WITH_PART:
        return withPart != null;
    }
    return super.eIsSet(featureID);
  }

} //MultiPartSubQueryImpl
