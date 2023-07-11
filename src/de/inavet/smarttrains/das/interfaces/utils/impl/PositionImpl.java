/**
 */
package de.inavet.smarttrains.das.interfaces.utils.impl;

import de.inavet.smarttrains.das.interfaces.utils.Position;
import de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack;
import de.inavet.smarttrains.das.interfaces.utils.UtilsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.impl.PositionImpl#getPositionOnTrack <em>Position On Track</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.impl.PositionImpl#getLat <em>Lat</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.impl.PositionImpl#getLon <em>Lon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionImpl extends MinimalEObjectImpl.Container implements Position {
	/**
	 * The cached value of the '{@link #getPositionOnTrack() <em>Position On Track</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionOnTrack()
	 * @generated
	 * @ordered
	 */
	protected PositionOnTrack positionOnTrack;

	/**
	 * The default value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected static final double LAT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected double lat = LAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLon() <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLon()
	 * @generated
	 * @ordered
	 */
	protected static final double LON_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLon() <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLon()
	 * @generated
	 * @ordered
	 */
	protected double lon = LON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilsPackage.Literals.POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionOnTrack getPositionOnTrack() {
		return positionOnTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionOnTrack(PositionOnTrack newPositionOnTrack, NotificationChain msgs) {
		PositionOnTrack oldPositionOnTrack = positionOnTrack;
		positionOnTrack = newPositionOnTrack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UtilsPackage.POSITION__POSITION_ON_TRACK, oldPositionOnTrack, newPositionOnTrack);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionOnTrack(PositionOnTrack newPositionOnTrack) {
		if (newPositionOnTrack != positionOnTrack) {
			NotificationChain msgs = null;
			if (positionOnTrack != null)
				msgs = ((InternalEObject)positionOnTrack).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UtilsPackage.POSITION__POSITION_ON_TRACK, null, msgs);
			if (newPositionOnTrack != null)
				msgs = ((InternalEObject)newPositionOnTrack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UtilsPackage.POSITION__POSITION_ON_TRACK, null, msgs);
			msgs = basicSetPositionOnTrack(newPositionOnTrack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.POSITION__POSITION_ON_TRACK, newPositionOnTrack, newPositionOnTrack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLat() {
		return lat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLat(double newLat) {
		double oldLat = lat;
		lat = newLat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.POSITION__LAT, oldLat, lat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLon() {
		return lon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLon(double newLon) {
		double oldLon = lon;
		lon = newLon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.POSITION__LON, oldLon, lon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UtilsPackage.POSITION__POSITION_ON_TRACK:
				return basicSetPositionOnTrack(null, msgs);
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
			case UtilsPackage.POSITION__POSITION_ON_TRACK:
				return getPositionOnTrack();
			case UtilsPackage.POSITION__LAT:
				return getLat();
			case UtilsPackage.POSITION__LON:
				return getLon();
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
			case UtilsPackage.POSITION__POSITION_ON_TRACK:
				setPositionOnTrack((PositionOnTrack)newValue);
				return;
			case UtilsPackage.POSITION__LAT:
				setLat((Double)newValue);
				return;
			case UtilsPackage.POSITION__LON:
				setLon((Double)newValue);
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
			case UtilsPackage.POSITION__POSITION_ON_TRACK:
				setPositionOnTrack((PositionOnTrack)null);
				return;
			case UtilsPackage.POSITION__LAT:
				setLat(LAT_EDEFAULT);
				return;
			case UtilsPackage.POSITION__LON:
				setLon(LON_EDEFAULT);
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
			case UtilsPackage.POSITION__POSITION_ON_TRACK:
				return positionOnTrack != null;
			case UtilsPackage.POSITION__LAT:
				return lat != LAT_EDEFAULT;
			case UtilsPackage.POSITION__LON:
				return lon != LON_EDEFAULT;
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
		result.append(" (lat: ");
		result.append(lat);
		result.append(", lon: ");
		result.append(lon);
		result.append(')');
		return result.toString();
	}

} //PositionImpl
