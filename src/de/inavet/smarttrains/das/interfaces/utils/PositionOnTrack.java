/**
 */
package de.inavet.smarttrains.das.interfaces.utils;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position On Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * relative Position auf der Modell-Infrastruktur
 * Hilfsklasse
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack#getTrackId <em>Track Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack#getRelativePositionOnTrack <em>Relative Position On Track</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionOnTrack extends MinimalEObjectImpl.Container {
	/**
	 * The default value of the '{@link #getTrackId() <em>Track Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrackId() <em>Track Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackId()
	 * @generated
	 * @ordered
	 */
	protected String trackId = TRACK_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelativePositionOnTrack() <em>Relative Position On Track</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePositionOnTrack()
	 * @generated
	 * @ordered
	 */
	protected static final double RELATIVE_POSITION_ON_TRACK_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRelativePositionOnTrack() <em>Relative Position On Track</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePositionOnTrack()
	 * @generated
	 * @ordered
	 */
	protected double relativePositionOnTrack = RELATIVE_POSITION_ON_TRACK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionOnTrack() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilsPackage.Literals.POSITION_ON_TRACK;
	}

	/**
	 * Returns the value of the '<em><b>Track Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track Id</em>' attribute.
	 * @see #setTrackId(String)
	 * @generated
	 */
	public String getTrackId() {
		return trackId;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack#getTrackId <em>Track Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTrackId the new value of the '<em>Track Id</em>' attribute.
	 * @see #getTrackId()
	 * @generated
	 */
	public void setTrackId(String newTrackId) {
		trackId = newTrackId;
	}

	/**
	 * Returns the value of the '<em><b>Relative Position On Track</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Position On Track</em>' attribute.
	 * @see #setRelativePositionOnTrack(double)
	 * @generated
	 */
	public double getRelativePositionOnTrack() {
		return relativePositionOnTrack;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack#getRelativePositionOnTrack <em>Relative Position On Track</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newRelativePositionOnTrack the new value of the '<em>Relative Position On Track</em>' attribute.
	 * @see #getRelativePositionOnTrack()
	 * @generated
	 */
	public void setRelativePositionOnTrack(double newRelativePositionOnTrack) {
		relativePositionOnTrack = newRelativePositionOnTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UtilsPackage.POSITION_ON_TRACK__TRACK_ID:
				return getTrackId();
			case UtilsPackage.POSITION_ON_TRACK__RELATIVE_POSITION_ON_TRACK:
				return getRelativePositionOnTrack();
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
			case UtilsPackage.POSITION_ON_TRACK__TRACK_ID:
				setTrackId((String)newValue);
				return;
			case UtilsPackage.POSITION_ON_TRACK__RELATIVE_POSITION_ON_TRACK:
				setRelativePositionOnTrack((Double)newValue);
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
			case UtilsPackage.POSITION_ON_TRACK__TRACK_ID:
				setTrackId(TRACK_ID_EDEFAULT);
				return;
			case UtilsPackage.POSITION_ON_TRACK__RELATIVE_POSITION_ON_TRACK:
				setRelativePositionOnTrack(RELATIVE_POSITION_ON_TRACK_EDEFAULT);
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
			case UtilsPackage.POSITION_ON_TRACK__TRACK_ID:
				return TRACK_ID_EDEFAULT == null ? trackId != null : !TRACK_ID_EDEFAULT.equals(trackId);
			case UtilsPackage.POSITION_ON_TRACK__RELATIVE_POSITION_ON_TRACK:
				return relativePositionOnTrack != RELATIVE_POSITION_ON_TRACK_EDEFAULT;
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
		result.append(" (trackId: ");
		result.append(trackId);
		result.append(", relativePositionOnTrack: ");
		result.append(relativePositionOnTrack);
		result.append(')');
		return result.toString();
	}

} // PositionOnTrack
