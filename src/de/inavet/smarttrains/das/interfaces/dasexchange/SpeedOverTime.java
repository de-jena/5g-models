/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import de.inavet.smarttrains.das.interfaces.utils.ValueItem;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speed Over Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hilfsklasse, Geschwindigkeit über Zeit
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime#getSpeed <em>Speed</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpeedOverTime extends MinimalEObjectImpl.Container {
	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected ValueItem speed;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeedOverTime() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DasexchangePackage.Literals.SPEED_OVER_TIME;
	}

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' reference.
	 * @see #setSpeed(ValueItem)
	 * @generated
	 */
	public ValueItem getSpeed() {
		if (speed != null && ((EObject)speed).eIsProxy()) {
			InternalEObject oldSpeed = speed;
			speed = (ValueItem)eResolveProxy(oldSpeed);
			if (speed != oldSpeed) {
			}
		}
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueItem basicGetSpeed() {
		return speed;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime#getSpeed <em>Speed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newSpeed the new value of the '<em>Speed</em>' reference.
	 * @see #getSpeed()
	 * @generated
	 */
	public void setSpeed(ValueItem newSpeed) {
		speed = newSpeed;
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
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.SpeedOverTime#getTimestamp <em>Timestamp</em>}' attribute.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DasexchangePackage.SPEED_OVER_TIME__SPEED:
				if (resolve) return getSpeed();
				return basicGetSpeed();
			case DasexchangePackage.SPEED_OVER_TIME__TIMESTAMP:
				return getTimestamp();
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
			case DasexchangePackage.SPEED_OVER_TIME__SPEED:
				setSpeed((ValueItem)newValue);
				return;
			case DasexchangePackage.SPEED_OVER_TIME__TIMESTAMP:
				setTimestamp((ZonedDateTime)newValue);
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
			case DasexchangePackage.SPEED_OVER_TIME__SPEED:
				setSpeed((ValueItem)null);
				return;
			case DasexchangePackage.SPEED_OVER_TIME__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
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
			case DasexchangePackage.SPEED_OVER_TIME__SPEED:
				return speed != null;
			case DasexchangePackage.SPEED_OVER_TIME__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
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

} // SpeedOverTime
