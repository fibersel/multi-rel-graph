/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.s2c.cypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.s2c.cypher.PatternElement#getNodepattern <em>Nodepattern</em>}</li>
 *   <li>{@link org.xtext.example.s2c.cypher.PatternElement#getChain <em>Chain</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.s2c.cypher.CypherPackage#getPatternElement()
 * @model
 * @generated
 */
public interface PatternElement extends AnonymousPatternPart
{
  /**
   * Returns the value of the '<em><b>Nodepattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodepattern</em>' containment reference.
   * @see #setNodepattern(NodePattern)
   * @see org.xtext.example.s2c.cypher.CypherPackage#getPatternElement_Nodepattern()
   * @model containment="true"
   * @generated
   */
  NodePattern getNodepattern();

  /**
   * Sets the value of the '{@link org.xtext.example.s2c.cypher.PatternElement#getNodepattern <em>Nodepattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nodepattern</em>' containment reference.
   * @see #getNodepattern()
   * @generated
   */
  void setNodepattern(NodePattern value);

  /**
   * Returns the value of the '<em><b>Chain</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.s2c.cypher.PatternElementChain}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chain</em>' containment reference list.
   * @see org.xtext.example.s2c.cypher.CypherPackage#getPatternElement_Chain()
   * @model containment="true"
   * @generated
   */
  EList<PatternElementChain> getChain();

} // PatternElement
