/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc.impl;

import de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage;
import de.inavet.smarttrains.das.interfaces.ctlc.MarkedPosition;
import de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition;

import java.time.ZonedDateTime;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prognosis Arrival And Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.PrognosisArrivalAndPositionImpl#getEstimatedArrivalTime <em>Estimated Arrival Time</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.PrognosisArrivalAndPositionImpl#getArrivalPosition <em>Arrival Position</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.PrognosisArrivalAndPositionImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrognosisArrivalAndPositionImpl extends MinimalEObjectImpl.Container implements PrognosisArrivalAndPosition {
	/**
	 * The default value of the '{@link #getEstimatedArrivalTime() <em>Estimated Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected static final ZonedDateTime ESTIMATED_ARRIVAL_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedArrivalTime() <em>Estimated Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected ZonedDateTime estimatedArrivalTime = ESTIMATED_ARRIVAL_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArrivalPosition() <em>Arrival Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalPosition()
	 * @generated
	 * @ordered
	 */
	protected MarkedPosition arrivalPosition;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final double PRIORITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected double priority = PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrognosisArrivalAndPositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtlcPackage.Literals.PROGNOSIS_ARRIVAL_AND_POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZonedDateTime getEstimatedArrivalTime() {
		return estimatedArrivalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedArrivalTime(ZonedDateTime newEstimatedArrivalTime) {
		ZonedDateTime oldEstimatedArrivalTime = estimatedArrivalTime;
		estimatedArrivalTime = newEstimatedArrivalTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__ESTIMATED_ARRIVAL_TIME, oldEstimatedArrivalTime, estimatedArrivalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkedPosition getArrivalPosition() {
		return arrivalPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrivalPosition(MarkedPosition newArrivalPosition, NotificationChain msgs) {
		MarkedPosition oldArrivalPosition = arrivalPosition;
		arrivalPosition = newArrivalPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__ARRIVAL_POSITION, oldArrivalPosition, newArrivalPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivalPosition(MarkedPosition newArrivalPosition) {
		if (newArrivalPosition != arrivalPosition) {
			NotificationChain msgs = null;
			if (arrivalPosition != null)
				msgs = ((InternalEObject)arrivalPosition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__ARRIVAL_POSITION, null, msgs);
			if (newArrivalPosition != null)
				msgs = ((InternalEObject)newArrivalPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__ARRIVAL_POSITION, null, msgs);
			msgs = basicSetArrivalPosition(newArrivalPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__ARRIVAL_POSITION, newArrivalPosition, newArrivalPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(double newPriority) {
		double oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__ARRIVAL_POSITION:
				return basicSetArrivalPosition(null, msgs);
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
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__ESTIMATED_ARRIVAL_TIME:
				return getEstimatedArrivalTime();
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__ARRIVAL_POSITION:
				return getArrivalPosition();
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__PRIORITY:
				return getPriority();
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
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__ESTIMATED_ARRIVAL_TIME:
				setEstimatedArrivalTime((ZonedDateTime)newValue);
				return;
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__ARRIVAL_POSITION:
				setArrivalPosition((MarkedPosition)newValue);
				return;
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__PRIORITY:
				setPriority((Double)newValue);
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
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__ESTIMATED_ARRIVAL_TIME:
				setEstimatedArrivalTime(ESTIMATED_ARRIVAL_TIME_EDEFAULT);
				return;
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__ARRIVAL_POSITION:
				setArrivalPosition((MarkedPosition)null);
				return;
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
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
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__ESTIMATED_ARRIVAL_TIME:
				return ESTIMATED_ARRIVAL_TIME_EDEFAULT == null ? estimatedArrivalTime != null : !ESTIMATED_ARRIVAL_TIME_EDEFAULT.equals(estimatedArrivalTime);
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__ARRIVAL_POSITION:
				return arrivalPosition != null;
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
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
		result.append(" (estimatedArrivalTime: ");
		result.append(estimatedArrivalTime);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //PrognosisArrivalAndPositionImpl
