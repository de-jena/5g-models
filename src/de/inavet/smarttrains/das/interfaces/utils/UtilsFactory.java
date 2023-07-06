/**
 */
package de.inavet.smarttrains.das.interfaces.utils;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilsFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final UtilsFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final UtilsFactory INSTANCE = de.inavet.smarttrains.das.interfaces.utils.UtilsFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UtilsFactory init() {
		try {
			UtilsFactory theUtilsFactory = (UtilsFactory)EPackage.Registry.INSTANCE.getEFactory(UtilsPackage.eNS_URI);
			if (theUtilsFactory != null) {
				return theUtilsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UtilsFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilsFactory() {
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
			case UtilsPackage.POSITION: return (EObject)createPosition();
			case UtilsPackage.POSITION_ON_TRACK: return (EObject)createPositionOnTrack();
			case UtilsPackage.VALUE_ITEM: return (EObject)createValueItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UtilsPackage.NMEA_TYPE:
				return createNMEATypeFromString(eDataType, initialValue);
			case UtilsPackage.GNSS_STATUS:
				return createGNSSStatusFromString(eDataType, initialValue);
			case UtilsPackage.DAS_STATUS:
				return createDASStatusFromString(eDataType, initialValue);
			case UtilsPackage.RECOMMENDATION_TYPES:
				return createRecommendationTypesFromString(eDataType, initialValue);
			case UtilsPackage.UNITS:
				return createUnitsFromString(eDataType, initialValue);
			case UtilsPackage.VEHICLE_TYPE:
				return createVehicleTypeFromString(eDataType, initialValue);
			case UtilsPackage.ZONED_DATE_TIME:
				return createZonedDateTimeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UtilsPackage.NMEA_TYPE:
				return convertNMEATypeToString(eDataType, instanceValue);
			case UtilsPackage.GNSS_STATUS:
				return convertGNSSStatusToString(eDataType, instanceValue);
			case UtilsPackage.DAS_STATUS:
				return convertDASStatusToString(eDataType, instanceValue);
			case UtilsPackage.RECOMMENDATION_TYPES:
				return convertRecommendationTypesToString(eDataType, instanceValue);
			case UtilsPackage.UNITS:
				return convertUnitsToString(eDataType, instanceValue);
			case UtilsPackage.VEHICLE_TYPE:
				return convertVehicleTypeToString(eDataType, instanceValue);
			case UtilsPackage.ZONED_DATE_TIME:
				return convertZonedDateTimeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPosition() {
		Position position = new Position();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionOnTrack createPositionOnTrack() {
		PositionOnTrack positionOnTrack = new PositionOnTrack();
		return positionOnTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueItem createValueItem() {
		ValueItem valueItem = new ValueItem();
		return valueItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NMEAType createNMEATypeFromString(EDataType eDataType, String initialValue) {
		NMEAType result = NMEAType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNMEATypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GNSSStatus createGNSSStatusFromString(EDataType eDataType, String initialValue) {
		GNSSStatus result = GNSSStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGNSSStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DASStatus createDASStatusFromString(EDataType eDataType, String initialValue) {
		DASStatus result = DASStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDASStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecommendationTypes createRecommendationTypesFromString(EDataType eDataType, String initialValue) {
		RecommendationTypes result = RecommendationTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRecommendationTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Units createUnitsFromString(EDataType eDataType, String initialValue) {
		Units result = Units.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleType createVehicleTypeFromString(EDataType eDataType, String initialValue) {
		VehicleType result = VehicleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVehicleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZonedDateTime createZonedDateTimeFromString(EDataType eDataType, String initialValue) {
		return (ZonedDateTime)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZonedDateTimeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilsPackage getUtilsPackage() {
		return (UtilsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UtilsPackage getPackage() {
		return UtilsPackage.eINSTANCE;
	}

} //UtilsFactory
