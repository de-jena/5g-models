/**
 */
package de.inavet.smarttrains.das.interfaces.utils.impl;

import de.inavet.smarttrains.das.interfaces.utils.GNSS;
import de.inavet.smarttrains.das.interfaces.utils.Journey;
import de.inavet.smarttrains.das.interfaces.utils.NMEAType;
import de.inavet.smarttrains.das.interfaces.utils.UtilsPackage;

import java.time.ZonedDateTime;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GNSS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.impl.GNSSImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.impl.GNSSImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.impl.GNSSImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.impl.GNSSImpl#getNmeastring <em>Nmeastring</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.impl.GNSSImpl#getJourney <em>Journey</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GNSSImpl extends MinimalEObjectImpl.Container implements GNSS {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final NMEAType TYPE_EDEFAULT = NMEAType.GPRMC;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NMEAType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNmeastring() <em>Nmeastring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNmeastring()
	 * @generated
	 * @ordered
	 */
	protected static final String NMEASTRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNmeastring() <em>Nmeastring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNmeastring()
	 * @generated
	 * @ordered
	 */
	protected String nmeastring = NMEASTRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJourney() <em>Journey</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJourney()
	 * @generated
	 * @ordered
	 */
	protected Journey journey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GNSSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilsPackage.Literals.GNSS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.GNSS__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.GNSS__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NMEAType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(NMEAType newType) {
		NMEAType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.GNSS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNmeastring() {
		return nmeastring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNmeastring(String newNmeastring) {
		String oldNmeastring = nmeastring;
		nmeastring = newNmeastring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.GNSS__NMEASTRING, oldNmeastring, nmeastring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Journey getJourney() {
		return journey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJourney(Journey newJourney, NotificationChain msgs) {
		Journey oldJourney = journey;
		journey = newJourney;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UtilsPackage.GNSS__JOURNEY, oldJourney, newJourney);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJourney(Journey newJourney) {
		if (newJourney != journey) {
			NotificationChain msgs = null;
			if (journey != null)
				msgs = ((InternalEObject)journey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UtilsPackage.GNSS__JOURNEY, null, msgs);
			if (newJourney != null)
				msgs = ((InternalEObject)newJourney).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UtilsPackage.GNSS__JOURNEY, null, msgs);
			msgs = basicSetJourney(newJourney, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.GNSS__JOURNEY, newJourney, newJourney));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UtilsPackage.GNSS__JOURNEY:
				return basicSetJourney(null, msgs);
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
			case UtilsPackage.GNSS__ID:
				return getId();
			case UtilsPackage.GNSS__TIMESTAMP:
				return getTimestamp();
			case UtilsPackage.GNSS__TYPE:
				return getType();
			case UtilsPackage.GNSS__NMEASTRING:
				return getNmeastring();
			case UtilsPackage.GNSS__JOURNEY:
				return getJourney();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UtilsPackage.GNSS__ID:
				setId((String)newValue);
				return;
			case UtilsPackage.GNSS__TIMESTAMP:
				setTimestamp((ZonedDateTime)newValue);
				return;
			case UtilsPackage.GNSS__TYPE:
				setType((NMEAType)newValue);
				return;
			case UtilsPackage.GNSS__NMEASTRING:
				setNmeastring((String)newValue);
				return;
			case UtilsPackage.GNSS__JOURNEY:
				setJourney((Journey)newValue);
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
			case UtilsPackage.GNSS__ID:
				setId(ID_EDEFAULT);
				return;
			case UtilsPackage.GNSS__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case UtilsPackage.GNSS__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case UtilsPackage.GNSS__NMEASTRING:
				setNmeastring(NMEASTRING_EDEFAULT);
				return;
			case UtilsPackage.GNSS__JOURNEY:
				setJourney((Journey)null);
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
			case UtilsPackage.GNSS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UtilsPackage.GNSS__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case UtilsPackage.GNSS__TYPE:
				return type != TYPE_EDEFAULT;
			case UtilsPackage.GNSS__NMEASTRING:
				return NMEASTRING_EDEFAULT == null ? nmeastring != null : !NMEASTRING_EDEFAULT.equals(nmeastring);
			case UtilsPackage.GNSS__JOURNEY:
				return journey != null;
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
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", type: ");
		result.append(type);
		result.append(", nmeastring: ");
		result.append(nmeastring);
		result.append(')');
		return result.toString();
	}

} //GNSSImpl
