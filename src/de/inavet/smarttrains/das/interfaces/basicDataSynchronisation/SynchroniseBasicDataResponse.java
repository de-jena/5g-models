/**
 */
package de.inavet.smarttrains.das.interfaces.basicDataSynchronisation;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EObject;

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
 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getSynchroniseBasicDataResponse()
 * @model
 * @generated
 */
public interface SynchroniseBasicDataResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datenbroker-Id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getSynchroniseBasicDataResponse_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Device Id Of Registration To Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device-Registrierungsid
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Id Of Registration To Response</em>' containment reference.
	 * @see #setDeviceIdOfRegistrationToResponse(DeviceRegistration)
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getSynchroniseBasicDataResponse_DeviceIdOfRegistrationToResponse()
	 * @model containment="true" keys="deviceId" required="true"
	 * @generated
	 */
	DeviceRegistration getDeviceIdOfRegistrationToResponse();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getDeviceIdOfRegistrationToResponse <em>Device Id Of Registration To Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Id Of Registration To Response</em>' containment reference.
	 * @see #getDeviceIdOfRegistrationToResponse()
	 * @generated
	 */
	void setDeviceIdOfRegistrationToResponse(DeviceRegistration value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitstempel der Antwort -> Sync bzw. Latenz-relevant
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(ZonedDateTime)
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getSynchroniseBasicDataResponse_Timestamp()
	 * @model dataType="de.inavet.smarttrains.das.interfaces.utils.ZonedDateTime" required="true"
	 * @generated
	 */
	ZonedDateTime getTimestamp();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(ZonedDateTime value);

	/**
	 * Returns the value of the '<em><b>Basic Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Grunddaten
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basic Data</em>' containment reference.
	 * @see #setBasicData(BasicData)
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getSynchroniseBasicDataResponse_BasicData()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BasicData getBasicData();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getBasicData <em>Basic Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic Data</em>' containment reference.
	 * @see #getBasicData()
	 * @generated
	 */
	void setBasicData(BasicData value);

} // SynchroniseBasicDataResponse
