/**
 */
package de.inavet.smarttrains.das.interfaces.utils.impl;

import de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack;
import de.inavet.smarttrains.das.interfaces.utils.UtilsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position On Track</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.impl.PositionOnTrackImpl#getTrackId <em>Track Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.impl.PositionOnTrackImpl#getRelativePositionOnTrack <em>Relative Position On Track</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionOnTrackImpl extends MinimalEObjectImpl.Container implements PositionOnTrack {
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
	protected PositionOnTrackImpl() {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrackId() {
		return trackId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackId(String newTrackId) {
		String oldTrackId = trackId;
		trackId = newTrackId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.POSITION_ON_TRACK__TRACK_ID, oldTrackId, trackId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRelativePositionOnTrack() {
		return relativePositionOnTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativePositionOnTrack(double newRelativePositionOnTrack) {
		double oldRelativePositionOnTrack = relativePositionOnTrack;
		relativePositionOnTrack = newRelativePositionOnTrack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.POSITION_ON_TRACK__RELATIVE_POSITION_ON_TRACK, oldRelativePositionOnTrack, relativePositionOnTrack));
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

} //PositionOnTrackImpl
