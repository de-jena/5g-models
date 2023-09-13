/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc.impl;

import de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage;
import de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector;
import de.inavet.smarttrains.das.interfaces.ctlc.SignalGroup;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Release Time Vector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.ReleaseTimeVectorImpl#getValues <em>Values</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.ReleaseTimeVectorImpl#getSignalGroup <em>Signal Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReleaseTimeVectorImpl extends MinimalEObjectImpl.Container implements ReleaseTimeVector {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> values;

	/**
	 * The cached value of the '{@link #getSignalGroup() <em>Signal Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalGroup()
	 * @generated
	 * @ordered
	 */
	protected SignalGroup signalGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReleaseTimeVectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtlcPackage.Literals.RELEASE_TIME_VECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getValues() {
		if (values == null) {
			values = new EDataTypeUniqueEList<Double>(Double.class, this, CtlcPackage.RELEASE_TIME_VECTOR__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalGroup getSignalGroup() {
		return signalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalGroup(SignalGroup newSignalGroup, NotificationChain msgs) {
		SignalGroup oldSignalGroup = signalGroup;
		signalGroup = newSignalGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtlcPackage.RELEASE_TIME_VECTOR__SIGNAL_GROUP, oldSignalGroup, newSignalGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalGroup(SignalGroup newSignalGroup) {
		if (newSignalGroup != signalGroup) {
			NotificationChain msgs = null;
			if (signalGroup != null)
				msgs = ((InternalEObject)signalGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtlcPackage.RELEASE_TIME_VECTOR__SIGNAL_GROUP, null, msgs);
			if (newSignalGroup != null)
				msgs = ((InternalEObject)newSignalGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtlcPackage.RELEASE_TIME_VECTOR__SIGNAL_GROUP, null, msgs);
			msgs = basicSetSignalGroup(newSignalGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtlcPackage.RELEASE_TIME_VECTOR__SIGNAL_GROUP, newSignalGroup, newSignalGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtlcPackage.RELEASE_TIME_VECTOR__SIGNAL_GROUP:
				return basicSetSignalGroup(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CtlcPackage.RELEASE_TIME_VECTOR__VALUES:
				return getValues();
			case CtlcPackage.RELEASE_TIME_VECTOR__SIGNAL_GROUP:
				return getSignalGroup();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CtlcPackage.RELEASE_TIME_VECTOR__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends Double>)newValue);
				return;
			case CtlcPackage.RELEASE_TIME_VECTOR__SIGNAL_GROUP:
				setSignalGroup((SignalGroup)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case CtlcPackage.RELEASE_TIME_VECTOR__VALUES:
				getValues().clear();
				return;
			case CtlcPackage.RELEASE_TIME_VECTOR__SIGNAL_GROUP:
				setSignalGroup((SignalGroup)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CtlcPackage.RELEASE_TIME_VECTOR__VALUES:
				return values != null && !values.isEmpty();
			case CtlcPackage.RELEASE_TIME_VECTOR__SIGNAL_GROUP:
				return signalGroup != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (values: ");
		result.append(values);
		result.append(')');
		return result.toString();
	}

} //ReleaseTimeVectorImpl
