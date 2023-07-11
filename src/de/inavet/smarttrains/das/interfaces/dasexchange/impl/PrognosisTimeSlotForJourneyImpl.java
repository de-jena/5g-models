/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange.impl;

import de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage;
import de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney;
import de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prognosis Time Slot For Journey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.PrognosisTimeSlotForJourneyImpl#getJourneyId <em>Journey Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.PrognosisTimeSlotForJourneyImpl#getTimeSlotsOnJourney <em>Time Slots On Journey</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrognosisTimeSlotForJourneyImpl extends MinimalEObjectImpl.Container implements PrognosisTimeSlotForJourney {
	/**
	 * The default value of the '{@link #getJourneyId() <em>Journey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneyId()
	 * @generated
	 * @ordered
	 */
	protected static final String JOURNEY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJourneyId() <em>Journey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourneyId()
	 * @generated
	 * @ordered
	 */
	protected String journeyId = JOURNEY_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeSlotsOnJourney() <em>Time Slots On Journey</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSlotsOnJourney()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeSlotOnJourney> timeSlotsOnJourney;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrognosisTimeSlotForJourneyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DasexchangePackage.Literals.PROGNOSIS_TIME_SLOT_FOR_JOURNEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJourneyId() {
		return journeyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJourneyId(String newJourneyId) {
		String oldJourneyId = journeyId;
		journeyId = newJourneyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.PROGNOSIS_TIME_SLOT_FOR_JOURNEY__JOURNEY_ID, oldJourneyId, journeyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeSlotOnJourney> getTimeSlotsOnJourney() {
		if (timeSlotsOnJourney == null) {
			timeSlotsOnJourney = new EObjectContainmentEList<TimeSlotOnJourney>(TimeSlotOnJourney.class, this, DasexchangePackage.PROGNOSIS_TIME_SLOT_FOR_JOURNEY__TIME_SLOTS_ON_JOURNEY);
		}
		return timeSlotsOnJourney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FOR_JOURNEY__TIME_SLOTS_ON_JOURNEY:
				return ((InternalEList<?>)getTimeSlotsOnJourney()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FOR_JOURNEY__JOURNEY_ID:
				return getJourneyId();
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FOR_JOURNEY__TIME_SLOTS_ON_JOURNEY:
				return getTimeSlotsOnJourney();
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
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FOR_JOURNEY__JOURNEY_ID:
				setJourneyId((String)newValue);
				return;
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FOR_JOURNEY__TIME_SLOTS_ON_JOURNEY:
				getTimeSlotsOnJourney().clear();
				getTimeSlotsOnJourney().addAll((Collection<? extends TimeSlotOnJourney>)newValue);
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
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FOR_JOURNEY__JOURNEY_ID:
				setJourneyId(JOURNEY_ID_EDEFAULT);
				return;
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FOR_JOURNEY__TIME_SLOTS_ON_JOURNEY:
				getTimeSlotsOnJourney().clear();
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
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FOR_JOURNEY__JOURNEY_ID:
				return JOURNEY_ID_EDEFAULT == null ? journeyId != null : !JOURNEY_ID_EDEFAULT.equals(journeyId);
			case DasexchangePackage.PROGNOSIS_TIME_SLOT_FOR_JOURNEY__TIME_SLOTS_ON_JOURNEY:
				return timeSlotsOnJourney != null && !timeSlotsOnJourney.isEmpty();
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
		result.append(" (journeyId: ");
		result.append(journeyId);
		result.append(')');
		return result.toString();
	}

} //PrognosisTimeSlotForJourneyImpl
