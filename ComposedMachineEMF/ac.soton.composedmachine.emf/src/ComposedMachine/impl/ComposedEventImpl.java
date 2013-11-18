/**
 */
package ComposedMachine.impl;

import ComposedMachine.CombinedEvent;
import ComposedMachine.ComposedEvent;
import ComposedMachine.ComposedMachinePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eventb.emf.core.machine.Convergence;
import org.eventb.emf.core.machine.Event;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composed Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ComposedMachine.impl.ComposedEventImpl#getConvergence <em>Convergence</em>}</li>
 *   <li>{@link ComposedMachine.impl.ComposedEventImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link ComposedMachine.impl.ComposedEventImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link ComposedMachine.impl.ComposedEventImpl#getCombinedEvents <em>Combined Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComposedEventImpl extends EObjectImpl implements ComposedEvent {
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
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> refines;

	/**
	 * The cached value of the '{@link #getCombinedEvents() <em>Combined Events</em>}' reference list.
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
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComposedMachinePackage.COMPOSED_EVENT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getRefines() {
		if (refines == null) {
			refines = new EObjectResolvingEList<Event>(Event.class, this, ComposedMachinePackage.COMPOSED_EVENT__REFINES);
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
			combinedEvents = new EObjectResolvingEList<CombinedEvent>(CombinedEvent.class, this, ComposedMachinePackage.COMPOSED_EVENT__COMBINED_EVENTS);
		}
		return combinedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComposedMachinePackage.COMPOSED_EVENT__CONVERGENCE:
				return getConvergence();
			case ComposedMachinePackage.COMPOSED_EVENT__COMMENT:
				return getComment();
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
			case ComposedMachinePackage.COMPOSED_EVENT__CONVERGENCE:
				setConvergence((Convergence)newValue);
				return;
			case ComposedMachinePackage.COMPOSED_EVENT__COMMENT:
				setComment((String)newValue);
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
			case ComposedMachinePackage.COMPOSED_EVENT__CONVERGENCE:
				setConvergence(CONVERGENCE_EDEFAULT);
				return;
			case ComposedMachinePackage.COMPOSED_EVENT__COMMENT:
				setComment(COMMENT_EDEFAULT);
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
			case ComposedMachinePackage.COMPOSED_EVENT__CONVERGENCE:
				return convergence != CONVERGENCE_EDEFAULT;
			case ComposedMachinePackage.COMPOSED_EVENT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (convergence: ");
		result.append(convergence);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //ComposedEventImpl
