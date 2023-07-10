/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange.impl;

import de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage;
import de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile;

import java.time.ZonedDateTime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recommendation Response From Mobile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.RecommendationResponseFromMobileImpl#isReceivedRecommendation <em>Received Recommendation</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.RecommendationResponseFromMobileImpl#getRecommendationId <em>Recommendation Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.RecommendationResponseFromMobileImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecommendationResponseFromMobileImpl extends MinimalEObjectImpl.Container implements RecommendationResponseFromMobile {
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
	protected RecommendationResponseFromMobileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DasexchangePackage.Literals.RECOMMENDATION_RESPONSE_FROM_MOBILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReceivedRecommendation() {
		return receivedRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivedRecommendation(boolean newReceivedRecommendation) {
		boolean oldReceivedRecommendation = receivedRecommendation;
		receivedRecommendation = newReceivedRecommendation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__RECEIVED_RECOMMENDATION, oldReceivedRecommendation, receivedRecommendation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecommendationId() {
		return recommendationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecommendationId(String newRecommendationId) {
		String oldRecommendationId = recommendationId;
		recommendationId = newRecommendationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__RECOMMENDATION_ID, oldRecommendationId, recommendationId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DasexchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__RECEIVED_RECOMMENDATION:
				return isReceivedRecommendation();
			case DasexchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__RECOMMENDATION_ID:
				return getRecommendationId();
			case DasexchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__TIMESTAMP:
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
			case DasexchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__RECEIVED_RECOMMENDATION:
				setReceivedRecommendation((Boolean)newValue);
				return;
			case DasexchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__RECOMMENDATION_ID:
				setRecommendationId((String)newValue);
				return;
			case DasexchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__TIMESTAMP:
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
			case DasexchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__RECEIVED_RECOMMENDATION:
				setReceivedRecommendation(RECEIVED_RECOMMENDATION_EDEFAULT);
				return;
			case DasexchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__RECOMMENDATION_ID:
				setRecommendationId(RECOMMENDATION_ID_EDEFAULT);
				return;
			case DasexchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__TIMESTAMP:
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
			case DasexchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__RECEIVED_RECOMMENDATION:
				return receivedRecommendation != RECEIVED_RECOMMENDATION_EDEFAULT;
			case DasexchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__RECOMMENDATION_ID:
				return RECOMMENDATION_ID_EDEFAULT == null ? recommendationId != null : !RECOMMENDATION_ID_EDEFAULT.equals(recommendationId);
			case DasexchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE__TIMESTAMP:
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

} //RecommendationResponseFromMobileImpl
