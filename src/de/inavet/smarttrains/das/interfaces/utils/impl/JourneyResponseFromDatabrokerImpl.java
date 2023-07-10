/**
 */
package de.inavet.smarttrains.das.interfaces.utils.impl;

import de.inavet.smarttrains.das.interfaces.utils.JourneyResponseFromDatabroker;
import de.inavet.smarttrains.das.interfaces.utils.UtilsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Journey Response From Databroker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.impl.JourneyResponseFromDatabrokerImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.impl.JourneyResponseFromDatabrokerImpl#getIdOfJourneyToResponse <em>Id Of Journey To Response</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.impl.JourneyResponseFromDatabrokerImpl#isJourneySuccesfulInitialised <em>Journey Succesful Initialised</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JourneyResponseFromDatabrokerImpl extends MinimalEObjectImpl.Container implements JourneyResponseFromDatabroker {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdOfJourneyToResponse() <em>Id Of Journey To Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdOfJourneyToResponse()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_OF_JOURNEY_TO_RESPONSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdOfJourneyToResponse() <em>Id Of Journey To Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdOfJourneyToResponse()
	 * @generated
	 * @ordered
	 */
	protected String idOfJourneyToResponse = ID_OF_JOURNEY_TO_RESPONSE_EDEFAULT;

	/**
	 * The default value of the '{@link #isJourneySuccesfulInitialised() <em>Journey Succesful Initialised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJourneySuccesfulInitialised()
	 * @generated
	 * @ordered
	 */
	protected static final boolean JOURNEY_SUCCESFUL_INITIALISED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isJourneySuccesfulInitialised() <em>Journey Succesful Initialised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJourneySuccesfulInitialised()
	 * @generated
	 * @ordered
	 */
	protected boolean journeySuccesfulInitialised = JOURNEY_SUCCESFUL_INITIALISED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JourneyResponseFromDatabrokerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilsPackage.Literals.JOURNEY_RESPONSE_FROM_DATABROKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.JOURNEY_RESPONSE_FROM_DATABROKER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdOfJourneyToResponse() {
		return idOfJourneyToResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdOfJourneyToResponse(String newIdOfJourneyToResponse) {
		String oldIdOfJourneyToResponse = idOfJourneyToResponse;
		idOfJourneyToResponse = newIdOfJourneyToResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.JOURNEY_RESPONSE_FROM_DATABROKER__ID_OF_JOURNEY_TO_RESPONSE, oldIdOfJourneyToResponse, idOfJourneyToResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isJourneySuccesfulInitialised() {
		return journeySuccesfulInitialised;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJourneySuccesfulInitialised(boolean newJourneySuccesfulInitialised) {
		boolean oldJourneySuccesfulInitialised = journeySuccesfulInitialised;
		journeySuccesfulInitialised = newJourneySuccesfulInitialised;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.JOURNEY_RESPONSE_FROM_DATABROKER__JOURNEY_SUCCESFUL_INITIALISED, oldJourneySuccesfulInitialised, journeySuccesfulInitialised));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UtilsPackage.JOURNEY_RESPONSE_FROM_DATABROKER__ID:
				return getId();
			case UtilsPackage.JOURNEY_RESPONSE_FROM_DATABROKER__ID_OF_JOURNEY_TO_RESPONSE:
				return getIdOfJourneyToResponse();
			case UtilsPackage.JOURNEY_RESPONSE_FROM_DATABROKER__JOURNEY_SUCCESFUL_INITIALISED:
				return isJourneySuccesfulInitialised();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UtilsPackage.JOURNEY_RESPONSE_FROM_DATABROKER__ID:
				setId((String)newValue);
				return;
			case UtilsPackage.JOURNEY_RESPONSE_FROM_DATABROKER__ID_OF_JOURNEY_TO_RESPONSE:
				setIdOfJourneyToResponse((String)newValue);
				return;
			case UtilsPackage.JOURNEY_RESPONSE_FROM_DATABROKER__JOURNEY_SUCCESFUL_INITIALISED:
				setJourneySuccesfulInitialised((Boolean)newValue);
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
			case UtilsPackage.JOURNEY_RESPONSE_FROM_DATABROKER__ID:
				setId(ID_EDEFAULT);
				return;
			case UtilsPackage.JOURNEY_RESPONSE_FROM_DATABROKER__ID_OF_JOURNEY_TO_RESPONSE:
				setIdOfJourneyToResponse(ID_OF_JOURNEY_TO_RESPONSE_EDEFAULT);
				return;
			case UtilsPackage.JOURNEY_RESPONSE_FROM_DATABROKER__JOURNEY_SUCCESFUL_INITIALISED:
				setJourneySuccesfulInitialised(JOURNEY_SUCCESFUL_INITIALISED_EDEFAULT);
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
			case UtilsPackage.JOURNEY_RESPONSE_FROM_DATABROKER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UtilsPackage.JOURNEY_RESPONSE_FROM_DATABROKER__ID_OF_JOURNEY_TO_RESPONSE:
				return ID_OF_JOURNEY_TO_RESPONSE_EDEFAULT == null ? idOfJourneyToResponse != null : !ID_OF_JOURNEY_TO_RESPONSE_EDEFAULT.equals(idOfJourneyToResponse);
			case UtilsPackage.JOURNEY_RESPONSE_FROM_DATABROKER__JOURNEY_SUCCESFUL_INITIALISED:
				return journeySuccesfulInitialised != JOURNEY_SUCCESFUL_INITIALISED_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", idOfJourneyToResponse: ");
		result.append(idOfJourneyToResponse);
		result.append(", journeySuccesfulInitialised: ");
		result.append(journeySuccesfulInitialised);
		result.append(')');
		return result.toString();
	}

} //JourneyResponseFromDatabrokerImpl
