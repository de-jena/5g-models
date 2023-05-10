/**
 */
package fasExchange;

import java.time.ZonedDateTime;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

import utils.FASStatus;
import utils.GNSSStatus;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FAS Exchange</b></em>'.
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
 *   <li>{@link fasExchange.FASExchange#getId <em>Id</em>}</li>
 *   <li>{@link fasExchange.FASExchange#getJourneyId <em>Journey Id</em>}</li>
 *   <li>{@link fasExchange.FASExchange#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link fasExchange.FASExchange#getTrajectory <em>Trajectory</em>}</li>
 *   <li>{@link fasExchange.FASExchange#getRecommendation <em>Recommendation</em>}</li>
 *   <li>{@link fasExchange.FASExchange#getGnssStatus <em>Gnss Status</em>}</li>
 *   <li>{@link fasExchange.FASExchange#getFasStatus <em>Fas Status</em>}</li>
 *   <li>{@link fasExchange.FASExchange#getTimeSlotsOnJourney <em>Time Slots On Journey</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FASExchange extends MinimalEObjectImpl.Container {
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
	protected static final FASStatus FAS_STATUS_EDEFAULT = FASStatus.NO_CONNECTION_TO_CENTRAL;

	/**
	 * The cached value of the '{@link #getFasStatus() <em>Fas Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFasStatus()
	 * @generated
	 * @ordered
	 */
	protected FASStatus fasStatus = FAS_STATUS_EDEFAULT;

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
	public FASExchange() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FasExchangePackage.Literals.FAS_EXCHANGE;
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
	 * Sets the value of the '{@link fasExchange.FASExchange#getId <em>Id</em>}' attribute.
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
	 * Sets the value of the '{@link fasExchange.FASExchange#getJourneyId <em>Journey Id</em>}' attribute.
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
	 * Sets the value of the '{@link fasExchange.FASExchange#getTimestamp <em>Timestamp</em>}' attribute.
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
	 * Sets the value of the '{@link fasExchange.FASExchange#getTrajectory <em>Trajectory</em>}' reference.
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
	 * The list contents are of type {@link fasExchange.Recommendation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * aktuelle Empfehlung für die Journey
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recommendation</em>' reference list.
	 * @generated
	 */
	public List<Recommendation> getRecommendation() {
		if (recommendation == null) {
			recommendation = new BasicInternalEList<Recommendation>(Recommendation.class);
		}
		return recommendation;
	}

	/**
	 * Returns the value of the '<em><b>Gnss Status</b></em>' attribute.
	 * The literals are from the enumeration {@link utils.GNSSStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * aktueller GNSS-Status zur Übermittlung an die Mobilseite
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gnss Status</em>' attribute.
	 * @see utils.GNSSStatus
	 * @see #setGnssStatus(GNSSStatus)
	 * @generated
	 */
	public GNSSStatus getGnssStatus() {
		return gnssStatus;
	}

	/**
	 * Sets the value of the '{@link fasExchange.FASExchange#getGnssStatus <em>Gnss Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newGnssStatus the new value of the '<em>Gnss Status</em>' attribute.
	 * @see utils.GNSSStatus
	 * @see #getGnssStatus()
	 * @generated
	 */
	public void setGnssStatus(GNSSStatus newGnssStatus) {
		gnssStatus = newGnssStatus == null ? GNSS_STATUS_EDEFAULT : newGnssStatus;
	}

	/**
	 * Returns the value of the '<em><b>Fas Status</b></em>' attribute.
	 * The literals are from the enumeration {@link utils.FASStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * aktueller FAS-Status zur Übermittlung an die Mobilseite
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fas Status</em>' attribute.
	 * @see utils.FASStatus
	 * @see #setFasStatus(FASStatus)
	 * @generated
	 */
	public FASStatus getFasStatus() {
		return fasStatus;
	}

	/**
	 * Sets the value of the '{@link fasExchange.FASExchange#getFasStatus <em>Fas Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newFasStatus the new value of the '<em>Fas Status</em>' attribute.
	 * @see utils.FASStatus
	 * @see #getFasStatus()
	 * @generated
	 */
	public void setFasStatus(FASStatus newFasStatus) {
		fasStatus = newFasStatus == null ? FAS_STATUS_EDEFAULT : newFasStatus;
	}

	/**
	 * Returns the value of the '<em><b>Time Slots On Journey</b></em>' reference list.
	 * The list contents are of type {@link fasExchange.TimeSlotOnJourney}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitpunkte und Orte des aktuellen Prognosezustandes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Slots On Journey</em>' reference list.
	 * @generated
	 */
	public List<TimeSlotOnJourney> getTimeSlotsOnJourney() {
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
			case FasExchangePackage.FAS_EXCHANGE__ID:
				return getId();
			case FasExchangePackage.FAS_EXCHANGE__JOURNEY_ID:
				return getJourneyId();
			case FasExchangePackage.FAS_EXCHANGE__TIMESTAMP:
				return getTimestamp();
			case FasExchangePackage.FAS_EXCHANGE__TRAJECTORY:
				if (resolve) return getTrajectory();
				return basicGetTrajectory();
			case FasExchangePackage.FAS_EXCHANGE__RECOMMENDATION:
				return getRecommendation();
			case FasExchangePackage.FAS_EXCHANGE__GNSS_STATUS:
				return getGnssStatus();
			case FasExchangePackage.FAS_EXCHANGE__FAS_STATUS:
				return getFasStatus();
			case FasExchangePackage.FAS_EXCHANGE__TIME_SLOTS_ON_JOURNEY:
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
			case FasExchangePackage.FAS_EXCHANGE__ID:
				setId((String)newValue);
				return;
			case FasExchangePackage.FAS_EXCHANGE__JOURNEY_ID:
				setJourneyId((String)newValue);
				return;
			case FasExchangePackage.FAS_EXCHANGE__TIMESTAMP:
				setTimestamp((ZonedDateTime)newValue);
				return;
			case FasExchangePackage.FAS_EXCHANGE__TRAJECTORY:
				setTrajectory((Trajectory)newValue);
				return;
			case FasExchangePackage.FAS_EXCHANGE__RECOMMENDATION:
				getRecommendation().clear();
				getRecommendation().addAll((Collection<? extends Recommendation>)newValue);
				return;
			case FasExchangePackage.FAS_EXCHANGE__GNSS_STATUS:
				setGnssStatus((GNSSStatus)newValue);
				return;
			case FasExchangePackage.FAS_EXCHANGE__FAS_STATUS:
				setFasStatus((FASStatus)newValue);
				return;
			case FasExchangePackage.FAS_EXCHANGE__TIME_SLOTS_ON_JOURNEY:
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
			case FasExchangePackage.FAS_EXCHANGE__ID:
				setId(ID_EDEFAULT);
				return;
			case FasExchangePackage.FAS_EXCHANGE__JOURNEY_ID:
				setJourneyId(JOURNEY_ID_EDEFAULT);
				return;
			case FasExchangePackage.FAS_EXCHANGE__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case FasExchangePackage.FAS_EXCHANGE__TRAJECTORY:
				setTrajectory((Trajectory)null);
				return;
			case FasExchangePackage.FAS_EXCHANGE__RECOMMENDATION:
				getRecommendation().clear();
				return;
			case FasExchangePackage.FAS_EXCHANGE__GNSS_STATUS:
				setGnssStatus(GNSS_STATUS_EDEFAULT);
				return;
			case FasExchangePackage.FAS_EXCHANGE__FAS_STATUS:
				setFasStatus(FAS_STATUS_EDEFAULT);
				return;
			case FasExchangePackage.FAS_EXCHANGE__TIME_SLOTS_ON_JOURNEY:
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
			case FasExchangePackage.FAS_EXCHANGE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case FasExchangePackage.FAS_EXCHANGE__JOURNEY_ID:
				return JOURNEY_ID_EDEFAULT == null ? journeyId != null : !JOURNEY_ID_EDEFAULT.equals(journeyId);
			case FasExchangePackage.FAS_EXCHANGE__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case FasExchangePackage.FAS_EXCHANGE__TRAJECTORY:
				return trajectory != null;
			case FasExchangePackage.FAS_EXCHANGE__RECOMMENDATION:
				return recommendation != null && !recommendation.isEmpty();
			case FasExchangePackage.FAS_EXCHANGE__GNSS_STATUS:
				return gnssStatus != GNSS_STATUS_EDEFAULT;
			case FasExchangePackage.FAS_EXCHANGE__FAS_STATUS:
				return fasStatus != FAS_STATUS_EDEFAULT;
			case FasExchangePackage.FAS_EXCHANGE__TIME_SLOTS_ON_JOURNEY:
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

} // FASExchange
