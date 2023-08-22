/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc.impl;

import de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage;
import de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition;
import de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace;
import de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle;

import de.inavet.smarttrains.das.interfaces.utils.Position;
import de.inavet.smarttrains.das.interfaces.utils.Vehicle;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
	 * The cached value of the '{@link #getVehicle() <em>Vehicle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicle()
	 * @generated
	 * @ordered
	 */
	protected Vehicle vehicle;

	/**
	 * The cached value of the '{@link #getCurrentPosition() <em>Current Position</em>}' containment reference.
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
	 * The cached value of the '{@link #getArrivals() <em>Arrivals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivals()
	 * @generated
	 * @ordered
	 */
	protected EList<PrognosisArrivalAndPosition> arrivals;

	/**
	 * The cached value of the '{@link #getStopPlaces() <em>Stop Places</em>}' containment reference list.
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
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVehicle(Vehicle newVehicle, NotificationChain msgs) {
		Vehicle oldVehicle = vehicle;
		vehicle = newVehicle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtlcPackage.UPDATE_FOR_VEHICLE__VEHICLE, oldVehicle, newVehicle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicle(Vehicle newVehicle) {
		if (newVehicle != vehicle) {
			NotificationChain msgs = null;
			if (vehicle != null)
				msgs = ((InternalEObject)vehicle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtlcPackage.UPDATE_FOR_VEHICLE__VEHICLE, null, msgs);
			if (newVehicle != null)
				msgs = ((InternalEObject)newVehicle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtlcPackage.UPDATE_FOR_VEHICLE__VEHICLE, null, msgs);
			msgs = basicSetVehicle(newVehicle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtlcPackage.UPDATE_FOR_VEHICLE__VEHICLE, newVehicle, newVehicle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getCurrentPosition() {
		return currentPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentPosition(Position newCurrentPosition, NotificationChain msgs) {
		Position oldCurrentPosition = currentPosition;
		currentPosition = newCurrentPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtlcPackage.UPDATE_FOR_VEHICLE__CURRENT_POSITION, oldCurrentPosition, newCurrentPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentPosition(Position newCurrentPosition) {
		if (newCurrentPosition != currentPosition) {
			NotificationChain msgs = null;
			if (currentPosition != null)
				msgs = ((InternalEObject)currentPosition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtlcPackage.UPDATE_FOR_VEHICLE__CURRENT_POSITION, null, msgs);
			if (newCurrentPosition != null)
				msgs = ((InternalEObject)newCurrentPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtlcPackage.UPDATE_FOR_VEHICLE__CURRENT_POSITION, null, msgs);
			msgs = basicSetCurrentPosition(newCurrentPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtlcPackage.UPDATE_FOR_VEHICLE__CURRENT_POSITION, newCurrentPosition, newCurrentPosition));
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
			arrivals = new EObjectContainmentEList<PrognosisArrivalAndPosition>(PrognosisArrivalAndPosition.class, this, CtlcPackage.UPDATE_FOR_VEHICLE__ARRIVALS);
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
			stopPlaces = new EObjectContainmentEList<PrognosisStopPlace>(PrognosisStopPlace.class, this, CtlcPackage.UPDATE_FOR_VEHICLE__STOP_PLACES);
		}
		return stopPlaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtlcPackage.UPDATE_FOR_VEHICLE__VEHICLE:
				return basicSetVehicle(null, msgs);
			case CtlcPackage.UPDATE_FOR_VEHICLE__CURRENT_POSITION:
				return basicSetCurrentPosition(null, msgs);
			case CtlcPackage.UPDATE_FOR_VEHICLE__ARRIVALS:
				return ((InternalEList<?>)getArrivals()).basicRemove(otherEnd, msgs);
			case CtlcPackage.UPDATE_FOR_VEHICLE__STOP_PLACES:
				return ((InternalEList<?>)getStopPlaces()).basicRemove(otherEnd, msgs);
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
			case CtlcPackage.UPDATE_FOR_VEHICLE__VEHICLE:
				return getVehicle();
			case CtlcPackage.UPDATE_FOR_VEHICLE__CURRENT_POSITION:
				return getCurrentPosition();
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
