/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import de.inavet.smarttrains.das.interfaces.utils.UtilsPackage;

import de.inavet.smarttrains.das.interfaces.vehicle.VehiclePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangeFactory
 * @generated
 */
public class DasexchangePackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "dasexchange";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://inavet.de/datamodels/dasexchange";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "dasexchange";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DasexchangePackage eINSTANCE = de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage.init();

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange <em>DAS Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getDASExchange()
	 * @generated
	 */
	public static final int DAS_EXCHANGE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAS_EXCHANGE__ID = 0;

	/**
	 * The feature id for the '<em><b>Journey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAS_EXCHANGE__JOURNEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAS_EXCHANGE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Trajectory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAS_EXCHANGE__TRAJECTORY = 3;

	/**
	 * The feature id for the '<em><b>Recommendation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAS_EXCHANGE__RECOMMENDATION = 4;

	/**
	 * The feature id for the '<em><b>Gnss Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAS_EXCHANGE__GNSS_STATUS = 5;

	/**
	 * The feature id for the '<em><b>Fas Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAS_EXCHANGE__FAS_STATUS = 6;

	/**
	 * The feature id for the '<em><b>Time Slots On Journey</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAS_EXCHANGE__TIME_SLOTS_ON_JOURNEY = 7;

	/**
	 * The number of structural features of the '<em>DAS Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAS_EXCHANGE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>DAS Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAS_EXCHANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse <em>DAS Exchange Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getDASExchangeResponse()
	 * @generated
	 */
	public static final int DAS_EXCHANGE_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAS_EXCHANGE_RESPONSE__ID = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAS_EXCHANGE_RESPONSE__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Fas Exchange Id To Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAS_EXCHANGE_RESPONSE__FAS_EXCHANGE_ID_TO_RESPONSE = 2;

	/**
	 * The feature id for the '<em><b>Journey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAS_EXCHANGE_RESPONSE__JOURNEY_ID = 3;

	/**
	 * The number of structural features of the '<em>DAS Exchange Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAS_EXCHANGE_RESPONSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>DAS Exchange Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DAS_EXCHANGE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation <em>Recommendation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getRecommendation()
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
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile <em>Recommendation Response From Mobile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getRecommendationResponseFromMobile()
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
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney <em>Time Slot On Journey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getTimeSlotOnJourney()
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
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot <em>Time Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getTimeSlot()
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
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA <em>Prognosis Time Slot Fromk LSA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPrognosisTimeSlotFromkLSA()
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
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisForVehiclePowerDemand <em>Prognosis For Vehicle Power Demand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisForVehiclePowerDemand
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPrognosisForVehiclePowerDemand()
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
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverPosition <em>Power Demand Over Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverPosition
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPowerDemandOverPosition()
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
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverTime <em>Power Demand Over Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverTime
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPowerDemandOverTime()
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
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition <em>Speed Over Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getSpeedOverPosition()
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
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime <em>Speed Over Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getSpeedOverTime()
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
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PositionOverTime <em>Position Over Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PositionOverTime
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPositionOverTime()
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
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney <em>Prognosis Time Slot For Journey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPrognosisTimeSlotForJourney()
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
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory <em>Trajectory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getTrajectory()
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
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TrajectoryLeftFromMobile <em>Trajectory Left From Mobile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TrajectoryLeftFromMobile
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getTrajectoryLeftFromMobile()
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
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DasexchangePackage() {
		super(eNS_URI, DasexchangeFactory.INSTANCE);
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
		DasexchangePackage theDasexchangePackage = registeredDasexchangePackage instanceof DasexchangePackage ? (DasexchangePackage)registeredDasexchangePackage : new DasexchangePackage();

		isInited = true;

		// Initialize simple dependencies
		UtilsPackage.eINSTANCE.eClass();
		VehiclePackage.eINSTANCE.eClass();

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
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange <em>DAS Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAS Exchange</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange
	 * @generated
	 */
	public EClass getDASExchange() {
		return dasExchangeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getId()
	 * @see #getDASExchange()
	 * @generated
	 */
	public EAttribute getDASExchange_Id() {
		return (EAttribute)dasExchangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getJourneyId <em>Journey Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getJourneyId()
	 * @see #getDASExchange()
	 * @generated
	 */
	public EAttribute getDASExchange_JourneyId() {
		return (EAttribute)dasExchangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getTimestamp()
	 * @see #getDASExchange()
	 * @generated
	 */
	public EAttribute getDASExchange_Timestamp() {
		return (EAttribute)dasExchangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getTrajectory <em>Trajectory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trajectory</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getTrajectory()
	 * @see #getDASExchange()
	 * @generated
	 */
	public EReference getDASExchange_Trajectory() {
		return (EReference)dasExchangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getRecommendation <em>Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recommendation</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getRecommendation()
	 * @see #getDASExchange()
	 * @generated
	 */
	public EReference getDASExchange_Recommendation() {
		return (EReference)dasExchangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getGnssStatus <em>Gnss Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gnss Status</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getGnssStatus()
	 * @see #getDASExchange()
	 * @generated
	 */
	public EAttribute getDASExchange_GnssStatus() {
		return (EAttribute)dasExchangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getFasStatus <em>Fas Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fas Status</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getFasStatus()
	 * @see #getDASExchange()
	 * @generated
	 */
	public EAttribute getDASExchange_FasStatus() {
		return (EAttribute)dasExchangeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getTimeSlotsOnJourney <em>Time Slots On Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Slots On Journey</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getTimeSlotsOnJourney()
	 * @see #getDASExchange()
	 * @generated
	 */
	public EReference getDASExchange_TimeSlotsOnJourney() {
		return (EReference)dasExchangeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse <em>DAS Exchange Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAS Exchange Response</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse
	 * @generated
	 */
	public EClass getDASExchangeResponse() {
		return dasExchangeResponseEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getId()
	 * @see #getDASExchangeResponse()
	 * @generated
	 */
	public EAttribute getDASExchangeResponse_Id() {
		return (EAttribute)dasExchangeResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getTimestamp()
	 * @see #getDASExchangeResponse()
	 * @generated
	 */
	public EAttribute getDASExchangeResponse_Timestamp() {
		return (EAttribute)dasExchangeResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getFasExchangeIdToResponse <em>Fas Exchange Id To Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fas Exchange Id To Response</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getFasExchangeIdToResponse()
	 * @see #getDASExchangeResponse()
	 * @generated
	 */
	public EAttribute getDASExchangeResponse_FasExchangeIdToResponse() {
		return (EAttribute)dasExchangeResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getJourneyId <em>Journey Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getJourneyId()
	 * @see #getDASExchangeResponse()
	 * @generated
	 */
	public EAttribute getDASExchangeResponse_JourneyId() {
		return (EAttribute)dasExchangeResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation <em>Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recommendation</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation
	 * @generated
	 */
	public EClass getRecommendation() {
		return recommendationEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getId()
	 * @see #getRecommendation()
	 * @generated
	 */
	public EAttribute getRecommendation_Id() {
		return (EAttribute)recommendationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getJourneyId <em>Journey Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getJourneyId()
	 * @see #getRecommendation()
	 * @generated
	 */
	public EAttribute getRecommendation_JourneyId() {
		return (EAttribute)recommendationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getTargetSpeed <em>Target Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Speed</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getTargetSpeed()
	 * @see #getRecommendation()
	 * @generated
	 */
	public EAttribute getRecommendation_TargetSpeed() {
		return (EAttribute)recommendationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getCountdownForDeparture <em>Countdown For Departure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Countdown For Departure</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getCountdownForDeparture()
	 * @see #getRecommendation()
	 * @generated
	 */
	public EAttribute getRecommendation_CountdownForDeparture() {
		return (EAttribute)recommendationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getRecommendationType <em>Recommendation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recommendation Type</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getRecommendationType()
	 * @see #getRecommendation()
	 * @generated
	 */
	public EAttribute getRecommendation_RecommendationType() {
		return (EAttribute)recommendationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getStartTimeForInformationOrRecommendation <em>Start Time For Information Or Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time For Information Or Recommendation</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getStartTimeForInformationOrRecommendation()
	 * @see #getRecommendation()
	 * @generated
	 */
	public EAttribute getRecommendation_StartTimeForInformationOrRecommendation() {
		return (EAttribute)recommendationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getTimestamp()
	 * @see #getRecommendation()
	 * @generated
	 */
	public EAttribute getRecommendation_Timestamp() {
		return (EAttribute)recommendationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile <em>Recommendation Response From Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recommendation Response From Mobile</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile
	 * @generated
	 */
	public EClass getRecommendationResponseFromMobile() {
		return recommendationResponseFromMobileEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile#isReceivedRecommendation <em>Received Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Received Recommendation</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile#isReceivedRecommendation()
	 * @see #getRecommendationResponseFromMobile()
	 * @generated
	 */
	public EAttribute getRecommendationResponseFromMobile_ReceivedRecommendation() {
		return (EAttribute)recommendationResponseFromMobileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile#getRecommendationId <em>Recommendation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recommendation Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile#getRecommendationId()
	 * @see #getRecommendationResponseFromMobile()
	 * @generated
	 */
	public EAttribute getRecommendationResponseFromMobile_RecommendationId() {
		return (EAttribute)recommendationResponseFromMobileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile#getTimestamp()
	 * @see #getRecommendationResponseFromMobile()
	 * @generated
	 */
	public EAttribute getRecommendationResponseFromMobile_Timestamp() {
		return (EAttribute)recommendationResponseFromMobileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney <em>Time Slot On Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Slot On Journey</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney
	 * @generated
	 */
	public EClass getTimeSlotOnJourney() {
		return timeSlotOnJourneyEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney#getTimeSlot <em>Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Slot</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney#getTimeSlot()
	 * @see #getTimeSlotOnJourney()
	 * @generated
	 */
	public EReference getTimeSlotOnJourney_TimeSlot() {
		return (EReference)timeSlotOnJourneyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney#getPosition()
	 * @see #getTimeSlotOnJourney()
	 * @generated
	 */
	public EReference getTimeSlotOnJourney_Position() {
		return (EReference)timeSlotOnJourneyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot <em>Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Slot</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot
	 * @generated
	 */
	public EClass getTimeSlot() {
		return timeSlotEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot#getBeginOfTimeSlot <em>Begin Of Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin Of Time Slot</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot#getBeginOfTimeSlot()
	 * @see #getTimeSlot()
	 * @generated
	 */
	public EAttribute getTimeSlot_BeginOfTimeSlot() {
		return (EAttribute)timeSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot#getEndOfTimeSlot <em>End Of Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Of Time Slot</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot#getEndOfTimeSlot()
	 * @see #getTimeSlot()
	 * @generated
	 */
	public EAttribute getTimeSlot_EndOfTimeSlot() {
		return (EAttribute)timeSlotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA <em>Prognosis Time Slot Fromk LSA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prognosis Time Slot Fromk LSA</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA
	 * @generated
	 */
	public EClass getPrognosisTimeSlotFromkLSA() {
		return prognosisTimeSlotFromkLSAEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA#getId()
	 * @see #getPrognosisTimeSlotFromkLSA()
	 * @generated
	 */
	public EAttribute getPrognosisTimeSlotFromkLSA_Id() {
		return (EAttribute)prognosisTimeSlotFromkLSAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA#getKeyCosts <em>Key Costs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Key Costs</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA#getKeyCosts()
	 * @see #getPrognosisTimeSlotFromkLSA()
	 * @generated
	 */
	public EReference getPrognosisTimeSlotFromkLSA_KeyCosts() {
		return (EReference)prognosisTimeSlotFromkLSAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA#getTimeSlots <em>Time Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Slots</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA#getTimeSlots()
	 * @see #getPrognosisTimeSlotFromkLSA()
	 * @generated
	 */
	public EReference getPrognosisTimeSlotFromkLSA_TimeSlots() {
		return (EReference)prognosisTimeSlotFromkLSAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA#getVehicles <em>Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vehicles</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA#getVehicles()
	 * @see #getPrognosisTimeSlotFromkLSA()
	 * @generated
	 */
	public EReference getPrognosisTimeSlotFromkLSA_Vehicles() {
		return (EReference)prognosisTimeSlotFromkLSAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisForVehiclePowerDemand <em>Prognosis For Vehicle Power Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prognosis For Vehicle Power Demand</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisForVehiclePowerDemand
	 * @generated
	 */
	public EClass getPrognosisForVehiclePowerDemand() {
		return prognosisForVehiclePowerDemandEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisForVehiclePowerDemand#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisForVehiclePowerDemand#getId()
	 * @see #getPrognosisForVehiclePowerDemand()
	 * @generated
	 */
	public EAttribute getPrognosisForVehiclePowerDemand_Id() {
		return (EAttribute)prognosisForVehiclePowerDemandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisForVehiclePowerDemand#getKeyVehicles <em>Key Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Key Vehicles</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisForVehiclePowerDemand#getKeyVehicles()
	 * @see #getPrognosisForVehiclePowerDemand()
	 * @generated
	 */
	public EReference getPrognosisForVehiclePowerDemand_KeyVehicles() {
		return (EReference)prognosisForVehiclePowerDemandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisForVehiclePowerDemand#getPowerDemandOverPositions <em>Power Demand Over Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power Demand Over Positions</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisForVehiclePowerDemand#getPowerDemandOverPositions()
	 * @see #getPrognosisForVehiclePowerDemand()
	 * @generated
	 */
	public EReference getPrognosisForVehiclePowerDemand_PowerDemandOverPositions() {
		return (EReference)prognosisForVehiclePowerDemandEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisForVehiclePowerDemand#getPowerDemandOverTimes <em>Power Demand Over Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power Demand Over Times</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisForVehiclePowerDemand#getPowerDemandOverTimes()
	 * @see #getPrognosisForVehiclePowerDemand()
	 * @generated
	 */
	public EReference getPrognosisForVehiclePowerDemand_PowerDemandOverTimes() {
		return (EReference)prognosisForVehiclePowerDemandEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverPosition <em>Power Demand Over Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Demand Over Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverPosition
	 * @generated
	 */
	public EClass getPowerDemandOverPosition() {
		return powerDemandOverPositionEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverPosition#getPowerPrognosis <em>Power Prognosis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power Prognosis</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverPosition#getPowerPrognosis()
	 * @see #getPowerDemandOverPosition()
	 * @generated
	 */
	public EReference getPowerDemandOverPosition_PowerPrognosis() {
		return (EReference)powerDemandOverPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverPosition#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverPosition#getPosition()
	 * @see #getPowerDemandOverPosition()
	 * @generated
	 */
	public EReference getPowerDemandOverPosition_Position() {
		return (EReference)powerDemandOverPositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverTime <em>Power Demand Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Demand Over Time</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverTime
	 * @generated
	 */
	public EClass getPowerDemandOverTime() {
		return powerDemandOverTimeEClass;
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverTime#getPowerPrognosis <em>Power Prognosis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power Prognosis</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverTime#getPowerPrognosis()
	 * @see #getPowerDemandOverTime()
	 * @generated
	 */
	public EReference getPowerDemandOverTime_PowerPrognosis() {
		return (EReference)powerDemandOverTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute list '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverTime#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverTime#getTimestamp()
	 * @see #getPowerDemandOverTime()
	 * @generated
	 */
	public EAttribute getPowerDemandOverTime_Timestamp() {
		return (EAttribute)powerDemandOverTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition <em>Speed Over Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speed Over Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition
	 * @generated
	 */
	public EClass getSpeedOverPosition() {
		return speedOverPositionEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Speed</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition#getSpeed()
	 * @see #getSpeedOverPosition()
	 * @generated
	 */
	public EReference getSpeedOverPosition_Speed() {
		return (EReference)speedOverPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition#getPosition()
	 * @see #getSpeedOverPosition()
	 * @generated
	 */
	public EReference getSpeedOverPosition_Position() {
		return (EReference)speedOverPositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime <em>Speed Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speed Over Time</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime
	 * @generated
	 */
	public EClass getSpeedOverTime() {
		return speedOverTimeEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Speed</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime#getSpeed()
	 * @see #getSpeedOverTime()
	 * @generated
	 */
	public EReference getSpeedOverTime_Speed() {
		return (EReference)speedOverTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime#getTimestamp()
	 * @see #getSpeedOverTime()
	 * @generated
	 */
	public EAttribute getSpeedOverTime_Timestamp() {
		return (EAttribute)speedOverTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PositionOverTime <em>Position Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Over Time</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PositionOverTime
	 * @generated
	 */
	public EClass getPositionOverTime() {
		return positionOverTimeEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PositionOverTime#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PositionOverTime#getPosition()
	 * @see #getPositionOverTime()
	 * @generated
	 */
	public EReference getPositionOverTime_Position() {
		return (EReference)positionOverTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PositionOverTime#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PositionOverTime#getTimestamp()
	 * @see #getPositionOverTime()
	 * @generated
	 */
	public EAttribute getPositionOverTime_Timestamp() {
		return (EAttribute)positionOverTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney <em>Prognosis Time Slot For Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prognosis Time Slot For Journey</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney
	 * @generated
	 */
	public EClass getPrognosisTimeSlotForJourney() {
		return prognosisTimeSlotForJourneyEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney#getJourneyId <em>Journey Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney#getJourneyId()
	 * @see #getPrognosisTimeSlotForJourney()
	 * @generated
	 */
	public EAttribute getPrognosisTimeSlotForJourney_JourneyId() {
		return (EAttribute)prognosisTimeSlotForJourneyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney#getTimeSlotsOnJourney <em>Time Slots On Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Slots On Journey</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney#getTimeSlotsOnJourney()
	 * @see #getPrognosisTimeSlotForJourney()
	 * @generated
	 */
	public EReference getPrognosisTimeSlotForJourney_TimeSlotsOnJourney() {
		return (EReference)prognosisTimeSlotForJourneyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory <em>Trajectory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trajectory</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory
	 * @generated
	 */
	public EClass getTrajectory() {
		return trajectoryEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getId()
	 * @see #getTrajectory()
	 * @generated
	 */
	public EAttribute getTrajectory_Id() {
		return (EAttribute)trajectoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicle</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getVehicle()
	 * @see #getTrajectory()
	 * @generated
	 */
	public EReference getTrajectory_Vehicle() {
		return (EReference)trajectoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getSpeedOverPosition <em>Speed Over Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Speed Over Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getSpeedOverPosition()
	 * @see #getTrajectory()
	 * @generated
	 */
	public EReference getTrajectory_SpeedOverPosition() {
		return (EReference)trajectoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getSpeedOverTime <em>Speed Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Speed Over Time</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getSpeedOverTime()
	 * @see #getTrajectory()
	 * @generated
	 */
	public EReference getTrajectory_SpeedOverTime() {
		return (EReference)trajectoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getPositionOverTime <em>Position Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Position Over Time</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getPositionOverTime()
	 * @see #getTrajectory()
	 * @generated
	 */
	public EReference getTrajectory_PositionOverTime() {
		return (EReference)trajectoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TrajectoryLeftFromMobile <em>Trajectory Left From Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trajectory Left From Mobile</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TrajectoryLeftFromMobile
	 * @generated
	 */
	public EClass getTrajectoryLeftFromMobile() {
		return trajectoryLeftFromMobileEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TrajectoryLeftFromMobile#getTrajectory <em>Trajectory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trajectory</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TrajectoryLeftFromMobile#getTrajectory()
	 * @see #getTrajectoryLeftFromMobile()
	 * @generated
	 */
	public EReference getTrajectoryLeftFromMobile_Trajectory() {
		return (EReference)trajectoryLeftFromMobileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TrajectoryLeftFromMobile#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TrajectoryLeftFromMobile#getTimeStamp()
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
		createEAttribute(dasExchangeEClass, DAS_EXCHANGE__FAS_STATUS);
		createEReference(dasExchangeEClass, DAS_EXCHANGE__TIME_SLOTS_ON_JOURNEY);

		dasExchangeResponseEClass = createEClass(DAS_EXCHANGE_RESPONSE);
		createEAttribute(dasExchangeResponseEClass, DAS_EXCHANGE_RESPONSE__ID);
		createEAttribute(dasExchangeResponseEClass, DAS_EXCHANGE_RESPONSE__TIMESTAMP);
		createEAttribute(dasExchangeResponseEClass, DAS_EXCHANGE_RESPONSE__FAS_EXCHANGE_ID_TO_RESPONSE);
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
		initEClass(dasExchangeEClass, DASExchange.class, "DASExchange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDASExchange_Id(), ecorePackage.getEString(), "id", null, 1, 1, DASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDASExchange_JourneyId(), ecorePackage.getEString(), "journeyId", null, 1, 1, DASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDASExchange_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, DASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDASExchange_Trajectory(), this.getTrajectory(), null, "trajectory", null, 0, 1, DASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDASExchange_Recommendation(), this.getRecommendation(), null, "recommendation", null, 0, -1, DASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDASExchange_GnssStatus(), theUtilsPackage.getGNSSStatus(), "gnssStatus", null, 1, 1, DASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDASExchange_FasStatus(), theUtilsPackage.getDASStatus(), "fasStatus", null, 1, 1, DASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDASExchange_TimeSlotsOnJourney(), this.getTimeSlotOnJourney(), null, "timeSlotsOnJourney", null, 1, -1, DASExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dasExchangeResponseEClass, DASExchangeResponse.class, "DASExchangeResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDASExchangeResponse_Id(), ecorePackage.getEString(), "id", null, 1, 1, DASExchangeResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDASExchangeResponse_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, DASExchangeResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDASExchangeResponse_FasExchangeIdToResponse(), ecorePackage.getEString(), "fasExchangeIdToResponse", null, 0, 1, DASExchangeResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDASExchangeResponse_JourneyId(), ecorePackage.getEString(), "journeyId", null, 0, 1, DASExchangeResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange <em>DAS Exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getDASExchange()
		 * @generated
		 */
		public static final EClass DAS_EXCHANGE = eINSTANCE.getDASExchange();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DAS_EXCHANGE__ID = eINSTANCE.getDASExchange_Id();

		/**
		 * The meta object literal for the '<em><b>Journey Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DAS_EXCHANGE__JOURNEY_ID = eINSTANCE.getDASExchange_JourneyId();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DAS_EXCHANGE__TIMESTAMP = eINSTANCE.getDASExchange_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Trajectory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DAS_EXCHANGE__TRAJECTORY = eINSTANCE.getDASExchange_Trajectory();

		/**
		 * The meta object literal for the '<em><b>Recommendation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DAS_EXCHANGE__RECOMMENDATION = eINSTANCE.getDASExchange_Recommendation();

		/**
		 * The meta object literal for the '<em><b>Gnss Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DAS_EXCHANGE__GNSS_STATUS = eINSTANCE.getDASExchange_GnssStatus();

		/**
		 * The meta object literal for the '<em><b>Fas Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DAS_EXCHANGE__FAS_STATUS = eINSTANCE.getDASExchange_FasStatus();

		/**
		 * The meta object literal for the '<em><b>Time Slots On Journey</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DAS_EXCHANGE__TIME_SLOTS_ON_JOURNEY = eINSTANCE.getDASExchange_TimeSlotsOnJourney();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse <em>DAS Exchange Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getDASExchangeResponse()
		 * @generated
		 */
		public static final EClass DAS_EXCHANGE_RESPONSE = eINSTANCE.getDASExchangeResponse();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DAS_EXCHANGE_RESPONSE__ID = eINSTANCE.getDASExchangeResponse_Id();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DAS_EXCHANGE_RESPONSE__TIMESTAMP = eINSTANCE.getDASExchangeResponse_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Fas Exchange Id To Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DAS_EXCHANGE_RESPONSE__FAS_EXCHANGE_ID_TO_RESPONSE = eINSTANCE.getDASExchangeResponse_FasExchangeIdToResponse();

		/**
		 * The meta object literal for the '<em><b>Journey Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DAS_EXCHANGE_RESPONSE__JOURNEY_ID = eINSTANCE.getDASExchangeResponse_JourneyId();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation <em>Recommendation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getRecommendation()
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
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile <em>Recommendation Response From Mobile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getRecommendationResponseFromMobile()
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
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney <em>Time Slot On Journey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getTimeSlotOnJourney()
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
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot <em>Time Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getTimeSlot()
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
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA <em>Prognosis Time Slot Fromk LSA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPrognosisTimeSlotFromkLSA()
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
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisForVehiclePowerDemand <em>Prognosis For Vehicle Power Demand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisForVehiclePowerDemand
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPrognosisForVehiclePowerDemand()
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
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverPosition <em>Power Demand Over Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverPosition
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPowerDemandOverPosition()
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
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverTime <em>Power Demand Over Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverTime
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPowerDemandOverTime()
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
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition <em>Speed Over Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getSpeedOverPosition()
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
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime <em>Speed Over Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getSpeedOverTime()
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
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PositionOverTime <em>Position Over Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PositionOverTime
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPositionOverTime()
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
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney <em>Prognosis Time Slot For Journey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPrognosisTimeSlotForJourney()
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
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory <em>Trajectory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getTrajectory()
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
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TrajectoryLeftFromMobile <em>Trajectory Left From Mobile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TrajectoryLeftFromMobile
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getTrajectoryLeftFromMobile()
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

} //DasexchangePackage
