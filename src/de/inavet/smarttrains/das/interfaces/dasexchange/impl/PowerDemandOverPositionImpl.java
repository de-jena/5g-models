/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange.impl;

import de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage;
import de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverPosition;

import de.inavet.smarttrains.das.interfaces.utils.Position;
import de.inavet.smarttrains.das.interfaces.utils.ValueItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Demand Over Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.PowerDemandOverPositionImpl#getPowerPrognosis <em>Power Prognosis</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.PowerDemandOverPositionImpl#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerDemandOverPositionImpl extends MinimalEObjectImpl.Container implements PowerDemandOverPosition {
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
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected EList<Position> position;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerDemandOverPositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DasexchangePackage.Literals.POWER_DEMAND_OVER_POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueItem> getPowerPrognosis() {
		if (powerPrognosis == null) {
			powerPrognosis = new EObjectResolvingEList<ValueItem>(ValueItem.class, this, DasexchangePackage.POWER_DEMAND_OVER_POSITION__POWER_PROGNOSIS);
		}
		return powerPrognosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Position> getPosition() {
		if (position == null) {
			position = new EObjectResolvingEList<Position>(Position.class, this, DasexchangePackage.POWER_DEMAND_OVER_POSITION__POSITION);
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DasexchangePackage.POWER_DEMAND_OVER_POSITION__POWER_PROGNOSIS:
				return getPowerPrognosis();
			case DasexchangePackage.POWER_DEMAND_OVER_POSITION__POSITION:
				return getPosition();
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
			case DasexchangePackage.POWER_DEMAND_OVER_POSITION__POWER_PROGNOSIS:
				getPowerPrognosis().clear();
				getPowerPrognosis().addAll((Collection<? extends ValueItem>)newValue);
				return;
			case DasexchangePackage.POWER_DEMAND_OVER_POSITION__POSITION:
				getPosition().clear();
				getPosition().addAll((Collection<? extends Position>)newValue);
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
			case DasexchangePackage.POWER_DEMAND_OVER_POSITION__POWER_PROGNOSIS:
				getPowerPrognosis().clear();
				return;
			case DasexchangePackage.POWER_DEMAND_OVER_POSITION__POSITION:
				getPosition().clear();
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
			case DasexchangePackage.POWER_DEMAND_OVER_POSITION__POWER_PROGNOSIS:
				return powerPrognosis != null && !powerPrognosis.isEmpty();
			case DasexchangePackage.POWER_DEMAND_OVER_POSITION__POSITION:
				return position != null && !position.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PowerDemandOverPositionImpl
