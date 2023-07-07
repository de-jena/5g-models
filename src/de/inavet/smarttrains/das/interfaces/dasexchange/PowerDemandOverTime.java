/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import de.inavet.smarttrains.das.interfaces.utils.ValueItem;

import java.time.ZonedDateTime;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Demand Over Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hilfsklasse
 * Leistungsbedarf über Zeit
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverTime#getPowerPrognosis <em>Power Prognosis</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverTime#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerDemandOverTime extends MinimalEObjectImpl.Container {
	/**
	 * The cached value of the '{@link #getPowerPrognosis() <em>Power Prognosis</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerPrognosis()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueItem> powerPrognosis;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected EList<ZonedDateTime> timestamp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerDemandOverTime() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DasexchangePackage.Literals.POWER_DEMAND_OVER_TIME;
	}

	/**
	 * Returns the value of the '<em><b>Power Prognosis</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.utils.ValueItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Leistungsbedarfsprognose
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Prognosis</em>' reference list.
	 * @generated
	 */
	public EList<ValueItem> getPowerPrognosis() {
		if (powerPrognosis == null) {
			powerPrognosis = new BasicInternalEList<ValueItem>(ValueItem.class);
		}
		return powerPrognosis;
	}

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute list.
	 * The list contents are of type {@link java.time.ZonedDateTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitstempel für Leistungsbedarf
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute list.
	 * @generated
	 */
	public EList<ZonedDateTime> getTimestamp() {
		if (timestamp == null) {
			timestamp = new BasicInternalEList<ZonedDateTime>(ZonedDateTime.class);
		}
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DasexchangePackage.POWER_DEMAND_OVER_TIME__POWER_PROGNOSIS:
				return getPowerPrognosis();
			case DasexchangePackage.POWER_DEMAND_OVER_TIME__TIMESTAMP:
				return getTimestamp();
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
			case DasexchangePackage.POWER_DEMAND_OVER_TIME__POWER_PROGNOSIS:
				getPowerPrognosis().clear();
				getPowerPrognosis().addAll((Collection<? extends ValueItem>)newValue);
				return;
			case DasexchangePackage.POWER_DEMAND_OVER_TIME__TIMESTAMP:
				getTimestamp().clear();
				getTimestamp().addAll((Collection<? extends ZonedDateTime>)newValue);
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
			case DasexchangePackage.POWER_DEMAND_OVER_TIME__POWER_PROGNOSIS:
				getPowerPrognosis().clear();
				return;
			case DasexchangePackage.POWER_DEMAND_OVER_TIME__TIMESTAMP:
				getTimestamp().clear();
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
			case DasexchangePackage.POWER_DEMAND_OVER_TIME__POWER_PROGNOSIS:
				return powerPrognosis != null && !powerPrognosis.isEmpty();
			case DasexchangePackage.POWER_DEMAND_OVER_TIME__TIMESTAMP:
				return timestamp != null && !timestamp.isEmpty();
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

} // PowerDemandOverTime
