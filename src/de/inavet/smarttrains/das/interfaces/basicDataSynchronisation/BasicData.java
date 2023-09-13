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
	 * Returns the value of the '<em><b>Vehicle Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Liste der Fahrzeugnummern (JNV-Fahrzeugnummern) zur Anmeldungsüberprüfung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Ids</em>' attribute list.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getBasicData_VehicleIds()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getVehicleIds();

	/**
	 * Returns the value of the '<em><b>Lines To Courses</b></em>' containment reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fahrplan-Abstraktion: Enthält ein Objekt mit den möglichen Linien, deren zugeordnete Kurse sowie dem Kursen zugeordneten Routen, Ebenso benutzt zur Anmeldungsüberprüfung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lines To Courses</em>' containment reference list.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getBasicData_LinesToCourses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LineToCourses> getLinesToCourses();

} // BasicData
