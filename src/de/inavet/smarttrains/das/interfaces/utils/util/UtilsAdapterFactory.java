/**
 */
package de.inavet.smarttrains.das.interfaces.utils.util;

import de.inavet.smarttrains.das.interfaces.utils.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage
 * @generated
 */
public class UtilsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UtilsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UtilsPackage.eINSTANCE;
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
	protected UtilsSwitch<Adapter> modelSwitch =
		new UtilsSwitch<Adapter>() {
			@Override
			public Adapter caseJourney(Journey object) {
				return createJourneyAdapter();
			}
			@Override
			public Adapter caseJourneyResponseFromDatabroker(JourneyResponseFromDatabroker object) {
				return createJourneyResponseFromDatabrokerAdapter();
			}
			@Override
			public Adapter caseGNSS(GNSS object) {
				return createGNSSAdapter();
			}
			@Override
			public Adapter casePosition(Position object) {
				return createPositionAdapter();
			}
			@Override
			public Adapter casePositionOnTrack(PositionOnTrack object) {
				return createPositionOnTrackAdapter();
			}
			@Override
			public Adapter caseValueItem(ValueItem object) {
				return createValueItemAdapter();
			}
			@Override
			public Adapter caseVehicle(Vehicle object) {
				return createVehicleAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.utils.Journey <em>Journey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Journey
	 * @generated
	 */
	public Adapter createJourneyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.utils.JourneyResponseFromDatabroker <em>Journey Response From Databroker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.utils.JourneyResponseFromDatabroker
	 * @generated
	 */
	public Adapter createJourneyResponseFromDatabrokerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.utils.GNSS <em>GNSS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.utils.GNSS
	 * @generated
	 */
	public Adapter createGNSSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.utils.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Position
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack <em>Position On Track</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.utils.PositionOnTrack
	 * @generated
	 */
	public Adapter createPositionOnTrackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.utils.ValueItem <em>Value Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.utils.ValueItem
	 * @generated
	 */
	public Adapter createValueItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.inavet.smarttrains.das.interfaces.utils.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Vehicle
	 * @generated
	 */
	public Adapter createVehicleAdapter() {
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

} //UtilsAdapterFactory
