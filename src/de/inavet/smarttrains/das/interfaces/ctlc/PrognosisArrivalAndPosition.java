/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prognosis Arrival And Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getEstimatedArrivalTime <em>Estimated Arrival Time</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getArrivalPosition <em>Arrival Position</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getPrognosisArrivalAndPosition()
 * @model
 * @generated
 */
public interface PrognosisArrivalAndPosition extends EObject {
	/**
	 * Returns the value of the '<em><b>Estimated Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Arrival Time</em>' attribute.
	 * @see #setEstimatedArrivalTime(ZonedDateTime)
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getPrognosisArrivalAndPosition_EstimatedArrivalTime()
	 * @model dataType="de.inavet.smarttrains.das.interfaces.utils.ZonedDateTime" required="true"
	 * @generated
	 */
	ZonedDateTime getEstimatedArrivalTime();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getEstimatedArrivalTime <em>Estimated Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Arrival Time</em>' attribute.
	 * @see #getEstimatedArrivalTime()
	 * @generated
	 */
	void setEstimatedArrivalTime(ZonedDateTime value);

	/**
	 * Returns the value of the '<em><b>Arrival Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Position</em>' containment reference.
	 * @see #setArrivalPosition(MarkedPosition)
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getPrognosisArrivalAndPosition_ArrivalPosition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MarkedPosition getArrivalPosition();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getArrivalPosition <em>Arrival Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Position</em>' containment reference.
	 * @see #getArrivalPosition()
	 * @generated
	 */
	void setArrivalPosition(MarkedPosition value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(double)
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getPrognosisArrivalAndPosition_Priority()
	 * @model required="true"
	 * @generated
	 */
	double getPriority();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(double value);

} // PrognosisArrivalAndPosition
