/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cypher.Create#isUniqueContraint <em>Unique Contraint</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cypher.Create#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.cypher.CypherPackage#getCreate()
 * @model
 * @generated
 */
public interface Create extends UpdatingClause
{
  /**
   * Returns the value of the '<em><b>Unique Contraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unique Contraint</em>' attribute.
   * @see #setUniqueContraint(boolean)
   * @see org.xtext.example.mydsl.cypher.CypherPackage#getCreate_UniqueContraint()
   * @model
   * @generated
   */
  boolean isUniqueContraint();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.cypher.Create#isUniqueContraint <em>Unique Contraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unique Contraint</em>' attribute.
   * @see #isUniqueContraint()
   * @generated
   */
  void setUniqueContraint(boolean value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' containment reference.
   * @see #setPattern(Pattern)
   * @see org.xtext.example.mydsl.cypher.CypherPackage#getCreate_Pattern()
   * @model containment="true"
   * @generated
   */
  Pattern getPattern();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.cypher.Create#getPattern <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' containment reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(Pattern value);

} // Create
