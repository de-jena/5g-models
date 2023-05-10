/**
 */
package lm_interface;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import utils.UtilsPackage;

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
 * @see lm_interface.Lm_interfaceFactory
 * @generated
 */
public class Lm_interfacePackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "lm_interface";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://inavet.de/datamodels/lm_interface";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "lm_interface";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Lm_interfacePackage eINSTANCE = lm_interface.Lm_interfacePackage.init();

	/**
	 * The meta object id for the '{@link lm_interface.PrognosisForLM <em>Prognosis For LM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lm_interface.PrognosisForLM
	 * @see lm_interface.Lm_interfacePackage#getPrognosisForLM()
	 * @generated
	 */
	public static final int PROGNOSIS_FOR_LM = 0;

	/**
	 * The feature id for the '<em><b>Present Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_FOR_LM__PRESENT_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_FOR_LM__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Present Electrical Load</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_FOR_LM__PRESENT_ELECTRICAL_LOAD = 2;

	/**
	 * The feature id for the '<em><b>Prognosis For Position And Electrical Load</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_FOR_LM__PROGNOSIS_FOR_POSITION_AND_ELECTRICAL_LOAD = 3;

	/**
	 * The number of structural features of the '<em>Prognosis For LM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_FOR_LM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Prognosis For LM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_FOR_LM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lm_interface.PrognosisPositionAndElectricalLoad <em>Prognosis Position And Electrical Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lm_interface.PrognosisPositionAndElectricalLoad
	 * @see lm_interface.Lm_interfacePackage#getPrognosisPositionAndElectricalLoad()
	 * @generated
	 */
	public static final int PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD = 1;

	/**
	 * The feature id for the '<em><b>Timestamp For Prognosis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__TIMESTAMP_FOR_PROGNOSIS = 0;

	/**
	 * The feature id for the '<em><b>Prognosis Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__PROGNOSIS_POSITION = 1;

	/**
	 * The feature id for the '<em><b>Electrical Load Prognosis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__ELECTRICAL_LOAD_PROGNOSIS = 2;

	/**
	 * The number of structural features of the '<em>Prognosis Position And Electrical Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Prognosis Position And Electrical Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lm_interface.ElectricalLoad <em>Electrical Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lm_interface.ElectricalLoad
	 * @see lm_interface.Lm_interfacePackage#getElectricalLoad()
	 * @generated
	 */
	public static final int ELECTRICAL_LOAD = 2;

	/**
	 * The feature id for the '<em><b>Drive Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_LOAD__DRIVE_POWER = 0;

	/**
	 * The feature id for the '<em><b>Auxiliary Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_LOAD__AUXILIARY_POWER = 1;

	/**
	 * The number of structural features of the '<em>Electrical Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_LOAD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Electrical Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICAL_LOAD_OPERATION_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prognosisForLMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prognosisPositionAndElectricalLoadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricalLoadEClass = null;

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
	 * @see lm_interface.Lm_interfacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Lm_interfacePackage() {
		super(eNS_URI, Lm_interfaceFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link Lm_interfacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Lm_interfacePackage init() {
		if (isInited) return (Lm_interfacePackage)EPackage.Registry.INSTANCE.getEPackage(Lm_interfacePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLm_interfacePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Lm_interfacePackage theLm_interfacePackage = registeredLm_interfacePackage instanceof Lm_interfacePackage ? (Lm_interfacePackage)registeredLm_interfacePackage : new Lm_interfacePackage();

		isInited = true;

		// Initialize simple dependencies
		UtilsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLm_interfacePackage.createPackageContents();

		// Initialize created meta-data
		theLm_interfacePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLm_interfacePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Lm_interfacePackage.eNS_URI, theLm_interfacePackage);
		return theLm_interfacePackage;
	}


	/**
	 * Returns the meta object for class '{@link lm_interface.PrognosisForLM <em>Prognosis For LM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prognosis For LM</em>'.
	 * @see lm_interface.PrognosisForLM
	 * @generated
	 */
	public EClass getPrognosisForLM() {
		return prognosisForLMEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link lm_interface.PrognosisForLM#getPresentPosition <em>Present Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Present Position</em>'.
	 * @see lm_interface.PrognosisForLM#getPresentPosition()
	 * @see #getPrognosisForLM()
	 * @generated
	 */
	public EReference getPrognosisForLM_PresentPosition() {
		return (EReference)prognosisForLMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link lm_interface.PrognosisForLM#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see lm_interface.PrognosisForLM#getTimestamp()
	 * @see #getPrognosisForLM()
	 * @generated
	 */
	public EAttribute getPrognosisForLM_Timestamp() {
		return (EAttribute)prognosisForLMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link lm_interface.PrognosisForLM#getPresentElectricalLoad <em>Present Electrical Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Present Electrical Load</em>'.
	 * @see lm_interface.PrognosisForLM#getPresentElectricalLoad()
	 * @see #getPrognosisForLM()
	 * @generated
	 */
	public EReference getPrognosisForLM_PresentElectricalLoad() {
		return (EReference)prognosisForLMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link lm_interface.PrognosisForLM#getPrognosisForPositionAndElectricalLoad <em>Prognosis For Position And Electrical Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Prognosis For Position And Electrical Load</em>'.
	 * @see lm_interface.PrognosisForLM#getPrognosisForPositionAndElectricalLoad()
	 * @see #getPrognosisForLM()
	 * @generated
	 */
	public EReference getPrognosisForLM_PrognosisForPositionAndElectricalLoad() {
		return (EReference)prognosisForLMEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link lm_interface.PrognosisPositionAndElectricalLoad <em>Prognosis Position And Electrical Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prognosis Position And Electrical Load</em>'.
	 * @see lm_interface.PrognosisPositionAndElectricalLoad
	 * @generated
	 */
	public EClass getPrognosisPositionAndElectricalLoad() {
		return prognosisPositionAndElectricalLoadEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link lm_interface.PrognosisPositionAndElectricalLoad#getTimestampForPrognosis <em>Timestamp For Prognosis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp For Prognosis</em>'.
	 * @see lm_interface.PrognosisPositionAndElectricalLoad#getTimestampForPrognosis()
	 * @see #getPrognosisPositionAndElectricalLoad()
	 * @generated
	 */
	public EAttribute getPrognosisPositionAndElectricalLoad_TimestampForPrognosis() {
		return (EAttribute)prognosisPositionAndElectricalLoadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link lm_interface.PrognosisPositionAndElectricalLoad#getPrognosisPosition <em>Prognosis Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prognosis Position</em>'.
	 * @see lm_interface.PrognosisPositionAndElectricalLoad#getPrognosisPosition()
	 * @see #getPrognosisPositionAndElectricalLoad()
	 * @generated
	 */
	public EReference getPrognosisPositionAndElectricalLoad_PrognosisPosition() {
		return (EReference)prognosisPositionAndElectricalLoadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link lm_interface.PrognosisPositionAndElectricalLoad#getElectricalLoadPrognosis <em>Electrical Load Prognosis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Electrical Load Prognosis</em>'.
	 * @see lm_interface.PrognosisPositionAndElectricalLoad#getElectricalLoadPrognosis()
	 * @see #getPrognosisPositionAndElectricalLoad()
	 * @generated
	 */
	public EReference getPrognosisPositionAndElectricalLoad_ElectricalLoadPrognosis() {
		return (EReference)prognosisPositionAndElectricalLoadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link lm_interface.ElectricalLoad <em>Electrical Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electrical Load</em>'.
	 * @see lm_interface.ElectricalLoad
	 * @generated
	 */
	public EClass getElectricalLoad() {
		return electricalLoadEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link lm_interface.ElectricalLoad#getDrivePower <em>Drive Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drive Power</em>'.
	 * @see lm_interface.ElectricalLoad#getDrivePower()
	 * @see #getElectricalLoad()
	 * @generated
	 */
	public EAttribute getElectricalLoad_DrivePower() {
		return (EAttribute)electricalLoadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link lm_interface.ElectricalLoad#getAuxiliaryPower <em>Auxiliary Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auxiliary Power</em>'.
	 * @see lm_interface.ElectricalLoad#getAuxiliaryPower()
	 * @see #getElectricalLoad()
	 * @generated
	 */
	public EAttribute getElectricalLoad_AuxiliaryPower() {
		return (EAttribute)electricalLoadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public Lm_interfaceFactory getLm_interfaceFactory() {
		return (Lm_interfaceFactory)getEFactoryInstance();
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
		prognosisForLMEClass = createEClass(PROGNOSIS_FOR_LM);
		createEReference(prognosisForLMEClass, PROGNOSIS_FOR_LM__PRESENT_POSITION);
		createEAttribute(prognosisForLMEClass, PROGNOSIS_FOR_LM__TIMESTAMP);
		createEReference(prognosisForLMEClass, PROGNOSIS_FOR_LM__PRESENT_ELECTRICAL_LOAD);
		createEReference(prognosisForLMEClass, PROGNOSIS_FOR_LM__PROGNOSIS_FOR_POSITION_AND_ELECTRICAL_LOAD);

		prognosisPositionAndElectricalLoadEClass = createEClass(PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD);
		createEAttribute(prognosisPositionAndElectricalLoadEClass, PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__TIMESTAMP_FOR_PROGNOSIS);
		createEReference(prognosisPositionAndElectricalLoadEClass, PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__PROGNOSIS_POSITION);
		createEReference(prognosisPositionAndElectricalLoadEClass, PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__ELECTRICAL_LOAD_PROGNOSIS);

		electricalLoadEClass = createEClass(ELECTRICAL_LOAD);
		createEAttribute(electricalLoadEClass, ELECTRICAL_LOAD__DRIVE_POWER);
		createEAttribute(electricalLoadEClass, ELECTRICAL_LOAD__AUXILIARY_POWER);
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
		initEClass(prognosisForLMEClass, PrognosisForLM.class, "PrognosisForLM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrognosisForLM_PresentPosition(), theUtilsPackage.getPosition(), null, "presentPosition", null, 1, 1, PrognosisForLM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrognosisForLM_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, PrognosisForLM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisForLM_PresentElectricalLoad(), this.getElectricalLoad(), null, "presentElectricalLoad", null, 1, 1, PrognosisForLM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisForLM_PrognosisForPositionAndElectricalLoad(), this.getPrognosisPositionAndElectricalLoad(), null, "prognosisForPositionAndElectricalLoad", null, 1, -1, PrognosisForLM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prognosisPositionAndElectricalLoadEClass, PrognosisPositionAndElectricalLoad.class, "PrognosisPositionAndElectricalLoad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrognosisPositionAndElectricalLoad_TimestampForPrognosis(), theUtilsPackage.getZonedDateTime(), "timestampForPrognosis", null, 1, 1, PrognosisPositionAndElectricalLoad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisPositionAndElectricalLoad_PrognosisPosition(), theUtilsPackage.getPosition(), null, "prognosisPosition", null, 1, 1, PrognosisPositionAndElectricalLoad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisPositionAndElectricalLoad_ElectricalLoadPrognosis(), this.getElectricalLoad(), null, "electricalLoadPrognosis", null, 1, 1, PrognosisPositionAndElectricalLoad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(electricalLoadEClass, ElectricalLoad.class, "ElectricalLoad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElectricalLoad_DrivePower(), ecorePackage.getEDouble(), "drivePower", null, 1, 1, ElectricalLoad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectricalLoad_AuxiliaryPower(), ecorePackage.getEDouble(), "auxiliaryPower", null, 1, 1, ElectricalLoad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
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
		 * The meta object literal for the '{@link lm_interface.PrognosisForLM <em>Prognosis For LM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lm_interface.PrognosisForLM
		 * @see lm_interface.Lm_interfacePackage#getPrognosisForLM()
		 * @generated
		 */
		public static final EClass PROGNOSIS_FOR_LM = eINSTANCE.getPrognosisForLM();

		/**
		 * The meta object literal for the '<em><b>Present Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROGNOSIS_FOR_LM__PRESENT_POSITION = eINSTANCE.getPrognosisForLM_PresentPosition();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROGNOSIS_FOR_LM__TIMESTAMP = eINSTANCE.getPrognosisForLM_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Present Electrical Load</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROGNOSIS_FOR_LM__PRESENT_ELECTRICAL_LOAD = eINSTANCE.getPrognosisForLM_PresentElectricalLoad();

		/**
		 * The meta object literal for the '<em><b>Prognosis For Position And Electrical Load</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROGNOSIS_FOR_LM__PROGNOSIS_FOR_POSITION_AND_ELECTRICAL_LOAD = eINSTANCE.getPrognosisForLM_PrognosisForPositionAndElectricalLoad();

		/**
		 * The meta object literal for the '{@link lm_interface.PrognosisPositionAndElectricalLoad <em>Prognosis Position And Electrical Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lm_interface.PrognosisPositionAndElectricalLoad
		 * @see lm_interface.Lm_interfacePackage#getPrognosisPositionAndElectricalLoad()
		 * @generated
		 */
		public static final EClass PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD = eINSTANCE.getPrognosisPositionAndElectricalLoad();

		/**
		 * The meta object literal for the '<em><b>Timestamp For Prognosis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__TIMESTAMP_FOR_PROGNOSIS = eINSTANCE.getPrognosisPositionAndElectricalLoad_TimestampForPrognosis();

		/**
		 * The meta object literal for the '<em><b>Prognosis Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__PROGNOSIS_POSITION = eINSTANCE.getPrognosisPositionAndElectricalLoad_PrognosisPosition();

		/**
		 * The meta object literal for the '<em><b>Electrical Load Prognosis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__ELECTRICAL_LOAD_PROGNOSIS = eINSTANCE.getPrognosisPositionAndElectricalLoad_ElectricalLoadPrognosis();

		/**
		 * The meta object literal for the '{@link lm_interface.ElectricalLoad <em>Electrical Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lm_interface.ElectricalLoad
		 * @see lm_interface.Lm_interfacePackage#getElectricalLoad()
		 * @generated
		 */
		public static final EClass ELECTRICAL_LOAD = eINSTANCE.getElectricalLoad();

		/**
		 * The meta object literal for the '<em><b>Drive Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ELECTRICAL_LOAD__DRIVE_POWER = eINSTANCE.getElectricalLoad_DrivePower();

		/**
		 * The meta object literal for the '<em><b>Auxiliary Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ELECTRICAL_LOAD__AUXILIARY_POWER = eINSTANCE.getElectricalLoad_AuxiliaryPower();

	}

} //Lm_interfacePackage
