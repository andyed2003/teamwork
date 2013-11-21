/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComposedMachine.impl;

import ComposedMachine.ComposedMachinePackage;
import ComposedMachine.HasInvariant;
import ComposedMachine.IncludedMachine;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eventb.emf.core.Project;

import org.eventb.emf.core.impl.EventBNamedCommentedElementImpl;

import org.eventb.emf.core.machine.Machine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Included Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ComposedMachine.impl.IncludedMachineImpl#getProject <em>Project</em>}</li>
 *   <li>{@link ComposedMachine.impl.IncludedMachineImpl#getMachine <em>Machine</em>}</li>
 *   <li>{@link ComposedMachine.impl.IncludedMachineImpl#getHasInvariant <em>Has Invariant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncludedMachineImpl extends EventBNamedCommentedElementImpl implements IncludedMachine {
	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected Project project;

	/**
	 * The cached value of the '{@link #getMachine() <em>Machine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachine()
	 * @generated
	 * @ordered
	 */
	protected Machine machine;

	/**
	 * The default value of the '{@link #getHasInvariant() <em>Has Invariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInvariant()
	 * @generated
	 * @ordered
	 */
	protected static final HasInvariant HAS_INVARIANT_EDEFAULT = HasInvariant.NO_INVARIANT;

	/**
	 * The cached value of the '{@link #getHasInvariant() <em>Has Invariant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInvariant()
	 * @generated
	 * @ordered
	 */
	protected HasInvariant hasInvariant = HAS_INVARIANT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludedMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComposedMachinePackage.Literals.INCLUDED_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		if (project != null && project.eIsProxy()) {
			InternalEObject oldProject = (InternalEObject)project;
			project = (Project)eResolveProxy(oldProject);
			if (project != oldProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComposedMachinePackage.INCLUDED_MACHINE__PROJECT, oldProject, project));
			}
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		Project oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComposedMachinePackage.INCLUDED_MACHINE__PROJECT, oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine getMachine() {
		if (machine != null && machine.eIsProxy()) {
			InternalEObject oldMachine = (InternalEObject)machine;
			machine = (Machine)eResolveProxy(oldMachine);
			if (machine != oldMachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComposedMachinePackage.INCLUDED_MACHINE__MACHINE, oldMachine, machine));
			}
		}
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine basicGetMachine() {
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMachine(Machine newMachine) {
		Machine oldMachine = machine;
		machine = newMachine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComposedMachinePackage.INCLUDED_MACHINE__MACHINE, oldMachine, machine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasInvariant getHasInvariant() {
		return hasInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasInvariant(HasInvariant newHasInvariant) {
		HasInvariant oldHasInvariant = hasInvariant;
		hasInvariant = newHasInvariant == null ? HAS_INVARIANT_EDEFAULT : newHasInvariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComposedMachinePackage.INCLUDED_MACHINE__HAS_INVARIANT, oldHasInvariant, hasInvariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComposedMachinePackage.INCLUDED_MACHINE__PROJECT:
				if (resolve) return getProject();
				return basicGetProject();
			case ComposedMachinePackage.INCLUDED_MACHINE__MACHINE:
				if (resolve) return getMachine();
				return basicGetMachine();
			case ComposedMachinePackage.INCLUDED_MACHINE__HAS_INVARIANT:
				return getHasInvariant();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComposedMachinePackage.INCLUDED_MACHINE__PROJECT:
				setProject((Project)newValue);
				return;
			case ComposedMachinePackage.INCLUDED_MACHINE__MACHINE:
				setMachine((Machine)newValue);
				return;
			case ComposedMachinePackage.INCLUDED_MACHINE__HAS_INVARIANT:
				setHasInvariant((HasInvariant)newValue);
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
			case ComposedMachinePackage.INCLUDED_MACHINE__PROJECT:
				setProject((Project)null);
				return;
			case ComposedMachinePackage.INCLUDED_MACHINE__MACHINE:
				setMachine((Machine)null);
				return;
			case ComposedMachinePackage.INCLUDED_MACHINE__HAS_INVARIANT:
				setHasInvariant(HAS_INVARIANT_EDEFAULT);
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
			case ComposedMachinePackage.INCLUDED_MACHINE__PROJECT:
				return project != null;
			case ComposedMachinePackage.INCLUDED_MACHINE__MACHINE:
				return machine != null;
			case ComposedMachinePackage.INCLUDED_MACHINE__HAS_INVARIANT:
				return hasInvariant != HAS_INVARIANT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (hasInvariant: ");
		result.append(hasInvariant);
		result.append(')');
		return result.toString();
	}

} //IncludedMachineImpl
