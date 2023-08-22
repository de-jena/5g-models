/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc.impl;

import de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage;
import de.inavet.smarttrains.das.interfaces.ctlc.MarkedPosition;
import de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prognosis Stop Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.PrognosisStopPlaceImpl#getStopPosition <em>Stop Position</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.PrognosisStopPlaceImpl#getPrognosedPlace <em>Prognosed Place</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrognosisStopPlaceImpl extends MinimalEObjectImpl.Container implements PrognosisStopPlace {
	/**
	 * The cached value of the '{@link #getStopPosition() <em>Stop Position</em>}' containment reference.
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
	protected PrognosisStopPlaceImpl() {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkedPosition getStopPosition() {
		return stopPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStopPosition(MarkedPosition newStopPosition, NotificationChain msgs) {
		MarkedPosition oldStopPosition = stopPosition;
		stopPosition = newStopPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtlcPackage.PROGNOSIS_STOP_PLACE__STOP_POSITION, oldStopPosition, newStopPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopPosition(MarkedPosition newStopPosition) {
		if (newStopPosition != stopPosition) {
			NotificationChain msgs = null;
			if (stopPosition != null)
				msgs = ((InternalEObject)stopPosition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtlcPackage.PROGNOSIS_STOP_PLACE__STOP_POSITION, null, msgs);
			if (newStopPosition != null)
				msgs = ((InternalEObject)newStopPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtlcPackage.PROGNOSIS_STOP_PLACE__STOP_POSITION, null, msgs);
			msgs = basicSetStopPosition(newStopPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtlcPackage.PROGNOSIS_STOP_PLACE__STOP_POSITION, newStopPosition, newStopPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrognosedPlace() {
		return prognosedPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrognosedPlace(int newPrognosedPlace) {
		int oldPrognosedPlace = prognosedPlace;
		prognosedPlace = newPrognosedPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtlcPackage.PROGNOSIS_STOP_PLACE__PROGNOSED_PLACE, oldPrognosedPlace, prognosedPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtlcPackage.PROGNOSIS_STOP_PLACE__STOP_POSITION:
				return basicSetStopPosition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
				return getStopPosition();
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

} //PrognosisStopPlaceImpl
