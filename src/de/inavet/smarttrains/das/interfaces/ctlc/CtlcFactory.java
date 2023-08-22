/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage
 * @generated
 */
public interface CtlcFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CtlcFactory eINSTANCE = de.inavet.smarttrains.das.interfaces.ctlc.impl.CtlcFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Periodic Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic Update</em>'.
	 * @generated
	 */
	PeriodicUpdate createPeriodicUpdate();

	/**
	 * Returns a new object of class '<em>Update For Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update For Vehicle</em>'.
	 * @generated
	 */
	UpdateForVehicle createUpdateForVehicle();

	/**
	 * Returns a new object of class '<em>Prognosis Arrival And Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prognosis Arrival And Position</em>'.
	 * @generated
	 */
	PrognosisArrivalAndPosition createPrognosisArrivalAndPosition();

	/**
	 * Returns a new object of class '<em>Prognosis Stop Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prognosis Stop Place</em>'.
	 * @generated
	 */
	PrognosisStopPlace createPrognosisStopPlace();

	/**
	 * Returns a new object of class '<em>Marked Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marked Position</em>'.
	 * @generated
	 */
	MarkedPosition createMarkedPosition();

	/**
	 * Returns a new object of class '<em>Release Time Prognosis Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Release Time Prognosis Request</em>'.
	 * @generated
	 */
	ReleaseTimePrognosisRequest createReleaseTimePrognosisRequest();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>Prognosis Override</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prognosis Override</em>'.
	 * @generated
	 */
	PrognosisOverride createPrognosisOverride();

	/**
	 * Returns a new object of class '<em>Release Time Prognosis Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Release Time Prognosis Response</em>'.
	 * @generated
	 */
	ReleaseTimePrognosisResponse createReleaseTimePrognosisResponse();

	/**
	 * Returns a new object of class '<em>Scenario Prognosis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario Prognosis</em>'.
	 * @generated
	 */
	ScenarioPrognosis createScenarioPrognosis();

	/**
	 * Returns a new object of class '<em>Release Time Vector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Release Time Vector</em>'.
	 * @generated
	 */
	ReleaseTimeVector createReleaseTimeVector();

	/**
	 * Returns a new object of class '<em>Signal Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Group</em>'.
	 * @generated
	 */
	SignalGroup createSignalGroup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CtlcPackage getCtlcPackage();

} //CtlcFactory
