/**
 */
package de.inavet.smarttrains.das.interfaces.lm.impl;

import de.inavet.smarttrains.das.interfaces.lm.ElectricalLoad;
import de.inavet.smarttrains.das.interfaces.lm.LmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electrical Load</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.lm.impl.ElectricalLoadImpl#getDrivePower <em>Drive Power</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.lm.impl.ElectricalLoadImpl#getAuxiliaryPower <em>Auxiliary Power</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectricalLoadImpl extends MinimalEObjectImpl.Container implements ElectricalLoad {
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
	protected ElectricalLoadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LmPackage.Literals.ELECTRICAL_LOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDrivePower() {
		return drivePower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrivePower(double newDrivePower) {
		double oldDrivePower = drivePower;
		drivePower = newDrivePower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LmPackage.ELECTRICAL_LOAD__DRIVE_POWER, oldDrivePower, drivePower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAuxiliaryPower() {
		return auxiliaryPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuxiliaryPower(double newAuxiliaryPower) {
		double oldAuxiliaryPower = auxiliaryPower;
		auxiliaryPower = newAuxiliaryPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LmPackage.ELECTRICAL_LOAD__AUXILIARY_POWER, oldAuxiliaryPower, auxiliaryPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LmPackage.ELECTRICAL_LOAD__DRIVE_POWER:
				return getDrivePower();
			case LmPackage.ELECTRICAL_LOAD__AUXILIARY_POWER:
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
			case LmPackage.ELECTRICAL_LOAD__DRIVE_POWER:
				setDrivePower((Double)newValue);
				return;
			case LmPackage.ELECTRICAL_LOAD__AUXILIARY_POWER:
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
			case LmPackage.ELECTRICAL_LOAD__DRIVE_POWER:
				setDrivePower(DRIVE_POWER_EDEFAULT);
				return;
			case LmPackage.ELECTRICAL_LOAD__AUXILIARY_POWER:
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
			case LmPackage.ELECTRICAL_LOAD__DRIVE_POWER:
				return drivePower != DRIVE_POWER_EDEFAULT;
			case LmPackage.ELECTRICAL_LOAD__AUXILIARY_POWER:
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

} //ElectricalLoadImpl
