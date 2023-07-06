/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prognosis Stop Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace#getStopPosition <em>Stop Position</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace#getPrognosedPlace <em>Prognosed Place</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getPrognosisStopPlace()
 * @model
 * @generated
 */
public interface PrognosisStopPlace extends EObject {
	/**
	 * Returns the value of the '<em><b>Stop Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Position</em>' reference.
	 * @see #setStopPosition(MarkedPosition)
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getPrognosisStopPlace_StopPosition()
	 * @model required="true"
	 * @generated
	 */
	MarkedPosition getStopPosition();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace#getStopPosition <em>Stop Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Position</em>' reference.
	 * @see #getStopPosition()
	 * @generated
	 */
	void setStopPosition(MarkedPosition value);

	/**
	 * Returns the value of the '<em><b>Prognosed Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prognosed Place</em>' attribute.
	 * @see #setPrognosedPlace(int)
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getPrognosisStopPlace_PrognosedPlace()
	 * @model required="true"
	 * @generated
	 */
	int getPrognosedPlace();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace#getPrognosedPlace <em>Prognosed Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prognosed Place</em>' attribute.
	 * @see #getPrognosedPlace()
	 * @generated
	 */
	void setPrognosedPlace(int value);

} // PrognosisStopPlace
