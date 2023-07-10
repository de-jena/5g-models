/**
 */
package de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl;

import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicDataSynchronisationFactoryImpl extends EFactoryImpl implements BasicDataSynchronisationFactory {
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
		return new BasicDataSynchronisationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicDataSynchronisationFactoryImpl() {
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
			case BasicDataSynchronisationPackage.DEVICE_REGISTRATION: return createDeviceRegistration();
			case BasicDataSynchronisationPackage.SYNCHRONISE_BASIC_DATA_RESPONSE: return createSynchroniseBasicDataResponse();
			case BasicDataSynchronisationPackage.BASIC_DATA: return createBasicData();
			case BasicDataSynchronisationPackage.LINE_TO_COURSES: return createLineToCourses();
			case BasicDataSynchronisationPackage.COURSE_TO_ROUTES: return createCourseToRoutes();
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
		DeviceRegistrationImpl deviceRegistration = new DeviceRegistrationImpl();
		return deviceRegistration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchroniseBasicDataResponse createSynchroniseBasicDataResponse() {
		SynchroniseBasicDataResponseImpl synchroniseBasicDataResponse = new SynchroniseBasicDataResponseImpl();
		return synchroniseBasicDataResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicData createBasicData() {
		BasicDataImpl basicData = new BasicDataImpl();
		return basicData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineToCourses createLineToCourses() {
		LineToCoursesImpl lineToCourses = new LineToCoursesImpl();
		return lineToCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseToRoutes createCourseToRoutes() {
		CourseToRoutesImpl courseToRoutes = new CourseToRoutesImpl();
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

} //BasicDataSynchronisationFactoryImpl
