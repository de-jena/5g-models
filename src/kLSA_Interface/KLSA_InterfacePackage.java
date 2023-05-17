/**
 */
package kLSA_Interface;

import fasExchange.FasExchangePackage;

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
 * @see kLSA_Interface.KLSA_InterfaceFactory
 * @generated
 */
public class KLSA_InterfacePackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "kLSA_Interface";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://inavet.de/datamodels/klsa_interface";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "kLSA_Interface";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final KLSA_InterfacePackage eINSTANCE = kLSA_Interface.KLSA_InterfacePackage.init();

	/**
	 * The meta object id for the '{@link kLSA_Interface.PrognosisForkLSA <em>Prognosis Fork LSA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kLSA_Interface.PrognosisForkLSA
	 * @see kLSA_Interface.KLSA_InterfacePackage#getPrognosisForkLSA()
	 * @generated
	 */
	public static final int PROGNOSIS_FORK_LSA = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_FORK_LSA__ID = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_FORK_LSA__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_FORK_LSA__VEHICLE = 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_FORK_LSA__POSITION = 3;

	/**
	 * The feature id for the '<em><b>Prognosis Arrival And Positions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_FORK_LSA__PROGNOSIS_ARRIVAL_AND_POSITIONS = 4;

	/**
	 * The feature id for the '<em><b>Trajectory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_FORK_LSA__TRAJECTORY = 5;

	/**
	 * The feature id for the '<em><b>Selected Time Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_FORK_LSA__SELECTED_TIME_WINDOW = 6;

	/**
	 * The number of structural features of the '<em>Prognosis Fork LSA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_FORK_LSA_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Prognosis Fork LSA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_FORK_LSA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kLSA_Interface.PrognosisArrivalAndPosition <em>Prognosis Arrival And Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kLSA_Interface.PrognosisArrivalAndPosition
	 * @see kLSA_Interface.KLSA_InterfacePackage#getPrognosisArrivalAndPosition()
	 * @generated
	 */
	public static final int PROGNOSIS_ARRIVAL_AND_POSITION = 1;

	/**
	 * The feature id for the '<em><b>Marked Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_ARRIVAL_AND_POSITION__MARKED_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Earliest Possible Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_ARRIVAL_AND_POSITION__EARLIEST_POSSIBLE_ARRIVAL_TIME = 1;

	/**
	 * The feature id for the '<em><b>Optimated Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_ARRIVAL_AND_POSITION__OPTIMATED_ARRIVAL_TIME = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_ARRIVAL_AND_POSITION__PRIORITY = 3;

	/**
	 * The number of structural features of the '<em>Prognosis Arrival And Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_ARRIVAL_AND_POSITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Prognosis Arrival And Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROGNOSIS_ARRIVAL_AND_POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kLSA_Interface.MarkedPosition <em>Marked Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kLSA_Interface.MarkedPosition
	 * @see kLSA_Interface.KLSA_InterfacePackage#getMarkedPosition()
	 * @generated
	 */
	public static final int MARKED_POSITION = 2;

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
	 * The meta object id for the '{@link kLSA_Interface.Priority <em>Priority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kLSA_Interface.Priority
	 * @see kLSA_Interface.KLSA_InterfacePackage#getPriority()
	 * @generated
	 */
	public static final int PRIORITY = 3;

	/**
	 * The feature id for the '<em><b>Time Table Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRIORITY__TIME_TABLE_PRIORITY = 0;

	/**
	 * The feature id for the '<em><b>Load Management Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRIORITY__LOAD_MANAGEMENT_PRIORITY = 1;

	/**
	 * The number of structural features of the '<em>Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRIORITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PRIORITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kLSA_Interface.ReleaseTimeWindowForLSA <em>Release Time Window For LSA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kLSA_Interface.ReleaseTimeWindowForLSA
	 * @see kLSA_Interface.KLSA_InterfacePackage#getReleaseTimeWindowForLSA()
	 * @generated
	 */
	public static final int RELEASE_TIME_WINDOW_FOR_LSA = 4;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_WINDOW_FOR_LSA__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_WINDOW_FOR_LSA__VEHICLE = 1;

	/**
	 * The feature id for the '<em><b>Time Windows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_WINDOW_FOR_LSA__TIME_WINDOWS = 2;

	/**
	 * The feature id for the '<em><b>Prognosis Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_WINDOW_FOR_LSA__PROGNOSIS_ID = 3;

	/**
	 * The number of structural features of the '<em>Release Time Window For LSA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_WINDOW_FOR_LSA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Release Time Window For LSA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_WINDOW_FOR_LSA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kLSA_Interface.TimeSlotAndPosition <em>Time Slot And Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kLSA_Interface.TimeSlotAndPosition
	 * @see kLSA_Interface.KLSA_InterfacePackage#getTimeSlotAndPosition()
	 * @generated
	 */
	public static final int TIME_SLOT_AND_POSITION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SLOT_AND_POSITION__ID = 0;

	/**
	 * The feature id for the '<em><b>Marked Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SLOT_AND_POSITION__MARKED_POSITION = 1;

	/**
	 * The feature id for the '<em><b>Release Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SLOT_AND_POSITION__RELEASE_PROBABILITY = 2;

	/**
	 * The feature id for the '<em><b>Time Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SLOT_AND_POSITION__TIME_SLOT = 3;

	/**
	 * The number of structural features of the '<em>Time Slot And Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SLOT_AND_POSITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Time Slot And Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SLOT_AND_POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kLSA_Interface.SelectReleaseTimeWindow <em>Select Release Time Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kLSA_Interface.SelectReleaseTimeWindow
	 * @see kLSA_Interface.KLSA_InterfacePackage#getSelectReleaseTimeWindow()
	 * @generated
	 */
	public static final int SELECT_RELEASE_TIME_WINDOW = 6;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SELECT_RELEASE_TIME_WINDOW__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Prognosis Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SELECT_RELEASE_TIME_WINDOW__PROGNOSIS_ID = 1;

	/**
	 * The feature id for the '<em><b>Time Window Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SELECT_RELEASE_TIME_WINDOW__TIME_WINDOW_ID = 2;

	/**
	 * The number of structural features of the '<em>Select Release Time Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SELECT_RELEASE_TIME_WINDOW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Select Release Time Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SELECT_RELEASE_TIME_WINDOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kLSA_Interface.ReleaseTimeWindowAcknowledgment <em>Release Time Window Acknowledgment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kLSA_Interface.ReleaseTimeWindowAcknowledgment
	 * @see kLSA_Interface.KLSA_InterfacePackage#getReleaseTimeWindowAcknowledgment()
	 * @generated
	 */
	public static final int RELEASE_TIME_WINDOW_ACKNOWLEDGMENT = 7;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_WINDOW_ACKNOWLEDGMENT__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Prognosis Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_WINDOW_ACKNOWLEDGMENT__PROGNOSIS_ID = 1;

	/**
	 * The feature id for the '<em><b>Time Window Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_WINDOW_ACKNOWLEDGMENT__TIME_WINDOW_ID = 2;

	/**
	 * The feature id for the '<em><b>Current Release Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_WINDOW_ACKNOWLEDGMENT__CURRENT_RELEASE_PROBABILITY = 3;

	/**
	 * The number of structural features of the '<em>Release Time Window Acknowledgment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_WINDOW_ACKNOWLEDGMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Release Time Window Acknowledgment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_TIME_WINDOW_ACKNOWLEDGMENT_OPERATION_COUNT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prognosisForkLSAEClass = null;

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
	private EClass markedPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseTimeWindowForLSAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSlotAndPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectReleaseTimeWindowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseTimeWindowAcknowledgmentEClass = null;

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
	 * @see kLSA_Interface.KLSA_InterfacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KLSA_InterfacePackage() {
		super(eNS_URI, KLSA_InterfaceFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link KLSA_InterfacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KLSA_InterfacePackage init() {
		if (isInited) return (KLSA_InterfacePackage)EPackage.Registry.INSTANCE.getEPackage(KLSA_InterfacePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredKLSA_InterfacePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		KLSA_InterfacePackage theKLSA_InterfacePackage = registeredKLSA_InterfacePackage instanceof KLSA_InterfacePackage ? (KLSA_InterfacePackage)registeredKLSA_InterfacePackage : new KLSA_InterfacePackage();

		isInited = true;

		// Initialize simple dependencies
		FasExchangePackage.eINSTANCE.eClass();
		JourneyPackage.eINSTANCE.eClass();
		UtilsPackage.eINSTANCE.eClass();
		VehiclePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theKLSA_InterfacePackage.createPackageContents();

		// Initialize created meta-data
		theKLSA_InterfacePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKLSA_InterfacePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KLSA_InterfacePackage.eNS_URI, theKLSA_InterfacePackage);
		return theKLSA_InterfacePackage;
	}


	/**
	 * Returns the meta object for class '{@link kLSA_Interface.PrognosisForkLSA <em>Prognosis Fork LSA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prognosis Fork LSA</em>'.
	 * @see kLSA_Interface.PrognosisForkLSA
	 * @generated
	 */
	public EClass getPrognosisForkLSA() {
		return prognosisForkLSAEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link kLSA_Interface.PrognosisForkLSA#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see kLSA_Interface.PrognosisForkLSA#getId()
	 * @see #getPrognosisForkLSA()
	 * @generated
	 */
	public EAttribute getPrognosisForkLSA_Id() {
		return (EAttribute)prognosisForkLSAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link kLSA_Interface.PrognosisForkLSA#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see kLSA_Interface.PrognosisForkLSA#getTimestamp()
	 * @see #getPrognosisForkLSA()
	 * @generated
	 */
	public EAttribute getPrognosisForkLSA_Timestamp() {
		return (EAttribute)prognosisForkLSAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference '{@link kLSA_Interface.PrognosisForkLSA#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicle</em>'.
	 * @see kLSA_Interface.PrognosisForkLSA#getVehicle()
	 * @see #getPrognosisForkLSA()
	 * @generated
	 */
	public EReference getPrognosisForkLSA_Vehicle() {
		return (EReference)prognosisForkLSAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link kLSA_Interface.PrognosisForkLSA#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see kLSA_Interface.PrognosisForkLSA#getPosition()
	 * @see #getPrognosisForkLSA()
	 * @generated
	 */
	public EReference getPrognosisForkLSA_Position() {
		return (EReference)prognosisForkLSAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the reference list '{@link kLSA_Interface.PrognosisForkLSA#getPrognosisArrivalAndPositions <em>Prognosis Arrival And Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Prognosis Arrival And Positions</em>'.
	 * @see kLSA_Interface.PrognosisForkLSA#getPrognosisArrivalAndPositions()
	 * @see #getPrognosisForkLSA()
	 * @generated
	 */
	public EReference getPrognosisForkLSA_PrognosisArrivalAndPositions() {
		return (EReference)prognosisForkLSAEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the reference '{@link kLSA_Interface.PrognosisForkLSA#getTrajectory <em>Trajectory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trajectory</em>'.
	 * @see kLSA_Interface.PrognosisForkLSA#getTrajectory()
	 * @see #getPrognosisForkLSA()
	 * @generated
	 */
	public EReference getPrognosisForkLSA_Trajectory() {
		return (EReference)prognosisForkLSAEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link kLSA_Interface.PrognosisForkLSA#getSelectedTimeWindow <em>Selected Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected Time Window</em>'.
	 * @see kLSA_Interface.PrognosisForkLSA#getSelectedTimeWindow()
	 * @see #getPrognosisForkLSA()
	 * @generated
	 */
	public EAttribute getPrognosisForkLSA_SelectedTimeWindow() {
		return (EAttribute)prognosisForkLSAEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for class '{@link kLSA_Interface.PrognosisArrivalAndPosition <em>Prognosis Arrival And Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prognosis Arrival And Position</em>'.
	 * @see kLSA_Interface.PrognosisArrivalAndPosition
	 * @generated
	 */
	public EClass getPrognosisArrivalAndPosition() {
		return prognosisArrivalAndPositionEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link kLSA_Interface.PrognosisArrivalAndPosition#getMarkedPosition <em>Marked Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Marked Position</em>'.
	 * @see kLSA_Interface.PrognosisArrivalAndPosition#getMarkedPosition()
	 * @see #getPrognosisArrivalAndPosition()
	 * @generated
	 */
	public EReference getPrognosisArrivalAndPosition_MarkedPosition() {
		return (EReference)prognosisArrivalAndPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link kLSA_Interface.PrognosisArrivalAndPosition#getEarliestPossibleArrivalTime <em>Earliest Possible Arrival Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Earliest Possible Arrival Time</em>'.
	 * @see kLSA_Interface.PrognosisArrivalAndPosition#getEarliestPossibleArrivalTime()
	 * @see #getPrognosisArrivalAndPosition()
	 * @generated
	 */
	public EAttribute getPrognosisArrivalAndPosition_EarliestPossibleArrivalTime() {
		return (EAttribute)prognosisArrivalAndPositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link kLSA_Interface.PrognosisArrivalAndPosition#getOptimatedArrivalTime <em>Optimated Arrival Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimated Arrival Time</em>'.
	 * @see kLSA_Interface.PrognosisArrivalAndPosition#getOptimatedArrivalTime()
	 * @see #getPrognosisArrivalAndPosition()
	 * @generated
	 */
	public EAttribute getPrognosisArrivalAndPosition_OptimatedArrivalTime() {
		return (EAttribute)prognosisArrivalAndPositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link kLSA_Interface.PrognosisArrivalAndPosition#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Priority</em>'.
	 * @see kLSA_Interface.PrognosisArrivalAndPosition#getPriority()
	 * @see #getPrognosisArrivalAndPosition()
	 * @generated
	 */
	public EReference getPrognosisArrivalAndPosition_Priority() {
		return (EReference)prognosisArrivalAndPositionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link kLSA_Interface.MarkedPosition <em>Marked Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marked Position</em>'.
	 * @see kLSA_Interface.MarkedPosition
	 * @generated
	 */
	public EClass getMarkedPosition() {
		return markedPositionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link kLSA_Interface.MarkedPosition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see kLSA_Interface.MarkedPosition#getId()
	 * @see #getMarkedPosition()
	 * @generated
	 */
	public EAttribute getMarkedPosition_Id() {
		return (EAttribute)markedPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link kLSA_Interface.MarkedPosition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kLSA_Interface.MarkedPosition#getName()
	 * @see #getMarkedPosition()
	 * @generated
	 */
	public EAttribute getMarkedPosition_Name() {
		return (EAttribute)markedPositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link kLSA_Interface.Priority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Priority</em>'.
	 * @see kLSA_Interface.Priority
	 * @generated
	 */
	public EClass getPriority() {
		return priorityEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link kLSA_Interface.Priority#getTimeTablePriority <em>Time Table Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Table Priority</em>'.
	 * @see kLSA_Interface.Priority#getTimeTablePriority()
	 * @see #getPriority()
	 * @generated
	 */
	public EAttribute getPriority_TimeTablePriority() {
		return (EAttribute)priorityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link kLSA_Interface.Priority#getLoadManagementPriority <em>Load Management Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Management Priority</em>'.
	 * @see kLSA_Interface.Priority#getLoadManagementPriority()
	 * @see #getPriority()
	 * @generated
	 */
	public EAttribute getPriority_LoadManagementPriority() {
		return (EAttribute)priorityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link kLSA_Interface.ReleaseTimeWindowForLSA <em>Release Time Window For LSA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release Time Window For LSA</em>'.
	 * @see kLSA_Interface.ReleaseTimeWindowForLSA
	 * @generated
	 */
	public EClass getReleaseTimeWindowForLSA() {
		return releaseTimeWindowForLSAEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link kLSA_Interface.ReleaseTimeWindowForLSA#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see kLSA_Interface.ReleaseTimeWindowForLSA#getTimestamp()
	 * @see #getReleaseTimeWindowForLSA()
	 * @generated
	 */
	public EAttribute getReleaseTimeWindowForLSA_Timestamp() {
		return (EAttribute)releaseTimeWindowForLSAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link kLSA_Interface.ReleaseTimeWindowForLSA#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicle</em>'.
	 * @see kLSA_Interface.ReleaseTimeWindowForLSA#getVehicle()
	 * @see #getReleaseTimeWindowForLSA()
	 * @generated
	 */
	public EReference getReleaseTimeWindowForLSA_Vehicle() {
		return (EReference)releaseTimeWindowForLSAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the reference list '{@link kLSA_Interface.ReleaseTimeWindowForLSA#getTimeWindows <em>Time Windows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Windows</em>'.
	 * @see kLSA_Interface.ReleaseTimeWindowForLSA#getTimeWindows()
	 * @see #getReleaseTimeWindowForLSA()
	 * @generated
	 */
	public EReference getReleaseTimeWindowForLSA_TimeWindows() {
		return (EReference)releaseTimeWindowForLSAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link kLSA_Interface.ReleaseTimeWindowForLSA#getPrognosisId <em>Prognosis Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prognosis Id</em>'.
	 * @see kLSA_Interface.ReleaseTimeWindowForLSA#getPrognosisId()
	 * @see #getReleaseTimeWindowForLSA()
	 * @generated
	 */
	public EAttribute getReleaseTimeWindowForLSA_PrognosisId() {
		return (EAttribute)releaseTimeWindowForLSAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link kLSA_Interface.TimeSlotAndPosition <em>Time Slot And Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Slot And Position</em>'.
	 * @see kLSA_Interface.TimeSlotAndPosition
	 * @generated
	 */
	public EClass getTimeSlotAndPosition() {
		return timeSlotAndPositionEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link kLSA_Interface.TimeSlotAndPosition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see kLSA_Interface.TimeSlotAndPosition#getId()
	 * @see #getTimeSlotAndPosition()
	 * @generated
	 */
	public EAttribute getTimeSlotAndPosition_Id() {
		return (EAttribute)timeSlotAndPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link kLSA_Interface.TimeSlotAndPosition#getMarkedPosition <em>Marked Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Marked Position</em>'.
	 * @see kLSA_Interface.TimeSlotAndPosition#getMarkedPosition()
	 * @see #getTimeSlotAndPosition()
	 * @generated
	 */
	public EReference getTimeSlotAndPosition_MarkedPosition() {
		return (EReference)timeSlotAndPositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link kLSA_Interface.TimeSlotAndPosition#getReleaseProbability <em>Release Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Probability</em>'.
	 * @see kLSA_Interface.TimeSlotAndPosition#getReleaseProbability()
	 * @see #getTimeSlotAndPosition()
	 * @generated
	 */
	public EAttribute getTimeSlotAndPosition_ReleaseProbability() {
		return (EAttribute)timeSlotAndPositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the reference '{@link kLSA_Interface.TimeSlotAndPosition#getTimeSlot <em>Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Slot</em>'.
	 * @see kLSA_Interface.TimeSlotAndPosition#getTimeSlot()
	 * @see #getTimeSlotAndPosition()
	 * @generated
	 */
	public EReference getTimeSlotAndPosition_TimeSlot() {
		return (EReference)timeSlotAndPositionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link kLSA_Interface.SelectReleaseTimeWindow <em>Select Release Time Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Release Time Window</em>'.
	 * @see kLSA_Interface.SelectReleaseTimeWindow
	 * @generated
	 */
	public EClass getSelectReleaseTimeWindow() {
		return selectReleaseTimeWindowEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link kLSA_Interface.SelectReleaseTimeWindow#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see kLSA_Interface.SelectReleaseTimeWindow#getTimestamp()
	 * @see #getSelectReleaseTimeWindow()
	 * @generated
	 */
	public EAttribute getSelectReleaseTimeWindow_Timestamp() {
		return (EAttribute)selectReleaseTimeWindowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link kLSA_Interface.SelectReleaseTimeWindow#getPrognosisId <em>Prognosis Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prognosis Id</em>'.
	 * @see kLSA_Interface.SelectReleaseTimeWindow#getPrognosisId()
	 * @see #getSelectReleaseTimeWindow()
	 * @generated
	 */
	public EAttribute getSelectReleaseTimeWindow_PrognosisId() {
		return (EAttribute)selectReleaseTimeWindowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link kLSA_Interface.SelectReleaseTimeWindow#getTimeWindowId <em>Time Window Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Window Id</em>'.
	 * @see kLSA_Interface.SelectReleaseTimeWindow#getTimeWindowId()
	 * @see #getSelectReleaseTimeWindow()
	 * @generated
	 */
	public EAttribute getSelectReleaseTimeWindow_TimeWindowId() {
		return (EAttribute)selectReleaseTimeWindowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link kLSA_Interface.ReleaseTimeWindowAcknowledgment <em>Release Time Window Acknowledgment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release Time Window Acknowledgment</em>'.
	 * @see kLSA_Interface.ReleaseTimeWindowAcknowledgment
	 * @generated
	 */
	public EClass getReleaseTimeWindowAcknowledgment() {
		return releaseTimeWindowAcknowledgmentEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link kLSA_Interface.ReleaseTimeWindowAcknowledgment#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see kLSA_Interface.ReleaseTimeWindowAcknowledgment#getTimestamp()
	 * @see #getReleaseTimeWindowAcknowledgment()
	 * @generated
	 */
	public EAttribute getReleaseTimeWindowAcknowledgment_Timestamp() {
		return (EAttribute)releaseTimeWindowAcknowledgmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link kLSA_Interface.ReleaseTimeWindowAcknowledgment#getPrognosisId <em>Prognosis Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prognosis Id</em>'.
	 * @see kLSA_Interface.ReleaseTimeWindowAcknowledgment#getPrognosisId()
	 * @see #getReleaseTimeWindowAcknowledgment()
	 * @generated
	 */
	public EAttribute getReleaseTimeWindowAcknowledgment_PrognosisId() {
		return (EAttribute)releaseTimeWindowAcknowledgmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link kLSA_Interface.ReleaseTimeWindowAcknowledgment#getTimeWindowId <em>Time Window Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Window Id</em>'.
	 * @see kLSA_Interface.ReleaseTimeWindowAcknowledgment#getTimeWindowId()
	 * @see #getReleaseTimeWindowAcknowledgment()
	 * @generated
	 */
	public EAttribute getReleaseTimeWindowAcknowledgment_TimeWindowId() {
		return (EAttribute)releaseTimeWindowAcknowledgmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link kLSA_Interface.ReleaseTimeWindowAcknowledgment#getCurrentReleaseProbability <em>Current Release Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Release Probability</em>'.
	 * @see kLSA_Interface.ReleaseTimeWindowAcknowledgment#getCurrentReleaseProbability()
	 * @see #getReleaseTimeWindowAcknowledgment()
	 * @generated
	 */
	public EAttribute getReleaseTimeWindowAcknowledgment_CurrentReleaseProbability() {
		return (EAttribute)releaseTimeWindowAcknowledgmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public KLSA_InterfaceFactory getKLSA_InterfaceFactory() {
		return (KLSA_InterfaceFactory)getEFactoryInstance();
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
		prognosisForkLSAEClass = createEClass(PROGNOSIS_FORK_LSA);
		createEAttribute(prognosisForkLSAEClass, PROGNOSIS_FORK_LSA__ID);
		createEAttribute(prognosisForkLSAEClass, PROGNOSIS_FORK_LSA__TIMESTAMP);
		createEReference(prognosisForkLSAEClass, PROGNOSIS_FORK_LSA__VEHICLE);
		createEReference(prognosisForkLSAEClass, PROGNOSIS_FORK_LSA__POSITION);
		createEReference(prognosisForkLSAEClass, PROGNOSIS_FORK_LSA__PROGNOSIS_ARRIVAL_AND_POSITIONS);
		createEReference(prognosisForkLSAEClass, PROGNOSIS_FORK_LSA__TRAJECTORY);
		createEAttribute(prognosisForkLSAEClass, PROGNOSIS_FORK_LSA__SELECTED_TIME_WINDOW);

		prognosisArrivalAndPositionEClass = createEClass(PROGNOSIS_ARRIVAL_AND_POSITION);
		createEReference(prognosisArrivalAndPositionEClass, PROGNOSIS_ARRIVAL_AND_POSITION__MARKED_POSITION);
		createEAttribute(prognosisArrivalAndPositionEClass, PROGNOSIS_ARRIVAL_AND_POSITION__EARLIEST_POSSIBLE_ARRIVAL_TIME);
		createEAttribute(prognosisArrivalAndPositionEClass, PROGNOSIS_ARRIVAL_AND_POSITION__OPTIMATED_ARRIVAL_TIME);
		createEReference(prognosisArrivalAndPositionEClass, PROGNOSIS_ARRIVAL_AND_POSITION__PRIORITY);

		markedPositionEClass = createEClass(MARKED_POSITION);
		createEAttribute(markedPositionEClass, MARKED_POSITION__ID);
		createEAttribute(markedPositionEClass, MARKED_POSITION__NAME);

		priorityEClass = createEClass(PRIORITY);
		createEAttribute(priorityEClass, PRIORITY__TIME_TABLE_PRIORITY);
		createEAttribute(priorityEClass, PRIORITY__LOAD_MANAGEMENT_PRIORITY);

		releaseTimeWindowForLSAEClass = createEClass(RELEASE_TIME_WINDOW_FOR_LSA);
		createEAttribute(releaseTimeWindowForLSAEClass, RELEASE_TIME_WINDOW_FOR_LSA__TIMESTAMP);
		createEReference(releaseTimeWindowForLSAEClass, RELEASE_TIME_WINDOW_FOR_LSA__VEHICLE);
		createEReference(releaseTimeWindowForLSAEClass, RELEASE_TIME_WINDOW_FOR_LSA__TIME_WINDOWS);
		createEAttribute(releaseTimeWindowForLSAEClass, RELEASE_TIME_WINDOW_FOR_LSA__PROGNOSIS_ID);

		timeSlotAndPositionEClass = createEClass(TIME_SLOT_AND_POSITION);
		createEAttribute(timeSlotAndPositionEClass, TIME_SLOT_AND_POSITION__ID);
		createEReference(timeSlotAndPositionEClass, TIME_SLOT_AND_POSITION__MARKED_POSITION);
		createEAttribute(timeSlotAndPositionEClass, TIME_SLOT_AND_POSITION__RELEASE_PROBABILITY);
		createEReference(timeSlotAndPositionEClass, TIME_SLOT_AND_POSITION__TIME_SLOT);

		selectReleaseTimeWindowEClass = createEClass(SELECT_RELEASE_TIME_WINDOW);
		createEAttribute(selectReleaseTimeWindowEClass, SELECT_RELEASE_TIME_WINDOW__TIMESTAMP);
		createEAttribute(selectReleaseTimeWindowEClass, SELECT_RELEASE_TIME_WINDOW__PROGNOSIS_ID);
		createEAttribute(selectReleaseTimeWindowEClass, SELECT_RELEASE_TIME_WINDOW__TIME_WINDOW_ID);

		releaseTimeWindowAcknowledgmentEClass = createEClass(RELEASE_TIME_WINDOW_ACKNOWLEDGMENT);
		createEAttribute(releaseTimeWindowAcknowledgmentEClass, RELEASE_TIME_WINDOW_ACKNOWLEDGMENT__TIMESTAMP);
		createEAttribute(releaseTimeWindowAcknowledgmentEClass, RELEASE_TIME_WINDOW_ACKNOWLEDGMENT__PROGNOSIS_ID);
		createEAttribute(releaseTimeWindowAcknowledgmentEClass, RELEASE_TIME_WINDOW_ACKNOWLEDGMENT__TIME_WINDOW_ID);
		createEAttribute(releaseTimeWindowAcknowledgmentEClass, RELEASE_TIME_WINDOW_ACKNOWLEDGMENT__CURRENT_RELEASE_PROBABILITY);
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
		FasExchangePackage theFasExchangePackage = (FasExchangePackage)EPackage.Registry.INSTANCE.getEPackage(FasExchangePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(prognosisForkLSAEClass, PrognosisForkLSA.class, "PrognosisForkLSA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrognosisForkLSA_Id(), ecorePackage.getEString(), "id", null, 1, 1, PrognosisForkLSA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrognosisForkLSA_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, PrognosisForkLSA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisForkLSA_Vehicle(), theVehiclePackage.getVehicle(), null, "vehicle", null, 1, 1, PrognosisForkLSA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisForkLSA_Position(), theUtilsPackage.getPosition(), null, "position", null, 1, 1, PrognosisForkLSA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisForkLSA_PrognosisArrivalAndPositions(), this.getPrognosisArrivalAndPosition(), null, "prognosisArrivalAndPositions", null, 1, -1, PrognosisForkLSA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisForkLSA_Trajectory(), theFasExchangePackage.getTrajectory(), null, "trajectory", null, 0, 1, PrognosisForkLSA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrognosisForkLSA_SelectedTimeWindow(), ecorePackage.getEString(), "selectedTimeWindow", null, 0, 1, PrognosisForkLSA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prognosisArrivalAndPositionEClass, PrognosisArrivalAndPosition.class, "PrognosisArrivalAndPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrognosisArrivalAndPosition_MarkedPosition(), this.getMarkedPosition(), null, "markedPosition", null, 1, 1, PrognosisArrivalAndPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrognosisArrivalAndPosition_EarliestPossibleArrivalTime(), theUtilsPackage.getZonedDateTime(), "earliestPossibleArrivalTime", null, 1, 1, PrognosisArrivalAndPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrognosisArrivalAndPosition_OptimatedArrivalTime(), theUtilsPackage.getZonedDateTime(), "optimatedArrivalTime", null, 0, 1, PrognosisArrivalAndPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrognosisArrivalAndPosition_Priority(), this.getPriority(), null, "priority", null, 1, 1, PrognosisArrivalAndPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markedPositionEClass, MarkedPosition.class, "MarkedPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarkedPosition_Id(), ecorePackage.getEString(), "id", null, 0, 1, MarkedPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarkedPosition_Name(), ecorePackage.getEString(), "name", null, 0, 1, MarkedPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(priorityEClass, Priority.class, "Priority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPriority_TimeTablePriority(), ecorePackage.getEDouble(), "timeTablePriority", null, 0, 1, Priority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPriority_LoadManagementPriority(), ecorePackage.getEDouble(), "loadManagementPriority", null, 0, 1, Priority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseTimeWindowForLSAEClass, ReleaseTimeWindowForLSA.class, "ReleaseTimeWindowForLSA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReleaseTimeWindowForLSA_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, ReleaseTimeWindowForLSA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReleaseTimeWindowForLSA_Vehicle(), theVehiclePackage.getVehicle(), null, "vehicle", null, 0, 1, ReleaseTimeWindowForLSA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReleaseTimeWindowForLSA_TimeWindows(), this.getTimeSlotAndPosition(), null, "timeWindows", null, 1, -1, ReleaseTimeWindowForLSA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReleaseTimeWindowForLSA_PrognosisId(), ecorePackage.getEString(), "prognosisId", null, 1, 1, ReleaseTimeWindowForLSA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeSlotAndPositionEClass, TimeSlotAndPosition.class, "TimeSlotAndPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeSlotAndPosition_Id(), ecorePackage.getEString(), "id", null, 1, 1, TimeSlotAndPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeSlotAndPosition_MarkedPosition(), this.getMarkedPosition(), null, "markedPosition", null, 1, 1, TimeSlotAndPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeSlotAndPosition_ReleaseProbability(), ecorePackage.getEDouble(), "releaseProbability", null, 1, 1, TimeSlotAndPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeSlotAndPosition_TimeSlot(), theFasExchangePackage.getTimeSlot(), null, "timeSlot", null, 1, 1, TimeSlotAndPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectReleaseTimeWindowEClass, SelectReleaseTimeWindow.class, "SelectReleaseTimeWindow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectReleaseTimeWindow_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, SelectReleaseTimeWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectReleaseTimeWindow_PrognosisId(), ecorePackage.getEString(), "prognosisId", null, 1, 1, SelectReleaseTimeWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectReleaseTimeWindow_TimeWindowId(), ecorePackage.getEString(), "timeWindowId", null, 1, 1, SelectReleaseTimeWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseTimeWindowAcknowledgmentEClass, ReleaseTimeWindowAcknowledgment.class, "ReleaseTimeWindowAcknowledgment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReleaseTimeWindowAcknowledgment_Timestamp(), theUtilsPackage.getZonedDateTime(), "timestamp", null, 1, 1, ReleaseTimeWindowAcknowledgment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReleaseTimeWindowAcknowledgment_PrognosisId(), ecorePackage.getEString(), "prognosisId", null, 1, 1, ReleaseTimeWindowAcknowledgment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReleaseTimeWindowAcknowledgment_TimeWindowId(), ecorePackage.getEString(), "timeWindowId", null, 1, 1, ReleaseTimeWindowAcknowledgment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReleaseTimeWindowAcknowledgment_CurrentReleaseProbability(), ecorePackage.getEDouble(), "currentReleaseProbability", null, 1, 1, ReleaseTimeWindowAcknowledgment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		 * The meta object literal for the '{@link kLSA_Interface.PrognosisForkLSA <em>Prognosis Fork LSA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kLSA_Interface.PrognosisForkLSA
		 * @see kLSA_Interface.KLSA_InterfacePackage#getPrognosisForkLSA()
		 * @generated
		 */
		public static final EClass PROGNOSIS_FORK_LSA = eINSTANCE.getPrognosisForkLSA();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROGNOSIS_FORK_LSA__ID = eINSTANCE.getPrognosisForkLSA_Id();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROGNOSIS_FORK_LSA__TIMESTAMP = eINSTANCE.getPrognosisForkLSA_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROGNOSIS_FORK_LSA__VEHICLE = eINSTANCE.getPrognosisForkLSA_Vehicle();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROGNOSIS_FORK_LSA__POSITION = eINSTANCE.getPrognosisForkLSA_Position();

		/**
		 * The meta object literal for the '<em><b>Prognosis Arrival And Positions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROGNOSIS_FORK_LSA__PROGNOSIS_ARRIVAL_AND_POSITIONS = eINSTANCE.getPrognosisForkLSA_PrognosisArrivalAndPositions();

		/**
		 * The meta object literal for the '<em><b>Trajectory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROGNOSIS_FORK_LSA__TRAJECTORY = eINSTANCE.getPrognosisForkLSA_Trajectory();

		/**
		 * The meta object literal for the '<em><b>Selected Time Window</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROGNOSIS_FORK_LSA__SELECTED_TIME_WINDOW = eINSTANCE.getPrognosisForkLSA_SelectedTimeWindow();

		/**
		 * The meta object literal for the '{@link kLSA_Interface.PrognosisArrivalAndPosition <em>Prognosis Arrival And Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kLSA_Interface.PrognosisArrivalAndPosition
		 * @see kLSA_Interface.KLSA_InterfacePackage#getPrognosisArrivalAndPosition()
		 * @generated
		 */
		public static final EClass PROGNOSIS_ARRIVAL_AND_POSITION = eINSTANCE.getPrognosisArrivalAndPosition();

		/**
		 * The meta object literal for the '<em><b>Marked Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROGNOSIS_ARRIVAL_AND_POSITION__MARKED_POSITION = eINSTANCE.getPrognosisArrivalAndPosition_MarkedPosition();

		/**
		 * The meta object literal for the '<em><b>Earliest Possible Arrival Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROGNOSIS_ARRIVAL_AND_POSITION__EARLIEST_POSSIBLE_ARRIVAL_TIME = eINSTANCE.getPrognosisArrivalAndPosition_EarliestPossibleArrivalTime();

		/**
		 * The meta object literal for the '<em><b>Optimated Arrival Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PROGNOSIS_ARRIVAL_AND_POSITION__OPTIMATED_ARRIVAL_TIME = eINSTANCE.getPrognosisArrivalAndPosition_OptimatedArrivalTime();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROGNOSIS_ARRIVAL_AND_POSITION__PRIORITY = eINSTANCE.getPrognosisArrivalAndPosition_Priority();

		/**
		 * The meta object literal for the '{@link kLSA_Interface.MarkedPosition <em>Marked Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kLSA_Interface.MarkedPosition
		 * @see kLSA_Interface.KLSA_InterfacePackage#getMarkedPosition()
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
		 * The meta object literal for the '{@link kLSA_Interface.Priority <em>Priority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kLSA_Interface.Priority
		 * @see kLSA_Interface.KLSA_InterfacePackage#getPriority()
		 * @generated
		 */
		public static final EClass PRIORITY = eINSTANCE.getPriority();

		/**
		 * The meta object literal for the '<em><b>Time Table Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PRIORITY__TIME_TABLE_PRIORITY = eINSTANCE.getPriority_TimeTablePriority();

		/**
		 * The meta object literal for the '<em><b>Load Management Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PRIORITY__LOAD_MANAGEMENT_PRIORITY = eINSTANCE.getPriority_LoadManagementPriority();

		/**
		 * The meta object literal for the '{@link kLSA_Interface.ReleaseTimeWindowForLSA <em>Release Time Window For LSA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kLSA_Interface.ReleaseTimeWindowForLSA
		 * @see kLSA_Interface.KLSA_InterfacePackage#getReleaseTimeWindowForLSA()
		 * @generated
		 */
		public static final EClass RELEASE_TIME_WINDOW_FOR_LSA = eINSTANCE.getReleaseTimeWindowForLSA();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELEASE_TIME_WINDOW_FOR_LSA__TIMESTAMP = eINSTANCE.getReleaseTimeWindowForLSA_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELEASE_TIME_WINDOW_FOR_LSA__VEHICLE = eINSTANCE.getReleaseTimeWindowForLSA_Vehicle();

		/**
		 * The meta object literal for the '<em><b>Time Windows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference RELEASE_TIME_WINDOW_FOR_LSA__TIME_WINDOWS = eINSTANCE.getReleaseTimeWindowForLSA_TimeWindows();

		/**
		 * The meta object literal for the '<em><b>Prognosis Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELEASE_TIME_WINDOW_FOR_LSA__PROGNOSIS_ID = eINSTANCE.getReleaseTimeWindowForLSA_PrognosisId();

		/**
		 * The meta object literal for the '{@link kLSA_Interface.TimeSlotAndPosition <em>Time Slot And Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kLSA_Interface.TimeSlotAndPosition
		 * @see kLSA_Interface.KLSA_InterfacePackage#getTimeSlotAndPosition()
		 * @generated
		 */
		public static final EClass TIME_SLOT_AND_POSITION = eINSTANCE.getTimeSlotAndPosition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TIME_SLOT_AND_POSITION__ID = eINSTANCE.getTimeSlotAndPosition_Id();

		/**
		 * The meta object literal for the '<em><b>Marked Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TIME_SLOT_AND_POSITION__MARKED_POSITION = eINSTANCE.getTimeSlotAndPosition_MarkedPosition();

		/**
		 * The meta object literal for the '<em><b>Release Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute TIME_SLOT_AND_POSITION__RELEASE_PROBABILITY = eINSTANCE.getTimeSlotAndPosition_ReleaseProbability();

		/**
		 * The meta object literal for the '<em><b>Time Slot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference TIME_SLOT_AND_POSITION__TIME_SLOT = eINSTANCE.getTimeSlotAndPosition_TimeSlot();

		/**
		 * The meta object literal for the '{@link kLSA_Interface.SelectReleaseTimeWindow <em>Select Release Time Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kLSA_Interface.SelectReleaseTimeWindow
		 * @see kLSA_Interface.KLSA_InterfacePackage#getSelectReleaseTimeWindow()
		 * @generated
		 */
		public static final EClass SELECT_RELEASE_TIME_WINDOW = eINSTANCE.getSelectReleaseTimeWindow();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SELECT_RELEASE_TIME_WINDOW__TIMESTAMP = eINSTANCE.getSelectReleaseTimeWindow_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Prognosis Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SELECT_RELEASE_TIME_WINDOW__PROGNOSIS_ID = eINSTANCE.getSelectReleaseTimeWindow_PrognosisId();

		/**
		 * The meta object literal for the '<em><b>Time Window Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SELECT_RELEASE_TIME_WINDOW__TIME_WINDOW_ID = eINSTANCE.getSelectReleaseTimeWindow_TimeWindowId();

		/**
		 * The meta object literal for the '{@link kLSA_Interface.ReleaseTimeWindowAcknowledgment <em>Release Time Window Acknowledgment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kLSA_Interface.ReleaseTimeWindowAcknowledgment
		 * @see kLSA_Interface.KLSA_InterfacePackage#getReleaseTimeWindowAcknowledgment()
		 * @generated
		 */
		public static final EClass RELEASE_TIME_WINDOW_ACKNOWLEDGMENT = eINSTANCE.getReleaseTimeWindowAcknowledgment();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELEASE_TIME_WINDOW_ACKNOWLEDGMENT__TIMESTAMP = eINSTANCE.getReleaseTimeWindowAcknowledgment_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Prognosis Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELEASE_TIME_WINDOW_ACKNOWLEDGMENT__PROGNOSIS_ID = eINSTANCE.getReleaseTimeWindowAcknowledgment_PrognosisId();

		/**
		 * The meta object literal for the '<em><b>Time Window Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELEASE_TIME_WINDOW_ACKNOWLEDGMENT__TIME_WINDOW_ID = eINSTANCE.getReleaseTimeWindowAcknowledgment_TimeWindowId();

		/**
		 * The meta object literal for the '<em><b>Current Release Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute RELEASE_TIME_WINDOW_ACKNOWLEDGMENT__CURRENT_RELEASE_PROBABILITY = eINSTANCE.getReleaseTimeWindowAcknowledgment_CurrentReleaseProbability();

	}

} //KLSA_InterfacePackage
