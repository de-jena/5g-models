/**
 */
package de.inavet.smarttrains.das.interfaces.journey;

import de.inavet.smarttrains.das.interfaces.vehicle.Vehicle;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 *   <li>{@link de.inavet.smarttrains.das.interfaces.journey.Journey#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.journey.Journey#getJourneyId <em>Journey Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.journey.Journey#getLine <em>Line</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.journey.Journey#getCourse <em>Course</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.journey.Journey#getRoute <em>Route</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.journey.Journey#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.journey.Journey#getVehicle <em>Vehicle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Journey extends MinimalEObjectImpl.Container {
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
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected int line = LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourse() <em>Course</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected static final int COURSE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected int course = COURSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoute() <em>Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected static final int ROUTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected int route = ROUTE_EDEFAULT;

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
	 * The cached value of the '{@link #getVehicle() <em>Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicle()
	 * @generated
	 * @ordered
	 */
	protected Vehicle vehicle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Journey() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JourneyPackage.Literals.JOURNEY;
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
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.journey.Journey#getId <em>Id</em>}' attribute.
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
	 * @return the value of the '<em>Journey Id</em>' attribute.
	 * @see #setJourneyId(String)
	 * @generated
	 */
	public String getJourneyId() {
		return journeyId;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.journey.Journey#getJourneyId <em>Journey Id</em>}' attribute.
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
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Liniennummer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(int)
	 * @generated
	 */
	public int getLine() {
		return line;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.journey.Journey#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLine the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	public void setLine(int newLine) {
		line = newLine;
	}

	/**
	 * Returns the value of the '<em><b>Course</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kursnummer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Course</em>' attribute.
	 * @see #setCourse(int)
	 * @generated
	 */
	public int getCourse() {
		return course;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.journey.Journey#getCourse <em>Course</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newCourse the new value of the '<em>Course</em>' attribute.
	 * @see #getCourse()
	 * @generated
	 */
	public void setCourse(int newCourse) {
		course = newCourse;
	}

	/**
	 * Returns the value of the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Routennummer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route</em>' attribute.
	 * @see #setRoute(int)
	 * @generated
	 */
	public int getRoute() {
		return route;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.journey.Journey#getRoute <em>Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRoute the new value of the '<em>Route</em>' attribute.
	 * @see #getRoute()
	 * @generated
	 */
	public void setRoute(int newRoute) {
		route = newRoute;
	}

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitstempel der Journey-Aktivierung auf dem Endgerät
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(ZonedDateTime)
	 * @generated
	 */
	public ZonedDateTime getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.journey.Journey#getTimestamp <em>Timestamp</em>}' attribute.
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
	 * Returns the value of the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fahrzeuginformation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle</em>' reference.
	 * @see #setVehicle(Vehicle)
	 * @generated
	 */
	public Vehicle getVehicle() {
		if (vehicle != null && ((EObject)vehicle).eIsProxy()) {
			InternalEObject oldVehicle = vehicle;
			vehicle = (Vehicle)eResolveProxy(oldVehicle);
			if (vehicle != oldVehicle) {
			}
		}
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle basicGetVehicle() {
		return vehicle;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.journey.Journey#getVehicle <em>Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newVehicle the new value of the '<em>Vehicle</em>' reference.
	 * @see #getVehicle()
	 * @generated
	 */
	public void setVehicle(Vehicle newVehicle) {
		vehicle = newVehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JourneyPackage.JOURNEY__ID:
				return getId();
			case JourneyPackage.JOURNEY__JOURNEY_ID:
				return getJourneyId();
			case JourneyPackage.JOURNEY__LINE:
				return getLine();
			case JourneyPackage.JOURNEY__COURSE:
				return getCourse();
			case JourneyPackage.JOURNEY__ROUTE:
				return getRoute();
			case JourneyPackage.JOURNEY__TIMESTAMP:
				return getTimestamp();
			case JourneyPackage.JOURNEY__VEHICLE:
				if (resolve) return getVehicle();
				return basicGetVehicle();
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
			case JourneyPackage.JOURNEY__ID:
				setId((String)newValue);
				return;
			case JourneyPackage.JOURNEY__JOURNEY_ID:
				setJourneyId((String)newValue);
				return;
			case JourneyPackage.JOURNEY__LINE:
				setLine((Integer)newValue);
				return;
			case JourneyPackage.JOURNEY__COURSE:
				setCourse((Integer)newValue);
				return;
			case JourneyPackage.JOURNEY__ROUTE:
				setRoute((Integer)newValue);
				return;
			case JourneyPackage.JOURNEY__TIMESTAMP:
				setTimestamp((ZonedDateTime)newValue);
				return;
			case JourneyPackage.JOURNEY__VEHICLE:
				setVehicle((Vehicle)newValue);
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
			case JourneyPackage.JOURNEY__ID:
				setId(ID_EDEFAULT);
				return;
			case JourneyPackage.JOURNEY__JOURNEY_ID:
				setJourneyId(JOURNEY_ID_EDEFAULT);
				return;
			case JourneyPackage.JOURNEY__LINE:
				setLine(LINE_EDEFAULT);
				return;
			case JourneyPackage.JOURNEY__COURSE:
				setCourse(COURSE_EDEFAULT);
				return;
			case JourneyPackage.JOURNEY__ROUTE:
				setRoute(ROUTE_EDEFAULT);
				return;
			case JourneyPackage.JOURNEY__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case JourneyPackage.JOURNEY__VEHICLE:
				setVehicle((Vehicle)null);
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
			case JourneyPackage.JOURNEY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case JourneyPackage.JOURNEY__JOURNEY_ID:
				return JOURNEY_ID_EDEFAULT == null ? journeyId != null : !JOURNEY_ID_EDEFAULT.equals(journeyId);
			case JourneyPackage.JOURNEY__LINE:
				return line != LINE_EDEFAULT;
			case JourneyPackage.JOURNEY__COURSE:
				return course != COURSE_EDEFAULT;
			case JourneyPackage.JOURNEY__ROUTE:
				return route != ROUTE_EDEFAULT;
			case JourneyPackage.JOURNEY__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case JourneyPackage.JOURNEY__VEHICLE:
				return vehicle != null;
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
		result.append(", line: ");
		result.append(line);
		result.append(", course: ");
		result.append(course);
		result.append(", route: ");
		result.append(route);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} // Journey
