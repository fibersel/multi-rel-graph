/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.sql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Having Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.sql.HavingClause#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.sql.SqlPackage#getHavingClause()
 * @model
 * @generated
 */
public interface HavingClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expression)
   * @see org.xtext.example.mydsl.sql.SqlPackage#getHavingClause_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.sql.HavingClause#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

} // HavingClause
