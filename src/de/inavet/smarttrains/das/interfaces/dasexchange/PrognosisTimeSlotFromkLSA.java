/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import de.inavet.smarttrains.das.interfaces.utils.ValueItem;

import de.inavet.smarttrains.das.interfaces.vehicle.Vehicle;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prognosis Time Slot Fromk LSA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Prognose-Freigabefenster der kLSA; Zuordnung bzw. Ordnung muss noch geklärt werden
 * Root-Objekt
 * deprecated
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA#getKeyCosts <em>Key Costs</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA#getTimeSlots <em>Time Slots</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA#getVehicles <em>Vehicles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrognosisTimeSlotFromkLSA extends MinimalEObjectImpl.Container {
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
	 * The cached value of the '{@link #getKeyCosts() <em>Key Costs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyCosts()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueItem> keyCosts;

	/**
	 * The cached value of the '{@link #getTimeSlots() <em>Time Slots</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSlots()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeSlot> timeSlots;

	/**
	 * The cached value of the '{@link #getVehicles() <em>Vehicles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicles()
	 * @generated
	 * @ordered
	 */
	protected EList<Vehicle> vehicles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrognosisTimeSlotFromkLSA() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DasexchangePackage.Literals.PROGNOSIS_TIME_SLOT_FROMK_LSA;
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
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA#getId <em>Id</em>}' attribute.
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
	 * Returns the value of the '<em><b>Key Costs</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.utils.ValueItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kostenbewertung, tbd
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Costs</em>' reference list.
	 * @generated
	 */
	public EList<ValueItem> getKeyCosts() {
		if (keyCosts == null) {
			keyCosts = new BasicInternalEList<ValueItem>(ValueItem.class);
		}
		return keyCosts;
	}

	/**
	 * Returns the value of the '<em><b>Time Slots</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitfensterangaben
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Slots</em>' reference list.
	 * @generated
	 */
	public EList<TimeSlot> getTimeSlots() {
		if (timeSlots == null) {
			timeSlots = new BasicInternalEList<TimeSlot>(TimeSlot.class);
		}
		return timeSlots;
	}

	/**
	 * Returns the value of the '<em><b>Vehicles</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.vehicle.Vehicle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Welches Fahrzeug oder welche Fahrzeuge betrifft es
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicles</em>' reference list.
	 * @generated
	 */
	public EList<Vehicle> getVehicles() {
		if (vehicles == null) {
			vehicles = new BasicInternalEList<Vehicle>(Vehicle.class);
		}
		return vehicles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA__ID:
				return getId();
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA__KEY_COSTS:
				return getKeyCosts();
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA__TIME_SLOTS:
				return getTimeSlots();
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA__VEHICLES:
				return getVehicles();
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
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA__ID:
				setId((String)newValue);
				return;
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA__KEY_COSTS:
				getKeyCosts().clear();
				getKeyCosts().addAll((Collection<? extends ValueItem>)newValue);
				return;
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA__TIME_SLOTS:
				getTimeSlots().clear();
				getTimeSlots().addAll((Collection<? extends TimeSlot>)newValue);
				return;
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA__VEHICLES:
				getVehicles().clear();
				getVehicles().addAll((Collection<? extends Vehicle>)newValue);
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
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA__ID:
				setId(ID_EDEFAULT);
				return;
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA__KEY_COSTS:
				getKeyCosts().clear();
				return;
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA__TIME_SLOTS:
				getTimeSlots().clear();
				return;
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA__VEHICLES:
				getVehicles().clear();
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
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA__KEY_COSTS:
				return keyCosts != null && !keyCosts.isEmpty();
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA__TIME_SLOTS:
				return timeSlots != null && !timeSlots.isEmpty();
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA__VEHICLES:
				return vehicles != null && !vehicles.isEmpty();
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

} // PrognosisTimeSlotFromkLSA
