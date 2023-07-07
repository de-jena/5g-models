/**
 */
package de.inavet.smarttrains.das.interfaces.basicDataSynchronisation;

import de.inavet.smarttrains.das.interfaces.utils.UtilsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @generated
 */
public class BasicDataSynchronisationPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "basicDataSynchronisation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://inavet.de/datamodels";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "basicDataSynchronisation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BasicDataSynchronisationPackage eINSTANCE = de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage.init();

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.DeviceRegistration <em>Device Registration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.DeviceRegistration
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getDeviceRegistration()
	 * @generated
	 */
	public static final int DEVICE_REGISTRATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_REGISTRATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Device Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_REGISTRATION__DEVICE_ID = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_REGISTRATION__TIMESTAMP = 2;

	/**
	 * The number of structural features of the '<em>Device Registration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_REGISTRATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Device Registration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_REGISTRATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse <em>Synchronise Basic Data Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getSynchroniseBasicDataResponse()
	 * @generated
	 */
	public static final int SYNCHRONISE_BASIC_DATA_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONISE_BASIC_DATA_RESPONSE__ID = 0;

	/**
	 * The feature id for the '<em><b>Device Id Of Registration To Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONISE_BASIC_DATA_RESPONSE__DEVICE_ID_OF_REGISTRATION_TO_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONISE_BASIC_DATA_RESPONSE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Basic Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONISE_BASIC_DATA_RESPONSE__BASIC_DATA = 3;

	/**
	 * The number of structural features of the '<em>Synchronise Basic Data Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONISE_BASIC_DATA_RESPONSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Synchronise Basic Data Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONISE_BASIC_DATA_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData <em>Basic Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getBasicData()
	 * @generated
	 */
	public static final int BASIC_DATA = 2;

	/**
	 * The feature id for the '<em><b>Vehicle Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_DATA__VEHICLE_IDS = 0;

	/**
	 * The feature id for the '<em><b>Lines To Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_DATA__LINES_TO_COURSES = 1;

	/**
	 * The number of structural features of the '<em>Basic Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Basic Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses <em>Line To Courses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getLineToCourses()
	 * @generated
	 */
	public static final int LINE_TO_COURSES = 3;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE_TO_COURSES__LINE = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE_TO_COURSES__COURSES = 1;

	/**
	 * The number of structural features of the '<em>Line To Courses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE_TO_COURSES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Line To Courses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LINE_TO_COURSES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes <em>Course To Routes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getCourseToRoutes()
	 * @generated
	 */
	public static final int COURSE_TO_ROUTES = 4;

	/**
	 * The feature id for the '<em><b>Course</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COURSE_TO_ROUTES__COURSE = 0;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COURSE_TO_ROUTES__ROUTES = 1;

	/**
	 * The number of structural features of the '<em>Course To Routes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COURSE_TO_ROUTES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Course To Routes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COURSE_TO_ROUTES_OPERATION_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceRegistrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchroniseBasicDataResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineToCoursesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseToRoutesEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasicDataSynchronisationPackage() {
		super(eNS_URI, BasicDataSynchronisationFactory.INSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BasicDataSynchronisationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasicDataSynchronisationPackage init() {
		if (isInited) return (BasicDataSynchronisationPackage)EPackage.Registry.INSTANCE.getEPackage(BasicDataSynchronisationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBasicDataSynchronisationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BasicDataSynchronisationPackage theBasicDataSynchronisationPackage = registeredBasicDataSynchronisationPackage instanceof BasicDataSynchronisationPackage ? (BasicDataSynchronisationPackage)registeredBasicDataSynchronisationPackage : new BasicDataSynchronisationPackage();

		isInited = true;

		// Initialize simple dependencies
		UtilsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBasicDataSynchronisationPackage.createPackageContents();

		// Initialize created meta-data
		theBasicDataSynchronisationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasicDataSynchronisationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasicDataSynchronisationPackage.eNS_URI, theBasicDataSynchronisationPackage);
		return theBasicDataSynchronisationPackage;
	}


	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.DeviceRegistration <em>Device Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Registration</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.DeviceRegistration
	 * @generated
	 */
	public EClass getDeviceRegistration() {
		return deviceRegistrationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.DeviceRegistration#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.DeviceRegistration#getId()
	 * @see #getDeviceRegistration()
	 * @generated
	 */
	public EAttribute getDeviceRegistration_Id() {
		return (EAttribute)deviceRegistrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.DeviceRegistration#getDeviceId <em>Device Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.DeviceRegistration#getDeviceId()
	 * @see #getDeviceRegistration()
	 * @generated
	 */
	public EAttribute getDeviceRegistration_DeviceId() {
		return (EAttribute)deviceRegistrationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.DeviceRegistration#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.DeviceRegistration#getTimestamp()
	 * @see #getDeviceRegistration()
	 * @generated
	 */
	public EAttribute getDeviceRegistration_Timestamp() {
		return (EAttribute)deviceRegistrationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse <em>Synchronise Basic Data Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronise Basic Data Response</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse
	 * @generated
	 */
	public EClass getSynchroniseBasicDataResponse() {
		return synchroniseBasicDataResponseEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getId()
	 * @see #getSynchroniseBasicDataResponse()
	 * @generated
	 */
	public EAttribute getSynchroniseBasicDataResponse_Id() {
		return (EAttribute)synchroniseBasicDataResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getDeviceIdOfRegistrationToResponse <em>Device Id Of Registration To Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device Id Of Registration To Response</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getDeviceIdOfRegistrationToResponse()
	 * @see #getSynchroniseBasicDataResponse()
	 * @generated
	 */
	public EReference getSynchroniseBasicDataResponse_DeviceIdOfRegistrationToResponse() {
		return (EReference)synchroniseBasicDataResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getTimestamp()
	 * @see #getSynchroniseBasicDataResponse()
	 * @generated
	 */
	public EAttribute getSynchroniseBasicDataResponse_Timestamp() {
		return (EAttribute)synchroniseBasicDataResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getBasicData <em>Basic Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Basic Data</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse#getBasicData()
	 * @see #getSynchroniseBasicDataResponse()
	 * @generated
	 */
	public EReference getSynchroniseBasicDataResponse_BasicData() {
		return (EReference)synchroniseBasicDataResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData <em>Basic Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Data</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData
	 * @generated
	 */
	public EClass getBasicData() {
		return basicDataEClass;
	}

	/**
	 * Returns the meta object for the attribute list '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData#getVehicleIds <em>Vehicle Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Vehicle Ids</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData#getVehicleIds()
	 * @see #getBasicData()
	 * @generated
	 */
	public EAttribute getBasicData_VehicleIds() {
		return (EAttribute)basicDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData#getLinesToCourses <em>Lines To Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lines To Courses</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData#getLinesToCourses()
	 * @see #getBasicData()
	 * @generated
	 */
	public EReference getBasicData_LinesToCourses() {
		return (EReference)basicDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses <em>Line To Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line To Courses</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses
	 * @generated
	 */
	public EClass getLineToCourses() {
		return lineToCoursesEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses#getLine()
	 * @see #getLineToCourses()
	 * @generated
	 */
	public EAttribute getLineToCourses_Line() {
		return (EAttribute)lineToCoursesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Courses</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses#getCourses()
	 * @see #getLineToCourses()
	 * @generated
	 */
	public EReference getLineToCourses_Courses() {
		return (EReference)lineToCoursesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes <em>Course To Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course To Routes</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes
	 * @generated
	 */
	public EClass getCourseToRoutes() {
		return courseToRoutesEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes#getCourse()
	 * @see #getCourseToRoutes()
	 * @generated
	 */
	public EAttribute getCourseToRoutes_Course() {
		return (EAttribute)courseToRoutesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute list '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Routes</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes#getRoutes()
	 * @see #getCourseToRoutes()
	 * @generated
	 */
	public EAttribute getCourseToRoutes_Routes() {
		return (EAttribute)courseToRoutesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public BasicDataSynchronisationFactory getBasicDataSynchronisationFactory() {
		return (BasicDataSynchronisationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		deviceRegistrationEClass = createEClass(DEVICE_REGISTRATION);
		createEAttribute(deviceRegistrationEClass, DEVICE_REGISTRATION__ID);
		createEAttribute(deviceRegistrationEClass, DEVICE_REGISTRATION__DEVICE_ID);
		createEAttribute(deviceRegistrationEClass, DEVICE_REGISTRATION__TIMESTAMP);

		synchroniseBasicDataResponseEClass = createEClass(SYNCHRONISE_BASIC_DATA_RESPONSE);
		createEAttribute(synchroniseBasicDataResponseEClass, SYNCHRONISE_BASIC_DATA_RESPONSE__ID);
		createEReference(synchroniseBasicDataResponseEClass, SYNCHRONISE_BASIC_DATA_RESPONSE__DEVICE_ID_OF_REGISTRATION_TO_RESPONSE);
		createEAttribute(synchroniseBasicDataResponseEClass, SYNCHRONISE_BASIC_DATA_RESPONSE__TIMESTAMP);
		createEReference(synchroniseBasicDataResponseEClass, SYNCHRONISE_BASIC_DATA_RESPONSE__BASIC_DATA);

		basicDataEClass = createEClass(BASIC_DATA);
		createEAttribute(basicDataEClass, BASIC_DATA__VEHICLE_IDS);
		createEReference(basicDataEClass, BASIC_DATA__LINES_TO_COURSES);

		lineToCoursesEClass = createEClass(LINE_TO_COURSES);
		createEAttribute(lineToCoursesEClass, LINE_TO_COURSES__LINE);
		createEReference(lineToCoursesEClass, LINE_TO_COURSES__COURSES);

		courseToRoutesEClass = createEClass(COURSE_TO_ROUTES);
		createEAttribute(courseToRoutesEClass, COURSE_TO_ROUTES__COURSE);
		createEAttribute(courseToRoutesEClass, COURSE_TO_ROUTES__ROUTES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UtilsPackage theUtilsPackage = (UtilsPackage)EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(deviceRegistrationEClass, DeviceRegistration.class, "DeviceRegistration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceRegistration_Id(), ecorePackage.getEString(), "id", null, 1, 1, DeviceRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceRegistration_DeviceId(), ecorePackage.getEString(), "deviceId", null, 1, 1, DeviceRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceRegistration_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, DeviceRegistration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(synchroniseBasicDataResponseEClass, SynchroniseBasicDataResponse.class, "SynchroniseBasicDataResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSynchroniseBasicDataResponse_Id(), ecorePackage.getEString(), "id", null, 1, 1, SynchroniseBasicDataResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSynchroniseBasicDataResponse_DeviceIdOfRegistrationToResponse(), this.getDeviceRegistration(), null, "deviceIdOfRegistrationToResponse", null, 1, 1, SynchroniseBasicDataResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getSynchroniseBasicDataResponse_DeviceIdOfRegistrationToResponse().getEKeys().add(this.getDeviceRegistration_DeviceId());
		initEAttribute(getSynchroniseBasicDataResponse_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, SynchroniseBasicDataResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSynchroniseBasicDataResponse_BasicData(), this.getBasicData(), null, "basicData", null, 1, 1, SynchroniseBasicDataResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicDataEClass, BasicData.class, "BasicData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicData_VehicleIds(), ecorePackage.getEString(), "vehicleIds", null, 1, -1, BasicData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicData_LinesToCourses(), this.getLineToCourses(), null, "linesToCourses", null, 1, -1, BasicData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineToCoursesEClass, LineToCourses.class, "LineToCourses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineToCourses_Line(), ecorePackage.getEInt(), "line", null, 1, 1, LineToCourses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLineToCourses_Courses(), this.getCourseToRoutes(), null, "courses", null, 1, -1, LineToCourses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseToRoutesEClass, CourseToRoutes.class, "CourseToRoutes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourseToRoutes_Course(), ecorePackage.getEInt(), "course", null, 1, 1, CourseToRoutes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseToRoutes_Routes(), ecorePackage.getEInt(), "routes", null, 1, -1, CourseToRoutes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "basicDataSynchronisation", "#/",
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

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
	public interface Literals {
		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.DeviceRegistration <em>Device Registration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.DeviceRegistration
		 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getDeviceRegistration()
		 * @generated
		 */
		public static final EClass DEVICE_REGISTRATION = eINSTANCE.getDeviceRegistration();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DEVICE_REGISTRATION__ID = eINSTANCE.getDeviceRegistration_Id();

		/**
		 * The meta object literal for the '<em><b>Device Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DEVICE_REGISTRATION__DEVICE_ID = eINSTANCE.getDeviceRegistration_DeviceId();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DEVICE_REGISTRATION__TIMESTAMP = eINSTANCE.getDeviceRegistration_Timestamp();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse <em>Synchronise Basic Data Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse
		 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getSynchroniseBasicDataResponse()
		 * @generated
		 */
		public static final EClass SYNCHRONISE_BASIC_DATA_RESPONSE = eINSTANCE.getSynchroniseBasicDataResponse();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONISE_BASIC_DATA_RESPONSE__ID = eINSTANCE.getSynchroniseBasicDataResponse_Id();

		/**
		 * The meta object literal for the '<em><b>Device Id Of Registration To Response</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SYNCHRONISE_BASIC_DATA_RESPONSE__DEVICE_ID_OF_REGISTRATION_TO_RESPONSE = eINSTANCE.getSynchroniseBasicDataResponse_DeviceIdOfRegistrationToResponse();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SYNCHRONISE_BASIC_DATA_RESPONSE__TIMESTAMP = eINSTANCE.getSynchroniseBasicDataResponse_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Basic Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SYNCHRONISE_BASIC_DATA_RESPONSE__BASIC_DATA = eINSTANCE.getSynchroniseBasicDataResponse_BasicData();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData <em>Basic Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData
		 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getBasicData()
		 * @generated
		 */
		public static final EClass BASIC_DATA = eINSTANCE.getBasicData();

		/**
		 * The meta object literal for the '<em><b>Vehicle Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BASIC_DATA__VEHICLE_IDS = eINSTANCE.getBasicData_VehicleIds();

		/**
		 * The meta object literal for the '<em><b>Lines To Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BASIC_DATA__LINES_TO_COURSES = eINSTANCE.getBasicData_LinesToCourses();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses <em>Line To Courses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses
		 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getLineToCourses()
		 * @generated
		 */
		public static final EClass LINE_TO_COURSES = eINSTANCE.getLineToCourses();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute LINE_TO_COURSES__LINE = eINSTANCE.getLineToCourses_Line();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LINE_TO_COURSES__COURSES = eINSTANCE.getLineToCourses_Courses();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes <em>Course To Routes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes
		 * @see de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage#getCourseToRoutes()
		 * @generated
		 */
		public static final EClass COURSE_TO_ROUTES = eINSTANCE.getCourseToRoutes();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COURSE_TO_ROUTES__COURSE = eINSTANCE.getCourseToRoutes_Course();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute COURSE_TO_ROUTES__ROUTES = eINSTANCE.getCourseToRoutes_Routes();

	}

} //BasicDataSynchronisationPackage
