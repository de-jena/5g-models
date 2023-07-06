/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import de.inavet.smarttrains.das.interfaces.vehicle.Vehicle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prognosis For Vehicle Power Demand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Fahrzeugleistungsbedarf für Lastmanagement
 * Root-Objekt
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisForVehiclePowerDemand#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisForVehiclePowerDemand#getKeyVehicles <em>Key Vehicles</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisForVehiclePowerDemand#getPowerDemandOverPositions <em>Power Demand Over Positions</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisForVehiclePowerDemand#getPowerDemandOverTimes <em>Power Demand Over Times</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPrognosisForVehiclePowerDemand()
 * @model
 * @generated
 */
public interface PrognosisForVehiclePowerDemand extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datenbroker-Id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPrognosisForVehiclePowerDemand_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisForVehiclePowerDemand#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Key Vehicles</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.vehicle.Vehicle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Welche Fahrzeuge
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Vehicles</em>' reference list.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPrognosisForVehiclePowerDemand_KeyVehicles()
	 * @model
	 * @generated
	 */
	EList<Vehicle> getKeyVehicles();

	/**
	 * Returns the value of the '<em><b>Power Demand Over Positions</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Welcher Leistungsbedarf besteht an welcher Position für das Fahrzeug
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Demand Over Positions</em>' reference list.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPrognosisForVehiclePowerDemand_PowerDemandOverPositions()
	 * @model
	 * @generated
	 */
	EList<PowerDemandOverPosition> getPowerDemandOverPositions();

	/**
	 * Returns the value of the '<em><b>Power Demand Over Times</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Welcher Leistungsbedarf besteht zu welchen Zeitpunkt für das Fahrzeug
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Demand Over Times</em>' reference list.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPrognosisForVehiclePowerDemand_PowerDemandOverTimes()
	 * @model
	 * @generated
	 */
	EList<PowerDemandOverTime> getPowerDemandOverTimes();

} // PrognosisForVehiclePowerDemand
