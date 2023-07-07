/**
 */
package de.inavet.smarttrains.das.interfaces.basicDataSynchronisation;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Grunddatenklasse, enthält eine Liste der möglichen Fahrzeugnummern, sowie einer Abstraktion des Fahrplans, zur Auswahl bei der Fahrzeuganmeldung
 * Hilfsklasse
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData#getVehicleIds <em>Vehicle Ids</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData#getLinesToCourses <em>Lines To Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicData extends MinimalEObjectImpl.Container {
	/**
	 * The cached value of the '{@link #getVehicleIds() <em>Vehicle Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleIds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vehicleIds;

	/**
	 * The cached value of the '{@link #getLinesToCourses() <em>Lines To Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinesToCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<LineToCourses> linesToCourses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicData() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicDataSynchronisationPackage.Literals.BASIC_DATA;
	}

	/**
	 * Returns the value of the '<em><b>Vehicle Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Liste der Fahrzeugnummern (JNV-Fahrzeugnummern) zur Anmeldungsüberprüfung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Ids</em>' attribute list.
	 * @generated
	 */
	public EList<String> getVehicleIds() {
		if (vehicleIds == null) {
			vehicleIds = new BasicInternalEList<String>(String.class);
		}
		return vehicleIds;
	}

	/**
	 * Returns the value of the '<em><b>Lines To Courses</b></em>' reference list.
	 * The list contents are of type {@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fahrplan-Abstraktion: Enthält ein Objekt mit den möglichen Linien, deren zugeordnete Kurse sowie dem Kursen zugeordneten Routen, Ebenso benutzt zur Anmeldungsüberprüfung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lines To Courses</em>' reference list.
	 * @generated
	 */
	public EList<LineToCourses> getLinesToCourses() {
		if (linesToCourses == null) {
			linesToCourses = new BasicInternalEList<LineToCourses>(LineToCourses.class);
		}
		return linesToCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicDataSynchronisationPackage.BASIC_DATA__VEHICLE_IDS:
				return getVehicleIds();
			case BasicDataSynchronisationPackage.BASIC_DATA__LINES_TO_COURSES:
				return getLinesToCourses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasicDataSynchronisationPackage.BASIC_DATA__VEHICLE_IDS:
				getVehicleIds().clear();
				getVehicleIds().addAll((Collection<? extends String>)newValue);
				return;
			case BasicDataSynchronisationPackage.BASIC_DATA__LINES_TO_COURSES:
				getLinesToCourses().clear();
				getLinesToCourses().addAll((Collection<? extends LineToCourses>)newValue);
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
			case BasicDataSynchronisationPackage.BASIC_DATA__VEHICLE_IDS:
				getVehicleIds().clear();
				return;
			case BasicDataSynchronisationPackage.BASIC_DATA__LINES_TO_COURSES:
				getLinesToCourses().clear();
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
			case BasicDataSynchronisationPackage.BASIC_DATA__VEHICLE_IDS:
				return vehicleIds != null && !vehicleIds.isEmpty();
			case BasicDataSynchronisationPackage.BASIC_DATA__LINES_TO_COURSES:
				return linesToCourses != null && !linesToCourses.isEmpty();
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
		result.append(" (vehicleIds: ");
		result.append(vehicleIds);
		result.append(')');
		return result.toString();
	}

} // BasicData
