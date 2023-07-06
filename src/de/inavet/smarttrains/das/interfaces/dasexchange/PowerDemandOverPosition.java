/**
 */
package de.inavet.smarttrains.das.interfaces.dasexchange;

import de.inavet.smarttrains.das.interfaces.utils.Position;
import de.inavet.smarttrains.das.interfaces.utils.ValueItem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Demand Over Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hilfsklasse
 * Leistungsbedarf auf einer Position
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverPosition#getPowerPrognosis <em>Power Prognosis</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.dasexchange.PowerDemandOverPosition#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPowerDemandOverPosition()
 * @model
 * @generated
 */
public interface PowerDemandOverPosition extends EObject {
	/**
	 * Returns the value of the '<em><b>Power Prognosis</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.utils.ValueItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Leistungsbedarfsprognosen
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Prognosis</em>' reference list.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPowerDemandOverPosition_PowerPrognosis()
	 * @model required="true"
	 * @generated
	 */
	EList<ValueItem> getPowerPrognosis();

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.utils.Position}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Positionen für Leistungsbedarf
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' reference list.
	 * @see de.inavet.smarttrains.das.interfaces.dasexchange.DasexchangePackage#getPowerDemandOverPosition_Position()
	 * @model required="true"
	 * @generated
	 */
	EList<Position> getPosition();

} // PowerDemandOverPosition
