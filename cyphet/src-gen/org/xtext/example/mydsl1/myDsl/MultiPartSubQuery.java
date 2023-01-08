/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Part Sub Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.MultiPartSubQuery#getReadingClauses <em>Reading Clauses</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.MultiPartSubQuery#getUpdatingClauses <em>Updating Clauses</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.MultiPartSubQuery#getWithPart <em>With Part</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getMultiPartSubQuery()
 * @model
 * @generated
 */
public interface MultiPartSubQuery extends EObject
{
  /**
   * Returns the value of the '<em><b>Reading Clauses</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.ReadingClause}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reading Clauses</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getMultiPartSubQuery_ReadingClauses()
   * @model containment="true"
   * @generated
   */
  EList<ReadingClause> getReadingClauses();

  /**
   * Returns the value of the '<em><b>Updating Clauses</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.UpdatingClause}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Updating Clauses</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getMultiPartSubQuery_UpdatingClauses()
   * @model containment="true"
   * @generated
   */
  EList<UpdatingClause> getUpdatingClauses();

  /**
   * Returns the value of the '<em><b>With Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>With Part</em>' containment reference.
   * @see #setWithPart(With)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getMultiPartSubQuery_WithPart()
   * @model containment="true"
   * @generated
   */
  With getWithPart();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.MultiPartSubQuery#getWithPart <em>With Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>With Part</em>' containment reference.
   * @see #getWithPart()
   * @generated
   */
  void setWithPart(With value);

} // MultiPartSubQuery
