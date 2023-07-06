/**
 */
package de.inavet.smarttrains.das.interfaces.lm.impl;

import de.inavet.smarttrains.das.interfaces.lm.ElectricalLoad;
import de.inavet.smarttrains.das.interfaces.lm.LmFactory;
import de.inavet.smarttrains.das.interfaces.lm.LmPackage;
import de.inavet.smarttrains.das.interfaces.lm.PrognosisForLM;
import de.inavet.smarttrains.das.interfaces.lm.PrognosisPositionAndElectricalLoad;

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
public class LmPackageImpl extends EPackageImpl implements LmPackage {
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
	 * @see de.inavet.smarttrains.das.interfaces.lm.LmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LmPackageImpl() {
		super(eNS_URI, LmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LmPackage init() {
		if (isInited) return (LmPackage)EPackage.Registry.INSTANCE.getEPackage(LmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LmPackageImpl theLmPackage = registeredLmPackage instanceof LmPackageImpl ? (LmPackageImpl)registeredLmPackage : new LmPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		UtilsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLmPackage.createPackageContents();

		// Initialize created meta-data
		theLmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LmPackage.eNS_URI, theLmPackage);
		return theLmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrognosisForLM() {
		return prognosisForLMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrognosisForLM_PresentPosition() {
		return (EReference)prognosisForLMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrognosisForLM_Timestamp() {
		return (EAttribute)prognosisForLMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrognosisForLM_PresentElectricalLoad() {
		return (EReference)prognosisForLMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrognosisForLM_PrognosisForPositionAndElectricalLoad() {
		return (EReference)prognosisForLMEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrognosisPositionAndElectricalLoad() {
		return prognosisPositionAndElectricalLoadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrognosisPositionAndElectricalLoad_TimestampForPrognosis() {
		return (EAttribute)prognosisPositionAndElectricalLoadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrognosisPositionAndElectricalLoad_PrognosisPosition() {
		return (EReference)prognosisPositionAndElectricalLoadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrognosisPositionAndElectricalLoad_ElectricalLoadPrognosis() {
		return (EReference)prognosisPositionAndElectricalLoadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectricalLoad() {
		return electricalLoadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricalLoad_DrivePower() {
		return (EAttribute)electricalLoadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricalLoad_AuxiliaryPower() {
		return (EAttribute)electricalLoadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LmFactory getLmFactory() {
		return (LmFactory)getEFactoryInstance();
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
		initEAttribute(getPrognosisForLM_Timestamp(), ecorePackage.getELong(), "timestamp", null, 1, 1, PrognosisForLM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisForLM_PresentElectricalLoad(), this.getElectricalLoad(), null, "presentElectricalLoad", null, 1, 1, PrognosisForLM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisForLM_PrognosisForPositionAndElectricalLoad(), this.getPrognosisPositionAndElectricalLoad(), null, "prognosisForPositionAndElectricalLoad", null, 1, -1, PrognosisForLM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prognosisPositionAndElectricalLoadEClass, PrognosisPositionAndElectricalLoad.class, "PrognosisPositionAndElectricalLoad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrognosisPositionAndElectricalLoad_TimestampForPrognosis(), ecorePackage.getELong(), "timestampForPrognosis", null, 1, 1, PrognosisPositionAndElectricalLoad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisPositionAndElectricalLoad_PrognosisPosition(), theUtilsPackage.getPosition(), null, "prognosisPosition", null, 1, 1, PrognosisPositionAndElectricalLoad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisPositionAndElectricalLoad_ElectricalLoadPrognosis(), this.getElectricalLoad(), null, "electricalLoadPrognosis", null, 1, 1, PrognosisPositionAndElectricalLoad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(electricalLoadEClass, ElectricalLoad.class, "ElectricalLoad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElectricalLoad_DrivePower(), ecorePackage.getEDouble(), "drivePower", null, 1, 1, ElectricalLoad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectricalLoad_AuxiliaryPower(), ecorePackage.getEDouble(), "auxiliaryPower", null, 1, 1, ElectricalLoad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //LmPackageImpl
