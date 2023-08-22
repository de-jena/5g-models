/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange.impl;

import de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage;
import de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot;
import de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney;

import de.inavet.smarttrains.das.interfaces.utils.Position;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
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
	 * The cached value of the '{@link #getTimeSlot() <em>Time Slot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSlot()
	 * @generated
	 * @ordered
	 */
	protected TimeSlot timeSlot;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
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
		return timeSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeSlot(TimeSlot newTimeSlot, NotificationChain msgs) {
		TimeSlot oldTimeSlot = timeSlot;
		timeSlot = newTimeSlot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DasexchangePackage.TIME_SLOT_ON_JOURNEY__TIME_SLOT, oldTimeSlot, newTimeSlot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSlot(TimeSlot newTimeSlot) {
		if (newTimeSlot != timeSlot) {
			NotificationChain msgs = null;
			if (timeSlot != null)
				msgs = ((InternalEObject)timeSlot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DasexchangePackage.TIME_SLOT_ON_JOURNEY__TIME_SLOT, null, msgs);
			if (newTimeSlot != null)
				msgs = ((InternalEObject)newTimeSlot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DasexchangePackage.TIME_SLOT_ON_JOURNEY__TIME_SLOT, null, msgs);
			msgs = basicSetTimeSlot(newTimeSlot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.TIME_SLOT_ON_JOURNEY__TIME_SLOT, newTimeSlot, newTimeSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Position newPosition, NotificationChain msgs) {
		Position oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DasexchangePackage.TIME_SLOT_ON_JOURNEY__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DasexchangePackage.TIME_SLOT_ON_JOURNEY__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DasexchangePackage.TIME_SLOT_ON_JOURNEY__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.TIME_SLOT_ON_JOURNEY__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DasexchangePackage.TIME_SLOT_ON_JOURNEY__TIME_SLOT:
				return basicSetTimeSlot(null, msgs);
			case DasexchangePackage.TIME_SLOT_ON_JOURNEY__POSITION:
				return basicSetPosition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
				return getTimeSlot();
			case DasexchangePackage.TIME_SLOT_ON_JOURNEY__POSITION:
				return getPosition();
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
