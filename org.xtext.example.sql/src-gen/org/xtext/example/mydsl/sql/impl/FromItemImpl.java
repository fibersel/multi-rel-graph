/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.sql.impl;

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

import org.xtext.example.mydsl.sql.Expression;
import org.xtext.example.mydsl.sql.FromItem;
import org.xtext.example.mydsl.sql.SelectSection;
import org.xtext.example.mydsl.sql.SqlPackage;
import org.xtext.example.mydsl.sql.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>From Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.sql.impl.FromItemImpl#getTbl <em>Tbl</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.sql.impl.FromItemImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.sql.impl.FromItemImpl#getSelect_expr <em>Select expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FromItemImpl extends MinimalEObjectImpl.Container implements FromItem
{
  /**
   * The cached value of the '{@link #getTbl() <em>Tbl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTbl()
   * @generated
   * @ordered
   */
  protected EList<Table> tbl;

  /**
   * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressions()
   * @generated
   * @ordered
   */
  protected EList<Expression> expressions;

  /**
   * The cached value of the '{@link #getSelect_expr() <em>Select expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelect_expr()
   * @generated
   * @ordered
   */
  protected SelectSection select_expr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FromItemImpl()
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
    return SqlPackage.Literals.FROM_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Table> getTbl()
  {
    if (tbl == null)
    {
      tbl = new EObjectContainmentEList<Table>(Table.class, this, SqlPackage.FROM_ITEM__TBL);
    }
    return tbl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Expression> getExpressions()
  {
    if (expressions == null)
    {
      expressions = new EObjectContainmentEList<Expression>(Expression.class, this, SqlPackage.FROM_ITEM__EXPRESSIONS);
    }
    return expressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectSection getSelect_expr()
  {
    return select_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelect_expr(SelectSection newSelect_expr, NotificationChain msgs)
  {
    SelectSection oldSelect_expr = select_expr;
    select_expr = newSelect_expr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlPackage.FROM_ITEM__SELECT_EXPR, oldSelect_expr, newSelect_expr);
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
  public void setSelect_expr(SelectSection newSelect_expr)
  {
    if (newSelect_expr != select_expr)
    {
      NotificationChain msgs = null;
      if (select_expr != null)
        msgs = ((InternalEObject)select_expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlPackage.FROM_ITEM__SELECT_EXPR, null, msgs);
      if (newSelect_expr != null)
        msgs = ((InternalEObject)newSelect_expr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlPackage.FROM_ITEM__SELECT_EXPR, null, msgs);
      msgs = basicSetSelect_expr(newSelect_expr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlPackage.FROM_ITEM__SELECT_EXPR, newSelect_expr, newSelect_expr));
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
      case SqlPackage.FROM_ITEM__TBL:
        return ((InternalEList<?>)getTbl()).basicRemove(otherEnd, msgs);
      case SqlPackage.FROM_ITEM__EXPRESSIONS:
        return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
      case SqlPackage.FROM_ITEM__SELECT_EXPR:
        return basicSetSelect_expr(null, msgs);
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
      case SqlPackage.FROM_ITEM__TBL:
        return getTbl();
      case SqlPackage.FROM_ITEM__EXPRESSIONS:
        return getExpressions();
      case SqlPackage.FROM_ITEM__SELECT_EXPR:
        return getSelect_expr();
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
      case SqlPackage.FROM_ITEM__TBL:
        getTbl().clear();
        getTbl().addAll((Collection<? extends Table>)newValue);
        return;
      case SqlPackage.FROM_ITEM__EXPRESSIONS:
        getExpressions().clear();
        getExpressions().addAll((Collection<? extends Expression>)newValue);
        return;
      case SqlPackage.FROM_ITEM__SELECT_EXPR:
        setSelect_expr((SelectSection)newValue);
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
      case SqlPackage.FROM_ITEM__TBL:
        getTbl().clear();
        return;
      case SqlPackage.FROM_ITEM__EXPRESSIONS:
        getExpressions().clear();
        return;
      case SqlPackage.FROM_ITEM__SELECT_EXPR:
        setSelect_expr((SelectSection)null);
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
      case SqlPackage.FROM_ITEM__TBL:
        return tbl != null && !tbl.isEmpty();
      case SqlPackage.FROM_ITEM__EXPRESSIONS:
        return expressions != null && !expressions.isEmpty();
      case SqlPackage.FROM_ITEM__SELECT_EXPR:
        return select_expr != null;
    }
    return super.eIsSet(featureID);
  }

} //FromItemImpl