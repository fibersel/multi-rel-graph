/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl1.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.All#getFilterExpression <em>Filter Expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getAll()
 * @model
 * @generated
 */
public interface All extends Expression
{
  /**
   * Returns the value of the '<em><b>Filter Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter Expression</em>' containment reference.
   * @see #setFilterExpression(FilterExpression)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getAll_FilterExpression()
   * @model containment="true"
   * @generated
   */
  FilterExpression getFilterExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.All#getFilterExpression <em>Filter Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter Expression</em>' containment reference.
   * @see #getFilterExpression()
   * @generated
   */
  void setFilterExpression(FilterExpression value);

} // All
