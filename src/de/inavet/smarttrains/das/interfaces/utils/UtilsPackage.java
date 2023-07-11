/**
 */
package de.inavet.smarttrains.das.interfaces.utils;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * enthält Hilfsklassen + Enums
 * <!-- end-model-doc -->
 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface UtilsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "utils";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://inavet.de/datamodels/utils/v1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "utils";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilsPackage eINSTANCE = de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.utils.impl.JourneyImpl <em>Journey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.utils.impl.JourneyImpl
	 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getJourney()
	 * @generated
	 */
	int JOURNEY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__ID = 0;

	/**
	 * The feature id for the '<em><b>Journey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__JOURNEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__LINE = 2;

	/**
	 * The feature id for the '<em><b>Course</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__COURSE = 3;

	/**
	 * The feature id for the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__ROUTE = 4;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__TIMESTAMP = 5;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY__VEHICLE = 6;

	/**
	 * The number of structural features of the '<em>Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Journey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.utils.impl.JourneyResponseFromDatabrokerImpl <em>Journey Response From Databroker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.utils.impl.JourneyResponseFromDatabrokerImpl
	 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getJourneyResponseFromDatabroker()
	 * @generated
	 */
	int JOURNEY_RESPONSE_FROM_DATABROKER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_RESPONSE_FROM_DATABROKER__ID = 0;

	/**
	 * The feature id for the '<em><b>Id Of Journey To Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_RESPONSE_FROM_DATABROKER__ID_OF_JOURNEY_TO_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Journey Succesful Initialised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_RESPONSE_FROM_DATABROKER__JOURNEY_SUCCESFUL_INITIALISED = 2;

	/**
	 * The number of structural features of the '<em>Journey Response From Databroker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_RESPONSE_FROM_DATABROKER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Journey Response From Databroker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOURNEY_RESPONSE_FROM_DATABROKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.utils.impl.GNSSImpl <em>GNSS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.utils.impl.GNSSImpl
	 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getGNSS()
	 * @generated
	 */
	int GNSS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS__ID = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Nmeastring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS__NMEASTRING = 3;

	/**
	 * The feature id for the '<em><b>Journey</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS__JOURNEY = 4;

	/**
	 * The number of structural features of the '<em>GNSS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GNSS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GNSS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.utils.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.utils.impl.PositionImpl
	 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 3;

	/**
	 * The feature id for the '<em><b>Position On Track</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__POSITION_ON_TRACK = 0;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__LAT = 1;

	/**
	 * The feature id for the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__LON = 2;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.utils.impl.PositionOnTrackImpl <em>Position On Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.utils.impl.PositionOnTrackImpl
	 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getPositionOnTrack()
	 * @generated
	 */
	int POSITION_ON_TRACK = 4;

	/**
	 * The feature id for the '<em><b>Track Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_ON_TRACK__TRACK_ID = 0;

	/**
	 * The feature id for the '<em><b>Relative Position On Track</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_ON_TRACK__RELATIVE_POSITION_ON_TRACK = 1;

	/**
	 * The number of structural features of the '<em>Position On Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_ON_TRACK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Position On Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_ON_TRACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.utils.impl.ValueItemImpl <em>Value Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.utils.impl.ValueItemImpl
	 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getValueItem()
	 * @generated
	 */
	int VALUE_ITEM = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ITEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ITEM__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ITEM__VALUE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Value Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ITEM__VALUE_UNIT = 3;

	/**
	 * The number of structural features of the '<em>Value Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ITEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Value Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.utils.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.utils.impl.VehicleImpl
	 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Vehicle Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__VEHICLE_ID = 1;

	/**
	 * The feature id for the '<em><b>Vehicle Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__VEHICLE_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.utils.NMEAType <em>NMEA Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.utils.NMEAType
	 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getNMEAType()
	 * @generated
	 */
	int NMEA_TYPE = 7;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.utils.GNSSStatus <em>GNSS Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.utils.GNSSStatus
	 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getGNSSStatus()
	 * @generated
	 */
	int GNSS_STATUS = 8;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.utils.DASStatus <em>DAS Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.utils.DASStatus
	 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getDASStatus()
	 * @generated
	 */
	int DAS_STATUS = 9;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.utils.RecommendationTypes <em>Recommendation Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.utils.RecommendationTypes
	 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getRecommendationTypes()
	 * @generated
	 */
	int RECOMMENDATION_TYPES = 10;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.utils.Units <em>Units</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.utils.Units
	 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getUnits()
	 * @generated
	 */
	int UNITS = 11;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.utils.VehicleType <em>Vehicle Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.utils.VehicleType
	 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getVehicleType()
	 * @generated
	 */
	int VEHICLE_TYPE = 12;

	/**
	 * The meta object id for the '<em>Zoned Date Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.ZonedDateTime
	 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getZonedDateTime()
	 * @generated
	 */
	int ZONED_DATE_TIME = 13;


	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.utils.Journey <em>Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journey</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Journey
	 * @generated
	 */
	EClass getJourney();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.Journey#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Journey#getId()
	 * @see #getJourney()
	 * @generated
	 */
	EAttribute getJourney_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.Journey#getJourneyId <em>Journey Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Journey#getJourneyId()
	 * @see #getJourney()
	 * @generated
	 */
	EAttribute getJourney_JourneyId();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.Journey#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Journey#getLine()
	 * @see #getJourney()
	 * @generated
	 */
	EAttribute getJourney_Line();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.Journey#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Journey#getCourse()
	 * @see #getJourney()
	 * @generated
	 */
	EAttribute getJourney_Course();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.Journey#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Journey#getRoute()
	 * @see #getJourney()
	 * @generated
	 */
	EAttribute getJourney_Route();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.Journey#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Journey#getTimestamp()
	 * @see #getJourney()
	 * @generated
	 */
	EAttribute getJourney_Timestamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.inavet.smarttrains.das.interfaces.utils.Journey#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vehicle</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Journey#getVehicle()
	 * @see #getJourney()
	 * @generated
	 */
	EReference getJourney_Vehicle();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.utils.JourneyResponseFromDatabroker <em>Journey Response From Databroker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Journey Response From Databroker</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.JourneyResponseFromDatabroker
	 * @generated
	 */
	EClass getJourneyResponseFromDatabroker();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.JourneyResponseFromDatabroker#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.JourneyResponseFromDatabroker#getId()
	 * @see #getJourneyResponseFromDatabroker()
	 * @generated
	 */
	EAttribute getJourneyResponseFromDatabroker_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.JourneyResponseFromDatabroker#getIdOfJourneyToResponse <em>Id Of Journey To Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Of Journey To Response</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.JourneyResponseFromDatabroker#getIdOfJourneyToResponse()
	 * @see #getJourneyResponseFromDatabroker()
	 * @generated
	 */
	EAttribute getJourneyResponseFromDatabroker_IdOfJourneyToResponse();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.JourneyResponseFromDatabroker#isJourneySuccesfulInitialised <em>Journey Succesful Initialised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Journey Succesful Initialised</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.JourneyResponseFromDatabroker#isJourneySuccesfulInitialised()
	 * @see #getJourneyResponseFromDatabroker()
	 * @generated
	 */
	EAttribute getJourneyResponseFromDatabroker_JourneySuccesfulInitialised();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.utils.GNSS <em>GNSS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GNSS</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.GNSS
	 * @generated
	 */
	EClass getGNSS();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.GNSS#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.GNSS#getId()
	 * @see #getGNSS()
	 * @generated
	 */
	EAttribute getGNSS_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.GNSS#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.GNSS#getTimestamp()
	 * @see #getGNSS()
	 * @generated
	 */
	EAttribute getGNSS_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.GNSS#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.GNSS#getType()
	 * @see #getGNSS()
	 * @generated
	 */
	EAttribute getGNSS_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.GNSS#getNmeastring <em>Nmeastring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nmeastring</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.GNSS#getNmeastring()
	 * @see #getGNSS()
	 * @generated
	 */
	EAttribute getGNSS_Nmeastring();

	/**
	 * Returns the meta object for the containment reference '{@link de.inavet.smarttrains.das.interfaces.utils.GNSS#getJourney <em>Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Journey</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.GNSS#getJourney()
	 * @see #getGNSS()
	 * @generated
	 */
	EReference getGNSS_Journey();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.utils.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the containment reference '{@link de.inavet.smarttrains.das.interfaces.utils.Position#getPositionOnTrack <em>Position On Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position On Track</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Position#getPositionOnTrack()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_PositionOnTrack();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.Position#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Position#getLat()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Lat();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.Position#getLon <em>Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lon</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Position#getLon()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Lon();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack <em>Position On Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position On Track</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack
	 * @generated
	 */
	EClass getPositionOnTrack();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack#getTrackId <em>Track Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack#getTrackId()
	 * @see #getPositionOnTrack()
	 * @generated
	 */
	EAttribute getPositionOnTrack_TrackId();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack#getRelativePositionOnTrack <em>Relative Position On Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Position On Track</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack#getRelativePositionOnTrack()
	 * @see #getPositionOnTrack()
	 * @generated
	 */
	EAttribute getPositionOnTrack_RelativePositionOnTrack();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.utils.ValueItem <em>Value Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Item</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.ValueItem
	 * @generated
	 */
	EClass getValueItem();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.ValueItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.ValueItem#getId()
	 * @see #getValueItem()
	 * @generated
	 */
	EAttribute getValueItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.ValueItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.ValueItem#getValue()
	 * @see #getValueItem()
	 * @generated
	 */
	EAttribute getValueItem_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.ValueItem#getValueName <em>Value Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Name</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.ValueItem#getValueName()
	 * @see #getValueItem()
	 * @generated
	 */
	EAttribute getValueItem_ValueName();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.ValueItem#getValueUnit <em>Value Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Unit</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.ValueItem#getValueUnit()
	 * @see #getValueItem()
	 * @generated
	 */
	EAttribute getValueItem_ValueUnit();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.utils.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.Vehicle#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Vehicle#getId()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.Vehicle#getVehicleId <em>Vehicle Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Vehicle#getVehicleId()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_VehicleId();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.Vehicle#getVehicleType <em>Vehicle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Type</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Vehicle#getVehicleType()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_VehicleType();

	/**
	 * Returns the meta object for enum '{@link de.inavet.smarttrains.das.interfaces.utils.NMEAType <em>NMEA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>NMEA Type</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.NMEAType
	 * @generated
	 */
	EEnum getNMEAType();

	/**
	 * Returns the meta object for enum '{@link de.inavet.smarttrains.das.interfaces.utils.GNSSStatus <em>GNSS Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GNSS Status</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.GNSSStatus
	 * @generated
	 */
	EEnum getGNSSStatus();

	/**
	 * Returns the meta object for enum '{@link de.inavet.smarttrains.das.interfaces.utils.DASStatus <em>DAS Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DAS Status</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.DASStatus
	 * @generated
	 */
	EEnum getDASStatus();

	/**
	 * Returns the meta object for enum '{@link de.inavet.smarttrains.das.interfaces.utils.RecommendationTypes <em>Recommendation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Recommendation Types</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.RecommendationTypes
	 * @generated
	 */
	EEnum getRecommendationTypes();

	/**
	 * Returns the meta object for enum '{@link de.inavet.smarttrains.das.interfaces.utils.Units <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Units</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Units
	 * @generated
	 */
	EEnum getUnits();

	/**
	 * Returns the meta object for enum '{@link de.inavet.smarttrains.das.interfaces.utils.VehicleType <em>Vehicle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vehicle Type</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.VehicleType
	 * @generated
	 */
	EEnum getVehicleType();

	/**
	 * Returns the meta object for data type '{@link java.time.ZonedDateTime <em>Zoned Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zeitklasse
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Zoned Date Time</em>'.
	 * @see java.time.ZonedDateTime
	 * @model instanceClass="java.time.ZonedDateTime"
	 * @generated
	 */
	EDataType getZonedDateTime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UtilsFactory getUtilsFactory();

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
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.utils.impl.JourneyImpl <em>Journey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.utils.impl.JourneyImpl
		 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getJourney()
		 * @generated
		 */
		EClass JOURNEY = eINSTANCE.getJourney();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY__ID = eINSTANCE.getJourney_Id();

		/**
		 * The meta object literal for the '<em><b>Journey Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY__JOURNEY_ID = eINSTANCE.getJourney_JourneyId();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY__LINE = eINSTANCE.getJourney_Line();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY__COURSE = eINSTANCE.getJourney_Course();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY__ROUTE = eINSTANCE.getJourney_Route();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY__TIMESTAMP = eINSTANCE.getJourney_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOURNEY__VEHICLE = eINSTANCE.getJourney_Vehicle();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.utils.impl.JourneyResponseFromDatabrokerImpl <em>Journey Response From Databroker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.utils.impl.JourneyResponseFromDatabrokerImpl
		 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getJourneyResponseFromDatabroker()
		 * @generated
		 */
		EClass JOURNEY_RESPONSE_FROM_DATABROKER = eINSTANCE.getJourneyResponseFromDatabroker();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY_RESPONSE_FROM_DATABROKER__ID = eINSTANCE.getJourneyResponseFromDatabroker_Id();

		/**
		 * The meta object literal for the '<em><b>Id Of Journey To Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY_RESPONSE_FROM_DATABROKER__ID_OF_JOURNEY_TO_RESPONSE = eINSTANCE.getJourneyResponseFromDatabroker_IdOfJourneyToResponse();

		/**
		 * The meta object literal for the '<em><b>Journey Succesful Initialised</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOURNEY_RESPONSE_FROM_DATABROKER__JOURNEY_SUCCESFUL_INITIALISED = eINSTANCE.getJourneyResponseFromDatabroker_JourneySuccesfulInitialised();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.utils.impl.GNSSImpl <em>GNSS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.utils.impl.GNSSImpl
		 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getGNSS()
		 * @generated
		 */
		EClass GNSS = eINSTANCE.getGNSS();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GNSS__ID = eINSTANCE.getGNSS_Id();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GNSS__TIMESTAMP = eINSTANCE.getGNSS_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GNSS__TYPE = eINSTANCE.getGNSS_Type();

		/**
		 * The meta object literal for the '<em><b>Nmeastring</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GNSS__NMEASTRING = eINSTANCE.getGNSS_Nmeastring();

		/**
		 * The meta object literal for the '<em><b>Journey</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GNSS__JOURNEY = eINSTANCE.getGNSS_Journey();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.utils.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.utils.impl.PositionImpl
		 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>Position On Track</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__POSITION_ON_TRACK = eINSTANCE.getPosition_PositionOnTrack();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__LAT = eINSTANCE.getPosition_Lat();

		/**
		 * The meta object literal for the '<em><b>Lon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__LON = eINSTANCE.getPosition_Lon();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.utils.impl.PositionOnTrackImpl <em>Position On Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.utils.impl.PositionOnTrackImpl
		 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getPositionOnTrack()
		 * @generated
		 */
		EClass POSITION_ON_TRACK = eINSTANCE.getPositionOnTrack();

		/**
		 * The meta object literal for the '<em><b>Track Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_ON_TRACK__TRACK_ID = eINSTANCE.getPositionOnTrack_TrackId();

		/**
		 * The meta object literal for the '<em><b>Relative Position On Track</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_ON_TRACK__RELATIVE_POSITION_ON_TRACK = eINSTANCE.getPositionOnTrack_RelativePositionOnTrack();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.utils.impl.ValueItemImpl <em>Value Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.utils.impl.ValueItemImpl
		 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getValueItem()
		 * @generated
		 */
		EClass VALUE_ITEM = eINSTANCE.getValueItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_ITEM__ID = eINSTANCE.getValueItem_Id();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_ITEM__VALUE = eINSTANCE.getValueItem_Value();

		/**
		 * The meta object literal for the '<em><b>Value Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_ITEM__VALUE_NAME = eINSTANCE.getValueItem_ValueName();

		/**
		 * The meta object literal for the '<em><b>Value Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_ITEM__VALUE_UNIT = eINSTANCE.getValueItem_ValueUnit();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.utils.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.utils.impl.VehicleImpl
		 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__ID = eINSTANCE.getVehicle_Id();

		/**
		 * The meta object literal for the '<em><b>Vehicle Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__VEHICLE_ID = eINSTANCE.getVehicle_VehicleId();

		/**
		 * The meta object literal for the '<em><b>Vehicle Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__VEHICLE_TYPE = eINSTANCE.getVehicle_VehicleType();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.utils.NMEAType <em>NMEA Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.utils.NMEAType
		 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getNMEAType()
		 * @generated
		 */
		EEnum NMEA_TYPE = eINSTANCE.getNMEAType();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.utils.GNSSStatus <em>GNSS Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.utils.GNSSStatus
		 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getGNSSStatus()
		 * @generated
		 */
		EEnum GNSS_STATUS = eINSTANCE.getGNSSStatus();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.utils.DASStatus <em>DAS Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.utils.DASStatus
		 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getDASStatus()
		 * @generated
		 */
		EEnum DAS_STATUS = eINSTANCE.getDASStatus();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.utils.RecommendationTypes <em>Recommendation Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.utils.RecommendationTypes
		 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getRecommendationTypes()
		 * @generated
		 */
		EEnum RECOMMENDATION_TYPES = eINSTANCE.getRecommendationTypes();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.utils.Units <em>Units</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.utils.Units
		 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getUnits()
		 * @generated
		 */
		EEnum UNITS = eINSTANCE.getUnits();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.utils.VehicleType <em>Vehicle Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.utils.VehicleType
		 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getVehicleType()
		 * @generated
		 */
		EEnum VEHICLE_TYPE = eINSTANCE.getVehicleType();

		/**
		 * The meta object literal for the '<em>Zoned Date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.ZonedDateTime
		 * @see de.inavet.smarttrains.das.interfaces.utils.impl.UtilsPackageImpl#getZonedDateTime()
		 * @generated
		 */
		EDataType ZONED_DATE_TIME = eINSTANCE.getZonedDateTime();

	}

} //UtilsPackage
