/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.s2c.cypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Id Lookup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.s2c.cypher.IdLookup#getIds <em>Ids</em>}</li>
 *   <li>{@link org.xtext.example.s2c.cypher.IdLookup#getLegacyParameter <em>Legacy Parameter</em>}</li>
 *   <li>{@link org.xtext.example.s2c.cypher.IdLookup#getWildcard <em>Wildcard</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.s2c.cypher.CypherPackage#getIdLookup()
 * @model
 * @generated
 */
public interface IdLookup extends NodeLookup, RelationshipLookup
{
  /**
   * Returns the value of the '<em><b>Ids</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ids</em>' containment reference.
   * @see #setIds(LiteralIds)
   * @see org.xtext.example.s2c.cypher.CypherPackage#getIdLookup_Ids()
   * @model containment="true"
   * @generated
   */
  LiteralIds getIds();

  /**
   * Sets the value of the '{@link org.xtext.example.s2c.cypher.IdLookup#getIds <em>Ids</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ids</em>' containment reference.
   * @see #getIds()
   * @generated
   */
  void setIds(LiteralIds value);

  /**
   * Returns the value of the '<em><b>Legacy Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Legacy Parameter</em>' containment reference.
   * @see #setLegacyParameter(Parameter)
   * @see org.xtext.example.s2c.cypher.CypherPackage#getIdLookup_LegacyParameter()
   * @model containment="true"
   * @generated
   */
  Parameter getLegacyParameter();

  /**
   * Sets the value of the '{@link org.xtext.example.s2c.cypher.IdLookup#getLegacyParameter <em>Legacy Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Legacy Parameter</em>' containment reference.
   * @see #getLegacyParameter()
   * @generated
   */
  void setLegacyParameter(Parameter value);

  /**
   * Returns the value of the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wildcard</em>' attribute.
   * @see #setWildcard(String)
   * @see org.xtext.example.s2c.cypher.CypherPackage#getIdLookup_Wildcard()
   * @model
   * @generated
   */
  String getWildcard();

  /**
   * Sets the value of the '{@link org.xtext.example.s2c.cypher.IdLookup#getWildcard <em>Wildcard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wildcard</em>' attribute.
   * @see #getWildcard()
   * @generated
   */
  void setWildcard(String value);

} // IdLookup