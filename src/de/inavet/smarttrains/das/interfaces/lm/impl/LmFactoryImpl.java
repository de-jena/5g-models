/**
 */
package de.inavet.smarttrains.das.interfaces.lm.impl;

import de.inavet.smarttrains.das.interfaces.lm.*;

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
public class LmFactoryImpl extends EFactoryImpl implements LmFactory {
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
		return new LmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LmFactoryImpl() {
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
			case LmPackage.PROGNOSIS_FOR_LM: return createPrognosisForLM();
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD: return createPrognosisPositionAndElectricalLoad();
			case LmPackage.ELECTRICAL_LOAD: return createElectricalLoad();
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
		PrognosisForLMImpl prognosisForLM = new PrognosisForLMImpl();
		return prognosisForLM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrognosisPositionAndElectricalLoad createPrognosisPositionAndElectricalLoad() {
		PrognosisPositionAndElectricalLoadImpl prognosisPositionAndElectricalLoad = new PrognosisPositionAndElectricalLoadImpl();
		return prognosisPositionAndElectricalLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalLoad createElectricalLoad() {
		ElectricalLoadImpl electricalLoad = new ElectricalLoadImpl();
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

} //LmFactoryImpl
