/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

import java.time.ZonedDateTime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release Time Prognosis Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Explicit request to the prognosis functionality to return release time probabilities for all tram related signals of an intersection.
 * Optionally, the request may contain prognosis scenarios, which contains of arrival time prognoses that differ from those sent by the periodic state update.
 * In this case, the prognosis functionailty should create a release time prognoses for each of the scenarios in addition to the default prognosis based on the already known state.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getIntersectionId <em>Intersection Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getReleaseTimePrognosisRequest()
 * @model
 * @generated
 */
public interface ReleaseTimePrognosisRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(ZonedDateTime)
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getReleaseTimePrognosisRequest_Timestamp()
	 * @model dataType="de.inavet.smarttrains.das.interfaces.utils.ZonedDateTime" required="true"
	 * @generated
	 */
	ZonedDateTime getTimestamp();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(ZonedDateTime value);

	/**
	 * Returns the value of the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Id</em>' attribute.
	 * @see #setRequestId(String)
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getReleaseTimePrognosisRequest_RequestId()
	 * @model required="true"
	 * @generated
	 */
	String getRequestId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getRequestId <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Id</em>' attribute.
	 * @see #getRequestId()
	 * @generated
	 */
	void setRequestId(String value);

	/**
	 * Returns the value of the '<em><b>Intersection Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the intersection for which the prognosis shall be performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intersection Id</em>' attribute.
	 * @see #setIntersectionId(String)
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getReleaseTimePrognosisRequest_IntersectionId()
	 * @model required="true"
	 * @generated
	 */
	String getIntersectionId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getIntersectionId <em>Intersection Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intersection Id</em>' attribute.
	 * @see #getIntersectionId()
	 * @generated
	 */
	void setIntersectionId(String value);

	/**
	 * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.ctlc.Scenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenarios</em>' containment reference list.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getReleaseTimePrognosisRequest_Scenarios()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scenario> getScenarios();

} // ReleaseTimePrognosisRequest
