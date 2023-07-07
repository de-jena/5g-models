/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

import org.eclipse.emf.ecore.EClass;
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
public class CtlcFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CtlcFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CtlcFactory INSTANCE = de.inavet.smarttrains.das.interfaces.ctlc.CtlcFactory.eINSTANCE;

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
		return new CtlcFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtlcFactory() {
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
			case CtlcPackage.PERIODIC_UPDATE: return (EObject)createPeriodicUpdate();
			case CtlcPackage.UPDATE_FOR_VEHICLE: return (EObject)createUpdateForVehicle();
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION: return (EObject)createPrognosisArrivalAndPosition();
			case CtlcPackage.PROGNOSIS_STOP_PLACE: return (EObject)createPrognosisStopPlace();
			case CtlcPackage.MARKED_POSITION: return (EObject)createMarkedPosition();
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST: return (EObject)createReleaseTimePrognosisRequest();
			case CtlcPackage.SCENARIO: return (EObject)createScenario();
			case CtlcPackage.PROGNOSIS_OVERRIDE: return (EObject)createPrognosisOverride();
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE: return (EObject)createReleaseTimePrognosisResponse();
			case CtlcPackage.SCENARIO_PROGNOSIS: return (EObject)createScenarioPrognosis();
			case CtlcPackage.RELEASE_TIME_VECTOR: return (EObject)createReleaseTimeVector();
			case CtlcPackage.SIGNAL_GROUP: return (EObject)createSignalGroup();
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
		PeriodicUpdate periodicUpdate = new PeriodicUpdate();
		return periodicUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateForVehicle createUpdateForVehicle() {
		UpdateForVehicle updateForVehicle = new UpdateForVehicle();
		return updateForVehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisArrivalAndPosition createPrognosisArrivalAndPosition() {
		PrognosisArrivalAndPosition prognosisArrivalAndPosition = new PrognosisArrivalAndPosition();
		return prognosisArrivalAndPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisStopPlace createPrognosisStopPlace() {
		PrognosisStopPlace prognosisStopPlace = new PrognosisStopPlace();
		return prognosisStopPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkedPosition createMarkedPosition() {
		MarkedPosition markedPosition = new MarkedPosition();
		return markedPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseTimePrognosisRequest createReleaseTimePrognosisRequest() {
		ReleaseTimePrognosisRequest releaseTimePrognosisRequest = new ReleaseTimePrognosisRequest();
		return releaseTimePrognosisRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		Scenario scenario = new Scenario();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisOverride createPrognosisOverride() {
		PrognosisOverride prognosisOverride = new PrognosisOverride();
		return prognosisOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseTimePrognosisResponse createReleaseTimePrognosisResponse() {
		ReleaseTimePrognosisResponse releaseTimePrognosisResponse = new ReleaseTimePrognosisResponse();
		return releaseTimePrognosisResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioPrognosis createScenarioPrognosis() {
		ScenarioPrognosis scenarioPrognosis = new ScenarioPrognosis();
		return scenarioPrognosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseTimeVector createReleaseTimeVector() {
		ReleaseTimeVector releaseTimeVector = new ReleaseTimeVector();
		return releaseTimeVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalGroup createSignalGroup() {
		SignalGroup signalGroup = new SignalGroup();
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

} //CtlcFactory
