/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.cypher;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cypher.Skip#getSkip <em>Skip</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.cypher.CypherPackage#getSkip()
 * @model
 * @generated
 */
public interface Skip extends EObject
{
  /**
   * Returns the value of the '<em><b>Skip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Skip</em>' containment reference.
   * @see #setSkip(Expression)
   * @see org.xtext.example.mydsl.cypher.CypherPackage#getSkip_Skip()
   * @model containment="true"
   * @generated
   */
  Expression getSkip();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.cypher.Skip#getSkip <em>Skip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Skip</em>' containment reference.
   * @see #getSkip()
   * @generated
   */
  void setSkip(Expression value);

} // Skip
