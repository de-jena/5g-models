/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange.util;

import de.inavet.smarttrains.das.interfaces.dasexchange.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage
 * @generated
 */
public class DasexchangeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DasexchangePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DasexchangeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DasexchangePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DasexchangeSwitch<Adapter> modelSwitch =
		new DasexchangeSwitch<Adapter>() {
			@Override
			public Adapter caseDASExchange(DASExchange object) {
				return createDASExchangeAdapter();
			}
			@Override
			public Adapter caseDASExchangeResponse(DASExchangeResponse object) {
				return createDASExchangeResponseAdapter();
			}
			@Override
			public Adapter caseRecommendation(Recommendation object) {
				return createRecommendationAdapter();
			}
			@Override
			public Adapter caseRecommendationResponseFromMobile(RecommendationResponseFromMobile object) {
				return createRecommendationResponseFromMobileAdapter();
			}
			@Override
			public Adapter caseTimeSlotOnJourney(TimeSlotOnJourney object) {
				return createTimeSlotOnJourneyAdapter();
			}
			@Override
			public Adapter caseTimeSlot(TimeSlot object) {
				return createTimeSlotAdapter();
			}
			@Override
			public Adapter casePrognosisTimeSlotFromkLSA(PrognosisTimeSlotFromkLSA object) {
				return createPrognosisTimeSlotFromkLSAAdapter();
			}
			@Override
			public Adapter casePrognosisForVehiclePowerDemand(PrognosisForVehiclePowerDemand object) {
				return createPrognosisForVehiclePowerDemandAdapter();
			}
			@Override
			public Adapter casePowerDemandOverPosition(PowerDemandOverPosition object) {
				return createPowerDemandOverPositionAdapter();
			}
			@Override
			public Adapter casePowerDemandOverTime(PowerDemandOverTime object) {
				return createPowerDemandOverTimeAdapter();
			}
			@Override
			public Adapter caseSpeedOverPosition(SpeedOverPosition object) {
				return createSpeedOverPositionAdapter();
			}
			@Override
			public Adapter caseSpeedOverTime(SpeedOverTime object) {
				return createSpeedOverTimeAdapter();
			}
			@Override
			public Adapter casePositionOverTime(PositionOverTime object) {
				return createPositionOverTimeAdapter();
			}
			@Override
			public Adapter casePrognosisTimeSlotForJourney(PrognosisTimeSlotForJourney object) {
				return createPrognosisTimeSlotForJourneyAdapter();
			}
			@Override
			public Adapter caseTrajectory(Trajectory object) {
				return createTrajectoryAdapter();
			}
			@Override
			public Adapter caseTrajectoryLeftFromMobile(TrajectoryLeftFromMobile object) {
				return createTrajectoryLeftFromMobileAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange <em>DAS Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange
	 * @generated
	 */
	public Adapter createDASExchangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse <em>DAS Exchange Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DASExchangeResponse
	 * @generated
	 */
	public Adapter createDASExchangeResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation <em>Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation
	 * @generated
	 */
	public Adapter createRecommendationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile <em>Recommendation Response From Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.RecommendationResponseFromMobile
	 * @generated
	 */
	public Adapter createRecommendationResponseFromMobileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney <em>Time Slot On Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney
	 * @generated
	 */
	public Adapter createTimeSlotOnJourneyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot <em>Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot
	 * @generated
	 */
	public Adapter createTimeSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA <em>Prognosis Time Slot Fromk LSA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA
	 * @generated
	 */
	public Adapter createPrognosisTimeSlotFromkLSAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisForVehiclePowerDemand <em>Prognosis For Vehicle Power Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisForVehiclePowerDemand
	 * @generated
	 */
	public Adapter createPrognosisForVehiclePowerDemandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverPosition <em>Power Demand Over Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverPosition
	 * @generated
	 */
	public Adapter createPowerDemandOverPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverTime <em>Power Demand Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverTime
	 * @generated
	 */
	public Adapter createPowerDemandOverTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition <em>Speed Over Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverPosition
	 * @generated
	 */
	public Adapter createSpeedOverPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime <em>Speed Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime
	 * @generated
	 */
	public Adapter createSpeedOverTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PositionOverTime <em>Position Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PositionOverTime
	 * @generated
	 */
	public Adapter createPositionOverTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney <em>Prognosis Time Slot For Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney
	 * @generated
	 */
	public Adapter createPrognosisTimeSlotForJourneyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory <em>Trajectory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory
	 * @generated
	 */
	public Adapter createTrajectoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TrajectoryLeftFromMobile <em>Trajectory Left From Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.TrajectoryLeftFromMobile
	 * @generated
	 */
	public Adapter createTrajectoryLeftFromMobileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DasexchangeAdapterFactory
