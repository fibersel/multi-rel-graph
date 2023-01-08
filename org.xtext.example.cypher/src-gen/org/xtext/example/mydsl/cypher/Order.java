/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.cypher;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cypher.Order#getOrderBy <em>Order By</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.cypher.CypherPackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject
{
  /**
   * Returns the value of the '<em><b>Order By</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.cypher.SortItem}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order By</em>' containment reference list.
   * @see org.xtext.example.mydsl.cypher.CypherPackage#getOrder_OrderBy()
   * @model containment="true"
   * @generated
   */
  EList<SortItem> getOrderBy();

} // Order