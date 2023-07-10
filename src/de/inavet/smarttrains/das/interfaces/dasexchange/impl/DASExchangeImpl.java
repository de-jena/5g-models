/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange.impl;

import de.inavet.smarttrains.das.interfaces.dasexchange.DASExchange;
import de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage;
import de.inavet.smarttrains.das.interfaces.dasexchange.Recommendation;
import de.inavet.smarttrains.das.interfaces.dasexchange.TimeSlotOnJourney;
import de.inavet.smarttrains.das.interfaces.dasexchange.Trajectory;

import de.inavet.smarttrains.das.interfaces.utils.DASStatus;
import de.inavet.smarttrains.das.interfaces.utils.GNSSStatus;

import java.time.ZonedDateTime;

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
 * An implementation of the model object '<em><b>DAS Exchange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.DASExchangeImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.DASExchangeImpl#getJourneyId <em>Journey Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.DASExchangeImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.DASExchangeImpl#getTrajectory <em>Trajectory</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.DASExchangeImpl#getRecommendation <em>Recommendation</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.DASExchangeImpl#getGnssStatus <em>Gnss Status</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.DASExchangeImpl#getDasStatus <em>Das Status</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.impl.DASExchangeImpl#getTimeSlotsOnJourney <em>Time Slots On Journey</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DASExchangeImpl extends MinimalEObjectImpl.Container implements DASExchange {
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
	 * The cached value of the '{@link #getTrajectory() <em>Trajectory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrajectory()
	 * @generated
	 * @ordered
	 */
	protected Trajectory trajectory;

	/**
	 * The cached value of the '{@link #getRecommendation() <em>Recommendation</em>}' containment reference list.
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
	 * The default value of the '{@link #getDasStatus() <em>Das Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDasStatus()
	 * @generated
	 * @ordered
	 */
	protected static final DASStatus DAS_STATUS_EDEFAULT = DASStatus.NO_CONNECTION_TO_CENTRAL;

	/**
	 * The cached value of the '{@link #getDasStatus() <em>Das Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDasStatus()
	 * @generated
	 * @ordered
	 */
	protected DASStatus dasStatus = DAS_STATUS_EDEFAULT;

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
	protected DASExchangeImpl() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.DAS_EXCHANGE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.DAS_EXCHANGE__JOURNEY_ID, oldJourneyId, journeyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZonedDateTime getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(ZonedDateTime newTimestamp) {
		ZonedDateTime oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.DAS_EXCHANGE__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trajectory getTrajectory() {
		return trajectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrajectory(Trajectory newTrajectory, NotificationChain msgs) {
		Trajectory oldTrajectory = trajectory;
		trajectory = newTrajectory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DasexchangePackage.DAS_EXCHANGE__TRAJECTORY, oldTrajectory, newTrajectory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrajectory(Trajectory newTrajectory) {
		if (newTrajectory != trajectory) {
			NotificationChain msgs = null;
			if (trajectory != null)
				msgs = ((InternalEObject)trajectory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DasexchangePackage.DAS_EXCHANGE__TRAJECTORY, null, msgs);
			if (newTrajectory != null)
				msgs = ((InternalEObject)newTrajectory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DasexchangePackage.DAS_EXCHANGE__TRAJECTORY, null, msgs);
			msgs = basicSetTrajectory(newTrajectory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.DAS_EXCHANGE__TRAJECTORY, newTrajectory, newTrajectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Recommendation> getRecommendation() {
		if (recommendation == null) {
			recommendation = new EObjectContainmentEList<Recommendation>(Recommendation.class, this, DasexchangePackage.DAS_EXCHANGE__RECOMMENDATION);
		}
		return recommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GNSSStatus getGnssStatus() {
		return gnssStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGnssStatus(GNSSStatus newGnssStatus) {
		GNSSStatus oldGnssStatus = gnssStatus;
		gnssStatus = newGnssStatus == null ? GNSS_STATUS_EDEFAULT : newGnssStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.DAS_EXCHANGE__GNSS_STATUS, oldGnssStatus, gnssStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DASStatus getDasStatus() {
		return dasStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDasStatus(DASStatus newDasStatus) {
		DASStatus oldDasStatus = dasStatus;
		dasStatus = newDasStatus == null ? DAS_STATUS_EDEFAULT : newDasStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DasexchangePackage.DAS_EXCHANGE__DAS_STATUS, oldDasStatus, dasStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeSlotOnJourney> getTimeSlotsOnJourney() {
		if (timeSlotsOnJourney == null) {
			timeSlotsOnJourney = new EObjectContainmentEList<TimeSlotOnJourney>(TimeSlotOnJourney.class, this, DasexchangePackage.DAS_EXCHANGE__TIME_SLOTS_ON_JOURNEY);
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
			case DasexchangePackage.DAS_EXCHANGE__TRAJECTORY:
				return basicSetTrajectory(null, msgs);
			case DasexchangePackage.DAS_EXCHANGE__RECOMMENDATION:
				return ((InternalEList<?>)getRecommendation()).basicRemove(otherEnd, msgs);
			case DasexchangePackage.DAS_EXCHANGE__TIME_SLOTS_ON_JOURNEY:
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
			case DasexchangePackage.DAS_EXCHANGE__ID:
				return getId();
			case DasexchangePackage.DAS_EXCHANGE__JOURNEY_ID:
				return getJourneyId();
			case DasexchangePackage.DAS_EXCHANGE__TIMESTAMP:
				return getTimestamp();
			case DasexchangePackage.DAS_EXCHANGE__TRAJECTORY:
				return getTrajectory();
			case DasexchangePackage.DAS_EXCHANGE__RECOMMENDATION:
				return getRecommendation();
			case DasexchangePackage.DAS_EXCHANGE__GNSS_STATUS:
				return getGnssStatus();
			case DasexchangePackage.DAS_EXCHANGE__DAS_STATUS:
				return getDasStatus();
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
			case DasexchangePackage.DAS_EXCHANGE__DAS_STATUS:
				setDasStatus((DASStatus)newValue);
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
			case DasexchangePackage.DAS_EXCHANGE__DAS_STATUS:
				setDasStatus(DAS_STATUS_EDEFAULT);
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
			case DasexchangePackage.DAS_EXCHANGE__DAS_STATUS:
				return dasStatus != DAS_STATUS_EDEFAULT;
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
		result.append(", dasStatus: ");
		result.append(dasStatus);
		result.append(')');
		return result.toString();
	}

} //DASExchangeImpl
