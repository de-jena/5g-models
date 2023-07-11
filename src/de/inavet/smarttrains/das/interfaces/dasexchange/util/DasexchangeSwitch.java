/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange.util;

import de.inavet.smarttrains.das.interfaces.dasexchange.*;

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
 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage
 * @generated
 */
public class DasexchangeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DasexchangePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DasexchangeSwitch() {
		if (modelPackage == null) {
			modelPackage = DasexchangePackage.eINSTANCE;
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
			case DasexchangePackage.DAS_EXCHANGE: {
				DASExchange dasExchange = (DASExchange)theEObject;
				T result = caseDASExchange(dasExchange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DasexchangePackage.DAS_EXCHANGE_RESPONSE: {
				DASExchangeResponse dasExchangeResponse = (DASExchangeResponse)theEObject;
				T result = caseDASExchangeResponse(dasExchangeResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DasexchangePackage.RECOMMENDATION: {
				Recommendation recommendation = (Recommendation)theEObject;
				T result = caseRecommendation(recommendation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DasexchangePackage.RECOMMENDATION_RESPONSE_FROM_MOBILE: {
				RecommendationResponseFromMobile recommendationResponseFromMobile = (RecommendationResponseFromMobile)theEObject;
				T result = caseRecommendationResponseFromMobile(recommendationResponseFromMobile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DasexchangePackage.TIME_SLOT_ON_JOURNEY: {
				TimeSlotOnJourney timeSlotOnJourney = (TimeSlotOnJourney)theEObject;
				T result = caseTimeSlotOnJourney(timeSlotOnJourney);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DasexchangePackage.TIME_SLOT: {
				TimeSlot timeSlot = (TimeSlot)theEObject;
				T result = caseTimeSlot(timeSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DasexchangePackage.SPEED_OVER_POSITION: {
				SpeedOverPosition speedOverPosition = (SpeedOverPosition)theEObject;
				T result = caseSpeedOverPosition(speedOverPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DasexchangePackage.SPEED_OVER_TIME: {
				SpeedOverTime speedOverTime = (SpeedOverTime)theEObject;
				T result = caseSpeedOverTime(speedOverTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DasexchangePackage.POSITION_OVER_TIME: {
				PositionOverTime positionOverTime = (PositionOverTime)theEObject;
				T result = casePositionOverTime(positionOverTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FOR_JOURNEY: {
				PrognosisTimeSlotForJourney prognosisTimeSlotForJourney = (PrognosisTimeSlotForJourney)theEObject;
				T result = casePrognosisTimeSlotForJourney(prognosisTimeSlotForJourney);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DasexchangePackage.TRAJECTORY: {
				Trajectory trajectory = (Trajectory)theEObject;
				T result = caseTrajectory(trajectory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAS Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAS Exchange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDASExchange(DASExchange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAS Exchange Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAS Exchange Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDASExchangeResponse(DASExchangeResponse object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Position Over Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position Over Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositionOverTime(PositionOverTime object) {
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

} //DasexchangeSwitch
