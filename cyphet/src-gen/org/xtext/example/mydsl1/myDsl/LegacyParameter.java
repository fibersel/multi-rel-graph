/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl1.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.LegacyParameter#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getLegacyParameter()
 * @model
 * @generated
 */
public interface LegacyParameter extends Properties, Expression
{
  /**
   * Returns the value of the '<em><b>Parameter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' attribute.
   * @see #setParameter(String)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getLegacyParameter_Parameter()
   * @model
   * @generated
   */
  String getParameter();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.LegacyParameter#getParameter <em>Parameter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' attribute.
   * @see #getParameter()
   * @generated
   */
  void setParameter(String value);

} // LegacyParameter
