/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.Scenario#getScenarioId <em>Scenario Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.Scenario#getOverrides <em>Overrides</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Scenario Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario Id</em>' attribute.
	 * @see #setScenarioId(String)
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getScenario_ScenarioId()
	 * @model required="true"
	 * @generated
	 */
	String getScenarioId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.Scenario#getScenarioId <em>Scenario Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario Id</em>' attribute.
	 * @see #getScenarioId()
	 * @generated
	 */
	void setScenarioId(String value);

	/**
	 * Returns the value of the '<em><b>Overrides</b></em>' containment reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overrides</em>' containment reference list.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getScenario_Overrides()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PrognosisOverride> getOverrides();

} // Scenario
