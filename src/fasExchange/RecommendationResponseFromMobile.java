/**
 */
package fasExchange;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 *   <li>{@link fasExchange.RecommendationResponseFromMobile#isReceivedRecommendation <em>Received Recommendation</em>}</li>
 *   <li>{@link fasExchange.RecommendationResponseFromMobile#getRecommendationId <em>Recommendation Id</em>}</li>
 *   <li>{@link fasExchange.RecommendationResponseFromMobile#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecommendationResponseFromMobile extends MinimalEObjectImpl.Container {
	/**
	 * The default value of the '{@link #isReceivedRecommendation() <em>Received Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReceivedRecommendation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RECEIVED_RECOMMENDATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReceivedRecommendation() <em>Received Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReceivedRecommendation()
	 * @generated
	 * @ordered
	 */
	protected boolean receivedRecommendation = RECEIVED_RECOMMENDATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecommendationId() <em>Recommendation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendationId()
	 * @generated
	 * @ordered
	 */
	protected static final String RECOMMENDATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecommendationId() <em>Recommendation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendationId()
	 * @generated
	 * @ordered
	 */
	protected String recommendationId = RECOMMENDATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final ZonedDateTime TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected ZonedDateTime timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecommendationResponseFromMobile() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FasExchangePackage.Literals.RECOMMENDATION_RESPONSE_FROM_MOBILE;
	}

	/**
	 * Returns the value of the '<em><b>Received Recommendation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribut zum Empfehlungserhalt auf der mobilen Seite
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Received Recommendation</em>' attribute.
	 * @see #setReceivedRecommendation(boolean)
	 * @generated
	 */
	public boolean isReceivedRecommendation() {
		return receivedRecommendation;
	}

	/**
	 * Sets the value of the '{@link fasExchange.RecommendationResponseFromMobile#isReceivedRecommendation <em>Received Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newReceivedRecommendation the new value of the '<em>Received Recommendation</em>' attribute.
	 * @see #isReceivedRecommendation()
	 * @generated
	 */
	public void setReceivedRecommendation(boolean newReceivedRecommendation) {
		receivedRecommendation = newReceivedRecommendation;
	}

	/**
	 * Returns the value of the '<em><b>Recommendation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezogene Empfehlungs-Id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recommendation Id</em>' attribute.
	 * @see #setRecommendationId(String)
	 * @generated
	 */
	public String getRecommendationId() {
		return recommendationId;
	}

	/**
	 * Sets the value of the '{@link fasExchange.RecommendationResponseFromMobile#getRecommendationId <em>Recommendation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRecommendationId the new value of the '<em>Recommendation Id</em>' attribute.
	 * @see #getRecommendationId()
	 * @generated
	 */
	public void setRecommendationId(String newRecommendationId) {
		recommendationId = newRecommendationId;
	}

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitstempel der Antwortsübermittlung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(ZonedDateTime)
	 * @generated
	 */
	public ZonedDateTime getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the value of the '{@link fasExchange.RecommendationResponseFromMobile#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTimestamp the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	public void setTimestamp(ZonedDateTime newTimestamp) {
		timestamp = newTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FasExchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__RECEIVED_RECOMMENDATION:
				return isReceivedRecommendation();
			case FasExchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__RECOMMENDATION_ID:
				return getRecommendationId();
			case FasExchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__TIMESTAMP:
				return getTimestamp();
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
			case FasExchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__RECEIVED_RECOMMENDATION:
				setReceivedRecommendation((Boolean)newValue);
				return;
			case FasExchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__RECOMMENDATION_ID:
				setRecommendationId((String)newValue);
				return;
			case FasExchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__TIMESTAMP:
				setTimestamp((ZonedDateTime)newValue);
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
			case FasExchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__RECEIVED_RECOMMENDATION:
				setReceivedRecommendation(RECEIVED_RECOMMENDATION_EDEFAULT);
				return;
			case FasExchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__RECOMMENDATION_ID:
				setRecommendationId(RECOMMENDATION_ID_EDEFAULT);
				return;
			case FasExchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
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
			case FasExchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__RECEIVED_RECOMMENDATION:
				return receivedRecommendation != RECEIVED_RECOMMENDATION_EDEFAULT;
			case FasExchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__RECOMMENDATION_ID:
				return RECOMMENDATION_ID_EDEFAULT == null ? recommendationId != null : !RECOMMENDATION_ID_EDEFAULT.equals(recommendationId);
			case FasExchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
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
		result.append(" (receivedRecommendation: ");
		result.append(receivedRecommendation);
		result.append(", recommendationId: ");
		result.append(recommendationId);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} // RecommendationResponseFromMobile
