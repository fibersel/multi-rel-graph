/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Property Existence Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cypher.NodePropertyExistenceConstraint#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cypher.NodePropertyExistenceConstraint#getNodeLabel <em>Node Label</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cypher.NodePropertyExistenceConstraint#getPropertyExpression <em>Property Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.cypher.CypherPackage#getNodePropertyExistenceConstraint()
 * @model
 * @generated
 */
public interface NodePropertyExistenceConstraint extends CreateNodePropertyExistenceConstraint
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(VariableDeclaration)
   * @see org.xtext.example.mydsl.cypher.CypherPackage#getNodePropertyExistenceConstraint_Variable()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.cypher.NodePropertyExistenceConstraint#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Node Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Label</em>' containment reference.
   * @see #setNodeLabel(NodeLabel)
   * @see org.xtext.example.mydsl.cypher.CypherPackage#getNodePropertyExistenceConstraint_NodeLabel()
   * @model containment="true"
   * @generated
   */
  NodeLabel getNodeLabel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.cypher.NodePropertyExistenceConstraint#getNodeLabel <em>Node Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Label</em>' containment reference.
   * @see #getNodeLabel()
   * @generated
   */
  void setNodeLabel(NodeLabel value);

  /**
   * Returns the value of the '<em><b>Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Expression</em>' containment reference.
   * @see #setPropertyExpression(PropertyExpression)
   * @see org.xtext.example.mydsl.cypher.CypherPackage#getNodePropertyExistenceConstraint_PropertyExpression()
   * @model containment="true"
   * @generated
   */
  PropertyExpression getPropertyExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.cypher.NodePropertyExistenceConstraint#getPropertyExpression <em>Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Expression</em>' containment reference.
   * @see #getPropertyExpression()
   * @generated
   */
  void setPropertyExpression(PropertyExpression value);

} // NodePropertyExistenceConstraint
