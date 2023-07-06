/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange.impl;

import de.inavet.smarttrains.das.interfaces.dasexchange.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DasexchangeFactoryImpl extends EFactoryImpl implements DasexchangeFactory {
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
		return new DasexchangeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DasexchangeFactoryImpl() {
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
			case DasexchangePackage.DAS_EXCHANGE: return createDASExchange();
			case DasexchangePackage.DAS_EXCHANGE_RESPONSE: return createDASExchangeResponse();
			case DasexchangePackage.RECOMMENDATION: return createRecommendation();
			case DasexchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE: return createRecommendationResponseFromMobile();
			case DasexchangePackage.TIME_SLOT_ON_JOURNEY: return createTimeSlotOnJourney();
			case DasexchangePackage.TIME_SLOT: return createTimeSlot();
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA: return createPrognosisTimeSlotFromkLSA();
			case DasexchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND: return createPrognosisForVehiclePowerDemand();
			case DasexchangePackage.POWER_DEMAND_OVER_POSITION: return createPowerDemandOverPosition();
			case DasexchangePackage.POWER_DEMAND_OVER_TIME: return createPowerDemandOverTime();
			case DasexchangePackage.SPEED_OVER_POSITION: return createSpeedOverPosition();
			case DasexchangePackage.SPEED_OVER_TIME: return createSpeedOverTime();
			case DasexchangePackage.POSITION_OVER_TIME: return createPositionOverTime();
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FOR_JOURNEY: return createPrognosisTimeSlotForJourney();
			case DasexchangePackage.TRAJECTORY: return createTrajectory();
			case DasexchangePackage.TRAJECTORY_LEFT_FROM_MOBILE: return createTrajectoryLeftFromMobile();
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
		DASExchangeImpl dasExchange = new DASExchangeImpl();
		return dasExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DASExchangeResponse createDASExchangeResponse() {
		DASExchangeResponseImpl dasExchangeResponse = new DASExchangeResponseImpl();
		return dasExchangeResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recommendation createRecommendation() {
		RecommendationImpl recommendation = new RecommendationImpl();
		return recommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecommendationResponseFromMobile createRecommendationResponseFromMobile() {
		RecommendationResponseFromMobileImpl recommendationResponseFromMobile = new RecommendationResponseFromMobileImpl();
		return recommendationResponseFromMobile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSlotOnJourney createTimeSlotOnJourney() {
		TimeSlotOnJourneyImpl timeSlotOnJourney = new TimeSlotOnJourneyImpl();
		return timeSlotOnJourney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSlot createTimeSlot() {
		TimeSlotImpl timeSlot = new TimeSlotImpl();
		return timeSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisTimeSlotFromkLSA createPrognosisTimeSlotFromkLSA() {
		PrognosisTimeSlotFromkLSAImpl prognosisTimeSlotFromkLSA = new PrognosisTimeSlotFromkLSAImpl();
		return prognosisTimeSlotFromkLSA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisForVehiclePowerDemand createPrognosisForVehiclePowerDemand() {
		PrognosisForVehiclePowerDemandImpl prognosisForVehiclePowerDemand = new PrognosisForVehiclePowerDemandImpl();
		return prognosisForVehiclePowerDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerDemandOverPosition createPowerDemandOverPosition() {
		PowerDemandOverPositionImpl powerDemandOverPosition = new PowerDemandOverPositionImpl();
		return powerDemandOverPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerDemandOverTime createPowerDemandOverTime() {
		PowerDemandOverTimeImpl powerDemandOverTime = new PowerDemandOverTimeImpl();
		return powerDemandOverTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeedOverPosition createSpeedOverPosition() {
		SpeedOverPositionImpl speedOverPosition = new SpeedOverPositionImpl();
		return speedOverPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeedOverTime createSpeedOverTime() {
		SpeedOverTimeImpl speedOverTime = new SpeedOverTimeImpl();
		return speedOverTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionOverTime createPositionOverTime() {
		PositionOverTimeImpl positionOverTime = new PositionOverTimeImpl();
		return positionOverTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisTimeSlotForJourney createPrognosisTimeSlotForJourney() {
		PrognosisTimeSlotForJourneyImpl prognosisTimeSlotForJourney = new PrognosisTimeSlotForJourneyImpl();
		return prognosisTimeSlotForJourney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trajectory createTrajectory() {
		TrajectoryImpl trajectory = new TrajectoryImpl();
		return trajectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrajectoryLeftFromMobile createTrajectoryLeftFromMobile() {
		TrajectoryLeftFromMobileImpl trajectoryLeftFromMobile = new TrajectoryLeftFromMobileImpl();
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

} //DasexchangeFactoryImpl
