/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import de.inavet.smarttrains.das.interfaces.utils.Position;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Slot On Journey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hilfsklasse
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney#getTimeSlot <em>Time Slot</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSlotOnJourney extends MinimalEObjectImpl.Container {
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
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSlotOnJourney() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DasexchangePackage.Literals.TIME_SLOT_ON_JOURNEY;
	}

	/**
	 * Returns the value of the '<em><b>Time Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitfenster auf einer Position
	 * <!-- end-model-doc -->
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
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney#getTimeSlot <em>Time Slot</em>}' reference.
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
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Position auf der Strecke (geografisch, auch als relativ)
	 * <!-- end-model-doc -->
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
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney#getPosition <em>Position</em>}' reference.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DasexchangePackage.TIME_SLOT_ON_JOURNEY__TIME_SLOT:
				if (resolve) return getTimeSlot();
				return basicGetTimeSlot();
			case DasexchangePackage.TIME_SLOT_ON_JOURNEY__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
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
			case DasexchangePackage.TIME_SLOT_ON_JOURNEY__TIME_SLOT:
				setTimeSlot((TimeSlot)newValue);
				return;
			case DasexchangePackage.TIME_SLOT_ON_JOURNEY__POSITION:
				setPosition((Position)newValue);
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
			case DasexchangePackage.TIME_SLOT_ON_JOURNEY__TIME_SLOT:
				setTimeSlot((TimeSlot)null);
				return;
			case DasexchangePackage.TIME_SLOT_ON_JOURNEY__POSITION:
				setPosition((Position)null);
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
			case DasexchangePackage.TIME_SLOT_ON_JOURNEY__TIME_SLOT:
				return timeSlot != null;
			case DasexchangePackage.TIME_SLOT_ON_JOURNEY__POSITION:
				return position != null;
		}
		return super.eIsSet(featureID);
	}

} // TimeSlotOnJourney
