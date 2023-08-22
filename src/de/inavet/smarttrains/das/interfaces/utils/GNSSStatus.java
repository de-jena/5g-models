/**
 */
package de.inavet.smarttrains.das.interfaces.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>GNSS Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Ortungsstatus der mobilen Anwendung
 * <!-- end-model-doc -->
 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getGNSSStatus()
 * @model
 * @generated
 */
public enum GNSSStatus implements Enumerator {
	/**
	 * The '<em><b>ACTIVE LOCALISATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVE_LOCALISATION_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVE_LOCALISATION(0, "ACTIVE_LOCALISATION", "ACTIVE_LOCALISATION"),

	/**
	 * The '<em><b>NO LOCALISATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_LOCALISATION_VALUE
	 * @generated
	 * @ordered
	 */
	NO_LOCALISATION(1, "NO_LOCALISATION", "NO_LOCALISATION"),

	/**
	 * The '<em><b>COMPUTED LOCATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTED_LOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPUTED_LOCATION(2, "COMPUTED_LOCATION", "COMPUTED_LOCATION"),

	/**
	 * The '<em><b>TEMPORARY NO LOCALISATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPORARY_NO_LOCALISATION_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPORARY_NO_LOCALISATION(3, "TEMPORARY_NO_LOCALISATION", "TEMPORARY_NO_LOCALISATION");

	/**
	 * The '<em><b>ACTIVE LOCALISATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVE_LOCALISATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_LOCALISATION_VALUE = 0;

	/**
	 * The '<em><b>NO LOCALISATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_LOCALISATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_LOCALISATION_VALUE = 1;

	/**
	 * The '<em><b>COMPUTED LOCATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPUTED_LOCATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPUTED_LOCATION_VALUE = 2;

	/**
	 * The '<em><b>TEMPORARY NO LOCALISATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPORARY_NO_LOCALISATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEMPORARY_NO_LOCALISATION_VALUE = 3;

	/**
	 * An array of all the '<em><b>GNSS Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GNSSStatus[] VALUES_ARRAY =
		new GNSSStatus[] {
			ACTIVE_LOCALISATION,
			NO_LOCALISATION,
			COMPUTED_LOCATION,
			TEMPORARY_NO_LOCALISATION,
		};

	/**
	 * A public read-only list of all the '<em><b>GNSS Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GNSSStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GNSS Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GNSSStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GNSSStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GNSS Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GNSSStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GNSSStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GNSS Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GNSSStatus get(int value) {
		switch (value) {
			case ACTIVE_LOCALISATION_VALUE: return ACTIVE_LOCALISATION;
			case NO_LOCALISATION_VALUE: return NO_LOCALISATION;
			case COMPUTED_LOCATION_VALUE: return COMPUTED_LOCATION;
			case TEMPORARY_NO_LOCALISATION_VALUE: return TEMPORARY_NO_LOCALISATION;
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
	private GNSSStatus(int value, String name, String literal) {
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
	
} //GNSSStatus
