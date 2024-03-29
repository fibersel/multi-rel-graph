/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cypher.VariableRef#getVariableRef <em>Variable Ref</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.cypher.CypherPackage#getVariableRef()
 * @model
 * @generated
 */
public interface VariableRef extends Expression
{
  /**
   * Returns the value of the '<em><b>Variable Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Ref</em>' containment reference.
   * @see #setVariableRef(VariableDeclaration)
   * @see org.xtext.example.mydsl.cypher.CypherPackage#getVariableRef_VariableRef()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getVariableRef();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.cypher.VariableRef#getVariableRef <em>Variable Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Ref</em>' containment reference.
   * @see #getVariableRef()
   * @generated
   */
  void setVariableRef(VariableDeclaration value);

} // VariableRef
