/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cypher.Extract#getFilterExpression <em>Filter Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cypher.Extract#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.cypher.CypherPackage#getExtract()
 * @model
 * @generated
 */
public interface Extract extends Expression
{
  /**
   * Returns the value of the '<em><b>Filter Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter Expression</em>' containment reference.
   * @see #setFilterExpression(FilterExpression)
   * @see org.xtext.example.mydsl.cypher.CypherPackage#getExtract_FilterExpression()
   * @model containment="true"
   * @generated
   */
  FilterExpression getFilterExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.cypher.Extract#getFilterExpression <em>Filter Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter Expression</em>' containment reference.
   * @see #getFilterExpression()
   * @generated
   */
  void setFilterExpression(FilterExpression value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.xtext.example.mydsl.cypher.CypherPackage#getExtract_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.cypher.Extract#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // Extract
