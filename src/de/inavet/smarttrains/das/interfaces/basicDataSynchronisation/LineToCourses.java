/**
 */
package de.inavet.smarttrains.das.interfaces.basicDataSynchronisation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line To Courses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hilfsklasse: Zuordnung der Kurse zu einer Linie
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses#getLine <em>Line</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getLineToCourses()
 * @model
 * @generated
 */
public interface LineToCourses extends EObject {
	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Linie
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(int)
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getLineToCourses_Line()
	 * @model required="true"
	 * @generated
	 */
	int getLine();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(int value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die möglichen Kursauswahlmöglichkeiten der Linie
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getLineToCourses_Courses()
	 * @model required="true"
	 * @generated
	 */
	EList<CourseToRoutes> getCourses();

} // LineToCourses
