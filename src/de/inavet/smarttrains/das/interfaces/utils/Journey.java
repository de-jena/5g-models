/**
 */
package de.inavet.smarttrains.das.interfaces.utils;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Journey-Klasse. Dient der Identifizierung der Fahrt. Wird vom Smartphone / der mobilen Anwendung zum Datenbroker gesendet und dort vom zentralen FAS-System abgeholt
 * Root-Objekt
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.Journey#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.Journey#getJourneyId <em>Journey Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.Journey#getLine <em>Line</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.Journey#getCourse <em>Course</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.Journey#getRoute <em>Route</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.Journey#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.Journey#getVehicle <em>Vehicle</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getJourney()
 * @model
 * @generated
 */
public interface Journey extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datenbroker-Id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getJourney_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.Journey#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Journey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journey Id</em>' attribute.
	 * @see #setJourneyId(String)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getJourney_JourneyId()
	 * @model required="true"
	 * @generated
	 */
	String getJourneyId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.Journey#getJourneyId <em>Journey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journey Id</em>' attribute.
	 * @see #getJourneyId()
	 * @generated
	 */
	void setJourneyId(String value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Liniennummer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(int)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getJourney_Line()
	 * @model required="true"
	 * @generated
	 */
	int getLine();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.Journey#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(int value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kursnummer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Course</em>' attribute.
	 * @see #setCourse(int)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getJourney_Course()
	 * @model required="true"
	 * @generated
	 */
	int getCourse();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.Journey#getCourse <em>Course</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' attribute.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(int value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Routennummer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route</em>' attribute.
	 * @see #setRoute(int)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getJourney_Route()
	 * @model required="true"
	 * @generated
	 */
	int getRoute();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.Journey#getRoute <em>Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' attribute.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(int value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitstempel der Journey-Aktivierung auf dem Endgerät
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(ZonedDateTime)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getJourney_Timestamp()
	 * @model dataType="de.inavet.smarttrains.das.interfaces.utils.ZonedDateTime" required="true"
	 * @generated
	 */
	ZonedDateTime getTimestamp();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.Journey#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(ZonedDateTime value);

	/**
	 * Returns the value of the '<em><b>Vehicle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fahrzeuginformation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle</em>' containment reference.
	 * @see #setVehicle(Vehicle)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getJourney_Vehicle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Vehicle getVehicle();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.Journey#getVehicle <em>Vehicle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle</em>' containment reference.
	 * @see #getVehicle()
	 * @generated
	 */
	void setVehicle(Vehicle value);

} // Journey
