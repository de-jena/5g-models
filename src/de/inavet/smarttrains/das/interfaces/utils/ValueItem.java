/**
 */
package de.inavet.smarttrains.das.interfaces.utils;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.ValueItem#getId <em>Id</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.ValueItem#getValue <em>Value</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.ValueItem#getValueName <em>Value Name</em>}</li>
 *   <li>{@link de.inavet.smarttrains.das.interfaces.utils.ValueItem#getValueUnit <em>Value Unit</em>}</li>
 * </ul>
 *
 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getValueItem()
 * @model
 * @generated
 */
public interface ValueItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getValueItem_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.ValueItem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getValueItem_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.ValueItem#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Name</em>' attribute.
	 * @see #setValueName(String)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getValueItem_ValueName()
	 * @model required="true"
	 * @generated
	 */
	String getValueName();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.ValueItem#getValueName <em>Value Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Name</em>' attribute.
	 * @see #getValueName()
	 * @generated
	 */
	void setValueName(String value);

	/**
	 * Returns the value of the '<em><b>Value Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link de.inavet.smarttrains.das.interfaces.utils.Units}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Unit</em>' attribute.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Units
	 * @see #setValueUnit(Units)
	 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getValueItem_ValueUnit()
	 * @model required="true"
	 * @generated
	 */
	Units getValueUnit();

	/**
	 * Sets the value of the '{@link de.inavet.smarttrains.das.interfaces.utils.ValueItem#getValueUnit <em>Value Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Unit</em>' attribute.
	 * @see de.inavet.smarttrains.das.interfaces.utils.Units
	 * @see #getValueUnit()
	 * @generated
	 */
	void setValueUnit(Units value);

} // ValueItem
