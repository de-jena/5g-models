/**
 */
package fasExchange;

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
public class FasExchangeFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FasExchangeFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FasExchangeFactory INSTANCE = fasExchange.FasExchangeFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FasExchangeFactory init() {
		try {
			FasExchangeFactory theFasExchangeFactory = (FasExchangeFactory)EPackage.Registry.INSTANCE.getEFactory(FasExchangePackage.eNS_URI);
			if (theFasExchangeFactory != null) {
				return theFasExchangeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FasExchangeFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FasExchangeFactory() {
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
			case FasExchangePackage.FAS_EXCHANGE: return (EObject)createFASExchange();
			case FasExchangePackage.FAS_EXCHANGE_RESPONSE: return (EObject)createFASExchangeResponse();
			case FasExchangePackage.RECOMMENDATION: return (EObject)createRecommendation();
			case FasExchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE: return (EObject)createRecommendationResponseFromMobile();
			case FasExchangePackage.TIME_SLOT_ON_JOURNEY: return (EObject)createTimeSlotOnJourney();
			case FasExchangePackage.TIME_SLOT: return (EObject)createTimeSlot();
			case FasExchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA: return (EObject)createPrognosisTimeSlotFromkLSA();
			case FasExchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND: return (EObject)createPrognosisForVehiclePowerDemand();
			case FasExchangePackage.POWER_DEMAND_OVER_POSITION: return (EObject)createPowerDemandOverPosition();
			case FasExchangePackage.POWER_DEMAND_OVER_TIME: return (EObject)createPowerDemandOverTime();
			case FasExchangePackage.SPEED_OVER_POSITION: return (EObject)createSpeedOverPosition();
			case FasExchangePackage.SPEED_OVER_TIME: return (EObject)createSpeedOverTime();
			case FasExchangePackage.POSITION_OVER_TIME: return (EObject)createPositionOverTime();
			case FasExchangePackage.PROGNOSIS_TIME_SLOT_FOR_JOURNEY: return (EObject)createPrognosisTimeSlotForJourney();
			case FasExchangePackage.TRAJECTORY: return (EObject)createTrajectory();
			case FasExchangePackage.TRAJECTORY_LEFT_FROM_MOBILE: return (EObject)createTrajectoryLeftFromMobile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FASExchange createFASExchange() {
		FASExchange fasExchange = new FASExchange();
		return fasExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FASExchangeResponse createFASExchangeResponse() {
		FASExchangeResponse fasExchangeResponse = new FASExchangeResponse();
		return fasExchangeResponse;
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
	public FasExchangePackage getFasExchangePackage() {
		return (FasExchangePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FasExchangePackage getPackage() {
		return FasExchangePackage.eINSTANCE;
	}

} //FasExchangeFactory
