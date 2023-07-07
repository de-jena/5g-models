/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trajectory Left From Mobile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Trajektorie verlassen Meldung vom Mobile
 * Auch hier ist die Verwendung noch nicht klar
 * Upadate 26.04.2023: Klassse wird nicht gebraucht, da die Zentrale immer die position des Mobilgeräts kennt und somit das Verlassen der Trajektorie selbst feststellen kann.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.TrajectoryLeftFromMobile#getTrajectory <em>Trajectory</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.TrajectoryLeftFromMobile#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrajectoryLeftFromMobile extends MinimalEObjectImpl.Container {
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
	protected TrajectoryLeftFromMobile() {
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
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TrajectoryLeftFromMobile#getTrajectory <em>Trajectory</em>}' reference.
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
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(ZonedDateTime)
	 * @generated
	 */
	public ZonedDateTime getTimeStamp() {
		return timeStamp;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TrajectoryLeftFromMobile#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTimeStamp the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	public void setTimeStamp(ZonedDateTime newTimeStamp) {
		timeStamp = newTimeStamp;
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

} // TrajectoryLeftFromMobile
