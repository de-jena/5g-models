/**
 */
package de.inavet.smarttrains.das.interfaces.vehicle;

import de.inavet.smarttrains.das.interfaces.utils.VehicleType;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Fahrzeugidentifikationsklasse
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.vehicle.Vehicle#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.vehicle.Vehicle#getVehicleId <em>Vehicle Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.vehicle.Vehicle#getVehicleType <em>Vehicle Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Vehicle extends MinimalEObjectImpl.Container {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getVehicleType() <em>Vehicle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleType()
	 * @generated
	 * @ordered
	 */
	protected static final VehicleType VEHICLE_TYPE_EDEFAULT = VehicleType.TRAM;

	/**
	 * The cached value of the '{@link #getVehicleType() <em>Vehicle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleType()
	 * @generated
	 * @ordered
	 */
	protected VehicleType vehicleType = VEHICLE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VehiclePackage.Literals.VEHICLE;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datenbroker-Id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.vehicle.Vehicle#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(String newId) {
		id = newId;
	}

	/**
	 * Returns the value of the '<em><b>Vehicle Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * reale Fahrzeugnummer bei der JNV (Id-Nr.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Id</em>' attribute.
	 * @see #setVehicleId(String)
	 * @generated
	 */
	public String getVehicleId() {
		return vehicleId;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.vehicle.Vehicle#getVehicleId <em>Vehicle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newVehicleId the new value of the '<em>Vehicle Id</em>' attribute.
	 * @see #getVehicleId()
	 * @generated
	 */
	public void setVehicleId(String newVehicleId) {
		vehicleId = newVehicleId;
	}

	/**
	 * Returns the value of the '<em><b>Vehicle Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.inavet.smarttrains.das.interfaces.utils.VehicleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Type</em>' attribute.
	 * @see de.inavet.smarttrains.das.interfaces.utils.VehicleType
	 * @see #setVehicleType(VehicleType)
	 * @generated
	 */
	public VehicleType getVehicleType() {
		return vehicleType;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.vehicle.Vehicle#getVehicleType <em>Vehicle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newVehicleType the new value of the '<em>Vehicle Type</em>' attribute.
	 * @see de.inavet.smarttrains.das.interfaces.utils.VehicleType
	 * @see #getVehicleType()
	 * @generated
	 */
	public void setVehicleType(VehicleType newVehicleType) {
		vehicleType = newVehicleType == null ? VEHICLE_TYPE_EDEFAULT : newVehicleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VehiclePackage.VEHICLE__ID:
				return getId();
			case VehiclePackage.VEHICLE__VEHICLE_ID:
				return getVehicleId();
			case VehiclePackage.VEHICLE__VEHICLE_TYPE:
				return getVehicleType();
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
			case VehiclePackage.VEHICLE__ID:
				setId((String)newValue);
				return;
			case VehiclePackage.VEHICLE__VEHICLE_ID:
				setVehicleId((String)newValue);
				return;
			case VehiclePackage.VEHICLE__VEHICLE_TYPE:
				setVehicleType((VehicleType)newValue);
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
			case VehiclePackage.VEHICLE__ID:
				setId(ID_EDEFAULT);
				return;
			case VehiclePackage.VEHICLE__VEHICLE_ID:
				setVehicleId(VEHICLE_ID_EDEFAULT);
				return;
			case VehiclePackage.VEHICLE__VEHICLE_TYPE:
				setVehicleType(VEHICLE_TYPE_EDEFAULT);
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
			case VehiclePackage.VEHICLE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case VehiclePackage.VEHICLE__VEHICLE_ID:
				return VEHICLE_ID_EDEFAULT == null ? vehicleId != null : !VEHICLE_ID_EDEFAULT.equals(vehicleId);
			case VehiclePackage.VEHICLE__VEHICLE_TYPE:
				return vehicleType != VEHICLE_TYPE_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", vehicleId: ");
		result.append(vehicleId);
		result.append(", vehicleType: ");
		result.append(vehicleType);
		result.append(')');
		return result.toString();
	}

} // Vehicle
