/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange.impl;

import de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage;
import de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverTime;

import de.inavet.smarttrains.das.interfaces.utils.ValueItem;

import java.time.ZonedDateTime;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Demand Over Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.PowerDemandOverTimeImpl#getPowerPrognosis <em>Power Prognosis</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.PowerDemandOverTimeImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerDemandOverTimeImpl extends MinimalEObjectImpl.Container implements PowerDemandOverTime {
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
	protected PowerDemandOverTimeImpl() {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueItem> getPowerPrognosis() {
		if (powerPrognosis == null) {
			powerPrognosis = new EObjectResolvingEList<ValueItem>(ValueItem.class, this, DasexchangePackage.POWER_DEMAND_OVER_TIME__POWER_PROGNOSIS);
		}
		return powerPrognosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ZonedDateTime> getTimestamp() {
		if (timestamp == null) {
			timestamp = new EDataTypeUniqueEList<ZonedDateTime>(ZonedDateTime.class, this, DasexchangePackage.POWER_DEMAND_OVER_TIME__TIMESTAMP);
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

} //PowerDemandOverTimeImpl
