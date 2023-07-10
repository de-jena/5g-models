/**
 */
package de.inavet.smarttrains.das.interfaces.lm;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link de.inavet.smarttrains.das.interfaces.lm.ElectricalLoad#getDrivePower <em>Drive Power</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.lm.ElectricalLoad#getAuxiliaryPower <em>Auxiliary Power</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.lm.LmPackage#getElectricalLoad()
 * @model
 * @generated
 */
public interface ElectricalLoad extends EObject {
	/**
	 * Returns the value of the '<em><b>Drive Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drive Power</em>' attribute.
	 * @see #setDrivePower(double)
	 * @see de.inavet.smarttrains.das.interfaces.lm.LmPackage#getElectricalLoad_DrivePower()
	 * @model required="true"
	 * @generated
	 */
	double getDrivePower();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.lm.ElectricalLoad#getDrivePower <em>Drive Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drive Power</em>' attribute.
	 * @see #getDrivePower()
	 * @generated
	 */
	void setDrivePower(double value);

	/**
	 * Returns the value of the '<em><b>Auxiliary Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary Power</em>' attribute.
	 * @see #setAuxiliaryPower(double)
	 * @see de.inavet.smarttrains.das.interfaces.lm.LmPackage#getElectricalLoad_AuxiliaryPower()
	 * @model required="true"
	 * @generated
	 */
	double getAuxiliaryPower();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.lm.ElectricalLoad#getAuxiliaryPower <em>Auxiliary Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auxiliary Power</em>' attribute.
	 * @see #getAuxiliaryPower()
	 * @generated
	 */
	void setAuxiliaryPower(double value);

} // ElectricalLoad
