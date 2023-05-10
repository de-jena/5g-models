/**
 */
package kLSA_Interface;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prognosis Arrival And Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hilfsklasse für PrognosisForkLSA
 * Prognose-Ankunft an der Positionsmarke mit Priorisierung
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kLSA_Interface.PrognosisArrivalAndPosition#getMarkedPosition <em>Marked Position</em>}</li>
 *   <li>{@link kLSA_Interface.PrognosisArrivalAndPosition#getEarliestPossibleArrivalTime <em>Earliest Possible Arrival Time</em>}</li>
 *   <li>{@link kLSA_Interface.PrognosisArrivalAndPosition#getOptimatedArrivalTime <em>Optimated Arrival Time</em>}</li>
 *   <li>{@link kLSA_Interface.PrognosisArrivalAndPosition#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrognosisArrivalAndPosition extends MinimalEObjectImpl.Container {
	/**
	 * The cached value of the '{@link #getMarkedPosition() <em>Marked Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkedPosition()
	 * @generated
	 * @ordered
	 */
	protected MarkedPosition markedPosition;

	/**
	 * The default value of the '{@link #getEarliestPossibleArrivalTime() <em>Earliest Possible Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarliestPossibleArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected static final ZonedDateTime EARLIEST_POSSIBLE_ARRIVAL_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEarliestPossibleArrivalTime() <em>Earliest Possible Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarliestPossibleArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected ZonedDateTime earliestPossibleArrivalTime = EARLIEST_POSSIBLE_ARRIVAL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptimatedArrivalTime() <em>Optimated Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimatedArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected static final ZonedDateTime OPTIMATED_ARRIVAL_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptimatedArrivalTime() <em>Optimated Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimatedArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected ZonedDateTime optimatedArrivalTime = OPTIMATED_ARRIVAL_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Priority priority;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisArrivalAndPosition() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KLSA_InterfacePackage.Literals.PROGNOSIS_ARRIVAL_AND_POSITION;
	}

	/**
	 * Returns the value of the '<em><b>Marked Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marked Position</em>' reference.
	 * @see #setMarkedPosition(MarkedPosition)
	 * @generated
	 */
	public MarkedPosition getMarkedPosition() {
		if (markedPosition != null && ((EObject)markedPosition).eIsProxy()) {
			InternalEObject oldMarkedPosition = markedPosition;
			markedPosition = (MarkedPosition)eResolveProxy(oldMarkedPosition);
			if (markedPosition != oldMarkedPosition) {
			}
		}
		return markedPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkedPosition basicGetMarkedPosition() {
		return markedPosition;
	}

	/**
	 * Sets the value of the '{@link kLSA_Interface.PrognosisArrivalAndPosition#getMarkedPosition <em>Marked Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newMarkedPosition the new value of the '<em>Marked Position</em>' reference.
	 * @see #getMarkedPosition()
	 * @generated
	 */
	public void setMarkedPosition(MarkedPosition newMarkedPosition) {
		markedPosition = newMarkedPosition;
	}

	/**
	 * Returns the value of the '<em><b>Earliest Possible Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Earliest Possible Arrival Time</em>' attribute.
	 * @see #setEarliestPossibleArrivalTime(ZonedDateTime)
	 * @generated
	 */
	public ZonedDateTime getEarliestPossibleArrivalTime() {
		return earliestPossibleArrivalTime;
	}

	/**
	 * Sets the value of the '{@link kLSA_Interface.PrognosisArrivalAndPosition#getEarliestPossibleArrivalTime <em>Earliest Possible Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newEarliestPossibleArrivalTime the new value of the '<em>Earliest Possible Arrival Time</em>' attribute.
	 * @see #getEarliestPossibleArrivalTime()
	 * @generated
	 */
	public void setEarliestPossibleArrivalTime(ZonedDateTime newEarliestPossibleArrivalTime) {
		earliestPossibleArrivalTime = newEarliestPossibleArrivalTime;
	}

	/**
	 * Returns the value of the '<em><b>Optimated Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimated Arrival Time</em>' attribute.
	 * @see #setOptimatedArrivalTime(ZonedDateTime)
	 * @generated
	 */
	public ZonedDateTime getOptimatedArrivalTime() {
		return optimatedArrivalTime;
	}

	/**
	 * Sets the value of the '{@link kLSA_Interface.PrognosisArrivalAndPosition#getOptimatedArrivalTime <em>Optimated Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newOptimatedArrivalTime the new value of the '<em>Optimated Arrival Time</em>' attribute.
	 * @see #getOptimatedArrivalTime()
	 * @generated
	 */
	public void setOptimatedArrivalTime(ZonedDateTime newOptimatedArrivalTime) {
		optimatedArrivalTime = newOptimatedArrivalTime;
	}

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' reference.
	 * @see #setPriority(Priority)
	 * @generated
	 */
	public Priority getPriority() {
		if (priority != null && ((EObject)priority).eIsProxy()) {
			InternalEObject oldPriority = priority;
			priority = (Priority)eResolveProxy(oldPriority);
			if (priority != oldPriority) {
			}
		}
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Priority basicGetPriority() {
		return priority;
	}

	/**
	 * Sets the value of the '{@link kLSA_Interface.PrognosisArrivalAndPosition#getPriority <em>Priority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newPriority the new value of the '<em>Priority</em>' reference.
	 * @see #getPriority()
	 * @generated
	 */
	public void setPriority(Priority newPriority) {
		priority = newPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KLSA_InterfacePackage.PROGNOSIS_ARRIVAL_AND_POSITION__MARKED_POSITION:
				if (resolve) return getMarkedPosition();
				return basicGetMarkedPosition();
			case KLSA_InterfacePackage.PROGNOSIS_ARRIVAL_AND_POSITION__EARLIEST_POSSIBLE_ARRIVAL_TIME:
				return getEarliestPossibleArrivalTime();
			case KLSA_InterfacePackage.PROGNOSIS_ARRIVAL_AND_POSITION__OPTIMATED_ARRIVAL_TIME:
				return getOptimatedArrivalTime();
			case KLSA_InterfacePackage.PROGNOSIS_ARRIVAL_AND_POSITION__PRIORITY:
				if (resolve) return getPriority();
				return basicGetPriority();
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
			case KLSA_InterfacePackage.PROGNOSIS_ARRIVAL_AND_POSITION__MARKED_POSITION:
				setMarkedPosition((MarkedPosition)newValue);
				return;
			case KLSA_InterfacePackage.PROGNOSIS_ARRIVAL_AND_POSITION__EARLIEST_POSSIBLE_ARRIVAL_TIME:
				setEarliestPossibleArrivalTime((ZonedDateTime)newValue);
				return;
			case KLSA_InterfacePackage.PROGNOSIS_ARRIVAL_AND_POSITION__OPTIMATED_ARRIVAL_TIME:
				setOptimatedArrivalTime((ZonedDateTime)newValue);
				return;
			case KLSA_InterfacePackage.PROGNOSIS_ARRIVAL_AND_POSITION__PRIORITY:
				setPriority((Priority)newValue);
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
			case KLSA_InterfacePackage.PROGNOSIS_ARRIVAL_AND_POSITION__MARKED_POSITION:
				setMarkedPosition((MarkedPosition)null);
				return;
			case KLSA_InterfacePackage.PROGNOSIS_ARRIVAL_AND_POSITION__EARLIEST_POSSIBLE_ARRIVAL_TIME:
				setEarliestPossibleArrivalTime(EARLIEST_POSSIBLE_ARRIVAL_TIME_EDEFAULT);
				return;
			case KLSA_InterfacePackage.PROGNOSIS_ARRIVAL_AND_POSITION__OPTIMATED_ARRIVAL_TIME:
				setOptimatedArrivalTime(OPTIMATED_ARRIVAL_TIME_EDEFAULT);
				return;
			case KLSA_InterfacePackage.PROGNOSIS_ARRIVAL_AND_POSITION__PRIORITY:
				setPriority((Priority)null);
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
			case KLSA_InterfacePackage.PROGNOSIS_ARRIVAL_AND_POSITION__MARKED_POSITION:
				return markedPosition != null;
			case KLSA_InterfacePackage.PROGNOSIS_ARRIVAL_AND_POSITION__EARLIEST_POSSIBLE_ARRIVAL_TIME:
				return EARLIEST_POSSIBLE_ARRIVAL_TIME_EDEFAULT == null ? earliestPossibleArrivalTime != null : !EARLIEST_POSSIBLE_ARRIVAL_TIME_EDEFAULT.equals(earliestPossibleArrivalTime);
			case KLSA_InterfacePackage.PROGNOSIS_ARRIVAL_AND_POSITION__OPTIMATED_ARRIVAL_TIME:
				return OPTIMATED_ARRIVAL_TIME_EDEFAULT == null ? optimatedArrivalTime != null : !OPTIMATED_ARRIVAL_TIME_EDEFAULT.equals(optimatedArrivalTime);
			case KLSA_InterfacePackage.PROGNOSIS_ARRIVAL_AND_POSITION__PRIORITY:
				return priority != null;
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
		result.append(" (earliestPossibleArrivalTime: ");
		result.append(earliestPossibleArrivalTime);
		result.append(", optimatedArrivalTime: ");
		result.append(optimatedArrivalTime);
		result.append(')');
		return result.toString();
	}

} // PrognosisArrivalAndPosition
