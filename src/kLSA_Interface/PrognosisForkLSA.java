/**
 */
package kLSA_Interface;

import fasExchange.Trajectory;

import java.time.ZonedDateTime;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

import utils.Position;

import vehicle.Vehicle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prognosis Fork LSA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hauptklasse für Interface FAS -> kLSA
 * UNIXTimestamp der Erzeugung
 * Fahrzeugkennung
 * aktuelle Position
 * Prognose-Ankünfte
 * Trajektorie
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kLSA_Interface.PrognosisForkLSA#getId <em>Id</em>}</li>
 *   <li>{@link kLSA_Interface.PrognosisForkLSA#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link kLSA_Interface.PrognosisForkLSA#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link kLSA_Interface.PrognosisForkLSA#getPosition <em>Position</em>}</li>
 *   <li>{@link kLSA_Interface.PrognosisForkLSA#getPrognosisArrivalAndPositions <em>Prognosis Arrival And Positions</em>}</li>
 *   <li>{@link kLSA_Interface.PrognosisForkLSA#getTrajectory <em>Trajectory</em>}</li>
 *   <li>{@link kLSA_Interface.PrognosisForkLSA#getSelectedTimeWindow <em>Selected Time Window</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrognosisForkLSA extends MinimalEObjectImpl.Container {
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
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position;

	/**
	 * The cached value of the '{@link #getPrognosisArrivalAndPositions() <em>Prognosis Arrival And Positions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrognosisArrivalAndPositions()
	 * @generated
	 * @ordered
	 */
	protected EList<PrognosisArrivalAndPosition> prognosisArrivalAndPositions;

	/**
	 * The cached value of the '{@link #getTrajectory() <em>Trajectory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrajectory()
	 * @generated
	 * @ordered
	 */
	protected Trajectory trajectory;

	/**
	 * The default value of the '{@link #getSelectedTimeWindow() <em>Selected Time Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedTimeWindow()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTED_TIME_WINDOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectedTimeWindow() <em>Selected Time Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedTimeWindow()
	 * @generated
	 * @ordered
	 */
	protected String selectedTimeWindow = SELECTED_TIME_WINDOW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisForkLSA() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KLSA_InterfacePackage.Literals.PROGNOSIS_FORK_LSA;
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
	 * Sets the value of the '{@link kLSA_Interface.PrognosisForkLSA#getId <em>Id</em>}' attribute.
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
	 * Sets the value of the '{@link kLSA_Interface.PrognosisForkLSA#getTimestamp <em>Timestamp</em>}' attribute.
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
	 * Sets the value of the '{@link kLSA_Interface.PrognosisForkLSA#getVehicle <em>Vehicle</em>}' reference.
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
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(Position)
	 * @generated
	 */
	public Position getPosition() {
		if (position != null && ((EObject)position).eIsProxy()) {
			InternalEObject oldPosition = position;
			position = (Position)eResolveProxy(oldPosition);
			if (position != oldPosition) {
			}
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position basicGetPosition() {
		return position;
	}

	/**
	 * Sets the value of the '{@link kLSA_Interface.PrognosisForkLSA#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newPosition the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		position = newPosition;
	}

	/**
	 * Returns the value of the '<em><b>Prognosis Arrival And Positions</b></em>' reference list.
	 * The list contents are of type {@link kLSA_Interface.PrognosisArrivalAndPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prognosis Arrival And Positions</em>' reference list.
	 * @generated
	 */
	public EList<PrognosisArrivalAndPosition> getPrognosisArrivalAndPositions() {
		if (prognosisArrivalAndPositions == null) {
			prognosisArrivalAndPositions = new BasicInternalEList<PrognosisArrivalAndPosition>(PrognosisArrivalAndPosition.class);
		}
		return prognosisArrivalAndPositions;
	}

	/**
	 * Returns the value of the '<em><b>Trajectory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trajectory</em>' reference.
	 * @see #setTrajectory(Trajectory)
	 * @generated
	 */
	public Trajectory getTrajectory() {
		if (trajectory != null && ((EObject)trajectory).eIsProxy()) {
			InternalEObject oldTrajectory = trajectory;
			trajectory = (Trajectory)eResolveProxy(oldTrajectory);
			if (trajectory != oldTrajectory) {
			}
		}
		return trajectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trajectory basicGetTrajectory() {
		return trajectory;
	}

	/**
	 * Sets the value of the '{@link kLSA_Interface.PrognosisForkLSA#getTrajectory <em>Trajectory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTrajectory the new value of the '<em>Trajectory</em>' reference.
	 * @see #getTrajectory()
	 * @generated
	 */
	public void setTrajectory(Trajectory newTrajectory) {
		trajectory = newTrajectory;
	}

	/**
	 * Returns the value of the '<em><b>Selected Time Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID des gewählten ReleaseTimeWindow, welches zuvor mittels ReleaseTimeWindowforLSA erhalten wurde. Leerstring (""), wenn neue ReleaseTimeWindows angefordert werden sollen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selected Time Window</em>' attribute.
	 * @see #setSelectedTimeWindow(String)
	 * @generated
	 */
	public String getSelectedTimeWindow() {
		return selectedTimeWindow;
	}

	/**
	 * Sets the value of the '{@link kLSA_Interface.PrognosisForkLSA#getSelectedTimeWindow <em>Selected Time Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSelectedTimeWindow the new value of the '<em>Selected Time Window</em>' attribute.
	 * @see #getSelectedTimeWindow()
	 * @generated
	 */
	public void setSelectedTimeWindow(String newSelectedTimeWindow) {
		selectedTimeWindow = newSelectedTimeWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__ID:
				return getId();
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__TIMESTAMP:
				return getTimestamp();
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__VEHICLE:
				if (resolve) return getVehicle();
				return basicGetVehicle();
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__PROGNOSIS_ARRIVAL_AND_POSITIONS:
				return getPrognosisArrivalAndPositions();
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__TRAJECTORY:
				if (resolve) return getTrajectory();
				return basicGetTrajectory();
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__SELECTED_TIME_WINDOW:
				return getSelectedTimeWindow();
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
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__ID:
				setId((String)newValue);
				return;
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__TIMESTAMP:
				setTimestamp((ZonedDateTime)newValue);
				return;
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__VEHICLE:
				setVehicle((Vehicle)newValue);
				return;
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__POSITION:
				setPosition((Position)newValue);
				return;
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__PROGNOSIS_ARRIVAL_AND_POSITIONS:
				getPrognosisArrivalAndPositions().clear();
				getPrognosisArrivalAndPositions().addAll((Collection<? extends PrognosisArrivalAndPosition>)newValue);
				return;
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__TRAJECTORY:
				setTrajectory((Trajectory)newValue);
				return;
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__SELECTED_TIME_WINDOW:
				setSelectedTimeWindow((String)newValue);
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
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__ID:
				setId(ID_EDEFAULT);
				return;
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__VEHICLE:
				setVehicle((Vehicle)null);
				return;
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__POSITION:
				setPosition((Position)null);
				return;
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__PROGNOSIS_ARRIVAL_AND_POSITIONS:
				getPrognosisArrivalAndPositions().clear();
				return;
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__TRAJECTORY:
				setTrajectory((Trajectory)null);
				return;
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__SELECTED_TIME_WINDOW:
				setSelectedTimeWindow(SELECTED_TIME_WINDOW_EDEFAULT);
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
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__VEHICLE:
				return vehicle != null;
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__POSITION:
				return position != null;
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__PROGNOSIS_ARRIVAL_AND_POSITIONS:
				return prognosisArrivalAndPositions != null && !prognosisArrivalAndPositions.isEmpty();
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__TRAJECTORY:
				return trajectory != null;
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA__SELECTED_TIME_WINDOW:
				return SELECTED_TIME_WINDOW_EDEFAULT == null ? selectedTimeWindow != null : !SELECTED_TIME_WINDOW_EDEFAULT.equals(selectedTimeWindow);
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
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", selectedTimeWindow: ");
		result.append(selectedTimeWindow);
		result.append(')');
		return result.toString();
	}

} // PrognosisForkLSA
