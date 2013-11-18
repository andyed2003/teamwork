/**
 */
package ComposedMachine;

import org.eclipse.emf.common.util.EList;

import org.eventb.emf.core.EventBNamedCommentedElement;

import org.eventb.emf.core.context.Context;

import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Machine </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ComposedMachine.ComposedMachine_#getRefines <em>Refines</em>}</li>
 *   <li>{@link ComposedMachine.ComposedMachine_#getSees <em>Sees</em>}</li>
 *   <li>{@link ComposedMachine.ComposedMachine_#getIncludes <em>Includes</em>}</li>
 *   <li>{@link ComposedMachine.ComposedMachine_#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link ComposedMachine.ComposedMachine_#getComposedEvents <em>Composed Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see ComposedMachine.ComposedMachinePackage#getComposedMachine_()
 * @model
 * @generated
 */
public interface ComposedMachine_ extends EventBNamedCommentedElement {
	/**
	 * Returns the value of the '<em><b>Refines</b></em>' reference list.
	 * The list contents are of type {@link org.eventb.emf.core.machine.Machine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refines</em>' reference list.
	 * @see ComposedMachine.ComposedMachinePackage#getComposedMachine__Refines()
	 * @model
	 * @generated
	 */
	EList<Machine> getRefines();

	/**
	 * Returns the value of the '<em><b>Sees</b></em>' reference list.
	 * The list contents are of type {@link org.eventb.emf.core.context.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sees</em>' reference list.
	 * @see ComposedMachine.ComposedMachinePackage#getComposedMachine__Sees()
	 * @model
	 * @generated
	 */
	EList<Context> getSees();

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link ComposedMachine.IncludedMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see ComposedMachine.ComposedMachinePackage#getComposedMachine__Includes()
	 * @model
	 * @generated
	 */
	EList<IncludedMachine> getIncludes();

	/**
	 * Returns the value of the '<em><b>Invariants</b></em>' reference list.
	 * The list contents are of type {@link org.eventb.emf.core.machine.Invariant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invariants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariants</em>' reference list.
	 * @see ComposedMachine.ComposedMachinePackage#getComposedMachine__Invariants()
	 * @model
	 * @generated
	 */
	EList<Invariant> getInvariants();

	/**
	 * Returns the value of the '<em><b>Composed Events</b></em>' reference list.
	 * The list contents are of type {@link ComposedMachine.ComposedEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Events</em>' reference list.
	 * @see ComposedMachine.ComposedMachinePackage#getComposedMachine__ComposedEvents()
	 * @model
	 * @generated
	 */
	EList<ComposedEvent> getComposedEvents();

} // ComposedMachine_
