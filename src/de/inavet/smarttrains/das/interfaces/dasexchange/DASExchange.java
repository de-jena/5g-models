/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import de.inavet.smarttrains.das.interfaces.utils.DASStatus;
import de.inavet.smarttrains.das.interfaces.utils.GNSSStatus;

import java.time.ZonedDateTime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAS Exchange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * FAS-Austausch zwischen zentraler und mobiler Instanz
 * wird vermutlich noch angepasst bzw. erweitert
 * Root-Objekt
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getJourneyId <em>Journey Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getTrajectory <em>Trajectory</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getRecommendation <em>Recommendation</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getGnssStatus <em>Gnss Status</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getFasStatus <em>Fas Status</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getTimeSlotsOnJourney <em>Time Slots On Journey</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getDASExchange()
 * @model
 * @generated
 */
public interface DASExchange extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datenbrokr-id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getDASExchange_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getId <em>Id</em>}' attribute.
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
	 * journey-id zur Zuordnung der Informationen für die Fahrt
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journey Id</em>' attribute.
	 * @see #setJourneyId(String)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getDASExchange_JourneyId()
	 * @model required="true"
	 * @generated
	 */
	String getJourneyId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getJourneyId <em>Journey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journey Id</em>' attribute.
	 * @see #getJourneyId()
	 * @generated
	 */
	void setJourneyId(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitstempel der Datenübermittlung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(ZonedDateTime)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getDASExchange_Timestamp()
	 * @model dataType="de.inavet.smarttrains.das.interfaces.utils.ZonedDateTime" required="true"
	 * @generated
	 */
	ZonedDateTime getTimestamp();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(ZonedDateTime value);

	/**
	 * Returns the value of the '<em><b>Trajectory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trajektorie für die Journey
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trajectory</em>' reference.
	 * @see #setTrajectory(Trajectory)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getDASExchange_Trajectory()
	 * @model
	 * @generated
	 */
	Trajectory getTrajectory();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getTrajectory <em>Trajectory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trajectory</em>' reference.
	 * @see #getTrajectory()
	 * @generated
	 */
	void setTrajectory(Trajectory value);

	/**
	 * Returns the value of the '<em><b>Recommendation</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * aktuelle Empfehlung für die Journey
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recommendation</em>' reference list.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getDASExchange_Recommendation()
	 * @model
	 * @generated
	 */
	EList<Recommendation> getRecommendation();

	/**
	 * Returns the value of the '<em><b>Gnss Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.inavet.smarttrains.das.interfaces.utils.GNSSStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * aktueller GNSS-Status zur Übermittlung an die Mobilseite
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gnss Status</em>' attribute.
	 * @see de.inavet.smarttrains.das.interfaces.utils.GNSSStatus
	 * @see #setGnssStatus(GNSSStatus)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getDASExchange_GnssStatus()
	 * @model required="true"
	 * @generated
	 */
	GNSSStatus getGnssStatus();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getGnssStatus <em>Gnss Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gnss Status</em>' attribute.
	 * @see de.inavet.smarttrains.das.interfaces.utils.GNSSStatus
	 * @see #getGnssStatus()
	 * @generated
	 */
	void setGnssStatus(GNSSStatus value);

	/**
	 * Returns the value of the '<em><b>Fas Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.inavet.smarttrains.das.interfaces.utils.DASStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * aktueller FAS-Status zur Übermittlung an die Mobilseite
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fas Status</em>' attribute.
	 * @see de.inavet.smarttrains.das.interfaces.utils.DASStatus
	 * @see #setFasStatus(DASStatus)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getDASExchange_FasStatus()
	 * @model required="true"
	 * @generated
	 */
	DASStatus getFasStatus();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getFasStatus <em>Fas Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fas Status</em>' attribute.
	 * @see de.inavet.smarttrains.das.interfaces.utils.DASStatus
	 * @see #getFasStatus()
	 * @generated
	 */
	void setFasStatus(DASStatus value);

	/**
	 * Returns the value of the '<em><b>Time Slots On Journey</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitpunkte und Orte des aktuellen Prognosezustandes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Slots On Journey</em>' reference list.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getDASExchange_TimeSlotsOnJourney()
	 * @model required="true"
	 * @generated
	 */
	EList<TimeSlotOnJourney> getTimeSlotsOnJourney();

} // DASExchange
