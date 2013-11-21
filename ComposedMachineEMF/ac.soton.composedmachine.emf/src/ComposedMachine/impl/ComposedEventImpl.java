/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComposedMachine.impl;

import ComposedMachine.CombinedEvent;
import ComposedMachine.ComposedEvent;
import ComposedMachine.ComposedMachinePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBNamed;
import org.eventb.emf.core.EventBNamedCommentedElement;

import org.eventb.emf.core.context.Constant;

import org.eventb.emf.core.impl.EventBCommentedElementImpl;

import org.eventb.emf.core.machine.Convergence;
import org.eventb.emf.core.machine.Event;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composed Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ComposedMachine.impl.ComposedEventImpl#getName <em>Name</em>}</li>
 *   <li>{@link ComposedMachine.impl.ComposedEventImpl#getConvergence <em>Convergence</em>}</li>
 *   <li>{@link ComposedMachine.impl.ComposedEventImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link ComposedMachine.impl.ComposedEventImpl#getCombinedEvents <em>Combined Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComposedEventImpl extends EventBCommentedElementImpl implements ComposedEvent {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The default value of the '{@link #getConvergence() <em>Convergence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvergence()
	 * @generated
	 * @ordered
	 */
	protected static final Convergence CONVERGENCE_EDEFAULT = Convergence.ORDINARY;

	/**
	 * The cached value of the '{@link #getConvergence() <em>Convergence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvergence()
	 * @generated
	 * @ordered
	 */
	protected Convergence convergence = CONVERGENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> refines;

	/**
	 * The cached value of the '{@link #getCombinedEvents() <em>Combined Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinedEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<CombinedEvent> combinedEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComposedMachinePackage.Literals.COMPOSED_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		// TODO: implement this method to return the 'Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		// TODO: implement this method to set the 'Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Convergence getConvergence() {
		return convergence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConvergence(Convergence newConvergence) {
		Convergence oldConvergence = convergence;
		convergence = newConvergence == null ? CONVERGENCE_EDEFAULT : newConvergence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComposedMachinePackage.COMPOSED_EVENT__CONVERGENCE, oldConvergence, convergence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getRefines() {
		if (refines == null) {
			refines = new EObjectContainmentEList.Resolving<Event>(Event.class, this, ComposedMachinePackage.COMPOSED_EVENT__REFINES);
		}
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CombinedEvent> getCombinedEvents() {
		if (combinedEvents == null) {
			combinedEvents = new EObjectContainmentEList.Resolving<CombinedEvent>(CombinedEvent.class, this, ComposedMachinePackage.COMPOSED_EVENT__COMBINED_EVENTS);
		}
		return combinedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String doGetName() {
		assert (this instanceof EventBElement);
		String reference = ((EventBElement)this).getReferenceWithoutResolving();
		return reference.length() > this.eStaticClass().getInstanceClassName().length() ?
			reference.substring(this.eStaticClass().getInstanceClassName().length()+1)
			: "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void doSetName(String newName) {
		((EventBElement)this).setReference(this.eStaticClass().getInstanceClassName()+"."+newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComposedMachinePackage.COMPOSED_EVENT__REFINES:
				return ((InternalEList<?>)getRefines()).basicRemove(otherEnd, msgs);
			case ComposedMachinePackage.COMPOSED_EVENT__COMBINED_EVENTS:
				return ((InternalEList<?>)getCombinedEvents()).basicRemove(otherEnd, msgs);
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
			case ComposedMachinePackage.COMPOSED_EVENT__NAME:
				return getName();
			case ComposedMachinePackage.COMPOSED_EVENT__CONVERGENCE:
				return getConvergence();
			case ComposedMachinePackage.COMPOSED_EVENT__REFINES:
				return getRefines();
			case ComposedMachinePackage.COMPOSED_EVENT__COMBINED_EVENTS:
				return getCombinedEvents();
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
			case ComposedMachinePackage.COMPOSED_EVENT__NAME:
				setName((String)newValue);
				return;
			case ComposedMachinePackage.COMPOSED_EVENT__CONVERGENCE:
				setConvergence((Convergence)newValue);
				return;
			case ComposedMachinePackage.COMPOSED_EVENT__REFINES:
				getRefines().clear();
				getRefines().addAll((Collection<? extends Event>)newValue);
				return;
			case ComposedMachinePackage.COMPOSED_EVENT__COMBINED_EVENTS:
				getCombinedEvents().clear();
				getCombinedEvents().addAll((Collection<? extends CombinedEvent>)newValue);
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
			case ComposedMachinePackage.COMPOSED_EVENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComposedMachinePackage.COMPOSED_EVENT__CONVERGENCE:
				setConvergence(CONVERGENCE_EDEFAULT);
				return;
			case ComposedMachinePackage.COMPOSED_EVENT__REFINES:
				getRefines().clear();
				return;
			case ComposedMachinePackage.COMPOSED_EVENT__COMBINED_EVENTS:
				getCombinedEvents().clear();
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
			case ComposedMachinePackage.COMPOSED_EVENT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case ComposedMachinePackage.COMPOSED_EVENT__CONVERGENCE:
				return convergence != CONVERGENCE_EDEFAULT;
			case ComposedMachinePackage.COMPOSED_EVENT__REFINES:
				return refines != null && !refines.isEmpty();
			case ComposedMachinePackage.COMPOSED_EVENT__COMBINED_EVENTS:
				return combinedEvents != null && !combinedEvents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EventBNamed.class) {
			switch (derivedFeatureID) {
				case ComposedMachinePackage.COMPOSED_EVENT__NAME: return CorePackage.EVENT_BNAMED__NAME;
				default: return -1;
			}
		}
		if (baseClass == EventBNamedCommentedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Constant.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EventBNamed.class) {
			switch (baseFeatureID) {
				case CorePackage.EVENT_BNAMED__NAME: return ComposedMachinePackage.COMPOSED_EVENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == EventBNamedCommentedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Constant.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (convergence: ");
		result.append(convergence);
		result.append(')');
		return result.toString();
	}

} //ComposedEventImpl
