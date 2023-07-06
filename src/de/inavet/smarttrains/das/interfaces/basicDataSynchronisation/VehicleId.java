/**
 */
package de.inavet.smarttrains.das.interfaces.basicDataSynchronisation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hilfsklasse: Fahrzeugnummer bei der JNV
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.VehicleId#getVehicleId <em>Vehicle Id</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getVehicleId()
 * @model
 * @generated
 */
public interface VehicleId extends EObject {
	/**
	 * Returns the value of the '<em><b>Vehicle Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Id</em>' attribute.
	 * @see #setVehicleId(String)
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getVehicleId_VehicleId()
	 * @model required="true"
	 * @generated
	 */
	String getVehicleId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.VehicleId#getVehicleId <em>Vehicle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Id</em>' attribute.
	 * @see #getVehicleId()
	 * @generated
	 */
	void setVehicleId(String value);

} // VehicleId
