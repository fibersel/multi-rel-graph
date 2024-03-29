/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.cypher;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cypher.Pattern#getPatterns <em>Patterns</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.cypher.CypherPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends EObject
{
  /**
   * Returns the value of the '<em><b>Patterns</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.cypher.PatternPart}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Patterns</em>' containment reference list.
   * @see org.xtext.example.mydsl.cypher.CypherPackage#getPattern_Patterns()
   * @model containment="true"
   * @generated
   */
  EList<PatternPart> getPatterns();

} // Pattern
