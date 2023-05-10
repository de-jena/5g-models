/**
 */
package fasExchange;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FAS Exchange Response</b></em>'.
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
 *   <li>{@link fasExchange.FASExchangeResponse#getId <em>Id</em>}</li>
 *   <li>{@link fasExchange.FASExchangeResponse#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link fasExchange.FASExchangeResponse#getFasExchangeIdToResponse <em>Fas Exchange Id To Response</em>}</li>
 *   <li>{@link fasExchange.FASExchangeResponse#getJourneyId <em>Journey Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FASExchangeResponse extends MinimalEObjectImpl.Container {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getFasExchangeIdToResponse() <em>Fas Exchange Id To Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFasExchangeIdToResponse()
	 * @generated
	 * @ordered
	 */
	protected static final String FAS_EXCHANGE_ID_TO_RESPONSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFasExchangeIdToResponse() <em>Fas Exchange Id To Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFasExchangeIdToResponse()
	 * @generated
	 * @ordered
	 */
	protected String fasExchangeIdToResponse = FAS_EXCHANGE_ID_TO_RESPONSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJourneyId() <em>Journey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneyId()
	 * @generated
	 * @ordered
	 */
	protected static final String JOURNEY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJourneyId() <em>Journey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneyId()
	 * @generated
	 * @ordered
	 */
	protected String journeyId = JOURNEY_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FASExchangeResponse() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FasExchangePackage.Literals.FAS_EXCHANGE_RESPONSE;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datenbroker-Id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the '{@link fasExchange.FASExchangeResponse#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(String newId) {
		id = newId;
	}

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitstempel der Antwortübermittlung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(ZonedDateTime)
	 * @generated
	 */
	public ZonedDateTime getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the value of the '{@link fasExchange.FASExchangeResponse#getTimestamp <em>Timestamp</em>}' attribute.
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
	 * Returns the value of the '<em><b>Fas Exchange Id To Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Antwort-Id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fas Exchange Id To Response</em>' attribute.
	 * @see #setFasExchangeIdToResponse(String)
	 * @generated
	 */
	public String getFasExchangeIdToResponse() {
		return fasExchangeIdToResponse;
	}

	/**
	 * Sets the value of the '{@link fasExchange.FASExchangeResponse#getFasExchangeIdToResponse <em>Fas Exchange Id To Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFasExchangeIdToResponse the new value of the '<em>Fas Exchange Id To Response</em>' attribute.
	 * @see #getFasExchangeIdToResponse()
	 * @generated
	 */
	public void setFasExchangeIdToResponse(String newFasExchangeIdToResponse) {
		fasExchangeIdToResponse = newFasExchangeIdToResponse;
	}

	/**
	 * Returns the value of the '<em><b>Journey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * betreffende Journeyid
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journey Id</em>' attribute.
	 * @see #setJourneyId(String)
	 * @generated
	 */
	public String getJourneyId() {
		return journeyId;
	}

	/**
	 * Sets the value of the '{@link fasExchange.FASExchangeResponse#getJourneyId <em>Journey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newJourneyId the new value of the '<em>Journey Id</em>' attribute.
	 * @see #getJourneyId()
	 * @generated
	 */
	public void setJourneyId(String newJourneyId) {
		journeyId = newJourneyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FasExchangePackage.FAS_EXCHANGE_RESPONSE__ID:
				return getId();
			case FasExchangePackage.FAS_EXCHANGE_RESPONSE__TIMESTAMP:
				return getTimestamp();
			case FasExchangePackage.FAS_EXCHANGE_RESPONSE__FAS_EXCHANGE_ID_TO_RESPONSE:
				return getFasExchangeIdToResponse();
			case FasExchangePackage.FAS_EXCHANGE_RESPONSE__JOURNEY_ID:
				return getJourneyId();
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
			case FasExchangePackage.FAS_EXCHANGE_RESPONSE__ID:
				setId((String)newValue);
				return;
			case FasExchangePackage.FAS_EXCHANGE_RESPONSE__TIMESTAMP:
				setTimestamp((ZonedDateTime)newValue);
				return;
			case FasExchangePackage.FAS_EXCHANGE_RESPONSE__FAS_EXCHANGE_ID_TO_RESPONSE:
				setFasExchangeIdToResponse((String)newValue);
				return;
			case FasExchangePackage.FAS_EXCHANGE_RESPONSE__JOURNEY_ID:
				setJourneyId((String)newValue);
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
			case FasExchangePackage.FAS_EXCHANGE_RESPONSE__ID:
				setId(ID_EDEFAULT);
				return;
			case FasExchangePackage.FAS_EXCHANGE_RESPONSE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case FasExchangePackage.FAS_EXCHANGE_RESPONSE__FAS_EXCHANGE_ID_TO_RESPONSE:
				setFasExchangeIdToResponse(FAS_EXCHANGE_ID_TO_RESPONSE_EDEFAULT);
				return;
			case FasExchangePackage.FAS_EXCHANGE_RESPONSE__JOURNEY_ID:
				setJourneyId(JOURNEY_ID_EDEFAULT);
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
			case FasExchangePackage.FAS_EXCHANGE_RESPONSE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case FasExchangePackage.FAS_EXCHANGE_RESPONSE__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case FasExchangePackage.FAS_EXCHANGE_RESPONSE__FAS_EXCHANGE_ID_TO_RESPONSE:
				return FAS_EXCHANGE_ID_TO_RESPONSE_EDEFAULT == null ? fasExchangeIdToResponse != null : !FAS_EXCHANGE_ID_TO_RESPONSE_EDEFAULT.equals(fasExchangeIdToResponse);
			case FasExchangePackage.FAS_EXCHANGE_RESPONSE__JOURNEY_ID:
				return JOURNEY_ID_EDEFAULT == null ? journeyId != null : !JOURNEY_ID_EDEFAULT.equals(journeyId);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", fasExchangeIdToResponse: ");
		result.append(fasExchangeIdToResponse);
		result.append(", journeyId: ");
		result.append(journeyId);
		result.append(')');
		return result.toString();
	}

} // FASExchangeResponse
