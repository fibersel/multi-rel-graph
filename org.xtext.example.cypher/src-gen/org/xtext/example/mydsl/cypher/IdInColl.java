/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.cypher;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Id In Coll</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cypher.IdInColl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cypher.IdInColl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.cypher.CypherPackage#getIdInColl()
 * @model
 * @generated
 */
public interface IdInColl extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(VariableDeclaration)
   * @see org.xtext.example.mydsl.cypher.CypherPackage#getIdInColl_Variable()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.cypher.IdInColl#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.xtext.example.mydsl.cypher.CypherPackage#getIdInColl_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.cypher.IdInColl#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // IdInColl
