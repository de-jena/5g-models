/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

import de.inavet.smarttrains.das.interfaces.vehicle.Vehicle;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prognosis Override</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride#getPrognosis <em>Prognosis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrognosisOverride extends MinimalEObjectImpl.Container {
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
	protected PrognosisOverride() {
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
	 * Returns the value of the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle</em>' reference.
	 * @see #setVehicle(Vehicle)
	 * @generated
	 */
	public Vehicle getVehicle() {
		if (vehicle != null && ((EObject)vehicle).eIsProxy()) {
			InternalEObject oldVehicle = vehicle;
			vehicle = (Vehicle)eResolveProxy(oldVehicle);
			if (vehicle != oldVehicle) {
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
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride#getVehicle <em>Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newVehicle the new value of the '<em>Vehicle</em>' reference.
	 * @see #getVehicle()
	 * @generated
	 */
	public void setVehicle(Vehicle newVehicle) {
		vehicle = newVehicle;
	}

	/**
	 * Returns the value of the '<em><b>Prognosis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prognosis</em>' reference.
	 * @see #setPrognosis(PrognosisArrivalAndPosition)
	 * @generated
	 */
	public PrognosisArrivalAndPosition getPrognosis() {
		if (prognosis != null && ((EObject)prognosis).eIsProxy()) {
			InternalEObject oldPrognosis = prognosis;
			prognosis = (PrognosisArrivalAndPosition)eResolveProxy(oldPrognosis);
			if (prognosis != oldPrognosis) {
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
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride#getPrognosis <em>Prognosis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newPrognosis the new value of the '<em>Prognosis</em>' reference.
	 * @see #getPrognosis()
	 * @generated
	 */
	public void setPrognosis(PrognosisArrivalAndPosition newPrognosis) {
		prognosis = newPrognosis;
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

} // PrognosisOverride
