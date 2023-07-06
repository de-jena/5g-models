/**
 */
package de.inavet.smarttrains.das.interfaces.lm;

import de.inavet.smarttrains.das.interfaces.utils.Position;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prognosis Position And Electrical Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hilfsklasse für PrognosisForLM
 * timestampForPrognosis -> Zeitstempel für die die Prognose gilt
 * prognosisPosition -> Prognose-Position basierend auf der optimierten Trajektorie
 * electricalLoadPrognosis -> Lastprognose basierend auf der optimierten Trajektorie
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisPositionAndElectricalLoad#getTimestampForPrognosis <em>Timestamp For Prognosis</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisPositionAndElectricalLoad#getPrognosisPosition <em>Prognosis Position</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisPositionAndElectricalLoad#getElectricalLoadPrognosis <em>Electrical Load Prognosis</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.lm.LmPackage#getPrognosisPositionAndElectricalLoad()
 * @model
 * @generated
 */
public interface PrognosisPositionAndElectricalLoad extends EObject {
	/**
	 * Returns the value of the '<em><b>Timestamp For Prognosis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp For Prognosis</em>' attribute.
	 * @see #setTimestampForPrognosis(long)
	 * @see de.inavet.smarttrains.das.interfaces.lm.LmPackage#getPrognosisPositionAndElectricalLoad_TimestampForPrognosis()
	 * @model required="true"
	 * @generated
	 */
	long getTimestampForPrognosis();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisPositionAndElectricalLoad#getTimestampForPrognosis <em>Timestamp For Prognosis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp For Prognosis</em>' attribute.
	 * @see #getTimestampForPrognosis()
	 * @generated
	 */
	void setTimestampForPrognosis(long value);

	/**
	 * Returns the value of the '<em><b>Prognosis Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prognosis Position</em>' reference.
	 * @see #setPrognosisPosition(Position)
	 * @see de.inavet.smarttrains.das.interfaces.lm.LmPackage#getPrognosisPositionAndElectricalLoad_PrognosisPosition()
	 * @model required="true"
	 * @generated
	 */
	Position getPrognosisPosition();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisPositionAndElectricalLoad#getPrognosisPosition <em>Prognosis Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prognosis Position</em>' reference.
	 * @see #getPrognosisPosition()
	 * @generated
	 */
	void setPrognosisPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Electrical Load Prognosis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electrical Load Prognosis</em>' reference.
	 * @see #setElectricalLoadPrognosis(ElectricalLoad)
	 * @see de.inavet.smarttrains.das.interfaces.lm.LmPackage#getPrognosisPositionAndElectricalLoad_ElectricalLoadPrognosis()
	 * @model required="true"
	 * @generated
	 */
	ElectricalLoad getElectricalLoadPrognosis();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisPositionAndElectricalLoad#getElectricalLoadPrognosis <em>Electrical Load Prognosis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electrical Load Prognosis</em>' reference.
	 * @see #getElectricalLoadPrognosis()
	 * @generated
	 */
	void setElectricalLoadPrognosis(ElectricalLoad value);

} // PrognosisPositionAndElectricalLoad
