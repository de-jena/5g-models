/**
 */
package de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl;

import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage;
import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.VehicleId;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.VehicleIdImpl#getVehicleId <em>Vehicle Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleIdImpl extends MinimalEObjectImpl.Container implements VehicleId {
	/**
	 * The default value of the '{@link #getVehicleId() <em>Vehicle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleId()
	 * @generated
	 * @ordered
	 */
	protected static final String VEHICLE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVehicleId() <em>Vehicle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleId()
	 * @generated
	 * @ordered
	 */
	protected String vehicleId = VEHICLE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleIdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicDataSynchronisationPackage.Literals.VEHICLE_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVehicleId() {
		return vehicleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicleId(String newVehicleId) {
		String oldVehicleId = vehicleId;
		vehicleId = newVehicleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicDataSynchronisationPackage.VEHICLE_ID__VEHICLE_ID, oldVehicleId, vehicleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicDataSynchronisationPackage.VEHICLE_ID__VEHICLE_ID:
				return getVehicleId();
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
			case BasicDataSynchronisationPackage.VEHICLE_ID__VEHICLE_ID:
				setVehicleId((String)newValue);
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
			case BasicDataSynchronisationPackage.VEHICLE_ID__VEHICLE_ID:
				setVehicleId(VEHICLE_ID_EDEFAULT);
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
			case BasicDataSynchronisationPackage.VEHICLE_ID__VEHICLE_ID:
				return VEHICLE_ID_EDEFAULT == null ? vehicleId != null : !VEHICLE_ID_EDEFAULT.equals(vehicleId);
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
		result.append(" (vehicleId: ");
		result.append(vehicleId);
		result.append(')');
		return result.toString();
	}

} //VehicleIdImpl
