/**
 */
package de.inavet.smarttrains.das.interfaces.lm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.inavet.smarttrains.das.interfaces.lm.LmFactory
 * @model kind="package"
 * @generated
 */
public interface LmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://inavet.de/datamodels/lm/v1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LmPackage eINSTANCE = de.inavet.smarttrains.das.interfaces.lm.impl.LmPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.lm.impl.PrognosisForLMImpl <em>Prognosis For LM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.lm.impl.PrognosisForLMImpl
	 * @see de.inavet.smarttrains.das.interfaces.lm.impl.LmPackageImpl#getPrognosisForLM()
	 * @generated
	 */
	int PROGNOSIS_FOR_LM = 0;

	/**
	 * The feature id for the '<em><b>Present Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_FOR_LM__PRESENT_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_FOR_LM__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Present Electrical Load</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_FOR_LM__PRESENT_ELECTRICAL_LOAD = 2;

	/**
	 * The feature id for the '<em><b>Prognosis For Position And Electrical Load</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_FOR_LM__PROGNOSIS_FOR_POSITION_AND_ELECTRICAL_LOAD = 3;

	/**
	 * The number of structural features of the '<em>Prognosis For LM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_FOR_LM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Prognosis For LM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_FOR_LM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.lm.impl.PrognosisPositionAndElectricalLoadImpl <em>Prognosis Position And Electrical Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.lm.impl.PrognosisPositionAndElectricalLoadImpl
	 * @see de.inavet.smarttrains.das.interfaces.lm.impl.LmPackageImpl#getPrognosisPositionAndElectricalLoad()
	 * @generated
	 */
	int PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD = 1;

	/**
	 * The feature id for the '<em><b>Timestamp For Prognosis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__TIMESTAMP_FOR_PROGNOSIS = 0;

	/**
	 * The feature id for the '<em><b>Prognosis Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__PROGNOSIS_POSITION = 1;

	/**
	 * The feature id for the '<em><b>Electrical Load Prognosis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__ELECTRICAL_LOAD_PROGNOSIS = 2;

	/**
	 * The number of structural features of the '<em>Prognosis Position And Electrical Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Prognosis Position And Electrical Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.inavet.smarttrains.das.interfaces.lm.impl.ElectricalLoadImpl <em>Electrical Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.inavet.smarttrains.das.interfaces.lm.impl.ElectricalLoadImpl
	 * @see de.inavet.smarttrains.das.interfaces.lm.impl.LmPackageImpl#getElectricalLoad()
	 * @generated
	 */
	int ELECTRICAL_LOAD = 2;

	/**
	 * The feature id for the '<em><b>Drive Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_LOAD__DRIVE_POWER = 0;

	/**
	 * The feature id for the '<em><b>Auxiliary Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_LOAD__AUXILIARY_POWER = 1;

	/**
	 * The number of structural features of the '<em>Electrical Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_LOAD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Electrical Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_LOAD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisForLM <em>Prognosis For LM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prognosis For LM</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.lm.PrognosisForLM
	 * @generated
	 */
	EClass getPrognosisForLM();

	/**
	 * Returns the meta object for the containment reference '{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisForLM#getPresentPosition <em>Present Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Present Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.lm.PrognosisForLM#getPresentPosition()
	 * @see #getPrognosisForLM()
	 * @generated
	 */
	EReference getPrognosisForLM_PresentPosition();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisForLM#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.lm.PrognosisForLM#getTimestamp()
	 * @see #getPrognosisForLM()
	 * @generated
	 */
	EAttribute getPrognosisForLM_Timestamp();

	/**
	 * Returns the meta object for the containment reference '{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisForLM#getPresentElectricalLoad <em>Present Electrical Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Present Electrical Load</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.lm.PrognosisForLM#getPresentElectricalLoad()
	 * @see #getPrognosisForLM()
	 * @generated
	 */
	EReference getPrognosisForLM_PresentElectricalLoad();

	/**
	 * Returns the meta object for the containment reference list '{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisForLM#getPrognosisForPositionAndElectricalLoad <em>Prognosis For Position And Electrical Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prognosis For Position And Electrical Load</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.lm.PrognosisForLM#getPrognosisForPositionAndElectricalLoad()
	 * @see #getPrognosisForLM()
	 * @generated
	 */
	EReference getPrognosisForLM_PrognosisForPositionAndElectricalLoad();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisPositionAndElectricalLoad <em>Prognosis Position And Electrical Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prognosis Position And Electrical Load</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.lm.PrognosisPositionAndElectricalLoad
	 * @generated
	 */
	EClass getPrognosisPositionAndElectricalLoad();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisPositionAndElectricalLoad#getTimestampForPrognosis <em>Timestamp For Prognosis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp For Prognosis</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.lm.PrognosisPositionAndElectricalLoad#getTimestampForPrognosis()
	 * @see #getPrognosisPositionAndElectricalLoad()
	 * @generated
	 */
	EAttribute getPrognosisPositionAndElectricalLoad_TimestampForPrognosis();

	/**
	 * Returns the meta object for the containment reference '{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisPositionAndElectricalLoad#getPrognosisPosition <em>Prognosis Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prognosis Position</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.lm.PrognosisPositionAndElectricalLoad#getPrognosisPosition()
	 * @see #getPrognosisPositionAndElectricalLoad()
	 * @generated
	 */
	EReference getPrognosisPositionAndElectricalLoad_PrognosisPosition();

	/**
	 * Returns the meta object for the containment reference '{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisPositionAndElectricalLoad#getElectricalLoadPrognosis <em>Electrical Load Prognosis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Electrical Load Prognosis</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.lm.PrognosisPositionAndElectricalLoad#getElectricalLoadPrognosis()
	 * @see #getPrognosisPositionAndElectricalLoad()
	 * @generated
	 */
	EReference getPrognosisPositionAndElectricalLoad_ElectricalLoadPrognosis();

	/**
	 * Returns the meta object for class '{@link de.inavet.smarttrains.das.interfaces.lm.ElectricalLoad <em>Electrical Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electrical Load</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.lm.ElectricalLoad
	 * @generated
	 */
	EClass getElectricalLoad();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.lm.ElectricalLoad#getDrivePower <em>Drive Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drive Power</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.lm.ElectricalLoad#getDrivePower()
	 * @see #getElectricalLoad()
	 * @generated
	 */
	EAttribute getElectricalLoad_DrivePower();

	/**
	 * Returns the meta object for the attribute '{@link de.inavet.smarttrains.das.interfaces.lm.ElectricalLoad#getAuxiliaryPower <em>Auxiliary Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auxiliary Power</em>'.
	 * @see de.inavet.smarttrains.das.interfaces.lm.ElectricalLoad#getAuxiliaryPower()
	 * @see #getElectricalLoad()
	 * @generated
	 */
	EAttribute getElectricalLoad_AuxiliaryPower();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LmFactory getLmFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.lm.impl.PrognosisForLMImpl <em>Prognosis For LM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.lm.impl.PrognosisForLMImpl
		 * @see de.inavet.smarttrains.das.interfaces.lm.impl.LmPackageImpl#getPrognosisForLM()
		 * @generated
		 */
		EClass PROGNOSIS_FOR_LM = eINSTANCE.getPrognosisForLM();

		/**
		 * The meta object literal for the '<em><b>Present Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGNOSIS_FOR_LM__PRESENT_POSITION = eINSTANCE.getPrognosisForLM_PresentPosition();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGNOSIS_FOR_LM__TIMESTAMP = eINSTANCE.getPrognosisForLM_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Present Electrical Load</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGNOSIS_FOR_LM__PRESENT_ELECTRICAL_LOAD = eINSTANCE.getPrognosisForLM_PresentElectricalLoad();

		/**
		 * The meta object literal for the '<em><b>Prognosis For Position And Electrical Load</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGNOSIS_FOR_LM__PROGNOSIS_FOR_POSITION_AND_ELECTRICAL_LOAD = eINSTANCE.getPrognosisForLM_PrognosisForPositionAndElectricalLoad();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.lm.impl.PrognosisPositionAndElectricalLoadImpl <em>Prognosis Position And Electrical Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.lm.impl.PrognosisPositionAndElectricalLoadImpl
		 * @see de.inavet.smarttrains.das.interfaces.lm.impl.LmPackageImpl#getPrognosisPositionAndElectricalLoad()
		 * @generated
		 */
		EClass PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD = eINSTANCE.getPrognosisPositionAndElectricalLoad();

		/**
		 * The meta object literal for the '<em><b>Timestamp For Prognosis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__TIMESTAMP_FOR_PROGNOSIS = eINSTANCE.getPrognosisPositionAndElectricalLoad_TimestampForPrognosis();

		/**
		 * The meta object literal for the '<em><b>Prognosis Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__PROGNOSIS_POSITION = eINSTANCE.getPrognosisPositionAndElectricalLoad_PrognosisPosition();

		/**
		 * The meta object literal for the '<em><b>Electrical Load Prognosis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__ELECTRICAL_LOAD_PROGNOSIS = eINSTANCE.getPrognosisPositionAndElectricalLoad_ElectricalLoadPrognosis();

		/**
		 * The meta object literal for the '{@link de.inavet.smarttrains.das.interfaces.lm.impl.ElectricalLoadImpl <em>Electrical Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.inavet.smarttrains.das.interfaces.lm.impl.ElectricalLoadImpl
		 * @see de.inavet.smarttrains.das.interfaces.lm.impl.LmPackageImpl#getElectricalLoad()
		 * @generated
		 */
		EClass ELECTRICAL_LOAD = eINSTANCE.getElectricalLoad();

		/**
		 * The meta object literal for the '<em><b>Drive Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRICAL_LOAD__DRIVE_POWER = eINSTANCE.getElectricalLoad_DrivePower();

		/**
		 * The meta object literal for the '<em><b>Auxiliary Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRICAL_LOAD__AUXILIARY_POWER = eINSTANCE.getElectricalLoad_AuxiliaryPower();

	}

} //LmPackage
