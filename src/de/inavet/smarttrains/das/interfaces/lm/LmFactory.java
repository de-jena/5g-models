/**
 */
package de.inavet.smarttrains.das.interfaces.lm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.inavet.smarttrains.das.interfaces.lm.LmPackage
 * @generated
 */
public interface LmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LmFactory eINSTANCE = de.inavet.smarttrains.das.interfaces.lm.impl.LmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Prognosis For LM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prognosis For LM</em>'.
	 * @generated
	 */
	PrognosisForLM createPrognosisForLM();

	/**
	 * Returns a new object of class '<em>Prognosis Position And Electrical Load</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prognosis Position And Electrical Load</em>'.
	 * @generated
	 */
	PrognosisPositionAndElectricalLoad createPrognosisPositionAndElectricalLoad();

	/**
	 * Returns a new object of class '<em>Electrical Load</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Electrical Load</em>'.
	 * @generated
	 */
	ElectricalLoad createElectricalLoad();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LmPackage getLmPackage();

} //LmFactory
