/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc.impl;

import de.inavet.smarttrains.das.interfaces.ctlc.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CtlcFactoryImpl extends EFactoryImpl implements CtlcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CtlcFactory init() {
		try {
			CtlcFactory theCtlcFactory = (CtlcFactory)EPackage.Registry.INSTANCE.getEFactory(CtlcPackage.eNS_URI);
			if (theCtlcFactory != null) {
				return theCtlcFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CtlcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtlcFactoryImpl() {
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
			case CtlcPackage.PERIODIC_UPDATE: return createPeriodicUpdate();
			case CtlcPackage.UPDATE_FOR_VEHICLE: return createUpdateForVehicle();
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION: return createPrognosisArrivalAndPosition();
			case CtlcPackage.PROGNOSIS_STOP_PLACE: return createPrognosisStopPlace();
			case CtlcPackage.MARKED_POSITION: return createMarkedPosition();
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST: return createReleaseTimePrognosisRequest();
			case CtlcPackage.SCENARIO: return createScenario();
			case CtlcPackage.PROGNOSIS_OVERRIDE: return createPrognosisOverride();
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE: return createReleaseTimePrognosisResponse();
			case CtlcPackage.SCENARIO_PROGNOSIS: return createScenarioPrognosis();
			case CtlcPackage.RELEASE_TIME_VECTOR: return createReleaseTimeVector();
			case CtlcPackage.SIGNAL_GROUP: return createSignalGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicUpdate createPeriodicUpdate() {
		PeriodicUpdateImpl periodicUpdate = new PeriodicUpdateImpl();
		return periodicUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateForVehicle createUpdateForVehicle() {
		UpdateForVehicleImpl updateForVehicle = new UpdateForVehicleImpl();
		return updateForVehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisArrivalAndPosition createPrognosisArrivalAndPosition() {
		PrognosisArrivalAndPositionImpl prognosisArrivalAndPosition = new PrognosisArrivalAndPositionImpl();
		return prognosisArrivalAndPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisStopPlace createPrognosisStopPlace() {
		PrognosisStopPlaceImpl prognosisStopPlace = new PrognosisStopPlaceImpl();
		return prognosisStopPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkedPosition createMarkedPosition() {
		MarkedPositionImpl markedPosition = new MarkedPositionImpl();
		return markedPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseTimePrognosisRequest createReleaseTimePrognosisRequest() {
		ReleaseTimePrognosisRequestImpl releaseTimePrognosisRequest = new ReleaseTimePrognosisRequestImpl();
		return releaseTimePrognosisRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisOverride createPrognosisOverride() {
		PrognosisOverrideImpl prognosisOverride = new PrognosisOverrideImpl();
		return prognosisOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseTimePrognosisResponse createReleaseTimePrognosisResponse() {
		ReleaseTimePrognosisResponseImpl releaseTimePrognosisResponse = new ReleaseTimePrognosisResponseImpl();
		return releaseTimePrognosisResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioPrognosis createScenarioPrognosis() {
		ScenarioPrognosisImpl scenarioPrognosis = new ScenarioPrognosisImpl();
		return scenarioPrognosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseTimeVector createReleaseTimeVector() {
		ReleaseTimeVectorImpl releaseTimeVector = new ReleaseTimeVectorImpl();
		return releaseTimeVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalGroup createSignalGroup() {
		SignalGroupImpl signalGroup = new SignalGroupImpl();
		return signalGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtlcPackage getCtlcPackage() {
		return (CtlcPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CtlcPackage getPackage() {
		return CtlcPackage.eINSTANCE;
	}

} //CtlcFactoryImpl
