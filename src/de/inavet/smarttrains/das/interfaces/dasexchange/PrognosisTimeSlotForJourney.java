/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prognosis Time Slot For Journey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Prognoseankunftszeiten für eine Fahrt
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney#getJourneyId <em>Journey Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney#getTimeSlotsOnJourney <em>Time Slots On Journey</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrognosisTimeSlotForJourney extends MinimalEObjectImpl.Container {
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
	 * The cached value of the '{@link #getTimeSlotsOnJourney() <em>Time Slots On Journey</em>}' reference list.
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
	protected PrognosisTimeSlotForJourney() {
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
	 * Returns the value of the '<em><b>Journey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * bezogene Journey-Id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journey Id</em>' attribute.
	 * @see #setJourneyId(String)
	 * @generated
	 */
	public String getJourneyId() {
		return journeyId;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.PrognosisTimeSlotForJourney#getJourneyId <em>Journey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newJourneyId the new value of the '<em>Journey Id</em>' attribute.
	 * @see #getJourneyId()
	 * @generated
	 */
	public void setJourneyId(String newJourneyId) {
		journeyId = newJourneyId;
	}

	/**
	 * Returns the value of the '<em><b>Time Slots On Journey</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prognose-Ankunftszeiten für eine Fahrt
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Slots On Journey</em>' reference list.
	 * @generated
	 */
	public EList<TimeSlotOnJourney> getTimeSlotsOnJourney() {
		if (timeSlotsOnJourney == null) {
			timeSlotsOnJourney = new BasicInternalEList<TimeSlotOnJourney>(TimeSlotOnJourney.class);
		}
		return timeSlotsOnJourney;
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

} // PrognosisTimeSlotForJourney
