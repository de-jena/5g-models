/**
 */
package de.inavet.smarttrains.das.interfaces.basicDataSynchronisation;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

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
 * @generated
 */
public class CourseToRoutes extends MinimalEObjectImpl.Container {
	/**
	 * The default value of the '{@link #getCourse() <em>Course</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected static final int COURSE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected int course = COURSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoutes() <em>Routes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> routes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseToRoutes() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicDataSynchronisationPackage.Literals.COURSE_TO_ROUTES;
	}

	/**
	 * Returns the value of the '<em><b>Course</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Kurs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Course</em>' attribute.
	 * @see #setCourse(int)
	 * @generated
	 */
	public int getCourse() {
		return course;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes#getCourse <em>Course</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newCourse the new value of the '<em>Course</em>' attribute.
	 * @see #getCourse()
	 * @generated
	 */
	public void setCourse(int newCourse) {
		course = newCourse;
	}

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die möglichen Routenauswahlmöglichkeiten zum Kurs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Routes</em>' attribute list.
	 * @generated
	 */
	public EList<Integer> getRoutes() {
		if (routes == null) {
			routes = new BasicInternalEList<Integer>(int.class);
		}
		return routes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicDataSynchronisationPackage.COURSE_TO_ROUTES__COURSE:
				return getCourse();
			case BasicDataSynchronisationPackage.COURSE_TO_ROUTES__ROUTES:
				return getRoutes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasicDataSynchronisationPackage.COURSE_TO_ROUTES__COURSE:
				setCourse((Integer)newValue);
				return;
			case BasicDataSynchronisationPackage.COURSE_TO_ROUTES__ROUTES:
				getRoutes().clear();
				getRoutes().addAll((Collection<? extends Integer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BasicDataSynchronisationPackage.COURSE_TO_ROUTES__COURSE:
				setCourse(COURSE_EDEFAULT);
				return;
			case BasicDataSynchronisationPackage.COURSE_TO_ROUTES__ROUTES:
				getRoutes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasicDataSynchronisationPackage.COURSE_TO_ROUTES__COURSE:
				return course != COURSE_EDEFAULT;
			case BasicDataSynchronisationPackage.COURSE_TO_ROUTES__ROUTES:
				return routes != null && !routes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (course: ");
		result.append(course);
		result.append(", routes: ");
		result.append(routes);
		result.append(')');
		return result.toString();
	}

} // CourseToRoutes
