/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange.impl;

import de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage;
import de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotFromkLSA;
import de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlot;

import de.inavet.smarttrains.das.interfaces.utils.ValueItem;

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
 * An implementation of the model object '<em><b>Prognosis Time Slot Fromk LSA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.PrognosisTimeSlotFromkLSAImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.PrognosisTimeSlotFromkLSAImpl#getKeyCosts <em>Key Costs</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.PrognosisTimeSlotFromkLSAImpl#getTimeSlots <em>Time Slots</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.PrognosisTimeSlotFromkLSAImpl#getVehicles <em>Vehicles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrognosisTimeSlotFromkLSAImpl extends MinimalEObjectImpl.Container implements PrognosisTimeSlotFromkLSA {
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
	protected PrognosisTimeSlotFromkLSAImpl() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueItem> getKeyCosts() {
		if (keyCosts == null) {
			keyCosts = new EObjectResolvingEList<ValueItem>(ValueItem.class, this, DasexchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA__KEY_COSTS);
		}
		return keyCosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeSlot> getTimeSlots() {
		if (timeSlots == null) {
			timeSlots = new EObjectResolvingEList<TimeSlot>(TimeSlot.class, this, DasexchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA__TIME_SLOTS);
		}
		return timeSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vehicle> getVehicles() {
		if (vehicles == null) {
			vehicles = new EObjectResolvingEList<Vehicle>(Vehicle.class, this, DasexchangePackage.PROGNOSIS_TIME_SLOT_FROMK_LSA__VEHICLES);
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

} //PrognosisTimeSlotFromkLSAImpl
