/**
 */
package fasExchange;

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
 * @see fasExchange.FasExchangeFactory
 * @generated
 */
public class FasExchangePackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "fasExchange";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://inavet.de/datamodels/fasExchange";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "fasExchange";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FasExchangePackage eINSTANCE = fasExchange.FasExchangePackage.init();

	/**
	 * The meta object id for the '{@link fasExchange.FASExchange <em>FAS Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fasExchange.FASExchange
	 * @see fasExchange.FasExchangePackage#getFASExchange()
	 * @generated
	 */
	public static final int FAS_EXCHANGE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAS_EXCHANGE__ID = 0;

	/**
	 * The feature id for the '<em><b>Journey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAS_EXCHANGE__JOURNEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAS_EXCHANGE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Trajectory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAS_EXCHANGE__TRAJECTORY = 3;

	/**
	 * The feature id for the '<em><b>Recommendation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAS_EXCHANGE__RECOMMENDATION = 4;

	/**
	 * The feature id for the '<em><b>Gnss Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAS_EXCHANGE__GNSS_STATUS = 5;

	/**
	 * The feature id for the '<em><b>Fas Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAS_EXCHANGE__FAS_STATUS = 6;

	/**
	 * The feature id for the '<em><b>Time Slots On Journey</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAS_EXCHANGE__TIME_SLOTS_ON_JOURNEY = 7;

	/**
	 * The number of structural features of the '<em>FAS Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAS_EXCHANGE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>FAS Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAS_EXCHANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fasExchange.FASExchangeResponse <em>FAS Exchange Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fasExchange.FASExchangeResponse
	 * @see fasExchange.FasExchangePackage#getFASExchangeResponse()
	 * @generated
	 */
	public static final int FAS_EXCHANGE_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAS_EXCHANGE_RESPONSE__ID = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAS_EXCHANGE_RESPONSE__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Fas Exchange Id To Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAS_EXCHANGE_RESPONSE__FAS_EXCHANGE_ID_TO_RESPONSE = 2;

	/**
	 * The feature id for the '<em><b>Journey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAS_EXCHANGE_RESPONSE__JOURNEY_ID = 3;

	/**
	 * The number of structural features of the '<em>FAS Exchange Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAS_EXCHANGE_RESPONSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>FAS Exchange Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FAS_EXCHANGE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fasExchange.Recommendation <em>Recommendation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fasExchange.Recommendation
	 * @see fasExchange.FasExchangePackage#getRecommendation()
	 * @generated
	 */
	public static final int RECOMMENDATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECOMMENDATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Journey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECOMMENDATION__JOURNEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Target Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECOMMENDATION__TARGET_SPEED = 2;

	/**
	 * The feature id for the '<em><b>Countdown For Departure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECOMMENDATION__COUNTDOWN_FOR_DEPARTURE = 3;

	/**
	 * The feature id for the '<em><b>Recommendation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECOMMENDATION__RECOMMENDATION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Start Time For Information Or Recommendation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECOMMENDATION__START_TIME_FOR_INFORMATION_OR_RECOMMENDATION = 5;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECOMMENDATION__TIMESTAMP = 6;

	/**
	 * The number of structural features of the '<em>Recommendation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECOMMENDATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Recommendation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECOMMENDATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fasExchange.RecommendationResponseFromMobile <em>Recommendation Response From Mobile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fasExchange.RecommendationResponseFromMobile
	 * @see fasExchange.FasExchangePackage#getRecommendationResponseFromMobile()
	 * @generated
	 */
	public static final int RECOMMENDATION_RESPONSE_FROM_MOBILE = 3;

	/**
	 * The feature id for the '<em><b>Received Recommendation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECOMMENDATION_RESPONSE_FROM_MOBILE__RECEIVED_RECOMMENDATION = 0;

	/**
	 * The feature id for the '<em><b>Recommendation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECOMMENDATION_RESPONSE_FROM_MOBILE__RECOMMENDATION_ID = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECOMMENDATION_RESPONSE_FROM_MOBILE__TIMESTAMP = 2;

	/**
	 * The number of structural features of the '<em>Recommendation Response From Mobile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECOMMENDATION_RESPONSE_FROM_MOBILE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Recommendation Response From Mobile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RECOMMENDATION_RESPONSE_FROM_MOBILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fasExchange.TimeSlotOnJourney <em>Time Slot On Journey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fasExchange.TimeSlotOnJourney
	 * @see fasExchange.FasExchangePackage#getTimeSlotOnJourney()
	 * @generated
	 */
	public static final int TIME_SLOT_ON_JOURNEY = 4;

	/**
	 * The feature id for the '<em><b>Time Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SLOT_ON_JOURNEY__TIME_SLOT = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SLOT_ON_JOURNEY__POSITION = 1;

	/**
	 * The number of structural features of the '<em>Time Slot On Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SLOT_ON_JOURNEY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Time Slot On Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SLOT_ON_JOURNEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fasExchange.TimeSlot <em>Time Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fasExchange.TimeSlot
	 * @see fasExchange.FasExchangePackage#getTimeSlot()
	 * @generated
	 */
	public static final int TIME_SLOT = 5;

	/**
	 * The feature id for the '<em><b>Begin Of Time Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SLOT__BEGIN_OF_TIME_SLOT = 0;

	/**
	 * The feature id for the '<em><b>End Of Time Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SLOT__END_OF_TIME_SLOT = 1;

	/**
	 * The number of structural features of the '<em>Time Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SLOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Time Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SLOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fasExchange.PrognosisTimeSlotFromkLSA <em>Prognosis Time Slot Fromk LSA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fasExchange.PrognosisTimeSlotFromkLSA
	 * @see fasExchange.FasExchangePackage#getPrognosisTimeSlotFromkLSA()
	 * @generated
	 */
	public static final int PROGNOSIS_TIME_SLOT_FROMK_LSA = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_TIME_SLOT_FROMK_LSA__ID = 0;

	/**
	 * The feature id for the '<em><b>Key Costs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_TIME_SLOT_FROMK_LSA__KEY_COSTS = 1;

	/**
	 * The feature id for the '<em><b>Time Slots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_TIME_SLOT_FROMK_LSA__TIME_SLOTS = 2;

	/**
	 * The feature id for the '<em><b>Vehicles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_TIME_SLOT_FROMK_LSA__VEHICLES = 3;

	/**
	 * The number of structural features of the '<em>Prognosis Time Slot Fromk LSA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_TIME_SLOT_FROMK_LSA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Prognosis Time Slot Fromk LSA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_TIME_SLOT_FROMK_LSA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fasExchange.PrognosisForVehiclePowerDemand <em>Prognosis For Vehicle Power Demand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fasExchange.PrognosisForVehiclePowerDemand
	 * @see fasExchange.FasExchangePackage#getPrognosisForVehiclePowerDemand()
	 * @generated
	 */
	public static final int PROGNOSIS_FOR_VEHICLE_POWER_DEMAND = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__ID = 0;

	/**
	 * The feature id for the '<em><b>Key Vehicles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__KEY_VEHICLES = 1;

	/**
	 * The feature id for the '<em><b>Power Demand Over Positions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_POSITIONS = 2;

	/**
	 * The feature id for the '<em><b>Power Demand Over Times</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_TIMES = 3;

	/**
	 * The number of structural features of the '<em>Prognosis For Vehicle Power Demand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_FOR_VEHICLE_POWER_DEMAND_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Prognosis For Vehicle Power Demand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_FOR_VEHICLE_POWER_DEMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fasExchange.PowerDemandOverPosition <em>Power Demand Over Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fasExchange.PowerDemandOverPosition
	 * @see fasExchange.FasExchangePackage#getPowerDemandOverPosition()
	 * @generated
	 */
	public static final int POWER_DEMAND_OVER_POSITION = 8;

	/**
	 * The feature id for the '<em><b>Power Prognosis</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_DEMAND_OVER_POSITION__POWER_PROGNOSIS = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_DEMAND_OVER_POSITION__POSITION = 1;

	/**
	 * The number of structural features of the '<em>Power Demand Over Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_DEMAND_OVER_POSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Power Demand Over Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_DEMAND_OVER_POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fasExchange.PowerDemandOverTime <em>Power Demand Over Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fasExchange.PowerDemandOverTime
	 * @see fasExchange.FasExchangePackage#getPowerDemandOverTime()
	 * @generated
	 */
	public static final int POWER_DEMAND_OVER_TIME = 9;

	/**
	 * The feature id for the '<em><b>Power Prognosis</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_DEMAND_OVER_TIME__POWER_PROGNOSIS = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_DEMAND_OVER_TIME__TIMESTAMP = 1;

	/**
	 * The number of structural features of the '<em>Power Demand Over Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_DEMAND_OVER_TIME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Power Demand Over Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POWER_DEMAND_OVER_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fasExchange.SpeedOverPosition <em>Speed Over Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fasExchange.SpeedOverPosition
	 * @see fasExchange.FasExchangePackage#getSpeedOverPosition()
	 * @generated
	 */
	public static final int SPEED_OVER_POSITION = 10;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPEED_OVER_POSITION__SPEED = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPEED_OVER_POSITION__POSITION = 1;

	/**
	 * The number of structural features of the '<em>Speed Over Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPEED_OVER_POSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Speed Over Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPEED_OVER_POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fasExchange.SpeedOverTime <em>Speed Over Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fasExchange.SpeedOverTime
	 * @see fasExchange.FasExchangePackage#getSpeedOverTime()
	 * @generated
	 */
	public static final int SPEED_OVER_TIME = 11;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPEED_OVER_TIME__SPEED = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPEED_OVER_TIME__TIMESTAMP = 1;

	/**
	 * The number of structural features of the '<em>Speed Over Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPEED_OVER_TIME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Speed Over Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SPEED_OVER_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fasExchange.PositionOverTime <em>Position Over Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fasExchange.PositionOverTime
	 * @see fasExchange.FasExchangePackage#getPositionOverTime()
	 * @generated
	 */
	public static final int POSITION_OVER_TIME = 12;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_OVER_TIME__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_OVER_TIME__TIMESTAMP = 1;

	/**
	 * The number of structural features of the '<em>Position Over Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_OVER_TIME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Position Over Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_OVER_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fasExchange.PrognosisTimeSlotForJourney <em>Prognosis Time Slot For Journey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fasExchange.PrognosisTimeSlotForJourney
	 * @see fasExchange.FasExchangePackage#getPrognosisTimeSlotForJourney()
	 * @generated
	 */
	public static final int PROGNOSIS_TIME_SLOT_FOR_JOURNEY = 13;

	/**
	 * The feature id for the '<em><b>Journey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_TIME_SLOT_FOR_JOURNEY__JOURNEY_ID = 0;

	/**
	 * The feature id for the '<em><b>Time Slots On Journey</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_TIME_SLOT_FOR_JOURNEY__TIME_SLOTS_ON_JOURNEY = 1;

	/**
	 * The number of structural features of the '<em>Prognosis Time Slot For Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_TIME_SLOT_FOR_JOURNEY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Prognosis Time Slot For Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_TIME_SLOT_FOR_JOURNEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fasExchange.Trajectory <em>Trajectory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fasExchange.Trajectory
	 * @see fasExchange.FasExchangePackage#getTrajectory()
	 * @generated
	 */
	public static final int TRAJECTORY = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRAJECTORY__ID = 0;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRAJECTORY__VEHICLE = 1;

	/**
	 * The feature id for the '<em><b>Speed Over Position</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRAJECTORY__SPEED_OVER_POSITION = 2;

	/**
	 * The feature id for the '<em><b>Speed Over Time</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRAJECTORY__SPEED_OVER_TIME = 3;

	/**
	 * The feature id for the '<em><b>Position Over Time</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRAJECTORY__POSITION_OVER_TIME = 4;

	/**
	 * The number of structural features of the '<em>Trajectory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRAJECTORY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Trajectory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRAJECTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fasExchange.TrajectoryLeftFromMobile <em>Trajectory Left From Mobile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fasExchange.TrajectoryLeftFromMobile
	 * @see fasExchange.FasExchangePackage#getTrajectoryLeftFromMobile()
	 * @generated
	 */
	public static final int TRAJECTORY_LEFT_FROM_MOBILE = 15;

	/**
	 * The feature id for the '<em><b>Trajectory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRAJECTORY_LEFT_FROM_MOBILE__TRAJECTORY = 0;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRAJECTORY_LEFT_FROM_MOBILE__TIME_STAMP = 1;

	/**
	 * The number of structural features of the '<em>Trajectory Left From Mobile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRAJECTORY_LEFT_FROM_MOBILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trajectory Left From Mobile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRAJECTORY_LEFT_FROM_MOBILE_OPERATION_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fasExchangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fasExchangeResponseEClass = null;

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
	private EClass prognosisTimeSlotFromkLSAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prognosisForVehiclePowerDemandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerDemandOverPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerDemandOverTimeEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trajectoryLeftFromMobileEClass = null;

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
	 * @see fasExchange.FasExchangePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FasExchangePackage() {
		super(eNS_URI, FasExchangeFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link FasExchangePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FasExchangePackage init() {
		if (isInited) return (FasExchangePackage)EPackage.Registry.INSTANCE.getEPackage(FasExchangePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFasExchangePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FasExchangePackage theFasExchangePackage = registeredFasExchangePackage instanceof FasExchangePackage ? (FasExchangePackage)registeredFasExchangePackage : new FasExchangePackage();

		isInited = true;

		// Initialize simple dependencies
		JourneyPackage.eINSTANCE.eClass();
		UtilsPackage.eINSTANCE.eClass();
		VehiclePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFasExchangePackage.createPackageContents();

		// Initialize created meta-data
		theFasExchangePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFasExchangePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FasExchangePackage.eNS_URI, theFasExchangePackage);
		return theFasExchangePackage;
	}


	/**
	 * Returns the meta object for class '{@link fasExchange.FASExchange <em>FAS Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FAS Exchange</em>'.
	 * @see fasExchange.FASExchange
	 * @generated
	 */
	public EClass getFASExchange() {
		return fasExchangeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.FASExchange#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fasExchange.FASExchange#getId()
	 * @see #getFASExchange()
	 * @generated
	 */
	public EAttribute getFASExchange_Id() {
		return (EAttribute)fasExchangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.FASExchange#getJourneyId <em>Journey Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Id</em>'.
	 * @see fasExchange.FASExchange#getJourneyId()
	 * @see #getFASExchange()
	 * @generated
	 */
	public EAttribute getFASExchange_JourneyId() {
		return (EAttribute)fasExchangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.FASExchange#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see fasExchange.FASExchange#getTimestamp()
	 * @see #getFASExchange()
	 * @generated
	 */
	public EAttribute getFASExchange_Timestamp() {
		return (EAttribute)fasExchangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link fasExchange.FASExchange#getTrajectory <em>Trajectory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trajectory</em>'.
	 * @see fasExchange.FASExchange#getTrajectory()
	 * @see #getFASExchange()
	 * @generated
	 */
	public EReference getFASExchange_Trajectory() {
		return (EReference)fasExchangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link fasExchange.FASExchange#getRecommendation <em>Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recommendation</em>'.
	 * @see fasExchange.FASExchange#getRecommendation()
	 * @see #getFASExchange()
	 * @generated
	 */
	public EReference getFASExchange_Recommendation() {
		return (EReference)fasExchangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.FASExchange#getGnssStatus <em>Gnss Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gnss Status</em>'.
	 * @see fasExchange.FASExchange#getGnssStatus()
	 * @see #getFASExchange()
	 * @generated
	 */
	public EAttribute getFASExchange_GnssStatus() {
		return (EAttribute)fasExchangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.FASExchange#getFasStatus <em>Fas Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fas Status</em>'.
	 * @see fasExchange.FASExchange#getFasStatus()
	 * @see #getFASExchange()
	 * @generated
	 */
	public EAttribute getFASExchange_FasStatus() {
		return (EAttribute)fasExchangeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference list '{@link fasExchange.FASExchange#getTimeSlotsOnJourney <em>Time Slots On Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Slots On Journey</em>'.
	 * @see fasExchange.FASExchange#getTimeSlotsOnJourney()
	 * @see #getFASExchange()
	 * @generated
	 */
	public EReference getFASExchange_TimeSlotsOnJourney() {
		return (EReference)fasExchangeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link fasExchange.FASExchangeResponse <em>FAS Exchange Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FAS Exchange Response</em>'.
	 * @see fasExchange.FASExchangeResponse
	 * @generated
	 */
	public EClass getFASExchangeResponse() {
		return fasExchangeResponseEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.FASExchangeResponse#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fasExchange.FASExchangeResponse#getId()
	 * @see #getFASExchangeResponse()
	 * @generated
	 */
	public EAttribute getFASExchangeResponse_Id() {
		return (EAttribute)fasExchangeResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.FASExchangeResponse#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see fasExchange.FASExchangeResponse#getTimestamp()
	 * @see #getFASExchangeResponse()
	 * @generated
	 */
	public EAttribute getFASExchangeResponse_Timestamp() {
		return (EAttribute)fasExchangeResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.FASExchangeResponse#getFasExchangeIdToResponse <em>Fas Exchange Id To Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fas Exchange Id To Response</em>'.
	 * @see fasExchange.FASExchangeResponse#getFasExchangeIdToResponse()
	 * @see #getFASExchangeResponse()
	 * @generated
	 */
	public EAttribute getFASExchangeResponse_FasExchangeIdToResponse() {
		return (EAttribute)fasExchangeResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.FASExchangeResponse#getJourneyId <em>Journey Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Id</em>'.
	 * @see fasExchange.FASExchangeResponse#getJourneyId()
	 * @see #getFASExchangeResponse()
	 * @generated
	 */
	public EAttribute getFASExchangeResponse_JourneyId() {
		return (EAttribute)fasExchangeResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link fasExchange.Recommendation <em>Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recommendation</em>'.
	 * @see fasExchange.Recommendation
	 * @generated
	 */
	public EClass getRecommendation() {
		return recommendationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.Recommendation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fasExchange.Recommendation#getId()
	 * @see #getRecommendation()
	 * @generated
	 */
	public EAttribute getRecommendation_Id() {
		return (EAttribute)recommendationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.Recommendation#getJourneyId <em>Journey Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Id</em>'.
	 * @see fasExchange.Recommendation#getJourneyId()
	 * @see #getRecommendation()
	 * @generated
	 */
	public EAttribute getRecommendation_JourneyId() {
		return (EAttribute)recommendationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.Recommendation#getTargetSpeed <em>Target Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Speed</em>'.
	 * @see fasExchange.Recommendation#getTargetSpeed()
	 * @see #getRecommendation()
	 * @generated
	 */
	public EAttribute getRecommendation_TargetSpeed() {
		return (EAttribute)recommendationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.Recommendation#getCountdownForDeparture <em>Countdown For Departure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Countdown For Departure</em>'.
	 * @see fasExchange.Recommendation#getCountdownForDeparture()
	 * @see #getRecommendation()
	 * @generated
	 */
	public EAttribute getRecommendation_CountdownForDeparture() {
		return (EAttribute)recommendationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.Recommendation#getRecommendationType <em>Recommendation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recommendation Type</em>'.
	 * @see fasExchange.Recommendation#getRecommendationType()
	 * @see #getRecommendation()
	 * @generated
	 */
	public EAttribute getRecommendation_RecommendationType() {
		return (EAttribute)recommendationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.Recommendation#getStartTimeForInformationOrRecommendation <em>Start Time For Information Or Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time For Information Or Recommendation</em>'.
	 * @see fasExchange.Recommendation#getStartTimeForInformationOrRecommendation()
	 * @see #getRecommendation()
	 * @generated
	 */
	public EAttribute getRecommendation_StartTimeForInformationOrRecommendation() {
		return (EAttribute)recommendationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.Recommendation#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see fasExchange.Recommendation#getTimestamp()
	 * @see #getRecommendation()
	 * @generated
	 */
	public EAttribute getRecommendation_Timestamp() {
		return (EAttribute)recommendationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link fasExchange.RecommendationResponseFromMobile <em>Recommendation Response From Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recommendation Response From Mobile</em>'.
	 * @see fasExchange.RecommendationResponseFromMobile
	 * @generated
	 */
	public EClass getRecommendationResponseFromMobile() {
		return recommendationResponseFromMobileEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.RecommendationResponseFromMobile#isReceivedRecommendation <em>Received Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Received Recommendation</em>'.
	 * @see fasExchange.RecommendationResponseFromMobile#isReceivedRecommendation()
	 * @see #getRecommendationResponseFromMobile()
	 * @generated
	 */
	public EAttribute getRecommendationResponseFromMobile_ReceivedRecommendation() {
		return (EAttribute)recommendationResponseFromMobileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.RecommendationResponseFromMobile#getRecommendationId <em>Recommendation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recommendation Id</em>'.
	 * @see fasExchange.RecommendationResponseFromMobile#getRecommendationId()
	 * @see #getRecommendationResponseFromMobile()
	 * @generated
	 */
	public EAttribute getRecommendationResponseFromMobile_RecommendationId() {
		return (EAttribute)recommendationResponseFromMobileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.RecommendationResponseFromMobile#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see fasExchange.RecommendationResponseFromMobile#getTimestamp()
	 * @see #getRecommendationResponseFromMobile()
	 * @generated
	 */
	public EAttribute getRecommendationResponseFromMobile_Timestamp() {
		return (EAttribute)recommendationResponseFromMobileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link fasExchange.TimeSlotOnJourney <em>Time Slot On Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Slot On Journey</em>'.
	 * @see fasExchange.TimeSlotOnJourney
	 * @generated
	 */
	public EClass getTimeSlotOnJourney() {
		return timeSlotOnJourneyEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link fasExchange.TimeSlotOnJourney#getTimeSlot <em>Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Slot</em>'.
	 * @see fasExchange.TimeSlotOnJourney#getTimeSlot()
	 * @see #getTimeSlotOnJourney()
	 * @generated
	 */
	public EReference getTimeSlotOnJourney_TimeSlot() {
		return (EReference)timeSlotOnJourneyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link fasExchange.TimeSlotOnJourney#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see fasExchange.TimeSlotOnJourney#getPosition()
	 * @see #getTimeSlotOnJourney()
	 * @generated
	 */
	public EReference getTimeSlotOnJourney_Position() {
		return (EReference)timeSlotOnJourneyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link fasExchange.TimeSlot <em>Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Slot</em>'.
	 * @see fasExchange.TimeSlot
	 * @generated
	 */
	public EClass getTimeSlot() {
		return timeSlotEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.TimeSlot#getBeginOfTimeSlot <em>Begin Of Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin Of Time Slot</em>'.
	 * @see fasExchange.TimeSlot#getBeginOfTimeSlot()
	 * @see #getTimeSlot()
	 * @generated
	 */
	public EAttribute getTimeSlot_BeginOfTimeSlot() {
		return (EAttribute)timeSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.TimeSlot#getEndOfTimeSlot <em>End Of Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Of Time Slot</em>'.
	 * @see fasExchange.TimeSlot#getEndOfTimeSlot()
	 * @see #getTimeSlot()
	 * @generated
	 */
	public EAttribute getTimeSlot_EndOfTimeSlot() {
		return (EAttribute)timeSlotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link fasExchange.PrognosisTimeSlotFromkLSA <em>Prognosis Time Slot Fromk LSA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prognosis Time Slot Fromk LSA</em>'.
	 * @see fasExchange.PrognosisTimeSlotFromkLSA
	 * @generated
	 */
	public EClass getPrognosisTimeSlotFromkLSA() {
		return prognosisTimeSlotFromkLSAEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.PrognosisTimeSlotFromkLSA#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fasExchange.PrognosisTimeSlotFromkLSA#getId()
	 * @see #getPrognosisTimeSlotFromkLSA()
	 * @generated
	 */
	public EAttribute getPrognosisTimeSlotFromkLSA_Id() {
		return (EAttribute)prognosisTimeSlotFromkLSAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link fasExchange.PrognosisTimeSlotFromkLSA#getKeyCosts <em>Key Costs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Key Costs</em>'.
	 * @see fasExchange.PrognosisTimeSlotFromkLSA#getKeyCosts()
	 * @see #getPrognosisTimeSlotFromkLSA()
	 * @generated
	 */
	public EReference getPrognosisTimeSlotFromkLSA_KeyCosts() {
		return (EReference)prognosisTimeSlotFromkLSAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link fasExchange.PrognosisTimeSlotFromkLSA#getTimeSlots <em>Time Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Slots</em>'.
	 * @see fasExchange.PrognosisTimeSlotFromkLSA#getTimeSlots()
	 * @see #getPrognosisTimeSlotFromkLSA()
	 * @generated
	 */
	public EReference getPrognosisTimeSlotFromkLSA_TimeSlots() {
		return (EReference)prognosisTimeSlotFromkLSAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link fasExchange.PrognosisTimeSlotFromkLSA#getVehicles <em>Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vehicles</em>'.
	 * @see fasExchange.PrognosisTimeSlotFromkLSA#getVehicles()
	 * @see #getPrognosisTimeSlotFromkLSA()
	 * @generated
	 */
	public EReference getPrognosisTimeSlotFromkLSA_Vehicles() {
		return (EReference)prognosisTimeSlotFromkLSAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link fasExchange.PrognosisForVehiclePowerDemand <em>Prognosis For Vehicle Power Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prognosis For Vehicle Power Demand</em>'.
	 * @see fasExchange.PrognosisForVehiclePowerDemand
	 * @generated
	 */
	public EClass getPrognosisForVehiclePowerDemand() {
		return prognosisForVehiclePowerDemandEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.PrognosisForVehiclePowerDemand#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fasExchange.PrognosisForVehiclePowerDemand#getId()
	 * @see #getPrognosisForVehiclePowerDemand()
	 * @generated
	 */
	public EAttribute getPrognosisForVehiclePowerDemand_Id() {
		return (EAttribute)prognosisForVehiclePowerDemandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link fasExchange.PrognosisForVehiclePowerDemand#getKeyVehicles <em>Key Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Key Vehicles</em>'.
	 * @see fasExchange.PrognosisForVehiclePowerDemand#getKeyVehicles()
	 * @see #getPrognosisForVehiclePowerDemand()
	 * @generated
	 */
	public EReference getPrognosisForVehiclePowerDemand_KeyVehicles() {
		return (EReference)prognosisForVehiclePowerDemandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link fasExchange.PrognosisForVehiclePowerDemand#getPowerDemandOverPositions <em>Power Demand Over Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power Demand Over Positions</em>'.
	 * @see fasExchange.PrognosisForVehiclePowerDemand#getPowerDemandOverPositions()
	 * @see #getPrognosisForVehiclePowerDemand()
	 * @generated
	 */
	public EReference getPrognosisForVehiclePowerDemand_PowerDemandOverPositions() {
		return (EReference)prognosisForVehiclePowerDemandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link fasExchange.PrognosisForVehiclePowerDemand#getPowerDemandOverTimes <em>Power Demand Over Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power Demand Over Times</em>'.
	 * @see fasExchange.PrognosisForVehiclePowerDemand#getPowerDemandOverTimes()
	 * @see #getPrognosisForVehiclePowerDemand()
	 * @generated
	 */
	public EReference getPrognosisForVehiclePowerDemand_PowerDemandOverTimes() {
		return (EReference)prognosisForVehiclePowerDemandEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link fasExchange.PowerDemandOverPosition <em>Power Demand Over Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Demand Over Position</em>'.
	 * @see fasExchange.PowerDemandOverPosition
	 * @generated
	 */
	public EClass getPowerDemandOverPosition() {
		return powerDemandOverPositionEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link fasExchange.PowerDemandOverPosition#getPowerPrognosis <em>Power Prognosis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power Prognosis</em>'.
	 * @see fasExchange.PowerDemandOverPosition#getPowerPrognosis()
	 * @see #getPowerDemandOverPosition()
	 * @generated
	 */
	public EReference getPowerDemandOverPosition_PowerPrognosis() {
		return (EReference)powerDemandOverPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link fasExchange.PowerDemandOverPosition#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Position</em>'.
	 * @see fasExchange.PowerDemandOverPosition#getPosition()
	 * @see #getPowerDemandOverPosition()
	 * @generated
	 */
	public EReference getPowerDemandOverPosition_Position() {
		return (EReference)powerDemandOverPositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link fasExchange.PowerDemandOverTime <em>Power Demand Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Demand Over Time</em>'.
	 * @see fasExchange.PowerDemandOverTime
	 * @generated
	 */
	public EClass getPowerDemandOverTime() {
		return powerDemandOverTimeEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link fasExchange.PowerDemandOverTime#getPowerPrognosis <em>Power Prognosis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power Prognosis</em>'.
	 * @see fasExchange.PowerDemandOverTime#getPowerPrognosis()
	 * @see #getPowerDemandOverTime()
	 * @generated
	 */
	public EReference getPowerDemandOverTime_PowerPrognosis() {
		return (EReference)powerDemandOverTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute list '{@link fasExchange.PowerDemandOverTime#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Timestamp</em>'.
	 * @see fasExchange.PowerDemandOverTime#getTimestamp()
	 * @see #getPowerDemandOverTime()
	 * @generated
	 */
	public EAttribute getPowerDemandOverTime_Timestamp() {
		return (EAttribute)powerDemandOverTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link fasExchange.SpeedOverPosition <em>Speed Over Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speed Over Position</em>'.
	 * @see fasExchange.SpeedOverPosition
	 * @generated
	 */
	public EClass getSpeedOverPosition() {
		return speedOverPositionEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link fasExchange.SpeedOverPosition#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Speed</em>'.
	 * @see fasExchange.SpeedOverPosition#getSpeed()
	 * @see #getSpeedOverPosition()
	 * @generated
	 */
	public EReference getSpeedOverPosition_Speed() {
		return (EReference)speedOverPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link fasExchange.SpeedOverPosition#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see fasExchange.SpeedOverPosition#getPosition()
	 * @see #getSpeedOverPosition()
	 * @generated
	 */
	public EReference getSpeedOverPosition_Position() {
		return (EReference)speedOverPositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link fasExchange.SpeedOverTime <em>Speed Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speed Over Time</em>'.
	 * @see fasExchange.SpeedOverTime
	 * @generated
	 */
	public EClass getSpeedOverTime() {
		return speedOverTimeEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link fasExchange.SpeedOverTime#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Speed</em>'.
	 * @see fasExchange.SpeedOverTime#getSpeed()
	 * @see #getSpeedOverTime()
	 * @generated
	 */
	public EReference getSpeedOverTime_Speed() {
		return (EReference)speedOverTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.SpeedOverTime#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see fasExchange.SpeedOverTime#getTimestamp()
	 * @see #getSpeedOverTime()
	 * @generated
	 */
	public EAttribute getSpeedOverTime_Timestamp() {
		return (EAttribute)speedOverTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link fasExchange.PositionOverTime <em>Position Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Over Time</em>'.
	 * @see fasExchange.PositionOverTime
	 * @generated
	 */
	public EClass getPositionOverTime() {
		return positionOverTimeEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link fasExchange.PositionOverTime#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see fasExchange.PositionOverTime#getPosition()
	 * @see #getPositionOverTime()
	 * @generated
	 */
	public EReference getPositionOverTime_Position() {
		return (EReference)positionOverTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.PositionOverTime#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see fasExchange.PositionOverTime#getTimestamp()
	 * @see #getPositionOverTime()
	 * @generated
	 */
	public EAttribute getPositionOverTime_Timestamp() {
		return (EAttribute)positionOverTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link fasExchange.PrognosisTimeSlotForJourney <em>Prognosis Time Slot For Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prognosis Time Slot For Journey</em>'.
	 * @see fasExchange.PrognosisTimeSlotForJourney
	 * @generated
	 */
	public EClass getPrognosisTimeSlotForJourney() {
		return prognosisTimeSlotForJourneyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.PrognosisTimeSlotForJourney#getJourneyId <em>Journey Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Id</em>'.
	 * @see fasExchange.PrognosisTimeSlotForJourney#getJourneyId()
	 * @see #getPrognosisTimeSlotForJourney()
	 * @generated
	 */
	public EAttribute getPrognosisTimeSlotForJourney_JourneyId() {
		return (EAttribute)prognosisTimeSlotForJourneyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link fasExchange.PrognosisTimeSlotForJourney#getTimeSlotsOnJourney <em>Time Slots On Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Slots On Journey</em>'.
	 * @see fasExchange.PrognosisTimeSlotForJourney#getTimeSlotsOnJourney()
	 * @see #getPrognosisTimeSlotForJourney()
	 * @generated
	 */
	public EReference getPrognosisTimeSlotForJourney_TimeSlotsOnJourney() {
		return (EReference)prognosisTimeSlotForJourneyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link fasExchange.Trajectory <em>Trajectory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trajectory</em>'.
	 * @see fasExchange.Trajectory
	 * @generated
	 */
	public EClass getTrajectory() {
		return trajectoryEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.Trajectory#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fasExchange.Trajectory#getId()
	 * @see #getTrajectory()
	 * @generated
	 */
	public EAttribute getTrajectory_Id() {
		return (EAttribute)trajectoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link fasExchange.Trajectory#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicle</em>'.
	 * @see fasExchange.Trajectory#getVehicle()
	 * @see #getTrajectory()
	 * @generated
	 */
	public EReference getTrajectory_Vehicle() {
		return (EReference)trajectoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link fasExchange.Trajectory#getSpeedOverPosition <em>Speed Over Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Speed Over Position</em>'.
	 * @see fasExchange.Trajectory#getSpeedOverPosition()
	 * @see #getTrajectory()
	 * @generated
	 */
	public EReference getTrajectory_SpeedOverPosition() {
		return (EReference)trajectoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link fasExchange.Trajectory#getSpeedOverTime <em>Speed Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Speed Over Time</em>'.
	 * @see fasExchange.Trajectory#getSpeedOverTime()
	 * @see #getTrajectory()
	 * @generated
	 */
	public EReference getTrajectory_SpeedOverTime() {
		return (EReference)trajectoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link fasExchange.Trajectory#getPositionOverTime <em>Position Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Position Over Time</em>'.
	 * @see fasExchange.Trajectory#getPositionOverTime()
	 * @see #getTrajectory()
	 * @generated
	 */
	public EReference getTrajectory_PositionOverTime() {
		return (EReference)trajectoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link fasExchange.TrajectoryLeftFromMobile <em>Trajectory Left From Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trajectory Left From Mobile</em>'.
	 * @see fasExchange.TrajectoryLeftFromMobile
	 * @generated
	 */
	public EClass getTrajectoryLeftFromMobile() {
		return trajectoryLeftFromMobileEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link fasExchange.TrajectoryLeftFromMobile#getTrajectory <em>Trajectory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trajectory</em>'.
	 * @see fasExchange.TrajectoryLeftFromMobile#getTrajectory()
	 * @see #getTrajectoryLeftFromMobile()
	 * @generated
	 */
	public EReference getTrajectoryLeftFromMobile_Trajectory() {
		return (EReference)trajectoryLeftFromMobileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link fasExchange.TrajectoryLeftFromMobile#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see fasExchange.TrajectoryLeftFromMobile#getTimeStamp()
	 * @see #getTrajectoryLeftFromMobile()
	 * @generated
	 */
	public EAttribute getTrajectoryLeftFromMobile_TimeStamp() {
		return (EAttribute)trajectoryLeftFromMobileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public FasExchangeFactory getFasExchangeFactory() {
		return (FasExchangeFactory)getEFactoryInstance();
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
		fasExchangeEClass = createEClass(FAS_EXCHANGE);
		createEAttribute(fasExchangeEClass, FAS_EXCHANGE__ID);
		createEAttribute(fasExchangeEClass, FAS_EXCHANGE__JOURNEY_ID);
		createEAttribute(fasExchangeEClass, FAS_EXCHANGE__TIMESTAMP);
		createEReference(fasExchangeEClass, FAS_EXCHANGE__TRAJECTORY);
		createEReference(fasExchangeEClass, FAS_EXCHANGE__RECOMMENDATION);
		createEAttribute(fasExchangeEClass, FAS_EXCHANGE__GNSS_STATUS);
		createEAttribute(fasExchangeEClass, FAS_EXCHANGE__FAS_STATUS);
		createEReference(fasExchangeEClass, FAS_EXCHANGE__TIME_SLOTS_ON_JOURNEY);

		fasExchangeResponseEClass = createEClass(FAS_EXCHANGE_RESPONSE);
		createEAttribute(fasExchangeResponseEClass, FAS_EXCHANGE_RESPONSE__ID);
		createEAttribute(fasExchangeResponseEClass, FAS_EXCHANGE_RESPONSE__TIMESTAMP);
		createEAttribute(fasExchangeResponseEClass, FAS_EXCHANGE_RESPONSE__FAS_EXCHANGE_ID_TO_RESPONSE);
		createEAttribute(fasExchangeResponseEClass, FAS_EXCHANGE_RESPONSE__JOURNEY_ID);

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

		prognosisTimeSlotFromkLSAEClass = createEClass(PROGNOSIS_TIME_SLOT_FROMK_LSA);
		createEAttribute(prognosisTimeSlotFromkLSAEClass, PROGNOSIS_TIME_SLOT_FROMK_LSA__ID);
		createEReference(prognosisTimeSlotFromkLSAEClass, PROGNOSIS_TIME_SLOT_FROMK_LSA__KEY_COSTS);
		createEReference(prognosisTimeSlotFromkLSAEClass, PROGNOSIS_TIME_SLOT_FROMK_LSA__TIME_SLOTS);
		createEReference(prognosisTimeSlotFromkLSAEClass, PROGNOSIS_TIME_SLOT_FROMK_LSA__VEHICLES);

		prognosisForVehiclePowerDemandEClass = createEClass(PROGNOSIS_FOR_VEHICLE_POWER_DEMAND);
		createEAttribute(prognosisForVehiclePowerDemandEClass, PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__ID);
		createEReference(prognosisForVehiclePowerDemandEClass, PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__KEY_VEHICLES);
		createEReference(prognosisForVehiclePowerDemandEClass, PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_POSITIONS);
		createEReference(prognosisForVehiclePowerDemandEClass, PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_TIMES);

		powerDemandOverPositionEClass = createEClass(POWER_DEMAND_OVER_POSITION);
		createEReference(powerDemandOverPositionEClass, POWER_DEMAND_OVER_POSITION__POWER_PROGNOSIS);
		createEReference(powerDemandOverPositionEClass, POWER_DEMAND_OVER_POSITION__POSITION);

		powerDemandOverTimeEClass = createEClass(POWER_DEMAND_OVER_TIME);
		createEReference(powerDemandOverTimeEClass, POWER_DEMAND_OVER_TIME__POWER_PROGNOSIS);
		createEAttribute(powerDemandOverTimeEClass, POWER_DEMAND_OVER_TIME__TIMESTAMP);

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

		trajectoryLeftFromMobileEClass = createEClass(TRAJECTORY_LEFT_FROM_MOBILE);
		createEReference(trajectoryLeftFromMobileEClass, TRAJECTORY_LEFT_FROM_MOBILE__TRAJECTORY);
		createEAttribute(trajectoryLeftFromMobileEClass, TRAJECTORY_LEFT_FROM_MOBILE__TIME_STAMP);
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
		initEClass(fasExchangeEClass, FASExchange.class, "FASExchange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFASExchange_Id(), ecorePackage.getEString(), "id", null, 1, 1, FASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFASExchange_JourneyId(), ecorePackage.getEString(), "journeyId", null, 0, 1, FASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFASExchange_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, FASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFASExchange_Trajectory(), this.getTrajectory(), null, "trajectory", null, 0, 1, FASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFASExchange_Recommendation(), this.getRecommendation(), null, "recommendation", null, 0, -1, FASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFASExchange_GnssStatus(), theUtilsPackage.getGNSSStatus(), "gnssStatus", null, 0, 1, FASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFASExchange_FasStatus(), theUtilsPackage.getFASStatus(), "fasStatus", null, 0, 1, FASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFASExchange_TimeSlotsOnJourney(), this.getTimeSlotOnJourney(), null, "timeSlotsOnJourney", null, 1, -1, FASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fasExchangeResponseEClass, FASExchangeResponse.class, "FASExchangeResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFASExchangeResponse_Id(), ecorePackage.getEString(), "id", null, 1, 1, FASExchangeResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFASExchangeResponse_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, FASExchangeResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFASExchangeResponse_FasExchangeIdToResponse(), ecorePackage.getEString(), "fasExchangeIdToResponse", null, 0, 1, FASExchangeResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFASExchangeResponse_JourneyId(), ecorePackage.getEString(), "journeyId", null, 0, 1, FASExchangeResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recommendationEClass, Recommendation.class, "Recommendation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecommendation_Id(), ecorePackage.getEString(), "id", null, 1, 1, Recommendation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecommendation_JourneyId(), ecorePackage.getEString(), "journeyId", null, 0, 1, Recommendation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecommendation_TargetSpeed(), ecorePackage.getEInt(), "targetSpeed", null, 1, 1, Recommendation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecommendation_CountdownForDeparture(), ecorePackage.getEInt(), "countdownForDeparture", null, 1, 1, Recommendation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecommendation_RecommendationType(), theUtilsPackage.getRecommendationTypes(), "recommendationType", null, 1, 1, Recommendation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecommendation_StartTimeForInformationOrRecommendation(), theUtilsPackage.getZonedDateTime(), "startTimeForInformationOrRecommendation", null, 1, 1, Recommendation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecommendation_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, Recommendation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recommendationResponseFromMobileEClass, RecommendationResponseFromMobile.class, "RecommendationResponseFromMobile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecommendationResponseFromMobile_ReceivedRecommendation(), ecorePackage.getEBoolean(), "receivedRecommendation", null, 1, 1, RecommendationResponseFromMobile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecommendationResponseFromMobile_RecommendationId(), ecorePackage.getEString(), "recommendationId", null, 0, 1, RecommendationResponseFromMobile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecommendationResponseFromMobile_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, RecommendationResponseFromMobile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeSlotOnJourneyEClass, TimeSlotOnJourney.class, "TimeSlotOnJourney", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeSlotOnJourney_TimeSlot(), this.getTimeSlot(), null, "timeSlot", null, 0, 1, TimeSlotOnJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeSlotOnJourney_Position(), theUtilsPackage.getPosition(), null, "position", null, 0, 1, TimeSlotOnJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeSlotEClass, TimeSlot.class, "TimeSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeSlot_BeginOfTimeSlot(), theUtilsPackage.getZonedDateTime(), "beginOfTimeSlot", null, 1, 1, TimeSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeSlot_EndOfTimeSlot(), theUtilsPackage.getZonedDateTime(), "endOfTimeSlot", null, 1, 1, TimeSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prognosisTimeSlotFromkLSAEClass, PrognosisTimeSlotFromkLSA.class, "PrognosisTimeSlotFromkLSA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrognosisTimeSlotFromkLSA_Id(), ecorePackage.getEString(), "id", null, 1, 1, PrognosisTimeSlotFromkLSA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisTimeSlotFromkLSA_KeyCosts(), theUtilsPackage.getValueItem(), null, "keyCosts", null, 0, -1, PrognosisTimeSlotFromkLSA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisTimeSlotFromkLSA_TimeSlots(), this.getTimeSlot(), null, "timeSlots", null, 0, -1, PrognosisTimeSlotFromkLSA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisTimeSlotFromkLSA_Vehicles(), theVehiclePackage.getVehicle(), null, "vehicles", null, 0, -1, PrognosisTimeSlotFromkLSA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prognosisForVehiclePowerDemandEClass, PrognosisForVehiclePowerDemand.class, "PrognosisForVehiclePowerDemand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrognosisForVehiclePowerDemand_Id(), ecorePackage.getEString(), "id", null, 1, 1, PrognosisForVehiclePowerDemand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisForVehiclePowerDemand_KeyVehicles(), theVehiclePackage.getVehicle(), null, "keyVehicles", null, 0, -1, PrognosisForVehiclePowerDemand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisForVehiclePowerDemand_PowerDemandOverPositions(), this.getPowerDemandOverPosition(), null, "powerDemandOverPositions", null, 0, -1, PrognosisForVehiclePowerDemand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisForVehiclePowerDemand_PowerDemandOverTimes(), this.getPowerDemandOverTime(), null, "powerDemandOverTimes", null, 0, -1, PrognosisForVehiclePowerDemand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerDemandOverPositionEClass, PowerDemandOverPosition.class, "PowerDemandOverPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerDemandOverPosition_PowerPrognosis(), theUtilsPackage.getValueItem(), null, "powerPrognosis", null, 1, -1, PowerDemandOverPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPowerDemandOverPosition_Position(), theUtilsPackage.getPosition(), null, "position", null, 1, -1, PowerDemandOverPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerDemandOverTimeEClass, PowerDemandOverTime.class, "PowerDemandOverTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerDemandOverTime_PowerPrognosis(), theUtilsPackage.getValueItem(), null, "powerPrognosis", null, 1, -1, PowerDemandOverTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPowerDemandOverTime_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, -1, PowerDemandOverTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speedOverPositionEClass, SpeedOverPosition.class, "SpeedOverPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpeedOverPosition_Speed(), theUtilsPackage.getValueItem(), null, "speed", null, 0, 1, SpeedOverPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpeedOverPosition_Position(), theUtilsPackage.getPosition(), null, "position", null, 0, 1, SpeedOverPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speedOverTimeEClass, SpeedOverTime.class, "SpeedOverTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpeedOverTime_Speed(), theUtilsPackage.getValueItem(), null, "speed", null, 0, 1, SpeedOverTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeedOverTime_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 0, 1, SpeedOverTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionOverTimeEClass, PositionOverTime.class, "PositionOverTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPositionOverTime_Position(), theUtilsPackage.getPosition(), null, "position", null, 0, 1, PositionOverTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionOverTime_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 0, 1, PositionOverTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prognosisTimeSlotForJourneyEClass, PrognosisTimeSlotForJourney.class, "PrognosisTimeSlotForJourney", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrognosisTimeSlotForJourney_JourneyId(), ecorePackage.getEString(), "journeyId", null, 0, 1, PrognosisTimeSlotForJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisTimeSlotForJourney_TimeSlotsOnJourney(), this.getTimeSlotOnJourney(), null, "timeSlotsOnJourney", null, 1, -1, PrognosisTimeSlotForJourney.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trajectoryEClass, Trajectory.class, "Trajectory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrajectory_Id(), ecorePackage.getEString(), "id", null, 1, 1, Trajectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrajectory_Vehicle(), theVehiclePackage.getVehicle(), null, "vehicle", null, 0, 1, Trajectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrajectory_SpeedOverPosition(), this.getSpeedOverPosition(), null, "speedOverPosition", null, 1, -1, Trajectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrajectory_SpeedOverTime(), this.getSpeedOverTime(), null, "speedOverTime", null, 1, -1, Trajectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrajectory_PositionOverTime(), this.getPositionOverTime(), null, "positionOverTime", null, 1, -1, Trajectory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trajectoryLeftFromMobileEClass, TrajectoryLeftFromMobile.class, "TrajectoryLeftFromMobile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrajectoryLeftFromMobile_Trajectory(), this.getTrajectory(), null, "trajectory", null, 1, 1, TrajectoryLeftFromMobile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getTrajectoryLeftFromMobile_Trajectory().getEKeys().add(this.getTrajectory_Id());
		initEAttribute(getTrajectoryLeftFromMobile_TimeStamp(), theUtilsPackage.getZonedDateTime(), "timeStamp", null, 1, 1, TrajectoryLeftFromMobile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		 * The meta object literal for the '{@link fasExchange.FASExchange <em>FAS Exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fasExchange.FASExchange
		 * @see fasExchange.FasExchangePackage#getFASExchange()
		 * @generated
		 */
		public static final EClass FAS_EXCHANGE = eINSTANCE.getFASExchange();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FAS_EXCHANGE__ID = eINSTANCE.getFASExchange_Id();

		/**
		 * The meta object literal for the '<em><b>Journey Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FAS_EXCHANGE__JOURNEY_ID = eINSTANCE.getFASExchange_JourneyId();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FAS_EXCHANGE__TIMESTAMP = eINSTANCE.getFASExchange_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Trajectory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference FAS_EXCHANGE__TRAJECTORY = eINSTANCE.getFASExchange_Trajectory();

		/**
		 * The meta object literal for the '<em><b>Recommendation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference FAS_EXCHANGE__RECOMMENDATION = eINSTANCE.getFASExchange_Recommendation();

		/**
		 * The meta object literal for the '<em><b>Gnss Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FAS_EXCHANGE__GNSS_STATUS = eINSTANCE.getFASExchange_GnssStatus();

		/**
		 * The meta object literal for the '<em><b>Fas Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FAS_EXCHANGE__FAS_STATUS = eINSTANCE.getFASExchange_FasStatus();

		/**
		 * The meta object literal for the '<em><b>Time Slots On Journey</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference FAS_EXCHANGE__TIME_SLOTS_ON_JOURNEY = eINSTANCE.getFASExchange_TimeSlotsOnJourney();

		/**
		 * The meta object literal for the '{@link fasExchange.FASExchangeResponse <em>FAS Exchange Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fasExchange.FASExchangeResponse
		 * @see fasExchange.FasExchangePackage#getFASExchangeResponse()
		 * @generated
		 */
		public static final EClass FAS_EXCHANGE_RESPONSE = eINSTANCE.getFASExchangeResponse();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FAS_EXCHANGE_RESPONSE__ID = eINSTANCE.getFASExchangeResponse_Id();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FAS_EXCHANGE_RESPONSE__TIMESTAMP = eINSTANCE.getFASExchangeResponse_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Fas Exchange Id To Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FAS_EXCHANGE_RESPONSE__FAS_EXCHANGE_ID_TO_RESPONSE = eINSTANCE.getFASExchangeResponse_FasExchangeIdToResponse();

		/**
		 * The meta object literal for the '<em><b>Journey Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FAS_EXCHANGE_RESPONSE__JOURNEY_ID = eINSTANCE.getFASExchangeResponse_JourneyId();

		/**
		 * The meta object literal for the '{@link fasExchange.Recommendation <em>Recommendation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fasExchange.Recommendation
		 * @see fasExchange.FasExchangePackage#getRecommendation()
		 * @generated
		 */
		public static final EClass RECOMMENDATION = eINSTANCE.getRecommendation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECOMMENDATION__ID = eINSTANCE.getRecommendation_Id();

		/**
		 * The meta object literal for the '<em><b>Journey Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECOMMENDATION__JOURNEY_ID = eINSTANCE.getRecommendation_JourneyId();

		/**
		 * The meta object literal for the '<em><b>Target Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECOMMENDATION__TARGET_SPEED = eINSTANCE.getRecommendation_TargetSpeed();

		/**
		 * The meta object literal for the '<em><b>Countdown For Departure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECOMMENDATION__COUNTDOWN_FOR_DEPARTURE = eINSTANCE.getRecommendation_CountdownForDeparture();

		/**
		 * The meta object literal for the '<em><b>Recommendation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECOMMENDATION__RECOMMENDATION_TYPE = eINSTANCE.getRecommendation_RecommendationType();

		/**
		 * The meta object literal for the '<em><b>Start Time For Information Or Recommendation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECOMMENDATION__START_TIME_FOR_INFORMATION_OR_RECOMMENDATION = eINSTANCE.getRecommendation_StartTimeForInformationOrRecommendation();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECOMMENDATION__TIMESTAMP = eINSTANCE.getRecommendation_Timestamp();

		/**
		 * The meta object literal for the '{@link fasExchange.RecommendationResponseFromMobile <em>Recommendation Response From Mobile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fasExchange.RecommendationResponseFromMobile
		 * @see fasExchange.FasExchangePackage#getRecommendationResponseFromMobile()
		 * @generated
		 */
		public static final EClass RECOMMENDATION_RESPONSE_FROM_MOBILE = eINSTANCE.getRecommendationResponseFromMobile();

		/**
		 * The meta object literal for the '<em><b>Received Recommendation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECOMMENDATION_RESPONSE_FROM_MOBILE__RECEIVED_RECOMMENDATION = eINSTANCE.getRecommendationResponseFromMobile_ReceivedRecommendation();

		/**
		 * The meta object literal for the '<em><b>Recommendation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECOMMENDATION_RESPONSE_FROM_MOBILE__RECOMMENDATION_ID = eINSTANCE.getRecommendationResponseFromMobile_RecommendationId();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RECOMMENDATION_RESPONSE_FROM_MOBILE__TIMESTAMP = eINSTANCE.getRecommendationResponseFromMobile_Timestamp();

		/**
		 * The meta object literal for the '{@link fasExchange.TimeSlotOnJourney <em>Time Slot On Journey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fasExchange.TimeSlotOnJourney
		 * @see fasExchange.FasExchangePackage#getTimeSlotOnJourney()
		 * @generated
		 */
		public static final EClass TIME_SLOT_ON_JOURNEY = eINSTANCE.getTimeSlotOnJourney();

		/**
		 * The meta object literal for the '<em><b>Time Slot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TIME_SLOT_ON_JOURNEY__TIME_SLOT = eINSTANCE.getTimeSlotOnJourney_TimeSlot();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TIME_SLOT_ON_JOURNEY__POSITION = eINSTANCE.getTimeSlotOnJourney_Position();

		/**
		 * The meta object literal for the '{@link fasExchange.TimeSlot <em>Time Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fasExchange.TimeSlot
		 * @see fasExchange.FasExchangePackage#getTimeSlot()
		 * @generated
		 */
		public static final EClass TIME_SLOT = eINSTANCE.getTimeSlot();

		/**
		 * The meta object literal for the '<em><b>Begin Of Time Slot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TIME_SLOT__BEGIN_OF_TIME_SLOT = eINSTANCE.getTimeSlot_BeginOfTimeSlot();

		/**
		 * The meta object literal for the '<em><b>End Of Time Slot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TIME_SLOT__END_OF_TIME_SLOT = eINSTANCE.getTimeSlot_EndOfTimeSlot();

		/**
		 * The meta object literal for the '{@link fasExchange.PrognosisTimeSlotFromkLSA <em>Prognosis Time Slot Fromk LSA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fasExchange.PrognosisTimeSlotFromkLSA
		 * @see fasExchange.FasExchangePackage#getPrognosisTimeSlotFromkLSA()
		 * @generated
		 */
		public static final EClass PROGNOSIS_TIME_SLOT_FROMK_LSA = eINSTANCE.getPrognosisTimeSlotFromkLSA();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROGNOSIS_TIME_SLOT_FROMK_LSA__ID = eINSTANCE.getPrognosisTimeSlotFromkLSA_Id();

		/**
		 * The meta object literal for the '<em><b>Key Costs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROGNOSIS_TIME_SLOT_FROMK_LSA__KEY_COSTS = eINSTANCE.getPrognosisTimeSlotFromkLSA_KeyCosts();

		/**
		 * The meta object literal for the '<em><b>Time Slots</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROGNOSIS_TIME_SLOT_FROMK_LSA__TIME_SLOTS = eINSTANCE.getPrognosisTimeSlotFromkLSA_TimeSlots();

		/**
		 * The meta object literal for the '<em><b>Vehicles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROGNOSIS_TIME_SLOT_FROMK_LSA__VEHICLES = eINSTANCE.getPrognosisTimeSlotFromkLSA_Vehicles();

		/**
		 * The meta object literal for the '{@link fasExchange.PrognosisForVehiclePowerDemand <em>Prognosis For Vehicle Power Demand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fasExchange.PrognosisForVehiclePowerDemand
		 * @see fasExchange.FasExchangePackage#getPrognosisForVehiclePowerDemand()
		 * @generated
		 */
		public static final EClass PROGNOSIS_FOR_VEHICLE_POWER_DEMAND = eINSTANCE.getPrognosisForVehiclePowerDemand();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__ID = eINSTANCE.getPrognosisForVehiclePowerDemand_Id();

		/**
		 * The meta object literal for the '<em><b>Key Vehicles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__KEY_VEHICLES = eINSTANCE.getPrognosisForVehiclePowerDemand_KeyVehicles();

		/**
		 * The meta object literal for the '<em><b>Power Demand Over Positions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_POSITIONS = eINSTANCE.getPrognosisForVehiclePowerDemand_PowerDemandOverPositions();

		/**
		 * The meta object literal for the '<em><b>Power Demand Over Times</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_TIMES = eINSTANCE.getPrognosisForVehiclePowerDemand_PowerDemandOverTimes();

		/**
		 * The meta object literal for the '{@link fasExchange.PowerDemandOverPosition <em>Power Demand Over Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fasExchange.PowerDemandOverPosition
		 * @see fasExchange.FasExchangePackage#getPowerDemandOverPosition()
		 * @generated
		 */
		public static final EClass POWER_DEMAND_OVER_POSITION = eINSTANCE.getPowerDemandOverPosition();

		/**
		 * The meta object literal for the '<em><b>Power Prognosis</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_DEMAND_OVER_POSITION__POWER_PROGNOSIS = eINSTANCE.getPowerDemandOverPosition_PowerPrognosis();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_DEMAND_OVER_POSITION__POSITION = eINSTANCE.getPowerDemandOverPosition_Position();

		/**
		 * The meta object literal for the '{@link fasExchange.PowerDemandOverTime <em>Power Demand Over Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fasExchange.PowerDemandOverTime
		 * @see fasExchange.FasExchangePackage#getPowerDemandOverTime()
		 * @generated
		 */
		public static final EClass POWER_DEMAND_OVER_TIME = eINSTANCE.getPowerDemandOverTime();

		/**
		 * The meta object literal for the '<em><b>Power Prognosis</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POWER_DEMAND_OVER_TIME__POWER_PROGNOSIS = eINSTANCE.getPowerDemandOverTime_PowerPrognosis();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POWER_DEMAND_OVER_TIME__TIMESTAMP = eINSTANCE.getPowerDemandOverTime_Timestamp();

		/**
		 * The meta object literal for the '{@link fasExchange.SpeedOverPosition <em>Speed Over Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fasExchange.SpeedOverPosition
		 * @see fasExchange.FasExchangePackage#getSpeedOverPosition()
		 * @generated
		 */
		public static final EClass SPEED_OVER_POSITION = eINSTANCE.getSpeedOverPosition();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SPEED_OVER_POSITION__SPEED = eINSTANCE.getSpeedOverPosition_Speed();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SPEED_OVER_POSITION__POSITION = eINSTANCE.getSpeedOverPosition_Position();

		/**
		 * The meta object literal for the '{@link fasExchange.SpeedOverTime <em>Speed Over Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fasExchange.SpeedOverTime
		 * @see fasExchange.FasExchangePackage#getSpeedOverTime()
		 * @generated
		 */
		public static final EClass SPEED_OVER_TIME = eINSTANCE.getSpeedOverTime();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SPEED_OVER_TIME__SPEED = eINSTANCE.getSpeedOverTime_Speed();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SPEED_OVER_TIME__TIMESTAMP = eINSTANCE.getSpeedOverTime_Timestamp();

		/**
		 * The meta object literal for the '{@link fasExchange.PositionOverTime <em>Position Over Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fasExchange.PositionOverTime
		 * @see fasExchange.FasExchangePackage#getPositionOverTime()
		 * @generated
		 */
		public static final EClass POSITION_OVER_TIME = eINSTANCE.getPositionOverTime();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POSITION_OVER_TIME__POSITION = eINSTANCE.getPositionOverTime_Position();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POSITION_OVER_TIME__TIMESTAMP = eINSTANCE.getPositionOverTime_Timestamp();

		/**
		 * The meta object literal for the '{@link fasExchange.PrognosisTimeSlotForJourney <em>Prognosis Time Slot For Journey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fasExchange.PrognosisTimeSlotForJourney
		 * @see fasExchange.FasExchangePackage#getPrognosisTimeSlotForJourney()
		 * @generated
		 */
		public static final EClass PROGNOSIS_TIME_SLOT_FOR_JOURNEY = eINSTANCE.getPrognosisTimeSlotForJourney();

		/**
		 * The meta object literal for the '<em><b>Journey Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROGNOSIS_TIME_SLOT_FOR_JOURNEY__JOURNEY_ID = eINSTANCE.getPrognosisTimeSlotForJourney_JourneyId();

		/**
		 * The meta object literal for the '<em><b>Time Slots On Journey</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROGNOSIS_TIME_SLOT_FOR_JOURNEY__TIME_SLOTS_ON_JOURNEY = eINSTANCE.getPrognosisTimeSlotForJourney_TimeSlotsOnJourney();

		/**
		 * The meta object literal for the '{@link fasExchange.Trajectory <em>Trajectory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fasExchange.Trajectory
		 * @see fasExchange.FasExchangePackage#getTrajectory()
		 * @generated
		 */
		public static final EClass TRAJECTORY = eINSTANCE.getTrajectory();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRAJECTORY__ID = eINSTANCE.getTrajectory_Id();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRAJECTORY__VEHICLE = eINSTANCE.getTrajectory_Vehicle();

		/**
		 * The meta object literal for the '<em><b>Speed Over Position</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRAJECTORY__SPEED_OVER_POSITION = eINSTANCE.getTrajectory_SpeedOverPosition();

		/**
		 * The meta object literal for the '<em><b>Speed Over Time</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRAJECTORY__SPEED_OVER_TIME = eINSTANCE.getTrajectory_SpeedOverTime();

		/**
		 * The meta object literal for the '<em><b>Position Over Time</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRAJECTORY__POSITION_OVER_TIME = eINSTANCE.getTrajectory_PositionOverTime();

		/**
		 * The meta object literal for the '{@link fasExchange.TrajectoryLeftFromMobile <em>Trajectory Left From Mobile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fasExchange.TrajectoryLeftFromMobile
		 * @see fasExchange.FasExchangePackage#getTrajectoryLeftFromMobile()
		 * @generated
		 */
		public static final EClass TRAJECTORY_LEFT_FROM_MOBILE = eINSTANCE.getTrajectoryLeftFromMobile();

		/**
		 * The meta object literal for the '<em><b>Trajectory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TRAJECTORY_LEFT_FROM_MOBILE__TRAJECTORY = eINSTANCE.getTrajectoryLeftFromMobile_Trajectory();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TRAJECTORY_LEFT_FROM_MOBILE__TIME_STAMP = eINSTANCE.getTrajectoryLeftFromMobile_TimeStamp();

	}

} //FasExchangePackage
