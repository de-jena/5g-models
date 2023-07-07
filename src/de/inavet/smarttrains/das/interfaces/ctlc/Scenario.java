/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

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
 * @generated
 */
public class Scenario extends MinimalEObjectImpl.Container {
	/**
	 * The default value of the '{@link #getScenarioId() <em>Scenario Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioId()
	 * @generated
	 * @ordered
	 */
	protected static final String SCENARIO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScenarioId() <em>Scenario Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioId()
	 * @generated
	 * @ordered
	 */
	protected String scenarioId = SCENARIO_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOverrides() <em>Overrides</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrides()
	 * @generated
	 * @ordered
	 */
	protected EList<PrognosisOverride> overrides;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Scenario() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtlcPackage.Literals.SCENARIO;
	}

	/**
	 * Returns the value of the '<em><b>Scenario Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario Id</em>' attribute.
	 * @see #setScenarioId(String)
	 * @generated
	 */
	public String getScenarioId() {
		return scenarioId;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.ctlc.Scenario#getScenarioId <em>Scenario Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newScenarioId the new value of the '<em>Scenario Id</em>' attribute.
	 * @see #getScenarioId()
	 * @generated
	 */
	public void setScenarioId(String newScenarioId) {
		scenarioId = newScenarioId;
	}

	/**
	 * Returns the value of the '<em><b>Overrides</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overrides</em>' reference list.
	 * @generated
	 */
	public EList<PrognosisOverride> getOverrides() {
		if (overrides == null) {
			overrides = new BasicInternalEList<PrognosisOverride>(PrognosisOverride.class);
		}
		return overrides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CtlcPackage.SCENARIO__SCENARIO_ID:
				return getScenarioId();
			case CtlcPackage.SCENARIO__OVERRIDES:
				return getOverrides();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CtlcPackage.SCENARIO__SCENARIO_ID:
				setScenarioId((String)newValue);
				return;
			case CtlcPackage.SCENARIO__OVERRIDES:
				getOverrides().clear();
				getOverrides().addAll((Collection<? extends PrognosisOverride>)newValue);
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
			case CtlcPackage.SCENARIO__SCENARIO_ID:
				setScenarioId(SCENARIO_ID_EDEFAULT);
				return;
			case CtlcPackage.SCENARIO__OVERRIDES:
				getOverrides().clear();
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
			case CtlcPackage.SCENARIO__SCENARIO_ID:
				return SCENARIO_ID_EDEFAULT == null ? scenarioId != null : !SCENARIO_ID_EDEFAULT.equals(scenarioId);
			case CtlcPackage.SCENARIO__OVERRIDES:
				return overrides != null && !overrides.isEmpty();
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
		result.append(" (scenarioId: ");
		result.append(scenarioId);
		result.append(')');
		return result.toString();
	}

} // Scenario
