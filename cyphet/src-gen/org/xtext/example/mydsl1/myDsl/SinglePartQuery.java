/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Part Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.SinglePartQuery#getReadingClauses <em>Reading Clauses</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.SinglePartQuery#getReturn <em>Return</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.SinglePartQuery#getUpdatingClauses <em>Updating Clauses</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getSinglePartQuery()
 * @model
 * @generated
 */
public interface SinglePartQuery extends SingleQuery
{
  /**
   * Returns the value of the '<em><b>Reading Clauses</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.ReadingClause}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reading Clauses</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getSinglePartQuery_ReadingClauses()
   * @model containment="true"
   * @generated
   */
  EList<ReadingClause> getReadingClauses();

  /**
   * Returns the value of the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return</em>' containment reference.
   * @see #setReturn(Return)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getSinglePartQuery_Return()
   * @model containment="true"
   * @generated
   */
  Return getReturn();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.SinglePartQuery#getReturn <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return</em>' containment reference.
   * @see #getReturn()
   * @generated
   */
  void setReturn(Return value);

  /**
   * Returns the value of the '<em><b>Updating Clauses</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.UpdatingClause}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Updating Clauses</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getSinglePartQuery_UpdatingClauses()
   * @model containment="true"
   * @generated
   */
  EList<UpdatingClause> getUpdatingClauses();

} // SinglePartQuery
