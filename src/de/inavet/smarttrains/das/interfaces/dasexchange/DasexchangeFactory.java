/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage
 * @generated
 */
public interface DasexchangeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DasexchangeFactory eINSTANCE = de.inavet.smarttrains.das.interfaces.dasexchange.impl.DasexchangeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DAS Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAS Exchange</em>'.
	 * @generated
	 */
	DASExchange createDASExchange();

	/**
	 * Returns a new object of class '<em>DAS Exchange Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAS Exchange Response</em>'.
	 * @generated
	 */
	DASExchangeResponse createDASExchangeResponse();

	/**
	 * Returns a new object of class '<em>Recommendation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recommendation</em>'.
	 * @generated
	 */
	Recommendation createRecommendation();

	/**
	 * Returns a new object of class '<em>Recommendation Response From Mobile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recommendation Response From Mobile</em>'.
	 * @generated
	 */
	RecommendationResponseFromMobile createRecommendationResponseFromMobile();

	/**
	 * Returns a new object of class '<em>Time Slot On Journey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Slot On Journey</em>'.
	 * @generated
	 */
	TimeSlotOnJourney createTimeSlotOnJourney();

	/**
	 * Returns a new object of class '<em>Time Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Slot</em>'.
	 * @generated
	 */
	TimeSlot createTimeSlot();

	/**
	 * Returns a new object of class '<em>Prognosis Time Slot Fromk LSA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prognosis Time Slot Fromk LSA</em>'.
	 * @generated
	 */
	PrognosisTimeSlotFromkLSA createPrognosisTimeSlotFromkLSA();

	/**
	 * Returns a new object of class '<em>Prognosis For Vehicle Power Demand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prognosis For Vehicle Power Demand</em>'.
	 * @generated
	 */
	PrognosisForVehiclePowerDemand createPrognosisForVehiclePowerDemand();

	/**
	 * Returns a new object of class '<em>Power Demand Over Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Demand Over Position</em>'.
	 * @generated
	 */
	PowerDemandOverPosition createPowerDemandOverPosition();

	/**
	 * Returns a new object of class '<em>Power Demand Over Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Demand Over Time</em>'.
	 * @generated
	 */
	PowerDemandOverTime createPowerDemandOverTime();

	/**
	 * Returns a new object of class '<em>Speed Over Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speed Over Position</em>'.
	 * @generated
	 */
	SpeedOverPosition createSpeedOverPosition();

	/**
	 * Returns a new object of class '<em>Speed Over Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speed Over Time</em>'.
	 * @generated
	 */
	SpeedOverTime createSpeedOverTime();

	/**
	 * Returns a new object of class '<em>Position Over Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Over Time</em>'.
	 * @generated
	 */
	PositionOverTime createPositionOverTime();

	/**
	 * Returns a new object of class '<em>Prognosis Time Slot For Journey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prognosis Time Slot For Journey</em>'.
	 * @generated
	 */
	PrognosisTimeSlotForJourney createPrognosisTimeSlotForJourney();

	/**
	 * Returns a new object of class '<em>Trajectory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trajectory</em>'.
	 * @generated
	 */
	Trajectory createTrajectory();

	/**
	 * Returns a new object of class '<em>Trajectory Left From Mobile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trajectory Left From Mobile</em>'.
	 * @generated
	 */
	TrajectoryLeftFromMobile createTrajectoryLeftFromMobile();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DasexchangePackage getDasexchangePackage();

} //DasexchangeFactory
