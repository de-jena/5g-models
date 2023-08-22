/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc.impl;

import de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage;
import de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition;
import de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride;

import de.inavet.smarttrains.das.interfaces.utils.Vehicle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
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
	 * The cached value of the '{@link #getVehicle() <em>Vehicle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicle()
	 * @generated
	 * @ordered
	 */
	protected Vehicle vehicle;

	/**
	 * The cached value of the '{@link #getPrognosis() <em>Prognosis</em>}' containment reference.
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtlcPackage.PROGNOSIS_OVERRIDE__VEHICLE, oldVehicle, newVehicle);
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
				msgs = ((InternalEObject)vehicle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtlcPackage.PROGNOSIS_OVERRIDE__VEHICLE, null, msgs);
			if (newVehicle != null)
				msgs = ((InternalEObject)newVehicle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtlcPackage.PROGNOSIS_OVERRIDE__VEHICLE, null, msgs);
			msgs = basicSetVehicle(newVehicle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtlcPackage.PROGNOSIS_OVERRIDE__VEHICLE, newVehicle, newVehicle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisArrivalAndPosition getPrognosis() {
		return prognosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrognosis(PrognosisArrivalAndPosition newPrognosis, NotificationChain msgs) {
		PrognosisArrivalAndPosition oldPrognosis = prognosis;
		prognosis = newPrognosis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtlcPackage.PROGNOSIS_OVERRIDE__PROGNOSIS, oldPrognosis, newPrognosis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrognosis(PrognosisArrivalAndPosition newPrognosis) {
		if (newPrognosis != prognosis) {
			NotificationChain msgs = null;
			if (prognosis != null)
				msgs = ((InternalEObject)prognosis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtlcPackage.PROGNOSIS_OVERRIDE__PROGNOSIS, null, msgs);
			if (newPrognosis != null)
				msgs = ((InternalEObject)newPrognosis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtlcPackage.PROGNOSIS_OVERRIDE__PROGNOSIS, null, msgs);
			msgs = basicSetPrognosis(newPrognosis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtlcPackage.PROGNOSIS_OVERRIDE__PROGNOSIS, newPrognosis, newPrognosis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtlcPackage.PROGNOSIS_OVERRIDE__VEHICLE:
				return basicSetVehicle(null, msgs);
			case CtlcPackage.PROGNOSIS_OVERRIDE__PROGNOSIS:
				return basicSetPrognosis(null, msgs);
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
			case CtlcPackage.PROGNOSIS_OVERRIDE__VEHICLE:
				return getVehicle();
			case CtlcPackage.PROGNOSIS_OVERRIDE__PROGNOSIS:
				return getPrognosis();
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
