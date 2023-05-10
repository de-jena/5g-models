/**
 */
package fasExchange.util;

import fasExchange.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fasExchange.FasExchangePackage
 * @generated
 */
public class FasExchangeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FasExchangePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FasExchangeSwitch() {
		if (modelPackage == null) {
			modelPackage = FasExchangePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FasExchangePackage.FAS_EXCHANGE: {
				FASExchange fasExchange = (FASExchange)theEObject;
				T result = caseFASExchange(fasExchange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FasExchangePackage.FAS_EXCHANGE_RESPONSE: {
				FASExchangeResponse fasExchangeResponse = (FASExchangeResponse)theEObject;
				T result = caseFASExchangeResponse(fasExchangeResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FasExchangePackage.RECOMMENDATION: {
				Recommendation recommendation = (Recommendation)theEObject;
				T result = caseRecommendation(recommendation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FasExchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE: {
				RecommendationResponseFromMobile recommendationResponseFromMobile = (RecommendationResponseFromMobile)theEObject;
				T result = caseRecommendationResponseFromMobile(recommendationResponseFromMobile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FasExchangePackage.TIME_SLOT_ON_JOURNEY: {
				TimeSlotOnJourney timeSlotOnJourney = (TimeSlotOnJourney)theEObject;
				T result = caseTimeSlotOnJourney(timeSlotOnJourney);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FasExchangePackage.TIME_SLOT: {
				TimeSlot timeSlot = (TimeSlot)theEObject;
				T result = caseTimeSlot(timeSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FasExchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA: {
				PrognosisTimeSlotFromkLSA prognosisTimeSlotFromkLSA = (PrognosisTimeSlotFromkLSA)theEObject;
				T result = casePrognosisTimeSlotFromkLSA(prognosisTimeSlotFromkLSA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FasExchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND: {
				PrognosisForVehiclePowerDemand prognosisForVehiclePowerDemand = (PrognosisForVehiclePowerDemand)theEObject;
				T result = casePrognosisForVehiclePowerDemand(prognosisForVehiclePowerDemand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FasExchangePackage.POWER_DEMAND_OVER_POSITION: {
				PowerDemandOverPosition powerDemandOverPosition = (PowerDemandOverPosition)theEObject;
				T result = casePowerDemandOverPosition(powerDemandOverPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FasExchangePackage.POWER_DEMAND_OVER_TIME: {
				PowerDemandOverTime powerDemandOverTime = (PowerDemandOverTime)theEObject;
				T result = casePowerDemandOverTime(powerDemandOverTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FasExchangePackage.SPEED_OVER_POSITION: {
				SpeedOverPosition speedOverPosition = (SpeedOverPosition)theEObject;
				T result = caseSpeedOverPosition(speedOverPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FasExchangePackage.SPEED_OVER_TIME: {
				SpeedOverTime speedOverTime = (SpeedOverTime)theEObject;
				T result = caseSpeedOverTime(speedOverTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FasExchangePackage.PROGNOSIS_TIME_SLOT_FOR_JOURNEY: {
				PrognosisTimeSlotForJourney prognosisTimeSlotForJourney = (PrognosisTimeSlotForJourney)theEObject;
				T result = casePrognosisTimeSlotForJourney(prognosisTimeSlotForJourney);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FasExchangePackage.TRAJECTORY: {
				Trajectory trajectory = (Trajectory)theEObject;
				T result = caseTrajectory(trajectory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FasExchangePackage.TRAJECTORY_LEFT_FROM_MOBILE: {
				TrajectoryLeftFromMobile trajectoryLeftFromMobile = (TrajectoryLeftFromMobile)theEObject;
				T result = caseTrajectoryLeftFromMobile(trajectoryLeftFromMobile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FAS Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FAS Exchange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFASExchange(FASExchange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FAS Exchange Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FAS Exchange Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFASExchangeResponse(FASExchangeResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recommendation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recommendation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecommendation(Recommendation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recommendation Response From Mobile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recommendation Response From Mobile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecommendationResponseFromMobile(RecommendationResponseFromMobile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Slot On Journey</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Slot On Journey</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSlotOnJourney(TimeSlotOnJourney object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSlot(TimeSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prognosis Time Slot Fromk LSA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prognosis Time Slot Fromk LSA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrognosisTimeSlotFromkLSA(PrognosisTimeSlotFromkLSA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prognosis For Vehicle Power Demand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prognosis For Vehicle Power Demand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrognosisForVehiclePowerDemand(PrognosisForVehiclePowerDemand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Demand Over Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Demand Over Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerDemandOverPosition(PowerDemandOverPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Demand Over Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Demand Over Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerDemandOverTime(PowerDemandOverTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speed Over Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speed Over Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeedOverPosition(SpeedOverPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speed Over Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speed Over Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeedOverTime(SpeedOverTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prognosis Time Slot For Journey</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prognosis Time Slot For Journey</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrognosisTimeSlotForJourney(PrognosisTimeSlotForJourney object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trajectory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trajectory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrajectory(Trajectory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trajectory Left From Mobile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trajectory Left From Mobile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrajectoryLeftFromMobile(TrajectoryLeftFromMobile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FasExchangeSwitch
