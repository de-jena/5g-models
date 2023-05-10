/**
 */
package gnss;

import journey.JourneyPackage;

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
 * @see gnss.GnssFactory
 * @generated
 */
public class GnssPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "gnss";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://inavet.de/datamodels/gnss";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "gnss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GnssPackage eINSTANCE = gnss.GnssPackage.init();

	/**
	 * The meta object id for the '{@link gnss.GNSS <em>GNSS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gnss.GNSS
	 * @see gnss.GnssPackage#getGNSS()
	 * @generated
	 */
	public static final int GNSS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GNSS__ID = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GNSS__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GNSS__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Nmeastring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GNSS__NMEASTRING = 3;

	/**
	 * The feature id for the '<em><b>Journey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GNSS__JOURNEY = 4;

	/**
	 * The number of structural features of the '<em>GNSS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GNSS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GNSS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int GNSS_OPERATION_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gnssEClass = null;

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
	 * @see gnss.GnssPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GnssPackage() {
		super(eNS_URI, GnssFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link GnssPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GnssPackage init() {
		if (isInited) return (GnssPackage)EPackage.Registry.INSTANCE.getEPackage(GnssPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGnssPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GnssPackage theGnssPackage = registeredGnssPackage instanceof GnssPackage ? (GnssPackage)registeredGnssPackage : new GnssPackage();

		isInited = true;

		// Initialize simple dependencies
		JourneyPackage.eINSTANCE.eClass();
		UtilsPackage.eINSTANCE.eClass();
		VehiclePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGnssPackage.createPackageContents();

		// Initialize created meta-data
		theGnssPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGnssPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GnssPackage.eNS_URI, theGnssPackage);
		return theGnssPackage;
	}


	/**
	 * Returns the meta object for class '{@link gnss.GNSS <em>GNSS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GNSS</em>'.
	 * @see gnss.GNSS
	 * @generated
	 */
	public EClass getGNSS() {
		return gnssEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link gnss.GNSS#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gnss.GNSS#getId()
	 * @see #getGNSS()
	 * @generated
	 */
	public EAttribute getGNSS_Id() {
		return (EAttribute)gnssEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link gnss.GNSS#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see gnss.GNSS#getTimestamp()
	 * @see #getGNSS()
	 * @generated
	 */
	public EAttribute getGNSS_Timestamp() {
		return (EAttribute)gnssEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link gnss.GNSS#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gnss.GNSS#getType()
	 * @see #getGNSS()
	 * @generated
	 */
	public EAttribute getGNSS_Type() {
		return (EAttribute)gnssEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link gnss.GNSS#getNmeastring <em>Nmeastring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nmeastring</em>'.
	 * @see gnss.GNSS#getNmeastring()
	 * @see #getGNSS()
	 * @generated
	 */
	public EAttribute getGNSS_Nmeastring() {
		return (EAttribute)gnssEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference '{@link gnss.GNSS#getJourney <em>Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Journey</em>'.
	 * @see gnss.GNSS#getJourney()
	 * @see #getGNSS()
	 * @generated
	 */
	public EReference getGNSS_Journey() {
		return (EReference)gnssEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public GnssFactory getGnssFactory() {
		return (GnssFactory)getEFactoryInstance();
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
		gnssEClass = createEClass(GNSS);
		createEAttribute(gnssEClass, GNSS__ID);
		createEAttribute(gnssEClass, GNSS__TIMESTAMP);
		createEAttribute(gnssEClass, GNSS__TYPE);
		createEAttribute(gnssEClass, GNSS__NMEASTRING);
		createEReference(gnssEClass, GNSS__JOURNEY);
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
		JourneyPackage theJourneyPackage = (JourneyPackage)EPackage.Registry.INSTANCE.getEPackage(JourneyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(gnssEClass, gnss.GNSS.class, "GNSS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGNSS_Id(), ecorePackage.getEString(), "id", null, 1, 1, gnss.GNSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSS_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, gnss.GNSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSS_Type(), theUtilsPackage.getNMEAType(), "type", "GPRMC", 0, 1, gnss.GNSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSS_Nmeastring(), ecorePackage.getEString(), "nmeastring", null, 0, 1, gnss.GNSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSS_Journey(), theJourneyPackage.getJourney(), null, "journey", null, 1, 1, gnss.GNSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGNSS_Journey().getEKeys().add(theJourneyPackage.getJourney_Id());

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
			   "utils", "#/"
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
		 * The meta object literal for the '{@link gnss.GNSS <em>GNSS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gnss.GNSS
		 * @see gnss.GnssPackage#getGNSS()
		 * @generated
		 */
		public static final EClass GNSS = eINSTANCE.getGNSS();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GNSS__ID = eINSTANCE.getGNSS_Id();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GNSS__TIMESTAMP = eINSTANCE.getGNSS_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GNSS__TYPE = eINSTANCE.getGNSS_Type();

		/**
		 * The meta object literal for the '<em><b>Nmeastring</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute GNSS__NMEASTRING = eINSTANCE.getGNSS_Nmeastring();

		/**
		 * The meta object literal for the '<em><b>Journey</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference GNSS__JOURNEY = eINSTANCE.getGNSS_Journey();

	}

} //GnssPackage
