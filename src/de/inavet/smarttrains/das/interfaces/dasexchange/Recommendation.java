/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import de.inavet.smarttrains.das.interfaces.utils.RecommendationTypes;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recommendation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Empfehlungsübermittlungsklasse
 * Root-Objekt, aber auch in der FASExchange vorgesehen
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getJourneyId <em>Journey Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getTargetSpeed <em>Target Speed</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getCountdownForDeparture <em>Countdown For Departure</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getRecommendationType <em>Recommendation Type</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getStartTimeForInformationOrRecommendation <em>Start Time For Information Or Recommendation</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getRecommendation()
 * @model
 * @generated
 */
public interface Recommendation extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datenbroker-id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getRecommendation_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Journey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * betreffende Journey-Id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journey Id</em>' attribute.
	 * @see #setJourneyId(String)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getRecommendation_JourneyId()
	 * @model required="true"
	 * @generated
	 */
	String getJourneyId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getJourneyId <em>Journey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journey Id</em>' attribute.
	 * @see #getJourneyId()
	 * @generated
	 */
	void setJourneyId(String value);

	/**
	 * Returns the value of the '<em><b>Target Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zielgeschwindigkeit für Fahrzeug und zur Empfehlungsanzeige
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Speed</em>' attribute.
	 * @see #setTargetSpeed(int)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getRecommendation_TargetSpeed()
	 * @model required="true"
	 * @generated
	 */
	int getTargetSpeed();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getTargetSpeed <em>Target Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Speed</em>' attribute.
	 * @see #getTargetSpeed()
	 * @generated
	 */
	void setTargetSpeed(int value);

	/**
	 * Returns the value of the '<em><b>Countdown For Departure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abfertigungscountdown
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Countdown For Departure</em>' attribute.
	 * @see #setCountdownForDeparture(int)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getRecommendation_CountdownForDeparture()
	 * @model required="true"
	 * @generated
	 */
	int getCountdownForDeparture();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getCountdownForDeparture <em>Countdown For Departure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Countdown For Departure</em>' attribute.
	 * @see #getCountdownForDeparture()
	 * @generated
	 */
	void setCountdownForDeparture(int value);

	/**
	 * Returns the value of the '<em><b>Recommendation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.inavet.smarttrains.das.interfaces.utils.RecommendationTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Empfehlungstyp
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recommendation Type</em>' attribute.
	 * @see de.inavet.smarttrains.das.interfaces.utils.RecommendationTypes
	 * @see #setRecommendationType(RecommendationTypes)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getRecommendation_RecommendationType()
	 * @model required="true"
	 * @generated
	 */
	RecommendationTypes getRecommendationType();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getRecommendationType <em>Recommendation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommendation Type</em>' attribute.
	 * @see de.inavet.smarttrains.das.interfaces.utils.RecommendationTypes
	 * @see #getRecommendationType()
	 * @generated
	 */
	void setRecommendationType(RecommendationTypes value);

	/**
	 * Returns the value of the '<em><b>Start Time For Information Or Recommendation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beginn der Empfehlung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Time For Information Or Recommendation</em>' attribute.
	 * @see #setStartTimeForInformationOrRecommendation(ZonedDateTime)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getRecommendation_StartTimeForInformationOrRecommendation()
	 * @model dataType="de.inavet.smarttrains.das.interfaces.utils.ZonedDateTime" required="true"
	 * @generated
	 */
	ZonedDateTime getStartTimeForInformationOrRecommendation();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getStartTimeForInformationOrRecommendation <em>Start Time For Information Or Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time For Information Or Recommendation</em>' attribute.
	 * @see #getStartTimeForInformationOrRecommendation()
	 * @generated
	 */
	void setStartTimeForInformationOrRecommendation(ZonedDateTime value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitstempel der Datenübermittlung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(ZonedDateTime)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getRecommendation_Timestamp()
	 * @model dataType="de.inavet.smarttrains.das.interfaces.utils.ZonedDateTime" required="true"
	 * @generated
	 */
	ZonedDateTime getTimestamp();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(ZonedDateTime value);

} // Recommendation
