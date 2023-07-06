/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc.impl;

import de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage;
import de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector;
import de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario Prognosis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.ScenarioPrognosisImpl#getRefScenarioId <em>Ref Scenario Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.ctlc.impl.ScenarioPrognosisImpl#getReleaseTimes <em>Release Times</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioPrognosisImpl extends MinimalEObjectImpl.Container implements ScenarioPrognosis {
	/**
	 * The default value of the '{@link #getRefScenarioId() <em>Ref Scenario Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefScenarioId()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_SCENARIO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefScenarioId() <em>Ref Scenario Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefScenarioId()
	 * @generated
	 * @ordered
	 */
	protected String refScenarioId = REF_SCENARIO_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReleaseTimes() <em>Release Times</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseTimes()
	 * @generated
	 * @ordered
	 */
	protected EList<ReleaseTimeVector> releaseTimes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioPrognosisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtlcPackage.Literals.SCENARIO_PROGNOSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefScenarioId() {
		return refScenarioId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefScenarioId(String newRefScenarioId) {
		String oldRefScenarioId = refScenarioId;
		refScenarioId = newRefScenarioId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtlcPackage.SCENARIO_PROGNOSIS__REF_SCENARIO_ID, oldRefScenarioId, refScenarioId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReleaseTimeVector> getReleaseTimes() {
		if (releaseTimes == null) {
			releaseTimes = new EObjectResolvingEList<ReleaseTimeVector>(ReleaseTimeVector.class, this, CtlcPackage.SCENARIO_PROGNOSIS__RELEASE_TIMES);
		}
		return releaseTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CtlcPackage.SCENARIO_PROGNOSIS__REF_SCENARIO_ID:
				return getRefScenarioId();
			case CtlcPackage.SCENARIO_PROGNOSIS__RELEASE_TIMES:
				return getReleaseTimes();
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
			case CtlcPackage.SCENARIO_PROGNOSIS__REF_SCENARIO_ID:
				setRefScenarioId((String)newValue);
				return;
			case CtlcPackage.SCENARIO_PROGNOSIS__RELEASE_TIMES:
				getReleaseTimes().clear();
				getReleaseTimes().addAll((Collection<? extends ReleaseTimeVector>)newValue);
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
			case CtlcPackage.SCENARIO_PROGNOSIS__REF_SCENARIO_ID:
				setRefScenarioId(REF_SCENARIO_ID_EDEFAULT);
				return;
			case CtlcPackage.SCENARIO_PROGNOSIS__RELEASE_TIMES:
				getReleaseTimes().clear();
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
			case CtlcPackage.SCENARIO_PROGNOSIS__REF_SCENARIO_ID:
				return REF_SCENARIO_ID_EDEFAULT == null ? refScenarioId != null : !REF_SCENARIO_ID_EDEFAULT.equals(refScenarioId);
			case CtlcPackage.SCENARIO_PROGNOSIS__RELEASE_TIMES:
				return releaseTimes != null && !releaseTimes.isEmpty();
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
		result.append(" (refScenarioId: ");
		result.append(refScenarioId);
		result.append(')');
		return result.toString();
	}

} //ScenarioPrognosisImpl
