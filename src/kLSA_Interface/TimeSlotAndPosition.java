/**
 */
package kLSA_Interface;

import fasExchange.TimeSlot;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Slot And Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hilfsklasse für ReleaseTimeWindowForLSA
 * releaseTime -> öffnen des Zeitfenster
 * closingTime -> schließen des Zeitfenster
 * markedPosition -> Positionsmarke (LSA)
 * releaseProbability -> Wahrscheinlichkeit der Freigabeerteilung, 0 (Unmöglich) bis 1 (Garantiert)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kLSA_Interface.TimeSlotAndPosition#getMarkedPosition <em>Marked Position</em>}</li>
 *   <li>{@link kLSA_Interface.TimeSlotAndPosition#getReleaseProbability <em>Release Probability</em>}</li>
 *   <li>{@link kLSA_Interface.TimeSlotAndPosition#getTimeSlot <em>Time Slot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSlotAndPosition extends MinimalEObjectImpl.Container {
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
	 * The default value of the '{@link #getReleaseProbability() <em>Release Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double RELEASE_PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReleaseProbability() <em>Release Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseProbability()
	 * @generated
	 * @ordered
	 */
	protected double releaseProbability = RELEASE_PROBABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeSlot() <em>Time Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSlot()
	 * @generated
	 * @ordered
	 */
	protected TimeSlot timeSlot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSlotAndPosition() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KLSA_InterfacePackage.Literals.TIME_SLOT_AND_POSITION;
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
	 * Sets the value of the '{@link kLSA_Interface.TimeSlotAndPosition#getMarkedPosition <em>Marked Position</em>}' reference.
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
	 * Returns the value of the '<em><b>Release Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Probability</em>' attribute.
	 * @see #setReleaseProbability(double)
	 * @generated
	 */
	public double getReleaseProbability() {
		return releaseProbability;
	}

	/**
	 * Sets the value of the '{@link kLSA_Interface.TimeSlotAndPosition#getReleaseProbability <em>Release Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReleaseProbability the new value of the '<em>Release Probability</em>' attribute.
	 * @see #getReleaseProbability()
	 * @generated
	 */
	public void setReleaseProbability(double newReleaseProbability) {
		releaseProbability = newReleaseProbability;
	}

	/**
	 * Returns the value of the '<em><b>Time Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Slot</em>' reference.
	 * @see #setTimeSlot(TimeSlot)
	 * @generated
	 */
	public TimeSlot getTimeSlot() {
		if (timeSlot != null && ((EObject)timeSlot).eIsProxy()) {
			InternalEObject oldTimeSlot = timeSlot;
			timeSlot = (TimeSlot)eResolveProxy(oldTimeSlot);
			if (timeSlot != oldTimeSlot) {
			}
		}
		return timeSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSlot basicGetTimeSlot() {
		return timeSlot;
	}

	/**
	 * Sets the value of the '{@link kLSA_Interface.TimeSlotAndPosition#getTimeSlot <em>Time Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTimeSlot the new value of the '<em>Time Slot</em>' reference.
	 * @see #getTimeSlot()
	 * @generated
	 */
	public void setTimeSlot(TimeSlot newTimeSlot) {
		timeSlot = newTimeSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KLSA_InterfacePackage.TIME_SLOT_AND_POSITION__MARKED_POSITION:
				if (resolve) return getMarkedPosition();
				return basicGetMarkedPosition();
			case KLSA_InterfacePackage.TIME_SLOT_AND_POSITION__RELEASE_PROBABILITY:
				return getReleaseProbability();
			case KLSA_InterfacePackage.TIME_SLOT_AND_POSITION__TIME_SLOT:
				if (resolve) return getTimeSlot();
				return basicGetTimeSlot();
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
			case KLSA_InterfacePackage.TIME_SLOT_AND_POSITION__MARKED_POSITION:
				setMarkedPosition((MarkedPosition)newValue);
				return;
			case KLSA_InterfacePackage.TIME_SLOT_AND_POSITION__RELEASE_PROBABILITY:
				setReleaseProbability((Double)newValue);
				return;
			case KLSA_InterfacePackage.TIME_SLOT_AND_POSITION__TIME_SLOT:
				setTimeSlot((TimeSlot)newValue);
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
			case KLSA_InterfacePackage.TIME_SLOT_AND_POSITION__MARKED_POSITION:
				setMarkedPosition((MarkedPosition)null);
				return;
			case KLSA_InterfacePackage.TIME_SLOT_AND_POSITION__RELEASE_PROBABILITY:
				setReleaseProbability(RELEASE_PROBABILITY_EDEFAULT);
				return;
			case KLSA_InterfacePackage.TIME_SLOT_AND_POSITION__TIME_SLOT:
				setTimeSlot((TimeSlot)null);
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
			case KLSA_InterfacePackage.TIME_SLOT_AND_POSITION__MARKED_POSITION:
				return markedPosition != null;
			case KLSA_InterfacePackage.TIME_SLOT_AND_POSITION__RELEASE_PROBABILITY:
				return releaseProbability != RELEASE_PROBABILITY_EDEFAULT;
			case KLSA_InterfacePackage.TIME_SLOT_AND_POSITION__TIME_SLOT:
				return timeSlot != null;
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
		result.append(" (releaseProbability: ");
		result.append(releaseProbability);
		result.append(')');
		return result.toString();
	}

} // TimeSlotAndPosition
