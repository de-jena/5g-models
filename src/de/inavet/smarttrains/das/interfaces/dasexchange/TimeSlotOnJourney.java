/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import de.inavet.smarttrains.das.interfaces.utils.Position;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Slot On Journey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hilfsklasse
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney#getTimeSlot <em>Time Slot</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getTimeSlotOnJourney()
 * @model
 * @generated
 */
public interface TimeSlotOnJourney extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitfenster auf einer Position
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Slot</em>' reference.
	 * @see #setTimeSlot(TimeSlot)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getTimeSlotOnJourney_TimeSlot()
	 * @model
	 * @generated
	 */
	TimeSlot getTimeSlot();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney#getTimeSlot <em>Time Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Slot</em>' reference.
	 * @see #getTimeSlot()
	 * @generated
	 */
	void setTimeSlot(TimeSlot value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Position auf der Strecke (geografisch, auch als relativ)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(Position)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getTimeSlotOnJourney_Position()
	 * @model
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

} // TimeSlotOnJourney
