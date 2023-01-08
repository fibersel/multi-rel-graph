/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.sql.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.sql.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SqlFactoryImpl extends EFactoryImpl implements SqlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SqlFactory init()
  {
    try
    {
      SqlFactory theSqlFactory = (SqlFactory)EPackage.Registry.INSTANCE.getEFactory(SqlPackage.eNS_URI);
      if (theSqlFactory != null)
      {
        return theSqlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SqlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SqlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SqlPackage.MODEL: return createModel();
      case SqlPackage.QUERY: return createQuery();
      case SqlPackage.SELECT_SECTION: return createSelectSection();
      case SqlPackage.FROM_SECTION: return createfromSection();
      case SqlPackage.FROM_ITEM: return createFromItem();
      case SqlPackage.TABLE: return createTable();
      case SqlPackage.WHERE_CLAUSE: return createWhereClause();
      case SqlPackage.EXPRESSION: return createExpression();
      case SqlPackage.COLUMN: return createColumn();
      case SqlPackage.GROUP_CLAUSE: return createGroupClause();
      case SqlPackage.HAVING_CLAUSE: return createHavingClause();
      case SqlPackage.ATTRIBUTE_LOOKUP: return createAttributeLookup();
      case SqlPackage.FUNCTION_INVOCATION: return createFunctionInvocation();
      case SqlPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case SqlPackage.LITERAL: return createLiteral();
      case SqlPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case SqlPackage.STRING_LITERAL: return createStringLiteral();
      case SqlPackage.NUMBER_LITERAL: return createNumberLiteral();
      case SqlPackage.OR_EXPRESSION: return createOrExpression();
      case SqlPackage.XOR_EXPRESSION: return createXorExpression();
      case SqlPackage.AND_EXPRESSION: return createAndExpression();
      case SqlPackage.NOT_EXPRESSION: return createNotExpression();
      case SqlPackage.COMPARISON_EXPRESSION: return createComparisonExpression();
      case SqlPackage.ADD_OR_SUBTRACT_EXPRESSION: return createAddOrSubtractExpression();
      case SqlPackage.MULTIPLY_DIVIDE_MODULO_EXPRESSION: return createMultiplyDivideModuloExpression();
      case SqlPackage.POWER_OF_EXPRESSION: return createPowerOfExpression();
      case SqlPackage.UNARY_ADD_OR_SUBTRACT_EXPRESSION: return createUnaryAddOrSubtractExpression();
      case SqlPackage.STRING_LIST_NULL_OPERATOR_EXPRESSION: return createStringListNullOperatorExpression();
      case SqlPackage.REG_EXP_MATCHING_EXPRESSION: return createRegExpMatchingExpression();
      case SqlPackage.IN_COLLECTION_EXPRESSION: return createInCollectionExpression();
      case SqlPackage.STARTS_WITH_EXPRESSION: return createStartsWithExpression();
      case SqlPackage.ENDS_WITH_EXPRESSION: return createEndsWithExpression();
      case SqlPackage.CONTAINS_EXPRESSION: return createContainsExpression();
      case SqlPackage.IS_NULL_EXPRESSION: return createIsNullExpression();
      case SqlPackage.IS_NOT_NULL_EXPRESSION: return createIsNotNullExpression();
      case SqlPackage.COUNT: return createCount();
      case SqlPackage.VARIABLE_REF: return createVariableRef();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectSection createSelectSection()
  {
    SelectSectionImpl selectSection = new SelectSectionImpl();
    return selectSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public fromSection createfromSection()
  {
    fromSectionImpl fromSection = new fromSectionImpl();
    return fromSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FromItem createFromItem()
  {
    FromItemImpl fromItem = new FromItemImpl();
    return fromItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Table createTable()
  {
    TableImpl table = new TableImpl();
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WhereClause createWhereClause()
  {
    WhereClauseImpl whereClause = new WhereClauseImpl();
    return whereClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Column createColumn()
  {
    ColumnImpl column = new ColumnImpl();
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GroupClause createGroupClause()
  {
    GroupClauseImpl groupClause = new GroupClauseImpl();
    return groupClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HavingClause createHavingClause()
  {
    HavingClauseImpl havingClause = new HavingClauseImpl();
    return havingClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributeLookup createAttributeLookup()
  {
    AttributeLookupImpl attributeLookup = new AttributeLookupImpl();
    return attributeLookup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionInvocation createFunctionInvocation()
  {
    FunctionInvocationImpl functionInvocation = new FunctionInvocationImpl();
    return functionInvocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OrExpression createOrExpression()
  {
    OrExpressionImpl orExpression = new OrExpressionImpl();
    return orExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public XorExpression createXorExpression()
  {
    XorExpressionImpl xorExpression = new XorExpressionImpl();
    return xorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotExpression createNotExpression()
  {
    NotExpressionImpl notExpression = new NotExpressionImpl();
    return notExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComparisonExpression createComparisonExpression()
  {
    ComparisonExpressionImpl comparisonExpression = new ComparisonExpressionImpl();
    return comparisonExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AddOrSubtractExpression createAddOrSubtractExpression()
  {
    AddOrSubtractExpressionImpl addOrSubtractExpression = new AddOrSubtractExpressionImpl();
    return addOrSubtractExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiplyDivideModuloExpression createMultiplyDivideModuloExpression()
  {
    MultiplyDivideModuloExpressionImpl multiplyDivideModuloExpression = new MultiplyDivideModuloExpressionImpl();
    return multiplyDivideModuloExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PowerOfExpression createPowerOfExpression()
  {
    PowerOfExpressionImpl powerOfExpression = new PowerOfExpressionImpl();
    return powerOfExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryAddOrSubtractExpression createUnaryAddOrSubtractExpression()
  {
    UnaryAddOrSubtractExpressionImpl unaryAddOrSubtractExpression = new UnaryAddOrSubtractExpressionImpl();
    return unaryAddOrSubtractExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringListNullOperatorExpression createStringListNullOperatorExpression()
  {
    StringListNullOperatorExpressionImpl stringListNullOperatorExpression = new StringListNullOperatorExpressionImpl();
    return stringListNullOperatorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RegExpMatchingExpression createRegExpMatchingExpression()
  {
    RegExpMatchingExpressionImpl regExpMatchingExpression = new RegExpMatchingExpressionImpl();
    return regExpMatchingExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InCollectionExpression createInCollectionExpression()
  {
    InCollectionExpressionImpl inCollectionExpression = new InCollectionExpressionImpl();
    return inCollectionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StartsWithExpression createStartsWithExpression()
  {
    StartsWithExpressionImpl startsWithExpression = new StartsWithExpressionImpl();
    return startsWithExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EndsWithExpression createEndsWithExpression()
  {
    EndsWithExpressionImpl endsWithExpression = new EndsWithExpressionImpl();
    return endsWithExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ContainsExpression createContainsExpression()
  {
    ContainsExpressionImpl containsExpression = new ContainsExpressionImpl();
    return containsExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IsNullExpression createIsNullExpression()
  {
    IsNullExpressionImpl isNullExpression = new IsNullExpressionImpl();
    return isNullExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IsNotNullExpression createIsNotNullExpression()
  {
    IsNotNullExpressionImpl isNotNullExpression = new IsNotNullExpressionImpl();
    return isNotNullExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Count createCount()
  {
    CountImpl count = new CountImpl();
    return count;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableRef createVariableRef()
  {
    VariableRefImpl variableRef = new VariableRefImpl();
    return variableRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SqlPackage getSqlPackage()
  {
    return (SqlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SqlPackage getPackage()
  {
    return SqlPackage.eINSTANCE;
  }

} //SqlFactoryImpl
