/**
 */
package fasExchange;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

import vehicle.Vehicle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prognosis For Vehicle Power Demand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Fahrzeugleistungsbedarf für Lastmanagement
 * Root-Objekt
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fasExchange.PrognosisForVehiclePowerDemand#getId <em>Id</em>}</li>
 *   <li>{@link fasExchange.PrognosisForVehiclePowerDemand#getKeyVehicles <em>Key Vehicles</em>}</li>
 *   <li>{@link fasExchange.PrognosisForVehiclePowerDemand#getPowerDemandOverPositions <em>Power Demand Over Positions</em>}</li>
 *   <li>{@link fasExchange.PrognosisForVehiclePowerDemand#getPowerDemandOverTimes <em>Power Demand Over Times</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrognosisForVehiclePowerDemand extends MinimalEObjectImpl.Container {
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
	public PrognosisForVehiclePowerDemand() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FasExchangePackage.Literals.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datenbroker-Id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the '{@link fasExchange.PrognosisForVehiclePowerDemand#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(String newId) {
		id = newId;
	}

	/**
	 * Returns the value of the '<em><b>Key Vehicles</b></em>' reference list.
	 * The list contents are of type {@link vehicle.Vehicle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Welche Fahrzeuge
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Vehicles</em>' reference list.
	 * @generated
	 */
	public List<Vehicle> getKeyVehicles() {
		if (keyVehicles == null) {
			keyVehicles = new BasicInternalEList<Vehicle>(Vehicle.class);
		}
		return keyVehicles;
	}

	/**
	 * Returns the value of the '<em><b>Power Demand Over Positions</b></em>' reference list.
	 * The list contents are of type {@link fasExchange.PowerDemandOverPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Welcher Leistungsbedarf besteht an welcher Position für das Fahrzeug
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Demand Over Positions</em>' reference list.
	 * @generated
	 */
	public List<PowerDemandOverPosition> getPowerDemandOverPositions() {
		if (powerDemandOverPositions == null) {
			powerDemandOverPositions = new BasicInternalEList<PowerDemandOverPosition>(PowerDemandOverPosition.class);
		}
		return powerDemandOverPositions;
	}

	/**
	 * Returns the value of the '<em><b>Power Demand Over Times</b></em>' reference list.
	 * The list contents are of type {@link fasExchange.PowerDemandOverTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Welcher Leistungsbedarf besteht zu welchen Zeitpunkt für das Fahrzeug
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Demand Over Times</em>' reference list.
	 * @generated
	 */
	public List<PowerDemandOverTime> getPowerDemandOverTimes() {
		if (powerDemandOverTimes == null) {
			powerDemandOverTimes = new BasicInternalEList<PowerDemandOverTime>(PowerDemandOverTime.class);
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
			case FasExchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__ID:
				return getId();
			case FasExchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__KEY_VEHICLES:
				return getKeyVehicles();
			case FasExchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_POSITIONS:
				return getPowerDemandOverPositions();
			case FasExchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_TIMES:
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
			case FasExchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__ID:
				setId((String)newValue);
				return;
			case FasExchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__KEY_VEHICLES:
				getKeyVehicles().clear();
				getKeyVehicles().addAll((Collection<? extends Vehicle>)newValue);
				return;
			case FasExchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_POSITIONS:
				getPowerDemandOverPositions().clear();
				getPowerDemandOverPositions().addAll((Collection<? extends PowerDemandOverPosition>)newValue);
				return;
			case FasExchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_TIMES:
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
			case FasExchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__ID:
				setId(ID_EDEFAULT);
				return;
			case FasExchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__KEY_VEHICLES:
				getKeyVehicles().clear();
				return;
			case FasExchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_POSITIONS:
				getPowerDemandOverPositions().clear();
				return;
			case FasExchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_TIMES:
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
			case FasExchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case FasExchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__KEY_VEHICLES:
				return keyVehicles != null && !keyVehicles.isEmpty();
			case FasExchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_POSITIONS:
				return powerDemandOverPositions != null && !powerDemandOverPositions.isEmpty();
			case FasExchangePackage.PROGNOSIS_FOR_VEHICLE_POWER_DEMAND__POWER_DEMAND_OVER_TIMES:
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

} // PrognosisForVehiclePowerDemand
