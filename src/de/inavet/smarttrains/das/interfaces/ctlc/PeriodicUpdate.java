/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

import java.time.ZonedDateTime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodic Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * State updates for the prognosis algorithm, which are sent periodically (every 1 sec).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate#getUpdates <em>Updates</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getPeriodicUpdate()
 * @model
 * @generated
 */
public interface PeriodicUpdate extends EObject {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(ZonedDateTime)
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getPeriodicUpdate_Timestamp()
	 * @model dataType="de.inavet.smarttrains.das.interfaces.utils.ZonedDateTime" required="true"
	 * @generated
	 */
	ZonedDateTime getTimestamp();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(ZonedDateTime value);

	/**
	 * Returns the value of the '<em><b>Updates</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updates</em>' reference list.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getPeriodicUpdate_Updates()
	 * @model required="true"
	 * @generated
	 */
	EList<UpdateForVehicle> getUpdates();

} // PeriodicUpdate
