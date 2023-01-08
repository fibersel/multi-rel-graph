/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.sql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.sql.Query#getSelectClause <em>Select Clause</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.sql.Query#getFromClause <em>From Clause</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.sql.Query#getWhereClause <em>Where Clause</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.sql.Query#getGroupClause <em>Group Clause</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.sql.Query#getHavingClause <em>Having Clause</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.sql.SqlPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends EObject
{
  /**
   * Returns the value of the '<em><b>Select Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select Clause</em>' containment reference.
   * @see #setSelectClause(SelectSection)
   * @see org.xtext.example.mydsl.sql.SqlPackage#getQuery_SelectClause()
   * @model containment="true"
   * @generated
   */
  SelectSection getSelectClause();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.sql.Query#getSelectClause <em>Select Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select Clause</em>' containment reference.
   * @see #getSelectClause()
   * @generated
   */
  void setSelectClause(SelectSection value);

  /**
   * Returns the value of the '<em><b>From Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Clause</em>' containment reference.
   * @see #setFromClause(fromSection)
   * @see org.xtext.example.mydsl.sql.SqlPackage#getQuery_FromClause()
   * @model containment="true"
   * @generated
   */
  fromSection getFromClause();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.sql.Query#getFromClause <em>From Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Clause</em>' containment reference.
   * @see #getFromClause()
   * @generated
   */
  void setFromClause(fromSection value);

  /**
   * Returns the value of the '<em><b>Where Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where Clause</em>' containment reference.
   * @see #setWhereClause(WhereClause)
   * @see org.xtext.example.mydsl.sql.SqlPackage#getQuery_WhereClause()
   * @model containment="true"
   * @generated
   */
  WhereClause getWhereClause();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.sql.Query#getWhereClause <em>Where Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where Clause</em>' containment reference.
   * @see #getWhereClause()
   * @generated
   */
  void setWhereClause(WhereClause value);

  /**
   * Returns the value of the '<em><b>Group Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group Clause</em>' containment reference.
   * @see #setGroupClause(GroupClause)
   * @see org.xtext.example.mydsl.sql.SqlPackage#getQuery_GroupClause()
   * @model containment="true"
   * @generated
   */
  GroupClause getGroupClause();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.sql.Query#getGroupClause <em>Group Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group Clause</em>' containment reference.
   * @see #getGroupClause()
   * @generated
   */
  void setGroupClause(GroupClause value);

  /**
   * Returns the value of the '<em><b>Having Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Having Clause</em>' containment reference.
   * @see #setHavingClause(HavingClause)
   * @see org.xtext.example.mydsl.sql.SqlPackage#getQuery_HavingClause()
   * @model containment="true"
   * @generated
   */
  HavingClause getHavingClause();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.sql.Query#getHavingClause <em>Having Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Having Clause</em>' containment reference.
   * @see #getHavingClause()
   * @generated
   */
  void setHavingClause(HavingClause value);

} // Query
