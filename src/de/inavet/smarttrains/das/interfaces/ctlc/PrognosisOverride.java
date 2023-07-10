/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

import de.inavet.smarttrains.das.interfaces.utils.Vehicle;

import org.eclipse.emf.ecore.EObject;

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
 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getPrognosisOverride()
 * @model
 * @generated
 */
public interface PrognosisOverride extends EObject {
	/**
	 * Returns the value of the '<em><b>Vehicle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle</em>' containment reference.
	 * @see #setVehicle(Vehicle)
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getPrognosisOverride_Vehicle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Vehicle getVehicle();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride#getVehicle <em>Vehicle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle</em>' containment reference.
	 * @see #getVehicle()
	 * @generated
	 */
	void setVehicle(Vehicle value);

	/**
	 * Returns the value of the '<em><b>Prognosis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prognosis</em>' containment reference.
	 * @see #setPrognosis(PrognosisArrivalAndPosition)
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getPrognosisOverride_Prognosis()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrognosisArrivalAndPosition getPrognosis();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride#getPrognosis <em>Prognosis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prognosis</em>' containment reference.
	 * @see #getPrognosis()
	 * @generated
	 */
	void setPrognosis(PrognosisArrivalAndPosition value);

} // PrognosisOverride
