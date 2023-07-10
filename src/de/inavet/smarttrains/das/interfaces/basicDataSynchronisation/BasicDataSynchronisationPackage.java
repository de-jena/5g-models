/**
 */
package de.inavet.smarttrains.das.interfaces.basicDataSynchronisation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Grunddatensynchronisierung vom Smartphone / mobilen Endgerät und der Zentrale
 * <!-- end-model-doc -->
 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import basicDataSynchronisation='#/' ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface BasicDataSynchronisationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "basicDataSynchronisation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://inavet.de/datamodels/basicDataSynchronisation/v1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "basicDataSynchronisation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicDataSynchronisationPackage eINSTANCE = de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.BasicDataSynchronisationPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.DeviceRegistrationImpl <em>Device Registration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.DeviceRegistrationImpl
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.BasicDataSynchronisationPackageImpl#getDeviceRegistration()
	 * @generated
	 */
	int DEVICE_REGISTRATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_REGISTRATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Device Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_REGISTRATION__DEVICE_ID = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_REGISTRATION__TIMESTAMP = 2;

	/**
	 * The number of structural features of the '<em>Device Registration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_REGISTRATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Device Registration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_REGISTRATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.SynchroniseBasicDataResponseImpl <em>Synchronise Basic Data Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.SynchroniseBasicDataResponseImpl
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.BasicDataSynchronisationPackageImpl#getSynchroniseBasicDataResponse()
	 * @generated
	 */
	int SYNCHRONISE_BASIC_DATA_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISE_BASIC_DATA_RESPONSE__ID = 0;

	/**
	 * The feature id for the '<em><b>Device Id Of Registration To Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISE_BASIC_DATA_RESPONSE__DEVICE_ID_OF_REGISTRATION_TO_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISE_BASIC_DATA_RESPONSE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Basic Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISE_BASIC_DATA_RESPONSE__BASIC_DATA = 3;

	/**
	 * The number of structural features of the '<em>Synchronise Basic Data Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISE_BASIC_DATA_RESPONSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Synchronise Basic Data Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISE_BASIC_DATA_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.BasicDataImpl <em>Basic Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.BasicDataImpl
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.BasicDataSynchronisationPackageImpl#getBasicData()
	 * @generated
	 */
	int BASIC_DATA = 2;

	/**
	 * The feature id for the '<em><b>Vehicle Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_DATA__VEHICLE_IDS = 0;

	/**
	 * The feature id for the '<em><b>Lines To Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_DATA__LINES_TO_COURSES = 1;

	/**
	 * The number of structural features of the '<em>Basic Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Basic Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.LineToCoursesImpl <em>Line To Courses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.LineToCoursesImpl
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.BasicDataSynchronisationPackageImpl#getLineToCourses()
	 * @generated
	 */
	int LINE_TO_COURSES = 3;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TO_COURSES__LINE = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TO_COURSES__COURSES = 1;

	/**
	 * The number of structural features of the '<em>Line To Courses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TO_COURSES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Line To Courses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_TO_COURSES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.CourseToRoutesImpl <em>Course To Routes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.CourseToRoutesImpl
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.BasicDataSynchronisationPackageImpl#getCourseToRoutes()
	 * @generated
	 */
	int COURSE_TO_ROUTES = 4;

	/**
	 * The feature id for the '<em><b>Course</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TO_ROUTES__COURSE = 0;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TO_ROUTES__ROUTES = 1;

	/**
	 * The number of structural features of the '<em>Course To Routes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TO_ROUTES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Course To Routes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_TO_ROUTES_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.DeviceRegistration <em>Device Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Registration</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.DeviceRegistration
	 * @generated
	 */
	EClass getDeviceRegistration();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.DeviceRegistration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.DeviceRegistration#getId()
	 * @see #getDeviceRegistration()
	 * @generated
	 */
	EAttribute getDeviceRegistration_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.DeviceRegistration#getDeviceId <em>Device Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.DeviceRegistration#getDeviceId()
	 * @see #getDeviceRegistration()
	 * @generated
	 */
	EAttribute getDeviceRegistration_DeviceId();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.DeviceRegistration#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.DeviceRegistration#getTimestamp()
	 * @see #getDeviceRegistration()
	 * @generated
	 */
	EAttribute getDeviceRegistration_Timestamp();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse <em>Synchronise Basic Data Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronise Basic Data Response</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse
	 * @generated
	 */
	EClass getSynchroniseBasicDataResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getId()
	 * @see #getSynchroniseBasicDataResponse()
	 * @generated
	 */
	EAttribute getSynchroniseBasicDataResponse_Id();

	/**
	 * Returns the meta object for the containment reference '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getDeviceIdOfRegistrationToResponse <em>Device Id Of Registration To Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Id Of Registration To Response</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getDeviceIdOfRegistrationToResponse()
	 * @see #getSynchroniseBasicDataResponse()
	 * @generated
	 */
	EReference getSynchroniseBasicDataResponse_DeviceIdOfRegistrationToResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getTimestamp()
	 * @see #getSynchroniseBasicDataResponse()
	 * @generated
	 */
	EAttribute getSynchroniseBasicDataResponse_Timestamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getBasicData <em>Basic Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic Data</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getBasicData()
	 * @see #getSynchroniseBasicDataResponse()
	 * @generated
	 */
	EReference getSynchroniseBasicDataResponse_BasicData();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData <em>Basic Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Data</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData
	 * @generated
	 */
	EClass getBasicData();

	/**
	 * Returns the meta object for the attribute list '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData#getVehicleIds <em>Vehicle Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Vehicle Ids</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData#getVehicleIds()
	 * @see #getBasicData()
	 * @generated
	 */
	EAttribute getBasicData_VehicleIds();

	/**
	 * Returns the meta object for the containment reference list '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData#getLinesToCourses <em>Lines To Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines To Courses</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData#getLinesToCourses()
	 * @see #getBasicData()
	 * @generated
	 */
	EReference getBasicData_LinesToCourses();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses <em>Line To Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line To Courses</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses
	 * @generated
	 */
	EClass getLineToCourses();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses#getLine()
	 * @see #getLineToCourses()
	 * @generated
	 */
	EAttribute getLineToCourses_Line();

	/**
	 * Returns the meta object for the containment reference list '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses#getCourses()
	 * @see #getLineToCourses()
	 * @generated
	 */
	EReference getLineToCourses_Courses();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes <em>Course To Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course To Routes</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes
	 * @generated
	 */
	EClass getCourseToRoutes();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes#getCourse()
	 * @see #getCourseToRoutes()
	 * @generated
	 */
	EAttribute getCourseToRoutes_Course();

	/**
	 * Returns the meta object for the attribute list '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Routes</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes#getRoutes()
	 * @see #getCourseToRoutes()
	 * @generated
	 */
	EAttribute getCourseToRoutes_Routes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasicDataSynchronisationFactory getBasicDataSynchronisationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.DeviceRegistrationImpl <em>Device Registration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.DeviceRegistrationImpl
		 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.BasicDataSynchronisationPackageImpl#getDeviceRegistration()
		 * @generated
		 */
		EClass DEVICE_REGISTRATION = eINSTANCE.getDeviceRegistration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_REGISTRATION__ID = eINSTANCE.getDeviceRegistration_Id();

		/**
		 * The meta object literal for the '<em><b>Device Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_REGISTRATION__DEVICE_ID = eINSTANCE.getDeviceRegistration_DeviceId();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_REGISTRATION__TIMESTAMP = eINSTANCE.getDeviceRegistration_Timestamp();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.SynchroniseBasicDataResponseImpl <em>Synchronise Basic Data Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.SynchroniseBasicDataResponseImpl
		 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.BasicDataSynchronisationPackageImpl#getSynchroniseBasicDataResponse()
		 * @generated
		 */
		EClass SYNCHRONISE_BASIC_DATA_RESPONSE = eINSTANCE.getSynchroniseBasicDataResponse();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONISE_BASIC_DATA_RESPONSE__ID = eINSTANCE.getSynchroniseBasicDataResponse_Id();

		/**
		 * The meta object literal for the '<em><b>Device Id Of Registration To Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONISE_BASIC_DATA_RESPONSE__DEVICE_ID_OF_REGISTRATION_TO_RESPONSE = eINSTANCE.getSynchroniseBasicDataResponse_DeviceIdOfRegistrationToResponse();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONISE_BASIC_DATA_RESPONSE__TIMESTAMP = eINSTANCE.getSynchroniseBasicDataResponse_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Basic Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONISE_BASIC_DATA_RESPONSE__BASIC_DATA = eINSTANCE.getSynchroniseBasicDataResponse_BasicData();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.BasicDataImpl <em>Basic Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.BasicDataImpl
		 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.BasicDataSynchronisationPackageImpl#getBasicData()
		 * @generated
		 */
		EClass BASIC_DATA = eINSTANCE.getBasicData();

		/**
		 * The meta object literal for the '<em><b>Vehicle Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_DATA__VEHICLE_IDS = eINSTANCE.getBasicData_VehicleIds();

		/**
		 * The meta object literal for the '<em><b>Lines To Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_DATA__LINES_TO_COURSES = eINSTANCE.getBasicData_LinesToCourses();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.LineToCoursesImpl <em>Line To Courses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.LineToCoursesImpl
		 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.BasicDataSynchronisationPackageImpl#getLineToCourses()
		 * @generated
		 */
		EClass LINE_TO_COURSES = eINSTANCE.getLineToCourses();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_TO_COURSES__LINE = eINSTANCE.getLineToCourses_Line();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_TO_COURSES__COURSES = eINSTANCE.getLineToCourses_Courses();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.CourseToRoutesImpl <em>Course To Routes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.CourseToRoutesImpl
		 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.BasicDataSynchronisationPackageImpl#getCourseToRoutes()
		 * @generated
		 */
		EClass COURSE_TO_ROUTES = eINSTANCE.getCourseToRoutes();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_TO_ROUTES__COURSE = eINSTANCE.getCourseToRoutes_Course();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_TO_ROUTES__ROUTES = eINSTANCE.getCourseToRoutes_Routes();

	}

} //BasicDataSynchronisationPackage
