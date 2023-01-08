/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.cypher.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.cypher.BulkImportQuery;
import org.xtext.example.mydsl.cypher.CypherPackage;
import org.xtext.example.mydsl.cypher.LoadCSVQuery;
import org.xtext.example.mydsl.cypher.PeriodicCommitHint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bulk Import Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cypher.impl.BulkImportQueryImpl#getPeriodicCommitHint <em>Periodic Commit Hint</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cypher.impl.BulkImportQueryImpl#getLoadCSVQuery <em>Load CSV Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BulkImportQueryImpl extends QueryImpl implements BulkImportQuery
{
  /**
   * The cached value of the '{@link #getPeriodicCommitHint() <em>Periodic Commit Hint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeriodicCommitHint()
   * @generated
   * @ordered
   */
  protected PeriodicCommitHint periodicCommitHint;

  /**
   * The cached value of the '{@link #getLoadCSVQuery() <em>Load CSV Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoadCSVQuery()
   * @generated
   * @ordered
   */
  protected LoadCSVQuery loadCSVQuery;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BulkImportQueryImpl()
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
    return CypherPackage.Literals.BULK_IMPORT_QUERY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PeriodicCommitHint getPeriodicCommitHint()
  {
    return periodicCommitHint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPeriodicCommitHint(PeriodicCommitHint newPeriodicCommitHint, NotificationChain msgs)
  {
    PeriodicCommitHint oldPeriodicCommitHint = periodicCommitHint;
    periodicCommitHint = newPeriodicCommitHint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CypherPackage.BULK_IMPORT_QUERY__PERIODIC_COMMIT_HINT, oldPeriodicCommitHint, newPeriodicCommitHint);
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
  public void setPeriodicCommitHint(PeriodicCommitHint newPeriodicCommitHint)
  {
    if (newPeriodicCommitHint != periodicCommitHint)
    {
      NotificationChain msgs = null;
      if (periodicCommitHint != null)
        msgs = ((InternalEObject)periodicCommitHint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CypherPackage.BULK_IMPORT_QUERY__PERIODIC_COMMIT_HINT, null, msgs);
      if (newPeriodicCommitHint != null)
        msgs = ((InternalEObject)newPeriodicCommitHint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CypherPackage.BULK_IMPORT_QUERY__PERIODIC_COMMIT_HINT, null, msgs);
      msgs = basicSetPeriodicCommitHint(newPeriodicCommitHint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CypherPackage.BULK_IMPORT_QUERY__PERIODIC_COMMIT_HINT, newPeriodicCommitHint, newPeriodicCommitHint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LoadCSVQuery getLoadCSVQuery()
  {
    return loadCSVQuery;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLoadCSVQuery(LoadCSVQuery newLoadCSVQuery, NotificationChain msgs)
  {
    LoadCSVQuery oldLoadCSVQuery = loadCSVQuery;
    loadCSVQuery = newLoadCSVQuery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CypherPackage.BULK_IMPORT_QUERY__LOAD_CSV_QUERY, oldLoadCSVQuery, newLoadCSVQuery);
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
  public void setLoadCSVQuery(LoadCSVQuery newLoadCSVQuery)
  {
    if (newLoadCSVQuery != loadCSVQuery)
    {
      NotificationChain msgs = null;
      if (loadCSVQuery != null)
        msgs = ((InternalEObject)loadCSVQuery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CypherPackage.BULK_IMPORT_QUERY__LOAD_CSV_QUERY, null, msgs);
      if (newLoadCSVQuery != null)
        msgs = ((InternalEObject)newLoadCSVQuery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CypherPackage.BULK_IMPORT_QUERY__LOAD_CSV_QUERY, null, msgs);
      msgs = basicSetLoadCSVQuery(newLoadCSVQuery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CypherPackage.BULK_IMPORT_QUERY__LOAD_CSV_QUERY, newLoadCSVQuery, newLoadCSVQuery));
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
      case CypherPackage.BULK_IMPORT_QUERY__PERIODIC_COMMIT_HINT:
        return basicSetPeriodicCommitHint(null, msgs);
      case CypherPackage.BULK_IMPORT_QUERY__LOAD_CSV_QUERY:
        return basicSetLoadCSVQuery(null, msgs);
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
      case CypherPackage.BULK_IMPORT_QUERY__PERIODIC_COMMIT_HINT:
        return getPeriodicCommitHint();
      case CypherPackage.BULK_IMPORT_QUERY__LOAD_CSV_QUERY:
        return getLoadCSVQuery();
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
      case CypherPackage.BULK_IMPORT_QUERY__PERIODIC_COMMIT_HINT:
        setPeriodicCommitHint((PeriodicCommitHint)newValue);
        return;
      case CypherPackage.BULK_IMPORT_QUERY__LOAD_CSV_QUERY:
        setLoadCSVQuery((LoadCSVQuery)newValue);
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
      case CypherPackage.BULK_IMPORT_QUERY__PERIODIC_COMMIT_HINT:
        setPeriodicCommitHint((PeriodicCommitHint)null);
        return;
      case CypherPackage.BULK_IMPORT_QUERY__LOAD_CSV_QUERY:
        setLoadCSVQuery((LoadCSVQuery)null);
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
      case CypherPackage.BULK_IMPORT_QUERY__PERIODIC_COMMIT_HINT:
        return periodicCommitHint != null;
      case CypherPackage.BULK_IMPORT_QUERY__LOAD_CSV_QUERY:
        return loadCSVQuery != null;
    }
    return super.eIsSet(featureID);
  }

} //BulkImportQueryImpl
