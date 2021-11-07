/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.s2c.sQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>having clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.s2c.sQL.having_clause#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.s2c.sQL.SQLPackage#gethaving_clause()
 * @model
 * @generated
 */
public interface having_clause extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(boolExpression)
   * @see org.xtext.example.s2c.sQL.SQLPackage#gethaving_clause_Expr()
   * @model containment="true"
   * @generated
   */
  boolExpression getExpr();

  /**
   * Sets the value of the '{@link org.xtext.example.s2c.sQL.having_clause#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(boolExpression value);

} // having_clause