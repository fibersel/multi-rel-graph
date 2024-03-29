/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Item Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cypher.RemoveItemProperty#getPropertyExpression <em>Property Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.cypher.CypherPackage#getRemoveItemProperty()
 * @model
 * @generated
 */
public interface RemoveItemProperty extends RemoveItem
{
  /**
   * Returns the value of the '<em><b>Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Expression</em>' containment reference.
   * @see #setPropertyExpression(PropertyExpression)
   * @see org.xtext.example.mydsl.cypher.CypherPackage#getRemoveItemProperty_PropertyExpression()
   * @model containment="true"
   * @generated
   */
  PropertyExpression getPropertyExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.cypher.RemoveItemProperty#getPropertyExpression <em>Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Expression</em>' containment reference.
   * @see #getPropertyExpression()
   * @generated
   */
  void setPropertyExpression(PropertyExpression value);

} // RemoveItemProperty
