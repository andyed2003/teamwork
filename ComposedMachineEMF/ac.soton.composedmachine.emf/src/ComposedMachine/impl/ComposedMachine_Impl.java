/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComposedMachine.impl;

import ComposedMachine.ComposedEvent;
import ComposedMachine.ComposedMachinePackage;
import ComposedMachine.ComposedMachine_;
import ComposedMachine.IncludedMachine;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eventb.emf.core.context.Context;

import org.eventb.emf.core.impl.EventBNamedCommentedComponentElementImpl;

import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composed Machine </b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ComposedMachine.impl.ComposedMachine_Impl#getRefines <em>Refines</em>}</li>
 *   <li>{@link ComposedMachine.impl.ComposedMachine_Impl#getSees <em>Sees</em>}</li>
 *   <li>{@link ComposedMachine.impl.ComposedMachine_Impl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link ComposedMachine.impl.ComposedMachine_Impl#getInvariants <em>Invariants</em>}</li>
 *   <li>{@link ComposedMachine.impl.ComposedMachine_Impl#getComposedEvents <em>Composed Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComposedMachine_Impl extends EventBNamedCommentedComponentElementImpl implements ComposedMachine_ {
	/**
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected EList<Machine> refines;

	/**
	 * The cached value of the '{@link #getSees() <em>Sees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSees()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> sees;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<IncludedMachine> includes;

	/**
	 * The cached value of the '{@link #getInvariants() <em>Invariants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariants()
	 * @generated
	 * @ordered
	 */
	protected EList<Invariant> invariants;

	/**
	 * The cached value of the '{@link #getComposedEvents() <em>Composed Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<ComposedEvent> composedEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedMachine_Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComposedMachinePackage.Literals.COMPOSED_MACHINE_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Machine> getRefines() {
		if (refines == null) {
			refines = new EObjectContainmentEList.Resolving<Machine>(Machine.class, this, ComposedMachinePackage.COMPOSED_MACHINE___REFINES);
		}
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getSees() {
		if (sees == null) {
			sees = new EObjectContainmentEList.Resolving<Context>(Context.class, this, ComposedMachinePackage.COMPOSED_MACHINE___SEES);
		}
		return sees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncludedMachine> getIncludes() {
		if (includes == null) {
			includes = new EObjectContainmentEList.Resolving<IncludedMachine>(IncludedMachine.class, this, ComposedMachinePackage.COMPOSED_MACHINE___INCLUDES);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Invariant> getInvariants() {
		if (invariants == null) {
			invariants = new EObjectContainmentEList.Resolving<Invariant>(Invariant.class, this, ComposedMachinePackage.COMPOSED_MACHINE___INVARIANTS);
		}
		return invariants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComposedEvent> getComposedEvents() {
		if (composedEvents == null) {
			composedEvents = new EObjectContainmentEList.Resolving<ComposedEvent>(ComposedEvent.class, this, ComposedMachinePackage.COMPOSED_MACHINE___COMPOSED_EVENTS);
		}
		return composedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComposedMachinePackage.COMPOSED_MACHINE___REFINES:
				return ((InternalEList<?>)getRefines()).basicRemove(otherEnd, msgs);
			case ComposedMachinePackage.COMPOSED_MACHINE___SEES:
				return ((InternalEList<?>)getSees()).basicRemove(otherEnd, msgs);
			case ComposedMachinePackage.COMPOSED_MACHINE___INCLUDES:
				return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
			case ComposedMachinePackage.COMPOSED_MACHINE___INVARIANTS:
				return ((InternalEList<?>)getInvariants()).basicRemove(otherEnd, msgs);
			case ComposedMachinePackage.COMPOSED_MACHINE___COMPOSED_EVENTS:
				return ((InternalEList<?>)getComposedEvents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComposedMachinePackage.COMPOSED_MACHINE___REFINES:
				return getRefines();
			case ComposedMachinePackage.COMPOSED_MACHINE___SEES:
				return getSees();
			case ComposedMachinePackage.COMPOSED_MACHINE___INCLUDES:
				return getIncludes();
			case ComposedMachinePackage.COMPOSED_MACHINE___INVARIANTS:
				return getInvariants();
			case ComposedMachinePackage.COMPOSED_MACHINE___COMPOSED_EVENTS:
				return getComposedEvents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComposedMachinePackage.COMPOSED_MACHINE___REFINES:
				getRefines().clear();
				getRefines().addAll((Collection<? extends Machine>)newValue);
				return;
			case ComposedMachinePackage.COMPOSED_MACHINE___SEES:
				getSees().clear();
				getSees().addAll((Collection<? extends Context>)newValue);
				return;
			case ComposedMachinePackage.COMPOSED_MACHINE___INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends IncludedMachine>)newValue);
				return;
			case ComposedMachinePackage.COMPOSED_MACHINE___INVARIANTS:
				getInvariants().clear();
				getInvariants().addAll((Collection<? extends Invariant>)newValue);
				return;
			case ComposedMachinePackage.COMPOSED_MACHINE___COMPOSED_EVENTS:
				getComposedEvents().clear();
				getComposedEvents().addAll((Collection<? extends ComposedEvent>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComposedMachinePackage.COMPOSED_MACHINE___REFINES:
				getRefines().clear();
				return;
			case ComposedMachinePackage.COMPOSED_MACHINE___SEES:
				getSees().clear();
				return;
			case ComposedMachinePackage.COMPOSED_MACHINE___INCLUDES:
				getIncludes().clear();
				return;
			case ComposedMachinePackage.COMPOSED_MACHINE___INVARIANTS:
				getInvariants().clear();
				return;
			case ComposedMachinePackage.COMPOSED_MACHINE___COMPOSED_EVENTS:
				getComposedEvents().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComposedMachinePackage.COMPOSED_MACHINE___REFINES:
				return refines != null && !refines.isEmpty();
			case ComposedMachinePackage.COMPOSED_MACHINE___SEES:
				return sees != null && !sees.isEmpty();
			case ComposedMachinePackage.COMPOSED_MACHINE___INCLUDES:
				return includes != null && !includes.isEmpty();
			case ComposedMachinePackage.COMPOSED_MACHINE___INVARIANTS:
				return invariants != null && !invariants.isEmpty();
			case ComposedMachinePackage.COMPOSED_MACHINE___COMPOSED_EVENTS:
				return composedEvents != null && !composedEvents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComposedMachine_Impl
