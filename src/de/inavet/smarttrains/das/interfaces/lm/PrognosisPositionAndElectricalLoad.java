/**
 */
package de.inavet.smarttrains.das.interfaces.lm;

import de.inavet.smarttrains.das.interfaces.utils.Position;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
 * @generated
 */
public class PrognosisPositionAndElectricalLoad extends MinimalEObjectImpl.Container {
	/**
	 * The default value of the '{@link #getTimestampForPrognosis() <em>Timestamp For Prognosis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestampForPrognosis()
	 * @generated
	 * @ordered
	 */
	protected static final long TIMESTAMP_FOR_PROGNOSIS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimestampForPrognosis() <em>Timestamp For Prognosis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestampForPrognosis()
	 * @generated
	 * @ordered
	 */
	protected long timestampForPrognosis = TIMESTAMP_FOR_PROGNOSIS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrognosisPosition() <em>Prognosis Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrognosisPosition()
	 * @generated
	 * @ordered
	 */
	protected Position prognosisPosition;

	/**
	 * The cached value of the '{@link #getElectricalLoadPrognosis() <em>Electrical Load Prognosis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricalLoadPrognosis()
	 * @generated
	 * @ordered
	 */
	protected ElectricalLoad electricalLoadPrognosis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrognosisPositionAndElectricalLoad() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LmPackage.Literals.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD;
	}

	/**
	 * Returns the value of the '<em><b>Timestamp For Prognosis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp For Prognosis</em>' attribute.
	 * @see #setTimestampForPrognosis(long)
	 * @generated
	 */
	public long getTimestampForPrognosis() {
		return timestampForPrognosis;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisPositionAndElectricalLoad#getTimestampForPrognosis <em>Timestamp For Prognosis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newTimestampForPrognosis the new value of the '<em>Timestamp For Prognosis</em>' attribute.
	 * @see #getTimestampForPrognosis()
	 * @generated
	 */
	public void setTimestampForPrognosis(long newTimestampForPrognosis) {
		timestampForPrognosis = newTimestampForPrognosis;
	}

	/**
	 * Returns the value of the '<em><b>Prognosis Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prognosis Position</em>' reference.
	 * @see #setPrognosisPosition(Position)
	 * @generated
	 */
	public Position getPrognosisPosition() {
		if (prognosisPosition != null && ((EObject)prognosisPosition).eIsProxy()) {
			InternalEObject oldPrognosisPosition = prognosisPosition;
			prognosisPosition = (Position)eResolveProxy(oldPrognosisPosition);
			if (prognosisPosition != oldPrognosisPosition) {
			}
		}
		return prognosisPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position basicGetPrognosisPosition() {
		return prognosisPosition;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisPositionAndElectricalLoad#getPrognosisPosition <em>Prognosis Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newPrognosisPosition the new value of the '<em>Prognosis Position</em>' reference.
	 * @see #getPrognosisPosition()
	 * @generated
	 */
	public void setPrognosisPosition(Position newPrognosisPosition) {
		prognosisPosition = newPrognosisPosition;
	}

	/**
	 * Returns the value of the '<em><b>Electrical Load Prognosis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electrical Load Prognosis</em>' reference.
	 * @see #setElectricalLoadPrognosis(ElectricalLoad)
	 * @generated
	 */
	public ElectricalLoad getElectricalLoadPrognosis() {
		if (electricalLoadPrognosis != null && ((EObject)electricalLoadPrognosis).eIsProxy()) {
			InternalEObject oldElectricalLoadPrognosis = electricalLoadPrognosis;
			electricalLoadPrognosis = (ElectricalLoad)eResolveProxy(oldElectricalLoadPrognosis);
			if (electricalLoadPrognosis != oldElectricalLoadPrognosis) {
			}
		}
		return electricalLoadPrognosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalLoad basicGetElectricalLoadPrognosis() {
		return electricalLoadPrognosis;
	}

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.lm.PrognosisPositionAndElectricalLoad#getElectricalLoadPrognosis <em>Electrical Load Prognosis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newElectricalLoadPrognosis the new value of the '<em>Electrical Load Prognosis</em>' reference.
	 * @see #getElectricalLoadPrognosis()
	 * @generated
	 */
	public void setElectricalLoadPrognosis(ElectricalLoad newElectricalLoadPrognosis) {
		electricalLoadPrognosis = newElectricalLoadPrognosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__TIMESTAMP_FOR_PROGNOSIS:
				return getTimestampForPrognosis();
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__PROGNOSIS_POSITION:
				if (resolve) return getPrognosisPosition();
				return basicGetPrognosisPosition();
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__ELECTRICAL_LOAD_PROGNOSIS:
				if (resolve) return getElectricalLoadPrognosis();
				return basicGetElectricalLoadPrognosis();
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
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__TIMESTAMP_FOR_PROGNOSIS:
				setTimestampForPrognosis((Long)newValue);
				return;
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__PROGNOSIS_POSITION:
				setPrognosisPosition((Position)newValue);
				return;
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__ELECTRICAL_LOAD_PROGNOSIS:
				setElectricalLoadPrognosis((ElectricalLoad)newValue);
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
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__TIMESTAMP_FOR_PROGNOSIS:
				setTimestampForPrognosis(TIMESTAMP_FOR_PROGNOSIS_EDEFAULT);
				return;
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__PROGNOSIS_POSITION:
				setPrognosisPosition((Position)null);
				return;
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__ELECTRICAL_LOAD_PROGNOSIS:
				setElectricalLoadPrognosis((ElectricalLoad)null);
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
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__TIMESTAMP_FOR_PROGNOSIS:
				return timestampForPrognosis != TIMESTAMP_FOR_PROGNOSIS_EDEFAULT;
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__PROGNOSIS_POSITION:
				return prognosisPosition != null;
			case LmPackage.PROGNOSIS_POSITION_AND_ELECTRICAL_LOAD__ELECTRICAL_LOAD_PROGNOSIS:
				return electricalLoadPrognosis != null;
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
		result.append(" (timestampForPrognosis: ");
		result.append(timestampForPrognosis);
		result.append(')');
		return result.toString();
	}

} // PrognosisPositionAndElectricalLoad
