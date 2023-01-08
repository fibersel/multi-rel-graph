/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.cypher.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.cypher.CypherPackage;
import org.xtext.example.mydsl.cypher.Expression;
import org.xtext.example.mydsl.cypher.LoadCSV;
import org.xtext.example.mydsl.cypher.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load CSV</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cypher.impl.LoadCSVImpl#isWithHeaders <em>With Headers</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cypher.impl.LoadCSVImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cypher.impl.LoadCSVImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cypher.impl.LoadCSVImpl#getFieldterminator <em>Fieldterminator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadCSVImpl extends ReadingClauseImpl implements LoadCSV
{
  /**
   * The default value of the '{@link #isWithHeaders() <em>With Headers</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWithHeaders()
   * @generated
   * @ordered
   */
  protected static final boolean WITH_HEADERS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWithHeaders() <em>With Headers</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWithHeaders()
   * @generated
   * @ordered
   */
  protected boolean withHeaders = WITH_HEADERS_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected VariableDeclaration variable;

  /**
   * The default value of the '{@link #getFieldterminator() <em>Fieldterminator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldterminator()
   * @generated
   * @ordered
   */
  protected static final String FIELDTERMINATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFieldterminator() <em>Fieldterminator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldterminator()
   * @generated
   * @ordered
   */
  protected String fieldterminator = FIELDTERMINATOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LoadCSVImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CypherPackage.Literals.LOAD_CSV;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isWithHeaders()
  {
    return withHeaders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWithHeaders(boolean newWithHeaders)
  {
    boolean oldWithHeaders = withHeaders;
    withHeaders = newWithHeaders;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CypherPackage.LOAD_CSV__WITH_HEADERS, oldWithHeaders, withHeaders));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CypherPackage.LOAD_CSV__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CypherPackage.LOAD_CSV__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CypherPackage.LOAD_CSV__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CypherPackage.LOAD_CSV__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableDeclaration getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(VariableDeclaration newVariable, NotificationChain msgs)
  {
    VariableDeclaration oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CypherPackage.LOAD_CSV__VARIABLE, oldVariable, newVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVariable(VariableDeclaration newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CypherPackage.LOAD_CSV__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CypherPackage.LOAD_CSV__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CypherPackage.LOAD_CSV__VARIABLE, newVariable, newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFieldterminator()
  {
    return fieldterminator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFieldterminator(String newFieldterminator)
  {
    String oldFieldterminator = fieldterminator;
    fieldterminator = newFieldterminator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CypherPackage.LOAD_CSV__FIELDTERMINATOR, oldFieldterminator, fieldterminator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CypherPackage.LOAD_CSV__EXPRESSION:
        return basicSetExpression(null, msgs);
      case CypherPackage.LOAD_CSV__VARIABLE:
        return basicSetVariable(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CypherPackage.LOAD_CSV__WITH_HEADERS:
        return isWithHeaders();
      case CypherPackage.LOAD_CSV__EXPRESSION:
        return getExpression();
      case CypherPackage.LOAD_CSV__VARIABLE:
        return getVariable();
      case CypherPackage.LOAD_CSV__FIELDTERMINATOR:
        return getFieldterminator();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CypherPackage.LOAD_CSV__WITH_HEADERS:
        setWithHeaders((Boolean)newValue);
        return;
      case CypherPackage.LOAD_CSV__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case CypherPackage.LOAD_CSV__VARIABLE:
        setVariable((VariableDeclaration)newValue);
        return;
      case CypherPackage.LOAD_CSV__FIELDTERMINATOR:
        setFieldterminator((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CypherPackage.LOAD_CSV__WITH_HEADERS:
        setWithHeaders(WITH_HEADERS_EDEFAULT);
        return;
      case CypherPackage.LOAD_CSV__EXPRESSION:
        setExpression((Expression)null);
        return;
      case CypherPackage.LOAD_CSV__VARIABLE:
        setVariable((VariableDeclaration)null);
        return;
      case CypherPackage.LOAD_CSV__FIELDTERMINATOR:
        setFieldterminator(FIELDTERMINATOR_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CypherPackage.LOAD_CSV__WITH_HEADERS:
        return withHeaders != WITH_HEADERS_EDEFAULT;
      case CypherPackage.LOAD_CSV__EXPRESSION:
        return expression != null;
      case CypherPackage.LOAD_CSV__VARIABLE:
        return variable != null;
      case CypherPackage.LOAD_CSV__FIELDTERMINATOR:
        return FIELDTERMINATOR_EDEFAULT == null ? fieldterminator != null : !FIELDTERMINATOR_EDEFAULT.equals(fieldterminator);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (withHeaders: ");
    result.append(withHeaders);
    result.append(", fieldterminator: ");
    result.append(fieldterminator);
    result.append(')');
    return result.toString();
  }

} //LoadCSVImpl
