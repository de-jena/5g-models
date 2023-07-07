/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prognosis Arrival And Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getEstimatedArrivalTime <em>Estimated Arrival Time</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getArrivalPosition <em>Arrival Position</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrognosisArrivalAndPosition extends MinimalEObjectImpl.Container {
	/**
	 * The default value of the '{@link #getEstimatedArrivalTime() <em>Estimated Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected static final ZonedDateTime ESTIMATED_ARRIVAL_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedArrivalTime() <em>Estimated Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected ZonedDateTime estimatedArrivalTime = ESTIMATED_ARRIVAL_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArrivalPosition() <em>Arrival Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalPosition()
	 * @generated
	 * @ordered
	 */
	protected MarkedPosition arrivalPosition;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final double PRIORITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected double priority = PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrognosisArrivalAndPosition() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtlcPackage.Literals.PROGNOSIS_ARRIVAL_AND_POSITION;
	}

	/**
	 * Returns the value of the '<em><b>Estimated Arrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Arrival Time</em>' attribute.
	 * @see #setEstimatedArrivalTime(ZonedDateTime)
	 * @generated
	 */
	public ZonedDateTime getEstimatedArrivalTime() {
		return estimatedArrivalTime;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getEstimatedArrivalTime <em>Estimated Arrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newEstimatedArrivalTime the new value of the '<em>Estimated Arrival Time</em>' attribute.
	 * @see #getEstimatedArrivalTime()
	 * @generated
	 */
	public void setEstimatedArrivalTime(ZonedDateTime newEstimatedArrivalTime) {
		estimatedArrivalTime = newEstimatedArrivalTime;
	}

	/**
	 * Returns the value of the '<em><b>Arrival Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Position</em>' reference.
	 * @see #setArrivalPosition(MarkedPosition)
	 * @generated
	 */
	public MarkedPosition getArrivalPosition() {
		if (arrivalPosition != null && ((EObject)arrivalPosition).eIsProxy()) {
			InternalEObject oldArrivalPosition = arrivalPosition;
			arrivalPosition = (MarkedPosition)eResolveProxy(oldArrivalPosition);
			if (arrivalPosition != oldArrivalPosition) {
			}
		}
		return arrivalPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkedPosition basicGetArrivalPosition() {
		return arrivalPosition;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getArrivalPosition <em>Arrival Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newArrivalPosition the new value of the '<em>Arrival Position</em>' reference.
	 * @see #getArrivalPosition()
	 * @generated
	 */
	public void setArrivalPosition(MarkedPosition newArrivalPosition) {
		arrivalPosition = newArrivalPosition;
	}

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(double)
	 * @generated
	 */
	public double getPriority() {
		return priority;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newPriority the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	public void setPriority(double newPriority) {
		priority = newPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__ESTIMATED_ARRIVAL_TIME:
				return getEstimatedArrivalTime();
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__ARRIVAL_POSITION:
				if (resolve) return getArrivalPosition();
				return basicGetArrivalPosition();
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__PRIORITY:
				return getPriority();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__ESTIMATED_ARRIVAL_TIME:
				setEstimatedArrivalTime((ZonedDateTime)newValue);
				return;
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__ARRIVAL_POSITION:
				setArrivalPosition((MarkedPosition)newValue);
				return;
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__PRIORITY:
				setPriority((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__ESTIMATED_ARRIVAL_TIME:
				setEstimatedArrivalTime(ESTIMATED_ARRIVAL_TIME_EDEFAULT);
				return;
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__ARRIVAL_POSITION:
				setArrivalPosition((MarkedPosition)null);
				return;
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__ESTIMATED_ARRIVAL_TIME:
				return ESTIMATED_ARRIVAL_TIME_EDEFAULT == null ? estimatedArrivalTime != null : !ESTIMATED_ARRIVAL_TIME_EDEFAULT.equals(estimatedArrivalTime);
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__ARRIVAL_POSITION:
				return arrivalPosition != null;
			case CtlcPackage.PROGNOSIS_ARRIVAL_AND_POSITION__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (estimatedArrivalTime: ");
		result.append(estimatedArrivalTime);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} // PrognosisArrivalAndPosition
