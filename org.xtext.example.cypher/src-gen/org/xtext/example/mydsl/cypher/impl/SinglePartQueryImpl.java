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
import org.xtext.example.mydsl.cypher.ReadingClause;
import org.xtext.example.mydsl.cypher.Return;
import org.xtext.example.mydsl.cypher.SinglePartQuery;
import org.xtext.example.mydsl.cypher.UpdatingClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Part Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cypher.impl.SinglePartQueryImpl#getReadingClauses <em>Reading Clauses</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cypher.impl.SinglePartQueryImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cypher.impl.SinglePartQueryImpl#getUpdatingClauses <em>Updating Clauses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SinglePartQueryImpl extends SingleQueryImpl implements SinglePartQuery
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
   * The cached value of the '{@link #getReturn() <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturn()
   * @generated
   * @ordered
   */
  protected Return return_;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SinglePartQueryImpl()
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
    return CypherPackage.Literals.SINGLE_PART_QUERY;
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
      readingClauses = new EObjectContainmentEList<ReadingClause>(ReadingClause.class, this, CypherPackage.SINGLE_PART_QUERY__READING_CLAUSES);
    }
    return readingClauses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Return getReturn()
  {
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturn(Return newReturn, NotificationChain msgs)
  {
    Return oldReturn = return_;
    return_ = newReturn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CypherPackage.SINGLE_PART_QUERY__RETURN, oldReturn, newReturn);
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
  public void setReturn(Return newReturn)
  {
    if (newReturn != return_)
    {
      NotificationChain msgs = null;
      if (return_ != null)
        msgs = ((InternalEObject)return_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CypherPackage.SINGLE_PART_QUERY__RETURN, null, msgs);
      if (newReturn != null)
        msgs = ((InternalEObject)newReturn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CypherPackage.SINGLE_PART_QUERY__RETURN, null, msgs);
      msgs = basicSetReturn(newReturn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CypherPackage.SINGLE_PART_QUERY__RETURN, newReturn, newReturn));
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
      updatingClauses = new EObjectContainmentEList<UpdatingClause>(UpdatingClause.class, this, CypherPackage.SINGLE_PART_QUERY__UPDATING_CLAUSES);
    }
    return updatingClauses;
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
      case CypherPackage.SINGLE_PART_QUERY__READING_CLAUSES:
        return ((InternalEList<?>)getReadingClauses()).basicRemove(otherEnd, msgs);
      case CypherPackage.SINGLE_PART_QUERY__RETURN:
        return basicSetReturn(null, msgs);
      case CypherPackage.SINGLE_PART_QUERY__UPDATING_CLAUSES:
        return ((InternalEList<?>)getUpdatingClauses()).basicRemove(otherEnd, msgs);
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
      case CypherPackage.SINGLE_PART_QUERY__READING_CLAUSES:
        return getReadingClauses();
      case CypherPackage.SINGLE_PART_QUERY__RETURN:
        return getReturn();
      case CypherPackage.SINGLE_PART_QUERY__UPDATING_CLAUSES:
        return getUpdatingClauses();
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
      case CypherPackage.SINGLE_PART_QUERY__READING_CLAUSES:
        getReadingClauses().clear();
        getReadingClauses().addAll((Collection<? extends ReadingClause>)newValue);
        return;
      case CypherPackage.SINGLE_PART_QUERY__RETURN:
        setReturn((Return)newValue);
        return;
      case CypherPackage.SINGLE_PART_QUERY__UPDATING_CLAUSES:
        getUpdatingClauses().clear();
        getUpdatingClauses().addAll((Collection<? extends UpdatingClause>)newValue);
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
      case CypherPackage.SINGLE_PART_QUERY__READING_CLAUSES:
        getReadingClauses().clear();
        return;
      case CypherPackage.SINGLE_PART_QUERY__RETURN:
        setReturn((Return)null);
        return;
      case CypherPackage.SINGLE_PART_QUERY__UPDATING_CLAUSES:
        getUpdatingClauses().clear();
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
      case CypherPackage.SINGLE_PART_QUERY__READING_CLAUSES:
        return readingClauses != null && !readingClauses.isEmpty();
      case CypherPackage.SINGLE_PART_QUERY__RETURN:
        return return_ != null;
      case CypherPackage.SINGLE_PART_QUERY__UPDATING_CLAUSES:
        return updatingClauses != null && !updatingClauses.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SinglePartQueryImpl
