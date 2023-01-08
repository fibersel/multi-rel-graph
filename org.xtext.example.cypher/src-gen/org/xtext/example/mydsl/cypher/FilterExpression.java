/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.cypher;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cypher.FilterExpression#getIdInColl <em>Id In Coll</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cypher.FilterExpression#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.cypher.CypherPackage#getFilterExpression()
 * @model
 * @generated
 */
public interface FilterExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Id In Coll</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id In Coll</em>' containment reference.
   * @see #setIdInColl(IdInColl)
   * @see org.xtext.example.mydsl.cypher.CypherPackage#getFilterExpression_IdInColl()
   * @model containment="true"
   * @generated
   */
  IdInColl getIdInColl();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.cypher.FilterExpression#getIdInColl <em>Id In Coll</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id In Coll</em>' containment reference.
   * @see #getIdInColl()
   * @generated
   */
  void setIdInColl(IdInColl value);

  /**
   * Returns the value of the '<em><b>Where</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where</em>' containment reference.
   * @see #setWhere(Where)
   * @see org.xtext.example.mydsl.cypher.CypherPackage#getFilterExpression_Where()
   * @model containment="true"
   * @generated
   */
  Where getWhere();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.cypher.FilterExpression#getWhere <em>Where</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where</em>' containment reference.
   * @see #getWhere()
   * @generated
   */
  void setWhere(Where value);

} // FilterExpression