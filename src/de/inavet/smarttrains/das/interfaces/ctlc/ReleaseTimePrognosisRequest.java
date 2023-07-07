/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

import java.time.ZonedDateTime;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Release Time Prognosis Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Explicit request to the prognosis functionality to return release time probabilities for all tram related signals of an intersection.
 * Optionally, the request may contain prognosis scenarios, which contains of arrival time prognoses that differ from those sent by the periodic state update.
 * In this case, the prognosis functionailty should create a release time prognoses for each of the scenarios in addition to the default prognosis based on the already known state.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getRequestId <em>Request Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getIntersectionId <em>Intersection Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReleaseTimePrognosisRequest extends MinimalEObjectImpl.Container {
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
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' reference list.
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
	protected ReleaseTimePrognosisRequest() {
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
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(ZonedDateTime)
	 * @generated
	 */
	public ZonedDateTime getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTimestamp the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	public void setTimestamp(ZonedDateTime newTimestamp) {
		timestamp = newTimestamp;
	}

	/**
	 * Returns the value of the '<em><b>Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Id</em>' attribute.
	 * @see #setRequestId(String)
	 * @generated
	 */
	public String getRequestId() {
		return requestId;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getRequestId <em>Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRequestId the new value of the '<em>Request Id</em>' attribute.
	 * @see #getRequestId()
	 * @generated
	 */
	public void setRequestId(String newRequestId) {
		requestId = newRequestId;
	}

	/**
	 * Returns the value of the '<em><b>Intersection Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the intersection for which the prognosis shall be performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intersection Id</em>' attribute.
	 * @see #setIntersectionId(String)
	 * @generated
	 */
	public String getIntersectionId() {
		return intersectionId;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest#getIntersectionId <em>Intersection Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newIntersectionId the new value of the '<em>Intersection Id</em>' attribute.
	 * @see #getIntersectionId()
	 * @generated
	 */
	public void setIntersectionId(String newIntersectionId) {
		intersectionId = newIntersectionId;
	}

	/**
	 * Returns the value of the '<em><b>Scenarios</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.ctlc.Scenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenarios</em>' reference list.
	 * @generated
	 */
	public EList<Scenario> getScenarios() {
		if (scenarios == null) {
			scenarios = new BasicInternalEList<Scenario>(Scenario.class);
		}
		return scenarios;
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

} // ReleaseTimePrognosisRequest
