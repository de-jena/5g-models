/**
 */
package de.inavet.smarttrains.das.interfaces.lm.impl;

import de.inavet.smarttrains.das.interfaces.lm.ElectricalLoad;
import de.inavet.smarttrains.das.interfaces.lm.LmPackage;
import de.inavet.smarttrains.das.interfaces.lm.PrognosisPositionAndElectricalLoad;

import de.inavet.smarttrains.das.interfaces.utils.Position;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
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
	 * The cached value of the '{@link #getPrognosisPosition() <em>Prognosis Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrognosisPosition()
	 * @generated
	 * @ordered
	 */
	protected Position prognosisPosition;

	/**
	 * The cached value of the '{@link #getElectricalLoadPrognosis() <em>Electrical Load Prognosis</em>}' containment reference.
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
		return prognosisPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrognosisPosition(Position newPrognosisPosition, NotificationChain msgs) {
		Position oldPrognosisPosition = prognosisPosition;
		prognosisPosition = newPrognosisPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__PROGNOSIS_POSITION, oldPrognosisPosition, newPrognosisPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrognosisPosition(Position newPrognosisPosition) {
		if (newPrognosisPosition != prognosisPosition) {
			NotificationChain msgs = null;
			if (prognosisPosition != null)
				msgs = ((InternalEObject)prognosisPosition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__PROGNOSIS_POSITION, null, msgs);
			if (newPrognosisPosition != null)
				msgs = ((InternalEObject)newPrognosisPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__PROGNOSIS_POSITION, null, msgs);
			msgs = basicSetPrognosisPosition(newPrognosisPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__PROGNOSIS_POSITION, newPrognosisPosition, newPrognosisPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalLoad getElectricalLoadPrognosis() {
		return electricalLoadPrognosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElectricalLoadPrognosis(ElectricalLoad newElectricalLoadPrognosis, NotificationChain msgs) {
		ElectricalLoad oldElectricalLoadPrognosis = electricalLoadPrognosis;
		electricalLoadPrognosis = newElectricalLoadPrognosis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__ELECTRICAL_LOAD_PROGNOSIS, oldElectricalLoadPrognosis, newElectricalLoadPrognosis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectricalLoadPrognosis(ElectricalLoad newElectricalLoadPrognosis) {
		if (newElectricalLoadPrognosis != electricalLoadPrognosis) {
			NotificationChain msgs = null;
			if (electricalLoadPrognosis != null)
				msgs = ((InternalEObject)electricalLoadPrognosis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__ELECTRICAL_LOAD_PROGNOSIS, null, msgs);
			if (newElectricalLoadPrognosis != null)
				msgs = ((InternalEObject)newElectricalLoadPrognosis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__ELECTRICAL_LOAD_PROGNOSIS, null, msgs);
			msgs = basicSetElectricalLoadPrognosis(newElectricalLoadPrognosis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__ELECTRICAL_LOAD_PROGNOSIS, newElectricalLoadPrognosis, newElectricalLoadPrognosis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__PROGNOSIS_POSITION:
				return basicSetPrognosisPosition(null, msgs);
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__ELECTRICAL_LOAD_PROGNOSIS:
				return basicSetElectricalLoadPrognosis(null, msgs);
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
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__TIMESTAMP_FOR_PROGNOSIS:
				return getTimestampForPrognosis();
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__PROGNOSIS_POSITION:
				return getPrognosisPosition();
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__ELECTRICAL_LOAD_PROGNOSIS:
				return getElectricalLoadPrognosis();
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
