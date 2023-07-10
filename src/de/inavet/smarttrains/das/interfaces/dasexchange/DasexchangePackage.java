/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore' fasExchange='#/'"
 * @generated
 */
public interface DasexchangePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dasexchange";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://inavet.de/datamodels/dataexchange/v1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dasexchange";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DasexchangePackage eINSTANCE = de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.DASExchangeImpl <em>DAS Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DASExchangeImpl
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl#getDASExchange()
	 * @generated
	 */
	int DAS_EXCHANGE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAS_EXCHANGE__ID = 0;

	/**
	 * The feature id for the '<em><b>Journey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAS_EXCHANGE__JOURNEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAS_EXCHANGE__TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Trajectory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAS_EXCHANGE__TRAJECTORY = 3;

	/**
	 * The feature id for the '<em><b>Recommendation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAS_EXCHANGE__RECOMMENDATION = 4;

	/**
	 * The feature id for the '<em><b>Gnss Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAS_EXCHANGE__GNSS_STATUS = 5;

	/**
	 * The feature id for the '<em><b>Das Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAS_EXCHANGE__DAS_STATUS = 6;

	/**
	 * The feature id for the '<em><b>Time Slots On Journey</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAS_EXCHANGE__TIME_SLOTS_ON_JOURNEY = 7;

	/**
	 * The number of structural features of the '<em>DAS Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAS_EXCHANGE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>DAS Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAS_EXCHANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.DASExchangeResponseImpl <em>DAS Exchange Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DASExchangeResponseImpl
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl#getDASExchangeResponse()
	 * @generated
	 */
	int DAS_EXCHANGE_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAS_EXCHANGE_RESPONSE__ID = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAS_EXCHANGE_RESPONSE__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Das Exchange Id To Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAS_EXCHANGE_RESPONSE__DAS_EXCHANGE_ID_TO_RESPONSE = 2;

	/**
	 * The feature id for the '<em><b>Journey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAS_EXCHANGE_RESPONSE__JOURNEY_ID = 3;

	/**
	 * The number of structural features of the '<em>DAS Exchange Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAS_EXCHANGE_RESPONSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>DAS Exchange Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAS_EXCHANGE_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.RecommendationImpl <em>Recommendation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.RecommendationImpl
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl#getRecommendation()
	 * @generated
	 */
	int RECOMMENDATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Journey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION__JOURNEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Target Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION__TARGET_SPEED = 2;

	/**
	 * The feature id for the '<em><b>Countdown For Departure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION__COUNTDOWN_FOR_DEPARTURE = 3;

	/**
	 * The feature id for the '<em><b>Recommendation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION__RECOMMENDATION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Start Time For Information Or Recommendation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION__START_TIME_FOR_INFORMATION_OR_RECOMMENDATION = 5;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION__TIMESTAMP = 6;

	/**
	 * The number of structural features of the '<em>Recommendation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Recommendation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.RecommendationResponseFromMobileImpl <em>Recommendation Response From Mobile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.RecommendationResponseFromMobileImpl
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl#getRecommendationResponseFromMobile()
	 * @generated
	 */
	int RECOMMENDATION_RESPONSE_FROM_MOBILE = 3;

	/**
	 * The feature id for the '<em><b>Received Recommendation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_RESPONSE_FROM_MOBILE__RECEIVED_RECOMMENDATION = 0;

	/**
	 * The feature id for the '<em><b>Recommendation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_RESPONSE_FROM_MOBILE__RECOMMENDATION_ID = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_RESPONSE_FROM_MOBILE__TIMESTAMP = 2;

	/**
	 * The number of structural features of the '<em>Recommendation Response From Mobile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_RESPONSE_FROM_MOBILE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Recommendation Response From Mobile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_RESPONSE_FROM_MOBILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.TimeSlotOnJourneyImpl <em>Time Slot On Journey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.TimeSlotOnJourneyImpl
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl#getTimeSlotOnJourney()
	 * @generated
	 */
	int TIME_SLOT_ON_JOURNEY = 4;

	/**
	 * The feature id for the '<em><b>Time Slot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLOT_ON_JOURNEY__TIME_SLOT = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLOT_ON_JOURNEY__POSITION = 1;

	/**
	 * The number of structural features of the '<em>Time Slot On Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLOT_ON_JOURNEY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Time Slot On Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLOT_ON_JOURNEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.TimeSlotImpl <em>Time Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.TimeSlotImpl
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl#getTimeSlot()
	 * @generated
	 */
	int TIME_SLOT = 5;

	/**
	 * The feature id for the '<em><b>Begin Of Time Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLOT__BEGIN_OF_TIME_SLOT = 0;

	/**
	 * The feature id for the '<em><b>End Of Time Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLOT__END_OF_TIME_SLOT = 1;

	/**
	 * The number of structural features of the '<em>Time Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Time Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.SpeedOverPositionImpl <em>Speed Over Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.SpeedOverPositionImpl
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl#getSpeedOverPosition()
	 * @generated
	 */
	int SPEED_OVER_POSITION = 6;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_OVER_POSITION__SPEED = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_OVER_POSITION__POSITION = 1;

	/**
	 * The number of structural features of the '<em>Speed Over Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_OVER_POSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Speed Over Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_OVER_POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.SpeedOverTimeImpl <em>Speed Over Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.SpeedOverTimeImpl
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl#getSpeedOverTime()
	 * @generated
	 */
	int SPEED_OVER_TIME = 7;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_OVER_TIME__SPEED = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_OVER_TIME__TIMESTAMP = 1;

	/**
	 * The number of structural features of the '<em>Speed Over Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_OVER_TIME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Speed Over Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_OVER_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.PositionOverTimeImpl <em>Position Over Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.PositionOverTimeImpl
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl#getPositionOverTime()
	 * @generated
	 */
	int POSITION_OVER_TIME = 8;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OVER_TIME__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OVER_TIME__TIMESTAMP = 1;

	/**
	 * The number of structural features of the '<em>Position Over Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OVER_TIME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Position Over Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OVER_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.PrognosisTimeSlotForJourneyImpl <em>Prognosis Time Slot For Journey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.PrognosisTimeSlotForJourneyImpl
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl#getPrognosisTimeSlotForJourney()
	 * @generated
	 */
	int PROGNOSIS_TIME_SLOT_FOR_JOURNEY = 9;

	/**
	 * The feature id for the '<em><b>Journey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_TIME_SLOT_FOR_JOURNEY__JOURNEY_ID = 0;

	/**
	 * The feature id for the '<em><b>Time Slots On Journey</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_TIME_SLOT_FOR_JOURNEY__TIME_SLOTS_ON_JOURNEY = 1;

	/**
	 * The number of structural features of the '<em>Prognosis Time Slot For Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_TIME_SLOT_FOR_JOURNEY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Prognosis Time Slot For Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_TIME_SLOT_FOR_JOURNEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.TrajectoryImpl <em>Trajectory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.TrajectoryImpl
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl#getTrajectory()
	 * @generated
	 */
	int TRAJECTORY = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY__ID = 0;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY__VEHICLE = 1;

	/**
	 * The feature id for the '<em><b>Speed Over Position</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY__SPEED_OVER_POSITION = 2;

	/**
	 * The feature id for the '<em><b>Speed Over Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY__SPEED_OVER_TIME = 3;

	/**
	 * The feature id for the '<em><b>Position Over Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY__POSITION_OVER_TIME = 4;

	/**
	 * The number of structural features of the '<em>Trajectory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Trajectory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAJECTORY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange <em>DAS Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAS Exchange</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange
	 * @generated
	 */
	EClass getDASExchange();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getId()
	 * @see #getDASExchange()
	 * @generated
	 */
	EAttribute getDASExchange_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getJourneyId <em>Journey Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getJourneyId()
	 * @see #getDASExchange()
	 * @generated
	 */
	EAttribute getDASExchange_JourneyId();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getTimestamp()
	 * @see #getDASExchange()
	 * @generated
	 */
	EAttribute getDASExchange_Timestamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getTrajectory <em>Trajectory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trajectory</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getTrajectory()
	 * @see #getDASExchange()
	 * @generated
	 */
	EReference getDASExchange_Trajectory();

	/**
	 * Returns the meta object for the containment reference list '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getRecommendation <em>Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recommendation</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getRecommendation()
	 * @see #getDASExchange()
	 * @generated
	 */
	EReference getDASExchange_Recommendation();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getGnssStatus <em>Gnss Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gnss Status</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getGnssStatus()
	 * @see #getDASExchange()
	 * @generated
	 */
	EAttribute getDASExchange_GnssStatus();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getDasStatus <em>Das Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Das Status</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getDasStatus()
	 * @see #getDASExchange()
	 * @generated
	 */
	EAttribute getDASExchange_DasStatus();

	/**
	 * Returns the meta object for the containment reference list '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getTimeSlotsOnJourney <em>Time Slots On Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Slots On Journey</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getTimeSlotsOnJourney()
	 * @see #getDASExchange()
	 * @generated
	 */
	EReference getDASExchange_TimeSlotsOnJourney();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse <em>DAS Exchange Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAS Exchange Response</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse
	 * @generated
	 */
	EClass getDASExchangeResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getId()
	 * @see #getDASExchangeResponse()
	 * @generated
	 */
	EAttribute getDASExchangeResponse_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getTimestamp()
	 * @see #getDASExchangeResponse()
	 * @generated
	 */
	EAttribute getDASExchangeResponse_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getDasExchangeIdToResponse <em>Das Exchange Id To Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Das Exchange Id To Response</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getDasExchangeIdToResponse()
	 * @see #getDASExchangeResponse()
	 * @generated
	 */
	EAttribute getDASExchangeResponse_DasExchangeIdToResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getJourneyId <em>Journey Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse#getJourneyId()
	 * @see #getDASExchangeResponse()
	 * @generated
	 */
	EAttribute getDASExchangeResponse_JourneyId();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation <em>Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recommendation</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation
	 * @generated
	 */
	EClass getRecommendation();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getId()
	 * @see #getRecommendation()
	 * @generated
	 */
	EAttribute getRecommendation_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getJourneyId <em>Journey Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getJourneyId()
	 * @see #getRecommendation()
	 * @generated
	 */
	EAttribute getRecommendation_JourneyId();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getTargetSpeed <em>Target Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Speed</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getTargetSpeed()
	 * @see #getRecommendation()
	 * @generated
	 */
	EAttribute getRecommendation_TargetSpeed();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getCountdownForDeparture <em>Countdown For Departure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Countdown For Departure</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getCountdownForDeparture()
	 * @see #getRecommendation()
	 * @generated
	 */
	EAttribute getRecommendation_CountdownForDeparture();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getRecommendationType <em>Recommendation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recommendation Type</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getRecommendationType()
	 * @see #getRecommendation()
	 * @generated
	 */
	EAttribute getRecommendation_RecommendationType();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getStartTimeForInformationOrRecommendation <em>Start Time For Information Or Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time For Information Or Recommendation</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getStartTimeForInformationOrRecommendation()
	 * @see #getRecommendation()
	 * @generated
	 */
	EAttribute getRecommendation_StartTimeForInformationOrRecommendation();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation#getTimestamp()
	 * @see #getRecommendation()
	 * @generated
	 */
	EAttribute getRecommendation_Timestamp();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile <em>Recommendation Response From Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recommendation Response From Mobile</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile
	 * @generated
	 */
	EClass getRecommendationResponseFromMobile();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile#isReceivedRecommendation <em>Received Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Received Recommendation</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile#isReceivedRecommendation()
	 * @see #getRecommendationResponseFromMobile()
	 * @generated
	 */
	EAttribute getRecommendationResponseFromMobile_ReceivedRecommendation();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile#getRecommendationId <em>Recommendation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recommendation Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile#getRecommendationId()
	 * @see #getRecommendationResponseFromMobile()
	 * @generated
	 */
	EAttribute getRecommendationResponseFromMobile_RecommendationId();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile#getTimestamp()
	 * @see #getRecommendationResponseFromMobile()
	 * @generated
	 */
	EAttribute getRecommendationResponseFromMobile_Timestamp();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney <em>Time Slot On Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Slot On Journey</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney
	 * @generated
	 */
	EClass getTimeSlotOnJourney();

	/**
	 * Returns the meta object for the containment reference '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney#getTimeSlot <em>Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Slot</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney#getTimeSlot()
	 * @see #getTimeSlotOnJourney()
	 * @generated
	 */
	EReference getTimeSlotOnJourney_TimeSlot();

	/**
	 * Returns the meta object for the containment reference '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney#getPosition()
	 * @see #getTimeSlotOnJourney()
	 * @generated
	 */
	EReference getTimeSlotOnJourney_Position();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot <em>Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Slot</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot
	 * @generated
	 */
	EClass getTimeSlot();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot#getBeginOfTimeSlot <em>Begin Of Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin Of Time Slot</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot#getBeginOfTimeSlot()
	 * @see #getTimeSlot()
	 * @generated
	 */
	EAttribute getTimeSlot_BeginOfTimeSlot();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot#getEndOfTimeSlot <em>End Of Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Of Time Slot</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot#getEndOfTimeSlot()
	 * @see #getTimeSlot()
	 * @generated
	 */
	EAttribute getTimeSlot_EndOfTimeSlot();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition <em>Speed Over Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speed Over Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition
	 * @generated
	 */
	EClass getSpeedOverPosition();

	/**
	 * Returns the meta object for the containment reference '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speed</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition#getSpeed()
	 * @see #getSpeedOverPosition()
	 * @generated
	 */
	EReference getSpeedOverPosition_Speed();

	/**
	 * Returns the meta object for the containment reference '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition#getPosition()
	 * @see #getSpeedOverPosition()
	 * @generated
	 */
	EReference getSpeedOverPosition_Position();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime <em>Speed Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speed Over Time</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime
	 * @generated
	 */
	EClass getSpeedOverTime();

	/**
	 * Returns the meta object for the containment reference '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speed</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime#getSpeed()
	 * @see #getSpeedOverTime()
	 * @generated
	 */
	EReference getSpeedOverTime_Speed();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime#getTimestamp()
	 * @see #getSpeedOverTime()
	 * @generated
	 */
	EAttribute getSpeedOverTime_Timestamp();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PositionOverTime <em>Position Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Over Time</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PositionOverTime
	 * @generated
	 */
	EClass getPositionOverTime();

	/**
	 * Returns the meta object for the containment reference '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PositionOverTime#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PositionOverTime#getPosition()
	 * @see #getPositionOverTime()
	 * @generated
	 */
	EReference getPositionOverTime_Position();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PositionOverTime#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PositionOverTime#getTimestamp()
	 * @see #getPositionOverTime()
	 * @generated
	 */
	EAttribute getPositionOverTime_Timestamp();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney <em>Prognosis Time Slot For Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prognosis Time Slot For Journey</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney
	 * @generated
	 */
	EClass getPrognosisTimeSlotForJourney();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney#getJourneyId <em>Journey Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney#getJourneyId()
	 * @see #getPrognosisTimeSlotForJourney()
	 * @generated
	 */
	EAttribute getPrognosisTimeSlotForJourney_JourneyId();

	/**
	 * Returns the meta object for the containment reference list '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney#getTimeSlotsOnJourney <em>Time Slots On Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Slots On Journey</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney#getTimeSlotsOnJourney()
	 * @see #getPrognosisTimeSlotForJourney()
	 * @generated
	 */
	EReference getPrognosisTimeSlotForJourney_TimeSlotsOnJourney();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory <em>Trajectory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trajectory</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory
	 * @generated
	 */
	EClass getTrajectory();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getId()
	 * @see #getTrajectory()
	 * @generated
	 */
	EAttribute getTrajectory_Id();

	/**
	 * Returns the meta object for the containment reference '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vehicle</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getVehicle()
	 * @see #getTrajectory()
	 * @generated
	 */
	EReference getTrajectory_Vehicle();

	/**
	 * Returns the meta object for the containment reference list '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getSpeedOverPosition <em>Speed Over Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Speed Over Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getSpeedOverPosition()
	 * @see #getTrajectory()
	 * @generated
	 */
	EReference getTrajectory_SpeedOverPosition();

	/**
	 * Returns the meta object for the containment reference list '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getSpeedOverTime <em>Speed Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Speed Over Time</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getSpeedOverTime()
	 * @see #getTrajectory()
	 * @generated
	 */
	EReference getTrajectory_SpeedOverTime();

	/**
	 * Returns the meta object for the containment reference list '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getPositionOverTime <em>Position Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Position Over Time</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory#getPositionOverTime()
	 * @see #getTrajectory()
	 * @generated
	 */
	EReference getTrajectory_PositionOverTime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DasexchangeFactory getDasexchangeFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.DASExchangeImpl <em>DAS Exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DASExchangeImpl
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl#getDASExchange()
		 * @generated
		 */
		EClass DAS_EXCHANGE = eINSTANCE.getDASExchange();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAS_EXCHANGE__ID = eINSTANCE.getDASExchange_Id();

		/**
		 * The meta object literal for the '<em><b>Journey Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAS_EXCHANGE__JOURNEY_ID = eINSTANCE.getDASExchange_JourneyId();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAS_EXCHANGE__TIMESTAMP = eINSTANCE.getDASExchange_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Trajectory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAS_EXCHANGE__TRAJECTORY = eINSTANCE.getDASExchange_Trajectory();

		/**
		 * The meta object literal for the '<em><b>Recommendation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAS_EXCHANGE__RECOMMENDATION = eINSTANCE.getDASExchange_Recommendation();

		/**
		 * The meta object literal for the '<em><b>Gnss Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAS_EXCHANGE__GNSS_STATUS = eINSTANCE.getDASExchange_GnssStatus();

		/**
		 * The meta object literal for the '<em><b>Das Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAS_EXCHANGE__DAS_STATUS = eINSTANCE.getDASExchange_DasStatus();

		/**
		 * The meta object literal for the '<em><b>Time Slots On Journey</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAS_EXCHANGE__TIME_SLOTS_ON_JOURNEY = eINSTANCE.getDASExchange_TimeSlotsOnJourney();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.DASExchangeResponseImpl <em>DAS Exchange Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DASExchangeResponseImpl
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl#getDASExchangeResponse()
		 * @generated
		 */
		EClass DAS_EXCHANGE_RESPONSE = eINSTANCE.getDASExchangeResponse();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAS_EXCHANGE_RESPONSE__ID = eINSTANCE.getDASExchangeResponse_Id();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAS_EXCHANGE_RESPONSE__TIMESTAMP = eINSTANCE.getDASExchangeResponse_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Das Exchange Id To Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAS_EXCHANGE_RESPONSE__DAS_EXCHANGE_ID_TO_RESPONSE = eINSTANCE.getDASExchangeResponse_DasExchangeIdToResponse();

		/**
		 * The meta object literal for the '<em><b>Journey Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAS_EXCHANGE_RESPONSE__JOURNEY_ID = eINSTANCE.getDASExchangeResponse_JourneyId();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.RecommendationImpl <em>Recommendation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.RecommendationImpl
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl#getRecommendation()
		 * @generated
		 */
		EClass RECOMMENDATION = eINSTANCE.getRecommendation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMENDATION__ID = eINSTANCE.getRecommendation_Id();

		/**
		 * The meta object literal for the '<em><b>Journey Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMENDATION__JOURNEY_ID = eINSTANCE.getRecommendation_JourneyId();

		/**
		 * The meta object literal for the '<em><b>Target Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMENDATION__TARGET_SPEED = eINSTANCE.getRecommendation_TargetSpeed();

		/**
		 * The meta object literal for the '<em><b>Countdown For Departure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMENDATION__COUNTDOWN_FOR_DEPARTURE = eINSTANCE.getRecommendation_CountdownForDeparture();

		/**
		 * The meta object literal for the '<em><b>Recommendation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMENDATION__RECOMMENDATION_TYPE = eINSTANCE.getRecommendation_RecommendationType();

		/**
		 * The meta object literal for the '<em><b>Start Time For Information Or Recommendation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMENDATION__START_TIME_FOR_INFORMATION_OR_RECOMMENDATION = eINSTANCE.getRecommendation_StartTimeForInformationOrRecommendation();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMENDATION__TIMESTAMP = eINSTANCE.getRecommendation_Timestamp();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.RecommendationResponseFromMobileImpl <em>Recommendation Response From Mobile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.RecommendationResponseFromMobileImpl
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl#getRecommendationResponseFromMobile()
		 * @generated
		 */
		EClass RECOMMENDATION_RESPONSE_FROM_MOBILE = eINSTANCE.getRecommendationResponseFromMobile();

		/**
		 * The meta object literal for the '<em><b>Received Recommendation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMENDATION_RESPONSE_FROM_MOBILE__RECEIVED_RECOMMENDATION = eINSTANCE.getRecommendationResponseFromMobile_ReceivedRecommendation();

		/**
		 * The meta object literal for the '<em><b>Recommendation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMENDATION_RESPONSE_FROM_MOBILE__RECOMMENDATION_ID = eINSTANCE.getRecommendationResponseFromMobile_RecommendationId();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMENDATION_RESPONSE_FROM_MOBILE__TIMESTAMP = eINSTANCE.getRecommendationResponseFromMobile_Timestamp();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.TimeSlotOnJourneyImpl <em>Time Slot On Journey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.TimeSlotOnJourneyImpl
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl#getTimeSlotOnJourney()
		 * @generated
		 */
		EClass TIME_SLOT_ON_JOURNEY = eINSTANCE.getTimeSlotOnJourney();

		/**
		 * The meta object literal for the '<em><b>Time Slot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SLOT_ON_JOURNEY__TIME_SLOT = eINSTANCE.getTimeSlotOnJourney_TimeSlot();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SLOT_ON_JOURNEY__POSITION = eINSTANCE.getTimeSlotOnJourney_Position();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.TimeSlotImpl <em>Time Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.TimeSlotImpl
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl#getTimeSlot()
		 * @generated
		 */
		EClass TIME_SLOT = eINSTANCE.getTimeSlot();

		/**
		 * The meta object literal for the '<em><b>Begin Of Time Slot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SLOT__BEGIN_OF_TIME_SLOT = eINSTANCE.getTimeSlot_BeginOfTimeSlot();

		/**
		 * The meta object literal for the '<em><b>End Of Time Slot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SLOT__END_OF_TIME_SLOT = eINSTANCE.getTimeSlot_EndOfTimeSlot();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.SpeedOverPositionImpl <em>Speed Over Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.SpeedOverPositionImpl
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl#getSpeedOverPosition()
		 * @generated
		 */
		EClass SPEED_OVER_POSITION = eINSTANCE.getSpeedOverPosition();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEED_OVER_POSITION__SPEED = eINSTANCE.getSpeedOverPosition_Speed();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEED_OVER_POSITION__POSITION = eINSTANCE.getSpeedOverPosition_Position();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.SpeedOverTimeImpl <em>Speed Over Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.SpeedOverTimeImpl
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl#getSpeedOverTime()
		 * @generated
		 */
		EClass SPEED_OVER_TIME = eINSTANCE.getSpeedOverTime();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEED_OVER_TIME__SPEED = eINSTANCE.getSpeedOverTime_Speed();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEED_OVER_TIME__TIMESTAMP = eINSTANCE.getSpeedOverTime_Timestamp();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.PositionOverTimeImpl <em>Position Over Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.PositionOverTimeImpl
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl#getPositionOverTime()
		 * @generated
		 */
		EClass POSITION_OVER_TIME = eINSTANCE.getPositionOverTime();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION_OVER_TIME__POSITION = eINSTANCE.getPositionOverTime_Position();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_OVER_TIME__TIMESTAMP = eINSTANCE.getPositionOverTime_Timestamp();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.PrognosisTimeSlotForJourneyImpl <em>Prognosis Time Slot For Journey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.PrognosisTimeSlotForJourneyImpl
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl#getPrognosisTimeSlotForJourney()
		 * @generated
		 */
		EClass PROGNOSIS_TIME_SLOT_FOR_JOURNEY = eINSTANCE.getPrognosisTimeSlotForJourney();

		/**
		 * The meta object literal for the '<em><b>Journey Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGNOSIS_TIME_SLOT_FOR_JOURNEY__JOURNEY_ID = eINSTANCE.getPrognosisTimeSlotForJourney_JourneyId();

		/**
		 * The meta object literal for the '<em><b>Time Slots On Journey</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGNOSIS_TIME_SLOT_FOR_JOURNEY__TIME_SLOTS_ON_JOURNEY = eINSTANCE.getPrognosisTimeSlotForJourney_TimeSlotsOnJourney();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.TrajectoryImpl <em>Trajectory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.TrajectoryImpl
		 * @see de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangePackageImpl#getTrajectory()
		 * @generated
		 */
		EClass TRAJECTORY = eINSTANCE.getTrajectory();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAJECTORY__ID = eINSTANCE.getTrajectory_Id();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAJECTORY__VEHICLE = eINSTANCE.getTrajectory_Vehicle();

		/**
		 * The meta object literal for the '<em><b>Speed Over Position</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAJECTORY__SPEED_OVER_POSITION = eINSTANCE.getTrajectory_SpeedOverPosition();

		/**
		 * The meta object literal for the '<em><b>Speed Over Time</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAJECTORY__SPEED_OVER_TIME = eINSTANCE.getTrajectory_SpeedOverTime();

		/**
		 * The meta object literal for the '<em><b>Position Over Time</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAJECTORY__POSITION_OVER_TIME = eINSTANCE.getTrajectory_PositionOverTime();

	}

} //DasexchangePackage
