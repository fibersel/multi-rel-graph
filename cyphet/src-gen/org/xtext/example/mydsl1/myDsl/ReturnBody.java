/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.ReturnBody#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.ReturnBody#getReturnItems <em>Return Items</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.ReturnBody#getOrder <em>Order</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.ReturnBody#getSkip <em>Skip</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.ReturnBody#getLimit <em>Limit</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getReturnBody()
 * @model
 * @generated
 */
public interface ReturnBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Distinct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distinct</em>' attribute.
   * @see #setDistinct(boolean)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getReturnBody_Distinct()
   * @model
   * @generated
   */
  boolean isDistinct();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.ReturnBody#isDistinct <em>Distinct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distinct</em>' attribute.
   * @see #isDistinct()
   * @generated
   */
  void setDistinct(boolean value);

  /**
   * Returns the value of the '<em><b>Return Items</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Items</em>' containment reference.
   * @see #setReturnItems(ReturnItems)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getReturnBody_ReturnItems()
   * @model containment="true"
   * @generated
   */
  ReturnItems getReturnItems();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.ReturnBody#getReturnItems <em>Return Items</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Items</em>' containment reference.
   * @see #getReturnItems()
   * @generated
   */
  void setReturnItems(ReturnItems value);

  /**
   * Returns the value of the '<em><b>Order</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order</em>' containment reference.
   * @see #setOrder(Order)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getReturnBody_Order()
   * @model containment="true"
   * @generated
   */
  Order getOrder();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.ReturnBody#getOrder <em>Order</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Order</em>' containment reference.
   * @see #getOrder()
   * @generated
   */
  void setOrder(Order value);

  /**
   * Returns the value of the '<em><b>Skip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Skip</em>' containment reference.
   * @see #setSkip(Skip)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getReturnBody_Skip()
   * @model containment="true"
   * @generated
   */
  Skip getSkip();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.ReturnBody#getSkip <em>Skip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Skip</em>' containment reference.
   * @see #getSkip()
   * @generated
   */
  void setSkip(Skip value);

  /**
   * Returns the value of the '<em><b>Limit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Limit</em>' containment reference.
   * @see #setLimit(Limit)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getReturnBody_Limit()
   * @model containment="true"
   * @generated
   */
  Limit getLimit();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.ReturnBody#getLimit <em>Limit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Limit</em>' containment reference.
   * @see #getLimit()
   * @generated
   */
  void setLimit(Limit value);

} // ReturnBody
