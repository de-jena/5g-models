/**
 */
package de.inavet.smarttrains.das.interfaces.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>NMEA Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * NMEA-Filter
 * <!-- end-model-doc -->
 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getNMEAType()
 * @model
 * @generated
 */
public enum NMEAType implements Enumerator {
	/**
	 * The '<em><b>GNRMC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GNRMC_VALUE
	 * @generated
	 * @ordered
	 */
	GNRMC(0, "GNRMC", "GNRMC"),

	/**
	 * The '<em><b>GPRMC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPRMC_VALUE
	 * @generated
	 * @ordered
	 */
	GPRMC(1, "GPRMC", "GPRMC"),

	/**
	 * The '<em><b>GPGGA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPGGA_VALUE
	 * @generated
	 * @ordered
	 */
	GPGGA(2, "GPGGA", "GPGGA"),

	/**
	 * The '<em><b>GNGGA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GNGGA_VALUE
	 * @generated
	 * @ordered
	 */
	GNGGA(3, "GNGGA", "GNGGA");

	/**
	 * The '<em><b>GNRMC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GNRMC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GNRMC_VALUE = 0;

	/**
	 * The '<em><b>GPRMC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPRMC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GPRMC_VALUE = 1;

	/**
	 * The '<em><b>GPGGA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPGGA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GPGGA_VALUE = 2;

	/**
	 * The '<em><b>GNGGA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GNGGA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GNGGA_VALUE = 3;

	/**
	 * An array of all the '<em><b>NMEA Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NMEAType[] VALUES_ARRAY =
		new NMEAType[] {
			GNRMC,
			GPRMC,
			GPGGA,
			GNGGA,
		};

	/**
	 * A public read-only list of all the '<em><b>NMEA Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NMEAType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>NMEA Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NMEAType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NMEAType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>NMEA Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NMEAType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NMEAType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>NMEA Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NMEAType get(int value) {
		switch (value) {
			case GNRMC_VALUE: return GNRMC;
			case GPRMC_VALUE: return GPRMC;
			case GPGGA_VALUE: return GPGGA;
			case GNGGA_VALUE: return GNGGA;
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
	private NMEAType(int value, String name, String literal) {
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
	
} //NMEAType
