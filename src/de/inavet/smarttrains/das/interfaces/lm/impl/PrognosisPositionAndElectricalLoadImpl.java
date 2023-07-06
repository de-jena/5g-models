/**
 */
package de.inavet.smarttrains.das.interfaces.lm.impl;

import de.inavet.smarttrains.das.interfaces.lm.ElectricalLoad;
import de.inavet.smarttrains.das.interfaces.lm.LmPackage;
import de.inavet.smarttrains.das.interfaces.lm.PrognosisPositionAndElectricalLoad;

import de.inavet.smarttrains.das.interfaces.utils.Position;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prognosis Position And Electrical Load</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.lm.impl.PrognosisPositionAndElectricalLoadImpl#getTimestampForPrognosis <em>Timestamp For Prognosis</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.lm.impl.PrognosisPositionAndElectricalLoadImpl#getPrognosisPosition <em>Prognosis Position</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.lm.impl.PrognosisPositionAndElectricalLoadImpl#getElectricalLoadPrognosis <em>Electrical Load Prognosis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrognosisPositionAndElectricalLoadImpl extends MinimalEObjectImpl.Container implements PrognosisPositionAndElectricalLoad {
	/**
	 * The default value of the '{@link #getTimestampForPrognosis() <em>Timestamp For Prognosis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestampForPrognosis()
	 * @generated
	 * @ordered
	 */
	protected static final long TIMESTAMP_FOR_PROGNOSIS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimestampForPrognosis() <em>Timestamp For Prognosis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestampForPrognosis()
	 * @generated
	 * @ordered
	 */
	protected long timestampForPrognosis = TIMESTAMP_FOR_PROGNOSIS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrognosisPosition() <em>Prognosis Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrognosisPosition()
	 * @generated
	 * @ordered
	 */
	protected Position prognosisPosition;

	/**
	 * The cached value of the '{@link #getElectricalLoadPrognosis() <em>Electrical Load Prognosis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricalLoadPrognosis()
	 * @generated
	 * @ordered
	 */
	protected ElectricalLoad electricalLoadPrognosis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrognosisPositionAndElectricalLoadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LmPackage.Literals.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimestampForPrognosis() {
		return timestampForPrognosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestampForPrognosis(long newTimestampForPrognosis) {
		long oldTimestampForPrognosis = timestampForPrognosis;
		timestampForPrognosis = newTimestampForPrognosis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__TIMESTAMP_FOR_PROGNOSIS, oldTimestampForPrognosis, timestampForPrognosis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPrognosisPosition() {
		if (prognosisPosition != null && ((EObject)prognosisPosition).eIsProxy()) {
			InternalEObject oldPrognosisPosition = prognosisPosition;
			prognosisPosition = (Position)eResolveProxy(oldPrognosisPosition);
			if (prognosisPosition != oldPrognosisPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__PROGNOSIS_POSITION, oldPrognosisPosition, prognosisPosition));
			}
		}
		return prognosisPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position basicGetPrognosisPosition() {
		return prognosisPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrognosisPosition(Position newPrognosisPosition) {
		Position oldPrognosisPosition = prognosisPosition;
		prognosisPosition = newPrognosisPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__PROGNOSIS_POSITION, oldPrognosisPosition, prognosisPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalLoad getElectricalLoadPrognosis() {
		if (electricalLoadPrognosis != null && electricalLoadPrognosis.eIsProxy()) {
			InternalEObject oldElectricalLoadPrognosis = (InternalEObject)electricalLoadPrognosis;
			electricalLoadPrognosis = (ElectricalLoad)eResolveProxy(oldElectricalLoadPrognosis);
			if (electricalLoadPrognosis != oldElectricalLoadPrognosis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__ELECTRICAL_LOAD_PROGNOSIS, oldElectricalLoadPrognosis, electricalLoadPrognosis));
			}
		}
		return electricalLoadPrognosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalLoad basicGetElectricalLoadPrognosis() {
		return electricalLoadPrognosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectricalLoadPrognosis(ElectricalLoad newElectricalLoadPrognosis) {
		ElectricalLoad oldElectricalLoadPrognosis = electricalLoadPrognosis;
		electricalLoadPrognosis = newElectricalLoadPrognosis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__ELECTRICAL_LOAD_PROGNOSIS, oldElectricalLoadPrognosis, electricalLoadPrognosis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__TIMESTAMP_FOR_PROGNOSIS:
				return getTimestampForPrognosis();
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__PROGNOSIS_POSITION:
				if (resolve) return getPrognosisPosition();
				return basicGetPrognosisPosition();
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__ELECTRICAL_LOAD_PROGNOSIS:
				if (resolve) return getElectricalLoadPrognosis();
				return basicGetElectricalLoadPrognosis();
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
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__TIMESTAMP_FOR_PROGNOSIS:
				setTimestampForPrognosis((Long)newValue);
				return;
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__PROGNOSIS_POSITION:
				setPrognosisPosition((Position)newValue);
				return;
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__ELECTRICAL_LOAD_PROGNOSIS:
				setElectricalLoadPrognosis((ElectricalLoad)newValue);
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
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__TIMESTAMP_FOR_PROGNOSIS:
				setTimestampForPrognosis(TIMESTAMP_FOR_PROGNOSIS_EDEFAULT);
				return;
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__PROGNOSIS_POSITION:
				setPrognosisPosition((Position)null);
				return;
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__ELECTRICAL_LOAD_PROGNOSIS:
				setElectricalLoadPrognosis((ElectricalLoad)null);
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
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__TIMESTAMP_FOR_PROGNOSIS:
				return timestampForPrognosis != TIMESTAMP_FOR_PROGNOSIS_EDEFAULT;
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__PROGNOSIS_POSITION:
				return prognosisPosition != null;
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__ELECTRICAL_LOAD_PROGNOSIS:
				return electricalLoadPrognosis != null;
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
		result.append(" (timestampForPrognosis: ");
		result.append(timestampForPrognosis);
		result.append(')');
		return result.toString();
	}

} //PrognosisPositionAndElectricalLoadImpl
