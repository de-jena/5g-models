/**
 */
package de.inavet.smarttrains.das.interfaces.utils.impl;

import de.inavet.smarttrains.das.interfaces.utils.DASStatus;
import de.inavet.smarttrains.das.interfaces.utils.GNSSStatus;
import de.inavet.smarttrains.das.interfaces.utils.Journey;
import de.inavet.smarttrains.das.interfaces.utils.JourneyResponseFromDatabroker;
import de.inavet.smarttrains.das.interfaces.utils.NMEAType;
import de.inavet.smarttrains.das.interfaces.utils.Position;
import de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack;
import de.inavet.smarttrains.das.interfaces.utils.RecommendationTypes;
import de.inavet.smarttrains.das.interfaces.utils.Units;
import de.inavet.smarttrains.das.interfaces.utils.UtilsFactory;
import de.inavet.smarttrains.das.interfaces.utils.UtilsPackage;
import de.inavet.smarttrains.das.interfaces.utils.ValueItem;
import de.inavet.smarttrains.das.interfaces.utils.Vehicle;
import de.inavet.smarttrains.das.interfaces.utils.VehicleType;

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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilsPackageImpl extends EPackageImpl implements UtilsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass journeyResponseFromDatabrokerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gnssEClass = null;

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
	private EClass vehicleEClass = null;

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
	private UtilsPackageImpl() {
		super(eNS_URI, UtilsFactory.eINSTANCE);
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
		UtilsPackageImpl theUtilsPackage = registeredUtilsPackage instanceof UtilsPackageImpl ? (UtilsPackageImpl)registeredUtilsPackage : new UtilsPackageImpl();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJourney() {
		return journeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourney_Id() {
		return (EAttribute)journeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourney_JourneyId() {
		return (EAttribute)journeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourney_Line() {
		return (EAttribute)journeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourney_Course() {
		return (EAttribute)journeyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourney_Route() {
		return (EAttribute)journeyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourney_Timestamp() {
		return (EAttribute)journeyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJourney_Vehicle() {
		return (EReference)journeyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJourneyResponseFromDatabroker() {
		return journeyResponseFromDatabrokerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourneyResponseFromDatabroker_Id() {
		return (EAttribute)journeyResponseFromDatabrokerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourneyResponseFromDatabroker_IdOfJourneyToResponse() {
		return (EAttribute)journeyResponseFromDatabrokerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJourneyResponseFromDatabroker_JourneySuccesfulInitialised() {
		return (EAttribute)journeyResponseFromDatabrokerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGNSS() {
		return gnssEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGNSS_Id() {
		return (EAttribute)gnssEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGNSS_Timestamp() {
		return (EAttribute)gnssEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGNSS_Type() {
		return (EAttribute)gnssEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGNSS_Nmeastring() {
		return (EAttribute)gnssEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGNSS_Journey() {
		return (EReference)gnssEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPosition_PositionOnTrack() {
		return (EReference)positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_Lat() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPosition_Lon() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionOnTrack() {
		return positionOnTrackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionOnTrack_TrackId() {
		return (EAttribute)positionOnTrackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionOnTrack_RelativePositionOnTrack() {
		return (EAttribute)positionOnTrackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueItem() {
		return valueItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueItem_Id() {
		return (EAttribute)valueItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueItem_Value() {
		return (EAttribute)valueItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueItem_ValueName() {
		return (EAttribute)valueItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueItem_ValueUnit() {
		return (EAttribute)valueItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVehicle() {
		return vehicleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_Id() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_VehicleId() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_VehicleType() {
		return (EAttribute)vehicleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNMEAType() {
		return nmeaTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGNSSStatus() {
		return gnssStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDASStatus() {
		return dasStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRecommendationTypes() {
		return recommendationTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnits() {
		return unitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVehicleType() {
		return vehicleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getZonedDateTime() {
		return zonedDateTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
		journeyEClass = createEClass(JOURNEY);
		createEAttribute(journeyEClass, JOURNEY__ID);
		createEAttribute(journeyEClass, JOURNEY__JOURNEY_ID);
		createEAttribute(journeyEClass, JOURNEY__LINE);
		createEAttribute(journeyEClass, JOURNEY__COURSE);
		createEAttribute(journeyEClass, JOURNEY__ROUTE);
		createEAttribute(journeyEClass, JOURNEY__TIMESTAMP);
		createEReference(journeyEClass, JOURNEY__VEHICLE);

		journeyResponseFromDatabrokerEClass = createEClass(JOURNEY_RESPONSE_FROM_DATABROKER);
		createEAttribute(journeyResponseFromDatabrokerEClass, JOURNEY_RESPONSE_FROM_DATABROKER__ID);
		createEAttribute(journeyResponseFromDatabrokerEClass, JOURNEY_RESPONSE_FROM_DATABROKER__ID_OF_JOURNEY_TO_RESPONSE);
		createEAttribute(journeyResponseFromDatabrokerEClass, JOURNEY_RESPONSE_FROM_DATABROKER__JOURNEY_SUCCESFUL_INITIALISED);

		gnssEClass = createEClass(GNSS);
		createEAttribute(gnssEClass, GNSS__ID);
		createEAttribute(gnssEClass, GNSS__TIMESTAMP);
		createEAttribute(gnssEClass, GNSS__TYPE);
		createEAttribute(gnssEClass, GNSS__NMEASTRING);
		createEReference(gnssEClass, GNSS__JOURNEY);

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

		vehicleEClass = createEClass(VEHICLE);
		createEAttribute(vehicleEClass, VEHICLE__ID);
		createEAttribute(vehicleEClass, VEHICLE__VEHICLE_ID);
		createEAttribute(vehicleEClass, VEHICLE__VEHICLE_TYPE);

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
		initEClass(journeyEClass, Journey.class, "Journey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJourney_Id(), ecorePackage.getEString(), "id", null, 1, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourney_JourneyId(), ecorePackage.getEString(), "journeyId", null, 1, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourney_Line(), ecorePackage.getEInt(), "line", null, 1, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourney_Course(), ecorePackage.getEInt(), "course", null, 1, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourney_Route(), ecorePackage.getEInt(), "route", null, 1, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourney_Timestamp(), this.getZonedDateTime(), "timestamp", null, 1, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJourney_Vehicle(), this.getVehicle(), null, "vehicle", null, 1, 1, Journey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(journeyResponseFromDatabrokerEClass, JourneyResponseFromDatabroker.class, "JourneyResponseFromDatabroker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJourneyResponseFromDatabroker_Id(), ecorePackage.getEString(), "id", null, 1, 1, JourneyResponseFromDatabroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourneyResponseFromDatabroker_IdOfJourneyToResponse(), ecorePackage.getEString(), "idOfJourneyToResponse", null, 1, 1, JourneyResponseFromDatabroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJourneyResponseFromDatabroker_JourneySuccesfulInitialised(), ecorePackage.getEBoolean(), "journeySuccesfulInitialised", null, 1, 1, JourneyResponseFromDatabroker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gnssEClass, de.inavet.smarttrains.das.interfaces.utils.GNSS.class, "GNSS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGNSS_Id(), ecorePackage.getEString(), "id", null, 1, 1, de.inavet.smarttrains.das.interfaces.utils.GNSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSS_Timestamp(), this.getZonedDateTime(), "timestamp", null, 1, 1, de.inavet.smarttrains.das.interfaces.utils.GNSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSS_Type(), this.getNMEAType(), "type", "GPRMC", 1, 1, de.inavet.smarttrains.das.interfaces.utils.GNSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGNSS_Nmeastring(), ecorePackage.getEString(), "nmeastring", null, 1, 1, de.inavet.smarttrains.das.interfaces.utils.GNSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGNSS_Journey(), this.getJourney(), null, "journey", null, 1, 1, de.inavet.smarttrains.das.interfaces.utils.GNSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGNSS_Journey().getEKeys().add(this.getJourney_Id());

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPosition_PositionOnTrack(), this.getPositionOnTrack(), null, "positionOnTrack", null, 1, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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

		initEClass(vehicleEClass, Vehicle.class, "Vehicle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVehicle_Id(), ecorePackage.getEString(), "id", null, 1, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_VehicleId(), ecorePackage.getEString(), "vehicleId", null, 1, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicle_VehicleType(), this.getVehicleType(), "vehicleType", null, 1, 1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

} //UtilsPackageImpl
