/**
 */
package de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl;

import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData;
import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage;
import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.BasicDataImpl#getVehicleIds <em>Vehicle Ids</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl.BasicDataImpl#getLinesToCourses <em>Lines To Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicDataImpl extends MinimalEObjectImpl.Container implements BasicData {
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
	 * The cached value of the '{@link #getLinesToCourses() <em>Lines To Courses</em>}' containment reference list.
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
	protected BasicDataImpl() {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVehicleIds() {
		if (vehicleIds == null) {
			vehicleIds = new EDataTypeUniqueEList<String>(String.class, this, BasicDataSynchronisationPackage.BASIC_DATA__VEHICLE_IDS);
		}
		return vehicleIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineToCourses> getLinesToCourses() {
		if (linesToCourses == null) {
			linesToCourses = new EObjectContainmentEList<LineToCourses>(LineToCourses.class, this, BasicDataSynchronisationPackage.BASIC_DATA__LINES_TO_COURSES);
		}
		return linesToCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicDataSynchronisationPackage.BASIC_DATA__LINES_TO_COURSES:
				return ((InternalEList<?>)getLinesToCourses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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

} //BasicDataImpl
