/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange.impl;

import de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse;
import de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage;

import java.time.ZonedDateTime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAS Exchange Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.DASExchangeResponseImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.DASExchangeResponseImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.DASExchangeResponseImpl#getDasExchangeIdToResponse <em>Das Exchange Id To Response</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.DASExchangeResponseImpl#getJourneyId <em>Journey Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DASExchangeResponseImpl extends MinimalEObjectImpl.Container implements DASExchangeResponse {
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
	 * The default value of the '{@link #getDasExchangeIdToResponse() <em>Das Exchange Id To Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDasExchangeIdToResponse()
	 * @generated
	 * @ordered
	 */
	protected static final String DAS_EXCHANGE_ID_TO_RESPONSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDasExchangeIdToResponse() <em>Das Exchange Id To Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDasExchangeIdToResponse()
	 * @generated
	 * @ordered
	 */
	protected String dasExchangeIdToResponse = DAS_EXCHANGE_ID_TO_RESPONSE_EDEFAULT;

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
	protected DASExchangeResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DasexchangePackage.Literals.DAS_EXCHANGE_RESPONSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.DAS_EXCHANGE_RESPONSE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.DAS_EXCHANGE_RESPONSE__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDasExchangeIdToResponse() {
		return dasExchangeIdToResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDasExchangeIdToResponse(String newDasExchangeIdToResponse) {
		String oldDasExchangeIdToResponse = dasExchangeIdToResponse;
		dasExchangeIdToResponse = newDasExchangeIdToResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.DAS_EXCHANGE_RESPONSE__DAS_EXCHANGE_ID_TO_RESPONSE, oldDasExchangeIdToResponse, dasExchangeIdToResponse));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.DAS_EXCHANGE_RESPONSE__JOURNEY_ID, oldJourneyId, journeyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DasexchangePackage.DAS_EXCHANGE_RESPONSE__ID:
				return getId();
			case DasexchangePackage.DAS_EXCHANGE_RESPONSE__TIMESTAMP:
				return getTimestamp();
			case DasexchangePackage.DAS_EXCHANGE_RESPONSE__DAS_EXCHANGE_ID_TO_RESPONSE:
				return getDasExchangeIdToResponse();
			case DasexchangePackage.DAS_EXCHANGE_RESPONSE__JOURNEY_ID:
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
			case DasexchangePackage.DAS_EXCHANGE_RESPONSE__ID:
				setId((String)newValue);
				return;
			case DasexchangePackage.DAS_EXCHANGE_RESPONSE__TIMESTAMP:
				setTimestamp((ZonedDateTime)newValue);
				return;
			case DasexchangePackage.DAS_EXCHANGE_RESPONSE__DAS_EXCHANGE_ID_TO_RESPONSE:
				setDasExchangeIdToResponse((String)newValue);
				return;
			case DasexchangePackage.DAS_EXCHANGE_RESPONSE__JOURNEY_ID:
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
			case DasexchangePackage.DAS_EXCHANGE_RESPONSE__ID:
				setId(ID_EDEFAULT);
				return;
			case DasexchangePackage.DAS_EXCHANGE_RESPONSE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case DasexchangePackage.DAS_EXCHANGE_RESPONSE__DAS_EXCHANGE_ID_TO_RESPONSE:
				setDasExchangeIdToResponse(DAS_EXCHANGE_ID_TO_RESPONSE_EDEFAULT);
				return;
			case DasexchangePackage.DAS_EXCHANGE_RESPONSE__JOURNEY_ID:
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
			case DasexchangePackage.DAS_EXCHANGE_RESPONSE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DasexchangePackage.DAS_EXCHANGE_RESPONSE__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case DasexchangePackage.DAS_EXCHANGE_RESPONSE__DAS_EXCHANGE_ID_TO_RESPONSE:
				return DAS_EXCHANGE_ID_TO_RESPONSE_EDEFAULT == null ? dasExchangeIdToResponse != null : !DAS_EXCHANGE_ID_TO_RESPONSE_EDEFAULT.equals(dasExchangeIdToResponse);
			case DasexchangePackage.DAS_EXCHANGE_RESPONSE__JOURNEY_ID:
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
		result.append(", dasExchangeIdToResponse: ");
		result.append(dasExchangeIdToResponse);
		result.append(", journeyId: ");
		result.append(journeyId);
		result.append(')');
		return result.toString();
	}

} //DASExchangeResponseImpl
