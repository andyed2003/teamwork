/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComposedMachine;

import org.eventb.emf.core.EventBNamedCommentedElement;
import org.eventb.emf.core.Project;

import org.eventb.emf.core.machine.Machine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Included Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ComposedMachine.IncludedMachine#getProject <em>Project</em>}</li>
 *   <li>{@link ComposedMachine.IncludedMachine#getMachine <em>Machine</em>}</li>
 *   <li>{@link ComposedMachine.IncludedMachine#getHasInvariant <em>Has Invariant</em>}</li>
 * </ul>
 * </p>
 *
 * @see ComposedMachine.ComposedMachinePackage#getIncludedMachine()
 * @model
 * @generated
 */
public interface IncludedMachine extends EventBNamedCommentedElement {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(Project)
	 * @see ComposedMachine.ComposedMachinePackage#getIncludedMachine_Project()
	 * @model
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link ComposedMachine.IncludedMachine#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine</em>' reference.
	 * @see #setMachine(Machine)
	 * @see ComposedMachine.ComposedMachinePackage#getIncludedMachine_Machine()
	 * @model
	 * @generated
	 */
	Machine getMachine();

	/**
	 * Sets the value of the '{@link ComposedMachine.IncludedMachine#getMachine <em>Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine</em>' reference.
	 * @see #getMachine()
	 * @generated
	 */
	void setMachine(Machine value);

	/**
	 * Returns the value of the '<em><b>Has Invariant</b></em>' attribute.
	 * The default value is <code>"NoInvariant"</code>.
	 * The literals are from the enumeration {@link ComposedMachine.HasInvariant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Invariant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Invariant</em>' attribute.
	 * @see ComposedMachine.HasInvariant
	 * @see #setHasInvariant(HasInvariant)
	 * @see ComposedMachine.ComposedMachinePackage#getIncludedMachine_HasInvariant()
	 * @model default="NoInvariant"
	 * @generated
	 */
	HasInvariant getHasInvariant();

	/**
	 * Sets the value of the '{@link ComposedMachine.IncludedMachine#getHasInvariant <em>Has Invariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Invariant</em>' attribute.
	 * @see ComposedMachine.HasInvariant
	 * @see #getHasInvariant()
	 * @generated
	 */
	void setHasInvariant(HasInvariant value);

} // IncludedMachine
