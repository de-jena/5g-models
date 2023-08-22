/**
 */
package de.inavet.smarttrains.das.interfaces.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DAS Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Status des FAS-System zur Information beim Fahrer
 * <!-- end-model-doc -->
 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getDASStatus()
 * @model
 * @generated
 */
public enum DASStatus implements Enumerator {
	/**
	 * The '<em><b>NO CONNECTION TO CENTRAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_CONNECTION_TO_CENTRAL_VALUE
	 * @generated
	 * @ordered
	 */
	NO_CONNECTION_TO_CENTRAL(0, "NO_CONNECTION_TO_CENTRAL", "NO_CONNECTION_TO_CENTRAL"),

	/**
	 * The '<em><b>NO INITIAL DATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_INITIAL_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	NO_INITIAL_DATA(1, "NO_INITIAL_DATA", "NO_INITIAL_DATA"),

	/**
	 * The '<em><b>INITIALISED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIALISED_VALUE
	 * @generated
	 * @ordered
	 */
	INITIALISED(2, "INITIALISED", "INITIALISED"),

	/**
	 * The '<em><b>ACTIVE RECOMMENDATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVE_RECOMMENDATION_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVE_RECOMMENDATION(3, "ACTIVE_RECOMMENDATION", "ACTIVE_RECOMMENDATION"),

	/**
	 * The '<em><b>ACTIVE DENM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVE_DENM_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVE_DENM(4, "ACTIVE_DENM", "ACTIVE_DENM"),

	/**
	 * The '<em><b>ACTIVE VAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVE_VAM_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVE_VAM(5, "ACTIVE_VAM", "ACTIVE_VAM"),

	/**
	 * The '<em><b>ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR(6, "ERROR", "ERROR"),

	/**
	 * The '<em><b>DEACTIVATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEACTIVATED_VALUE
	 * @generated
	 * @ordered
	 */
	DEACTIVATED(7, "DEACTIVATED", "DEACTIVATED");

	/**
	 * The '<em><b>NO CONNECTION TO CENTRAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_CONNECTION_TO_CENTRAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_CONNECTION_TO_CENTRAL_VALUE = 0;

	/**
	 * The '<em><b>NO INITIAL DATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_INITIAL_DATA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_INITIAL_DATA_VALUE = 1;

	/**
	 * The '<em><b>INITIALISED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIALISED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INITIALISED_VALUE = 2;

	/**
	 * The '<em><b>ACTIVE RECOMMENDATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVE_RECOMMENDATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_RECOMMENDATION_VALUE = 3;

	/**
	 * The '<em><b>ACTIVE DENM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVE_DENM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_DENM_VALUE = 4;

	/**
	 * The '<em><b>ACTIVE VAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVE_VAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVE_VAM_VALUE = 5;

	/**
	 * The '<em><b>ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_VALUE = 6;

	/**
	 * The '<em><b>DEACTIVATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEACTIVATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEACTIVATED_VALUE = 7;

	/**
	 * An array of all the '<em><b>DAS Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DASStatus[] VALUES_ARRAY =
		new DASStatus[] {
			NO_CONNECTION_TO_CENTRAL,
			NO_INITIAL_DATA,
			INITIALISED,
			ACTIVE_RECOMMENDATION,
			ACTIVE_DENM,
			ACTIVE_VAM,
			ERROR,
			DEACTIVATED,
		};

	/**
	 * A public read-only list of all the '<em><b>DAS Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DASStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DAS Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DASStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DASStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DAS Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DASStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DASStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DAS Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DASStatus get(int value) {
		switch (value) {
			case NO_CONNECTION_TO_CENTRAL_VALUE: return NO_CONNECTION_TO_CENTRAL;
			case NO_INITIAL_DATA_VALUE: return NO_INITIAL_DATA;
			case INITIALISED_VALUE: return INITIALISED;
			case ACTIVE_RECOMMENDATION_VALUE: return ACTIVE_RECOMMENDATION;
			case ACTIVE_DENM_VALUE: return ACTIVE_DENM;
			case ACTIVE_VAM_VALUE: return ACTIVE_VAM;
			case ERROR_VALUE: return ERROR;
			case DEACTIVATED_VALUE: return DEACTIVATED;
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
	private DASStatus(int value, String name, String literal) {
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
	
} //DASStatus
