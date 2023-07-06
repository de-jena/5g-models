/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc.impl;

import de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage;
import de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse;
import de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector;
import de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis;

import java.time.ZonedDateTime;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Release Time Prognosis Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.ReleaseTimePrognosisResponseImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.ReleaseTimePrognosisResponseImpl#getRefRequestId <em>Ref Request Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.ReleaseTimePrognosisResponseImpl#getReleaseTimes <em>Release Times</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.ReleaseTimePrognosisResponseImpl#getReleaseTimesForScenarios <em>Release Times For Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReleaseTimePrognosisResponseImpl extends MinimalEObjectImpl.Container implements ReleaseTimePrognosisResponse {
	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final ZonedDateTime TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected ZonedDateTime timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefRequestId() <em>Ref Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefRequestId()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_REQUEST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefRequestId() <em>Ref Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefRequestId()
	 * @generated
	 * @ordered
	 */
	protected String refRequestId = REF_REQUEST_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReleaseTimes() <em>Release Times</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseTimes()
	 * @generated
	 * @ordered
	 */
	protected EList<ReleaseTimeVector> releaseTimes;

	/**
	 * The cached value of the '{@link #getReleaseTimesForScenarios() <em>Release Times For Scenarios</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseTimesForScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<ScenarioPrognosis> releaseTimesForScenarios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReleaseTimePrognosisResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtlcPackage.Literals.RELEASE_TIME_PROGNOSIS_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZonedDateTime getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(ZonedDateTime newTimestamp) {
		ZonedDateTime oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefRequestId() {
		return refRequestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefRequestId(String newRefRequestId) {
		String oldRefRequestId = refRequestId;
		refRequestId = newRefRequestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE__REF_REQUEST_ID, oldRefRequestId, refRequestId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReleaseTimeVector> getReleaseTimes() {
		if (releaseTimes == null) {
			releaseTimes = new EObjectResolvingEList<ReleaseTimeVector>(ReleaseTimeVector.class, this, CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE__RELEASE_TIMES);
		}
		return releaseTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScenarioPrognosis> getReleaseTimesForScenarios() {
		if (releaseTimesForScenarios == null) {
			releaseTimesForScenarios = new EObjectResolvingEList<ScenarioPrognosis>(ScenarioPrognosis.class, this, CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE__RELEASE_TIMES_FOR_SCENARIOS);
		}
		return releaseTimesForScenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE__TIMESTAMP:
				return getTimestamp();
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE__REF_REQUEST_ID:
				return getRefRequestId();
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE__RELEASE_TIMES:
				return getReleaseTimes();
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE__RELEASE_TIMES_FOR_SCENARIOS:
				return getReleaseTimesForScenarios();
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
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE__TIMESTAMP:
				setTimestamp((ZonedDateTime)newValue);
				return;
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE__REF_REQUEST_ID:
				setRefRequestId((String)newValue);
				return;
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE__RELEASE_TIMES:
				getReleaseTimes().clear();
				getReleaseTimes().addAll((Collection<? extends ReleaseTimeVector>)newValue);
				return;
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE__RELEASE_TIMES_FOR_SCENARIOS:
				getReleaseTimesForScenarios().clear();
				getReleaseTimesForScenarios().addAll((Collection<? extends ScenarioPrognosis>)newValue);
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
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE__REF_REQUEST_ID:
				setRefRequestId(REF_REQUEST_ID_EDEFAULT);
				return;
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE__RELEASE_TIMES:
				getReleaseTimes().clear();
				return;
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE__RELEASE_TIMES_FOR_SCENARIOS:
				getReleaseTimesForScenarios().clear();
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
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE__REF_REQUEST_ID:
				return REF_REQUEST_ID_EDEFAULT == null ? refRequestId != null : !REF_REQUEST_ID_EDEFAULT.equals(refRequestId);
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE__RELEASE_TIMES:
				return releaseTimes != null && !releaseTimes.isEmpty();
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_RESPONSE__RELEASE_TIMES_FOR_SCENARIOS:
				return releaseTimesForScenarios != null && !releaseTimesForScenarios.isEmpty();
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
		result.append(", refRequestId: ");
		result.append(refRequestId);
		result.append(')');
		return result.toString();
	}

} //ReleaseTimePrognosisResponseImpl
