/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zeitfensterdefinition
 * Hilfsklasse
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot#getBeginOfTimeSlot <em>Begin Of Time Slot</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot#getEndOfTimeSlot <em>End Of Time Slot</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getTimeSlot()
 * @model
 * @generated
 */
public interface TimeSlot extends EObject {
	/**
	 * Returns the value of the '<em><b>Begin Of Time Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Begin des Zeitfenster
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Begin Of Time Slot</em>' attribute.
	 * @see #setBeginOfTimeSlot(ZonedDateTime)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getTimeSlot_BeginOfTimeSlot()
	 * @model dataType="de.inavet.smarttrains.das.interfaces.utils.ZonedDateTime" required="true"
	 * @generated
	 */
	ZonedDateTime getBeginOfTimeSlot();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot#getBeginOfTimeSlot <em>Begin Of Time Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Of Time Slot</em>' attribute.
	 * @see #getBeginOfTimeSlot()
	 * @generated
	 */
	void setBeginOfTimeSlot(ZonedDateTime value);

	/**
	 * Returns the value of the '<em><b>End Of Time Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dauer oder Größe des Zeitfenster
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Of Time Slot</em>' attribute.
	 * @see #setEndOfTimeSlot(ZonedDateTime)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getTimeSlot_EndOfTimeSlot()
	 * @model dataType="de.inavet.smarttrains.das.interfaces.utils.ZonedDateTime" required="true"
	 * @generated
	 */
	ZonedDateTime getEndOfTimeSlot();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot#getEndOfTimeSlot <em>End Of Time Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Of Time Slot</em>' attribute.
	 * @see #getEndOfTimeSlot()
	 * @generated
	 */
	void setEndOfTimeSlot(ZonedDateTime value);

} // TimeSlot
