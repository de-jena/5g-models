/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

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
 * <!-- begin-model-doc -->
 * cTLC - Cooperative Traffic Light Control (Kooperative Lichtsignalanlage)
 * <!-- end-model-doc -->
 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcFactory
 * @generated
 */
public class CtlcPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "ctlc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://inavet.de/datamodels/ctlc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "ctlc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CtlcPackage eINSTANCE = de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage.init();

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate <em>Periodic Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getPeriodicUpdate()
	 * @generated
	 */
	public static final int PERIODIC_UPDATE = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERIODIC_UPDATE__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Updates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERIODIC_UPDATE__UPDATES = 1;

	/**
	 * The number of structural features of the '<em>Periodic Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERIODIC_UPDATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Periodic Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PERIODIC_UPDATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle <em>Update For Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getUpdateForVehicle()
	 * @generated
	 */
	public static final int UPDATE_FOR_VEHICLE = 1;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_FOR_VEHICLE__VEHICLE = 0;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_FOR_VEHICLE__CURRENT_POSITION = 1;

	/**
	 * The feature id for the '<em><b>Current Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_FOR_VEHICLE__CURRENT_VELOCITY = 2;

	/**
	 * The feature id for the '<em><b>Arrivals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_FOR_VEHICLE__ARRIVALS = 3;

	/**
	 * The feature id for the '<em><b>Stop Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_FOR_VEHICLE__STOP_PLACES = 4;

	/**
	 * The number of structural features of the '<em>Update For Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_FOR_VEHICLE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Update For Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_FOR_VEHICLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition <em>Prognosis Arrival And Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getPrognosisArrivalAndPosition()
	 * @generated
	 */
	public static final int PROGNOSIS_ARRIVAL_AND_POSITION = 2;

	/**
	 * The feature id for the '<em><b>Estimated Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_ARRIVAL_AND_POSITION__ESTIMATED_ARRIVAL_TIME = 0;

	/**
	 * The feature id for the '<em><b>Arrival Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_ARRIVAL_AND_POSITION__ARRIVAL_POSITION = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_ARRIVAL_AND_POSITION__PRIORITY = 2;

	/**
	 * The number of structural features of the '<em>Prognosis Arrival And Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_ARRIVAL_AND_POSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Prognosis Arrival And Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_ARRIVAL_AND_POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace <em>Prognosis Stop Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getPrognosisStopPlace()
	 * @generated
	 */
	public static final int PROGNOSIS_STOP_PLACE = 3;

	/**
	 * The feature id for the '<em><b>Stop Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_STOP_PLACE__STOP_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Prognosed Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_STOP_PLACE__PROGNOSED_PLACE = 1;

	/**
	 * The number of structural features of the '<em>Prognosis Stop Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_STOP_PLACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Prognosis Stop Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_STOP_PLACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.MarkedPosition <em>Marked Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.MarkedPosition
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getMarkedPosition()
	 * @generated
	 */
	public static final int MARKED_POSITION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKED_POSITION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKED_POSITION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Marked Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKED_POSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Marked Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int MARKED_POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest <em>Release Time Prognosis Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getReleaseTimePrognosisRequest()
	 * @generated
	 */
	public static final int RELEASE_TIME_PROGNOSIS_REQUEST = 5;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_PROGNOSIS_REQUEST__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_PROGNOSIS_REQUEST__REQUEST_ID = 1;

	/**
	 * The feature id for the '<em><b>Intersection Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_PROGNOSIS_REQUEST__INTERSECTION_ID = 2;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_PROGNOSIS_REQUEST__SCENARIOS = 3;

	/**
	 * The number of structural features of the '<em>Release Time Prognosis Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_PROGNOSIS_REQUEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Release Time Prognosis Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_PROGNOSIS_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.Scenario <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.Scenario
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getScenario()
	 * @generated
	 */
	public static final int SCENARIO = 6;

	/**
	 * The feature id for the '<em><b>Scenario Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SCENARIO__SCENARIO_ID = 0;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SCENARIO__OVERRIDES = 1;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SCENARIO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride <em>Prognosis Override</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getPrognosisOverride()
	 * @generated
	 */
	public static final int PROGNOSIS_OVERRIDE = 7;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_OVERRIDE__VEHICLE = 0;

	/**
	 * The feature id for the '<em><b>Prognosis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_OVERRIDE__PROGNOSIS = 1;

	/**
	 * The number of structural features of the '<em>Prognosis Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_OVERRIDE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Prognosis Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_OVERRIDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse <em>Release Time Prognosis Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getReleaseTimePrognosisResponse()
	 * @generated
	 */
	public static final int RELEASE_TIME_PROGNOSIS_RESPONSE = 8;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_PROGNOSIS_RESPONSE__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Ref Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_PROGNOSIS_RESPONSE__REF_REQUEST_ID = 1;

	/**
	 * The feature id for the '<em><b>Release Times</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_PROGNOSIS_RESPONSE__RELEASE_TIMES = 2;

	/**
	 * The feature id for the '<em><b>Release Times For Scenarios</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_PROGNOSIS_RESPONSE__RELEASE_TIMES_FOR_SCENARIOS = 3;

	/**
	 * The number of structural features of the '<em>Release Time Prognosis Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_PROGNOSIS_RESPONSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Release Time Prognosis Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_PROGNOSIS_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis <em>Scenario Prognosis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getScenarioPrognosis()
	 * @generated
	 */
	public static final int SCENARIO_PROGNOSIS = 9;

	/**
	 * The feature id for the '<em><b>Ref Scenario Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SCENARIO_PROGNOSIS__REF_SCENARIO_ID = 0;

	/**
	 * The feature id for the '<em><b>Release Times</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SCENARIO_PROGNOSIS__RELEASE_TIMES = 1;

	/**
	 * The number of structural features of the '<em>Scenario Prognosis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SCENARIO_PROGNOSIS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scenario Prognosis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SCENARIO_PROGNOSIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector <em>Release Time Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getReleaseTimeVector()
	 * @generated
	 */
	public static final int RELEASE_TIME_VECTOR = 10;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_VECTOR__VALUES = 0;

	/**
	 * The feature id for the '<em><b>Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_VECTOR__SIGNAL_GROUP = 1;

	/**
	 * The number of structural features of the '<em>Release Time Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_VECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Release Time Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_VECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.SignalGroup <em>Signal Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.SignalGroup
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getSignalGroup()
	 * @generated
	 */
	public static final int SIGNAL_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Signal Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIGNAL_GROUP__SIGNAL_GROUP_ID = 0;

	/**
	 * The number of structural features of the '<em>Signal Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIGNAL_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Signal Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SIGNAL_GROUP_OPERATION_COUNT = 0;

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
	private CtlcPackage() {
		super(eNS_URI, CtlcFactory.INSTANCE);
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
		CtlcPackage theCtlcPackage = registeredCtlcPackage instanceof CtlcPackage ? (CtlcPackage)registeredCtlcPackage : new CtlcPackage();

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
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate <em>Periodic Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Update</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate
	 * @generated
	 */
	public EClass getPeriodicUpdate() {
		return periodicUpdateEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate#getTimestamp()
	 * @see #getPeriodicUpdate()
	 * @generated
	 */
	public EAttribute getPeriodicUpdate_Timestamp() {
		return (EAttribute)periodicUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate#getUpdates <em>Updates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Updates</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate#getUpdates()
	 * @see #getPeriodicUpdate()
	 * @generated
	 */
	public EReference getPeriodicUpdate_Updates() {
		return (EReference)periodicUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle <em>Update For Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update For Vehicle</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle
	 * @generated
	 */
	public EClass getUpdateForVehicle() {
		return updateForVehicleEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicle</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getVehicle()
	 * @see #getUpdateForVehicle()
	 * @generated
	 */
	public EReference getUpdateForVehicle_Vehicle() {
		return (EReference)updateForVehicleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getCurrentPosition <em>Current Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getCurrentPosition()
	 * @see #getUpdateForVehicle()
	 * @generated
	 */
	public EReference getUpdateForVehicle_CurrentPosition() {
		return (EReference)updateForVehicleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getCurrentVelocity <em>Current Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Velocity</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getCurrentVelocity()
	 * @see #getUpdateForVehicle()
	 * @generated
	 */
	public EAttribute getUpdateForVehicle_CurrentVelocity() {
		return (EAttribute)updateForVehicleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getArrivals <em>Arrivals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arrivals</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getArrivals()
	 * @see #getUpdateForVehicle()
	 * @generated
	 */
	public EReference getUpdateForVehicle_Arrivals() {
		return (EReference)updateForVehicleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getStopPlaces <em>Stop Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stop Places</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getStopPlaces()
	 * @see #getUpdateForVehicle()
	 * @generated
	 */
	public EReference getUpdateForVehicle_StopPlaces() {
		return (EReference)updateForVehicleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition <em>Prognosis Arrival And Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prognosis Arrival And Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition
	 * @generated
	 */
	public EClass getPrognosisArrivalAndPosition() {
		return prognosisArrivalAndPositionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getEstimatedArrivalTime <em>Estimated Arrival Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Arrival Time</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getEstimatedArrivalTime()
	 * @see #getPrognosisArrivalAndPosition()
	 * @generated
	 */
	public EAttribute getPrognosisArrivalAndPosition_EstimatedArrivalTime() {
		return (EAttribute)prognosisArrivalAndPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getArrivalPosition <em>Arrival Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Arrival Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getArrivalPosition()
	 * @see #getPrognosisArrivalAndPosition()
	 * @generated
	 */
	public EReference getPrognosisArrivalAndPosition_ArrivalPosition() {
		return (EReference)prognosisArrivalAndPositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getPriority()
	 * @see #getPrognosisArrivalAndPosition()
	 * @generated
	 */
	public EAttribute getPrognosisArrivalAndPosition_Priority() {
		return (EAttribute)prognosisArrivalAndPositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace <em>Prognosis Stop Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prognosis Stop Place</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace
	 * @generated
	 */
	public EClass getPrognosisStopPlace() {
		return prognosisStopPlaceEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace#getStopPosition <em>Stop Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stop Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace#getStopPosition()
	 * @see #getPrognosisStopPlace()
	 * @generated
	 */
	public EReference getPrognosisStopPlace_StopPosition() {
		return (EReference)prognosisStopPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace#getPrognosedPlace <em>Prognosed Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prognosed Place</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace#getPrognosedPlace()
	 * @see #getPrognosisStopPlace()
	 * @generated
	 */
	public EAttribute getPrognosisStopPlace_PrognosedPlace() {
		return (EAttribute)prognosisStopPlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.MarkedPosition <em>Marked Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marked Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.MarkedPosition
	 * @generated
	 */
	public EClass getMarkedPosition() {
		return markedPositionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.MarkedPosition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.MarkedPosition#getId()
	 * @see #getMarkedPosition()
	 * @generated
	 */
	public EAttribute getMarkedPosition_Id() {
		return (EAttribute)markedPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.MarkedPosition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.MarkedPosition#getName()
	 * @see #getMarkedPosition()
	 * @generated
	 */
	public EAttribute getMarkedPosition_Name() {
		return (EAttribute)markedPositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest <em>Release Time Prognosis Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release Time Prognosis Request</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest
	 * @generated
	 */
	public EClass getReleaseTimePrognosisRequest() {
		return releaseTimePrognosisRequestEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getTimestamp()
	 * @see #getReleaseTimePrognosisRequest()
	 * @generated
	 */
	public EAttribute getReleaseTimePrognosisRequest_Timestamp() {
		return (EAttribute)releaseTimePrognosisRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getRequestId <em>Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getRequestId()
	 * @see #getReleaseTimePrognosisRequest()
	 * @generated
	 */
	public EAttribute getReleaseTimePrognosisRequest_RequestId() {
		return (EAttribute)releaseTimePrognosisRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getIntersectionId <em>Intersection Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intersection Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getIntersectionId()
	 * @see #getReleaseTimePrognosisRequest()
	 * @generated
	 */
	public EAttribute getReleaseTimePrognosisRequest_IntersectionId() {
		return (EAttribute)releaseTimePrognosisRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenarios</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getScenarios()
	 * @see #getReleaseTimePrognosisRequest()
	 * @generated
	 */
	public EReference getReleaseTimePrognosisRequest_Scenarios() {
		return (EReference)releaseTimePrognosisRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.Scenario
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.Scenario#getScenarioId <em>Scenario Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scenario Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.Scenario#getScenarioId()
	 * @see #getScenario()
	 * @generated
	 */
	public EAttribute getScenario_ScenarioId() {
		return (EAttribute)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.ctlc.Scenario#getOverrides <em>Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Overrides</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.Scenario#getOverrides()
	 * @see #getScenario()
	 * @generated
	 */
	public EReference getScenario_Overrides() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride <em>Prognosis Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prognosis Override</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride
	 * @generated
	 */
	public EClass getPrognosisOverride() {
		return prognosisOverrideEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicle</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride#getVehicle()
	 * @see #getPrognosisOverride()
	 * @generated
	 */
	public EReference getPrognosisOverride_Vehicle() {
		return (EReference)prognosisOverrideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride#getPrognosis <em>Prognosis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prognosis</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride#getPrognosis()
	 * @see #getPrognosisOverride()
	 * @generated
	 */
	public EReference getPrognosisOverride_Prognosis() {
		return (EReference)prognosisOverrideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse <em>Release Time Prognosis Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release Time Prognosis Response</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse
	 * @generated
	 */
	public EClass getReleaseTimePrognosisResponse() {
		return releaseTimePrognosisResponseEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse#getTimestamp()
	 * @see #getReleaseTimePrognosisResponse()
	 * @generated
	 */
	public EAttribute getReleaseTimePrognosisResponse_Timestamp() {
		return (EAttribute)releaseTimePrognosisResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse#getRefRequestId <em>Ref Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Request Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse#getRefRequestId()
	 * @see #getReleaseTimePrognosisResponse()
	 * @generated
	 */
	public EAttribute getReleaseTimePrognosisResponse_RefRequestId() {
		return (EAttribute)releaseTimePrognosisResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse#getReleaseTimes <em>Release Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Release Times</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse#getReleaseTimes()
	 * @see #getReleaseTimePrognosisResponse()
	 * @generated
	 */
	public EReference getReleaseTimePrognosisResponse_ReleaseTimes() {
		return (EReference)releaseTimePrognosisResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse#getReleaseTimesForScenarios <em>Release Times For Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Release Times For Scenarios</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse#getReleaseTimesForScenarios()
	 * @see #getReleaseTimePrognosisResponse()
	 * @generated
	 */
	public EReference getReleaseTimePrognosisResponse_ReleaseTimesForScenarios() {
		return (EReference)releaseTimePrognosisResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis <em>Scenario Prognosis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Prognosis</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis
	 * @generated
	 */
	public EClass getScenarioPrognosis() {
		return scenarioPrognosisEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis#getRefScenarioId <em>Ref Scenario Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Scenario Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis#getRefScenarioId()
	 * @see #getScenarioPrognosis()
	 * @generated
	 */
	public EAttribute getScenarioPrognosis_RefScenarioId() {
		return (EAttribute)scenarioPrognosisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis#getReleaseTimes <em>Release Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Release Times</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis#getReleaseTimes()
	 * @see #getScenarioPrognosis()
	 * @generated
	 */
	public EReference getScenarioPrognosis_ReleaseTimes() {
		return (EReference)scenarioPrognosisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector <em>Release Time Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release Time Vector</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector
	 * @generated
	 */
	public EClass getReleaseTimeVector() {
		return releaseTimeVectorEClass;
	}

	/**
	 * Returns the meta object for the attribute list '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector#getValues()
	 * @see #getReleaseTimeVector()
	 * @generated
	 */
	public EAttribute getReleaseTimeVector_Values() {
		return (EAttribute)releaseTimeVectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector#getSignalGroup <em>Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal Group</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector#getSignalGroup()
	 * @see #getReleaseTimeVector()
	 * @generated
	 */
	public EReference getReleaseTimeVector_SignalGroup() {
		return (EReference)releaseTimeVectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.SignalGroup <em>Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Group</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.SignalGroup
	 * @generated
	 */
	public EClass getSignalGroup() {
		return signalGroupEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.SignalGroup#getSignalGroupId <em>Signal Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Group Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.SignalGroup#getSignalGroupId()
	 * @see #getSignalGroup()
	 * @generated
	 */
	public EAttribute getSignalGroup_SignalGroupId() {
		return (EAttribute)signalGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
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
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate <em>Periodic Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getPeriodicUpdate()
		 * @generated
		 */
		public static final EClass PERIODIC_UPDATE = eINSTANCE.getPeriodicUpdate();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PERIODIC_UPDATE__TIMESTAMP = eINSTANCE.getPeriodicUpdate_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Updates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PERIODIC_UPDATE__UPDATES = eINSTANCE.getPeriodicUpdate_Updates();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle <em>Update For Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getUpdateForVehicle()
		 * @generated
		 */
		public static final EClass UPDATE_FOR_VEHICLE = eINSTANCE.getUpdateForVehicle();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference UPDATE_FOR_VEHICLE__VEHICLE = eINSTANCE.getUpdateForVehicle_Vehicle();

		/**
		 * The meta object literal for the '<em><b>Current Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference UPDATE_FOR_VEHICLE__CURRENT_POSITION = eINSTANCE.getUpdateForVehicle_CurrentPosition();

		/**
		 * The meta object literal for the '<em><b>Current Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute UPDATE_FOR_VEHICLE__CURRENT_VELOCITY = eINSTANCE.getUpdateForVehicle_CurrentVelocity();

		/**
		 * The meta object literal for the '<em><b>Arrivals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference UPDATE_FOR_VEHICLE__ARRIVALS = eINSTANCE.getUpdateForVehicle_Arrivals();

		/**
		 * The meta object literal for the '<em><b>Stop Places</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference UPDATE_FOR_VEHICLE__STOP_PLACES = eINSTANCE.getUpdateForVehicle_StopPlaces();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition <em>Prognosis Arrival And Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getPrognosisArrivalAndPosition()
		 * @generated
		 */
		public static final EClass PROGNOSIS_ARRIVAL_AND_POSITION = eINSTANCE.getPrognosisArrivalAndPosition();

		/**
		 * The meta object literal for the '<em><b>Estimated Arrival Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROGNOSIS_ARRIVAL_AND_POSITION__ESTIMATED_ARRIVAL_TIME = eINSTANCE.getPrognosisArrivalAndPosition_EstimatedArrivalTime();

		/**
		 * The meta object literal for the '<em><b>Arrival Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROGNOSIS_ARRIVAL_AND_POSITION__ARRIVAL_POSITION = eINSTANCE.getPrognosisArrivalAndPosition_ArrivalPosition();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROGNOSIS_ARRIVAL_AND_POSITION__PRIORITY = eINSTANCE.getPrognosisArrivalAndPosition_Priority();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace <em>Prognosis Stop Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getPrognosisStopPlace()
		 * @generated
		 */
		public static final EClass PROGNOSIS_STOP_PLACE = eINSTANCE.getPrognosisStopPlace();

		/**
		 * The meta object literal for the '<em><b>Stop Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROGNOSIS_STOP_PLACE__STOP_POSITION = eINSTANCE.getPrognosisStopPlace_StopPosition();

		/**
		 * The meta object literal for the '<em><b>Prognosed Place</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROGNOSIS_STOP_PLACE__PROGNOSED_PLACE = eINSTANCE.getPrognosisStopPlace_PrognosedPlace();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.MarkedPosition <em>Marked Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.MarkedPosition
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getMarkedPosition()
		 * @generated
		 */
		public static final EClass MARKED_POSITION = eINSTANCE.getMarkedPosition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MARKED_POSITION__ID = eINSTANCE.getMarkedPosition_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute MARKED_POSITION__NAME = eINSTANCE.getMarkedPosition_Name();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest <em>Release Time Prognosis Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getReleaseTimePrognosisRequest()
		 * @generated
		 */
		public static final EClass RELEASE_TIME_PROGNOSIS_REQUEST = eINSTANCE.getReleaseTimePrognosisRequest();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELEASE_TIME_PROGNOSIS_REQUEST__TIMESTAMP = eINSTANCE.getReleaseTimePrognosisRequest_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Request Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELEASE_TIME_PROGNOSIS_REQUEST__REQUEST_ID = eINSTANCE.getReleaseTimePrognosisRequest_RequestId();

		/**
		 * The meta object literal for the '<em><b>Intersection Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELEASE_TIME_PROGNOSIS_REQUEST__INTERSECTION_ID = eINSTANCE.getReleaseTimePrognosisRequest_IntersectionId();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELEASE_TIME_PROGNOSIS_REQUEST__SCENARIOS = eINSTANCE.getReleaseTimePrognosisRequest_Scenarios();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.Scenario <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.Scenario
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getScenario()
		 * @generated
		 */
		public static final EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Scenario Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SCENARIO__SCENARIO_ID = eINSTANCE.getScenario_ScenarioId();

		/**
		 * The meta object literal for the '<em><b>Overrides</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SCENARIO__OVERRIDES = eINSTANCE.getScenario_Overrides();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride <em>Prognosis Override</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getPrognosisOverride()
		 * @generated
		 */
		public static final EClass PROGNOSIS_OVERRIDE = eINSTANCE.getPrognosisOverride();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROGNOSIS_OVERRIDE__VEHICLE = eINSTANCE.getPrognosisOverride_Vehicle();

		/**
		 * The meta object literal for the '<em><b>Prognosis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROGNOSIS_OVERRIDE__PROGNOSIS = eINSTANCE.getPrognosisOverride_Prognosis();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse <em>Release Time Prognosis Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getReleaseTimePrognosisResponse()
		 * @generated
		 */
		public static final EClass RELEASE_TIME_PROGNOSIS_RESPONSE = eINSTANCE.getReleaseTimePrognosisResponse();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELEASE_TIME_PROGNOSIS_RESPONSE__TIMESTAMP = eINSTANCE.getReleaseTimePrognosisResponse_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Ref Request Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELEASE_TIME_PROGNOSIS_RESPONSE__REF_REQUEST_ID = eINSTANCE.getReleaseTimePrognosisResponse_RefRequestId();

		/**
		 * The meta object literal for the '<em><b>Release Times</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELEASE_TIME_PROGNOSIS_RESPONSE__RELEASE_TIMES = eINSTANCE.getReleaseTimePrognosisResponse_ReleaseTimes();

		/**
		 * The meta object literal for the '<em><b>Release Times For Scenarios</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELEASE_TIME_PROGNOSIS_RESPONSE__RELEASE_TIMES_FOR_SCENARIOS = eINSTANCE.getReleaseTimePrognosisResponse_ReleaseTimesForScenarios();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis <em>Scenario Prognosis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getScenarioPrognosis()
		 * @generated
		 */
		public static final EClass SCENARIO_PROGNOSIS = eINSTANCE.getScenarioPrognosis();

		/**
		 * The meta object literal for the '<em><b>Ref Scenario Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SCENARIO_PROGNOSIS__REF_SCENARIO_ID = eINSTANCE.getScenarioPrognosis_RefScenarioId();

		/**
		 * The meta object literal for the '<em><b>Release Times</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SCENARIO_PROGNOSIS__RELEASE_TIMES = eINSTANCE.getScenarioPrognosis_ReleaseTimes();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector <em>Release Time Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getReleaseTimeVector()
		 * @generated
		 */
		public static final EClass RELEASE_TIME_VECTOR = eINSTANCE.getReleaseTimeVector();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELEASE_TIME_VECTOR__VALUES = eINSTANCE.getReleaseTimeVector_Values();

		/**
		 * The meta object literal for the '<em><b>Signal Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELEASE_TIME_VECTOR__SIGNAL_GROUP = eINSTANCE.getReleaseTimeVector_SignalGroup();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.SignalGroup <em>Signal Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.SignalGroup
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getSignalGroup()
		 * @generated
		 */
		public static final EClass SIGNAL_GROUP = eINSTANCE.getSignalGroup();

		/**
		 * The meta object literal for the '<em><b>Signal Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SIGNAL_GROUP__SIGNAL_GROUP_ID = eINSTANCE.getSignalGroup_SignalGroupId();

	}

} //CtlcPackage
