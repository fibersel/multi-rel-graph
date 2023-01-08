/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explicit Procedure Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.ExplicitProcedureInvocation#getProcedureName <em>Procedure Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.ExplicitProcedureInvocation#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getExplicitProcedureInvocation()
 * @model
 * @generated
 */
public interface ExplicitProcedureInvocation extends EObject
{
  /**
   * Returns the value of the '<em><b>Procedure Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedure Name</em>' containment reference.
   * @see #setProcedureName(ProcedureName)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getExplicitProcedureInvocation_ProcedureName()
   * @model containment="true"
   * @generated
   */
  ProcedureName getProcedureName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.ExplicitProcedureInvocation#getProcedureName <em>Procedure Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Procedure Name</em>' containment reference.
   * @see #getProcedureName()
   * @generated
   */
  void setProcedureName(ProcedureName value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getExplicitProcedureInvocation_Parameter()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getParameter();

} // ExplicitProcedureInvocation
