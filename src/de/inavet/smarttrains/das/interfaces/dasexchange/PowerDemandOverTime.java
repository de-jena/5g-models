/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import de.inavet.smarttrains.das.interfaces.utils.ValueItem;

import java.time.ZonedDateTime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Demand Over Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hilfsklasse
 * Leistungsbedarf über Zeit
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverTime#getPowerPrognosis <em>Power Prognosis</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverTime#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPowerDemandOverTime()
 * @model
 * @generated
 */
public interface PowerDemandOverTime extends EObject {
	/**
	 * Returns the value of the '<em><b>Power Prognosis</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.utils.ValueItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Leistungsbedarfsprognose
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Prognosis</em>' reference list.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPowerDemandOverTime_PowerPrognosis()
	 * @model required="true"
	 * @generated
	 */
	EList<ValueItem> getPowerPrognosis();

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute list.
	 * The list contents are of type {@link java.time.ZonedDateTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitstempel für Leistungsbedarf
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute list.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPowerDemandOverTime_Timestamp()
	 * @model dataType="de.inavet.smarttrains.das.interfaces.utils.ZonedDateTime" required="true"
	 * @generated
	 */
	EList<ZonedDateTime> getTimestamp();

} // PowerDemandOverTime
