/**
 */
package de.inavet.smarttrains.das.interfaces.ctlc.util;

import de.inavet.smarttrains.das.interfaces.ctlc.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.inavet.smarttrains.das.interfaces.ctlc.CtlcPackage
 * @generated
 */
public class CtlcAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CtlcPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtlcAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CtlcPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtlcSwitch<Adapter> modelSwitch =
		new CtlcSwitch<Adapter>() {
			@Override
			public Adapter casePeriodicUpdate(PeriodicUpdate object) {
				return createPeriodicUpdateAdapter();
			}
			@Override
			public Adapter caseUpdateForVehicle(UpdateForVehicle object) {
				return createUpdateForVehicleAdapter();
			}
			@Override
			public Adapter casePrognosisArrivalAndPosition(PrognosisArrivalAndPosition object) {
				return createPrognosisArrivalAndPositionAdapter();
			}
			@Override
			public Adapter casePrognosisStopPlace(PrognosisStopPlace object) {
				return createPrognosisStopPlaceAdapter();
			}
			@Override
			public Adapter caseMarkedPosition(MarkedPosition object) {
				return createMarkedPositionAdapter();
			}
			@Override
			public Adapter caseReleaseTimePrognosisRequest(ReleaseTimePrognosisRequest object) {
				return createReleaseTimePrognosisRequestAdapter();
			}
			@Override
			public Adapter caseScenario(Scenario object) {
				return createScenarioAdapter();
			}
			@Override
			public Adapter casePrognosisOverride(PrognosisOverride object) {
				return createPrognosisOverrideAdapter();
			}
			@Override
			public Adapter caseReleaseTimePrognosisResponse(ReleaseTimePrognosisResponse object) {
				return createReleaseTimePrognosisResponseAdapter();
			}
			@Override
			public Adapter caseScenarioPrognosis(ScenarioPrognosis object) {
				return createScenarioPrognosisAdapter();
			}
			@Override
			public Adapter caseReleaseTimeVector(ReleaseTimeVector object) {
				return createReleaseTimeVectorAdapter();
			}
			@Override
			public Adapter caseSignalGroup(SignalGroup object) {
				return createSignalGroupAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate <em>Periodic Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PeriodicUpdate
	 * @generated
	 */
	public Adapter createPeriodicUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle <em>Update For Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.UpdateForVehicle
	 * @generated
	 */
	public Adapter createUpdateForVehicleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition <em>Prognosis Arrival And Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisArrivalAndPosition
	 * @generated
	 */
	public Adapter createPrognosisArrivalAndPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace <em>Prognosis Stop Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisStopPlace
	 * @generated
	 */
	public Adapter createPrognosisStopPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.ctlc.MarkedPosition <em>Marked Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.MarkedPosition
	 * @generated
	 */
	public Adapter createMarkedPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest <em>Release Time Prognosis Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisRequest
	 * @generated
	 */
	public Adapter createReleaseTimePrognosisRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.ctlc.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride <em>Prognosis Override</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.PrognosisOverride
	 * @generated
	 */
	public Adapter createPrognosisOverrideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse <em>Release Time Prognosis Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimePrognosisResponse
	 * @generated
	 */
	public Adapter createReleaseTimePrognosisResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis <em>Scenario Prognosis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ScenarioPrognosis
	 * @generated
	 */
	public Adapter createScenarioPrognosisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector <em>Release Time Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.ReleaseTimeVector
	 * @generated
	 */
	public Adapter createReleaseTimeVectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.ctlc.SignalGroup <em>Signal Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.ctlc.SignalGroup
	 * @generated
	 */
	public Adapter createSignalGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CtlcAdapterFactory
