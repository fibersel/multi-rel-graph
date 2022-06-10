/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.s2c.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bulk Import Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.s2c.cypher.BulkImportQuery#getPeriodicCommitHint <em>Periodic Commit Hint</em>}</li>
 *   <li>{@link org.xtext.example.s2c.cypher.BulkImportQuery#getLoadCSVQuery <em>Load CSV Query</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.s2c.cypher.CypherPackage#getBulkImportQuery()
 * @model
 * @generated
 */
public interface BulkImportQuery extends Query
{
  /**
   * Returns the value of the '<em><b>Periodic Commit Hint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Periodic Commit Hint</em>' containment reference.
   * @see #setPeriodicCommitHint(PeriodicCommitHint)
   * @see org.xtext.example.s2c.cypher.CypherPackage#getBulkImportQuery_PeriodicCommitHint()
   * @model containment="true"
   * @generated
   */
  PeriodicCommitHint getPeriodicCommitHint();

  /**
   * Sets the value of the '{@link org.xtext.example.s2c.cypher.BulkImportQuery#getPeriodicCommitHint <em>Periodic Commit Hint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Periodic Commit Hint</em>' containment reference.
   * @see #getPeriodicCommitHint()
   * @generated
   */
  void setPeriodicCommitHint(PeriodicCommitHint value);

  /**
   * Returns the value of the '<em><b>Load CSV Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Load CSV Query</em>' containment reference.
   * @see #setLoadCSVQuery(LoadCSVQuery)
   * @see org.xtext.example.s2c.cypher.CypherPackage#getBulkImportQuery_LoadCSVQuery()
   * @model containment="true"
   * @generated
   */
  LoadCSVQuery getLoadCSVQuery();

  /**
   * Sets the value of the '{@link org.xtext.example.s2c.cypher.BulkImportQuery#getLoadCSVQuery <em>Load CSV Query</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Load CSV Query</em>' containment reference.
   * @see #getLoadCSVQuery()
   * @generated
   */
  void setLoadCSVQuery(LoadCSVQuery value);

} // BulkImportQuery
