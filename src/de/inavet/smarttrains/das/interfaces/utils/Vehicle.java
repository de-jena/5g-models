/**
 */
package de.inavet.smarttrains.das.interfaces.utils;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Fahrzeugidentifikationsklasse
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.Vehicle#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.Vehicle#getVehicleId <em>Vehicle Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.Vehicle#getVehicleType <em>Vehicle Type</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getVehicle()
 * @model
 * @generated
 */
public interface Vehicle extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datenbroker-Id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getVehicle_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.Vehicle#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Vehicle Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * reale Fahrzeugnummer bei der JNV (Id-Nr.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Id</em>' attribute.
	 * @see #setVehicleId(String)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getVehicle_VehicleId()
	 * @model required="true"
	 * @generated
	 */
	String getVehicleId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.Vehicle#getVehicleId <em>Vehicle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Id</em>' attribute.
	 * @see #getVehicleId()
	 * @generated
	 */
	void setVehicleId(String value);

	/**
	 * Returns the value of the '<em><b>Vehicle Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.inavet.smarttrains.das.interfaces.utils.VehicleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Type</em>' attribute.
	 * @see de.inavet.smarttrains.das.interfaces.utils.VehicleType
	 * @see #setVehicleType(VehicleType)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getVehicle_VehicleType()
	 * @model required="true"
	 * @generated
	 */
	VehicleType getVehicleType();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.Vehicle#getVehicleType <em>Vehicle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Type</em>' attribute.
	 * @see de.inavet.smarttrains.das.interfaces.utils.VehicleType
	 * @see #getVehicleType()
	 * @generated
	 */
	void setVehicleType(VehicleType value);

} // Vehicle
