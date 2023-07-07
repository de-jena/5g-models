/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import de.inavet.smarttrains.das.interfaces.vehicle.Vehicle;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trajectory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Trajektorienklasse
 * noch ist es unklar, ob diese wirklich Anwendung findet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getSpeedOverPosition <em>Speed Over Position</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getSpeedOverTime <em>Speed Over Time</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getPositionOverTime <em>Position Over Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Trajectory extends MinimalEObjectImpl.Container {
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
	 * The cached value of the '{@link #getVehicle() <em>Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicle()
	 * @generated
	 * @ordered
	 */
	protected Vehicle vehicle;

	/**
	 * The cached value of the '{@link #getSpeedOverPosition() <em>Speed Over Position</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedOverPosition()
	 * @generated
	 * @ordered
	 */
	protected EList<SpeedOverPosition> speedOverPosition;

	/**
	 * The cached value of the '{@link #getSpeedOverTime() <em>Speed Over Time</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedOverTime()
	 * @generated
	 * @ordered
	 */
	protected EList<SpeedOverTime> speedOverTime;

	/**
	 * The cached value of the '{@link #getPositionOverTime() <em>Position Over Time</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionOverTime()
	 * @generated
	 * @ordered
	 */
	protected EList<PositionOverTime> positionOverTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Trajectory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DasexchangePackage.Literals.TRAJECTORY;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getId <em>Id</em>}' attribute.
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
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getVehicle <em>Vehicle</em>}' reference.
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
	 * Returns the value of the '<em><b>Speed Over Position</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Over Position</em>' reference list.
	 * @generated
	 */
	public EList<SpeedOverPosition> getSpeedOverPosition() {
		if (speedOverPosition == null) {
			speedOverPosition = new BasicInternalEList<SpeedOverPosition>(SpeedOverPosition.class);
		}
		return speedOverPosition;
	}

	/**
	 * Returns the value of the '<em><b>Speed Over Time</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Over Time</em>' reference list.
	 * @generated
	 */
	public EList<SpeedOverTime> getSpeedOverTime() {
		if (speedOverTime == null) {
			speedOverTime = new BasicInternalEList<SpeedOverTime>(SpeedOverTime.class);
		}
		return speedOverTime;
	}

	/**
	 * Returns the value of the '<em><b>Position Over Time</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.dasexchange.PositionOverTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Over Time</em>' reference list.
	 * @generated
	 */
	public EList<PositionOverTime> getPositionOverTime() {
		if (positionOverTime == null) {
			positionOverTime = new BasicInternalEList<PositionOverTime>(PositionOverTime.class);
		}
		return positionOverTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DasexchangePackage.TRAJECTORY__ID:
				return getId();
			case DasexchangePackage.TRAJECTORY__VEHICLE:
				if (resolve) return getVehicle();
				return basicGetVehicle();
			case DasexchangePackage.TRAJECTORY__SPEED_OVER_POSITION:
				return getSpeedOverPosition();
			case DasexchangePackage.TRAJECTORY__SPEED_OVER_TIME:
				return getSpeedOverTime();
			case DasexchangePackage.TRAJECTORY__POSITION_OVER_TIME:
				return getPositionOverTime();
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
			case DasexchangePackage.TRAJECTORY__ID:
				setId((String)newValue);
				return;
			case DasexchangePackage.TRAJECTORY__VEHICLE:
				setVehicle((Vehicle)newValue);
				return;
			case DasexchangePackage.TRAJECTORY__SPEED_OVER_POSITION:
				getSpeedOverPosition().clear();
				getSpeedOverPosition().addAll((Collection<? extends SpeedOverPosition>)newValue);
				return;
			case DasexchangePackage.TRAJECTORY__SPEED_OVER_TIME:
				getSpeedOverTime().clear();
				getSpeedOverTime().addAll((Collection<? extends SpeedOverTime>)newValue);
				return;
			case DasexchangePackage.TRAJECTORY__POSITION_OVER_TIME:
				getPositionOverTime().clear();
				getPositionOverTime().addAll((Collection<? extends PositionOverTime>)newValue);
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
			case DasexchangePackage.TRAJECTORY__ID:
				setId(ID_EDEFAULT);
				return;
			case DasexchangePackage.TRAJECTORY__VEHICLE:
				setVehicle((Vehicle)null);
				return;
			case DasexchangePackage.TRAJECTORY__SPEED_OVER_POSITION:
				getSpeedOverPosition().clear();
				return;
			case DasexchangePackage.TRAJECTORY__SPEED_OVER_TIME:
				getSpeedOverTime().clear();
				return;
			case DasexchangePackage.TRAJECTORY__POSITION_OVER_TIME:
				getPositionOverTime().clear();
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
			case DasexchangePackage.TRAJECTORY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DasexchangePackage.TRAJECTORY__VEHICLE:
				return vehicle != null;
			case DasexchangePackage.TRAJECTORY__SPEED_OVER_POSITION:
				return speedOverPosition != null && !speedOverPosition.isEmpty();
			case DasexchangePackage.TRAJECTORY__SPEED_OVER_TIME:
				return speedOverTime != null && !speedOverTime.isEmpty();
			case DasexchangePackage.TRAJECTORY__POSITION_OVER_TIME:
				return positionOverTime != null && !positionOverTime.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} // Trajectory
