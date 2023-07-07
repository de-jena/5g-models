/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

import java.time.ZonedDateTime;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodic Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * State updates for the prognosis algorithm, which are sent periodically (every 1 sec).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate#getUpdates <em>Updates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodicUpdate extends MinimalEObjectImpl.Container {
	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final ZonedDateTime TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected ZonedDateTime timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpdates() <em>Updates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdates()
	 * @generated
	 * @ordered
	 */
	protected EList<UpdateForVehicle> updates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicUpdate() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtlcPackage.Literals.PERIODIC_UPDATE;
	}

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(ZonedDateTime)
	 * @generated
	 */
	public ZonedDateTime getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTimestamp the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	public void setTimestamp(ZonedDateTime newTimestamp) {
		timestamp = newTimestamp;
	}

	/**
	 * Returns the value of the '<em><b>Updates</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updates</em>' reference list.
	 * @generated
	 */
	public EList<UpdateForVehicle> getUpdates() {
		if (updates == null) {
			updates = new BasicInternalEList<UpdateForVehicle>(UpdateForVehicle.class);
		}
		return updates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CtlcPackage.PERIODIC_UPDATE__TIMESTAMP:
				return getTimestamp();
			case CtlcPackage.PERIODIC_UPDATE__UPDATES:
				return getUpdates();
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
			case CtlcPackage.PERIODIC_UPDATE__TIMESTAMP:
				setTimestamp((ZonedDateTime)newValue);
				return;
			case CtlcPackage.PERIODIC_UPDATE__UPDATES:
				getUpdates().clear();
				getUpdates().addAll((Collection<? extends UpdateForVehicle>)newValue);
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
			case CtlcPackage.PERIODIC_UPDATE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case CtlcPackage.PERIODIC_UPDATE__UPDATES:
				getUpdates().clear();
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
			case CtlcPackage.PERIODIC_UPDATE__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case CtlcPackage.PERIODIC_UPDATE__UPDATES:
				return updates != null && !updates.isEmpty();
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
		result.append(" (timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} // PeriodicUpdate
