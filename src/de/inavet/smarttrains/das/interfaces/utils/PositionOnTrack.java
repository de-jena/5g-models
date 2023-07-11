/**
 */
package de.inavet.smarttrains.das.interfaces.utils;

import org.eclipse.emf.ecore.EObject;

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
 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getPositionOnTrack()
 * @model
 * @generated
 */
public interface PositionOnTrack extends EObject {
	/**
	 * Returns the value of the '<em><b>Track Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track Id</em>' attribute.
	 * @see #setTrackId(String)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getPositionOnTrack_TrackId()
	 * @model required="true"
	 * @generated
	 */
	String getTrackId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack#getTrackId <em>Track Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track Id</em>' attribute.
	 * @see #getTrackId()
	 * @generated
	 */
	void setTrackId(String value);

	/**
	 * Returns the value of the '<em><b>Relative Position On Track</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Position On Track</em>' attribute.
	 * @see #setRelativePositionOnTrack(double)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getPositionOnTrack_RelativePositionOnTrack()
	 * @model required="true"
	 * @generated
	 */
	double getRelativePositionOnTrack();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack#getRelativePositionOnTrack <em>Relative Position On Track</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Position On Track</em>' attribute.
	 * @see #getRelativePositionOnTrack()
	 * @generated
	 */
	void setRelativePositionOnTrack(double value);

} // PositionOnTrack
