/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl1.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Item Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.RemoveItemLabel#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getRemoveItemLabel()
 * @model
 * @generated
 */
public interface RemoveItemLabel extends RemoveItem
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(VariableDeclaration)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getRemoveItemLabel_Variable()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.RemoveItemLabel#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDeclaration value);

} // RemoveItemLabel
