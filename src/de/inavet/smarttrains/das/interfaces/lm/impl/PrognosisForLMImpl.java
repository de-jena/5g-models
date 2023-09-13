/**
 */
package de.inavet.smarttrains.das.interfaces.lm.impl;

import de.inavet.smarttrains.das.interfaces.lm.ElectricalLoad;
import de.inavet.smarttrains.das.interfaces.lm.LmPackage;
import de.inavet.smarttrains.das.interfaces.lm.PrognosisForLM;
import de.inavet.smarttrains.das.interfaces.lm.PrognosisPositionAndElectricalLoad;

import de.inavet.smarttrains.das.interfaces.utils.Position;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prognosis For LM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.lm.impl.PrognosisForLMImpl#getPresentPosition <em>Present Position</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.lm.impl.PrognosisForLMImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.lm.impl.PrognosisForLMImpl#getPresentElectricalLoad <em>Present Electrical Load</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.lm.impl.PrognosisForLMImpl#getPrognosisForPositionAndElectricalLoad <em>Prognosis For Position And Electrical Load</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrognosisForLMImpl extends MinimalEObjectImpl.Container implements PrognosisForLM {
	/**
	 * The cached value of the '{@link #getPresentPosition() <em>Present Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentPosition()
	 * @generated
	 * @ordered
	 */
	protected Position presentPosition;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final long TIMESTAMP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected long timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPresentElectricalLoad() <em>Present Electrical Load</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentElectricalLoad()
	 * @generated
	 * @ordered
	 */
	protected ElectricalLoad presentElectricalLoad;

	/**
	 * The cached value of the '{@link #getPrognosisForPositionAndElectricalLoad() <em>Prognosis For Position And Electrical Load</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrognosisForPositionAndElectricalLoad()
	 * @generated
	 * @ordered
	 */
	protected EList<PrognosisPositionAndElectricalLoad> prognosisForPositionAndElectricalLoad;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrognosisForLMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LmPackage.Literals.PROGNOSIS_FOR_LM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPresentPosition() {
		return presentPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentPosition(Position newPresentPosition, NotificationChain msgs) {
		Position oldPresentPosition = presentPosition;
		presentPosition = newPresentPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LmPackage.PROGNOSIS_FOR_LM__PRESENT_POSITION, oldPresentPosition, newPresentPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentPosition(Position newPresentPosition) {
		if (newPresentPosition != presentPosition) {
			NotificationChain msgs = null;
			if (presentPosition != null)
				msgs = ((InternalEObject)presentPosition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LmPackage.PROGNOSIS_FOR_LM__PRESENT_POSITION, null, msgs);
			if (newPresentPosition != null)
				msgs = ((InternalEObject)newPresentPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LmPackage.PROGNOSIS_FOR_LM__PRESENT_POSITION, null, msgs);
			msgs = basicSetPresentPosition(newPresentPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LmPackage.PROGNOSIS_FOR_LM__PRESENT_POSITION, newPresentPosition, newPresentPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(long newTimestamp) {
		long oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LmPackage.PROGNOSIS_FOR_LM__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalLoad getPresentElectricalLoad() {
		return presentElectricalLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentElectricalLoad(ElectricalLoad newPresentElectricalLoad, NotificationChain msgs) {
		ElectricalLoad oldPresentElectricalLoad = presentElectricalLoad;
		presentElectricalLoad = newPresentElectricalLoad;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LmPackage.PROGNOSIS_FOR_LM__PRESENT_ELECTRICAL_LOAD, oldPresentElectricalLoad, newPresentElectricalLoad);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentElectricalLoad(ElectricalLoad newPresentElectricalLoad) {
		if (newPresentElectricalLoad != presentElectricalLoad) {
			NotificationChain msgs = null;
			if (presentElectricalLoad != null)
				msgs = ((InternalEObject)presentElectricalLoad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LmPackage.PROGNOSIS_FOR_LM__PRESENT_ELECTRICAL_LOAD, null, msgs);
			if (newPresentElectricalLoad != null)
				msgs = ((InternalEObject)newPresentElectricalLoad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LmPackage.PROGNOSIS_FOR_LM__PRESENT_ELECTRICAL_LOAD, null, msgs);
			msgs = basicSetPresentElectricalLoad(newPresentElectricalLoad, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LmPackage.PROGNOSIS_FOR_LM__PRESENT_ELECTRICAL_LOAD, newPresentElectricalLoad, newPresentElectricalLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrognosisPositionAndElectricalLoad> getPrognosisForPositionAndElectricalLoad() {
		if (prognosisForPositionAndElectricalLoad == null) {
			prognosisForPositionAndElectricalLoad = new EObjectContainmentEList<PrognosisPositionAndElectricalLoad>(PrognosisPositionAndElectricalLoad.class, this, LmPackage.PROGNOSIS_FOR_LM__PROGNOSIS_FOR_POSITION_AND_ELECTRICAL_LOAD);
		}
		return prognosisForPositionAndElectricalLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LmPackage.PROGNOSIS_FOR_LM__PRESENT_POSITION:
				return basicSetPresentPosition(null, msgs);
			case LmPackage.PROGNOSIS_FOR_LM__PRESENT_ELECTRICAL_LOAD:
				return basicSetPresentElectricalLoad(null, msgs);
			case LmPackage.PROGNOSIS_FOR_LM__PROGNOSIS_FOR_POSITION_AND_ELECTRICAL_LOAD:
				return ((InternalEList<?>)getPrognosisForPositionAndElectricalLoad()).basicRemove(otherEnd, msgs);
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
			case LmPackage.PROGNOSIS_FOR_LM__PRESENT_POSITION:
				return getPresentPosition();
			case LmPackage.PROGNOSIS_FOR_LM__TIMESTAMP:
				return getTimestamp();
			case LmPackage.PROGNOSIS_FOR_LM__PRESENT_ELECTRICAL_LOAD:
				return getPresentElectricalLoad();
			case LmPackage.PROGNOSIS_FOR_LM__PROGNOSIS_FOR_POSITION_AND_ELECTRICAL_LOAD:
				return getPrognosisForPositionAndElectricalLoad();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LmPackage.PROGNOSIS_FOR_LM__PRESENT_POSITION:
				setPresentPosition((Position)newValue);
				return;
			case LmPackage.PROGNOSIS_FOR_LM__TIMESTAMP:
				setTimestamp((Long)newValue);
				return;
			case LmPackage.PROGNOSIS_FOR_LM__PRESENT_ELECTRICAL_LOAD:
				setPresentElectricalLoad((ElectricalLoad)newValue);
				return;
			case LmPackage.PROGNOSIS_FOR_LM__PROGNOSIS_FOR_POSITION_AND_ELECTRICAL_LOAD:
				getPrognosisForPositionAndElectricalLoad().clear();
				getPrognosisForPositionAndElectricalLoad().addAll((Collection<? extends PrognosisPositionAndElectricalLoad>)newValue);
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
			case LmPackage.PROGNOSIS_FOR_LM__PRESENT_POSITION:
				setPresentPosition((Position)null);
				return;
			case LmPackage.PROGNOSIS_FOR_LM__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case LmPackage.PROGNOSIS_FOR_LM__PRESENT_ELECTRICAL_LOAD:
				setPresentElectricalLoad((ElectricalLoad)null);
				return;
			case LmPackage.PROGNOSIS_FOR_LM__PROGNOSIS_FOR_POSITION_AND_ELECTRICAL_LOAD:
				getPrognosisForPositionAndElectricalLoad().clear();
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
			case LmPackage.PROGNOSIS_FOR_LM__PRESENT_POSITION:
				return presentPosition != null;
			case LmPackage.PROGNOSIS_FOR_LM__TIMESTAMP:
				return timestamp != TIMESTAMP_EDEFAULT;
			case LmPackage.PROGNOSIS_FOR_LM__PRESENT_ELECTRICAL_LOAD:
				return presentElectricalLoad != null;
			case LmPackage.PROGNOSIS_FOR_LM__PROGNOSIS_FOR_POSITION_AND_ELECTRICAL_LOAD:
				return prognosisForPositionAndElectricalLoad != null && !prognosisForPositionAndElectricalLoad.isEmpty();
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
		result.append(" (timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //PrognosisForLMImpl
