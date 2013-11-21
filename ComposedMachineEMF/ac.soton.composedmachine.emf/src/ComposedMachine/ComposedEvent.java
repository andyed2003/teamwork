/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComposedMachine;

import org.eclipse.emf.common.util.EList;

import org.eventb.emf.core.EventBCommentedElement;

import org.eventb.emf.core.context.Constant;

import org.eventb.emf.core.machine.Convergence;
import org.eventb.emf.core.machine.Event;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composed Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ComposedMachine.ComposedEvent#getConvergence <em>Convergence</em>}</li>
 *   <li>{@link ComposedMachine.ComposedEvent#getRefines <em>Refines</em>}</li>
 *   <li>{@link ComposedMachine.ComposedEvent#getCombinedEvents <em>Combined Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see ComposedMachine.ComposedMachinePackage#getComposedEvent()
 * @model
 * @generated
 */
public interface ComposedEvent extends EventBCommentedElement, Constant {
	/**
	 * Returns the value of the '<em><b>Convergence</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eventb.emf.core.machine.Convergence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Convergence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Convergence</em>' attribute.
	 * @see org.eventb.emf.core.machine.Convergence
	 * @see #setConvergence(Convergence)
	 * @see ComposedMachine.ComposedMachinePackage#getComposedEvent_Convergence()
	 * @model
	 * @generated
	 */
	Convergence getConvergence();

	/**
	 * Sets the value of the '{@link ComposedMachine.ComposedEvent#getConvergence <em>Convergence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Convergence</em>' attribute.
	 * @see org.eventb.emf.core.machine.Convergence
	 * @see #getConvergence()
	 * @generated
	 */
	void setConvergence(Convergence value);

	/**
	 * Returns the value of the '<em><b>Refines</b></em>' containment reference list.
	 * The list contents are of type {@link org.eventb.emf.core.machine.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refines</em>' containment reference list.
	 * @see ComposedMachine.ComposedMachinePackage#getComposedEvent_Refines()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Event> getRefines();

	/**
	 * Returns the value of the '<em><b>Combined Events</b></em>' containment reference list.
	 * The list contents are of type {@link ComposedMachine.CombinedEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combined Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combined Events</em>' containment reference list.
	 * @see ComposedMachine.ComposedMachinePackage#getComposedEvent_CombinedEvents()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<CombinedEvent> getCombinedEvents();

} // ComposedEvent
