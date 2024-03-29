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
import org.xtext.example.mydsl.cypher.IdLookup;
import org.xtext.example.mydsl.cypher.LiteralIds;
import org.xtext.example.mydsl.cypher.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Id Lookup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.cypher.impl.IdLookupImpl#getIds <em>Ids</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cypher.impl.IdLookupImpl#getLegacyParameter <em>Legacy Parameter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.cypher.impl.IdLookupImpl#getWildcard <em>Wildcard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdLookupImpl extends NodeLookupImpl implements IdLookup
{
  /**
   * The cached value of the '{@link #getIds() <em>Ids</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIds()
   * @generated
   * @ordered
   */
  protected LiteralIds ids;

  /**
   * The cached value of the '{@link #getLegacyParameter() <em>Legacy Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLegacyParameter()
   * @generated
   * @ordered
   */
  protected Parameter legacyParameter;

  /**
   * The default value of the '{@link #getWildcard() <em>Wildcard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWildcard()
   * @generated
   * @ordered
   */
  protected static final String WILDCARD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWildcard() <em>Wildcard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWildcard()
   * @generated
   * @ordered
   */
  protected String wildcard = WILDCARD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IdLookupImpl()
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
    return CypherPackage.Literals.ID_LOOKUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LiteralIds getIds()
  {
    return ids;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIds(LiteralIds newIds, NotificationChain msgs)
  {
    LiteralIds oldIds = ids;
    ids = newIds;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CypherPackage.ID_LOOKUP__IDS, oldIds, newIds);
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
  public void setIds(LiteralIds newIds)
  {
    if (newIds != ids)
    {
      NotificationChain msgs = null;
      if (ids != null)
        msgs = ((InternalEObject)ids).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CypherPackage.ID_LOOKUP__IDS, null, msgs);
      if (newIds != null)
        msgs = ((InternalEObject)newIds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CypherPackage.ID_LOOKUP__IDS, null, msgs);
      msgs = basicSetIds(newIds, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CypherPackage.ID_LOOKUP__IDS, newIds, newIds));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter getLegacyParameter()
  {
    return legacyParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLegacyParameter(Parameter newLegacyParameter, NotificationChain msgs)
  {
    Parameter oldLegacyParameter = legacyParameter;
    legacyParameter = newLegacyParameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CypherPackage.ID_LOOKUP__LEGACY_PARAMETER, oldLegacyParameter, newLegacyParameter);
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
  public void setLegacyParameter(Parameter newLegacyParameter)
  {
    if (newLegacyParameter != legacyParameter)
    {
      NotificationChain msgs = null;
      if (legacyParameter != null)
        msgs = ((InternalEObject)legacyParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CypherPackage.ID_LOOKUP__LEGACY_PARAMETER, null, msgs);
      if (newLegacyParameter != null)
        msgs = ((InternalEObject)newLegacyParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CypherPackage.ID_LOOKUP__LEGACY_PARAMETER, null, msgs);
      msgs = basicSetLegacyParameter(newLegacyParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CypherPackage.ID_LOOKUP__LEGACY_PARAMETER, newLegacyParameter, newLegacyParameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getWildcard()
  {
    return wildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWildcard(String newWildcard)
  {
    String oldWildcard = wildcard;
    wildcard = newWildcard;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CypherPackage.ID_LOOKUP__WILDCARD, oldWildcard, wildcard));
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
      case CypherPackage.ID_LOOKUP__IDS:
        return basicSetIds(null, msgs);
      case CypherPackage.ID_LOOKUP__LEGACY_PARAMETER:
        return basicSetLegacyParameter(null, msgs);
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
      case CypherPackage.ID_LOOKUP__IDS:
        return getIds();
      case CypherPackage.ID_LOOKUP__LEGACY_PARAMETER:
        return getLegacyParameter();
      case CypherPackage.ID_LOOKUP__WILDCARD:
        return getWildcard();
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
      case CypherPackage.ID_LOOKUP__IDS:
        setIds((LiteralIds)newValue);
        return;
      case CypherPackage.ID_LOOKUP__LEGACY_PARAMETER:
        setLegacyParameter((Parameter)newValue);
        return;
      case CypherPackage.ID_LOOKUP__WILDCARD:
        setWildcard((String)newValue);
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
      case CypherPackage.ID_LOOKUP__IDS:
        setIds((LiteralIds)null);
        return;
      case CypherPackage.ID_LOOKUP__LEGACY_PARAMETER:
        setLegacyParameter((Parameter)null);
        return;
      case CypherPackage.ID_LOOKUP__WILDCARD:
        setWildcard(WILDCARD_EDEFAULT);
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
      case CypherPackage.ID_LOOKUP__IDS:
        return ids != null;
      case CypherPackage.ID_LOOKUP__LEGACY_PARAMETER:
        return legacyParameter != null;
      case CypherPackage.ID_LOOKUP__WILDCARD:
        return WILDCARD_EDEFAULT == null ? wildcard != null : !WILDCARD_EDEFAULT.equals(wildcard);
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
    result.append(" (wildcard: ");
    result.append(wildcard);
    result.append(')');
    return result.toString();
  }

} //IdLookupImpl
