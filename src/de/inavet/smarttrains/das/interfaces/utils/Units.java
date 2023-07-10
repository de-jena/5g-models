/**
 */
package de.inavet.smarttrains.das.interfaces.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Units</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * relevante Einheiten für Value-Objekte
 * Hilfsklasse
 * <!-- end-model-doc -->
 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getUnits()
 * @model
 * @generated
 */
public enum Units implements Enumerator {
	/**
	 * The '<em><b>Meter Pro Sekunde</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METER_PRO_SEKUNDE_VALUE
	 * @generated
	 * @ordered
	 */
	METER_PRO_SEKUNDE(0, "Meter_Pro_Sekunde", "m/s"),

	/**
	 * The '<em><b>Watt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATT_VALUE
	 * @generated
	 * @ordered
	 */
	WATT(0, "Watt", "W"),

	/**
	 * The '<em><b>Sekunde</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEKUNDE_VALUE
	 * @generated
	 * @ordered
	 */
	SEKUNDE(0, "Sekunde", "s"),

	/**
	 * The '<em><b>Meter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METER_VALUE
	 * @generated
	 * @ordered
	 */
	METER(0, "Meter", "m"),

	/**
	 * The '<em><b>Watt Stunden</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATT_STUNDEN_VALUE
	 * @generated
	 * @ordered
	 */
	WATT_STUNDEN(0, "Watt_Stunden", "Wh"),

	/**
	 * The '<em><b>Prozent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROZENT_VALUE
	 * @generated
	 * @ordered
	 */
	PROZENT(0, "Prozent", "Prozent");

	/**
	 * The '<em><b>Meter Pro Sekunde</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METER_PRO_SEKUNDE
	 * @model name="Meter_Pro_Sekunde" literal="m/s"
	 * @generated
	 * @ordered
	 */
	public static final int METER_PRO_SEKUNDE_VALUE = 0;

	/**
	 * The '<em><b>Watt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATT
	 * @model name="Watt" literal="W"
	 * @generated
	 * @ordered
	 */
	public static final int WATT_VALUE = 0;

	/**
	 * The '<em><b>Sekunde</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEKUNDE
	 * @model name="Sekunde" literal="s"
	 * @generated
	 * @ordered
	 */
	public static final int SEKUNDE_VALUE = 0;

	/**
	 * The '<em><b>Meter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METER
	 * @model name="Meter" literal="m"
	 * @generated
	 * @ordered
	 */
	public static final int METER_VALUE = 0;

	/**
	 * The '<em><b>Watt Stunden</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WATT_STUNDEN
	 * @model name="Watt_Stunden" literal="Wh"
	 * @generated
	 * @ordered
	 */
	public static final int WATT_STUNDEN_VALUE = 0;

	/**
	 * The '<em><b>Prozent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROZENT
	 * @model name="Prozent"
	 * @generated
	 * @ordered
	 */
	public static final int PROZENT_VALUE = 0;

	/**
	 * An array of all the '<em><b>Units</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Units[] VALUES_ARRAY =
		new Units[] {
			METER_PRO_SEKUNDE,
			WATT,
			SEKUNDE,
			METER,
			WATT_STUNDEN,
			PROZENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Units</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Units> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Units</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Units get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Units result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Units getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Units result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Units get(int value) {
		switch (value) {
			case METER_PRO_SEKUNDE_VALUE: return METER_PRO_SEKUNDE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Units(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Units
