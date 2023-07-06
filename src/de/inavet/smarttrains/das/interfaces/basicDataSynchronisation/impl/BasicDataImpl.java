/**
 */
package de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.impl;

import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicData;
import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.BasicDataSynchronisationPackage;
import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.LineToCourses;
import de.inavet.smarttrains.das.interfaces.basicDataSynchronisation.VehicleId;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
	 * The cached value of the '{@link #getVehicleIds() <em>Vehicle Ids</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleIds()
	 * @generated
	 * @ordered
	 */
	protected VehicleId vehicleIds;

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
	public VehicleId getVehicleIds() {
		if (vehicleIds != null && vehicleIds.eIsProxy()) {
			InternalEObject oldVehicleIds = (InternalEObject)vehicleIds;
			vehicleIds = (VehicleId)eResolveProxy(oldVehicleIds);
			if (vehicleIds != oldVehicleIds) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicDataSynchronisationPackage.BASIC_DATA__VEHICLE_IDS, oldVehicleIds, vehicleIds));
			}
		}
		return vehicleIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleId basicGetVehicleIds() {
		return vehicleIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicleIds(VehicleId newVehicleIds) {
		VehicleId oldVehicleIds = vehicleIds;
		vehicleIds = newVehicleIds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicDataSynchronisationPackage.BASIC_DATA__VEHICLE_IDS, oldVehicleIds, vehicleIds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LineToCourses> getLinesToCourses() {
		if (linesToCourses == null) {
			linesToCourses = new EObjectResolvingEList<LineToCourses>(LineToCourses.class, this, BasicDataSynchronisationPackage.BASIC_DATA__LINES_TO_COURSES);
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
				if (resolve) return getVehicleIds();
				return basicGetVehicleIds();
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
				setVehicleIds((VehicleId)newValue);
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
				setVehicleIds((VehicleId)null);
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
				return vehicleIds != null;
			case BasicDataSynchronisationPackage.BASIC_DATA__LINES_TO_COURSES:
				return linesToCourses != null && !linesToCourses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BasicDataImpl
