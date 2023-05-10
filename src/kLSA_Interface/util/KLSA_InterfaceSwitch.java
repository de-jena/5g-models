/**
 */
package kLSA_Interface.util;

import kLSA_Interface.*;

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
 * @see kLSA_Interface.KLSA_InterfacePackage
 * @generated
 */
public class KLSA_InterfaceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KLSA_InterfacePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KLSA_InterfaceSwitch() {
		if (modelPackage == null) {
			modelPackage = KLSA_InterfacePackage.eINSTANCE;
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
			case KLSA_InterfacePackage.PROGNOSIS_FORK_LSA: {
				PrognosisForkLSA prognosisForkLSA = (PrognosisForkLSA)theEObject;
				T result = casePrognosisForkLSA(prognosisForkLSA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KLSA_InterfacePackage.PROGNOSIS_ARRIVAL_AND_POSITION: {
				PrognosisArrivalAndPosition prognosisArrivalAndPosition = (PrognosisArrivalAndPosition)theEObject;
				T result = casePrognosisArrivalAndPosition(prognosisArrivalAndPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KLSA_InterfacePackage.MARKED_POSITION: {
				MarkedPosition markedPosition = (MarkedPosition)theEObject;
				T result = caseMarkedPosition(markedPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KLSA_InterfacePackage.PRIORITY: {
				Priority priority = (Priority)theEObject;
				T result = casePriority(priority);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KLSA_InterfacePackage.RELEASE_TIME_WINDOW_FOR_LSA: {
				ReleaseTimeWindowForLSA releaseTimeWindowForLSA = (ReleaseTimeWindowForLSA)theEObject;
				T result = caseReleaseTimeWindowForLSA(releaseTimeWindowForLSA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KLSA_InterfacePackage.TIME_SLOT_AND_POSITION: {
				TimeSlotAndPosition timeSlotAndPosition = (TimeSlotAndPosition)theEObject;
				T result = caseTimeSlotAndPosition(timeSlotAndPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prognosis Fork LSA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prognosis Fork LSA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrognosisForkLSA(PrognosisForkLSA object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Priority</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Priority</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePriority(Priority object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release Time Window For LSA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release Time Window For LSA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReleaseTimeWindowForLSA(ReleaseTimeWindowForLSA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Slot And Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Slot And Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSlotAndPosition(TimeSlotAndPosition object) {
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

} //KLSA_InterfaceSwitch
