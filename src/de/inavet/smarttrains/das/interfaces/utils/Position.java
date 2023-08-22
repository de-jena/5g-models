/**
 */
package de.inavet.smarttrains.das.interfaces.utils;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.Position#getPositionOnTrack <em>Position On Track</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.Position#getLat <em>Lat</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.Position#getLon <em>Lon</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject {
	/**
	 * Returns the value of the '<em><b>Position On Track</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position On Track</em>' containment reference.
	 * @see #setPositionOnTrack(PositionOnTrack)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getPosition_PositionOnTrack()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PositionOnTrack getPositionOnTrack();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.Position#getPositionOnTrack <em>Position On Track</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position On Track</em>' containment reference.
	 * @see #getPositionOnTrack()
	 * @generated
	 */
	void setPositionOnTrack(PositionOnTrack value);

	/**
	 * Returns the value of the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat</em>' attribute.
	 * @see #setLat(double)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getPosition_Lat()
	 * @model required="true"
	 * @generated
	 */
	double getLat();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.Position#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat</em>' attribute.
	 * @see #getLat()
	 * @generated
	 */
	void setLat(double value);

	/**
	 * Returns the value of the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lon</em>' attribute.
	 * @see #setLon(double)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getPosition_Lon()
	 * @model required="true"
	 * @generated
	 */
	double getLon();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.Position#getLon <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lon</em>' attribute.
	 * @see #getLon()
	 * @generated
	 */
	void setLon(double value);

} // Position
