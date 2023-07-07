/**
 */
package de.inavet.smarttrains.das.interfaces.basicDataSynchronisation;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronise Basic Data Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Antwort der Zentralseite auf Geräteregistrierung mit den Grunddaten zur Anmeldung
 * Root-Objekt
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getDeviceIdOfRegistrationToResponse <em>Device Id Of Registration To Response</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getBasicData <em>Basic Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchroniseBasicDataResponse extends MinimalEObjectImpl.Container {
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
	 * The cached value of the '{@link #getDeviceIdOfRegistrationToResponse() <em>Device Id Of Registration To Response</em>}' reference.
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
	 * The cached value of the '{@link #getBasicData() <em>Basic Data</em>}' reference.
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
	protected SynchroniseBasicDataResponse() {
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
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getId <em>Id</em>}' attribute.
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
	 * Returns the value of the '<em><b>Device Id Of Registration To Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device-Registrierungsid
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Id Of Registration To Response</em>' reference.
	 * @see #setDeviceIdOfRegistrationToResponse(DeviceRegistration)
	 * @generated
	 */
	public DeviceRegistration getDeviceIdOfRegistrationToResponse() {
		if (deviceIdOfRegistrationToResponse != null && ((EObject)deviceIdOfRegistrationToResponse).eIsProxy()) {
			InternalEObject oldDeviceIdOfRegistrationToResponse = deviceIdOfRegistrationToResponse;
			deviceIdOfRegistrationToResponse = (DeviceRegistration)eResolveProxy(oldDeviceIdOfRegistrationToResponse);
			if (deviceIdOfRegistrationToResponse != oldDeviceIdOfRegistrationToResponse) {
			}
		}
		return deviceIdOfRegistrationToResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceRegistration basicGetDeviceIdOfRegistrationToResponse() {
		return deviceIdOfRegistrationToResponse;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getDeviceIdOfRegistrationToResponse <em>Device Id Of Registration To Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newDeviceIdOfRegistrationToResponse the new value of the '<em>Device Id Of Registration To Response</em>' reference.
	 * @see #getDeviceIdOfRegistrationToResponse()
	 * @generated
	 */
	public void setDeviceIdOfRegistrationToResponse(DeviceRegistration newDeviceIdOfRegistrationToResponse) {
		deviceIdOfRegistrationToResponse = newDeviceIdOfRegistrationToResponse;
	}

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitstempel der Antwort -> Sync bzw. Latenz-relevant
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(ZonedDateTime)
	 * @generated
	 */
	public ZonedDateTime getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getTimestamp <em>Timestamp</em>}' attribute.
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
	 * Returns the value of the '<em><b>Basic Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Grunddaten
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basic Data</em>' reference.
	 * @see #setBasicData(BasicData)
	 * @generated
	 */
	public BasicData getBasicData() {
		if (basicData != null && ((EObject)basicData).eIsProxy()) {
			InternalEObject oldBasicData = basicData;
			basicData = (BasicData)eResolveProxy(oldBasicData);
			if (basicData != oldBasicData) {
			}
		}
		return basicData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicData basicGetBasicData() {
		return basicData;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getBasicData <em>Basic Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newBasicData the new value of the '<em>Basic Data</em>' reference.
	 * @see #getBasicData()
	 * @generated
	 */
	public void setBasicData(BasicData newBasicData) {
		basicData = newBasicData;
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
				if (resolve) return getDeviceIdOfRegistrationToResponse();
				return basicGetDeviceIdOfRegistrationToResponse();
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__TIMESTAMP:
				return getTimestamp();
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE__BASIC_DATA:
				if (resolve) return getBasicData();
				return basicGetBasicData();
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

} // SynchroniseBasicDataResponse
