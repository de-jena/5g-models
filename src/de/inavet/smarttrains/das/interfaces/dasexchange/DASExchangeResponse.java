/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAS Exchange Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Quittierung / Antwort der mobilen Seite auf FASExchange
 * Rootobjekt
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getDasExchangeIdToResponse <em>Das Exchange Id To Response</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getJourneyId <em>Journey Id</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getDASExchangeResponse()
 * @model
 * @generated
 */
public interface DASExchangeResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datenbroker-Id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getDASExchangeResponse_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitstempel der Antwortübermittlung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(ZonedDateTime)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getDASExchangeResponse_Timestamp()
	 * @model dataType="de.inavet.smarttrains.das.interfaces.utils.ZonedDateTime" required="true"
	 * @generated
	 */
	ZonedDateTime getTimestamp();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(ZonedDateTime value);

	/**
	 * Returns the value of the '<em><b>Das Exchange Id To Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Antwort-Id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Das Exchange Id To Response</em>' attribute.
	 * @see #setDasExchangeIdToResponse(String)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getDASExchangeResponse_DasExchangeIdToResponse()
	 * @model required="true"
	 * @generated
	 */
	String getDasExchangeIdToResponse();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getDasExchangeIdToResponse <em>Das Exchange Id To Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Das Exchange Id To Response</em>' attribute.
	 * @see #getDasExchangeIdToResponse()
	 * @generated
	 */
	void setDasExchangeIdToResponse(String value);

	/**
	 * Returns the value of the '<em><b>Journey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * betreffende Journeyid
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journey Id</em>' attribute.
	 * @see #setJourneyId(String)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getDASExchangeResponse_JourneyId()
	 * @model required="true"
	 * @generated
	 */
	String getJourneyId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getJourneyId <em>Journey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journey Id</em>' attribute.
	 * @see #getJourneyId()
	 * @generated
	 */
	void setJourneyId(String value);

} // DASExchangeResponse
