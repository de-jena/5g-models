/**
 */
package de.inavet.smarttrains.das.interfaces.basicDataSynchronisation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course To Routes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hilfsklasse: Zuordnung der Routen zu einem Kurs
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes#getCourse <em>Course</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes#getRoutes <em>Routes</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getCourseToRoutes()
 * @model
 * @generated
 */
public interface CourseToRoutes extends EObject {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Kurs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Course</em>' attribute.
	 * @see #setCourse(int)
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getCourseToRoutes_Course()
	 * @model required="true"
	 * @generated
	 */
	int getCourse();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes#getCourse <em>Course</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' attribute.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(int value);

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die möglichen Routenauswahlmöglichkeiten zum Kurs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Routes</em>' attribute list.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getCourseToRoutes_Routes()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getRoutes();

} // CourseToRoutes
