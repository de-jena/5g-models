/**
 */
package de.inavet.smarttrains.das.interfaces.utils;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journey Response From Databroker</b></em>'.
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
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.JourneyResponseFromDatabroker#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.JourneyResponseFromDatabroker#getIdOfJourneyToResponse <em>Id Of Journey To Response</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.JourneyResponseFromDatabroker#isJourneySuccesfulInitialised <em>Journey Succesful Initialised</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getJourneyResponseFromDatabroker()
 * @model
 * @generated
 */
public interface JourneyResponseFromDatabroker extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datenbroker-Id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getJourneyResponseFromDatabroker_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.JourneyResponseFromDatabroker#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Id Of Journey To Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung der Response zur Journey
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id Of Journey To Response</em>' attribute.
	 * @see #setIdOfJourneyToResponse(String)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getJourneyResponseFromDatabroker_IdOfJourneyToResponse()
	 * @model required="true"
	 * @generated
	 */
	String getIdOfJourneyToResponse();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.JourneyResponseFromDatabroker#getIdOfJourneyToResponse <em>Id Of Journey To Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Of Journey To Response</em>' attribute.
	 * @see #getIdOfJourneyToResponse()
	 * @generated
	 */
	void setIdOfJourneyToResponse(String value);

	/**
	 * Returns the value of the '<em><b>Journey Succesful Initialised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribut, ob erfolgreich initialisiert wurde
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Journey Succesful Initialised</em>' attribute.
	 * @see #setJourneySuccesfulInitialised(boolean)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getJourneyResponseFromDatabroker_JourneySuccesfulInitialised()
	 * @model required="true"
	 * @generated
	 */
	boolean isJourneySuccesfulInitialised();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.JourneyResponseFromDatabroker#isJourneySuccesfulInitialised <em>Journey Succesful Initialised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Journey Succesful Initialised</em>' attribute.
	 * @see #isJourneySuccesfulInitialised()
	 * @generated
	 */
	void setJourneySuccesfulInitialised(boolean value);

} // JourneyResponseFromDatabroker
