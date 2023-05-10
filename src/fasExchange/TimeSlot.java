/**
 */
package fasExchange;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zeitfensterdefinition
 * Hilfsklasse
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fasExchange.TimeSlot#getBeginOfTimeSlot <em>Begin Of Time Slot</em>}</li>
 *   <li>{@link fasExchange.TimeSlot#getEndOfTimeSlot <em>End Of Time Slot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSlot extends MinimalEObjectImpl.Container {
	/**
	 * The default value of the '{@link #getBeginOfTimeSlot() <em>Begin Of Time Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginOfTimeSlot()
	 * @generated
	 * @ordered
	 */
	protected static final ZonedDateTime BEGIN_OF_TIME_SLOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginOfTimeSlot() <em>Begin Of Time Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginOfTimeSlot()
	 * @generated
	 * @ordered
	 */
	protected ZonedDateTime beginOfTimeSlot = BEGIN_OF_TIME_SLOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndOfTimeSlot() <em>End Of Time Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndOfTimeSlot()
	 * @generated
	 * @ordered
	 */
	protected static final ZonedDateTime END_OF_TIME_SLOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndOfTimeSlot() <em>End Of Time Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndOfTimeSlot()
	 * @generated
	 * @ordered
	 */
	protected ZonedDateTime endOfTimeSlot = END_OF_TIME_SLOT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSlot() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FasExchangePackage.Literals.TIME_SLOT;
	}

	/**
	 * Returns the value of the '<em><b>Begin Of Time Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Begin des Zeitfenster
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Begin Of Time Slot</em>' attribute.
	 * @see #setBeginOfTimeSlot(ZonedDateTime)
	 * @generated
	 */
	public ZonedDateTime getBeginOfTimeSlot() {
		return beginOfTimeSlot;
	}

	/**
	 * Sets the value of the '{@link fasExchange.TimeSlot#getBeginOfTimeSlot <em>Begin Of Time Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newBeginOfTimeSlot the new value of the '<em>Begin Of Time Slot</em>' attribute.
	 * @see #getBeginOfTimeSlot()
	 * @generated
	 */
	public void setBeginOfTimeSlot(ZonedDateTime newBeginOfTimeSlot) {
		beginOfTimeSlot = newBeginOfTimeSlot;
	}

	/**
	 * Returns the value of the '<em><b>End Of Time Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dauer oder Größe des Zeitfenster
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Of Time Slot</em>' attribute.
	 * @see #setEndOfTimeSlot(ZonedDateTime)
	 * @generated
	 */
	public ZonedDateTime getEndOfTimeSlot() {
		return endOfTimeSlot;
	}

	/**
	 * Sets the value of the '{@link fasExchange.TimeSlot#getEndOfTimeSlot <em>End Of Time Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newEndOfTimeSlot the new value of the '<em>End Of Time Slot</em>' attribute.
	 * @see #getEndOfTimeSlot()
	 * @generated
	 */
	public void setEndOfTimeSlot(ZonedDateTime newEndOfTimeSlot) {
		endOfTimeSlot = newEndOfTimeSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FasExchangePackage.TIME_SLOT__BEGIN_OF_TIME_SLOT:
				return getBeginOfTimeSlot();
			case FasExchangePackage.TIME_SLOT__END_OF_TIME_SLOT:
				return getEndOfTimeSlot();
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
			case FasExchangePackage.TIME_SLOT__BEGIN_OF_TIME_SLOT:
				setBeginOfTimeSlot((ZonedDateTime)newValue);
				return;
			case FasExchangePackage.TIME_SLOT__END_OF_TIME_SLOT:
				setEndOfTimeSlot((ZonedDateTime)newValue);
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
			case FasExchangePackage.TIME_SLOT__BEGIN_OF_TIME_SLOT:
				setBeginOfTimeSlot(BEGIN_OF_TIME_SLOT_EDEFAULT);
				return;
			case FasExchangePackage.TIME_SLOT__END_OF_TIME_SLOT:
				setEndOfTimeSlot(END_OF_TIME_SLOT_EDEFAULT);
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
			case FasExchangePackage.TIME_SLOT__BEGIN_OF_TIME_SLOT:
				return BEGIN_OF_TIME_SLOT_EDEFAULT == null ? beginOfTimeSlot != null : !BEGIN_OF_TIME_SLOT_EDEFAULT.equals(beginOfTimeSlot);
			case FasExchangePackage.TIME_SLOT__END_OF_TIME_SLOT:
				return END_OF_TIME_SLOT_EDEFAULT == null ? endOfTimeSlot != null : !END_OF_TIME_SLOT_EDEFAULT.equals(endOfTimeSlot);
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
		result.append(" (beginOfTimeSlot: ");
		result.append(beginOfTimeSlot);
		result.append(", endOfTimeSlot: ");
		result.append(endOfTimeSlot);
		result.append(')');
		return result.toString();
	}

} // TimeSlot
