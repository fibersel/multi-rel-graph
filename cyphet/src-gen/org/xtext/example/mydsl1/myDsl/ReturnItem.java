/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.ReturnItem#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.ReturnItem#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getReturnItem()
 * @model
 * @generated
 */
public interface ReturnItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getReturnItem_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.ReturnItem#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Alias</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' containment reference.
   * @see #setAlias(VariableDeclaration)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getReturnItem_Alias()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getAlias();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.ReturnItem#getAlias <em>Alias</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' containment reference.
   * @see #getAlias()
   * @generated
   */
  void setAlias(VariableDeclaration value);

} // ReturnItem
