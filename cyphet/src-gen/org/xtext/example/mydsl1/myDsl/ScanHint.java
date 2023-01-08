/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl1.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scan Hint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.ScanHint#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.ScanHint#getNodeLabel <em>Node Label</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getScanHint()
 * @model
 * @generated
 */
public interface ScanHint extends Hint
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(VariableDeclaration)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getScanHint_Variable()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.ScanHint#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Node Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Label</em>' containment reference.
   * @see #setNodeLabel(NodeLabel)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getScanHint_NodeLabel()
   * @model containment="true"
   * @generated
   */
  NodeLabel getNodeLabel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.ScanHint#getNodeLabel <em>Node Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Label</em>' containment reference.
   * @see #getNodeLabel()
   * @generated
   */
  void setNodeLabel(NodeLabel value);

} // ScanHint