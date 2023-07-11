/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc.impl;

import de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage;
import de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest;
import de.inavet.smarttrains.das.interfaces.ctlc.Scenario;

import java.time.ZonedDateTime;

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
 * An implementation of the model object '<em><b>Release Time Prognosis Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.ReleaseTimePrognosisRequestImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.ReleaseTimePrognosisRequestImpl#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.ReleaseTimePrognosisRequestImpl#getIntersectionId <em>Intersection Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.ReleaseTimePrognosisRequestImpl#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReleaseTimePrognosisRequestImpl extends MinimalEObjectImpl.Container implements ReleaseTimePrognosisRequest {
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
	 * The default value of the '{@link #getRequestId() <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestId()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestId() <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestId()
	 * @generated
	 * @ordered
	 */
	protected String requestId = REQUEST_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntersectionId() <em>Intersection Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntersectionId()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERSECTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntersectionId() <em>Intersection Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntersectionId()
	 * @generated
	 * @ordered
	 */
	protected String intersectionId = INTERSECTION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenarios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReleaseTimePrognosisRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtlcPackage.Literals.RELEASE_TIME_PROGNOSIS_REQUEST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequestId() {
		return requestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestId(String newRequestId) {
		String oldRequestId = requestId;
		requestId = newRequestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST__REQUEST_ID, oldRequestId, requestId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntersectionId() {
		return intersectionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntersectionId(String newIntersectionId) {
		String oldIntersectionId = intersectionId;
		intersectionId = newIntersectionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST__INTERSECTION_ID, oldIntersectionId, intersectionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getScenarios() {
		if (scenarios == null) {
			scenarios = new EObjectContainmentEList<Scenario>(Scenario.class, this, CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST__SCENARIOS);
		}
		return scenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST__SCENARIOS:
				return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
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
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST__TIMESTAMP:
				return getTimestamp();
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST__REQUEST_ID:
				return getRequestId();
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST__INTERSECTION_ID:
				return getIntersectionId();
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST__SCENARIOS:
				return getScenarios();
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
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST__TIMESTAMP:
				setTimestamp((ZonedDateTime)newValue);
				return;
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST__REQUEST_ID:
				setRequestId((String)newValue);
				return;
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST__INTERSECTION_ID:
				setIntersectionId((String)newValue);
				return;
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST__SCENARIOS:
				getScenarios().clear();
				getScenarios().addAll((Collection<? extends Scenario>)newValue);
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
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST__REQUEST_ID:
				setRequestId(REQUEST_ID_EDEFAULT);
				return;
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST__INTERSECTION_ID:
				setIntersectionId(INTERSECTION_ID_EDEFAULT);
				return;
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST__SCENARIOS:
				getScenarios().clear();
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
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST__REQUEST_ID:
				return REQUEST_ID_EDEFAULT == null ? requestId != null : !REQUEST_ID_EDEFAULT.equals(requestId);
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST__INTERSECTION_ID:
				return INTERSECTION_ID_EDEFAULT == null ? intersectionId != null : !INTERSECTION_ID_EDEFAULT.equals(intersectionId);
			case CtlcPackage.RELEASE_TIME_PROGNOSIS_REQUEST__SCENARIOS:
				return scenarios != null && !scenarios.isEmpty();
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
		result.append(", requestId: ");
		result.append(requestId);
		result.append(", intersectionId: ");
		result.append(intersectionId);
		result.append(')');
		return result.toString();
	}

} //ReleaseTimePrognosisRequestImpl
