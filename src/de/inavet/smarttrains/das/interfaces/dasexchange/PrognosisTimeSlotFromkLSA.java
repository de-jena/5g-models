/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import de.inavet.smarttrains.das.interfaces.utils.ValueItem;

import de.inavet.smarttrains.das.interfaces.vehicle.Vehicle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prognosis Time Slot Fromk LSA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Prognose-Freigabefenster der kLSA; Zuordnung bzw. Ordnung muss noch geklärt werden
 * Root-Objekt
 * deprecated
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA#getKeyCosts <em>Key Costs</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA#getTimeSlots <em>Time Slots</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA#getVehicles <em>Vehicles</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPrognosisTimeSlotFromkLSA()
 * @model
 * @generated
 */
public interface PrognosisTimeSlotFromkLSA extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datenbroker-Id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPrognosisTimeSlotFromkLSA_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Key Costs</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.utils.ValueItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kostenbewertung, tbd
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Costs</em>' reference list.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPrognosisTimeSlotFromkLSA_KeyCosts()
	 * @model
	 * @generated
	 */
	EList<ValueItem> getKeyCosts();

	/**
	 * Returns the value of the '<em><b>Time Slots</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitfensterangaben
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Slots</em>' reference list.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPrognosisTimeSlotFromkLSA_TimeSlots()
	 * @model
	 * @generated
	 */
	EList<TimeSlot> getTimeSlots();

	/**
	 * Returns the value of the '<em><b>Vehicles</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.vehicle.Vehicle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Welches Fahrzeug oder welche Fahrzeuge betrifft es
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicles</em>' reference list.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPrognosisTimeSlotFromkLSA_Vehicles()
	 * @model
	 * @generated
	 */
	EList<Vehicle> getVehicles();

} // PrognosisTimeSlotFromkLSA
