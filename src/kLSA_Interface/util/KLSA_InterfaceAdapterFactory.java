/**
 */
package kLSA_Interface.util;

import kLSA_Interface.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see kLSA_Interface.KLSA_InterfacePackage
 * @generated
 */
public class KLSA_InterfaceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KLSA_InterfacePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KLSA_InterfaceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KLSA_InterfacePackage.eINSTANCE;
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
	protected KLSA_InterfaceSwitch<Adapter> modelSwitch =
		new KLSA_InterfaceSwitch<Adapter>() {
			@Override
			public Adapter casePrognosisForkLSA(PrognosisForkLSA object) {
				return createPrognosisForkLSAAdapter();
			}
			@Override
			public Adapter casePrognosisArrivalAndPosition(PrognosisArrivalAndPosition object) {
				return createPrognosisArrivalAndPositionAdapter();
			}
			@Override
			public Adapter caseMarkedPosition(MarkedPosition object) {
				return createMarkedPositionAdapter();
			}
			@Override
			public Adapter casePriority(Priority object) {
				return createPriorityAdapter();
			}
			@Override
			public Adapter caseReleaseTimeWindowForLSA(ReleaseTimeWindowForLSA object) {
				return createReleaseTimeWindowForLSAAdapter();
			}
			@Override
			public Adapter caseTimeSlotAndPosition(TimeSlotAndPosition object) {
				return createTimeSlotAndPositionAdapter();
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
	 * Creates a new adapter for an object of class '{@link kLSA_Interface.PrognosisForkLSA <em>Prognosis Fork LSA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kLSA_Interface.PrognosisForkLSA
	 * @generated
	 */
	public Adapter createPrognosisForkLSAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kLSA_Interface.PrognosisArrivalAndPosition <em>Prognosis Arrival And Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kLSA_Interface.PrognosisArrivalAndPosition
	 * @generated
	 */
	public Adapter createPrognosisArrivalAndPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kLSA_Interface.MarkedPosition <em>Marked Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kLSA_Interface.MarkedPosition
	 * @generated
	 */
	public Adapter createMarkedPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kLSA_Interface.Priority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kLSA_Interface.Priority
	 * @generated
	 */
	public Adapter createPriorityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kLSA_Interface.ReleaseTimeWindowForLSA <em>Release Time Window For LSA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kLSA_Interface.ReleaseTimeWindowForLSA
	 * @generated
	 */
	public Adapter createReleaseTimeWindowForLSAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kLSA_Interface.TimeSlotAndPosition <em>Time Slot And Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kLSA_Interface.TimeSlotAndPosition
	 * @generated
	 */
	public Adapter createTimeSlotAndPositionAdapter() {
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

} //KLSA_InterfaceAdapterFactory
