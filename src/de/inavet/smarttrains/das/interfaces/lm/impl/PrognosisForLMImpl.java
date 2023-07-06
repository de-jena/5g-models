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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
	 * The cached value of the '{@link #getPresentPosition() <em>Present Position</em>}' reference.
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
	 * The cached value of the '{@link #getPresentElectricalLoad() <em>Present Electrical Load</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentElectricalLoad()
	 * @generated
	 * @ordered
	 */
	protected ElectricalLoad presentElectricalLoad;

	/**
	 * The cached value of the '{@link #getPrognosisForPositionAndElectricalLoad() <em>Prognosis For Position And Electrical Load</em>}' reference list.
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
		if (presentPosition != null && ((EObject)presentPosition).eIsProxy()) {
			InternalEObject oldPresentPosition = presentPosition;
			presentPosition = (Position)eResolveProxy(oldPresentPosition);
			if (presentPosition != oldPresentPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LmPackage.PROGNOSIS_FOR_LM__PRESENT_POSITION, oldPresentPosition, presentPosition));
			}
		}
		return presentPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position basicGetPresentPosition() {
		return presentPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentPosition(Position newPresentPosition) {
		Position oldPresentPosition = presentPosition;
		presentPosition = newPresentPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LmPackage.PROGNOSIS_FOR_LM__PRESENT_POSITION, oldPresentPosition, presentPosition));
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
		if (presentElectricalLoad != null && presentElectricalLoad.eIsProxy()) {
			InternalEObject oldPresentElectricalLoad = (InternalEObject)presentElectricalLoad;
			presentElectricalLoad = (ElectricalLoad)eResolveProxy(oldPresentElectricalLoad);
			if (presentElectricalLoad != oldPresentElectricalLoad) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LmPackage.PROGNOSIS_FOR_LM__PRESENT_ELECTRICAL_LOAD, oldPresentElectricalLoad, presentElectricalLoad));
			}
		}
		return presentElectricalLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalLoad basicGetPresentElectricalLoad() {
		return presentElectricalLoad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentElectricalLoad(ElectricalLoad newPresentElectricalLoad) {
		ElectricalLoad oldPresentElectricalLoad = presentElectricalLoad;
		presentElectricalLoad = newPresentElectricalLoad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LmPackage.PROGNOSIS_FOR_LM__PRESENT_ELECTRICAL_LOAD, oldPresentElectricalLoad, presentElectricalLoad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrognosisPositionAndElectricalLoad> getPrognosisForPositionAndElectricalLoad() {
		if (prognosisForPositionAndElectricalLoad == null) {
			prognosisForPositionAndElectricalLoad = new EObjectResolvingEList<PrognosisPositionAndElectricalLoad>(PrognosisPositionAndElectricalLoad.class, this, LmPackage.PROGNOSIS_FOR_LM__PROGNOSIS_FOR_POSITION_AND_ELECTRICAL_LOAD);
		}
		return prognosisForPositionAndElectricalLoad;
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
				if (resolve) return getPresentPosition();
				return basicGetPresentPosition();
			case LmPackage.PROGNOSIS_FOR_LM__TIMESTAMP:
				return getTimestamp();
			case LmPackage.PROGNOSIS_FOR_LM__PRESENT_ELECTRICAL_LOAD:
				if (resolve) return getPresentElectricalLoad();
				return basicGetPresentElectricalLoad();
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
