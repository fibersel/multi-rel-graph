/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.s2c.sQL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.s2c.sQL.Expression#getCol <em>Col</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.s2c.sQL.SQLPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Col</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Col</em>' containment reference.
   * @see #setCol(Column)
   * @see org.xtext.example.s2c.sQL.SQLPackage#getExpression_Col()
   * @model containment="true"
   * @generated
   */
  Column getCol();

  /**
   * Sets the value of the '{@link org.xtext.example.s2c.sQL.Expression#getCol <em>Col</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Col</em>' containment reference.
   * @see #getCol()
   * @generated
   */
  void setCol(Column value);

} // Expression
