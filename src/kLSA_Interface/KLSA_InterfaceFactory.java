/**
 */
package kLSA_Interface;

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
public class KLSA_InterfaceFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final KLSA_InterfaceFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final KLSA_InterfaceFactory INSTANCE = kLSA_Interface.KLSA_InterfaceFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KLSA_InterfaceFactory init() {
		try {
			KLSA_InterfaceFactory theKLSA_InterfaceFactory = (KLSA_InterfaceFactory)EPackage.Registry.INSTANCE.getEFactory(KLSA_InterfacePackage.eNS_URI);
			if (theKLSA_InterfaceFactory != null) {
				return theKLSA_InterfaceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KLSA_InterfaceFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KLSA_InterfaceFactory() {
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
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA: return (EObject)createPrognosisForkLSA();
			case KLSA_InterfacePackage.PROGNOSIS_ARRIVAL_AND_POSITION: return (EObject)createPrognosisArrivalAndPosition();
			case KLSA_InterfacePackage.MARKED_POSITION: return (EObject)createMarkedPosition();
			case KLSA_InterfacePackage.PRIORITY: return (EObject)createPriority();
			case KLSA_InterfacePackage.RELEASE_TIME_WINDOW_FOR_LSA: return (EObject)createReleaseTimeWindowForLSA();
			case KLSA_InterfacePackage.TIME_SLOT_AND_POSITION: return (EObject)createTimeSlotAndPosition();
			case KLSA_InterfacePackage.SELECT_RELEASE_TIME_WINDOW: return (EObject)createSelectReleaseTimeWindow();
			case KLSA_InterfacePackage.RELEASE_TIME_WINDOW_ACKNOWLEDGMENT: return (EObject)createReleaseTimeWindowAcknowledgment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisForkLSA createPrognosisForkLSA() {
		PrognosisForkLSA prognosisForkLSA = new PrognosisForkLSA();
		return prognosisForkLSA;
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
	public MarkedPosition createMarkedPosition() {
		MarkedPosition markedPosition = new MarkedPosition();
		return markedPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Priority createPriority() {
		Priority priority = new Priority();
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseTimeWindowForLSA createReleaseTimeWindowForLSA() {
		ReleaseTimeWindowForLSA releaseTimeWindowForLSA = new ReleaseTimeWindowForLSA();
		return releaseTimeWindowForLSA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSlotAndPosition createTimeSlotAndPosition() {
		TimeSlotAndPosition timeSlotAndPosition = new TimeSlotAndPosition();
		return timeSlotAndPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectReleaseTimeWindow createSelectReleaseTimeWindow() {
		SelectReleaseTimeWindow selectReleaseTimeWindow = new SelectReleaseTimeWindow();
		return selectReleaseTimeWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseTimeWindowAcknowledgment createReleaseTimeWindowAcknowledgment() {
		ReleaseTimeWindowAcknowledgment releaseTimeWindowAcknowledgment = new ReleaseTimeWindowAcknowledgment();
		return releaseTimeWindowAcknowledgment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KLSA_InterfacePackage getKLSA_InterfacePackage() {
		return (KLSA_InterfacePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KLSA_InterfacePackage getPackage() {
		return KLSA_InterfacePackage.eINSTANCE;
	}

} //KLSA_InterfaceFactory
