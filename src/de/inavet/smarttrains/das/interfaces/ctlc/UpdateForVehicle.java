/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

import de.inavet.smarttrains.das.interfaces.utils.Position;

import de.inavet.smarttrains.das.interfaces.vehicle.Vehicle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update For Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getCurrentPosition <em>Current Position</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getCurrentVelocity <em>Current Velocity</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getArrivals <em>Arrivals</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getStopPlaces <em>Stop Places</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getUpdateForVehicle()
 * @model
 * @generated
 */
public interface UpdateForVehicle extends EObject {
	/**
	 * Returns the value of the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle</em>' reference.
	 * @see #setVehicle(Vehicle)
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getUpdateForVehicle_Vehicle()
	 * @model required="true"
	 * @generated
	 */
	Vehicle getVehicle();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getVehicle <em>Vehicle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle</em>' reference.
	 * @see #getVehicle()
	 * @generated
	 */
	void setVehicle(Vehicle value);

	/**
	 * Returns the value of the '<em><b>Current Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Position</em>' reference.
	 * @see #setCurrentPosition(Position)
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getUpdateForVehicle_CurrentPosition()
	 * @model required="true"
	 * @generated
	 */
	Position getCurrentPosition();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getCurrentPosition <em>Current Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Position</em>' reference.
	 * @see #getCurrentPosition()
	 * @generated
	 */
	void setCurrentPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Current Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Velocity</em>' attribute.
	 * @see #setCurrentVelocity(double)
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getUpdateForVehicle_CurrentVelocity()
	 * @model required="true"
	 * @generated
	 */
	double getCurrentVelocity();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getCurrentVelocity <em>Current Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Velocity</em>' attribute.
	 * @see #getCurrentVelocity()
	 * @generated
	 */
	void setCurrentVelocity(double value);

	/**
	 * Returns the value of the '<em><b>Arrivals</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrivals</em>' reference list.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getUpdateForVehicle_Arrivals()
	 * @model required="true"
	 * @generated
	 */
	EList<PrognosisArrivalAndPosition> getArrivals();

	/**
	 * Returns the value of the '<em><b>Stop Places</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Places</em>' reference list.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getUpdateForVehicle_StopPlaces()
	 * @model
	 * @generated
	 */
	EList<PrognosisStopPlace> getStopPlaces();

} // UpdateForVehicle
