/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import java.time.ZonedDateTime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trajectory Left From Mobile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Trajektorie verlassen Meldung vom Mobile
 * Auch hier ist die Verwendung noch nicht klar
 * Upadate 26.04.2023: Klassse wird nicht gebraucht, da die Zentrale immer die position des Mobilgeräts kennt und somit das Verlassen der Trajektorie selbst feststellen kann.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.TrajectoryLeftFromMobile#getTrajectory <em>Trajectory</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.TrajectoryLeftFromMobile#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getTrajectoryLeftFromMobile()
 * @model
 * @generated
 */
public interface TrajectoryLeftFromMobile extends EObject {
	/**
	 * Returns the value of the '<em><b>Trajectory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trajectory</em>' reference.
	 * @see #setTrajectory(Trajectory)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getTrajectoryLeftFromMobile_Trajectory()
	 * @model keys="id" required="true"
	 * @generated
	 */
	Trajectory getTrajectory();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TrajectoryLeftFromMobile#getTrajectory <em>Trajectory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trajectory</em>' reference.
	 * @see #getTrajectory()
	 * @generated
	 */
	void setTrajectory(Trajectory value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(ZonedDateTime)
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getTrajectoryLeftFromMobile_TimeStamp()
	 * @model dataType="de.inavet.smarttrains.das.interfaces.utils.ZonedDateTime" required="true"
	 * @generated
	 */
	ZonedDateTime getTimeStamp();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.dasexchange.TrajectoryLeftFromMobile#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(ZonedDateTime value);

} // TrajectoryLeftFromMobile
