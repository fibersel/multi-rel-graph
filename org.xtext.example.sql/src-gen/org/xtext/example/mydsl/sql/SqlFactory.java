/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.sql;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.sql.SqlPackage
 * @generated
 */
public interface SqlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SqlFactory eINSTANCE = org.xtext.example.mydsl.sql.impl.SqlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query</em>'.
   * @generated
   */
  Query createQuery();

  /**
   * Returns a new object of class '<em>Select Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Section</em>'.
   * @generated
   */
  SelectSection createSelectSection();

  /**
   * Returns a new object of class '<em>from Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>from Section</em>'.
   * @generated
   */
  fromSection createfromSection();

  /**
   * Returns a new object of class '<em>From Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>From Item</em>'.
   * @generated
   */
  FromItem createFromItem();

  /**
   * Returns a new object of class '<em>Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table</em>'.
   * @generated
   */
  Table createTable();

  /**
   * Returns a new object of class '<em>Where Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Where Clause</em>'.
   * @generated
   */
  WhereClause createWhereClause();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column</em>'.
   * @generated
   */
  Column createColumn();

  /**
   * Returns a new object of class '<em>Group Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group Clause</em>'.
   * @generated
   */
  GroupClause createGroupClause();

  /**
   * Returns a new object of class '<em>Having Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Having Clause</em>'.
   * @generated
   */
  HavingClause createHavingClause();

  /**
   * Returns a new object of class '<em>Attribute Lookup</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Lookup</em>'.
   * @generated
   */
  AttributeLookup createAttributeLookup();

  /**
   * Returns a new object of class '<em>Function Invocation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Invocation</em>'.
   * @generated
   */
  FunctionInvocation createFunctionInvocation();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Literal</em>'.
   * @generated
   */
  BooleanLiteral createBooleanLiteral();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Literal</em>'.
   * @generated
   */
  NumberLiteral createNumberLiteral();

  /**
   * Returns a new object of class '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Expression</em>'.
   * @generated
   */
  OrExpression createOrExpression();

  /**
   * Returns a new object of class '<em>Xor Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Xor Expression</em>'.
   * @generated
   */
  XorExpression createXorExpression();

  /**
   * Returns a new object of class '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Expression</em>'.
   * @generated
   */
  AndExpression createAndExpression();

  /**
   * Returns a new object of class '<em>Not Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Expression</em>'.
   * @generated
   */
  NotExpression createNotExpression();

  /**
   * Returns a new object of class '<em>Comparison Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparison Expression</em>'.
   * @generated
   */
  ComparisonExpression createComparisonExpression();

  /**
   * Returns a new object of class '<em>Add Or Subtract Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Or Subtract Expression</em>'.
   * @generated
   */
  AddOrSubtractExpression createAddOrSubtractExpression();

  /**
   * Returns a new object of class '<em>Multiply Divide Modulo Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiply Divide Modulo Expression</em>'.
   * @generated
   */
  MultiplyDivideModuloExpression createMultiplyDivideModuloExpression();

  /**
   * Returns a new object of class '<em>Power Of Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Power Of Expression</em>'.
   * @generated
   */
  PowerOfExpression createPowerOfExpression();

  /**
   * Returns a new object of class '<em>Unary Add Or Subtract Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Add Or Subtract Expression</em>'.
   * @generated
   */
  UnaryAddOrSubtractExpression createUnaryAddOrSubtractExpression();

  /**
   * Returns a new object of class '<em>String List Null Operator Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String List Null Operator Expression</em>'.
   * @generated
   */
  StringListNullOperatorExpression createStringListNullOperatorExpression();

  /**
   * Returns a new object of class '<em>Reg Exp Matching Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reg Exp Matching Expression</em>'.
   * @generated
   */
  RegExpMatchingExpression createRegExpMatchingExpression();

  /**
   * Returns a new object of class '<em>In Collection Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Collection Expression</em>'.
   * @generated
   */
  InCollectionExpression createInCollectionExpression();

  /**
   * Returns a new object of class '<em>Starts With Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Starts With Expression</em>'.
   * @generated
   */
  StartsWithExpression createStartsWithExpression();

  /**
   * Returns a new object of class '<em>Ends With Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ends With Expression</em>'.
   * @generated
   */
  EndsWithExpression createEndsWithExpression();

  /**
   * Returns a new object of class '<em>Contains Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contains Expression</em>'.
   * @generated
   */
  ContainsExpression createContainsExpression();

  /**
   * Returns a new object of class '<em>Is Null Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Is Null Expression</em>'.
   * @generated
   */
  IsNullExpression createIsNullExpression();

  /**
   * Returns a new object of class '<em>Is Not Null Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Is Not Null Expression</em>'.
   * @generated
   */
  IsNotNullExpression createIsNotNullExpression();

  /**
   * Returns a new object of class '<em>Count</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Count</em>'.
   * @generated
   */
  Count createCount();

  /**
   * Returns a new object of class '<em>Variable Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Ref</em>'.
   * @generated
   */
  VariableRef createVariableRef();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SqlPackage getSqlPackage();

} //SqlFactory
