/**
 */
package de.inavet.smarttrains.das.interfaces.basicDataSynchronisation;

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
public class BasicDataSynchronisationFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BasicDataSynchronisationFactory eINSTANCE = init();

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BasicDataSynchronisationFactory INSTANCE = de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationFactory.eINSTANCE;

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasicDataSynchronisationFactory init() {
		try {
			BasicDataSynchronisationFactory theBasicDataSynchronisationFactory = (BasicDataSynchronisationFactory)EPackage.Registry.INSTANCE.getEFactory(BasicDataSynchronisationPackage.eNS_URI);
			if (theBasicDataSynchronisationFactory != null) {
				return theBasicDataSynchronisationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasicDataSynchronisationFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicDataSynchronisationFactory() {
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
			case BasicDataSynchronisationPackage.DEVICE_REGISTRATION: return (EObject)createDeviceRegistration();
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE: return (EObject)createSynchroniseBasicDataResponse();
			case BasicDataSynchronisationPackage.BASIC_DATA: return (EObject)createBasicData();
			case BasicDataSynchronisationPackage.LINE_TO_COURSES: return (EObject)createLineToCourses();
			case BasicDataSynchronisationPackage.COURSE_TO_ROUTES: return (EObject)createCourseToRoutes();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceRegistration createDeviceRegistration() {
		DeviceRegistration deviceRegistration = new DeviceRegistration();
		return deviceRegistration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchroniseBasicDataResponse createSynchroniseBasicDataResponse() {
		SynchroniseBasicDataResponse synchroniseBasicDataResponse = new SynchroniseBasicDataResponse();
		return synchroniseBasicDataResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicData createBasicData() {
		BasicData basicData = new BasicData();
		return basicData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineToCourses createLineToCourses() {
		LineToCourses lineToCourses = new LineToCourses();
		return lineToCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseToRoutes createCourseToRoutes() {
		CourseToRoutes courseToRoutes = new CourseToRoutes();
		return courseToRoutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicDataSynchronisationPackage getBasicDataSynchronisationPackage() {
		return (BasicDataSynchronisationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasicDataSynchronisationPackage getPackage() {
		return BasicDataSynchronisationPackage.eINSTANCE;
	}

} //BasicDataSynchronisationFactory
