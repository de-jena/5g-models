/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import de.inavet.smarttrains.das.interfaces.utils.ValueItem;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speed Over Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hilfsklasse, Geschwindigkeit über Zeit
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime#getSpeed <em>Speed</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getSpeedOverTime()
 * @model
 * @generated
 */
public interface SpeedOverTime extends EObject {
	/**
	 * Returns the value of the '<em><b>Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' reference.
	 * @see #setSpeed(ValueItem)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getSpeedOverTime_Speed()
	 * @model
	 * @generated
	 */
	ValueItem getSpeed();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime#getSpeed <em>Speed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' reference.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(ValueItem value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(ZonedDateTime)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getSpeedOverTime_Timestamp()
	 * @model dataType="de.inavet.smarttrains.das.interfaces.utils.ZonedDateTime"
	 * @generated
	 */
	ZonedDateTime getTimestamp();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(ZonedDateTime value);

} // SpeedOverTime
