/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Unique Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cypher.DropUniqueConstraint#getUniqueConstraint <em>Unique Constraint</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.cypher.CypherPackage#getDropUniqueConstraint()
 * @model
 * @generated
 */
public interface DropUniqueConstraint extends Command
{
  /**
   * Returns the value of the '<em><b>Unique Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unique Constraint</em>' containment reference.
   * @see #setUniqueConstraint(UniqueConstraint)
   * @see org.xtext.example.mydsl.cypher.CypherPackage#getDropUniqueConstraint_UniqueConstraint()
   * @model containment="true"
   * @generated
   */
  UniqueConstraint getUniqueConstraint();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.cypher.DropUniqueConstraint#getUniqueConstraint <em>Unique Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unique Constraint</em>' containment reference.
   * @see #getUniqueConstraint()
   * @generated
   */
  void setUniqueConstraint(UniqueConstraint value);

} // DropUniqueConstraint
