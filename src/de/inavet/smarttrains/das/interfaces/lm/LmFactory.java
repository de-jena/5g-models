/**
 */
package de.inavet.smarttrains.das.interfaces.lm;

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
public class LmFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LmFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LmFactory INSTANCE = de.inavet.smarttrains.das.interfaces.lm.LmFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LmFactory init() {
		try {
			LmFactory theLmFactory = (LmFactory)EPackage.Registry.INSTANCE.getEFactory(LmPackage.eNS_URI);
			if (theLmFactory != null) {
				return theLmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LmFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LmFactory() {
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
			case LmPackage.PROGNOSIS_FOR_LM: return (EObject)createPrognosisForLM();
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD: return (EObject)createPrognosisPositionAndElectricalLoad();
			case LmPackage.ELECTRICAL_LOAD: return (EObject)createElectricalLoad();
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
	public LmPackage getLmPackage() {
		return (LmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LmPackage getPackage() {
		return LmPackage.eINSTANCE;
	}

} //LmFactory
