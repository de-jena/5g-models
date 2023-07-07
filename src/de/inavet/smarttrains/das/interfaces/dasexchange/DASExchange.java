/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import de.inavet.smarttrains.das.interfaces.utils.DASStatus;
import de.inavet.smarttrains.das.interfaces.utils.GNSSStatus;

import java.time.ZonedDateTime;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAS Exchange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * FAS-Austausch zwischen zentraler und mobiler Instanz
 * wird vermutlich noch angepasst bzw. erweitert
 * Root-Objekt
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getJourneyId <em>Journey Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getTrajectory <em>Trajectory</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getRecommendation <em>Recommendation</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getGnssStatus <em>Gnss Status</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getFasStatus <em>Fas Status</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getTimeSlotsOnJourney <em>Time Slots On Journey</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DASExchange extends MinimalEObjectImpl.Container {
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
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final ZonedDateTime TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected ZonedDateTime timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrajectory() <em>Trajectory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrajectory()
	 * @generated
	 * @ordered
	 */
	protected Trajectory trajectory;

	/**
	 * The cached value of the '{@link #getRecommendation() <em>Recommendation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendation()
	 * @generated
	 * @ordered
	 */
	protected EList<Recommendation> recommendation;

	/**
	 * The default value of the '{@link #getGnssStatus() <em>Gnss Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGnssStatus()
	 * @generated
	 * @ordered
	 */
	protected static final GNSSStatus GNSS_STATUS_EDEFAULT = GNSSStatus.ACTIVE_LOCALISATION;

	/**
	 * The cached value of the '{@link #getGnssStatus() <em>Gnss Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGnssStatus()
	 * @generated
	 * @ordered
	 */
	protected GNSSStatus gnssStatus = GNSS_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFasStatus() <em>Fas Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFasStatus()
	 * @generated
	 * @ordered
	 */
	protected static final DASStatus FAS_STATUS_EDEFAULT = DASStatus.NO_CONNECTION_TO_CENTRAL;

	/**
	 * The cached value of the '{@link #getFasStatus() <em>Fas Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFasStatus()
	 * @generated
	 * @ordered
	 */
	protected DASStatus fasStatus = FAS_STATUS_EDEFAULT;

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
	protected DASExchange() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DasexchangePackage.Literals.DAS_EXCHANGE;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datenbrokr-id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getId <em>Id</em>}' attribute.
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
	 * Returns the value of the '<em><b>Journey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * journey-id zur Zuordnung der Informationen für die Fahrt
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journey Id</em>' attribute.
	 * @see #setJourneyId(String)
	 * @generated
	 */
	public String getJourneyId() {
		return journeyId;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getJourneyId <em>Journey Id</em>}' attribute.
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
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitstempel der Datenübermittlung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(ZonedDateTime)
	 * @generated
	 */
	public ZonedDateTime getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTimestamp the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	public void setTimestamp(ZonedDateTime newTimestamp) {
		timestamp = newTimestamp;
	}

	/**
	 * Returns the value of the '<em><b>Trajectory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trajektorie für die Journey
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trajectory</em>' reference.
	 * @see #setTrajectory(Trajectory)
	 * @generated
	 */
	public Trajectory getTrajectory() {
		if (trajectory != null && ((EObject)trajectory).eIsProxy()) {
			InternalEObject oldTrajectory = trajectory;
			trajectory = (Trajectory)eResolveProxy(oldTrajectory);
			if (trajectory != oldTrajectory) {
			}
		}
		return trajectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trajectory basicGetTrajectory() {
		return trajectory;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getTrajectory <em>Trajectory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTrajectory the new value of the '<em>Trajectory</em>' reference.
	 * @see #getTrajectory()
	 * @generated
	 */
	public void setTrajectory(Trajectory newTrajectory) {
		trajectory = newTrajectory;
	}

	/**
	 * Returns the value of the '<em><b>Recommendation</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * aktuelle Empfehlung für die Journey
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recommendation</em>' reference list.
	 * @generated
	 */
	public EList<Recommendation> getRecommendation() {
		if (recommendation == null) {
			recommendation = new BasicInternalEList<Recommendation>(Recommendation.class);
		}
		return recommendation;
	}

	/**
	 * Returns the value of the '<em><b>Gnss Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.inavet.smarttrains.das.interfaces.utils.GNSSStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * aktueller GNSS-Status zur Übermittlung an die Mobilseite
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gnss Status</em>' attribute.
	 * @see de.inavet.smarttrains.das.interfaces.utils.GNSSStatus
	 * @see #setGnssStatus(GNSSStatus)
	 * @generated
	 */
	public GNSSStatus getGnssStatus() {
		return gnssStatus;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getGnssStatus <em>Gnss Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGnssStatus the new value of the '<em>Gnss Status</em>' attribute.
	 * @see de.inavet.smarttrains.das.interfaces.utils.GNSSStatus
	 * @see #getGnssStatus()
	 * @generated
	 */
	public void setGnssStatus(GNSSStatus newGnssStatus) {
		gnssStatus = newGnssStatus == null ? GNSS_STATUS_EDEFAULT : newGnssStatus;
	}

	/**
	 * Returns the value of the '<em><b>Fas Status</b></em>' attribute.
	 * The literals are from the enumeration {@link de.inavet.smarttrains.das.interfaces.utils.DASStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * aktueller FAS-Status zur Übermittlung an die Mobilseite
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fas Status</em>' attribute.
	 * @see de.inavet.smarttrains.das.interfaces.utils.DASStatus
	 * @see #setFasStatus(DASStatus)
	 * @generated
	 */
	public DASStatus getFasStatus() {
		return fasStatus;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange#getFasStatus <em>Fas Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFasStatus the new value of the '<em>Fas Status</em>' attribute.
	 * @see de.inavet.smarttrains.das.interfaces.utils.DASStatus
	 * @see #getFasStatus()
	 * @generated
	 */
	public void setFasStatus(DASStatus newFasStatus) {
		fasStatus = newFasStatus == null ? FAS_STATUS_EDEFAULT : newFasStatus;
	}

	/**
	 * Returns the value of the '<em><b>Time Slots On Journey</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitpunkte und Orte des aktuellen Prognosezustandes
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
			case DasexchangePackage.DAS_EXCHANGE__ID:
				return getId();
			case DasexchangePackage.DAS_EXCHANGE__JOURNEY_ID:
				return getJourneyId();
			case DasexchangePackage.DAS_EXCHANGE__TIMESTAMP:
				return getTimestamp();
			case DasexchangePackage.DAS_EXCHANGE__TRAJECTORY:
				if (resolve) return getTrajectory();
				return basicGetTrajectory();
			case DasexchangePackage.DAS_EXCHANGE__RECOMMENDATION:
				return getRecommendation();
			case DasexchangePackage.DAS_EXCHANGE__GNSS_STATUS:
				return getGnssStatus();
			case DasexchangePackage.DAS_EXCHANGE__FAS_STATUS:
				return getFasStatus();
			case DasexchangePackage.DAS_EXCHANGE__TIME_SLOTS_ON_JOURNEY:
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
			case DasexchangePackage.DAS_EXCHANGE__ID:
				setId((String)newValue);
				return;
			case DasexchangePackage.DAS_EXCHANGE__JOURNEY_ID:
				setJourneyId((String)newValue);
				return;
			case DasexchangePackage.DAS_EXCHANGE__TIMESTAMP:
				setTimestamp((ZonedDateTime)newValue);
				return;
			case DasexchangePackage.DAS_EXCHANGE__TRAJECTORY:
				setTrajectory((Trajectory)newValue);
				return;
			case DasexchangePackage.DAS_EXCHANGE__RECOMMENDATION:
				getRecommendation().clear();
				getRecommendation().addAll((Collection<? extends Recommendation>)newValue);
				return;
			case DasexchangePackage.DAS_EXCHANGE__GNSS_STATUS:
				setGnssStatus((GNSSStatus)newValue);
				return;
			case DasexchangePackage.DAS_EXCHANGE__FAS_STATUS:
				setFasStatus((DASStatus)newValue);
				return;
			case DasexchangePackage.DAS_EXCHANGE__TIME_SLOTS_ON_JOURNEY:
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
			case DasexchangePackage.DAS_EXCHANGE__ID:
				setId(ID_EDEFAULT);
				return;
			case DasexchangePackage.DAS_EXCHANGE__JOURNEY_ID:
				setJourneyId(JOURNEY_ID_EDEFAULT);
				return;
			case DasexchangePackage.DAS_EXCHANGE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case DasexchangePackage.DAS_EXCHANGE__TRAJECTORY:
				setTrajectory((Trajectory)null);
				return;
			case DasexchangePackage.DAS_EXCHANGE__RECOMMENDATION:
				getRecommendation().clear();
				return;
			case DasexchangePackage.DAS_EXCHANGE__GNSS_STATUS:
				setGnssStatus(GNSS_STATUS_EDEFAULT);
				return;
			case DasexchangePackage.DAS_EXCHANGE__FAS_STATUS:
				setFasStatus(FAS_STATUS_EDEFAULT);
				return;
			case DasexchangePackage.DAS_EXCHANGE__TIME_SLOTS_ON_JOURNEY:
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
			case DasexchangePackage.DAS_EXCHANGE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DasexchangePackage.DAS_EXCHANGE__JOURNEY_ID:
				return JOURNEY_ID_EDEFAULT == null ? journeyId != null : !JOURNEY_ID_EDEFAULT.equals(journeyId);
			case DasexchangePackage.DAS_EXCHANGE__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case DasexchangePackage.DAS_EXCHANGE__TRAJECTORY:
				return trajectory != null;
			case DasexchangePackage.DAS_EXCHANGE__RECOMMENDATION:
				return recommendation != null && !recommendation.isEmpty();
			case DasexchangePackage.DAS_EXCHANGE__GNSS_STATUS:
				return gnssStatus != GNSS_STATUS_EDEFAULT;
			case DasexchangePackage.DAS_EXCHANGE__FAS_STATUS:
				return fasStatus != FAS_STATUS_EDEFAULT;
			case DasexchangePackage.DAS_EXCHANGE__TIME_SLOTS_ON_JOURNEY:
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
		result.append(" (id: ");
		result.append(id);
		result.append(", journeyId: ");
		result.append(journeyId);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", gnssStatus: ");
		result.append(gnssStatus);
		result.append(", fasStatus: ");
		result.append(fasStatus);
		result.append(')');
		return result.toString();
	}

} // DASExchange
