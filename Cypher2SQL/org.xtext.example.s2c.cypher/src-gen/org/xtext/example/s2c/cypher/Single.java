/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.s2c.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.s2c.cypher.Single#getFilterExpression <em>Filter Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.s2c.cypher.CypherPackage#getSingle()
 * @model
 * @generated
 */
public interface Single extends Expression
{
  /**
   * Returns the value of the '<em><b>Filter Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter Expression</em>' containment reference.
   * @see #setFilterExpression(FilterExpression)
   * @see org.xtext.example.s2c.cypher.CypherPackage#getSingle_FilterExpression()
   * @model containment="true"
   * @generated
   */
  FilterExpression getFilterExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.s2c.cypher.Single#getFilterExpression <em>Filter Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter Expression</em>' containment reference.
   * @see #getFilterExpression()
   * @generated
   */
  void setFilterExpression(FilterExpression value);

} // Single
