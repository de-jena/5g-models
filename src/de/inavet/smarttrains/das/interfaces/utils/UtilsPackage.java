/**
 */
package de.inavet.smarttrains.das.interfaces.utils;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * enthält Hilfsklassen + Enums
 * <!-- end-model-doc -->
 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsFactory
 * @generated
 */
public class UtilsPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "utils";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://inavet.de/datamodels/utils";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "utils";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final UtilsPackage eINSTANCE = de.inavet.smarttrains.das.interfaces.utils.UtilsPackage.init();

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.utils.Position <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.utils.Position
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getPosition()
	 * @generated
	 */
	public static final int POSITION = 0;

	/**
	 * The feature id for the '<em><b>Position On Track</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSITION__POSITION_ON_TRACK = 0;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSITION__LAT = 1;

	/**
	 * The feature id for the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSITION__LON = 2;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack <em>Position On Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getPositionOnTrack()
	 * @generated
	 */
	public static final int POSITION_ON_TRACK = 1;

	/**
	 * The feature id for the '<em><b>Track Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_ON_TRACK__TRACK_ID = 0;

	/**
	 * The feature id for the '<em><b>Relative Position On Track</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_ON_TRACK__RELATIVE_POSITION_ON_TRACK = 1;

	/**
	 * The number of structural features of the '<em>Position On Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_ON_TRACK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Position On Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_ON_TRACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.utils.ValueItem <em>Value Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.utils.ValueItem
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getValueItem()
	 * @generated
	 */
	public static final int VALUE_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_ITEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_ITEM__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_ITEM__VALUE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Value Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_ITEM__VALUE_UNIT = 3;

	/**
	 * The number of structural features of the '<em>Value Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_ITEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Value Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.utils.NMEAType <em>NMEA Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.utils.NMEAType
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getNMEAType()
	 * @generated
	 */
	public static final int NMEA_TYPE = 3;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.utils.GNSSStatus <em>GNSS Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.utils.GNSSStatus
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getGNSSStatus()
	 * @generated
	 */
	public static final int GNSS_STATUS = 4;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.utils.DASStatus <em>DAS Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.utils.DASStatus
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getDASStatus()
	 * @generated
	 */
	public static final int DAS_STATUS = 5;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.utils.RecommendationTypes <em>Recommendation Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.utils.RecommendationTypes
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getRecommendationTypes()
	 * @generated
	 */
	public static final int RECOMMENDATION_TYPES = 6;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.utils.Units <em>Units</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.utils.Units
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getUnits()
	 * @generated
	 */
	public static final int UNITS = 7;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.utils.VehicleType <em>Vehicle Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.utils.VehicleType
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getVehicleType()
	 * @generated
	 */
	public static final int VEHICLE_TYPE = 8;

	/**
	 * The meta object id for the '<em>Zoned Date Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.ZonedDateTime
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getZonedDateTime()
	 * @generated
	 */
	public static final int ZONED_DATE_TIME = 9;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionOnTrackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nmeaTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gnssStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dasStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum recommendationTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vehicleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zonedDateTimeEDataType = null;

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
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UtilsPackage() {
		super(eNS_URI, UtilsFactory.INSTANCE);
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
	 * <p>This method is used to initialize {@link UtilsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UtilsPackage init() {
		if (isInited) return (UtilsPackage)EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUtilsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UtilsPackage theUtilsPackage = registeredUtilsPackage instanceof UtilsPackage ? (UtilsPackage)registeredUtilsPackage : new UtilsPackage();

		isInited = true;

		// Create package meta-data objects
		theUtilsPackage.createPackageContents();

		// Initialize created meta-data
		theUtilsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUtilsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UtilsPackage.eNS_URI, theUtilsPackage);
		return theUtilsPackage;
	}


	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.utils.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Position
	 * @generated
	 */
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link de.inavet.smarttrains.das.interfaces.utils.Position#getPositionOnTrack <em>Position On Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position On Track</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Position#getPositionOnTrack()
	 * @see #getPosition()
	 * @generated
	 */
	public EReference getPosition_PositionOnTrack() {
		return (EReference)positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.Position#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Position#getLat()
	 * @see #getPosition()
	 * @generated
	 */
	public EAttribute getPosition_Lat() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.Position#getLon <em>Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lon</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Position#getLon()
	 * @see #getPosition()
	 * @generated
	 */
	public EAttribute getPosition_Lon() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack <em>Position On Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position On Track</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack
	 * @generated
	 */
	public EClass getPositionOnTrack() {
		return positionOnTrackEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack#getTrackId <em>Track Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack#getTrackId()
	 * @see #getPositionOnTrack()
	 * @generated
	 */
	public EAttribute getPositionOnTrack_TrackId() {
		return (EAttribute)positionOnTrackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack#getRelativePositionOnTrack <em>Relative Position On Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Position On Track</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack#getRelativePositionOnTrack()
	 * @see #getPositionOnTrack()
	 * @generated
	 */
	public EAttribute getPositionOnTrack_RelativePositionOnTrack() {
		return (EAttribute)positionOnTrackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.utils.ValueItem <em>Value Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Item</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.ValueItem
	 * @generated
	 */
	public EClass getValueItem() {
		return valueItemEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.ValueItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.ValueItem#getId()
	 * @see #getValueItem()
	 * @generated
	 */
	public EAttribute getValueItem_Id() {
		return (EAttribute)valueItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.ValueItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.ValueItem#getValue()
	 * @see #getValueItem()
	 * @generated
	 */
	public EAttribute getValueItem_Value() {
		return (EAttribute)valueItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.ValueItem#getValueName <em>Value Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Name</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.ValueItem#getValueName()
	 * @see #getValueItem()
	 * @generated
	 */
	public EAttribute getValueItem_ValueName() {
		return (EAttribute)valueItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.utils.ValueItem#getValueUnit <em>Value Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Unit</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.ValueItem#getValueUnit()
	 * @see #getValueItem()
	 * @generated
	 */
	public EAttribute getValueItem_ValueUnit() {
		return (EAttribute)valueItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for enum '{@link de.inavet.smarttrains.das.interfaces.utils.NMEAType <em>NMEA Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>NMEA Type</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.NMEAType
	 * @generated
	 */
	public EEnum getNMEAType() {
		return nmeaTypeEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link de.inavet.smarttrains.das.interfaces.utils.GNSSStatus <em>GNSS Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GNSS Status</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.GNSSStatus
	 * @generated
	 */
	public EEnum getGNSSStatus() {
		return gnssStatusEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link de.inavet.smarttrains.das.interfaces.utils.DASStatus <em>DAS Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DAS Status</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.DASStatus
	 * @generated
	 */
	public EEnum getDASStatus() {
		return dasStatusEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link de.inavet.smarttrains.das.interfaces.utils.RecommendationTypes <em>Recommendation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Recommendation Types</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.RecommendationTypes
	 * @generated
	 */
	public EEnum getRecommendationTypes() {
		return recommendationTypesEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link de.inavet.smarttrains.das.interfaces.utils.Units <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Units</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Units
	 * @generated
	 */
	public EEnum getUnits() {
		return unitsEEnum;
	}

	/**
	 * Returns the meta object for enum '{@link de.inavet.smarttrains.das.interfaces.utils.VehicleType <em>Vehicle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vehicle Type</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.utils.VehicleType
	 * @generated
	 */
	public EEnum getVehicleType() {
		return vehicleTypeEEnum;
	}

	/**
	 * Returns the meta object for data type '{@link java.time.ZonedDateTime <em>Zoned Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zeitklasse
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Zoned Date Time</em>'.
	 * @see java.time.ZonedDateTime
	 * @generated
	 */
	public EDataType getZonedDateTime() {
		return zonedDateTimeEDataType;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public UtilsFactory getUtilsFactory() {
		return (UtilsFactory)getEFactoryInstance();
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
		positionEClass = createEClass(POSITION);
		createEReference(positionEClass, POSITION__POSITION_ON_TRACK);
		createEAttribute(positionEClass, POSITION__LAT);
		createEAttribute(positionEClass, POSITION__LON);

		positionOnTrackEClass = createEClass(POSITION_ON_TRACK);
		createEAttribute(positionOnTrackEClass, POSITION_ON_TRACK__TRACK_ID);
		createEAttribute(positionOnTrackEClass, POSITION_ON_TRACK__RELATIVE_POSITION_ON_TRACK);

		valueItemEClass = createEClass(VALUE_ITEM);
		createEAttribute(valueItemEClass, VALUE_ITEM__ID);
		createEAttribute(valueItemEClass, VALUE_ITEM__VALUE);
		createEAttribute(valueItemEClass, VALUE_ITEM__VALUE_NAME);
		createEAttribute(valueItemEClass, VALUE_ITEM__VALUE_UNIT);

		// Create enums
		nmeaTypeEEnum = createEEnum(NMEA_TYPE);
		gnssStatusEEnum = createEEnum(GNSS_STATUS);
		dasStatusEEnum = createEEnum(DAS_STATUS);
		recommendationTypesEEnum = createEEnum(RECOMMENDATION_TYPES);
		unitsEEnum = createEEnum(UNITS);
		vehicleTypeEEnum = createEEnum(VEHICLE_TYPE);

		// Create data types
		zonedDateTimeEDataType = createEDataType(ZONED_DATE_TIME);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPosition_PositionOnTrack(), this.getPositionOnTrack(), null, "positionOnTrack", null, 1, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Lat(), ecorePackage.getEDouble(), "lat", null, 1, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Lon(), ecorePackage.getEDouble(), "lon", null, 1, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionOnTrackEClass, PositionOnTrack.class, "PositionOnTrack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionOnTrack_TrackId(), ecorePackage.getEString(), "trackId", null, 1, 1, PositionOnTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositionOnTrack_RelativePositionOnTrack(), ecorePackage.getEDouble(), "relativePositionOnTrack", null, 1, 1, PositionOnTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueItemEClass, ValueItem.class, "ValueItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueItem_Id(), ecorePackage.getEString(), "id", null, 1, 1, ValueItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueItem_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, ValueItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueItem_ValueName(), ecorePackage.getEString(), "valueName", null, 1, 1, ValueItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueItem_ValueUnit(), this.getUnits(), "valueUnit", null, 1, 1, ValueItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(nmeaTypeEEnum, NMEAType.class, "NMEAType");
		addEEnumLiteral(nmeaTypeEEnum, NMEAType.GNRMC);
		addEEnumLiteral(nmeaTypeEEnum, NMEAType.GPRMC);
		addEEnumLiteral(nmeaTypeEEnum, NMEAType.GPGGA);
		addEEnumLiteral(nmeaTypeEEnum, NMEAType.GNGGA);

		initEEnum(gnssStatusEEnum, GNSSStatus.class, "GNSSStatus");
		addEEnumLiteral(gnssStatusEEnum, GNSSStatus.ACTIVE_LOCALISATION);
		addEEnumLiteral(gnssStatusEEnum, GNSSStatus.NO_LOCALISATION);
		addEEnumLiteral(gnssStatusEEnum, GNSSStatus.COMPUTED_LOCATION);
		addEEnumLiteral(gnssStatusEEnum, GNSSStatus.TEMPORARY_NO_LOCALISATION);

		initEEnum(dasStatusEEnum, DASStatus.class, "DASStatus");
		addEEnumLiteral(dasStatusEEnum, DASStatus.NO_CONNECTION_TO_CENTRAL);
		addEEnumLiteral(dasStatusEEnum, DASStatus.NO_INITIAL_DATA);
		addEEnumLiteral(dasStatusEEnum, DASStatus.INITIALISED);
		addEEnumLiteral(dasStatusEEnum, DASStatus.ACTIVE_RECOMMENDATION);
		addEEnumLiteral(dasStatusEEnum, DASStatus.ACTIVE_DENM);
		addEEnumLiteral(dasStatusEEnum, DASStatus.ACTIVE_VAM);
		addEEnumLiteral(dasStatusEEnum, DASStatus.ERROR);
		addEEnumLiteral(dasStatusEEnum, DASStatus.DEACTIVATED);

		initEEnum(recommendationTypesEEnum, RecommendationTypes.class, "RecommendationTypes");
		addEEnumLiteral(recommendationTypesEEnum, RecommendationTypes.DISPATCH);
		addEEnumLiteral(recommendationTypesEEnum, RecommendationTypes.DEPARTURE);
		addEEnumLiteral(recommendationTypesEEnum, RecommendationTypes.LSA_COUNTDOWN);
		addEEnumLiteral(recommendationTypesEEnum, RecommendationTypes.CRUISE);
		addEEnumLiteral(recommendationTypesEEnum, RecommendationTypes.BREAK);
		addEEnumLiteral(recommendationTypesEEnum, RecommendationTypes.WAIT);
		addEEnumLiteral(recommendationTypesEEnum, RecommendationTypes.ACCELERATE);
		addEEnumLiteral(recommendationTypesEEnum, RecommendationTypes.NO_INFORMATION);
		addEEnumLiteral(recommendationTypesEEnum, RecommendationTypes.COASTING);

		initEEnum(unitsEEnum, Units.class, "Units");
		addEEnumLiteral(unitsEEnum, Units.METER_PRO_SEKUNDE);
		addEEnumLiteral(unitsEEnum, Units.WATT);
		addEEnumLiteral(unitsEEnum, Units.SEKUNDE);
		addEEnumLiteral(unitsEEnum, Units.METER);
		addEEnumLiteral(unitsEEnum, Units.WATT_STUNDEN);
		addEEnumLiteral(unitsEEnum, Units.PROZENT);

		initEEnum(vehicleTypeEEnum, VehicleType.class, "VehicleType");
		addEEnumLiteral(vehicleTypeEEnum, VehicleType.TRAM);
		addEEnumLiteral(vehicleTypeEEnum, VehicleType.BUS);
		addEEnumLiteral(vehicleTypeEEnum, VehicleType.EMERGENCY_VEHICLE);
		addEEnumLiteral(vehicleTypeEEnum, VehicleType.CAR);
		addEEnumLiteral(vehicleTypeEEnum, VehicleType.OTHER);

		// Initialize data types
		initEDataType(zonedDateTimeEDataType, ZonedDateTime.class, "ZonedDateTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
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
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.utils.Position <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.utils.Position
		 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getPosition()
		 * @generated
		 */
		public static final EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>Position On Track</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference POSITION__POSITION_ON_TRACK = eINSTANCE.getPosition_PositionOnTrack();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POSITION__LAT = eINSTANCE.getPosition_Lat();

		/**
		 * The meta object literal for the '<em><b>Lon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POSITION__LON = eINSTANCE.getPosition_Lon();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack <em>Position On Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack
		 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getPositionOnTrack()
		 * @generated
		 */
		public static final EClass POSITION_ON_TRACK = eINSTANCE.getPositionOnTrack();

		/**
		 * The meta object literal for the '<em><b>Track Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POSITION_ON_TRACK__TRACK_ID = eINSTANCE.getPositionOnTrack_TrackId();

		/**
		 * The meta object literal for the '<em><b>Relative Position On Track</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute POSITION_ON_TRACK__RELATIVE_POSITION_ON_TRACK = eINSTANCE.getPositionOnTrack_RelativePositionOnTrack();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.utils.ValueItem <em>Value Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.utils.ValueItem
		 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getValueItem()
		 * @generated
		 */
		public static final EClass VALUE_ITEM = eINSTANCE.getValueItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VALUE_ITEM__ID = eINSTANCE.getValueItem_Id();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VALUE_ITEM__VALUE = eINSTANCE.getValueItem_Value();

		/**
		 * The meta object literal for the '<em><b>Value Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VALUE_ITEM__VALUE_NAME = eINSTANCE.getValueItem_ValueName();

		/**
		 * The meta object literal for the '<em><b>Value Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VALUE_ITEM__VALUE_UNIT = eINSTANCE.getValueItem_ValueUnit();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.utils.NMEAType <em>NMEA Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.utils.NMEAType
		 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getNMEAType()
		 * @generated
		 */
		public static final EEnum NMEA_TYPE = eINSTANCE.getNMEAType();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.utils.GNSSStatus <em>GNSS Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.utils.GNSSStatus
		 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getGNSSStatus()
		 * @generated
		 */
		public static final EEnum GNSS_STATUS = eINSTANCE.getGNSSStatus();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.utils.DASStatus <em>DAS Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.utils.DASStatus
		 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getDASStatus()
		 * @generated
		 */
		public static final EEnum DAS_STATUS = eINSTANCE.getDASStatus();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.utils.RecommendationTypes <em>Recommendation Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.utils.RecommendationTypes
		 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getRecommendationTypes()
		 * @generated
		 */
		public static final EEnum RECOMMENDATION_TYPES = eINSTANCE.getRecommendationTypes();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.utils.Units <em>Units</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.utils.Units
		 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getUnits()
		 * @generated
		 */
		public static final EEnum UNITS = eINSTANCE.getUnits();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.utils.VehicleType <em>Vehicle Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.utils.VehicleType
		 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getVehicleType()
		 * @generated
		 */
		public static final EEnum VEHICLE_TYPE = eINSTANCE.getVehicleType();

		/**
		 * The meta object literal for the '<em>Zoned Date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.ZonedDateTime
		 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getZonedDateTime()
		 * @generated
		 */
		public static final EDataType ZONED_DATE_TIME = eINSTANCE.getZonedDateTime();

	}

} //UtilsPackage
