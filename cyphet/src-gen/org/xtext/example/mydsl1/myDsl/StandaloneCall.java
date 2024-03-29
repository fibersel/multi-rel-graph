/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standalone Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.StandaloneCall#getInvocation <em>Invocation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.StandaloneCall#getYieldItems <em>Yield Items</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getStandaloneCall()
 * @model
 * @generated
 */
public interface StandaloneCall extends Query
{
  /**
   * Returns the value of the '<em><b>Invocation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invocation</em>' containment reference.
   * @see #setInvocation(EObject)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getStandaloneCall_Invocation()
   * @model containment="true"
   * @generated
   */
  EObject getInvocation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.StandaloneCall#getInvocation <em>Invocation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Invocation</em>' containment reference.
   * @see #getInvocation()
   * @generated
   */
  void setInvocation(EObject value);

  /**
   * Returns the value of the '<em><b>Yield Items</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Yield Items</em>' containment reference.
   * @see #setYieldItems(YieldItems)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getStandaloneCall_YieldItems()
   * @model containment="true"
   * @generated
   */
  YieldItems getYieldItems();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.StandaloneCall#getYieldItems <em>Yield Items</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Yield Items</em>' containment reference.
   * @see #getYieldItems()
   * @generated
   */
  void setYieldItems(YieldItems value);

} // StandaloneCall
