/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl1.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl1.myDsl.Merge;
import org.xtext.example.mydsl1.myDsl.MergeAction;
import org.xtext.example.mydsl1.myDsl.MyDslPackage;
import org.xtext.example.mydsl1.myDsl.PatternPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.MergeImpl#getPatternPart <em>Pattern Part</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.MergeImpl#getMergeActions <em>Merge Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MergeImpl extends UpdatingClauseImpl implements Merge
{
  /**
   * The cached value of the '{@link #getPatternPart() <em>Pattern Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatternPart()
   * @generated
   * @ordered
   */
  protected PatternPart patternPart;

  /**
   * The cached value of the '{@link #getMergeActions() <em>Merge Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMergeActions()
   * @generated
   * @ordered
   */
  protected EList<MergeAction> mergeActions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MergeImpl()
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
    return MyDslPackage.Literals.MERGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PatternPart getPatternPart()
  {
    return patternPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPatternPart(PatternPart newPatternPart, NotificationChain msgs)
  {
    PatternPart oldPatternPart = patternPart;
    patternPart = newPatternPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.MERGE__PATTERN_PART, oldPatternPart, newPatternPart);
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
  public void setPatternPart(PatternPart newPatternPart)
  {
    if (newPatternPart != patternPart)
    {
      NotificationChain msgs = null;
      if (patternPart != null)
        msgs = ((InternalEObject)patternPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MERGE__PATTERN_PART, null, msgs);
      if (newPatternPart != null)
        msgs = ((InternalEObject)newPatternPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MERGE__PATTERN_PART, null, msgs);
      msgs = basicSetPatternPart(newPatternPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MERGE__PATTERN_PART, newPatternPart, newPatternPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MergeAction> getMergeActions()
  {
    if (mergeActions == null)
    {
      mergeActions = new EObjectContainmentEList<MergeAction>(MergeAction.class, this, MyDslPackage.MERGE__MERGE_ACTIONS);
    }
    return mergeActions;
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
      case MyDslPackage.MERGE__PATTERN_PART:
        return basicSetPatternPart(null, msgs);
      case MyDslPackage.MERGE__MERGE_ACTIONS:
        return ((InternalEList<?>)getMergeActions()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.MERGE__PATTERN_PART:
        return getPatternPart();
      case MyDslPackage.MERGE__MERGE_ACTIONS:
        return getMergeActions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.MERGE__PATTERN_PART:
        setPatternPart((PatternPart)newValue);
        return;
      case MyDslPackage.MERGE__MERGE_ACTIONS:
        getMergeActions().clear();
        getMergeActions().addAll((Collection<? extends MergeAction>)newValue);
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
      case MyDslPackage.MERGE__PATTERN_PART:
        setPatternPart((PatternPart)null);
        return;
      case MyDslPackage.MERGE__MERGE_ACTIONS:
        getMergeActions().clear();
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
      case MyDslPackage.MERGE__PATTERN_PART:
        return patternPart != null;
      case MyDslPackage.MERGE__MERGE_ACTIONS:
        return mergeActions != null && !mergeActions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MergeImpl