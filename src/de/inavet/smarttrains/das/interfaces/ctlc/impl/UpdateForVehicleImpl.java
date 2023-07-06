/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc.impl;

import de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage;
import de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition;
import de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace;
import de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle;

import de.inavet.smarttrains.das.interfaces.utils.Position;

import de.inavet.smarttrains.das.interfaces.vehicle.Vehicle;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update For Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.UpdateForVehicleImpl#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.UpdateForVehicleImpl#getCurrentPosition <em>Current Position</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.UpdateForVehicleImpl#getCurrentVelocity <em>Current Velocity</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.UpdateForVehicleImpl#getArrivals <em>Arrivals</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.UpdateForVehicleImpl#getStopPlaces <em>Stop Places</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateForVehicleImpl extends MinimalEObjectImpl.Container implements UpdateForVehicle {
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
	 * The cached value of the '{@link #getCurrentPosition() <em>Current Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPosition()
	 * @generated
	 * @ordered
	 */
	protected Position currentPosition;

	/**
	 * The default value of the '{@link #getCurrentVelocity() <em>Current Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double CURRENT_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCurrentVelocity() <em>Current Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentVelocity()
	 * @generated
	 * @ordered
	 */
	protected double currentVelocity = CURRENT_VELOCITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArrivals() <em>Arrivals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivals()
	 * @generated
	 * @ordered
	 */
	protected EList<PrognosisArrivalAndPosition> arrivals;

	/**
	 * The cached value of the '{@link #getStopPlaces() <em>Stop Places</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopPlaces()
	 * @generated
	 * @ordered
	 */
	protected EList<PrognosisStopPlace> stopPlaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateForVehicleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtlcPackage.Literals.UPDATE_FOR_VEHICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle getVehicle() {
		if (vehicle != null && ((EObject)vehicle).eIsProxy()) {
			InternalEObject oldVehicle = vehicle;
			vehicle = (Vehicle)eResolveProxy(oldVehicle);
			if (vehicle != oldVehicle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtlcPackage.UPDATE_FOR_VEHICLE__VEHICLE, oldVehicle, vehicle));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicle(Vehicle newVehicle) {
		Vehicle oldVehicle = vehicle;
		vehicle = newVehicle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtlcPackage.UPDATE_FOR_VEHICLE__VEHICLE, oldVehicle, vehicle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getCurrentPosition() {
		if (currentPosition != null && ((EObject)currentPosition).eIsProxy()) {
			InternalEObject oldCurrentPosition = currentPosition;
			currentPosition = (Position)eResolveProxy(oldCurrentPosition);
			if (currentPosition != oldCurrentPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtlcPackage.UPDATE_FOR_VEHICLE__CURRENT_POSITION, oldCurrentPosition, currentPosition));
			}
		}
		return currentPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position basicGetCurrentPosition() {
		return currentPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentPosition(Position newCurrentPosition) {
		Position oldCurrentPosition = currentPosition;
		currentPosition = newCurrentPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtlcPackage.UPDATE_FOR_VEHICLE__CURRENT_POSITION, oldCurrentPosition, currentPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCurrentVelocity() {
		return currentVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentVelocity(double newCurrentVelocity) {
		double oldCurrentVelocity = currentVelocity;
		currentVelocity = newCurrentVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtlcPackage.UPDATE_FOR_VEHICLE__CURRENT_VELOCITY, oldCurrentVelocity, currentVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrognosisArrivalAndPosition> getArrivals() {
		if (arrivals == null) {
			arrivals = new EObjectResolvingEList<PrognosisArrivalAndPosition>(PrognosisArrivalAndPosition.class, this, CtlcPackage.UPDATE_FOR_VEHICLE__ARRIVALS);
		}
		return arrivals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrognosisStopPlace> getStopPlaces() {
		if (stopPlaces == null) {
			stopPlaces = new EObjectResolvingEList<PrognosisStopPlace>(PrognosisStopPlace.class, this, CtlcPackage.UPDATE_FOR_VEHICLE__STOP_PLACES);
		}
		return stopPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CtlcPackage.UPDATE_FOR_VEHICLE__VEHICLE:
				if (resolve) return getVehicle();
				return basicGetVehicle();
			case CtlcPackage.UPDATE_FOR_VEHICLE__CURRENT_POSITION:
				if (resolve) return getCurrentPosition();
				return basicGetCurrentPosition();
			case CtlcPackage.UPDATE_FOR_VEHICLE__CURRENT_VELOCITY:
				return getCurrentVelocity();
			case CtlcPackage.UPDATE_FOR_VEHICLE__ARRIVALS:
				return getArrivals();
			case CtlcPackage.UPDATE_FOR_VEHICLE__STOP_PLACES:
				return getStopPlaces();
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
			case CtlcPackage.UPDATE_FOR_VEHICLE__VEHICLE:
				setVehicle((Vehicle)newValue);
				return;
			case CtlcPackage.UPDATE_FOR_VEHICLE__CURRENT_POSITION:
				setCurrentPosition((Position)newValue);
				return;
			case CtlcPackage.UPDATE_FOR_VEHICLE__CURRENT_VELOCITY:
				setCurrentVelocity((Double)newValue);
				return;
			case CtlcPackage.UPDATE_FOR_VEHICLE__ARRIVALS:
				getArrivals().clear();
				getArrivals().addAll((Collection<? extends PrognosisArrivalAndPosition>)newValue);
				return;
			case CtlcPackage.UPDATE_FOR_VEHICLE__STOP_PLACES:
				getStopPlaces().clear();
				getStopPlaces().addAll((Collection<? extends PrognosisStopPlace>)newValue);
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
			case CtlcPackage.UPDATE_FOR_VEHICLE__VEHICLE:
				setVehicle((Vehicle)null);
				return;
			case CtlcPackage.UPDATE_FOR_VEHICLE__CURRENT_POSITION:
				setCurrentPosition((Position)null);
				return;
			case CtlcPackage.UPDATE_FOR_VEHICLE__CURRENT_VELOCITY:
				setCurrentVelocity(CURRENT_VELOCITY_EDEFAULT);
				return;
			case CtlcPackage.UPDATE_FOR_VEHICLE__ARRIVALS:
				getArrivals().clear();
				return;
			case CtlcPackage.UPDATE_FOR_VEHICLE__STOP_PLACES:
				getStopPlaces().clear();
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
			case CtlcPackage.UPDATE_FOR_VEHICLE__VEHICLE:
				return vehicle != null;
			case CtlcPackage.UPDATE_FOR_VEHICLE__CURRENT_POSITION:
				return currentPosition != null;
			case CtlcPackage.UPDATE_FOR_VEHICLE__CURRENT_VELOCITY:
				return currentVelocity != CURRENT_VELOCITY_EDEFAULT;
			case CtlcPackage.UPDATE_FOR_VEHICLE__ARRIVALS:
				return arrivals != null && !arrivals.isEmpty();
			case CtlcPackage.UPDATE_FOR_VEHICLE__STOP_PLACES:
				return stopPlaces != null && !stopPlaces.isEmpty();
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
		result.append(" (currentVelocity: ");
		result.append(currentVelocity);
		result.append(')');
		return result.toString();
	}

} //UpdateForVehicleImpl
