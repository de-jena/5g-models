/**
 */
package de.inavet.smarttrains.das.interfaces.basicDataSynchronisation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage
 * @generated
 */
public interface BasicDataSynchronisationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicDataSynchronisationFactory eINSTANCE = de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.BasicDataSynchronisationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Device Registration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Registration</em>'.
	 * @generated
	 */
	DeviceRegistration createDeviceRegistration();

	/**
	 * Returns a new object of class '<em>Synchronise Basic Data Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronise Basic Data Response</em>'.
	 * @generated
	 */
	SynchroniseBasicDataResponse createSynchroniseBasicDataResponse();

	/**
	 * Returns a new object of class '<em>Basic Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Data</em>'.
	 * @generated
	 */
	BasicData createBasicData();

	/**
	 * Returns a new object of class '<em>Line To Courses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line To Courses</em>'.
	 * @generated
	 */
	LineToCourses createLineToCourses();

	/**
	 * Returns a new object of class '<em>Course To Routes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course To Routes</em>'.
	 * @generated
	 */
	CourseToRoutes createCourseToRoutes();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BasicDataSynchronisationPackage getBasicDataSynchronisationPackage();

} //BasicDataSynchronisationFactory
