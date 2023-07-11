/**
 */
package de.inavet.smarttrains.das.interfaces.utils;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GNSS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * GNSS-Datum vom Smartphone / der mobilen Anwendung zum Datenbroker
 * wird mind. sekündlich vom der Smartphone / der mobilen Anwendung zum Datenbroker gesendet
 * Root-Klasse
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.GNSS#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.GNSS#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.GNSS#getType <em>Type</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.GNSS#getNmeastring <em>Nmeastring</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.GNSS#getJourney <em>Journey</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getGNSS()
 * @model
 * @generated
 */
public interface GNSS extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datenbroker-id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getGNSS_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.GNSS#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitstempel der Datum-Erzeugung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(ZonedDateTime)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getGNSS_Timestamp()
	 * @model dataType="de.inavet.smarttrains.das.interfaces.utils.ZonedDateTime" required="true"
	 * @generated
	 */
	ZonedDateTime getTimestamp();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.GNSS#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(ZonedDateTime value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"GPRMC"</code>.
	 * The literals are from the enumeration {@link de.inavet.smarttrains.das.interfaces.utils.NMEAType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nmea-type zur späteren Filterung auf dem Datenbroker
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.inavet.smarttrains.das.interfaces.utils.NMEAType
	 * @see #setType(NMEAType)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getGNSS_Type()
	 * @model default="GPRMC" required="true"
	 * @generated
	 */
	NMEAType getType();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.GNSS#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.inavet.smarttrains.das.interfaces.utils.NMEAType
	 * @see #getType()
	 * @generated
	 */
	void setType(NMEAType value);

	/**
	 * Returns the value of the '<em><b>Nmeastring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * der eigentliche nmea-String der Anwendung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nmeastring</em>' attribute.
	 * @see #setNmeastring(String)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getGNSS_Nmeastring()
	 * @model required="true"
	 * @generated
	 */
	String getNmeastring();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.GNSS#getNmeastring <em>Nmeastring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nmeastring</em>' attribute.
	 * @see #getNmeastring()
	 * @generated
	 */
	void setNmeastring(String value);

	/**
	 * Returns the value of the '<em><b>Journey</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * journey bzw. journey-id zur Zuweisung des nmea-strings zur entsprechenden Fahrt
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journey</em>' containment reference.
	 * @see #setJourney(Journey)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getGNSS_Journey()
	 * @model containment="true" keys="id" required="true"
	 * @generated
	 */
	Journey getJourney();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.GNSS#getJourney <em>Journey</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journey</em>' containment reference.
	 * @see #getJourney()
	 * @generated
	 */
	void setJourney(Journey value);

} // GNSS
