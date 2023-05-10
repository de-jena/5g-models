/**
 */
package de.inavet.mqttadapter.datamodels.utils;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Grundobjekt für Value-Objekte
 * Hilfsklasse
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link utils.ValueItem#getId <em>Id</em>}</li>
 *   <li>{@link utils.ValueItem#getValue <em>Value</em>}</li>
 *   <li>{@link utils.ValueItem#getValueName <em>Value Name</em>}</li>
 *   <li>{@link utils.ValueItem#getValueUnit <em>Value Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueItem extends MinimalEObjectImpl.Container {
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
	public ValueItem() {
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the '{@link utils.ValueItem#getId <em>Id</em>}' attribute.
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
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * Sets the value of the '{@link utils.ValueItem#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newValue the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	public void setValue(double newValue) {
		value = newValue;
	}

	/**
	 * Returns the value of the '<em><b>Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Name</em>' attribute.
	 * @see #setValueName(String)
	 * @generated
	 */
	public String getValueName() {
		return valueName;
	}

	/**
	 * Sets the value of the '{@link utils.ValueItem#getValueName <em>Value Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newValueName the new value of the '<em>Value Name</em>' attribute.
	 * @see #getValueName()
	 * @generated
	 */
	public void setValueName(String newValueName) {
		valueName = newValueName;
	}

	/**
	 * Returns the value of the '<em><b>Value Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link utils.Units}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Unit</em>' attribute.
	 * @see utils.Units
	 * @see #setValueUnit(Units)
	 * @generated
	 */
	public Units getValueUnit() {
		return valueUnit;
	}

	/**
	 * Sets the value of the '{@link utils.ValueItem#getValueUnit <em>Value Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param newValueUnit the new value of the '<em>Value Unit</em>' attribute.
	 * @see utils.Units
	 * @see #getValueUnit()
	 * @generated
	 */
	public void setValueUnit(Units newValueUnit) {
		valueUnit = newValueUnit == null ? VALUE_UNIT_EDEFAULT : newValueUnit;
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

} // ValueItem
