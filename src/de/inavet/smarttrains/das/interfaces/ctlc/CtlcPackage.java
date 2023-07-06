/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

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
 * <!-- begin-model-doc -->
 * cTLC - Cooperative Traffic Light Control (Kooperative Lichtsignalanlage)
 * <!-- end-model-doc -->
 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcFactory
 * @model kind="package"
 * @generated
 */
public interface CtlcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ctlc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://inavet.de/datamodels/ctlc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ctlc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CtlcPackage eINSTANCE = de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.PeriodicUpdateImpl <em>Periodic Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.PeriodicUpdateImpl
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getPeriodicUpdate()
	 * @generated
	 */
	int PERIODIC_UPDATE = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_UPDATE__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Updates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_UPDATE__UPDATES = 1;

	/**
	 * The number of structural features of the '<em>Periodic Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_UPDATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Periodic Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_UPDATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.UpdateForVehicleImpl <em>Update For Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.UpdateForVehicleImpl
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getUpdateForVehicle()
	 * @generated
	 */
	int UPDATE_FOR_VEHICLE = 1;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FOR_VEHICLE__VEHICLE = 0;

	/**
	 * The feature id for the '<em><b>Current Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FOR_VEHICLE__CURRENT_POSITION = 1;

	/**
	 * The feature id for the '<em><b>Current Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FOR_VEHICLE__CURRENT_VELOCITY = 2;

	/**
	 * The feature id for the '<em><b>Arrivals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FOR_VEHICLE__ARRIVALS = 3;

	/**
	 * The feature id for the '<em><b>Stop Places</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FOR_VEHICLE__STOP_PLACES = 4;

	/**
	 * The number of structural features of the '<em>Update For Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FOR_VEHICLE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Update For Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FOR_VEHICLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.PrognosisArrivalAndPositionImpl <em>Prognosis Arrival And Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.PrognosisArrivalAndPositionImpl
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getPrognosisArrivalAndPosition()
	 * @generated
	 */
	int PROGNOSIS_ARRIVAL_AND_POSITION = 2;

	/**
	 * The feature id for the '<em><b>Estimated Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_ARRIVAL_AND_POSITION__ESTIMATED_ARRIVAL_TIME = 0;

	/**
	 * The feature id for the '<em><b>Arrival Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_ARRIVAL_AND_POSITION__ARRIVAL_POSITION = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_ARRIVAL_AND_POSITION__PRIORITY = 2;

	/**
	 * The number of structural features of the '<em>Prognosis Arrival And Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_ARRIVAL_AND_POSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Prognosis Arrival And Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_ARRIVAL_AND_POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.PrognosisStopPlaceImpl <em>Prognosis Stop Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.PrognosisStopPlaceImpl
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getPrognosisStopPlace()
	 * @generated
	 */
	int PROGNOSIS_STOP_PLACE = 3;

	/**
	 * The feature id for the '<em><b>Stop Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_STOP_PLACE__STOP_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Prognosed Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_STOP_PLACE__PROGNOSED_PLACE = 1;

	/**
	 * The number of structural features of the '<em>Prognosis Stop Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_STOP_PLACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Prognosis Stop Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_STOP_PLACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.MarkedPositionImpl <em>Marked Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.MarkedPositionImpl
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getMarkedPosition()
	 * @generated
	 */
	int MARKED_POSITION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_POSITION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_POSITION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Marked Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_POSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Marked Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKED_POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.ReleaseTimePrognosisRequestImpl <em>Release Time Prognosis Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.ReleaseTimePrognosisRequestImpl
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getReleaseTimePrognosisRequest()
	 * @generated
	 */
	int RELEASE_TIME_PROGNOSIS_REQUEST = 5;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_TIME_PROGNOSIS_REQUEST__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_TIME_PROGNOSIS_REQUEST__REQUEST_ID = 1;

	/**
	 * The feature id for the '<em><b>Intersection Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_TIME_PROGNOSIS_REQUEST__INTERSECTION_ID = 2;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_TIME_PROGNOSIS_REQUEST__SCENARIOS = 3;

	/**
	 * The number of structural features of the '<em>Release Time Prognosis Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_TIME_PROGNOSIS_REQUEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Release Time Prognosis Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_TIME_PROGNOSIS_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.ScenarioImpl
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 6;

	/**
	 * The feature id for the '<em><b>Scenario Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SCENARIO_ID = 0;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__OVERRIDES = 1;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.PrognosisOverrideImpl <em>Prognosis Override</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.PrognosisOverrideImpl
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getPrognosisOverride()
	 * @generated
	 */
	int PROGNOSIS_OVERRIDE = 7;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_OVERRIDE__VEHICLE = 0;

	/**
	 * The feature id for the '<em><b>Prognosis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_OVERRIDE__PROGNOSIS = 1;

	/**
	 * The number of structural features of the '<em>Prognosis Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_OVERRIDE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Prognosis Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_OVERRIDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.ReleaseTimePrognosisResponseImpl <em>Release Time Prognosis Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.ReleaseTimePrognosisResponseImpl
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getReleaseTimePrognosisResponse()
	 * @generated
	 */
	int RELEASE_TIME_PROGNOSIS_RESPONSE = 8;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_TIME_PROGNOSIS_RESPONSE__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Ref Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_TIME_PROGNOSIS_RESPONSE__REF_REQUEST_ID = 1;

	/**
	 * The feature id for the '<em><b>Release Times</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_TIME_PROGNOSIS_RESPONSE__RELEASE_TIMES = 2;

	/**
	 * The feature id for the '<em><b>Release Times For Scenarios</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_TIME_PROGNOSIS_RESPONSE__RELEASE_TIMES_FOR_SCENARIOS = 3;

	/**
	 * The number of structural features of the '<em>Release Time Prognosis Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_TIME_PROGNOSIS_RESPONSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Release Time Prognosis Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_TIME_PROGNOSIS_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.ScenarioPrognosisImpl <em>Scenario Prognosis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.ScenarioPrognosisImpl
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getScenarioPrognosis()
	 * @generated
	 */
	int SCENARIO_PROGNOSIS = 9;

	/**
	 * The feature id for the '<em><b>Ref Scenario Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PROGNOSIS__REF_SCENARIO_ID = 0;

	/**
	 * The feature id for the '<em><b>Release Times</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PROGNOSIS__RELEASE_TIMES = 1;

	/**
	 * The number of structural features of the '<em>Scenario Prognosis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PROGNOSIS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scenario Prognosis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_PROGNOSIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.ReleaseTimeVectorImpl <em>Release Time Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.ReleaseTimeVectorImpl
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getReleaseTimeVector()
	 * @generated
	 */
	int RELEASE_TIME_VECTOR = 10;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_TIME_VECTOR__VALUES = 0;

	/**
	 * The feature id for the '<em><b>Signal Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_TIME_VECTOR__SIGNAL_GROUP = 1;

	/**
	 * The number of structural features of the '<em>Release Time Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_TIME_VECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Release Time Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_TIME_VECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.SignalGroupImpl <em>Signal Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.SignalGroupImpl
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getSignalGroup()
	 * @generated
	 */
	int SIGNAL_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Signal Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP__SIGNAL_GROUP_ID = 0;

	/**
	 * The number of structural features of the '<em>Signal Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Signal Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_GROUP_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate <em>Periodic Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Update</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate
	 * @generated
	 */
	EClass getPeriodicUpdate();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate#getTimestamp()
	 * @see #getPeriodicUpdate()
	 * @generated
	 */
	EAttribute getPeriodicUpdate_Timestamp();

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate#getUpdates <em>Updates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Updates</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate#getUpdates()
	 * @see #getPeriodicUpdate()
	 * @generated
	 */
	EReference getPeriodicUpdate_Updates();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle <em>Update For Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update For Vehicle</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle
	 * @generated
	 */
	EClass getUpdateForVehicle();

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicle</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getVehicle()
	 * @see #getUpdateForVehicle()
	 * @generated
	 */
	EReference getUpdateForVehicle_Vehicle();

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getCurrentPosition <em>Current Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getCurrentPosition()
	 * @see #getUpdateForVehicle()
	 * @generated
	 */
	EReference getUpdateForVehicle_CurrentPosition();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getCurrentVelocity <em>Current Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Velocity</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getCurrentVelocity()
	 * @see #getUpdateForVehicle()
	 * @generated
	 */
	EAttribute getUpdateForVehicle_CurrentVelocity();

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getArrivals <em>Arrivals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arrivals</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getArrivals()
	 * @see #getUpdateForVehicle()
	 * @generated
	 */
	EReference getUpdateForVehicle_Arrivals();

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getStopPlaces <em>Stop Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stop Places</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle#getStopPlaces()
	 * @see #getUpdateForVehicle()
	 * @generated
	 */
	EReference getUpdateForVehicle_StopPlaces();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition <em>Prognosis Arrival And Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prognosis Arrival And Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition
	 * @generated
	 */
	EClass getPrognosisArrivalAndPosition();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getEstimatedArrivalTime <em>Estimated Arrival Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Arrival Time</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getEstimatedArrivalTime()
	 * @see #getPrognosisArrivalAndPosition()
	 * @generated
	 */
	EAttribute getPrognosisArrivalAndPosition_EstimatedArrivalTime();

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getArrivalPosition <em>Arrival Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Arrival Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getArrivalPosition()
	 * @see #getPrognosisArrivalAndPosition()
	 * @generated
	 */
	EReference getPrognosisArrivalAndPosition_ArrivalPosition();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getPriority()
	 * @see #getPrognosisArrivalAndPosition()
	 * @generated
	 */
	EAttribute getPrognosisArrivalAndPosition_Priority();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace <em>Prognosis Stop Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prognosis Stop Place</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace
	 * @generated
	 */
	EClass getPrognosisStopPlace();

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace#getStopPosition <em>Stop Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stop Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace#getStopPosition()
	 * @see #getPrognosisStopPlace()
	 * @generated
	 */
	EReference getPrognosisStopPlace_StopPosition();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace#getPrognosedPlace <em>Prognosed Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prognosed Place</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace#getPrognosedPlace()
	 * @see #getPrognosisStopPlace()
	 * @generated
	 */
	EAttribute getPrognosisStopPlace_PrognosedPlace();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.MarkedPosition <em>Marked Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marked Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.MarkedPosition
	 * @generated
	 */
	EClass getMarkedPosition();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.MarkedPosition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.MarkedPosition#getId()
	 * @see #getMarkedPosition()
	 * @generated
	 */
	EAttribute getMarkedPosition_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.MarkedPosition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.MarkedPosition#getName()
	 * @see #getMarkedPosition()
	 * @generated
	 */
	EAttribute getMarkedPosition_Name();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest <em>Release Time Prognosis Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release Time Prognosis Request</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest
	 * @generated
	 */
	EClass getReleaseTimePrognosisRequest();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getTimestamp()
	 * @see #getReleaseTimePrognosisRequest()
	 * @generated
	 */
	EAttribute getReleaseTimePrognosisRequest_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getRequestId <em>Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getRequestId()
	 * @see #getReleaseTimePrognosisRequest()
	 * @generated
	 */
	EAttribute getReleaseTimePrognosisRequest_RequestId();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getIntersectionId <em>Intersection Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intersection Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getIntersectionId()
	 * @see #getReleaseTimePrognosisRequest()
	 * @generated
	 */
	EAttribute getReleaseTimePrognosisRequest_IntersectionId();

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenarios</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getScenarios()
	 * @see #getReleaseTimePrognosisRequest()
	 * @generated
	 */
	EReference getReleaseTimePrognosisRequest_Scenarios();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.Scenario#getScenarioId <em>Scenario Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scenario Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.Scenario#getScenarioId()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_ScenarioId();

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.ctlc.Scenario#getOverrides <em>Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Overrides</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.Scenario#getOverrides()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Overrides();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride <em>Prognosis Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prognosis Override</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride
	 * @generated
	 */
	EClass getPrognosisOverride();

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicle</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride#getVehicle()
	 * @see #getPrognosisOverride()
	 * @generated
	 */
	EReference getPrognosisOverride_Vehicle();

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride#getPrognosis <em>Prognosis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prognosis</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride#getPrognosis()
	 * @see #getPrognosisOverride()
	 * @generated
	 */
	EReference getPrognosisOverride_Prognosis();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse <em>Release Time Prognosis Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release Time Prognosis Response</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse
	 * @generated
	 */
	EClass getReleaseTimePrognosisResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse#getTimestamp()
	 * @see #getReleaseTimePrognosisResponse()
	 * @generated
	 */
	EAttribute getReleaseTimePrognosisResponse_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse#getRefRequestId <em>Ref Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Request Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse#getRefRequestId()
	 * @see #getReleaseTimePrognosisResponse()
	 * @generated
	 */
	EAttribute getReleaseTimePrognosisResponse_RefRequestId();

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse#getReleaseTimes <em>Release Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Release Times</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse#getReleaseTimes()
	 * @see #getReleaseTimePrognosisResponse()
	 * @generated
	 */
	EReference getReleaseTimePrognosisResponse_ReleaseTimes();

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse#getReleaseTimesForScenarios <em>Release Times For Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Release Times For Scenarios</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse#getReleaseTimesForScenarios()
	 * @see #getReleaseTimePrognosisResponse()
	 * @generated
	 */
	EReference getReleaseTimePrognosisResponse_ReleaseTimesForScenarios();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis <em>Scenario Prognosis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Prognosis</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis
	 * @generated
	 */
	EClass getScenarioPrognosis();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis#getRefScenarioId <em>Ref Scenario Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Scenario Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis#getRefScenarioId()
	 * @see #getScenarioPrognosis()
	 * @generated
	 */
	EAttribute getScenarioPrognosis_RefScenarioId();

	/**
	 * Returns the meta object for the reference list '{@link de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis#getReleaseTimes <em>Release Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Release Times</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis#getReleaseTimes()
	 * @see #getScenarioPrognosis()
	 * @generated
	 */
	EReference getScenarioPrognosis_ReleaseTimes();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector <em>Release Time Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release Time Vector</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector
	 * @generated
	 */
	EClass getReleaseTimeVector();

	/**
	 * Returns the meta object for the attribute list '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector#getValues()
	 * @see #getReleaseTimeVector()
	 * @generated
	 */
	EAttribute getReleaseTimeVector_Values();

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector#getSignalGroup <em>Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal Group</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector#getSignalGroup()
	 * @see #getReleaseTimeVector()
	 * @generated
	 */
	EReference getReleaseTimeVector_SignalGroup();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.ctlc.SignalGroup <em>Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Group</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.SignalGroup
	 * @generated
	 */
	EClass getSignalGroup();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.ctlc.SignalGroup#getSignalGroupId <em>Signal Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Group Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.SignalGroup#getSignalGroupId()
	 * @see #getSignalGroup()
	 * @generated
	 */
	EAttribute getSignalGroup_SignalGroupId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CtlcFactory getCtlcFactory();

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
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.PeriodicUpdateImpl <em>Periodic Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.PeriodicUpdateImpl
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getPeriodicUpdate()
		 * @generated
		 */
		EClass PERIODIC_UPDATE = eINSTANCE.getPeriodicUpdate();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_UPDATE__TIMESTAMP = eINSTANCE.getPeriodicUpdate_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Updates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC_UPDATE__UPDATES = eINSTANCE.getPeriodicUpdate_Updates();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.UpdateForVehicleImpl <em>Update For Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.UpdateForVehicleImpl
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getUpdateForVehicle()
		 * @generated
		 */
		EClass UPDATE_FOR_VEHICLE = eINSTANCE.getUpdateForVehicle();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_FOR_VEHICLE__VEHICLE = eINSTANCE.getUpdateForVehicle_Vehicle();

		/**
		 * The meta object literal for the '<em><b>Current Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_FOR_VEHICLE__CURRENT_POSITION = eINSTANCE.getUpdateForVehicle_CurrentPosition();

		/**
		 * The meta object literal for the '<em><b>Current Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_FOR_VEHICLE__CURRENT_VELOCITY = eINSTANCE.getUpdateForVehicle_CurrentVelocity();

		/**
		 * The meta object literal for the '<em><b>Arrivals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_FOR_VEHICLE__ARRIVALS = eINSTANCE.getUpdateForVehicle_Arrivals();

		/**
		 * The meta object literal for the '<em><b>Stop Places</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_FOR_VEHICLE__STOP_PLACES = eINSTANCE.getUpdateForVehicle_StopPlaces();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.PrognosisArrivalAndPositionImpl <em>Prognosis Arrival And Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.PrognosisArrivalAndPositionImpl
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getPrognosisArrivalAndPosition()
		 * @generated
		 */
		EClass PROGNOSIS_ARRIVAL_AND_POSITION = eINSTANCE.getPrognosisArrivalAndPosition();

		/**
		 * The meta object literal for the '<em><b>Estimated Arrival Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGNOSIS_ARRIVAL_AND_POSITION__ESTIMATED_ARRIVAL_TIME = eINSTANCE.getPrognosisArrivalAndPosition_EstimatedArrivalTime();

		/**
		 * The meta object literal for the '<em><b>Arrival Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGNOSIS_ARRIVAL_AND_POSITION__ARRIVAL_POSITION = eINSTANCE.getPrognosisArrivalAndPosition_ArrivalPosition();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGNOSIS_ARRIVAL_AND_POSITION__PRIORITY = eINSTANCE.getPrognosisArrivalAndPosition_Priority();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.PrognosisStopPlaceImpl <em>Prognosis Stop Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.PrognosisStopPlaceImpl
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getPrognosisStopPlace()
		 * @generated
		 */
		EClass PROGNOSIS_STOP_PLACE = eINSTANCE.getPrognosisStopPlace();

		/**
		 * The meta object literal for the '<em><b>Stop Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGNOSIS_STOP_PLACE__STOP_POSITION = eINSTANCE.getPrognosisStopPlace_StopPosition();

		/**
		 * The meta object literal for the '<em><b>Prognosed Place</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGNOSIS_STOP_PLACE__PROGNOSED_PLACE = eINSTANCE.getPrognosisStopPlace_PrognosedPlace();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.MarkedPositionImpl <em>Marked Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.MarkedPositionImpl
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getMarkedPosition()
		 * @generated
		 */
		EClass MARKED_POSITION = eINSTANCE.getMarkedPosition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKED_POSITION__ID = eINSTANCE.getMarkedPosition_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKED_POSITION__NAME = eINSTANCE.getMarkedPosition_Name();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.ReleaseTimePrognosisRequestImpl <em>Release Time Prognosis Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.ReleaseTimePrognosisRequestImpl
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getReleaseTimePrognosisRequest()
		 * @generated
		 */
		EClass RELEASE_TIME_PROGNOSIS_REQUEST = eINSTANCE.getReleaseTimePrognosisRequest();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE_TIME_PROGNOSIS_REQUEST__TIMESTAMP = eINSTANCE.getReleaseTimePrognosisRequest_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Request Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE_TIME_PROGNOSIS_REQUEST__REQUEST_ID = eINSTANCE.getReleaseTimePrognosisRequest_RequestId();

		/**
		 * The meta object literal for the '<em><b>Intersection Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE_TIME_PROGNOSIS_REQUEST__INTERSECTION_ID = eINSTANCE.getReleaseTimePrognosisRequest_IntersectionId();

		/**
		 * The meta object literal for the '<em><b>Scenarios</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE_TIME_PROGNOSIS_REQUEST__SCENARIOS = eINSTANCE.getReleaseTimePrognosisRequest_Scenarios();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.ScenarioImpl
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Scenario Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__SCENARIO_ID = eINSTANCE.getScenario_ScenarioId();

		/**
		 * The meta object literal for the '<em><b>Overrides</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__OVERRIDES = eINSTANCE.getScenario_Overrides();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.PrognosisOverrideImpl <em>Prognosis Override</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.PrognosisOverrideImpl
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getPrognosisOverride()
		 * @generated
		 */
		EClass PROGNOSIS_OVERRIDE = eINSTANCE.getPrognosisOverride();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGNOSIS_OVERRIDE__VEHICLE = eINSTANCE.getPrognosisOverride_Vehicle();

		/**
		 * The meta object literal for the '<em><b>Prognosis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGNOSIS_OVERRIDE__PROGNOSIS = eINSTANCE.getPrognosisOverride_Prognosis();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.ReleaseTimePrognosisResponseImpl <em>Release Time Prognosis Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.ReleaseTimePrognosisResponseImpl
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getReleaseTimePrognosisResponse()
		 * @generated
		 */
		EClass RELEASE_TIME_PROGNOSIS_RESPONSE = eINSTANCE.getReleaseTimePrognosisResponse();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE_TIME_PROGNOSIS_RESPONSE__TIMESTAMP = eINSTANCE.getReleaseTimePrognosisResponse_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Ref Request Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE_TIME_PROGNOSIS_RESPONSE__REF_REQUEST_ID = eINSTANCE.getReleaseTimePrognosisResponse_RefRequestId();

		/**
		 * The meta object literal for the '<em><b>Release Times</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE_TIME_PROGNOSIS_RESPONSE__RELEASE_TIMES = eINSTANCE.getReleaseTimePrognosisResponse_ReleaseTimes();

		/**
		 * The meta object literal for the '<em><b>Release Times For Scenarios</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE_TIME_PROGNOSIS_RESPONSE__RELEASE_TIMES_FOR_SCENARIOS = eINSTANCE.getReleaseTimePrognosisResponse_ReleaseTimesForScenarios();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.ScenarioPrognosisImpl <em>Scenario Prognosis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.ScenarioPrognosisImpl
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getScenarioPrognosis()
		 * @generated
		 */
		EClass SCENARIO_PROGNOSIS = eINSTANCE.getScenarioPrognosis();

		/**
		 * The meta object literal for the '<em><b>Ref Scenario Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_PROGNOSIS__REF_SCENARIO_ID = eINSTANCE.getScenarioPrognosis_RefScenarioId();

		/**
		 * The meta object literal for the '<em><b>Release Times</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_PROGNOSIS__RELEASE_TIMES = eINSTANCE.getScenarioPrognosis_ReleaseTimes();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.ReleaseTimeVectorImpl <em>Release Time Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.ReleaseTimeVectorImpl
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getReleaseTimeVector()
		 * @generated
		 */
		EClass RELEASE_TIME_VECTOR = eINSTANCE.getReleaseTimeVector();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE_TIME_VECTOR__VALUES = eINSTANCE.getReleaseTimeVector_Values();

		/**
		 * The meta object literal for the '<em><b>Signal Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE_TIME_VECTOR__SIGNAL_GROUP = eINSTANCE.getReleaseTimeVector_SignalGroup();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.SignalGroupImpl <em>Signal Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.SignalGroupImpl
		 * @see de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcPackageImpl#getSignalGroup()
		 * @generated
		 */
		EClass SIGNAL_GROUP = eINSTANCE.getSignalGroup();

		/**
		 * The meta object literal for the '<em><b>Signal Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_GROUP__SIGNAL_GROUP_ID = eINSTANCE.getSignalGroup_SignalGroupId();

	}

} //CtlcPackage
