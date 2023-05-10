/**
 */
package lm_interface;

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
public class Lm_interfaceFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Lm_interfaceFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Lm_interfaceFactory INSTANCE = lm_interface.Lm_interfaceFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Lm_interfaceFactory init() {
		try {
			Lm_interfaceFactory theLm_interfaceFactory = (Lm_interfaceFactory)EPackage.Registry.INSTANCE.getEFactory(Lm_interfacePackage.eNS_URI);
			if (theLm_interfaceFactory != null) {
				return theLm_interfaceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Lm_interfaceFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lm_interfaceFactory() {
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
			case Lm_interfacePackage.PROGNOSIS_FOR_LM: return (EObject)createPrognosisForLM();
			case Lm_interfacePackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD: return (EObject)createPrognosisPositionAndElectricalLoad();
			case Lm_interfacePackage.ELECTRICAL_LOAD: return (EObject)createElectricalLoad();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisForLM createPrognosisForLM() {
		PrognosisForLM prognosisForLM = new PrognosisForLM();
		return prognosisForLM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisPositionAndElectricalLoad createPrognosisPositionAndElectricalLoad() {
		PrognosisPositionAndElectricalLoad prognosisPositionAndElectricalLoad = new PrognosisPositionAndElectricalLoad();
		return prognosisPositionAndElectricalLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalLoad createElectricalLoad() {
		ElectricalLoad electricalLoad = new ElectricalLoad();
		return electricalLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lm_interfacePackage getLm_interfacePackage() {
		return (Lm_interfacePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Lm_interfacePackage getPackage() {
		return Lm_interfacePackage.eINSTANCE;
	}

} //Lm_interfaceFactory
