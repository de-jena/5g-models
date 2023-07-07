/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import de.inavet.smarttrains.das.interfaces.utils.RecommendationTypes;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 * @generated
 */
public class Recommendation extends MinimalEObjectImpl.Container {
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
	 * The default value of the '{@link #getTargetSpeed() <em>Target Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final int TARGET_SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTargetSpeed() <em>Target Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSpeed()
	 * @generated
	 * @ordered
	 */
	protected int targetSpeed = TARGET_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountdownForDeparture() <em>Countdown For Departure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountdownForDeparture()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNTDOWN_FOR_DEPARTURE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCountdownForDeparture() <em>Countdown For Departure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountdownForDeparture()
	 * @generated
	 * @ordered
	 */
	protected int countdownForDeparture = COUNTDOWN_FOR_DEPARTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecommendationType() <em>Recommendation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendationType()
	 * @generated
	 * @ordered
	 */
	protected static final RecommendationTypes RECOMMENDATION_TYPE_EDEFAULT = RecommendationTypes.DISPATCH;

	/**
	 * The cached value of the '{@link #getRecommendationType() <em>Recommendation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendationType()
	 * @generated
	 * @ordered
	 */
	protected RecommendationTypes recommendationType = RECOMMENDATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTimeForInformationOrRecommendation() <em>Start Time For Information Or Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTimeForInformationOrRecommendation()
	 * @generated
	 * @ordered
	 */
	protected static final ZonedDateTime START_TIME_FOR_INFORMATION_OR_RECOMMENDATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTimeForInformationOrRecommendation() <em>Start Time For Information Or Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTimeForInformationOrRecommendation()
	 * @generated
	 * @ordered
	 */
	protected ZonedDateTime startTimeForInformationOrRecommendation = START_TIME_FOR_INFORMATION_OR_RECOMMENDATION_EDEFAULT;

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
	protected Recommendation() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DasexchangePackage.Literals.RECOMMENDATION;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datenbroker-id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getId <em>Id</em>}' attribute.
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
	 * Returns the value of the '<em><b>Journey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * betreffende Journey-Id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journey Id</em>' attribute.
	 * @see #setJourneyId(String)
	 * @generated
	 */
	public String getJourneyId() {
		return journeyId;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getJourneyId <em>Journey Id</em>}' attribute.
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
	 * Returns the value of the '<em><b>Target Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zielgeschwindigkeit für Fahrzeug und zur Empfehlungsanzeige
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Speed</em>' attribute.
	 * @see #setTargetSpeed(int)
	 * @generated
	 */
	public int getTargetSpeed() {
		return targetSpeed;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getTargetSpeed <em>Target Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTargetSpeed the new value of the '<em>Target Speed</em>' attribute.
	 * @see #getTargetSpeed()
	 * @generated
	 */
	public void setTargetSpeed(int newTargetSpeed) {
		targetSpeed = newTargetSpeed;
	}

	/**
	 * Returns the value of the '<em><b>Countdown For Departure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abfertigungscountdown
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Countdown For Departure</em>' attribute.
	 * @see #setCountdownForDeparture(int)
	 * @generated
	 */
	public int getCountdownForDeparture() {
		return countdownForDeparture;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getCountdownForDeparture <em>Countdown For Departure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newCountdownForDeparture the new value of the '<em>Countdown For Departure</em>' attribute.
	 * @see #getCountdownForDeparture()
	 * @generated
	 */
	public void setCountdownForDeparture(int newCountdownForDeparture) {
		countdownForDeparture = newCountdownForDeparture;
	}

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
	 * @generated
	 */
	public RecommendationTypes getRecommendationType() {
		return recommendationType;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getRecommendationType <em>Recommendation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRecommendationType the new value of the '<em>Recommendation Type</em>' attribute.
	 * @see de.inavet.smarttrains.das.interfaces.utils.RecommendationTypes
	 * @see #getRecommendationType()
	 * @generated
	 */
	public void setRecommendationType(RecommendationTypes newRecommendationType) {
		recommendationType = newRecommendationType == null ? RECOMMENDATION_TYPE_EDEFAULT : newRecommendationType;
	}

	/**
	 * Returns the value of the '<em><b>Start Time For Information Or Recommendation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beginn der Empfehlung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Time For Information Or Recommendation</em>' attribute.
	 * @see #setStartTimeForInformationOrRecommendation(ZonedDateTime)
	 * @generated
	 */
	public ZonedDateTime getStartTimeForInformationOrRecommendation() {
		return startTimeForInformationOrRecommendation;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getStartTimeForInformationOrRecommendation <em>Start Time For Information Or Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newStartTimeForInformationOrRecommendation the new value of the '<em>Start Time For Information Or Recommendation</em>' attribute.
	 * @see #getStartTimeForInformationOrRecommendation()
	 * @generated
	 */
	public void setStartTimeForInformationOrRecommendation(ZonedDateTime newStartTimeForInformationOrRecommendation) {
		startTimeForInformationOrRecommendation = newStartTimeForInformationOrRecommendation;
	}

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitstempel der Datenübermittlung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(ZonedDateTime)
	 * @generated
	 */
	public ZonedDateTime getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getTimestamp <em>Timestamp</em>}' attribute.
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
			case DasexchangePackage.RECOMMENDATION__ID:
				return getId();
			case DasexchangePackage.RECOMMENDATION__JOURNEY_ID:
				return getJourneyId();
			case DasexchangePackage.RECOMMENDATION__TARGET_SPEED:
				return getTargetSpeed();
			case DasexchangePackage.RECOMMENDATION__COUNTDOWN_FOR_DEPARTURE:
				return getCountdownForDeparture();
			case DasexchangePackage.RECOMMENDATION__RECOMMENDATION_TYPE:
				return getRecommendationType();
			case DasexchangePackage.RECOMMENDATION__START_TIME_FOR_INFORMATION_OR_RECOMMENDATION:
				return getStartTimeForInformationOrRecommendation();
			case DasexchangePackage.RECOMMENDATION__TIMESTAMP:
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
			case DasexchangePackage.RECOMMENDATION__ID:
				setId((String)newValue);
				return;
			case DasexchangePackage.RECOMMENDATION__JOURNEY_ID:
				setJourneyId((String)newValue);
				return;
			case DasexchangePackage.RECOMMENDATION__TARGET_SPEED:
				setTargetSpeed((Integer)newValue);
				return;
			case DasexchangePackage.RECOMMENDATION__COUNTDOWN_FOR_DEPARTURE:
				setCountdownForDeparture((Integer)newValue);
				return;
			case DasexchangePackage.RECOMMENDATION__RECOMMENDATION_TYPE:
				setRecommendationType((RecommendationTypes)newValue);
				return;
			case DasexchangePackage.RECOMMENDATION__START_TIME_FOR_INFORMATION_OR_RECOMMENDATION:
				setStartTimeForInformationOrRecommendation((ZonedDateTime)newValue);
				return;
			case DasexchangePackage.RECOMMENDATION__TIMESTAMP:
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
			case DasexchangePackage.RECOMMENDATION__ID:
				setId(ID_EDEFAULT);
				return;
			case DasexchangePackage.RECOMMENDATION__JOURNEY_ID:
				setJourneyId(JOURNEY_ID_EDEFAULT);
				return;
			case DasexchangePackage.RECOMMENDATION__TARGET_SPEED:
				setTargetSpeed(TARGET_SPEED_EDEFAULT);
				return;
			case DasexchangePackage.RECOMMENDATION__COUNTDOWN_FOR_DEPARTURE:
				setCountdownForDeparture(COUNTDOWN_FOR_DEPARTURE_EDEFAULT);
				return;
			case DasexchangePackage.RECOMMENDATION__RECOMMENDATION_TYPE:
				setRecommendationType(RECOMMENDATION_TYPE_EDEFAULT);
				return;
			case DasexchangePackage.RECOMMENDATION__START_TIME_FOR_INFORMATION_OR_RECOMMENDATION:
				setStartTimeForInformationOrRecommendation(START_TIME_FOR_INFORMATION_OR_RECOMMENDATION_EDEFAULT);
				return;
			case DasexchangePackage.RECOMMENDATION__TIMESTAMP:
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
			case DasexchangePackage.RECOMMENDATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DasexchangePackage.RECOMMENDATION__JOURNEY_ID:
				return JOURNEY_ID_EDEFAULT == null ? journeyId != null : !JOURNEY_ID_EDEFAULT.equals(journeyId);
			case DasexchangePackage.RECOMMENDATION__TARGET_SPEED:
				return targetSpeed != TARGET_SPEED_EDEFAULT;
			case DasexchangePackage.RECOMMENDATION__COUNTDOWN_FOR_DEPARTURE:
				return countdownForDeparture != COUNTDOWN_FOR_DEPARTURE_EDEFAULT;
			case DasexchangePackage.RECOMMENDATION__RECOMMENDATION_TYPE:
				return recommendationType != RECOMMENDATION_TYPE_EDEFAULT;
			case DasexchangePackage.RECOMMENDATION__START_TIME_FOR_INFORMATION_OR_RECOMMENDATION:
				return START_TIME_FOR_INFORMATION_OR_RECOMMENDATION_EDEFAULT == null ? startTimeForInformationOrRecommendation != null : !START_TIME_FOR_INFORMATION_OR_RECOMMENDATION_EDEFAULT.equals(startTimeForInformationOrRecommendation);
			case DasexchangePackage.RECOMMENDATION__TIMESTAMP:
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
		result.append(" (id: ");
		result.append(id);
		result.append(", journeyId: ");
		result.append(journeyId);
		result.append(", targetSpeed: ");
		result.append(targetSpeed);
		result.append(", countdownForDeparture: ");
		result.append(countdownForDeparture);
		result.append(", recommendationType: ");
		result.append(recommendationType);
		result.append(", startTimeForInformationOrRecommendation: ");
		result.append(startTimeForInformationOrRecommendation);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} // Recommendation
