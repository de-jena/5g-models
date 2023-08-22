/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc.util;

import de.inavet.smarttrains.das.interfaces.ctlc.*;

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
 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage
 * @generated
 */
public class CtlcSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CtlcPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtlcSwitch() {
		if (modelPackage == null) {
			modelPackage = CtlcPackage.eINSTANCE;
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
			case CtlcPackage.PERIODIC_UPDATE: {
				PeriodicUpdate periodicUpdate = (PeriodicUpdate)theEObject;
				T result = casePeriodicUpdate(periodicUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtlcPackage.UPDATE_FOR_VEHICLE: {
				UpdateForVehicle updateForVehicle = (UpdateForVehicle)theEObject;
				T result = caseUpdateForVehicle(updateForVehicle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION: {
				PrognosisArrivalAndPosition prognosisArrivalAndPosition = (PrognosisArrivalAndPosition)theEObject;
				T result = casePrognosisArrivalAndPosition(prognosisArrivalAndPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtlcPackage.PROGNOSIS_STOP_PLACE: {
				PrognosisStopPlace prognosisStopPlace = (PrognosisStopPlace)theEObject;
				T result = casePrognosisStopPlace(prognosisStopPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtlcPackage.MARKED_POSITION: {
				MarkedPosition markedPosition = (MarkedPosition)theEObject;
				T result = caseMarkedPosition(markedPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST: {
				ReleaseTimePrognosisRequest releaseTimePrognosisRequest = (ReleaseTimePrognosisRequest)theEObject;
				T result = caseReleaseTimePrognosisRequest(releaseTimePrognosisRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtlcPackage.SCENARIO: {
				Scenario scenario = (Scenario)theEObject;
				T result = caseScenario(scenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtlcPackage.PROGNOSIS_OVERRIDE: {
				PrognosisOverride prognosisOverride = (PrognosisOverride)theEObject;
				T result = casePrognosisOverride(prognosisOverride);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE: {
				ReleaseTimePrognosisResponse releaseTimePrognosisResponse = (ReleaseTimePrognosisResponse)theEObject;
				T result = caseReleaseTimePrognosisResponse(releaseTimePrognosisResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtlcPackage.SCENARIO_PROGNOSIS: {
				ScenarioPrognosis scenarioPrognosis = (ScenarioPrognosis)theEObject;
				T result = caseScenarioPrognosis(scenarioPrognosis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtlcPackage.RELEASE_TIME_VECTOR: {
				ReleaseTimeVector releaseTimeVector = (ReleaseTimeVector)theEObject;
				T result = caseReleaseTimeVector(releaseTimeVector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CtlcPackage.SIGNAL_GROUP: {
				SignalGroup signalGroup = (SignalGroup)theEObject;
				T result = caseSignalGroup(signalGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicUpdate(PeriodicUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update For Vehicle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update For Vehicle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateForVehicle(UpdateForVehicle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prognosis Arrival And Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prognosis Arrival And Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrognosisArrivalAndPosition(PrognosisArrivalAndPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prognosis Stop Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prognosis Stop Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrognosisStopPlace(PrognosisStopPlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkedPosition(MarkedPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release Time Prognosis Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release Time Prognosis Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReleaseTimePrognosisRequest(ReleaseTimePrognosisRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenario(Scenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prognosis Override</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prognosis Override</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrognosisOverride(PrognosisOverride object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release Time Prognosis Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release Time Prognosis Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReleaseTimePrognosisResponse(ReleaseTimePrognosisResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario Prognosis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario Prognosis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarioPrognosis(ScenarioPrognosis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release Time Vector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release Time Vector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReleaseTimeVector(ReleaseTimeVector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalGroup(SignalGroup object) {
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

} //CtlcSwitch
