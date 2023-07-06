/**
 */
package de.inavet.smarttrains.das.interfaces.basicDataSynchronisation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Grunddatenklasse, enthält eine Liste der möglichen Fahrzeugnummern, sowie einer Abstraktion des Fahrplans, zur Auswahl bei der Fahrzeuganmeldung
 * Hilfsklasse
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData#getVehicleIds <em>Vehicle Ids</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData#getLinesToCourses <em>Lines To Courses</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getBasicData()
 * @model
 * @generated
 */
public interface BasicData extends EObject {
	/**
	 * Returns the value of the '<em><b>Vehicle Ids</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Liste der Fahrzeugnummern (JNV-Fahrzeugnummern) zur Anmeldungsüberprüfung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Ids</em>' reference.
	 * @see #setVehicleIds(VehicleId)
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getBasicData_VehicleIds()
	 * @model
	 * @generated
	 */
	VehicleId getVehicleIds();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData#getVehicleIds <em>Vehicle Ids</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Ids</em>' reference.
	 * @see #getVehicleIds()
	 * @generated
	 */
	void setVehicleIds(VehicleId value);

	/**
	 * Returns the value of the '<em><b>Lines To Courses</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fahrplan-Abstraktion: Enthält ein Objekt mit den möglichen Linien, deren zugeordnete Kurse sowie dem Kursen zugeordneten Routen, Ebenso benutzt zur Anmeldungsüberprüfung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lines To Courses</em>' reference list.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getBasicData_LinesToCourses()
	 * @model required="true"
	 * @generated
	 */
	EList<LineToCourses> getLinesToCourses();

} // BasicData
