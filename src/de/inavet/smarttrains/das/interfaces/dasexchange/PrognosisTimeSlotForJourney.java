/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prognosis Time Slot For Journey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Prognoseankunftszeiten für eine Fahrt
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney#getJourneyId <em>Journey Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney#getTimeSlotsOnJourney <em>Time Slots On Journey</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPrognosisTimeSlotForJourney()
 * @model
 * @generated
 */
public interface PrognosisTimeSlotForJourney extends EObject {
	/**
	 * Returns the value of the '<em><b>Journey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * bezogene Journey-Id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journey Id</em>' attribute.
	 * @see #setJourneyId(String)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPrognosisTimeSlotForJourney_JourneyId()
	 * @model
	 * @generated
	 */
	String getJourneyId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney#getJourneyId <em>Journey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journey Id</em>' attribute.
	 * @see #getJourneyId()
	 * @generated
	 */
	void setJourneyId(String value);

	/**
	 * Returns the value of the '<em><b>Time Slots On Journey</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prognose-Ankunftszeiten für eine Fahrt
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Slots On Journey</em>' reference list.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPrognosisTimeSlotForJourney_TimeSlotsOnJourney()
	 * @model required="true"
	 * @generated
	 */
	EList<TimeSlotOnJourney> getTimeSlotsOnJourney();

} // PrognosisTimeSlotForJourney
