/**
 */
package de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl;

import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData;
import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage;
import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.DeviceRegistration;
import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse;

import java.time.ZonedDateTime;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronise Basic Data Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.SynchroniseBasicDataResponseImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.SynchroniseBasicDataResponseImpl#getDeviceIdOfRegistrationToResponse <em>Device Id Of Registration To Response</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.SynchroniseBasicDataResponseImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.SynchroniseBasicDataResponseImpl#getBasicData <em>Basic Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchroniseBasicDataResponseImpl extends MinimalEObjectImpl.Container implements SynchroniseBasicDataResponse {
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
	 * The cached value of the '{@link #getDeviceIdOfRegistrationToResponse() <em>Device Id Of Registration To Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceIdOfRegistrationToResponse()
	 * @generated
	 * @ordered
	 */
	protected DeviceRegistration deviceIdOfRegistrationToResponse;

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
	 * The cached value of the '{@link #getBasicData() <em>Basic Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicData()
	 * @generated
	 * @ordered
	 */
	protected BasicData basicData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchroniseBasicDataResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicDataSynchronisationPackage.Literals.SYNCHRONISE_BASIC_DATA_RESPONSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceRegistration getDeviceIdOfRegistrationToResponse() {
		return deviceIdOfRegistrationToResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceIdOfRegistrationToResponse(DeviceRegistration newDeviceIdOfRegistrationToResponse, NotificationChain msgs) {
		DeviceRegistration oldDeviceIdOfRegistrationToResponse = deviceIdOfRegistrationToResponse;
		deviceIdOfRegistrationToResponse = newDeviceIdOfRegistrationToResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__DEVICE_ID_OF_REGISTRATION_TO_RESPONSE, oldDeviceIdOfRegistrationToResponse, newDeviceIdOfRegistrationToResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceIdOfRegistrationToResponse(DeviceRegistration newDeviceIdOfRegistrationToResponse) {
		if (newDeviceIdOfRegistrationToResponse != deviceIdOfRegistrationToResponse) {
			NotificationChain msgs = null;
			if (deviceIdOfRegistrationToResponse != null)
				msgs = ((InternalEObject)deviceIdOfRegistrationToResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__DEVICE_ID_OF_REGISTRATION_TO_RESPONSE, null, msgs);
			if (newDeviceIdOfRegistrationToResponse != null)
				msgs = ((InternalEObject)newDeviceIdOfRegistrationToResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__DEVICE_ID_OF_REGISTRATION_TO_RESPONSE, null, msgs);
			msgs = basicSetDeviceIdOfRegistrationToResponse(newDeviceIdOfRegistrationToResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__DEVICE_ID_OF_REGISTRATION_TO_RESPONSE, newDeviceIdOfRegistrationToResponse, newDeviceIdOfRegistrationToResponse));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicData getBasicData() {
		return basicData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasicData(BasicData newBasicData, NotificationChain msgs) {
		BasicData oldBasicData = basicData;
		basicData = newBasicData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__BASIC_DATA, oldBasicData, newBasicData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasicData(BasicData newBasicData) {
		if (newBasicData != basicData) {
			NotificationChain msgs = null;
			if (basicData != null)
				msgs = ((InternalEObject)basicData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__BASIC_DATA, null, msgs);
			if (newBasicData != null)
				msgs = ((InternalEObject)newBasicData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__BASIC_DATA, null, msgs);
			msgs = basicSetBasicData(newBasicData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__BASIC_DATA, newBasicData, newBasicData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__DEVICE_ID_OF_REGISTRATION_TO_RESPONSE:
				return basicSetDeviceIdOfRegistrationToResponse(null, msgs);
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__BASIC_DATA:
				return basicSetBasicData(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__ID:
				return getId();
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__DEVICE_ID_OF_REGISTRATION_TO_RESPONSE:
				return getDeviceIdOfRegistrationToResponse();
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__TIMESTAMP:
				return getTimestamp();
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__BASIC_DATA:
				return getBasicData();
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
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__ID:
				setId((String)newValue);
				return;
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__DEVICE_ID_OF_REGISTRATION_TO_RESPONSE:
				setDeviceIdOfRegistrationToResponse((DeviceRegistration)newValue);
				return;
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__TIMESTAMP:
				setTimestamp((ZonedDateTime)newValue);
				return;
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__BASIC_DATA:
				setBasicData((BasicData)newValue);
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
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__ID:
				setId(ID_EDEFAULT);
				return;
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__DEVICE_ID_OF_REGISTRATION_TO_RESPONSE:
				setDeviceIdOfRegistrationToResponse((DeviceRegistration)null);
				return;
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__BASIC_DATA:
				setBasicData((BasicData)null);
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
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__DEVICE_ID_OF_REGISTRATION_TO_RESPONSE:
				return deviceIdOfRegistrationToResponse != null;
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__BASIC_DATA:
				return basicData != null;
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
		result.append(')');
		return result.toString();
	}

} //SynchroniseBasicDataResponseImpl
