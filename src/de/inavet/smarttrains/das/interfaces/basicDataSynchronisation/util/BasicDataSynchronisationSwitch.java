/**
 */
package de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.util;

import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage
 * @generated
 */
public class BasicDataSynchronisationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BasicDataSynchronisationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicDataSynchronisationSwitch() {
		if (modelPackage == null) {
			modelPackage = BasicDataSynchronisationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BasicDataSynchronisationPackage.DEVICE_REGISTRATION: {
				DeviceRegistration deviceRegistration = (DeviceRegistration)theEObject;
				T result = caseDeviceRegistration(deviceRegistration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE: {
				SynchroniseBasicDataResponse synchroniseBasicDataResponse = (SynchroniseBasicDataResponse)theEObject;
				T result = caseSynchroniseBasicDataResponse(synchroniseBasicDataResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicDataSynchronisationPackage.BASIC_DATA: {
				BasicData basicData = (BasicData)theEObject;
				T result = caseBasicData(basicData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicDataSynchronisationPackage.LINE_TO_COURSES: {
				LineToCourses lineToCourses = (LineToCourses)theEObject;
				T result = caseLineToCourses(lineToCourses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicDataSynchronisationPackage.COURSE_TO_ROUTES: {
				CourseToRoutes courseToRoutes = (CourseToRoutes)theEObject;
				T result = caseCourseToRoutes(courseToRoutes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BasicDataSynchronisationPackage.VEHICLE_ID: {
				VehicleId vehicleId = (VehicleId)theEObject;
				T result = caseVehicleId(vehicleId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Registration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Registration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceRegistration(DeviceRegistration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronise Basic Data Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronise Basic Data Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchroniseBasicDataResponse(SynchroniseBasicDataResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicData(BasicData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line To Courses</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line To Courses</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineToCourses(LineToCourses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Course To Routes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Course To Routes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCourseToRoutes(CourseToRoutes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehicleId(VehicleId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BasicDataSynchronisationSwitch
