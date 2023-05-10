/**
 */
package journey;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response From Databroker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Antwort des zentralen Systems auf die erhaltene Journey. Dient der Sicherstellung, dass zentrale System die Daten erhalten hat und arbeiten kann.
 * Root-Objekt
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link journey.JourneyResponseFromDatabroker#getId <em>Id</em>}</li>
 *   <li>{@link journey.JourneyResponseFromDatabroker#getIdOfJourneyToResponse <em>Id Of Journey To Response</em>}</li>
 *   <li>{@link journey.JourneyResponseFromDatabroker#isJourneySuccesfulInitialised <em>Journey Succesful Initialised</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JourneyResponseFromDatabroker extends MinimalEObjectImpl.Container {
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
	 * The cached value of the '{@link #getIdOfJourneyToResponse() <em>Id Of Journey To Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdOfJourneyToResponse()
	 * @generated
	 * @ordered
	 */
	protected Journey idOfJourneyToResponse;

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
	public JourneyResponseFromDatabroker() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JourneyPackage.Literals.JOURNEY_RESPONSE_FROM_DATABROKER;
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datenbroker-Id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the '{@link journey.JourneyResponseFromDatabroker#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newId the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	public void setId(String newId) {
		id = newId;
	}

	/**
	 * Returns the value of the '<em><b>Id Of Journey To Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung der Response zur Journey
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id Of Journey To Response</em>' reference.
	 * @see #setIdOfJourneyToResponse(Journey)
	 * @generated
	 */
	public Journey getIdOfJourneyToResponse() {
		if (idOfJourneyToResponse != null && ((EObject)idOfJourneyToResponse).eIsProxy()) {
			InternalEObject oldIdOfJourneyToResponse = idOfJourneyToResponse;
			idOfJourneyToResponse = (Journey)eResolveProxy(oldIdOfJourneyToResponse);
			if (idOfJourneyToResponse != oldIdOfJourneyToResponse) {
			}
		}
		return idOfJourneyToResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Journey basicGetIdOfJourneyToResponse() {
		return idOfJourneyToResponse;
	}

	/**
	 * Sets the value of the '{@link journey.JourneyResponseFromDatabroker#getIdOfJourneyToResponse <em>Id Of Journey To Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newIdOfJourneyToResponse the new value of the '<em>Id Of Journey To Response</em>' reference.
	 * @see #getIdOfJourneyToResponse()
	 * @generated
	 */
	public void setIdOfJourneyToResponse(Journey newIdOfJourneyToResponse) {
		idOfJourneyToResponse = newIdOfJourneyToResponse;
	}

	/**
	 * Returns the value of the '<em><b>Journey Succesful Initialised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribut, ob erfolgreich initialisiert wurde
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journey Succesful Initialised</em>' attribute.
	 * @see #setJourneySuccesfulInitialised(boolean)
	 * @generated
	 */
	public boolean isJourneySuccesfulInitialised() {
		return journeySuccesfulInitialised;
	}

	/**
	 * Sets the value of the '{@link journey.JourneyResponseFromDatabroker#isJourneySuccesfulInitialised <em>Journey Succesful Initialised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newJourneySuccesfulInitialised the new value of the '<em>Journey Succesful Initialised</em>' attribute.
	 * @see #isJourneySuccesfulInitialised()
	 * @generated
	 */
	public void setJourneySuccesfulInitialised(boolean newJourneySuccesfulInitialised) {
		journeySuccesfulInitialised = newJourneySuccesfulInitialised;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JourneyPackage.JOURNEY_RESPONSE_FROM_DATABROKER__ID:
				return getId();
			case JourneyPackage.JOURNEY_RESPONSE_FROM_DATABROKER__ID_OF_JOURNEY_TO_RESPONSE:
				if (resolve) return getIdOfJourneyToResponse();
				return basicGetIdOfJourneyToResponse();
			case JourneyPackage.JOURNEY_RESPONSE_FROM_DATABROKER__JOURNEY_SUCCESFUL_INITIALISED:
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
			case JourneyPackage.JOURNEY_RESPONSE_FROM_DATABROKER__ID:
				setId((String)newValue);
				return;
			case JourneyPackage.JOURNEY_RESPONSE_FROM_DATABROKER__ID_OF_JOURNEY_TO_RESPONSE:
				setIdOfJourneyToResponse((Journey)newValue);
				return;
			case JourneyPackage.JOURNEY_RESPONSE_FROM_DATABROKER__JOURNEY_SUCCESFUL_INITIALISED:
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
			case JourneyPackage.JOURNEY_RESPONSE_FROM_DATABROKER__ID:
				setId(ID_EDEFAULT);
				return;
			case JourneyPackage.JOURNEY_RESPONSE_FROM_DATABROKER__ID_OF_JOURNEY_TO_RESPONSE:
				setIdOfJourneyToResponse((Journey)null);
				return;
			case JourneyPackage.JOURNEY_RESPONSE_FROM_DATABROKER__JOURNEY_SUCCESFUL_INITIALISED:
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
			case JourneyPackage.JOURNEY_RESPONSE_FROM_DATABROKER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case JourneyPackage.JOURNEY_RESPONSE_FROM_DATABROKER__ID_OF_JOURNEY_TO_RESPONSE:
				return idOfJourneyToResponse != null;
			case JourneyPackage.JOURNEY_RESPONSE_FROM_DATABROKER__JOURNEY_SUCCESFUL_INITIALISED:
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
		result.append(", journeySuccesfulInitialised: ");
		result.append(journeySuccesfulInitialised);
		result.append(')');
		return result.toString();
	}

} // JourneyResponseFromDatabroker
