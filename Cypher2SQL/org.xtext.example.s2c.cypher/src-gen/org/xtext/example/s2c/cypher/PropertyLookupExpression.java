/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.s2c.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Lookup Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.s2c.cypher.PropertyLookupExpression#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.s2c.cypher.CypherPackage#getPropertyLookupExpression()
 * @model
 * @generated
 */
public interface PropertyLookupExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see org.xtext.example.s2c.cypher.CypherPackage#getPropertyLookupExpression_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.s2c.cypher.PropertyLookupExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

} // PropertyLookupExpression
