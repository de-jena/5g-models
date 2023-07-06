/**
 */
package de.inavet.smarttrains.das.interfaces.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Recommendation Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * derzeit angedachte Empfehlungen
 * <!-- end-model-doc -->
 * @see de.inavet.smarttrains.das.interfaces.utils.UtilsPackage#getRecommendationTypes()
 * @generated
 */
public enum RecommendationTypes implements Enumerator {
	/**
	 * The '<em><b>DISPATCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPATCH_VALUE
	 * @generated
	 * @ordered
	 */
	DISPATCH(0, "DISPATCH", "DISPATCH"),

	/**
	 * The '<em><b>DEPARTURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPARTURE_VALUE
	 * @generated
	 * @ordered
	 */
	DEPARTURE(1, "DEPARTURE", "DEPARTURE"),

	/**
	 * The '<em><b>LSA COUNTDOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LSA_COUNTDOWN_VALUE
	 * @generated
	 * @ordered
	 */
	LSA_COUNTDOWN(2, "LSA_COUNTDOWN", "LSA_COUNTDOWN"),

	/**
	 * The '<em><b>CRUISE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRUISE_VALUE
	 * @generated
	 * @ordered
	 */
	CRUISE(3, "CRUISE", "CRUISE"),

	/**
	 * The '<em><b>BREAK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREAK_VALUE
	 * @generated
	 * @ordered
	 */
	BREAK(4, "BREAK", "BREAK"),

	/**
	 * The '<em><b>WAIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAIT_VALUE
	 * @generated
	 * @ordered
	 */
	WAIT(5, "WAIT", "WAIT"),

	/**
	 * The '<em><b>ACCELERATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCELERATE_VALUE
	 * @generated
	 * @ordered
	 */
	ACCELERATE(6, "ACCELERATE", "ACCELERATE"),

	/**
	 * The '<em><b>NO INFORMATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_INFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	NO_INFORMATION(7, "NO_INFORMATION", "NO_INFORMATION"),

	/**
	 * The '<em><b>COASTING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COASTING_VALUE
	 * @generated
	 * @ordered
	 */
	COASTING(8, "COASTING", "COASTING");

	/**
	 * The '<em><b>DISPATCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPATCH
	 * @generated
	 * @ordered
	 */
	public static final int DISPATCH_VALUE = 0;

	/**
	 * The '<em><b>DEPARTURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPARTURE
	 * @generated
	 * @ordered
	 */
	public static final int DEPARTURE_VALUE = 1;

	/**
	 * The '<em><b>LSA COUNTDOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LSA_COUNTDOWN
	 * @generated
	 * @ordered
	 */
	public static final int LSA_COUNTDOWN_VALUE = 2;

	/**
	 * The '<em><b>CRUISE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRUISE
	 * @generated
	 * @ordered
	 */
	public static final int CRUISE_VALUE = 3;

	/**
	 * The '<em><b>BREAK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREAK
	 * @generated
	 * @ordered
	 */
	public static final int BREAK_VALUE = 4;

	/**
	 * The '<em><b>WAIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAIT
	 * @generated
	 * @ordered
	 */
	public static final int WAIT_VALUE = 5;

	/**
	 * The '<em><b>ACCELERATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCELERATE
	 * @generated
	 * @ordered
	 */
	public static final int ACCELERATE_VALUE = 6;

	/**
	 * The '<em><b>NO INFORMATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_INFORMATION
	 * @generated
	 * @ordered
	 */
	public static final int NO_INFORMATION_VALUE = 7;

	/**
	 * The '<em><b>COASTING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COASTING
	 * @generated
	 * @ordered
	 */
	public static final int COASTING_VALUE = 8;

	/**
	 * An array of all the '<em><b>Recommendation Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RecommendationTypes[] VALUES_ARRAY =
		new RecommendationTypes[] {
			DISPATCH,
			DEPARTURE,
			LSA_COUNTDOWN,
			CRUISE,
			BREAK,
			WAIT,
			ACCELERATE,
			NO_INFORMATION,
			COASTING,
		};

	/**
	 * A public read-only list of all the '<em><b>Recommendation Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RecommendationTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Recommendation Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RecommendationTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RecommendationTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Recommendation Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RecommendationTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RecommendationTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Recommendation Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RecommendationTypes get(int value) {
		switch (value) {
			case DISPATCH_VALUE: return DISPATCH;
			case DEPARTURE_VALUE: return DEPARTURE;
			case LSA_COUNTDOWN_VALUE: return LSA_COUNTDOWN;
			case CRUISE_VALUE: return CRUISE;
			case BREAK_VALUE: return BREAK;
			case WAIT_VALUE: return WAIT;
			case ACCELERATE_VALUE: return ACCELERATE;
			case NO_INFORMATION_VALUE: return NO_INFORMATION;
			case COASTING_VALUE: return COASTING;
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
	private RecommendationTypes(int value, String name, String literal) {
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
	
} //RecommendationTypes
