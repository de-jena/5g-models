/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc.impl;

import de.inavet.smarttrains.das.interfaces.ctlc.CtlcFactory;
import de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage;
import de.inavet.smarttrains.das.interfaces.ctlc.MarkedPosition;
import de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate;
import de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition;
import de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride;
import de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace;
import de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest;
import de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse;
import de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector;
import de.inavet.smarttrains.das.interfaces.ctlc.Scenario;
import de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis;
import de.inavet.smarttrains.das.interfaces.ctlc.SignalGroup;
import de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle;

import de.inavet.smarttrains.das.interfaces.utils.UtilsPackage;

import de.inavet.smarttrains.das.interfaces.vehicle.VehiclePackage;

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
public class CtlcPackageImpl extends EPackageImpl implements CtlcPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateForVehicleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prognosisArrivalAndPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prognosisStopPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markedPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseTimePrognosisRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prognosisOverrideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseTimePrognosisResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioPrognosisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseTimeVectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalGroupEClass = null;

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
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CtlcPackageImpl() {
		super(eNS_URI, CtlcFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CtlcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CtlcPackage init() {
		if (isInited) return (CtlcPackage)EPackage.Registry.INSTANCE.getEPackage(CtlcPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCtlcPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CtlcPackageImpl theCtlcPackage = registeredCtlcPackage instanceof CtlcPackageImpl ? (CtlcPackageImpl)registeredCtlcPackage : new CtlcPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		UtilsPackage.eINSTANCE.eClass();
		VehiclePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCtlcPackage.createPackageContents();

		// Initialize created meta-data
		theCtlcPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCtlcPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CtlcPackage.eNS_URI, theCtlcPackage);
		return theCtlcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicUpdate() {
		return periodicUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPeriodicUpdate_Timestamp() {
		return (EAttribute)periodicUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriodicUpdate_Updates() {
		return (EReference)periodicUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateForVehicle() {
		return updateForVehicleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateForVehicle_Vehicle() {
		return (EReference)updateForVehicleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateForVehicle_CurrentPosition() {
		return (EReference)updateForVehicleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateForVehicle_CurrentVelocity() {
		return (EAttribute)updateForVehicleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateForVehicle_Arrivals() {
		return (EReference)updateForVehicleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateForVehicle_StopPlaces() {
		return (EReference)updateForVehicleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrognosisArrivalAndPosition() {
		return prognosisArrivalAndPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrognosisArrivalAndPosition_EstimatedArrivalTime() {
		return (EAttribute)prognosisArrivalAndPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrognosisArrivalAndPosition_ArrivalPosition() {
		return (EReference)prognosisArrivalAndPositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrognosisArrivalAndPosition_Priority() {
		return (EAttribute)prognosisArrivalAndPositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrognosisStopPlace() {
		return prognosisStopPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrognosisStopPlace_StopPosition() {
		return (EReference)prognosisStopPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrognosisStopPlace_PrognosedPlace() {
		return (EAttribute)prognosisStopPlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarkedPosition() {
		return markedPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarkedPosition_Id() {
		return (EAttribute)markedPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarkedPosition_Name() {
		return (EAttribute)markedPositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReleaseTimePrognosisRequest() {
		return releaseTimePrognosisRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseTimePrognosisRequest_Timestamp() {
		return (EAttribute)releaseTimePrognosisRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseTimePrognosisRequest_RequestId() {
		return (EAttribute)releaseTimePrognosisRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseTimePrognosisRequest_IntersectionId() {
		return (EAttribute)releaseTimePrognosisRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseTimePrognosisRequest_Scenarios() {
		return (EReference)releaseTimePrognosisRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_ScenarioId() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Overrides() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrognosisOverride() {
		return prognosisOverrideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrognosisOverride_Vehicle() {
		return (EReference)prognosisOverrideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrognosisOverride_Prognosis() {
		return (EReference)prognosisOverrideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReleaseTimePrognosisResponse() {
		return releaseTimePrognosisResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseTimePrognosisResponse_Timestamp() {
		return (EAttribute)releaseTimePrognosisResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseTimePrognosisResponse_RefRequestId() {
		return (EAttribute)releaseTimePrognosisResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseTimePrognosisResponse_ReleaseTimes() {
		return (EReference)releaseTimePrognosisResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseTimePrognosisResponse_ReleaseTimesForScenarios() {
		return (EReference)releaseTimePrognosisResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenarioPrognosis() {
		return scenarioPrognosisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenarioPrognosis_RefScenarioId() {
		return (EAttribute)scenarioPrognosisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioPrognosis_ReleaseTimes() {
		return (EReference)scenarioPrognosisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReleaseTimeVector() {
		return releaseTimeVectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseTimeVector_Values() {
		return (EAttribute)releaseTimeVectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReleaseTimeVector_SignalGroup() {
		return (EReference)releaseTimeVectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalGroup() {
		return signalGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalGroup_SignalGroupId() {
		return (EAttribute)signalGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtlcFactory getCtlcFactory() {
		return (CtlcFactory)getEFactoryInstance();
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
		periodicUpdateEClass = createEClass(PERIODIC_UPDATE);
		createEAttribute(periodicUpdateEClass, PERIODIC_UPDATE__TIMESTAMP);
		createEReference(periodicUpdateEClass, PERIODIC_UPDATE__UPDATES);

		updateForVehicleEClass = createEClass(UPDATE_FOR_VEHICLE);
		createEReference(updateForVehicleEClass, UPDATE_FOR_VEHICLE__VEHICLE);
		createEReference(updateForVehicleEClass, UPDATE_FOR_VEHICLE__CURRENT_POSITION);
		createEAttribute(updateForVehicleEClass, UPDATE_FOR_VEHICLE__CURRENT_VELOCITY);
		createEReference(updateForVehicleEClass, UPDATE_FOR_VEHICLE__ARRIVALS);
		createEReference(updateForVehicleEClass, UPDATE_FOR_VEHICLE__STOP_PLACES);

		prognosisArrivalAndPositionEClass = createEClass(PROGNOSIS_ARRIVAL_AND_POSITION);
		createEAttribute(prognosisArrivalAndPositionEClass, PROGNOSIS_ARRIVAL_AND_POSITION__ESTIMATED_ARRIVAL_TIME);
		createEReference(prognosisArrivalAndPositionEClass, PROGNOSIS_ARRIVAL_AND_POSITION__ARRIVAL_POSITION);
		createEAttribute(prognosisArrivalAndPositionEClass, PROGNOSIS_ARRIVAL_AND_POSITION__PRIORITY);

		prognosisStopPlaceEClass = createEClass(PROGNOSIS_STOP_PLACE);
		createEReference(prognosisStopPlaceEClass, PROGNOSIS_STOP_PLACE__STOP_POSITION);
		createEAttribute(prognosisStopPlaceEClass, PROGNOSIS_STOP_PLACE__PROGNOSED_PLACE);

		markedPositionEClass = createEClass(MARKED_POSITION);
		createEAttribute(markedPositionEClass, MARKED_POSITION__ID);
		createEAttribute(markedPositionEClass, MARKED_POSITION__NAME);

		releaseTimePrognosisRequestEClass = createEClass(RELEASE_TIME_PROGNOSIS_REQUEST);
		createEAttribute(releaseTimePrognosisRequestEClass, RELEASE_TIME_PROGNOSIS_REQUEST__TIMESTAMP);
		createEAttribute(releaseTimePrognosisRequestEClass, RELEASE_TIME_PROGNOSIS_REQUEST__REQUEST_ID);
		createEAttribute(releaseTimePrognosisRequestEClass, RELEASE_TIME_PROGNOSIS_REQUEST__INTERSECTION_ID);
		createEReference(releaseTimePrognosisRequestEClass, RELEASE_TIME_PROGNOSIS_REQUEST__SCENARIOS);

		scenarioEClass = createEClass(SCENARIO);
		createEAttribute(scenarioEClass, SCENARIO__SCENARIO_ID);
		createEReference(scenarioEClass, SCENARIO__OVERRIDES);

		prognosisOverrideEClass = createEClass(PROGNOSIS_OVERRIDE);
		createEReference(prognosisOverrideEClass, PROGNOSIS_OVERRIDE__VEHICLE);
		createEReference(prognosisOverrideEClass, PROGNOSIS_OVERRIDE__PROGNOSIS);

		releaseTimePrognosisResponseEClass = createEClass(RELEASE_TIME_PROGNOSIS_RESPONSE);
		createEAttribute(releaseTimePrognosisResponseEClass, RELEASE_TIME_PROGNOSIS_RESPONSE__TIMESTAMP);
		createEAttribute(releaseTimePrognosisResponseEClass, RELEASE_TIME_PROGNOSIS_RESPONSE__REF_REQUEST_ID);
		createEReference(releaseTimePrognosisResponseEClass, RELEASE_TIME_PROGNOSIS_RESPONSE__RELEASE_TIMES);
		createEReference(releaseTimePrognosisResponseEClass, RELEASE_TIME_PROGNOSIS_RESPONSE__RELEASE_TIMES_FOR_SCENARIOS);

		scenarioPrognosisEClass = createEClass(SCENARIO_PROGNOSIS);
		createEAttribute(scenarioPrognosisEClass, SCENARIO_PROGNOSIS__REF_SCENARIO_ID);
		createEReference(scenarioPrognosisEClass, SCENARIO_PROGNOSIS__RELEASE_TIMES);

		releaseTimeVectorEClass = createEClass(RELEASE_TIME_VECTOR);
		createEAttribute(releaseTimeVectorEClass, RELEASE_TIME_VECTOR__VALUES);
		createEReference(releaseTimeVectorEClass, RELEASE_TIME_VECTOR__SIGNAL_GROUP);

		signalGroupEClass = createEClass(SIGNAL_GROUP);
		createEAttribute(signalGroupEClass, SIGNAL_GROUP__SIGNAL_GROUP_ID);
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
		initEClass(periodicUpdateEClass, PeriodicUpdate.class, "PeriodicUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeriodicUpdate_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, PeriodicUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriodicUpdate_Updates(), this.getUpdateForVehicle(), null, "updates", null, 1, -1, PeriodicUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateForVehicleEClass, UpdateForVehicle.class, "UpdateForVehicle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateForVehicle_Vehicle(), theVehiclePackage.getVehicle(), null, "vehicle", null, 1, 1, UpdateForVehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateForVehicle_CurrentPosition(), theUtilsPackage.getPosition(), null, "currentPosition", null, 1, 1, UpdateForVehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateForVehicle_CurrentVelocity(), ecorePackage.getEDouble(), "currentVelocity", null, 1, 1, UpdateForVehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateForVehicle_Arrivals(), this.getPrognosisArrivalAndPosition(), null, "arrivals", null, 1, -1, UpdateForVehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateForVehicle_StopPlaces(), this.getPrognosisStopPlace(), null, "stopPlaces", null, 0, -1, UpdateForVehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prognosisArrivalAndPositionEClass, PrognosisArrivalAndPosition.class, "PrognosisArrivalAndPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrognosisArrivalAndPosition_EstimatedArrivalTime(), theUtilsPackage.getZonedDateTime(), "estimatedArrivalTime", null, 1, 1, PrognosisArrivalAndPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisArrivalAndPosition_ArrivalPosition(), this.getMarkedPosition(), null, "arrivalPosition", null, 1, 1, PrognosisArrivalAndPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrognosisArrivalAndPosition_Priority(), ecorePackage.getEDouble(), "priority", null, 1, 1, PrognosisArrivalAndPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prognosisStopPlaceEClass, PrognosisStopPlace.class, "PrognosisStopPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrognosisStopPlace_StopPosition(), this.getMarkedPosition(), null, "stopPosition", null, 1, 1, PrognosisStopPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrognosisStopPlace_PrognosedPlace(), ecorePackage.getEInt(), "prognosedPlace", null, 1, 1, PrognosisStopPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markedPositionEClass, MarkedPosition.class, "MarkedPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarkedPosition_Id(), ecorePackage.getEString(), "id", null, 0, 1, MarkedPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarkedPosition_Name(), ecorePackage.getEString(), "name", null, 0, 1, MarkedPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseTimePrognosisRequestEClass, ReleaseTimePrognosisRequest.class, "ReleaseTimePrognosisRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReleaseTimePrognosisRequest_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, ReleaseTimePrognosisRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReleaseTimePrognosisRequest_RequestId(), ecorePackage.getEString(), "requestId", null, 1, 1, ReleaseTimePrognosisRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReleaseTimePrognosisRequest_IntersectionId(), ecorePackage.getEString(), "intersectionId", null, 1, 1, ReleaseTimePrognosisRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReleaseTimePrognosisRequest_Scenarios(), this.getScenario(), null, "scenarios", null, 0, -1, ReleaseTimePrognosisRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScenario_ScenarioId(), ecorePackage.getEString(), "scenarioId", null, 1, 1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Overrides(), this.getPrognosisOverride(), null, "overrides", null, 1, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prognosisOverrideEClass, PrognosisOverride.class, "PrognosisOverride", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrognosisOverride_Vehicle(), theVehiclePackage.getVehicle(), null, "vehicle", null, 0, 1, PrognosisOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisOverride_Prognosis(), this.getPrognosisArrivalAndPosition(), null, "prognosis", null, 0, 1, PrognosisOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseTimePrognosisResponseEClass, ReleaseTimePrognosisResponse.class, "ReleaseTimePrognosisResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReleaseTimePrognosisResponse_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, ReleaseTimePrognosisResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReleaseTimePrognosisResponse_RefRequestId(), ecorePackage.getEString(), "refRequestId", null, 1, 1, ReleaseTimePrognosisResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReleaseTimePrognosisResponse_ReleaseTimes(), this.getReleaseTimeVector(), null, "releaseTimes", null, 1, -1, ReleaseTimePrognosisResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReleaseTimePrognosisResponse_ReleaseTimesForScenarios(), this.getScenarioPrognosis(), null, "releaseTimesForScenarios", null, 0, -1, ReleaseTimePrognosisResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioPrognosisEClass, ScenarioPrognosis.class, "ScenarioPrognosis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScenarioPrognosis_RefScenarioId(), ecorePackage.getEString(), "refScenarioId", null, 1, 1, ScenarioPrognosis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioPrognosis_ReleaseTimes(), this.getReleaseTimeVector(), null, "releaseTimes", null, 1, -1, ScenarioPrognosis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseTimeVectorEClass, ReleaseTimeVector.class, "ReleaseTimeVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReleaseTimeVector_Values(), ecorePackage.getEDouble(), "values", null, 1, -1, ReleaseTimeVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReleaseTimeVector_SignalGroup(), this.getSignalGroup(), null, "signalGroup", null, 1, 1, ReleaseTimeVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalGroupEClass, SignalGroup.class, "SignalGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignalGroup_SignalGroupId(), ecorePackage.getEString(), "signalGroupId", null, 1, 1, SignalGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CtlcPackageImpl
