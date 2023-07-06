/**
 */
package de.inavet.smarttrains.das.interfaces.journey;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @generated
 */
public class JourneyFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final JourneyFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final JourneyFactory INSTANCE = de.inavet.smarttrains.das.interfaces.journey.JourneyFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JourneyFactory init() {
		try {
			JourneyFactory theJourneyFactory = (JourneyFactory)EPackage.Registry.INSTANCE.getEFactory(JourneyPackage.eNS_URI);
			if (theJourneyFactory != null) {
				return theJourneyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JourneyFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneyFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JourneyPackage.JOURNEY: return (EObject)createJourney();
			case JourneyPackage.JOURNEY_RESPONSE_FROM_DATABROKER: return (EObject)createJourneyResponseFromDatabroker();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Journey createJourney() {
		Journey journey = new Journey();
		return journey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneyResponseFromDatabroker createJourneyResponseFromDatabroker() {
		JourneyResponseFromDatabroker journeyResponseFromDatabroker = new JourneyResponseFromDatabroker();
		return journeyResponseFromDatabroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JourneyPackage getJourneyPackage() {
		return (JourneyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JourneyPackage getPackage() {
		return JourneyPackage.eINSTANCE;
	}

} //JourneyFactory
