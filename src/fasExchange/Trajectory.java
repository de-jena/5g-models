/**
 */
package fasExchange;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

import vehicle.Vehicle;

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
 *   <li>{@link fasExchange.Trajectory#getId <em>Id</em>}</li>
 *   <li>{@link fasExchange.Trajectory#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link fasExchange.Trajectory#getSpeedOverPosition <em>Speed Over Position</em>}</li>
 *   <li>{@link fasExchange.Trajectory#getSpeedOverTime <em>Speed Over Time</em>}</li>
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trajectory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FasExchangePackage.Literals.TRAJECTORY;
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
	 * Sets the value of the '{@link fasExchange.Trajectory#getId <em>Id</em>}' attribute.
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
	 * Sets the value of the '{@link fasExchange.Trajectory#getVehicle <em>Vehicle</em>}' reference.
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
	 * The list contents are of type {@link fasExchange.SpeedOverPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Over Position</em>' reference list.
	 * @generated
	 */
	public List<SpeedOverPosition> getSpeedOverPosition() {
		if (speedOverPosition == null) {
			speedOverPosition = new BasicInternalEList<SpeedOverPosition>(SpeedOverPosition.class);
		}
		return speedOverPosition;
	}

	/**
	 * Returns the value of the '<em><b>Speed Over Time</b></em>' reference list.
	 * The list contents are of type {@link fasExchange.SpeedOverTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Over Time</em>' reference list.
	 * @generated
	 */
	public List<SpeedOverTime> getSpeedOverTime() {
		if (speedOverTime == null) {
			speedOverTime = new BasicInternalEList<SpeedOverTime>(SpeedOverTime.class);
		}
		return speedOverTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FasExchangePackage.TRAJECTORY__ID:
				return getId();
			case FasExchangePackage.TRAJECTORY__VEHICLE:
				if (resolve) return getVehicle();
				return basicGetVehicle();
			case FasExchangePackage.TRAJECTORY__SPEED_OVER_POSITION:
				return getSpeedOverPosition();
			case FasExchangePackage.TRAJECTORY__SPEED_OVER_TIME:
				return getSpeedOverTime();
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
			case FasExchangePackage.TRAJECTORY__ID:
				setId((String)newValue);
				return;
			case FasExchangePackage.TRAJECTORY__VEHICLE:
				setVehicle((Vehicle)newValue);
				return;
			case FasExchangePackage.TRAJECTORY__SPEED_OVER_POSITION:
				getSpeedOverPosition().clear();
				getSpeedOverPosition().addAll((Collection<? extends SpeedOverPosition>)newValue);
				return;
			case FasExchangePackage.TRAJECTORY__SPEED_OVER_TIME:
				getSpeedOverTime().clear();
				getSpeedOverTime().addAll((Collection<? extends SpeedOverTime>)newValue);
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
			case FasExchangePackage.TRAJECTORY__ID:
				setId(ID_EDEFAULT);
				return;
			case FasExchangePackage.TRAJECTORY__VEHICLE:
				setVehicle((Vehicle)null);
				return;
			case FasExchangePackage.TRAJECTORY__SPEED_OVER_POSITION:
				getSpeedOverPosition().clear();
				return;
			case FasExchangePackage.TRAJECTORY__SPEED_OVER_TIME:
				getSpeedOverTime().clear();
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
			case FasExchangePackage.TRAJECTORY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case FasExchangePackage.TRAJECTORY__VEHICLE:
				return vehicle != null;
			case FasExchangePackage.TRAJECTORY__SPEED_OVER_POSITION:
				return speedOverPosition != null && !speedOverPosition.isEmpty();
			case FasExchangePackage.TRAJECTORY__SPEED_OVER_TIME:
				return speedOverTime != null && !speedOverTime.isEmpty();
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
