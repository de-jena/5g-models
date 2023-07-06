/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange.impl;

import de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage;
import de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation;

import de.inavet.smarttrains.das.interfaces.utils.RecommendationTypes;

import java.time.ZonedDateTime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recommendation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.RecommendationImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.RecommendationImpl#getJourneyId <em>Journey Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.RecommendationImpl#getTargetSpeed <em>Target Speed</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.RecommendationImpl#getCountdownForDeparture <em>Countdown For Departure</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.RecommendationImpl#getRecommendationType <em>Recommendation Type</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.RecommendationImpl#getStartTimeForInformationOrRecommendation <em>Start Time For Information Or Recommendation</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.RecommendationImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecommendationImpl extends MinimalEObjectImpl.Container implements Recommendation {
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
	protected RecommendationImpl() {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.RECOMMENDATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJourneyId() {
		return journeyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJourneyId(String newJourneyId) {
		String oldJourneyId = journeyId;
		journeyId = newJourneyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.RECOMMENDATION__JOURNEY_ID, oldJourneyId, journeyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTargetSpeed() {
		return targetSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSpeed(int newTargetSpeed) {
		int oldTargetSpeed = targetSpeed;
		targetSpeed = newTargetSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.RECOMMENDATION__TARGET_SPEED, oldTargetSpeed, targetSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCountdownForDeparture() {
		return countdownForDeparture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountdownForDeparture(int newCountdownForDeparture) {
		int oldCountdownForDeparture = countdownForDeparture;
		countdownForDeparture = newCountdownForDeparture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.RECOMMENDATION__COUNTDOWN_FOR_DEPARTURE, oldCountdownForDeparture, countdownForDeparture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecommendationTypes getRecommendationType() {
		return recommendationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecommendationType(RecommendationTypes newRecommendationType) {
		RecommendationTypes oldRecommendationType = recommendationType;
		recommendationType = newRecommendationType == null ? RECOMMENDATION_TYPE_EDEFAULT : newRecommendationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.RECOMMENDATION__RECOMMENDATION_TYPE, oldRecommendationType, recommendationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZonedDateTime getStartTimeForInformationOrRecommendation() {
		return startTimeForInformationOrRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTimeForInformationOrRecommendation(ZonedDateTime newStartTimeForInformationOrRecommendation) {
		ZonedDateTime oldStartTimeForInformationOrRecommendation = startTimeForInformationOrRecommendation;
		startTimeForInformationOrRecommendation = newStartTimeForInformationOrRecommendation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.RECOMMENDATION__START_TIME_FOR_INFORMATION_OR_RECOMMENDATION, oldStartTimeForInformationOrRecommendation, startTimeForInformationOrRecommendation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZonedDateTime getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(ZonedDateTime newTimestamp) {
		ZonedDateTime oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.RECOMMENDATION__TIMESTAMP, oldTimestamp, timestamp));
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

} //RecommendationImpl
