/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange.impl;

import de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage;
import de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot;

import java.time.ZonedDateTime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.TimeSlotImpl#getBeginOfTimeSlot <em>Begin Of Time Slot</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.TimeSlotImpl#getEndOfTimeSlot <em>End Of Time Slot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSlotImpl extends MinimalEObjectImpl.Container implements TimeSlot {
	/**
	 * The default value of the '{@link #getBeginOfTimeSlot() <em>Begin Of Time Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginOfTimeSlot()
	 * @generated
	 * @ordered
	 */
	protected static final ZonedDateTime BEGIN_OF_TIME_SLOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginOfTimeSlot() <em>Begin Of Time Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginOfTimeSlot()
	 * @generated
	 * @ordered
	 */
	protected ZonedDateTime beginOfTimeSlot = BEGIN_OF_TIME_SLOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndOfTimeSlot() <em>End Of Time Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndOfTimeSlot()
	 * @generated
	 * @ordered
	 */
	protected static final ZonedDateTime END_OF_TIME_SLOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndOfTimeSlot() <em>End Of Time Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndOfTimeSlot()
	 * @generated
	 * @ordered
	 */
	protected ZonedDateTime endOfTimeSlot = END_OF_TIME_SLOT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DasexchangePackage.Literals.TIME_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZonedDateTime getBeginOfTimeSlot() {
		return beginOfTimeSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeginOfTimeSlot(ZonedDateTime newBeginOfTimeSlot) {
		ZonedDateTime oldBeginOfTimeSlot = beginOfTimeSlot;
		beginOfTimeSlot = newBeginOfTimeSlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.TIME_SLOT__BEGIN_OF_TIME_SLOT, oldBeginOfTimeSlot, beginOfTimeSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZonedDateTime getEndOfTimeSlot() {
		return endOfTimeSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndOfTimeSlot(ZonedDateTime newEndOfTimeSlot) {
		ZonedDateTime oldEndOfTimeSlot = endOfTimeSlot;
		endOfTimeSlot = newEndOfTimeSlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.TIME_SLOT__END_OF_TIME_SLOT, oldEndOfTimeSlot, endOfTimeSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DasexchangePackage.TIME_SLOT__BEGIN_OF_TIME_SLOT:
				return getBeginOfTimeSlot();
			case DasexchangePackage.TIME_SLOT__END_OF_TIME_SLOT:
				return getEndOfTimeSlot();
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
			case DasexchangePackage.TIME_SLOT__BEGIN_OF_TIME_SLOT:
				setBeginOfTimeSlot((ZonedDateTime)newValue);
				return;
			case DasexchangePackage.TIME_SLOT__END_OF_TIME_SLOT:
				setEndOfTimeSlot((ZonedDateTime)newValue);
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
			case DasexchangePackage.TIME_SLOT__BEGIN_OF_TIME_SLOT:
				setBeginOfTimeSlot(BEGIN_OF_TIME_SLOT_EDEFAULT);
				return;
			case DasexchangePackage.TIME_SLOT__END_OF_TIME_SLOT:
				setEndOfTimeSlot(END_OF_TIME_SLOT_EDEFAULT);
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
			case DasexchangePackage.TIME_SLOT__BEGIN_OF_TIME_SLOT:
				return BEGIN_OF_TIME_SLOT_EDEFAULT == null ? beginOfTimeSlot != null : !BEGIN_OF_TIME_SLOT_EDEFAULT.equals(beginOfTimeSlot);
			case DasexchangePackage.TIME_SLOT__END_OF_TIME_SLOT:
				return END_OF_TIME_SLOT_EDEFAULT == null ? endOfTimeSlot != null : !END_OF_TIME_SLOT_EDEFAULT.equals(endOfTimeSlot);
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
		result.append(" (beginOfTimeSlot: ");
		result.append(beginOfTimeSlot);
		result.append(", endOfTimeSlot: ");
		result.append(endOfTimeSlot);
		result.append(')');
		return result.toString();
	}

} //TimeSlotImpl
