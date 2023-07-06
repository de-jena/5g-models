/**
 */
package de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl;

import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage;
import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes;
import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line To Courses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.LineToCoursesImpl#getLine <em>Line</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.LineToCoursesImpl#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineToCoursesImpl extends MinimalEObjectImpl.Container implements LineToCourses {
	/**
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected int line = LINE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseToRoutes> courses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineToCoursesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicDataSynchronisationPackage.Literals.LINE_TO_COURSES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLine() {
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLine(int newLine) {
		int oldLine = line;
		line = newLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicDataSynchronisationPackage.LINE_TO_COURSES__LINE, oldLine, line));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseToRoutes> getCourses() {
		if (courses == null) {
			courses = new EObjectResolvingEList<CourseToRoutes>(CourseToRoutes.class, this, BasicDataSynchronisationPackage.LINE_TO_COURSES__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicDataSynchronisationPackage.LINE_TO_COURSES__LINE:
				return getLine();
			case BasicDataSynchronisationPackage.LINE_TO_COURSES__COURSES:
				return getCourses();
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
			case BasicDataSynchronisationPackage.LINE_TO_COURSES__LINE:
				setLine((Integer)newValue);
				return;
			case BasicDataSynchronisationPackage.LINE_TO_COURSES__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends CourseToRoutes>)newValue);
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
			case BasicDataSynchronisationPackage.LINE_TO_COURSES__LINE:
				setLine(LINE_EDEFAULT);
				return;
			case BasicDataSynchronisationPackage.LINE_TO_COURSES__COURSES:
				getCourses().clear();
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
			case BasicDataSynchronisationPackage.LINE_TO_COURSES__LINE:
				return line != LINE_EDEFAULT;
			case BasicDataSynchronisationPackage.LINE_TO_COURSES__COURSES:
				return courses != null && !courses.isEmpty();
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
		result.append(" (line: ");
		result.append(line);
		result.append(')');
		return result.toString();
	}

} //LineToCoursesImpl
