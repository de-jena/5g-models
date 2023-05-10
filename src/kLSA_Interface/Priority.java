/**
 */
package kLSA_Interface;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Priority</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hilfsklasse für PrognosisForkLSA
 * Prioritätseinschätzung aus Sicht vom FAS bezüglich Fahrplanlage und Lastmanagement
 * Werte zwischen 0 (keine Priorität) und 1 (absolute Priorität)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kLSA_Interface.Priority#getTimeTablePriority <em>Time Table Priority</em>}</li>
 *   <li>{@link kLSA_Interface.Priority#getLoadManagementPriority <em>Load Management Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Priority extends MinimalEObjectImpl.Container {
	/**
	 * The default value of the '{@link #getTimeTablePriority() <em>Time Table Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeTablePriority()
	 * @generated
	 * @ordered
	 */
	protected static final double TIME_TABLE_PRIORITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTimeTablePriority() <em>Time Table Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeTablePriority()
	 * @generated
	 * @ordered
	 */
	protected double timeTablePriority = TIME_TABLE_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadManagementPriority() <em>Load Management Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadManagementPriority()
	 * @generated
	 * @ordered
	 */
	protected static final double LOAD_MANAGEMENT_PRIORITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLoadManagementPriority() <em>Load Management Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadManagementPriority()
	 * @generated
	 * @ordered
	 */
	protected double loadManagementPriority = LOAD_MANAGEMENT_PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Priority() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KLSA_InterfacePackage.Literals.PRIORITY;
	}

	/**
	 * Returns the value of the '<em><b>Time Table Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Table Priority</em>' attribute.
	 * @see #setTimeTablePriority(double)
	 * @generated
	 */
	public double getTimeTablePriority() {
		return timeTablePriority;
	}

	/**
	 * Sets the value of the '{@link kLSA_Interface.Priority#getTimeTablePriority <em>Time Table Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTimeTablePriority the new value of the '<em>Time Table Priority</em>' attribute.
	 * @see #getTimeTablePriority()
	 * @generated
	 */
	public void setTimeTablePriority(double newTimeTablePriority) {
		timeTablePriority = newTimeTablePriority;
	}

	/**
	 * Returns the value of the '<em><b>Load Management Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Management Priority</em>' attribute.
	 * @see #setLoadManagementPriority(double)
	 * @generated
	 */
	public double getLoadManagementPriority() {
		return loadManagementPriority;
	}

	/**
	 * Sets the value of the '{@link kLSA_Interface.Priority#getLoadManagementPriority <em>Load Management Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLoadManagementPriority the new value of the '<em>Load Management Priority</em>' attribute.
	 * @see #getLoadManagementPriority()
	 * @generated
	 */
	public void setLoadManagementPriority(double newLoadManagementPriority) {
		loadManagementPriority = newLoadManagementPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KLSA_InterfacePackage.PRIORITY__TIME_TABLE_PRIORITY:
				return getTimeTablePriority();
			case KLSA_InterfacePackage.PRIORITY__LOAD_MANAGEMENT_PRIORITY:
				return getLoadManagementPriority();
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
			case KLSA_InterfacePackage.PRIORITY__TIME_TABLE_PRIORITY:
				setTimeTablePriority((Double)newValue);
				return;
			case KLSA_InterfacePackage.PRIORITY__LOAD_MANAGEMENT_PRIORITY:
				setLoadManagementPriority((Double)newValue);
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
			case KLSA_InterfacePackage.PRIORITY__TIME_TABLE_PRIORITY:
				setTimeTablePriority(TIME_TABLE_PRIORITY_EDEFAULT);
				return;
			case KLSA_InterfacePackage.PRIORITY__LOAD_MANAGEMENT_PRIORITY:
				setLoadManagementPriority(LOAD_MANAGEMENT_PRIORITY_EDEFAULT);
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
			case KLSA_InterfacePackage.PRIORITY__TIME_TABLE_PRIORITY:
				return timeTablePriority != TIME_TABLE_PRIORITY_EDEFAULT;
			case KLSA_InterfacePackage.PRIORITY__LOAD_MANAGEMENT_PRIORITY:
				return loadManagementPriority != LOAD_MANAGEMENT_PRIORITY_EDEFAULT;
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
		result.append(" (timeTablePriority: ");
		result.append(timeTablePriority);
		result.append(", loadManagementPriority: ");
		result.append(loadManagementPriority);
		result.append(')');
		return result.toString();
	}

} // Priority
