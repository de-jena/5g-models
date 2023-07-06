/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange.impl;

import de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage;
import de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot;
import de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney;

import de.inavet.smarttrains.das.interfaces.utils.Position;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Slot On Journey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.TimeSlotOnJourneyImpl#getTimeSlot <em>Time Slot</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.TimeSlotOnJourneyImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSlotOnJourneyImpl extends MinimalEObjectImpl.Container implements TimeSlotOnJourney {
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
	protected TimeSlotOnJourneyImpl() {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSlot getTimeSlot() {
		if (timeSlot != null && timeSlot.eIsProxy()) {
			InternalEObject oldTimeSlot = (InternalEObject)timeSlot;
			timeSlot = (TimeSlot)eResolveProxy(oldTimeSlot);
			if (timeSlot != oldTimeSlot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DasexchangePackage.TIME_SLOT_ON_JOURNEY__TIME_SLOT, oldTimeSlot, timeSlot));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSlot(TimeSlot newTimeSlot) {
		TimeSlot oldTimeSlot = timeSlot;
		timeSlot = newTimeSlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.TIME_SLOT_ON_JOURNEY__TIME_SLOT, oldTimeSlot, timeSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		if (position != null && ((EObject)position).eIsProxy()) {
			InternalEObject oldPosition = position;
			position = (Position)eResolveProxy(oldPosition);
			if (position != oldPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DasexchangePackage.TIME_SLOT_ON_JOURNEY__POSITION, oldPosition, position));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		Position oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.TIME_SLOT_ON_JOURNEY__POSITION, oldPosition, position));
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

} //TimeSlotOnJourneyImpl
