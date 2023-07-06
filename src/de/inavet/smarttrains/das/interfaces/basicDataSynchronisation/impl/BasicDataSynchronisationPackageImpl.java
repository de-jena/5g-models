/**
 */
package de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl;

import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData;
import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationFactory;
import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage;
import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.CourseToRoutes;
import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.DeviceRegistration;
import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses;
import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.SynchroniseBasicDataResponse;
import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.VehicleId;

import de.inavet.smarttrains.das.interfaces.utils.UtilsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicDataSynchronisationPackageImpl extends EPackageImpl implements BasicDataSynchronisationPackage {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleIdEClass = null;

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
	private BasicDataSynchronisationPackageImpl() {
		super(eNS_URI, BasicDataSynchronisationFactory.eINSTANCE);
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
		BasicDataSynchronisationPackageImpl theBasicDataSynchronisationPackage = registeredBasicDataSynchronisationPackage instanceof BasicDataSynchronisationPackageImpl ? (BasicDataSynchronisationPackageImpl)registeredBasicDataSynchronisationPackage : new BasicDataSynchronisationPackageImpl();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceRegistration() {
		return deviceRegistrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceRegistration_Id() {
		return (EAttribute)deviceRegistrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceRegistration_DeviceId() {
		return (EAttribute)deviceRegistrationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceRegistration_Timestamp() {
		return (EAttribute)deviceRegistrationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchroniseBasicDataResponse() {
		return synchroniseBasicDataResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchroniseBasicDataResponse_Id() {
		return (EAttribute)synchroniseBasicDataResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchroniseBasicDataResponse_DeviceIdOfRegistrationToResponse() {
		return (EReference)synchroniseBasicDataResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchroniseBasicDataResponse_Timestamp() {
		return (EAttribute)synchroniseBasicDataResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchroniseBasicDataResponse_BasicData() {
		return (EReference)synchroniseBasicDataResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicData() {
		return basicDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicData_VehicleIds() {
		return (EReference)basicDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicData_LinesToCourses() {
		return (EReference)basicDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineToCourses() {
		return lineToCoursesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineToCourses_Line() {
		return (EAttribute)lineToCoursesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineToCourses_Courses() {
		return (EReference)lineToCoursesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourseToRoutes() {
		return courseToRoutesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseToRoutes_Course() {
		return (EAttribute)courseToRoutesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseToRoutes_Routes() {
		return (EAttribute)courseToRoutesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVehicleId() {
		return vehicleIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicleId_VehicleId() {
		return (EAttribute)vehicleIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
		createEReference(basicDataEClass, BASIC_DATA__VEHICLE_IDS);
		createEReference(basicDataEClass, BASIC_DATA__LINES_TO_COURSES);

		lineToCoursesEClass = createEClass(LINE_TO_COURSES);
		createEAttribute(lineToCoursesEClass, LINE_TO_COURSES__LINE);
		createEReference(lineToCoursesEClass, LINE_TO_COURSES__COURSES);

		courseToRoutesEClass = createEClass(COURSE_TO_ROUTES);
		createEAttribute(courseToRoutesEClass, COURSE_TO_ROUTES__COURSE);
		createEAttribute(courseToRoutesEClass, COURSE_TO_ROUTES__ROUTES);

		vehicleIdEClass = createEClass(VEHICLE_ID);
		createEAttribute(vehicleIdEClass, VEHICLE_ID__VEHICLE_ID);
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
		initEReference(getBasicData_VehicleIds(), this.getVehicleId(), null, "vehicleIds", null, 0, 1, BasicData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicData_LinesToCourses(), this.getLineToCourses(), null, "linesToCourses", null, 1, -1, BasicData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineToCoursesEClass, LineToCourses.class, "LineToCourses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineToCourses_Line(), ecorePackage.getEInt(), "line", null, 1, 1, LineToCourses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLineToCourses_Courses(), this.getCourseToRoutes(), null, "courses", null, 1, -1, LineToCourses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseToRoutesEClass, CourseToRoutes.class, "CourseToRoutes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourseToRoutes_Course(), ecorePackage.getEInt(), "course", null, 1, 1, CourseToRoutes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseToRoutes_Routes(), ecorePackage.getEInt(), "routes", null, 1, -1, CourseToRoutes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehicleIdEClass, VehicleId.class, "VehicleId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVehicleId_VehicleId(), ecorePackage.getEString(), "vehicleId", null, 1, 1, VehicleId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

} //BasicDataSynchronisationPackageImpl
