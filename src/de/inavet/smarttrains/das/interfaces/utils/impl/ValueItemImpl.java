/**
 */
package de.inavet.smarttrains.das.interfaces.utils.impl;

import de.inavet.smarttrains.das.interfaces.utils.Units;
import de.inavet.smarttrains.das.interfaces.utils.UtilsPackage;
import de.inavet.smarttrains.das.interfaces.utils.ValueItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.impl.ValueItemImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.impl.ValueItemImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.impl.ValueItemImpl#getValueName <em>Value Name</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.impl.ValueItemImpl#getValueUnit <em>Value Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueItemImpl extends MinimalEObjectImpl.Container implements ValueItem {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueName() <em>Value Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueName()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueName() <em>Value Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueName()
	 * @generated
	 * @ordered
	 */
	protected String valueName = VALUE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueUnit() <em>Value Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueUnit()
	 * @generated
	 * @ordered
	 */
	protected static final Units VALUE_UNIT_EDEFAULT = Units.METER_PRO_SEKUNDE;

	/**
	 * The cached value of the '{@link #getValueUnit() <em>Value Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueUnit()
	 * @generated
	 * @ordered
	 */
	protected Units valueUnit = VALUE_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilsPackage.Literals.VALUE_ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.VALUE_ITEM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.VALUE_ITEM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueName() {
		return valueName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueName(String newValueName) {
		String oldValueName = valueName;
		valueName = newValueName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.VALUE_ITEM__VALUE_NAME, oldValueName, valueName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Units getValueUnit() {
		return valueUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueUnit(Units newValueUnit) {
		Units oldValueUnit = valueUnit;
		valueUnit = newValueUnit == null ? VALUE_UNIT_EDEFAULT : newValueUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.VALUE_ITEM__VALUE_UNIT, oldValueUnit, valueUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UtilsPackage.VALUE_ITEM__ID:
				return getId();
			case UtilsPackage.VALUE_ITEM__VALUE:
				return getValue();
			case UtilsPackage.VALUE_ITEM__VALUE_NAME:
				return getValueName();
			case UtilsPackage.VALUE_ITEM__VALUE_UNIT:
				return getValueUnit();
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
			case UtilsPackage.VALUE_ITEM__ID:
				setId((String)newValue);
				return;
			case UtilsPackage.VALUE_ITEM__VALUE:
				setValue((Double)newValue);
				return;
			case UtilsPackage.VALUE_ITEM__VALUE_NAME:
				setValueName((String)newValue);
				return;
			case UtilsPackage.VALUE_ITEM__VALUE_UNIT:
				setValueUnit((Units)newValue);
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
			case UtilsPackage.VALUE_ITEM__ID:
				setId(ID_EDEFAULT);
				return;
			case UtilsPackage.VALUE_ITEM__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case UtilsPackage.VALUE_ITEM__VALUE_NAME:
				setValueName(VALUE_NAME_EDEFAULT);
				return;
			case UtilsPackage.VALUE_ITEM__VALUE_UNIT:
				setValueUnit(VALUE_UNIT_EDEFAULT);
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
			case UtilsPackage.VALUE_ITEM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case UtilsPackage.VALUE_ITEM__VALUE:
				return value != VALUE_EDEFAULT;
			case UtilsPackage.VALUE_ITEM__VALUE_NAME:
				return VALUE_NAME_EDEFAULT == null ? valueName != null : !VALUE_NAME_EDEFAULT.equals(valueName);
			case UtilsPackage.VALUE_ITEM__VALUE_UNIT:
				return valueUnit != VALUE_UNIT_EDEFAULT;
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
		result.append(", value: ");
		result.append(value);
		result.append(", valueName: ");
		result.append(valueName);
		result.append(", valueUnit: ");
		result.append(valueUnit);
		result.append(')');
		return result.toString();
	}

} //ValueItemImpl
