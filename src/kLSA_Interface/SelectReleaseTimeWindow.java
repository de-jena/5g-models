/**
 */
package kLSA_Interface;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Release Time Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kLSA_Interface.SelectReleaseTimeWindow#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link kLSA_Interface.SelectReleaseTimeWindow#getPrognosisId <em>Prognosis Id</em>}</li>
 *   <li>{@link kLSA_Interface.SelectReleaseTimeWindow#getTimeWindowId <em>Time Window Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectReleaseTimeWindow extends MinimalEObjectImpl.Container {
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
	 * The default value of the '{@link #getPrognosisId() <em>Prognosis Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrognosisId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGNOSIS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrognosisId() <em>Prognosis Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrognosisId()
	 * @generated
	 * @ordered
	 */
	protected String prognosisId = PROGNOSIS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeWindowId() <em>Time Window Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeWindowId()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_WINDOW_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeWindowId() <em>Time Window Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeWindowId()
	 * @generated
	 * @ordered
	 */
	protected String timeWindowId = TIME_WINDOW_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectReleaseTimeWindow() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KLSA_InterfacePackage.Literals.SELECT_RELEASE_TIME_WINDOW;
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
	 * Sets the value of the '{@link kLSA_Interface.SelectReleaseTimeWindow#getTimestamp <em>Timestamp</em>}' attribute.
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
	 * Returns the value of the '<em><b>Prognosis Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prognosis Id</em>' attribute.
	 * @see #setPrognosisId(String)
	 * @generated
	 */
	public String getPrognosisId() {
		return prognosisId;
	}

	/**
	 * Sets the value of the '{@link kLSA_Interface.SelectReleaseTimeWindow#getPrognosisId <em>Prognosis Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newPrognosisId the new value of the '<em>Prognosis Id</em>' attribute.
	 * @see #getPrognosisId()
	 * @generated
	 */
	public void setPrognosisId(String newPrognosisId) {
		prognosisId = newPrognosisId;
	}

	/**
	 * Returns the value of the '<em><b>Time Window Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Window Id</em>' attribute.
	 * @see #setTimeWindowId(String)
	 * @generated
	 */
	public String getTimeWindowId() {
		return timeWindowId;
	}

	/**
	 * Sets the value of the '{@link kLSA_Interface.SelectReleaseTimeWindow#getTimeWindowId <em>Time Window Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTimeWindowId the new value of the '<em>Time Window Id</em>' attribute.
	 * @see #getTimeWindowId()
	 * @generated
	 */
	public void setTimeWindowId(String newTimeWindowId) {
		timeWindowId = newTimeWindowId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KLSA_InterfacePackage.SELECT_RELEASE_TIME_WINDOW__TIMESTAMP:
				return getTimestamp();
			case KLSA_InterfacePackage.SELECT_RELEASE_TIME_WINDOW__PROGNOSIS_ID:
				return getPrognosisId();
			case KLSA_InterfacePackage.SELECT_RELEASE_TIME_WINDOW__TIME_WINDOW_ID:
				return getTimeWindowId();
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
			case KLSA_InterfacePackage.SELECT_RELEASE_TIME_WINDOW__TIMESTAMP:
				setTimestamp((ZonedDateTime)newValue);
				return;
			case KLSA_InterfacePackage.SELECT_RELEASE_TIME_WINDOW__PROGNOSIS_ID:
				setPrognosisId((String)newValue);
				return;
			case KLSA_InterfacePackage.SELECT_RELEASE_TIME_WINDOW__TIME_WINDOW_ID:
				setTimeWindowId((String)newValue);
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
			case KLSA_InterfacePackage.SELECT_RELEASE_TIME_WINDOW__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case KLSA_InterfacePackage.SELECT_RELEASE_TIME_WINDOW__PROGNOSIS_ID:
				setPrognosisId(PROGNOSIS_ID_EDEFAULT);
				return;
			case KLSA_InterfacePackage.SELECT_RELEASE_TIME_WINDOW__TIME_WINDOW_ID:
				setTimeWindowId(TIME_WINDOW_ID_EDEFAULT);
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
			case KLSA_InterfacePackage.SELECT_RELEASE_TIME_WINDOW__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case KLSA_InterfacePackage.SELECT_RELEASE_TIME_WINDOW__PROGNOSIS_ID:
				return PROGNOSIS_ID_EDEFAULT == null ? prognosisId != null : !PROGNOSIS_ID_EDEFAULT.equals(prognosisId);
			case KLSA_InterfacePackage.SELECT_RELEASE_TIME_WINDOW__TIME_WINDOW_ID:
				return TIME_WINDOW_ID_EDEFAULT == null ? timeWindowId != null : !TIME_WINDOW_ID_EDEFAULT.equals(timeWindowId);
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
		result.append(", prognosisId: ");
		result.append(prognosisId);
		result.append(", timeWindowId: ");
		result.append(timeWindowId);
		result.append(')');
		return result.toString();
	}

} // SelectReleaseTimeWindow
