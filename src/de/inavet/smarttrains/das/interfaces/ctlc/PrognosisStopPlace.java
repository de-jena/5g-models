/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prognosis Stop Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace#getStopPosition <em>Stop Position</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace#getPrognosedPlace <em>Prognosed Place</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrognosisStopPlace extends MinimalEObjectImpl.Container {
	/**
	 * The cached value of the '{@link #getStopPosition() <em>Stop Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopPosition()
	 * @generated
	 * @ordered
	 */
	protected MarkedPosition stopPosition;

	/**
	 * The default value of the '{@link #getPrognosedPlace() <em>Prognosed Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrognosedPlace()
	 * @generated
	 * @ordered
	 */
	protected static final int PROGNOSED_PLACE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrognosedPlace() <em>Prognosed Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrognosedPlace()
	 * @generated
	 * @ordered
	 */
	protected int prognosedPlace = PROGNOSED_PLACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrognosisStopPlace() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtlcPackage.Literals.PROGNOSIS_STOP_PLACE;
	}

	/**
	 * Returns the value of the '<em><b>Stop Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Position</em>' reference.
	 * @see #setStopPosition(MarkedPosition)
	 * @generated
	 */
	public MarkedPosition getStopPosition() {
		if (stopPosition != null && ((EObject)stopPosition).eIsProxy()) {
			InternalEObject oldStopPosition = stopPosition;
			stopPosition = (MarkedPosition)eResolveProxy(oldStopPosition);
			if (stopPosition != oldStopPosition) {
			}
		}
		return stopPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkedPosition basicGetStopPosition() {
		return stopPosition;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace#getStopPosition <em>Stop Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newStopPosition the new value of the '<em>Stop Position</em>' reference.
	 * @see #getStopPosition()
	 * @generated
	 */
	public void setStopPosition(MarkedPosition newStopPosition) {
		stopPosition = newStopPosition;
	}

	/**
	 * Returns the value of the '<em><b>Prognosed Place</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prognosed Place</em>' attribute.
	 * @see #setPrognosedPlace(int)
	 * @generated
	 */
	public int getPrognosedPlace() {
		return prognosedPlace;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace#getPrognosedPlace <em>Prognosed Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newPrognosedPlace the new value of the '<em>Prognosed Place</em>' attribute.
	 * @see #getPrognosedPlace()
	 * @generated
	 */
	public void setPrognosedPlace(int newPrognosedPlace) {
		prognosedPlace = newPrognosedPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CtlcPackage.PROGNOSIS_STOP_PLACE__STOP_POSITION:
				if (resolve) return getStopPosition();
				return basicGetStopPosition();
			case CtlcPackage.PROGNOSIS_STOP_PLACE__PROGNOSED_PLACE:
				return getPrognosedPlace();
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
			case CtlcPackage.PROGNOSIS_STOP_PLACE__STOP_POSITION:
				setStopPosition((MarkedPosition)newValue);
				return;
			case CtlcPackage.PROGNOSIS_STOP_PLACE__PROGNOSED_PLACE:
				setPrognosedPlace((Integer)newValue);
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
			case CtlcPackage.PROGNOSIS_STOP_PLACE__STOP_POSITION:
				setStopPosition((MarkedPosition)null);
				return;
			case CtlcPackage.PROGNOSIS_STOP_PLACE__PROGNOSED_PLACE:
				setPrognosedPlace(PROGNOSED_PLACE_EDEFAULT);
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
			case CtlcPackage.PROGNOSIS_STOP_PLACE__STOP_POSITION:
				return stopPosition != null;
			case CtlcPackage.PROGNOSIS_STOP_PLACE__PROGNOSED_PLACE:
				return prognosedPlace != PROGNOSED_PLACE_EDEFAULT;
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
		result.append(" (prognosedPlace: ");
		result.append(prognosedPlace);
		result.append(')');
		return result.toString();
	}

} // PrognosisStopPlace
