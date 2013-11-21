/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComposedMachine;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Has Invariant</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ComposedMachine.ComposedMachinePackage#getHasInvariant()
 * @model
 * @generated
 */
public enum HasInvariant implements Enumerator {
	/**
	 * The '<em><b>No Invariant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_INVARIANT_VALUE
	 * @generated
	 * @ordered
	 */
	NO_INVARIANT(0, "NoInvariant", "NoInvariant"),

	/**
	 * The '<em><b>Include Invariant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUDE_INVARIANT_VALUE
	 * @generated
	 * @ordered
	 */
	INCLUDE_INVARIANT(1, "IncludeInvariant", "IncludeInvariant");

	/**
	 * The '<em><b>No Invariant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Invariant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_INVARIANT
	 * @model name="NoInvariant"
	 * @generated
	 * @ordered
	 */
	public static final int NO_INVARIANT_VALUE = 0;

	/**
	 * The '<em><b>Include Invariant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Include Invariant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCLUDE_INVARIANT
	 * @model name="IncludeInvariant"
	 * @generated
	 * @ordered
	 */
	public static final int INCLUDE_INVARIANT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Has Invariant</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HasInvariant[] VALUES_ARRAY =
		new HasInvariant[] {
			NO_INVARIANT,
			INCLUDE_INVARIANT,
		};

	/**
	 * A public read-only list of all the '<em><b>Has Invariant</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HasInvariant> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Has Invariant</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HasInvariant get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HasInvariant result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Has Invariant</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HasInvariant getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HasInvariant result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Has Invariant</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HasInvariant get(int value) {
		switch (value) {
			case NO_INVARIANT_VALUE: return NO_INVARIANT;
			case INCLUDE_INVARIANT_VALUE: return INCLUDE_INVARIANT;
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
	private HasInvariant(int value, String name, String literal) {
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
	
} //HasInvariant
