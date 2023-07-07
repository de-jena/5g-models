/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public class DasexchangeFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DasexchangeFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DasexchangeFactory INSTANCE = de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangeFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DasexchangeFactory init() {
		try {
			DasexchangeFactory theDasexchangeFactory = (DasexchangeFactory)EPackage.Registry.INSTANCE.getEFactory(DasexchangePackage.eNS_URI);
			if (theDasexchangeFactory != null) {
				return theDasexchangeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DasexchangeFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DasexchangeFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DasexchangePackage.DAS_EXCHANGE: return (EObject)createDASExchange();
			case DasexchangePackage.DAS_EXCHANGE_RESPONSE: return (EObject)createDASExchangeResponse();
			case DasexchangePackage.RECOMMENDATION: return (EObject)createRecommendation();
			case DasexchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE: return (EObject)createRecommendationResponseFromMobile();
			case DasexchangePackage.TIME_SLOT_ON_JOURNEY: return (EObject)createTimeSlotOnJourney();
			case DasexchangePackage.TIME_SLOT: return (EObject)createTimeSlot();
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA: return (EObject)createPrognosisTimeSlotFromkLSA();
			case DasexchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND: return (EObject)createPrognosisForVehiclePowerDemand();
			case DasexchangePackage.POWER_DEMAND_OVER_POSITION: return (EObject)createPowerDemandOverPosition();
			case DasexchangePackage.POWER_DEMAND_OVER_TIME: return (EObject)createPowerDemandOverTime();
			case DasexchangePackage.SPEED_OVER_POSITION: return (EObject)createSpeedOverPosition();
			case DasexchangePackage.SPEED_OVER_TIME: return (EObject)createSpeedOverTime();
			case DasexchangePackage.POSITION_OVER_TIME: return (EObject)createPositionOverTime();
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FOR_JOURNEY: return (EObject)createPrognosisTimeSlotForJourney();
			case DasexchangePackage.TRAJECTORY: return (EObject)createTrajectory();
			case DasexchangePackage.TRAJECTORY_LEFT_FROM_MOBILE: return (EObject)createTrajectoryLeftFromMobile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DASExchange createDASExchange() {
		DASExchange dasExchange = new DASExchange();
		return dasExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DASExchangeResponse createDASExchangeResponse() {
		DASExchangeResponse dasExchangeResponse = new DASExchangeResponse();
		return dasExchangeResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recommendation createRecommendation() {
		Recommendation recommendation = new Recommendation();
		return recommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecommendationResponseFromMobile createRecommendationResponseFromMobile() {
		RecommendationResponseFromMobile recommendationResponseFromMobile = new RecommendationResponseFromMobile();
		return recommendationResponseFromMobile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSlotOnJourney createTimeSlotOnJourney() {
		TimeSlotOnJourney timeSlotOnJourney = new TimeSlotOnJourney();
		return timeSlotOnJourney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSlot createTimeSlot() {
		TimeSlot timeSlot = new TimeSlot();
		return timeSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisTimeSlotFromkLSA createPrognosisTimeSlotFromkLSA() {
		PrognosisTimeSlotFromkLSA prognosisTimeSlotFromkLSA = new PrognosisTimeSlotFromkLSA();
		return prognosisTimeSlotFromkLSA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisForVehiclePowerDemand createPrognosisForVehiclePowerDemand() {
		PrognosisForVehiclePowerDemand prognosisForVehiclePowerDemand = new PrognosisForVehiclePowerDemand();
		return prognosisForVehiclePowerDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerDemandOverPosition createPowerDemandOverPosition() {
		PowerDemandOverPosition powerDemandOverPosition = new PowerDemandOverPosition();
		return powerDemandOverPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerDemandOverTime createPowerDemandOverTime() {
		PowerDemandOverTime powerDemandOverTime = new PowerDemandOverTime();
		return powerDemandOverTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeedOverPosition createSpeedOverPosition() {
		SpeedOverPosition speedOverPosition = new SpeedOverPosition();
		return speedOverPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeedOverTime createSpeedOverTime() {
		SpeedOverTime speedOverTime = new SpeedOverTime();
		return speedOverTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionOverTime createPositionOverTime() {
		PositionOverTime positionOverTime = new PositionOverTime();
		return positionOverTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisTimeSlotForJourney createPrognosisTimeSlotForJourney() {
		PrognosisTimeSlotForJourney prognosisTimeSlotForJourney = new PrognosisTimeSlotForJourney();
		return prognosisTimeSlotForJourney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trajectory createTrajectory() {
		Trajectory trajectory = new Trajectory();
		return trajectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrajectoryLeftFromMobile createTrajectoryLeftFromMobile() {
		TrajectoryLeftFromMobile trajectoryLeftFromMobile = new TrajectoryLeftFromMobile();
		return trajectoryLeftFromMobile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DasexchangePackage getDasexchangePackage() {
		return (DasexchangePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DasexchangePackage getPackage() {
		return DasexchangePackage.eINSTANCE;
	}

} //DasexchangeFactory
