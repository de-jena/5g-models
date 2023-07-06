/**
 */
package de.inavet.smarttrains.das.interfaces.lm;

import de.inavet.smarttrains.das.interfaces.utils.Position;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prognosis For LM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hauptklasse für Interface FAS -> LM
 * presentPosition -> aktuelle Position
 * timestamp -> Zeitpunkt der Datenerstellung
 * presentElectricalLoad -> laut FAS-Berechnung notwendige Leistung für Antrieb und Nebenverbraucher
 * prognosisForPositionAndElectricalLoad ->Liste der Prognose-Positionen und Lastbedarfe
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisForLM#getPresentPosition <em>Present Position</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisForLM#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisForLM#getPresentElectricalLoad <em>Present Electrical Load</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisForLM#getPrognosisForPositionAndElectricalLoad <em>Prognosis For Position And Electrical Load</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.lm.LmPackage#getPrognosisForLM()
 * @model
 * @generated
 */
public interface PrognosisForLM extends EObject {
	/**
	 * Returns the value of the '<em><b>Present Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Present Position</em>' reference.
	 * @see #setPresentPosition(Position)
	 * @see de.inavet.smarttrains.das.interfaces.lm.LmPackage#getPrognosisForLM_PresentPosition()
	 * @model required="true"
	 * @generated
	 */
	Position getPresentPosition();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisForLM#getPresentPosition <em>Present Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Present Position</em>' reference.
	 * @see #getPresentPosition()
	 * @generated
	 */
	void setPresentPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unix timestamp
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(long)
	 * @see de.inavet.smarttrains.das.interfaces.lm.LmPackage#getPrognosisForLM_Timestamp()
	 * @model required="true"
	 * @generated
	 */
	long getTimestamp();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisForLM#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(long value);

	/**
	 * Returns the value of the '<em><b>Present Electrical Load</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Present Electrical Load</em>' reference.
	 * @see #setPresentElectricalLoad(ElectricalLoad)
	 * @see de.inavet.smarttrains.das.interfaces.lm.LmPackage#getPrognosisForLM_PresentElectricalLoad()
	 * @model required="true"
	 * @generated
	 */
	ElectricalLoad getPresentElectricalLoad();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisForLM#getPresentElectricalLoad <em>Present Electrical Load</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Present Electrical Load</em>' reference.
	 * @see #getPresentElectricalLoad()
	 * @generated
	 */
	void setPresentElectricalLoad(ElectricalLoad value);

	/**
	 * Returns the value of the '<em><b>Prognosis For Position And Electrical Load</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.lm.PrognosisPositionAndElectricalLoad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prognosis For Position And Electrical Load</em>' reference list.
	 * @see de.inavet.smarttrains.das.interfaces.lm.LmPackage#getPrognosisForLM_PrognosisForPositionAndElectricalLoad()
	 * @model required="true"
	 * @generated
	 */
	EList<PrognosisPositionAndElectricalLoad> getPrognosisForPositionAndElectricalLoad();

} // PrognosisForLM
