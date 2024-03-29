/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl1.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.CreateIndex#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getCreateIndex()
 * @model
 * @generated
 */
public interface CreateIndex extends Command
{
  /**
   * Returns the value of the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' containment reference.
   * @see #setIndex(Index)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getCreateIndex_Index()
   * @model containment="true"
   * @generated
   */
  Index getIndex();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.CreateIndex#getIndex <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' containment reference.
   * @see #getIndex()
   * @generated
   */
  void setIndex(Index value);

} // CreateIndex
