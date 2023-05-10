/**
 */
package de.inavet.mqttadapter.datamodels.utils;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Geo-Lokalisation mit Relativ-Position
 * Hilfsklasse
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link utils.Position#getPositionOnTrack <em>Position On Track</em>}</li>
 *   <li>{@link utils.Position#getLat <em>Lat</em>}</li>
 *   <li>{@link utils.Position#getLon <em>Lon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Position extends MinimalEObjectImpl.Container {
	/**
	 * The cached value of the '{@link #getPositionOnTrack() <em>Position On Track</em>}' reference.
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
	public Position() {
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
	 * Returns the value of the '<em><b>Position On Track</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position On Track</em>' reference.
	 * @see #setPositionOnTrack(PositionOnTrack)
	 * @generated
	 */
	public PositionOnTrack getPositionOnTrack() {
		if (positionOnTrack != null && ((EObject)positionOnTrack).eIsProxy()) {
			InternalEObject oldPositionOnTrack = positionOnTrack;
			positionOnTrack = (PositionOnTrack)eResolveProxy(oldPositionOnTrack);
			if (positionOnTrack != oldPositionOnTrack) {
			}
		}
		return positionOnTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionOnTrack basicGetPositionOnTrack() {
		return positionOnTrack;
	}

	/**
	 * Sets the value of the '{@link utils.Position#getPositionOnTrack <em>Position On Track</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newPositionOnTrack the new value of the '<em>Position On Track</em>' reference.
	 * @see #getPositionOnTrack()
	 * @generated
	 */
	public void setPositionOnTrack(PositionOnTrack newPositionOnTrack) {
		positionOnTrack = newPositionOnTrack;
	}

	/**
	 * Returns the value of the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat</em>' attribute.
	 * @see #setLat(double)
	 * @generated
	 */
	public double getLat() {
		return lat;
	}

	/**
	 * Sets the value of the '{@link utils.Position#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLat the new value of the '<em>Lat</em>' attribute.
	 * @see #getLat()
	 * @generated
	 */
	public void setLat(double newLat) {
		lat = newLat;
	}

	/**
	 * Returns the value of the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lon</em>' attribute.
	 * @see #setLon(double)
	 * @generated
	 */
	public double getLon() {
		return lon;
	}

	/**
	 * Sets the value of the '{@link utils.Position#getLon <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newLon the new value of the '<em>Lon</em>' attribute.
	 * @see #getLon()
	 * @generated
	 */
	public void setLon(double newLon) {
		lon = newLon;
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
				if (resolve) return getPositionOnTrack();
				return basicGetPositionOnTrack();
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

} // Position
