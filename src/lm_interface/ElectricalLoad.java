/**
 */
package lm_interface;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electrical Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hilfsklasse für PrognosisForLM + PrognosisPositionAndElectricalLoad
 * drivePower -> Leistung für Antrieb
 * auxialaryPower -> Leistung für Nebenverbraucher
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lm_interface.ElectricalLoad#getDrivePower <em>Drive Power</em>}</li>
 *   <li>{@link lm_interface.ElectricalLoad#getAuxiliaryPower <em>Auxiliary Power</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectricalLoad extends MinimalEObjectImpl.Container {
	/**
	 * The default value of the '{@link #getDrivePower() <em>Drive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivePower()
	 * @generated
	 * @ordered
	 */
	protected static final double DRIVE_POWER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDrivePower() <em>Drive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivePower()
	 * @generated
	 * @ordered
	 */
	protected double drivePower = DRIVE_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuxiliaryPower() <em>Auxiliary Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryPower()
	 * @generated
	 * @ordered
	 */
	protected static final double AUXILIARY_POWER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAuxiliaryPower() <em>Auxiliary Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryPower()
	 * @generated
	 * @ordered
	 */
	protected double auxiliaryPower = AUXILIARY_POWER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalLoad() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lm_interfacePackage.Literals.ELECTRICAL_LOAD;
	}

	/**
	 * Returns the value of the '<em><b>Drive Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drive Power</em>' attribute.
	 * @see #setDrivePower(double)
	 * @generated
	 */
	public double getDrivePower() {
		return drivePower;
	}

	/**
	 * Sets the value of the '{@link lm_interface.ElectricalLoad#getDrivePower <em>Drive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newDrivePower the new value of the '<em>Drive Power</em>' attribute.
	 * @see #getDrivePower()
	 * @generated
	 */
	public void setDrivePower(double newDrivePower) {
		drivePower = newDrivePower;
	}

	/**
	 * Returns the value of the '<em><b>Auxiliary Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary Power</em>' attribute.
	 * @see #setAuxiliaryPower(double)
	 * @generated
	 */
	public double getAuxiliaryPower() {
		return auxiliaryPower;
	}

	/**
	 * Sets the value of the '{@link lm_interface.ElectricalLoad#getAuxiliaryPower <em>Auxiliary Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newAuxiliaryPower the new value of the '<em>Auxiliary Power</em>' attribute.
	 * @see #getAuxiliaryPower()
	 * @generated
	 */
	public void setAuxiliaryPower(double newAuxiliaryPower) {
		auxiliaryPower = newAuxiliaryPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Lm_interfacePackage.ELECTRICAL_LOAD__DRIVE_POWER:
				return getDrivePower();
			case Lm_interfacePackage.ELECTRICAL_LOAD__AUXILIARY_POWER:
				return getAuxiliaryPower();
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
			case Lm_interfacePackage.ELECTRICAL_LOAD__DRIVE_POWER:
				setDrivePower((Double)newValue);
				return;
			case Lm_interfacePackage.ELECTRICAL_LOAD__AUXILIARY_POWER:
				setAuxiliaryPower((Double)newValue);
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
			case Lm_interfacePackage.ELECTRICAL_LOAD__DRIVE_POWER:
				setDrivePower(DRIVE_POWER_EDEFAULT);
				return;
			case Lm_interfacePackage.ELECTRICAL_LOAD__AUXILIARY_POWER:
				setAuxiliaryPower(AUXILIARY_POWER_EDEFAULT);
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
			case Lm_interfacePackage.ELECTRICAL_LOAD__DRIVE_POWER:
				return drivePower != DRIVE_POWER_EDEFAULT;
			case Lm_interfacePackage.ELECTRICAL_LOAD__AUXILIARY_POWER:
				return auxiliaryPower != AUXILIARY_POWER_EDEFAULT;
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
		result.append(" (drivePower: ");
		result.append(drivePower);
		result.append(", auxiliaryPower: ");
		result.append(auxiliaryPower);
		result.append(')');
		return result.toString();
	}

} // ElectricalLoad
