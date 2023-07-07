/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release Time Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector#getValues <em>Values</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector#getSignalGroup <em>Signal Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReleaseTimeVector extends MinimalEObjectImpl.Container {
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
	 * The cached value of the '{@link #getSignalGroup() <em>Signal Group</em>}' reference.
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
	protected ReleaseTimeVector() {
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
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @generated
	 */
	public EList<Double> getValues() {
		if (values == null) {
			values = new BasicInternalEList<Double>(double.class);
		}
		return values;
	}

	/**
	 * Returns the value of the '<em><b>Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Group</em>' reference.
	 * @see #setSignalGroup(SignalGroup)
	 * @generated
	 */
	public SignalGroup getSignalGroup() {
		if (signalGroup != null && ((EObject)signalGroup).eIsProxy()) {
			InternalEObject oldSignalGroup = signalGroup;
			signalGroup = (SignalGroup)eResolveProxy(oldSignalGroup);
			if (signalGroup != oldSignalGroup) {
			}
		}
		return signalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalGroup basicGetSignalGroup() {
		return signalGroup;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector#getSignalGroup <em>Signal Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSignalGroup the new value of the '<em>Signal Group</em>' reference.
	 * @see #getSignalGroup()
	 * @generated
	 */
	public void setSignalGroup(SignalGroup newSignalGroup) {
		signalGroup = newSignalGroup;
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
				if (resolve) return getSignalGroup();
				return basicGetSignalGroup();
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

} // ReleaseTimeVector
