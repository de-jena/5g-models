/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario Prognosis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis#getRefScenarioId <em>Ref Scenario Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis#getReleaseTimes <em>Release Times</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getScenarioPrognosis()
 * @model
 * @generated
 */
public interface ScenarioPrognosis extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref Scenario Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Scenario Id</em>' attribute.
	 * @see #setRefScenarioId(String)
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getScenarioPrognosis_RefScenarioId()
	 * @model required="true"
	 * @generated
	 */
	String getRefScenarioId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis#getRefScenarioId <em>Ref Scenario Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Scenario Id</em>' attribute.
	 * @see #getRefScenarioId()
	 * @generated
	 */
	void setRefScenarioId(String value);

	/**
	 * Returns the value of the '<em><b>Release Times</b></em>' containment reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Times</em>' containment reference list.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage#getScenarioPrognosis_ReleaseTimes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ReleaseTimeVector> getReleaseTimes();

} // ScenarioPrognosis
