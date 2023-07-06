/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange.impl;

import de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage;
import de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverPosition;
import de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverTime;
import de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisForVehiclePowerDemand;

import de.inavet.smarttrains.das.interfaces.vehicle.Vehicle;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prognosis For Vehicle Power Demand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.PrognosisForVehiclePowerDemandImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.PrognosisForVehiclePowerDemandImpl#getKeyVehicles <em>Key Vehicles</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.PrognosisForVehiclePowerDemandImpl#getPowerDemandOverPositions <em>Power Demand Over Positions</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.PrognosisForVehiclePowerDemandImpl#getPowerDemandOverTimes <em>Power Demand Over Times</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrognosisForVehiclePowerDemandImpl extends MinimalEObjectImpl.Container implements PrognosisForVehiclePowerDemand {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeyVehicles() <em>Key Vehicles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyVehicles()
	 * @generated
	 * @ordered
	 */
	protected EList<Vehicle> keyVehicles;

	/**
	 * The cached value of the '{@link #getPowerDemandOverPositions() <em>Power Demand Over Positions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerDemandOverPositions()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerDemandOverPosition> powerDemandOverPositions;

	/**
	 * The cached value of the '{@link #getPowerDemandOverTimes() <em>Power Demand Over Times</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerDemandOverTimes()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerDemandOverTime> powerDemandOverTimes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrognosisForVehiclePowerDemandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DasexchangePackage.Literals.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vehicle> getKeyVehicles() {
		if (keyVehicles == null) {
			keyVehicles = new EObjectResolvingEList<Vehicle>(Vehicle.class, this, DasexchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__KEY_VEHICLES);
		}
		return keyVehicles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerDemandOverPosition> getPowerDemandOverPositions() {
		if (powerDemandOverPositions == null) {
			powerDemandOverPositions = new EObjectResolvingEList<PowerDemandOverPosition>(PowerDemandOverPosition.class, this, DasexchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_POSITIONS);
		}
		return powerDemandOverPositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerDemandOverTime> getPowerDemandOverTimes() {
		if (powerDemandOverTimes == null) {
			powerDemandOverTimes = new EObjectResolvingEList<PowerDemandOverTime>(PowerDemandOverTime.class, this, DasexchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_TIMES);
		}
		return powerDemandOverTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DasexchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__ID:
				return getId();
			case DasexchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__KEY_VEHICLES:
				return getKeyVehicles();
			case DasexchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_POSITIONS:
				return getPowerDemandOverPositions();
			case DasexchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_TIMES:
				return getPowerDemandOverTimes();
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
			case DasexchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__ID:
				setId((String)newValue);
				return;
			case DasexchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__KEY_VEHICLES:
				getKeyVehicles().clear();
				getKeyVehicles().addAll((Collection<? extends Vehicle>)newValue);
				return;
			case DasexchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_POSITIONS:
				getPowerDemandOverPositions().clear();
				getPowerDemandOverPositions().addAll((Collection<? extends PowerDemandOverPosition>)newValue);
				return;
			case DasexchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_TIMES:
				getPowerDemandOverTimes().clear();
				getPowerDemandOverTimes().addAll((Collection<? extends PowerDemandOverTime>)newValue);
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
			case DasexchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__ID:
				setId(ID_EDEFAULT);
				return;
			case DasexchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__KEY_VEHICLES:
				getKeyVehicles().clear();
				return;
			case DasexchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_POSITIONS:
				getPowerDemandOverPositions().clear();
				return;
			case DasexchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_TIMES:
				getPowerDemandOverTimes().clear();
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
			case DasexchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DasexchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__KEY_VEHICLES:
				return keyVehicles != null && !keyVehicles.isEmpty();
			case DasexchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_POSITIONS:
				return powerDemandOverPositions != null && !powerDemandOverPositions.isEmpty();
			case DasexchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_TIMES:
				return powerDemandOverTimes != null && !powerDemandOverTimes.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PrognosisForVehiclePowerDemandImpl
