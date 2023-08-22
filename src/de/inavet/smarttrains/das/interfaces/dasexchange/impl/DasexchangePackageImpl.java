/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange.impl;

import de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange;
import de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse;
import de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangeFactory;
import de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage;
import de.inavet.smarttrains.das.interfaces.dasexchange.PositionOverTime;
import de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney;
import de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation;
import de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile;
import de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition;
import de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime;
import de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot;
import de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney;
import de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory;

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
public class DasexchangePackageImpl extends EPackageImpl implements DasexchangePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dasExchangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dasExchangeResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recommendationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recommendationResponseFromMobileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSlotOnJourneyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speedOverPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speedOverTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionOverTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prognosisTimeSlotForJourneyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trajectoryEClass = null;

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
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DasexchangePackageImpl() {
		super(eNS_URI, DasexchangeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DasexchangePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DasexchangePackage init() {
		if (isInited) return (DasexchangePackage)EPackage.Registry.INSTANCE.getEPackage(DasexchangePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDasexchangePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DasexchangePackageImpl theDasexchangePackage = registeredDasexchangePackage instanceof DasexchangePackageImpl ? (DasexchangePackageImpl)registeredDasexchangePackage : new DasexchangePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		UtilsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDasexchangePackage.createPackageContents();

		// Initialize created meta-data
		theDasexchangePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDasexchangePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DasexchangePackage.eNS_URI, theDasexchangePackage);
		return theDasexchangePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDASExchange() {
		return dasExchangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDASExchange_Id() {
		return (EAttribute)dasExchangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDASExchange_JourneyId() {
		return (EAttribute)dasExchangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDASExchange_Timestamp() {
		return (EAttribute)dasExchangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDASExchange_Trajectory() {
		return (EReference)dasExchangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDASExchange_Recommendation() {
		return (EReference)dasExchangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDASExchange_GnssStatus() {
		return (EAttribute)dasExchangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDASExchange_DasStatus() {
		return (EAttribute)dasExchangeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDASExchange_TimeSlotsOnJourney() {
		return (EReference)dasExchangeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDASExchangeResponse() {
		return dasExchangeResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDASExchangeResponse_Id() {
		return (EAttribute)dasExchangeResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDASExchangeResponse_Timestamp() {
		return (EAttribute)dasExchangeResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDASExchangeResponse_DasExchangeIdToResponse() {
		return (EAttribute)dasExchangeResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDASExchangeResponse_JourneyId() {
		return (EAttribute)dasExchangeResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecommendation() {
		return recommendationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecommendation_Id() {
		return (EAttribute)recommendationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecommendation_JourneyId() {
		return (EAttribute)recommendationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecommendation_TargetSpeed() {
		return (EAttribute)recommendationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecommendation_CountdownForDeparture() {
		return (EAttribute)recommendationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecommendation_RecommendationType() {
		return (EAttribute)recommendationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecommendation_StartTimeForInformationOrRecommendation() {
		return (EAttribute)recommendationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecommendation_Timestamp() {
		return (EAttribute)recommendationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecommendationResponseFromMobile() {
		return recommendationResponseFromMobileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecommendationResponseFromMobile_ReceivedRecommendation() {
		return (EAttribute)recommendationResponseFromMobileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecommendationResponseFromMobile_RecommendationId() {
		return (EAttribute)recommendationResponseFromMobileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecommendationResponseFromMobile_Timestamp() {
		return (EAttribute)recommendationResponseFromMobileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeSlotOnJourney() {
		return timeSlotOnJourneyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeSlotOnJourney_TimeSlot() {
		return (EReference)timeSlotOnJourneyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeSlotOnJourney_Position() {
		return (EReference)timeSlotOnJourneyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeSlot() {
		return timeSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeSlot_BeginOfTimeSlot() {
		return (EAttribute)timeSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeSlot_EndOfTimeSlot() {
		return (EAttribute)timeSlotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeedOverPosition() {
		return speedOverPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpeedOverPosition_Speed() {
		return (EReference)speedOverPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpeedOverPosition_Position() {
		return (EReference)speedOverPositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeedOverTime() {
		return speedOverTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpeedOverTime_Speed() {
		return (EReference)speedOverTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeedOverTime_Timestamp() {
		return (EAttribute)speedOverTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionOverTime() {
		return positionOverTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPositionOverTime_Position() {
		return (EReference)positionOverTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionOverTime_Timestamp() {
		return (EAttribute)positionOverTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrognosisTimeSlotForJourney() {
		return prognosisTimeSlotForJourneyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrognosisTimeSlotForJourney_JourneyId() {
		return (EAttribute)prognosisTimeSlotForJourneyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrognosisTimeSlotForJourney_TimeSlotsOnJourney() {
		return (EReference)prognosisTimeSlotForJourneyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrajectory() {
		return trajectoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrajectory_Id() {
		return (EAttribute)trajectoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrajectory_Vehicle() {
		return (EReference)trajectoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrajectory_SpeedOverPosition() {
		return (EReference)trajectoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrajectory_SpeedOverTime() {
		return (EReference)trajectoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrajectory_PositionOverTime() {
		return (EReference)trajectoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DasexchangeFactory getDasexchangeFactory() {
		return (DasexchangeFactory)getEFactoryInstance();
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
		dasExchangeEClass = createEClass(DAS_EXCHANGE);
		createEAttribute(dasExchangeEClass, DAS_EXCHANGE__ID);
		createEAttribute(dasExchangeEClass, DAS_EXCHANGE__JOURNEY_ID);
		createEAttribute(dasExchangeEClass, DAS_EXCHANGE__TIMESTAMP);
		createEReference(dasExchangeEClass, DAS_EXCHANGE__TRAJECTORY);
		createEReference(dasExchangeEClass, DAS_EXCHANGE__RECOMMENDATION);
		createEAttribute(dasExchangeEClass, DAS_EXCHANGE__GNSS_STATUS);
		createEAttribute(dasExchangeEClass, DAS_EXCHANGE__DAS_STATUS);
		createEReference(dasExchangeEClass, DAS_EXCHANGE__TIME_SLOTS_ON_JOURNEY);

		dasExchangeResponseEClass = createEClass(DAS_EXCHANGE_RESPONSE);
		createEAttribute(dasExchangeResponseEClass, DAS_EXCHANGE_RESPONSE__ID);
		createEAttribute(dasExchangeResponseEClass, DAS_EXCHANGE_RESPONSE__TIMESTAMP);
		createEAttribute(dasExchangeResponseEClass, DAS_EXCHANGE_RESPONSE__DAS_EXCHANGE_ID_TO_RESPONSE);
		createEAttribute(dasExchangeResponseEClass, DAS_EXCHANGE_RESPONSE__JOURNEY_ID);

		recommendationEClass = createEClass(RECOMMENDATION);
		createEAttribute(recommendationEClass, RECOMMENDATION__ID);
		createEAttribute(recommendationEClass, RECOMMENDATION__JOURNEY_ID);
		createEAttribute(recommendationEClass, RECOMMENDATION__TARGET_SPEED);
		createEAttribute(recommendationEClass, RECOMMENDATION__COUNTDOWN_FOR_DEPARTURE);
		createEAttribute(recommendationEClass, RECOMMENDATION__RECOMMENDATION_TYPE);
		createEAttribute(recommendationEClass, RECOMMENDATION__START_TIME_FOR_INFORMATION_OR_RECOMMENDATION);
		createEAttribute(recommendationEClass, RECOMMENDATION__TIMESTAMP);

		recommendationResponseFromMobileEClass = createEClass(RECOMMENDATION_RESPONSE_FROM_MOBILE);
		createEAttribute(recommendationResponseFromMobileEClass, RECOMMENDATION_RESPONSE_FROM_MOBILE__RECEIVED_RECOMMENDATION);
		createEAttribute(recommendationResponseFromMobileEClass, RECOMMENDATION_RESPONSE_FROM_MOBILE__RECOMMENDATION_ID);
		createEAttribute(recommendationResponseFromMobileEClass, RECOMMENDATION_RESPONSE_FROM_MOBILE__TIMESTAMP);

		timeSlotOnJourneyEClass = createEClass(TIME_SLOT_ON_JOURNEY);
		createEReference(timeSlotOnJourneyEClass, TIME_SLOT_ON_JOURNEY__TIME_SLOT);
		createEReference(timeSlotOnJourneyEClass, TIME_SLOT_ON_JOURNEY__POSITION);

		timeSlotEClass = createEClass(TIME_SLOT);
		createEAttribute(timeSlotEClass, TIME_SLOT__BEGIN_OF_TIME_SLOT);
		createEAttribute(timeSlotEClass, TIME_SLOT__END_OF_TIME_SLOT);

		speedOverPositionEClass = createEClass(SPEED_OVER_POSITION);
		createEReference(speedOverPositionEClass, SPEED_OVER_POSITION__SPEED);
		createEReference(speedOverPositionEClass, SPEED_OVER_POSITION__POSITION);

		speedOverTimeEClass = createEClass(SPEED_OVER_TIME);
		createEReference(speedOverTimeEClass, SPEED_OVER_TIME__SPEED);
		createEAttribute(speedOverTimeEClass, SPEED_OVER_TIME__TIMESTAMP);

		positionOverTimeEClass = createEClass(POSITION_OVER_TIME);
		createEReference(positionOverTimeEClass, POSITION_OVER_TIME__POSITION);
		createEAttribute(positionOverTimeEClass, POSITION_OVER_TIME__TIMESTAMP);

		prognosisTimeSlotForJourneyEClass = createEClass(PROGNOSIS_TIME_SLOT_FOR_JOURNEY);
		createEAttribute(prognosisTimeSlotForJourneyEClass, PROGNOSIS_TIME_SLOT_FOR_JOURNEY__JOURNEY_ID);
		createEReference(prognosisTimeSlotForJourneyEClass, PROGNOSIS_TIME_SLOT_FOR_JOURNEY__TIME_SLOTS_ON_JOURNEY);

		trajectoryEClass = createEClass(TRAJECTORY);
		createEAttribute(trajectoryEClass, TRAJECTORY__ID);
		createEReference(trajectoryEClass, TRAJECTORY__VEHICLE);
		createEReference(trajectoryEClass, TRAJECTORY__SPEED_OVER_POSITION);
		createEReference(trajectoryEClass, TRAJECTORY__SPEED_OVER_TIME);
		createEReference(trajectoryEClass, TRAJECTORY__POSITION_OVER_TIME);
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
		initEClass(dasExchangeEClass, DASExchange.class, "DASExchange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDASExchange_Id(), ecorePackage.getEString(), "id", null, 1, 1, DASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDASExchange_JourneyId(), ecorePackage.getEString(), "journeyId", null, 1, 1, DASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDASExchange_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, DASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDASExchange_Trajectory(), this.getTrajectory(), null, "trajectory", null, 1, 1, DASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDASExchange_Recommendation(), this.getRecommendation(), null, "recommendation", null, 0, -1, DASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDASExchange_GnssStatus(), theUtilsPackage.getGNSSStatus(), "gnssStatus", null, 1, 1, DASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDASExchange_DasStatus(), theUtilsPackage.getDASStatus(), "dasStatus", null, 1, 1, DASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDASExchange_TimeSlotsOnJourney(), this.getTimeSlotOnJourney(), null, "timeSlotsOnJourney", null, 1, -1, DASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dasExchangeResponseEClass, DASExchangeResponse.class, "DASExchangeResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDASExchangeResponse_Id(), ecorePackage.getEString(), "id", null, 1, 1, DASExchangeResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDASExchangeResponse_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, DASExchangeResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDASExchangeResponse_DasExchangeIdToResponse(), ecorePackage.getEString(), "dasExchangeIdToResponse", null, 1, 1, DASExchangeResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDASExchangeResponse_JourneyId(), ecorePackage.getEString(), "journeyId", null, 1, 1, DASExchangeResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recommendationEClass, Recommendation.class, "Recommendation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecommendation_Id(), ecorePackage.getEString(), "id", null, 1, 1, Recommendation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecommendation_JourneyId(), ecorePackage.getEString(), "journeyId", null, 1, 1, Recommendation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecommendation_TargetSpeed(), ecorePackage.getEInt(), "targetSpeed", null, 1, 1, Recommendation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecommendation_CountdownForDeparture(), ecorePackage.getEInt(), "countdownForDeparture", null, 1, 1, Recommendation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecommendation_RecommendationType(), theUtilsPackage.getRecommendationTypes(), "recommendationType", null, 1, 1, Recommendation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecommendation_StartTimeForInformationOrRecommendation(), theUtilsPackage.getZonedDateTime(), "startTimeForInformationOrRecommendation", null, 1, 1, Recommendation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecommendation_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, Recommendation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recommendationResponseFromMobileEClass, RecommendationResponseFromMobile.class, "RecommendationResponseFromMobile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecommendationResponseFromMobile_ReceivedRecommendation(), ecorePackage.getEBoolean(), "receivedRecommendation", null, 1, 1, RecommendationResponseFromMobile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecommendationResponseFromMobile_RecommendationId(), ecorePackage.getEString(), "recommendationId", null, 1, 1, RecommendationResponseFromMobile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecommendationResponseFromMobile_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, RecommendationResponseFromMobile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeSlotOnJourneyEClass, TimeSlotOnJourney.class, "TimeSlotOnJourney", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeSlotOnJourney_TimeSlot(), this.getTimeSlot(), null, "timeSlot", null, 1, 1, TimeSlotOnJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeSlotOnJourney_Position(), theUtilsPackage.getPosition(), null, "position", null, 1, 1, TimeSlotOnJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeSlotEClass, TimeSlot.class, "TimeSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeSlot_BeginOfTimeSlot(), theUtilsPackage.getZonedDateTime(), "beginOfTimeSlot", null, 1, 1, TimeSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeSlot_EndOfTimeSlot(), theUtilsPackage.getZonedDateTime(), "endOfTimeSlot", null, 1, 1, TimeSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speedOverPositionEClass, SpeedOverPosition.class, "SpeedOverPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpeedOverPosition_Speed(), theUtilsPackage.getValueItem(), null, "speed", null, 1, 1, SpeedOverPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpeedOverPosition_Position(), theUtilsPackage.getPosition(), null, "position", null, 1, 1, SpeedOverPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speedOverTimeEClass, SpeedOverTime.class, "SpeedOverTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpeedOverTime_Speed(), theUtilsPackage.getValueItem(), null, "speed", null, 1, 1, SpeedOverTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeedOverTime_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, SpeedOverTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionOverTimeEClass, PositionOverTime.class, "PositionOverTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPositionOverTime_Position(), theUtilsPackage.getPosition(), null, "position", null, 1, 1, PositionOverTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionOverTime_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, PositionOverTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prognosisTimeSlotForJourneyEClass, PrognosisTimeSlotForJourney.class, "PrognosisTimeSlotForJourney", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrognosisTimeSlotForJourney_JourneyId(), ecorePackage.getEString(), "journeyId", null, 1, 1, PrognosisTimeSlotForJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisTimeSlotForJourney_TimeSlotsOnJourney(), this.getTimeSlotOnJourney(), null, "timeSlotsOnJourney", null, 1, -1, PrognosisTimeSlotForJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trajectoryEClass, Trajectory.class, "Trajectory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrajectory_Id(), ecorePackage.getEString(), "id", null, 1, 1, Trajectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrajectory_Vehicle(), theUtilsPackage.getVehicle(), null, "vehicle", null, 1, 1, Trajectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrajectory_SpeedOverPosition(), this.getSpeedOverPosition(), null, "speedOverPosition", null, 1, -1, Trajectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrajectory_SpeedOverTime(), this.getSpeedOverTime(), null, "speedOverTime", null, 1, -1, Trajectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrajectory_PositionOverTime(), this.getPositionOverTime(), null, "positionOverTime", null, 1, -1, Trajectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			   "fasExchange", "#/"
		   });
	}

} //DasexchangePackageImpl
