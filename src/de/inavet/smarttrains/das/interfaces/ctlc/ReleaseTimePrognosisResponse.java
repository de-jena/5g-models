/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

import java.time.ZonedDateTime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release Time Prognosis Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Response from the prognosis functionality to an earlier sent request.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse#getRefRequestId <em>Ref Request Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse#getReleaseTimes <em>Release Times</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse#getReleaseTimesForScenarios <em>Release Times For Scenarios</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getReleaseTimePrognosisResponse()
 * @model
 * @generated
 */
public interface ReleaseTimePrognosisResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(ZonedDateTime)
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getReleaseTimePrognosisResponse_Timestamp()
	 * @model dataType="de.inavet.smarttrains.das.interfaces.utils.ZonedDateTime" required="true"
	 * @generated
	 */
	ZonedDateTime getTimestamp();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(ZonedDateTime value);

	/**
	 * Returns the value of the '<em><b>Ref Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Request Id</em>' attribute.
	 * @see #setRefRequestId(String)
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getReleaseTimePrognosisResponse_RefRequestId()
	 * @model required="true"
	 * @generated
	 */
	String getRefRequestId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse#getRefRequestId <em>Ref Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Request Id</em>' attribute.
	 * @see #getRefRequestId()
	 * @generated
	 */
	void setRefRequestId(String value);

	/**
	 * Returns the value of the '<em><b>Release Times</b></em>' containment reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Times</em>' containment reference list.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getReleaseTimePrognosisResponse_ReleaseTimes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ReleaseTimeVector> getReleaseTimes();

	/**
	 * Returns the value of the '<em><b>Release Times For Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Times For Scenarios</em>' containment reference list.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getReleaseTimePrognosisResponse_ReleaseTimesForScenarios()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScenarioPrognosis> getReleaseTimesForScenarios();

} // ReleaseTimePrognosisResponse
