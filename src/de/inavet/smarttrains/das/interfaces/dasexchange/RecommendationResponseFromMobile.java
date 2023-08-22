/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recommendation Response From Mobile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Antwort / Quittierung der mobilen Seite auf die Empfehlung
 * Root-Objekt
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile#isReceivedRecommendation <em>Received Recommendation</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile#getRecommendationId <em>Recommendation Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getRecommendationResponseFromMobile()
 * @model
 * @generated
 */
public interface RecommendationResponseFromMobile extends EObject {
	/**
	 * Returns the value of the '<em><b>Received Recommendation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribut zum Empfehlungserhalt auf der mobilen Seite
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Received Recommendation</em>' attribute.
	 * @see #setReceivedRecommendation(boolean)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getRecommendationResponseFromMobile_ReceivedRecommendation()
	 * @model required="true"
	 * @generated
	 */
	boolean isReceivedRecommendation();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile#isReceivedRecommendation <em>Received Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Recommendation</em>' attribute.
	 * @see #isReceivedRecommendation()
	 * @generated
	 */
	void setReceivedRecommendation(boolean value);

	/**
	 * Returns the value of the '<em><b>Recommendation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezogene Empfehlungs-Id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recommendation Id</em>' attribute.
	 * @see #setRecommendationId(String)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getRecommendationResponseFromMobile_RecommendationId()
	 * @model required="true"
	 * @generated
	 */
	String getRecommendationId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile#getRecommendationId <em>Recommendation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommendation Id</em>' attribute.
	 * @see #getRecommendationId()
	 * @generated
	 */
	void setRecommendationId(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitstempel der Antwortsübermittlung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(ZonedDateTime)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getRecommendationResponseFromMobile_Timestamp()
	 * @model dataType="de.inavet.smarttrains.das.interfaces.utils.ZonedDateTime" required="true"
	 * @generated
	 */
	ZonedDateTime getTimestamp();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(ZonedDateTime value);

} // RecommendationResponseFromMobile
