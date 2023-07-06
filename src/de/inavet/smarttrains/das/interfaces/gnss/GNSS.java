/**
 */
package de.inavet.smarttrains.das.interfaces.gnss;

import de.inavet.smarttrains.das.interfaces.journey.Journey;

import de.inavet.smarttrains.das.interfaces.utils.NMEAType;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GNSS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * GNSS-Datum vom Smartphone / der mobilen Anwendung zum Datenbroker
 * wird mind. sekündlich vom der Smartphone / der mobilen Anwendung zum Datenbroker gesendet
 * Root-Klasse
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.gnss.GNSS#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.gnss.GNSS#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.gnss.GNSS#getType <em>Type</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.gnss.GNSS#getNmeastring <em>Nmeastring</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.gnss.GNSS#getJourney <em>Journey</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GNSS extends MinimalEObjectImpl.Container {
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
	 * The cached value of the '{@link #getJourney() <em>Journey</em>}' reference.
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
	public GNSS() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GnssPackage.Literals.GNSS;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datenbroker-id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.gnss.GNSS#getId <em>Id</em>}' attribute.
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
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitstempel der Datum-Erzeugung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(ZonedDateTime)
	 * @generated
	 */
	public ZonedDateTime getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.gnss.GNSS#getTimestamp <em>Timestamp</em>}' attribute.
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
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"GPRMC"</code>.
	 * The literals are from the enumeration {@link de.inavet.smarttrains.das.interfaces.utils.NMEAType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nmea-type zur späteren Filterung auf dem Datenbroker
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.inavet.smarttrains.das.interfaces.utils.NMEAType
	 * @see #setType(NMEAType)
	 * @generated
	 */
	public NMEAType getType() {
		return type;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.gnss.GNSS#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newType the new value of the '<em>Type</em>' attribute.
	 * @see de.inavet.smarttrains.das.interfaces.utils.NMEAType
	 * @see #getType()
	 * @generated
	 */
	public void setType(NMEAType newType) {
		type = newType == null ? TYPE_EDEFAULT : newType;
	}

	/**
	 * Returns the value of the '<em><b>Nmeastring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * der eigentliche nmea-String der Anwendung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nmeastring</em>' attribute.
	 * @see #setNmeastring(String)
	 * @generated
	 */
	public String getNmeastring() {
		return nmeastring;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.gnss.GNSS#getNmeastring <em>Nmeastring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newNmeastring the new value of the '<em>Nmeastring</em>' attribute.
	 * @see #getNmeastring()
	 * @generated
	 */
	public void setNmeastring(String newNmeastring) {
		nmeastring = newNmeastring;
	}

	/**
	 * Returns the value of the '<em><b>Journey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * journey bzw. journey-id zur Zuweisung des nmea-strings zur entsprechenden Fahrt
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journey</em>' reference.
	 * @see #setJourney(Journey)
	 * @generated
	 */
	public Journey getJourney() {
		if (journey != null && ((EObject)journey).eIsProxy()) {
			InternalEObject oldJourney = journey;
			journey = (Journey)eResolveProxy(oldJourney);
			if (journey != oldJourney) {
			}
		}
		return journey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Journey basicGetJourney() {
		return journey;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.gnss.GNSS#getJourney <em>Journey</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newJourney the new value of the '<em>Journey</em>' reference.
	 * @see #getJourney()
	 * @generated
	 */
	public void setJourney(Journey newJourney) {
		journey = newJourney;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GnssPackage.GNSS__ID:
				return getId();
			case GnssPackage.GNSS__TIMESTAMP:
				return getTimestamp();
			case GnssPackage.GNSS__TYPE:
				return getType();
			case GnssPackage.GNSS__NMEASTRING:
				return getNmeastring();
			case GnssPackage.GNSS__JOURNEY:
				if (resolve) return getJourney();
				return basicGetJourney();
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
			case GnssPackage.GNSS__ID:
				setId((String)newValue);
				return;
			case GnssPackage.GNSS__TIMESTAMP:
				setTimestamp((ZonedDateTime)newValue);
				return;
			case GnssPackage.GNSS__TYPE:
				setType((NMEAType)newValue);
				return;
			case GnssPackage.GNSS__NMEASTRING:
				setNmeastring((String)newValue);
				return;
			case GnssPackage.GNSS__JOURNEY:
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
			case GnssPackage.GNSS__ID:
				setId(ID_EDEFAULT);
				return;
			case GnssPackage.GNSS__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case GnssPackage.GNSS__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GnssPackage.GNSS__NMEASTRING:
				setNmeastring(NMEASTRING_EDEFAULT);
				return;
			case GnssPackage.GNSS__JOURNEY:
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
			case GnssPackage.GNSS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GnssPackage.GNSS__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case GnssPackage.GNSS__TYPE:
				return type != TYPE_EDEFAULT;
			case GnssPackage.GNSS__NMEASTRING:
				return NMEASTRING_EDEFAULT == null ? nmeastring != null : !NMEASTRING_EDEFAULT.equals(nmeastring);
			case GnssPackage.GNSS__JOURNEY:
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

} // GNSS
