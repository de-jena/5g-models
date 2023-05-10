/**
 */
package journey;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import utils.UtilsPackage;

import vehicle.VehiclePackage;

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
 * @see journey.JourneyFactory
 * @generated
 */
public class JourneyPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "journey";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://inavet.de/datamodels/journey";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "journey";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final JourneyPackage eINSTANCE = journey.JourneyPackage.init();

	/**
	 * The meta object id for the '{@link journey.Journey <em>Journey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see journey.Journey
	 * @see journey.JourneyPackage#getJourney()
	 * @generated
	 */
	public static final int JOURNEY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOURNEY__ID = 0;

	/**
	 * The feature id for the '<em><b>Journey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOURNEY__JOURNEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOURNEY__LINE = 2;

	/**
	 * The feature id for the '<em><b>Course</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOURNEY__COURSE = 3;

	/**
	 * The feature id for the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOURNEY__ROUTE = 4;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOURNEY__TIMESTAMP = 5;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOURNEY__VEHICLE = 6;

	/**
	 * The number of structural features of the '<em>Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOURNEY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOURNEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link journey.JourneyResponseFromDatabroker <em>Response From Databroker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see journey.JourneyResponseFromDatabroker
	 * @see journey.JourneyPackage#getJourneyResponseFromDatabroker()
	 * @generated
	 */
	public static final int JOURNEY_RESPONSE_FROM_DATABROKER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOURNEY_RESPONSE_FROM_DATABROKER__ID = 0;

	/**
	 * The feature id for the '<em><b>Id Of Journey To Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOURNEY_RESPONSE_FROM_DATABROKER__ID_OF_JOURNEY_TO_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Journey Succesful Initialised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOURNEY_RESPONSE_FROM_DATABROKER__JOURNEY_SUCCESFUL_INITIALISED = 2;

	/**
	 * The number of structural features of the '<em>Response From Databroker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOURNEY_RESPONSE_FROM_DATABROKER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Response From Databroker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int JOURNEY_RESPONSE_FROM_DATABROKER_OPERATION_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journeyResponseFromDatabrokerEClass = null;

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
	 * @see journey.JourneyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JourneyPackage() {
		super(eNS_URI, JourneyFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link JourneyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JourneyPackage init() {
		if (isInited) return (JourneyPackage)EPackage.Registry.INSTANCE.getEPackage(JourneyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJourneyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JourneyPackage theJourneyPackage = registeredJourneyPackage instanceof JourneyPackage ? (JourneyPackage)registeredJourneyPackage : new JourneyPackage();

		isInited = true;

		// Initialize simple dependencies
		UtilsPackage.eINSTANCE.eClass();
		VehiclePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJourneyPackage.createPackageContents();

		// Initialize created meta-data
		theJourneyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJourneyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JourneyPackage.eNS_URI, theJourneyPackage);
		return theJourneyPackage;
	}


	/**
	 * Returns the meta object for class '{@link journey.Journey <em>Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journey</em>'.
	 * @see journey.Journey
	 * @generated
	 */
	public EClass getJourney() {
		return journeyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link journey.Journey#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see journey.Journey#getId()
	 * @see #getJourney()
	 * @generated
	 */
	public EAttribute getJourney_Id() {
		return (EAttribute)journeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link journey.Journey#getJourneyId <em>Journey Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Id</em>'.
	 * @see journey.Journey#getJourneyId()
	 * @see #getJourney()
	 * @generated
	 */
	public EAttribute getJourney_JourneyId() {
		return (EAttribute)journeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link journey.Journey#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see journey.Journey#getLine()
	 * @see #getJourney()
	 * @generated
	 */
	public EAttribute getJourney_Line() {
		return (EAttribute)journeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link journey.Journey#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course</em>'.
	 * @see journey.Journey#getCourse()
	 * @see #getJourney()
	 * @generated
	 */
	public EAttribute getJourney_Course() {
		return (EAttribute)journeyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link journey.Journey#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route</em>'.
	 * @see journey.Journey#getRoute()
	 * @see #getJourney()
	 * @generated
	 */
	public EAttribute getJourney_Route() {
		return (EAttribute)journeyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link journey.Journey#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see journey.Journey#getTimestamp()
	 * @see #getJourney()
	 * @generated
	 */
	public EAttribute getJourney_Timestamp() {
		return (EAttribute)journeyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the reference '{@link journey.Journey#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicle</em>'.
	 * @see journey.Journey#getVehicle()
	 * @see #getJourney()
	 * @generated
	 */
	public EReference getJourney_Vehicle() {
		return (EReference)journeyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link journey.JourneyResponseFromDatabroker <em>Response From Databroker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response From Databroker</em>'.
	 * @see journey.JourneyResponseFromDatabroker
	 * @generated
	 */
	public EClass getJourneyResponseFromDatabroker() {
		return journeyResponseFromDatabrokerEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link journey.JourneyResponseFromDatabroker#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see journey.JourneyResponseFromDatabroker#getId()
	 * @see #getJourneyResponseFromDatabroker()
	 * @generated
	 */
	public EAttribute getJourneyResponseFromDatabroker_Id() {
		return (EAttribute)journeyResponseFromDatabrokerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link journey.JourneyResponseFromDatabroker#getIdOfJourneyToResponse <em>Id Of Journey To Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id Of Journey To Response</em>'.
	 * @see journey.JourneyResponseFromDatabroker#getIdOfJourneyToResponse()
	 * @see #getJourneyResponseFromDatabroker()
	 * @generated
	 */
	public EReference getJourneyResponseFromDatabroker_IdOfJourneyToResponse() {
		return (EReference)journeyResponseFromDatabrokerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link journey.JourneyResponseFromDatabroker#isJourneySuccesfulInitialised <em>Journey Succesful Initialised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Succesful Initialised</em>'.
	 * @see journey.JourneyResponseFromDatabroker#isJourneySuccesfulInitialised()
	 * @see #getJourneyResponseFromDatabroker()
	 * @generated
	 */
	public EAttribute getJourneyResponseFromDatabroker_JourneySuccesfulInitialised() {
		return (EAttribute)journeyResponseFromDatabrokerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public JourneyFactory getJourneyFactory() {
		return (JourneyFactory)getEFactoryInstance();
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
		journeyEClass = createEClass(JOURNEY);
		createEAttribute(journeyEClass, JOURNEY__ID);
		createEAttribute(journeyEClass, JOURNEY__JOURNEY_ID);
		createEAttribute(journeyEClass, JOURNEY__LINE);
		createEAttribute(journeyEClass, JOURNEY__COURSE);
		createEAttribute(journeyEClass, JOURNEY__ROUTE);
		createEAttribute(journeyEClass, JOURNEY__TIMESTAMP);
		createEReference(journeyEClass, JOURNEY__VEHICLE);

		journeyResponseFromDatabrokerEClass = createEClass(JOURNEY_RESPONSE_FROM_DATABROKER);
		createEAttribute(journeyResponseFromDatabrokerEClass, JOURNEY_RESPONSE_FROM_DATABROKER__ID);
		createEReference(journeyResponseFromDatabrokerEClass, JOURNEY_RESPONSE_FROM_DATABROKER__ID_OF_JOURNEY_TO_RESPONSE);
		createEAttribute(journeyResponseFromDatabrokerEClass, JOURNEY_RESPONSE_FROM_DATABROKER__JOURNEY_SUCCESFUL_INITIALISED);
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
		VehiclePackage theVehiclePackage = (VehiclePackage)EPackage.Registry.INSTANCE.getEPackage(VehiclePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(journeyEClass, Journey.class, "Journey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJourney_Id(), ecorePackage.getEString(), "id", null, 1, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourney_JourneyId(), ecorePackage.getEString(), "journeyId", null, 0, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourney_Line(), ecorePackage.getEInt(), "line", null, 1, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourney_Course(), ecorePackage.getEInt(), "course", null, 1, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourney_Route(), ecorePackage.getEInt(), "route", null, 1, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourney_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourney_Vehicle(), theVehiclePackage.getVehicle(), null, "vehicle", null, 1, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(journeyResponseFromDatabrokerEClass, JourneyResponseFromDatabroker.class, "JourneyResponseFromDatabroker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJourneyResponseFromDatabroker_Id(), ecorePackage.getEString(), "id", null, 1, 1, JourneyResponseFromDatabroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourneyResponseFromDatabroker_IdOfJourneyToResponse(), this.getJourney(), null, "idOfJourneyToResponse", null, 1, 1, JourneyResponseFromDatabroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getJourneyResponseFromDatabroker_IdOfJourneyToResponse().getEKeys().add(this.getJourney_JourneyId());
		initEAttribute(getJourneyResponseFromDatabroker_JourneySuccesfulInitialised(), ecorePackage.getEBoolean(), "journeySuccesfulInitialised", null, 1, 1, JourneyResponseFromDatabroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "journey", "#/"
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
		 * The meta object literal for the '{@link journey.Journey <em>Journey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see journey.Journey
		 * @see journey.JourneyPackage#getJourney()
		 * @generated
		 */
		public static final EClass JOURNEY = eINSTANCE.getJourney();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute JOURNEY__ID = eINSTANCE.getJourney_Id();

		/**
		 * The meta object literal for the '<em><b>Journey Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute JOURNEY__JOURNEY_ID = eINSTANCE.getJourney_JourneyId();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute JOURNEY__LINE = eINSTANCE.getJourney_Line();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute JOURNEY__COURSE = eINSTANCE.getJourney_Course();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute JOURNEY__ROUTE = eINSTANCE.getJourney_Route();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute JOURNEY__TIMESTAMP = eINSTANCE.getJourney_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference JOURNEY__VEHICLE = eINSTANCE.getJourney_Vehicle();

		/**
		 * The meta object literal for the '{@link journey.JourneyResponseFromDatabroker <em>Response From Databroker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see journey.JourneyResponseFromDatabroker
		 * @see journey.JourneyPackage#getJourneyResponseFromDatabroker()
		 * @generated
		 */
		public static final EClass JOURNEY_RESPONSE_FROM_DATABROKER = eINSTANCE.getJourneyResponseFromDatabroker();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute JOURNEY_RESPONSE_FROM_DATABROKER__ID = eINSTANCE.getJourneyResponseFromDatabroker_Id();

		/**
		 * The meta object literal for the '<em><b>Id Of Journey To Response</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference JOURNEY_RESPONSE_FROM_DATABROKER__ID_OF_JOURNEY_TO_RESPONSE = eINSTANCE.getJourneyResponseFromDatabroker_IdOfJourneyToResponse();

		/**
		 * The meta object literal for the '<em><b>Journey Succesful Initialised</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute JOURNEY_RESPONSE_FROM_DATABROKER__JOURNEY_SUCCESFUL_INITIALISED = eINSTANCE.getJourneyResponseFromDatabroker_JourneySuccesfulInitialised();

	}

} //JourneyPackage
