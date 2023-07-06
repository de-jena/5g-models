/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc.impl;

import de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage;
import de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition;
import de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride;

import de.inavet.smarttrains.das.interfaces.vehicle.Vehicle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prognosis Override</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.PrognosisOverrideImpl#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.PrognosisOverrideImpl#getPrognosis <em>Prognosis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrognosisOverrideImpl extends MinimalEObjectImpl.Container implements PrognosisOverride {
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
	 * The cached value of the '{@link #getPrognosis() <em>Prognosis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrognosis()
	 * @generated
	 * @ordered
	 */
	protected PrognosisArrivalAndPosition prognosis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrognosisOverrideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtlcPackage.Literals.PROGNOSIS_OVERRIDE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtlcPackage.PROGNOSIS_OVERRIDE__VEHICLE, oldVehicle, vehicle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CtlcPackage.PROGNOSIS_OVERRIDE__VEHICLE, oldVehicle, vehicle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisArrivalAndPosition getPrognosis() {
		if (prognosis != null && prognosis.eIsProxy()) {
			InternalEObject oldPrognosis = (InternalEObject)prognosis;
			prognosis = (PrognosisArrivalAndPosition)eResolveProxy(oldPrognosis);
			if (prognosis != oldPrognosis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtlcPackage.PROGNOSIS_OVERRIDE__PROGNOSIS, oldPrognosis, prognosis));
			}
		}
		return prognosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisArrivalAndPosition basicGetPrognosis() {
		return prognosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrognosis(PrognosisArrivalAndPosition newPrognosis) {
		PrognosisArrivalAndPosition oldPrognosis = prognosis;
		prognosis = newPrognosis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtlcPackage.PROGNOSIS_OVERRIDE__PROGNOSIS, oldPrognosis, prognosis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CtlcPackage.PROGNOSIS_OVERRIDE__VEHICLE:
				if (resolve) return getVehicle();
				return basicGetVehicle();
			case CtlcPackage.PROGNOSIS_OVERRIDE__PROGNOSIS:
				if (resolve) return getPrognosis();
				return basicGetPrognosis();
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
			case CtlcPackage.PROGNOSIS_OVERRIDE__VEHICLE:
				setVehicle((Vehicle)newValue);
				return;
			case CtlcPackage.PROGNOSIS_OVERRIDE__PROGNOSIS:
				setPrognosis((PrognosisArrivalAndPosition)newValue);
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
			case CtlcPackage.PROGNOSIS_OVERRIDE__VEHICLE:
				setVehicle((Vehicle)null);
				return;
			case CtlcPackage.PROGNOSIS_OVERRIDE__PROGNOSIS:
				setPrognosis((PrognosisArrivalAndPosition)null);
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
			case CtlcPackage.PROGNOSIS_OVERRIDE__VEHICLE:
				return vehicle != null;
			case CtlcPackage.PROGNOSIS_OVERRIDE__PROGNOSIS:
				return prognosis != null;
		}
		return super.eIsSet(featureID);
	}

} //PrognosisOverrideImpl
