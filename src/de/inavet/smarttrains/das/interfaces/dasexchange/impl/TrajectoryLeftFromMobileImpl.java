/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange.impl;

import de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage;
import de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory;
import de.inavet.smarttrains.das.interfaces.dasexchange.TrajectoryLeftFromMobile;

import java.time.ZonedDateTime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trajectory Left From Mobile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.TrajectoryLeftFromMobileImpl#getTrajectory <em>Trajectory</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.TrajectoryLeftFromMobileImpl#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrajectoryLeftFromMobileImpl extends MinimalEObjectImpl.Container implements TrajectoryLeftFromMobile {
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
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final ZonedDateTime TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected ZonedDateTime timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrajectoryLeftFromMobileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DasexchangePackage.Literals.TRAJECTORY_LEFT_FROM_MOBILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trajectory getTrajectory() {
		if (trajectory != null && trajectory.eIsProxy()) {
			InternalEObject oldTrajectory = (InternalEObject)trajectory;
			trajectory = (Trajectory)eResolveProxy(oldTrajectory);
			if (trajectory != oldTrajectory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DasexchangePackage.TRAJECTORY_LEFT_FROM_MOBILE__TRAJECTORY, oldTrajectory, trajectory));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrajectory(Trajectory newTrajectory) {
		Trajectory oldTrajectory = trajectory;
		trajectory = newTrajectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.TRAJECTORY_LEFT_FROM_MOBILE__TRAJECTORY, oldTrajectory, trajectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZonedDateTime getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(ZonedDateTime newTimeStamp) {
		ZonedDateTime oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.TRAJECTORY_LEFT_FROM_MOBILE__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DasexchangePackage.TRAJECTORY_LEFT_FROM_MOBILE__TRAJECTORY:
				if (resolve) return getTrajectory();
				return basicGetTrajectory();
			case DasexchangePackage.TRAJECTORY_LEFT_FROM_MOBILE__TIME_STAMP:
				return getTimeStamp();
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
			case DasexchangePackage.TRAJECTORY_LEFT_FROM_MOBILE__TRAJECTORY:
				setTrajectory((Trajectory)newValue);
				return;
			case DasexchangePackage.TRAJECTORY_LEFT_FROM_MOBILE__TIME_STAMP:
				setTimeStamp((ZonedDateTime)newValue);
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
			case DasexchangePackage.TRAJECTORY_LEFT_FROM_MOBILE__TRAJECTORY:
				setTrajectory((Trajectory)null);
				return;
			case DasexchangePackage.TRAJECTORY_LEFT_FROM_MOBILE__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
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
			case DasexchangePackage.TRAJECTORY_LEFT_FROM_MOBILE__TRAJECTORY:
				return trajectory != null;
			case DasexchangePackage.TRAJECTORY_LEFT_FROM_MOBILE__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
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
		result.append(" (timeStamp: ");
		result.append(timeStamp);
		result.append(')');
		return result.toString();
	}

} //TrajectoryLeftFromMobileImpl
