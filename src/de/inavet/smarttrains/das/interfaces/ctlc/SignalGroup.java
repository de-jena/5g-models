/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Placeholder for identification of signal groups. Exact identifcation attribute follows when more complete RailML files are available.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.SignalGroup#getSignalGroupId <em>Signal Group Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignalGroup extends MinimalEObjectImpl.Container {
	/**
	 * The default value of the '{@link #getSignalGroupId() <em>Signal Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNAL_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignalGroupId() <em>Signal Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalGroupId()
	 * @generated
	 * @ordered
	 */
	protected String signalGroupId = SIGNAL_GROUP_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalGroup() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtlcPackage.Literals.SIGNAL_GROUP;
	}

	/**
	 * Returns the value of the '<em><b>Signal Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Group Id</em>' attribute.
	 * @see #setSignalGroupId(String)
	 * @generated
	 */
	public String getSignalGroupId() {
		return signalGroupId;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.SignalGroup#getSignalGroupId <em>Signal Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSignalGroupId the new value of the '<em>Signal Group Id</em>' attribute.
	 * @see #getSignalGroupId()
	 * @generated
	 */
	public void setSignalGroupId(String newSignalGroupId) {
		signalGroupId = newSignalGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CtlcPackage.SIGNAL_GROUP__SIGNAL_GROUP_ID:
				return getSignalGroupId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CtlcPackage.SIGNAL_GROUP__SIGNAL_GROUP_ID:
				setSignalGroupId((String)newValue);
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
			case CtlcPackage.SIGNAL_GROUP__SIGNAL_GROUP_ID:
				setSignalGroupId(SIGNAL_GROUP_ID_EDEFAULT);
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
			case CtlcPackage.SIGNAL_GROUP__SIGNAL_GROUP_ID:
				return SIGNAL_GROUP_ID_EDEFAULT == null ? signalGroupId != null : !SIGNAL_GROUP_ID_EDEFAULT.equals(signalGroupId);
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
		result.append(" (signalGroupId: ");
		result.append(signalGroupId);
		result.append(')');
		return result.toString();
	}

} // SignalGroup
