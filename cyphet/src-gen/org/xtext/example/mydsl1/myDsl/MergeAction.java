/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.MergeAction#getAction <em>Action</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.MergeAction#getSet <em>Set</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getMergeAction()
 * @model
 * @generated
 */
public interface MergeAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' attribute.
   * @see #setAction(String)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getMergeAction_Action()
   * @model
   * @generated
   */
  String getAction();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.MergeAction#getAction <em>Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' attribute.
   * @see #getAction()
   * @generated
   */
  void setAction(String value);

  /**
   * Returns the value of the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set</em>' containment reference.
   * @see #setSet(Set)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getMergeAction_Set()
   * @model containment="true"
   * @generated
   */
  Set getSet();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.MergeAction#getSet <em>Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set</em>' containment reference.
   * @see #getSet()
   * @generated
   */
  void setSet(Set value);

} // MergeAction
