/**
 */
package kLSA_Interface;

import java.time.ZonedDateTime;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

import vehicle.Vehicle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release Time Window For LSA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hauptklasse für Interface kLSA -> FAS
 * Zeitstempel der Datenerzeugung
 * Fahrzeug
 * mögliche Zeitfenster für Fahrzeug
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kLSA_Interface.ReleaseTimeWindowForLSA#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link kLSA_Interface.ReleaseTimeWindowForLSA#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link kLSA_Interface.ReleaseTimeWindowForLSA#getTimeWindows <em>Time Windows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReleaseTimeWindowForLSA extends MinimalEObjectImpl.Container {
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
	 * The cached value of the '{@link #getVehicle() <em>Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicle()
	 * @generated
	 * @ordered
	 */
	protected Vehicle vehicle;

	/**
	 * The cached value of the '{@link #getTimeWindows() <em>Time Windows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeWindows()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeSlotAndPosition> timeWindows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseTimeWindowForLSA() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KLSA_InterfacePackage.Literals.RELEASE_TIME_WINDOW_FOR_LSA;
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
	 * Sets the value of the '{@link kLSA_Interface.ReleaseTimeWindowForLSA#getTimestamp <em>Timestamp</em>}' attribute.
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
	 * Returns the value of the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle</em>' reference.
	 * @see #setVehicle(Vehicle)
	 * @generated
	 */
	public Vehicle getVehicle() {
		if (vehicle != null && ((EObject)vehicle).eIsProxy()) {
			InternalEObject oldVehicle = vehicle;
			vehicle = (Vehicle)eResolveProxy(oldVehicle);
			if (vehicle != oldVehicle) {
			}
		}
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle basicGetVehicle() {
		return vehicle;
	}

	/**
	 * Sets the value of the '{@link kLSA_Interface.ReleaseTimeWindowForLSA#getVehicle <em>Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newVehicle the new value of the '<em>Vehicle</em>' reference.
	 * @see #getVehicle()
	 * @generated
	 */
	public void setVehicle(Vehicle newVehicle) {
		vehicle = newVehicle;
	}

	/**
	 * Returns the value of the '<em><b>Time Windows</b></em>' reference list.
	 * The list contents are of type {@link kLSA_Interface.TimeSlotAndPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Windows</em>' reference list.
	 * @generated
	 */
	public EList<TimeSlotAndPosition> getTimeWindows() {
		if (timeWindows == null) {
			timeWindows = new BasicInternalEList<TimeSlotAndPosition>(TimeSlotAndPosition.class);
		}
		return timeWindows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KLSA_InterfacePackage.RELEASE_TIME_WINDOW_FOR_LSA__TIMESTAMP:
				return getTimestamp();
			case KLSA_InterfacePackage.RELEASE_TIME_WINDOW_FOR_LSA__VEHICLE:
				if (resolve) return getVehicle();
				return basicGetVehicle();
			case KLSA_InterfacePackage.RELEASE_TIME_WINDOW_FOR_LSA__TIME_WINDOWS:
				return getTimeWindows();
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
			case KLSA_InterfacePackage.RELEASE_TIME_WINDOW_FOR_LSA__TIMESTAMP:
				setTimestamp((ZonedDateTime)newValue);
				return;
			case KLSA_InterfacePackage.RELEASE_TIME_WINDOW_FOR_LSA__VEHICLE:
				setVehicle((Vehicle)newValue);
				return;
			case KLSA_InterfacePackage.RELEASE_TIME_WINDOW_FOR_LSA__TIME_WINDOWS:
				getTimeWindows().clear();
				getTimeWindows().addAll((Collection<? extends TimeSlotAndPosition>)newValue);
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
			case KLSA_InterfacePackage.RELEASE_TIME_WINDOW_FOR_LSA__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case KLSA_InterfacePackage.RELEASE_TIME_WINDOW_FOR_LSA__VEHICLE:
				setVehicle((Vehicle)null);
				return;
			case KLSA_InterfacePackage.RELEASE_TIME_WINDOW_FOR_LSA__TIME_WINDOWS:
				getTimeWindows().clear();
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
			case KLSA_InterfacePackage.RELEASE_TIME_WINDOW_FOR_LSA__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case KLSA_InterfacePackage.RELEASE_TIME_WINDOW_FOR_LSA__VEHICLE:
				return vehicle != null;
			case KLSA_InterfacePackage.RELEASE_TIME_WINDOW_FOR_LSA__TIME_WINDOWS:
				return timeWindows != null && !timeWindows.isEmpty();
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

} // ReleaseTimeWindowForLSA
