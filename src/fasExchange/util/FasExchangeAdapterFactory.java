/**
 */
package fasExchange.util;

import fasExchange.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fasExchange.FasExchangePackage
 * @generated
 */
public class FasExchangeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FasExchangePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FasExchangeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FasExchangePackage.eINSTANCE;
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
	protected FasExchangeSwitch<Adapter> modelSwitch =
		new FasExchangeSwitch<Adapter>() {
			@Override
			public Adapter caseFASExchange(FASExchange object) {
				return createFASExchangeAdapter();
			}
			@Override
			public Adapter caseFASExchangeResponse(FASExchangeResponse object) {
				return createFASExchangeResponseAdapter();
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
	 * Creates a new adapter for an object of class '{@link fasExchange.FASExchange <em>FAS Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fasExchange.FASExchange
	 * @generated
	 */
	public Adapter createFASExchangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fasExchange.FASExchangeResponse <em>FAS Exchange Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fasExchange.FASExchangeResponse
	 * @generated
	 */
	public Adapter createFASExchangeResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fasExchange.Recommendation <em>Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fasExchange.Recommendation
	 * @generated
	 */
	public Adapter createRecommendationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fasExchange.RecommendationResponseFromMobile <em>Recommendation Response From Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fasExchange.RecommendationResponseFromMobile
	 * @generated
	 */
	public Adapter createRecommendationResponseFromMobileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fasExchange.TimeSlotOnJourney <em>Time Slot On Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fasExchange.TimeSlotOnJourney
	 * @generated
	 */
	public Adapter createTimeSlotOnJourneyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fasExchange.TimeSlot <em>Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fasExchange.TimeSlot
	 * @generated
	 */
	public Adapter createTimeSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fasExchange.PrognosisTimeSlotFromkLSA <em>Prognosis Time Slot Fromk LSA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fasExchange.PrognosisTimeSlotFromkLSA
	 * @generated
	 */
	public Adapter createPrognosisTimeSlotFromkLSAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fasExchange.PrognosisForVehiclePowerDemand <em>Prognosis For Vehicle Power Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fasExchange.PrognosisForVehiclePowerDemand
	 * @generated
	 */
	public Adapter createPrognosisForVehiclePowerDemandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fasExchange.PowerDemandOverPosition <em>Power Demand Over Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fasExchange.PowerDemandOverPosition
	 * @generated
	 */
	public Adapter createPowerDemandOverPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fasExchange.PowerDemandOverTime <em>Power Demand Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fasExchange.PowerDemandOverTime
	 * @generated
	 */
	public Adapter createPowerDemandOverTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fasExchange.SpeedOverPosition <em>Speed Over Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fasExchange.SpeedOverPosition
	 * @generated
	 */
	public Adapter createSpeedOverPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fasExchange.SpeedOverTime <em>Speed Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fasExchange.SpeedOverTime
	 * @generated
	 */
	public Adapter createSpeedOverTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fasExchange.PositionOverTime <em>Position Over Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fasExchange.PositionOverTime
	 * @generated
	 */
	public Adapter createPositionOverTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fasExchange.PrognosisTimeSlotForJourney <em>Prognosis Time Slot For Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fasExchange.PrognosisTimeSlotForJourney
	 * @generated
	 */
	public Adapter createPrognosisTimeSlotForJourneyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fasExchange.Trajectory <em>Trajectory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fasExchange.Trajectory
	 * @generated
	 */
	public Adapter createTrajectoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fasExchange.TrajectoryLeftFromMobile <em>Trajectory Left From Mobile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fasExchange.TrajectoryLeftFromMobile
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

} //FasExchangeAdapterFactory
