/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComposedMachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eventb.emf.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ComposedMachine.ComposedMachineFactory
 * @model kind="package"
 * @generated
 */
public interface ComposedMachinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ComposedMachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ac.soton.composedmachine.emf.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ComposedMachine";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComposedMachinePackage eINSTANCE = ComposedMachine.impl.ComposedMachinePackageImpl.init();

	/**
	 * The meta object id for the '{@link ComposedMachine.impl.ComposedMachine_Impl <em>Composed Machine </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComposedMachine.impl.ComposedMachine_Impl
	 * @see ComposedMachine.impl.ComposedMachinePackageImpl#getComposedMachine_()
	 * @generated
	 */
	int COMPOSED_MACHINE_ = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_MACHINE___ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_COMPONENT_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_MACHINE___EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_COMPONENT_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_MACHINE___ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_COMPONENT_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_MACHINE___REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_COMPONENT_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_MACHINE___GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_COMPONENT_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_MACHINE___LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_COMPONENT_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_MACHINE___COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_COMPONENT_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_MACHINE___NAME = CorePackage.EVENT_BNAMED_COMMENTED_COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_MACHINE___REFINES = CorePackage.EVENT_BNAMED_COMMENTED_COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_MACHINE___SEES = CorePackage.EVENT_BNAMED_COMMENTED_COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_MACHINE___INCLUDES = CorePackage.EVENT_BNAMED_COMMENTED_COMPONENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Invariants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_MACHINE___INVARIANTS = CorePackage.EVENT_BNAMED_COMMENTED_COMPONENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Composed Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_MACHINE___COMPOSED_EVENTS = CorePackage.EVENT_BNAMED_COMMENTED_COMPONENT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Composed Machine </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_MACHINE__FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_COMPONENT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ComposedMachine.impl.IncludedMachineImpl <em>Included Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComposedMachine.impl.IncludedMachineImpl
	 * @see ComposedMachine.impl.ComposedMachinePackageImpl#getIncludedMachine()
	 * @generated
	 */
	int INCLUDED_MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_MACHINE__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_MACHINE__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_MACHINE__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_MACHINE__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_MACHINE__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_MACHINE__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_MACHINE__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_MACHINE__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_MACHINE__PROJECT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_MACHINE__MACHINE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Invariant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_MACHINE__HAS_INVARIANT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Included Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDED_MACHINE_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ComposedMachine.impl.ComposedEventImpl <em>Composed Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComposedMachine.impl.ComposedEventImpl
	 * @see ComposedMachine.impl.ComposedMachinePackageImpl#getComposedEvent()
	 * @generated
	 */
	int COMPOSED_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_EVENT__ANNOTATIONS = CorePackage.EVENT_BCOMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_EVENT__EXTENSIONS = CorePackage.EVENT_BCOMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_EVENT__ATTRIBUTES = CorePackage.EVENT_BCOMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_EVENT__REFERENCE = CorePackage.EVENT_BCOMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_EVENT__GENERATED = CorePackage.EVENT_BCOMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_EVENT__LOCAL_GENERATED = CorePackage.EVENT_BCOMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_EVENT__COMMENT = CorePackage.EVENT_BCOMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_EVENT__NAME = CorePackage.EVENT_BCOMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Convergence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_EVENT__CONVERGENCE = CorePackage.EVENT_BCOMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_EVENT__REFINES = CorePackage.EVENT_BCOMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Combined Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_EVENT__COMBINED_EVENTS = CorePackage.EVENT_BCOMMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Composed Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSED_EVENT_FEATURE_COUNT = CorePackage.EVENT_BCOMMENTED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ComposedMachine.impl.CombinedEventImpl <em>Combined Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComposedMachine.impl.CombinedEventImpl
	 * @see ComposedMachine.impl.ComposedMachinePackageImpl#getCombinedEvent()
	 * @generated
	 */
	int COMBINED_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_EVENT__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_EVENT__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_EVENT__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_EVENT__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_EVENT__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_EVENT__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_EVENT__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_EVENT__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_EVENT__PROJECT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Machine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_EVENT__MACHINE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_EVENT__EVENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Combined Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBINED_EVENT_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ComposedMachine.HasInvariant <em>Has Invariant</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ComposedMachine.HasInvariant
	 * @see ComposedMachine.impl.ComposedMachinePackageImpl#getHasInvariant()
	 * @generated
	 */
	int HAS_INVARIANT = 4;


	/**
	 * Returns the meta object for class '{@link ComposedMachine.ComposedMachine_ <em>Composed Machine </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Machine </em>'.
	 * @see ComposedMachine.ComposedMachine_
	 * @generated
	 */
	EClass getComposedMachine_();

	/**
	 * Returns the meta object for the containment reference list '{@link ComposedMachine.ComposedMachine_#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refines</em>'.
	 * @see ComposedMachine.ComposedMachine_#getRefines()
	 * @see #getComposedMachine_()
	 * @generated
	 */
	EReference getComposedMachine__Refines();

	/**
	 * Returns the meta object for the containment reference list '{@link ComposedMachine.ComposedMachine_#getSees <em>Sees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sees</em>'.
	 * @see ComposedMachine.ComposedMachine_#getSees()
	 * @see #getComposedMachine_()
	 * @generated
	 */
	EReference getComposedMachine__Sees();

	/**
	 * Returns the meta object for the containment reference list '{@link ComposedMachine.ComposedMachine_#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Includes</em>'.
	 * @see ComposedMachine.ComposedMachine_#getIncludes()
	 * @see #getComposedMachine_()
	 * @generated
	 */
	EReference getComposedMachine__Includes();

	/**
	 * Returns the meta object for the containment reference list '{@link ComposedMachine.ComposedMachine_#getInvariants <em>Invariants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invariants</em>'.
	 * @see ComposedMachine.ComposedMachine_#getInvariants()
	 * @see #getComposedMachine_()
	 * @generated
	 */
	EReference getComposedMachine__Invariants();

	/**
	 * Returns the meta object for the containment reference list '{@link ComposedMachine.ComposedMachine_#getComposedEvents <em>Composed Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composed Events</em>'.
	 * @see ComposedMachine.ComposedMachine_#getComposedEvents()
	 * @see #getComposedMachine_()
	 * @generated
	 */
	EReference getComposedMachine__ComposedEvents();

	/**
	 * Returns the meta object for class '{@link ComposedMachine.IncludedMachine <em>Included Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Included Machine</em>'.
	 * @see ComposedMachine.IncludedMachine
	 * @generated
	 */
	EClass getIncludedMachine();

	/**
	 * Returns the meta object for the reference '{@link ComposedMachine.IncludedMachine#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see ComposedMachine.IncludedMachine#getProject()
	 * @see #getIncludedMachine()
	 * @generated
	 */
	EReference getIncludedMachine_Project();

	/**
	 * Returns the meta object for the reference '{@link ComposedMachine.IncludedMachine#getMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Machine</em>'.
	 * @see ComposedMachine.IncludedMachine#getMachine()
	 * @see #getIncludedMachine()
	 * @generated
	 */
	EReference getIncludedMachine_Machine();

	/**
	 * Returns the meta object for the attribute '{@link ComposedMachine.IncludedMachine#getHasInvariant <em>Has Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Invariant</em>'.
	 * @see ComposedMachine.IncludedMachine#getHasInvariant()
	 * @see #getIncludedMachine()
	 * @generated
	 */
	EAttribute getIncludedMachine_HasInvariant();

	/**
	 * Returns the meta object for class '{@link ComposedMachine.ComposedEvent <em>Composed Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composed Event</em>'.
	 * @see ComposedMachine.ComposedEvent
	 * @generated
	 */
	EClass getComposedEvent();

	/**
	 * Returns the meta object for the attribute '{@link ComposedMachine.ComposedEvent#getConvergence <em>Convergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Convergence</em>'.
	 * @see ComposedMachine.ComposedEvent#getConvergence()
	 * @see #getComposedEvent()
	 * @generated
	 */
	EAttribute getComposedEvent_Convergence();

	/**
	 * Returns the meta object for the containment reference list '{@link ComposedMachine.ComposedEvent#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refines</em>'.
	 * @see ComposedMachine.ComposedEvent#getRefines()
	 * @see #getComposedEvent()
	 * @generated
	 */
	EReference getComposedEvent_Refines();

	/**
	 * Returns the meta object for the containment reference list '{@link ComposedMachine.ComposedEvent#getCombinedEvents <em>Combined Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Combined Events</em>'.
	 * @see ComposedMachine.ComposedEvent#getCombinedEvents()
	 * @see #getComposedEvent()
	 * @generated
	 */
	EReference getComposedEvent_CombinedEvents();

	/**
	 * Returns the meta object for class '{@link ComposedMachine.CombinedEvent <em>Combined Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combined Event</em>'.
	 * @see ComposedMachine.CombinedEvent
	 * @generated
	 */
	EClass getCombinedEvent();

	/**
	 * Returns the meta object for the reference '{@link ComposedMachine.CombinedEvent#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see ComposedMachine.CombinedEvent#getProject()
	 * @see #getCombinedEvent()
	 * @generated
	 */
	EReference getCombinedEvent_Project();

	/**
	 * Returns the meta object for the reference '{@link ComposedMachine.CombinedEvent#getMachine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Machine</em>'.
	 * @see ComposedMachine.CombinedEvent#getMachine()
	 * @see #getCombinedEvent()
	 * @generated
	 */
	EReference getCombinedEvent_Machine();

	/**
	 * Returns the meta object for the reference '{@link ComposedMachine.CombinedEvent#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see ComposedMachine.CombinedEvent#getEvent()
	 * @see #getCombinedEvent()
	 * @generated
	 */
	EReference getCombinedEvent_Event();

	/**
	 * Returns the meta object for enum '{@link ComposedMachine.HasInvariant <em>Has Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Has Invariant</em>'.
	 * @see ComposedMachine.HasInvariant
	 * @generated
	 */
	EEnum getHasInvariant();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComposedMachineFactory getComposedMachineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ComposedMachine.impl.ComposedMachine_Impl <em>Composed Machine </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComposedMachine.impl.ComposedMachine_Impl
		 * @see ComposedMachine.impl.ComposedMachinePackageImpl#getComposedMachine_()
		 * @generated
		 */
		EClass COMPOSED_MACHINE_ = eINSTANCE.getComposedMachine_();

		/**
		 * The meta object literal for the '<em><b>Refines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_MACHINE___REFINES = eINSTANCE.getComposedMachine__Refines();

		/**
		 * The meta object literal for the '<em><b>Sees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_MACHINE___SEES = eINSTANCE.getComposedMachine__Sees();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_MACHINE___INCLUDES = eINSTANCE.getComposedMachine__Includes();

		/**
		 * The meta object literal for the '<em><b>Invariants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_MACHINE___INVARIANTS = eINSTANCE.getComposedMachine__Invariants();

		/**
		 * The meta object literal for the '<em><b>Composed Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_MACHINE___COMPOSED_EVENTS = eINSTANCE.getComposedMachine__ComposedEvents();

		/**
		 * The meta object literal for the '{@link ComposedMachine.impl.IncludedMachineImpl <em>Included Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComposedMachine.impl.IncludedMachineImpl
		 * @see ComposedMachine.impl.ComposedMachinePackageImpl#getIncludedMachine()
		 * @generated
		 */
		EClass INCLUDED_MACHINE = eINSTANCE.getIncludedMachine();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDED_MACHINE__PROJECT = eINSTANCE.getIncludedMachine_Project();

		/**
		 * The meta object literal for the '<em><b>Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDED_MACHINE__MACHINE = eINSTANCE.getIncludedMachine_Machine();

		/**
		 * The meta object literal for the '<em><b>Has Invariant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDED_MACHINE__HAS_INVARIANT = eINSTANCE.getIncludedMachine_HasInvariant();

		/**
		 * The meta object literal for the '{@link ComposedMachine.impl.ComposedEventImpl <em>Composed Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComposedMachine.impl.ComposedEventImpl
		 * @see ComposedMachine.impl.ComposedMachinePackageImpl#getComposedEvent()
		 * @generated
		 */
		EClass COMPOSED_EVENT = eINSTANCE.getComposedEvent();

		/**
		 * The meta object literal for the '<em><b>Convergence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSED_EVENT__CONVERGENCE = eINSTANCE.getComposedEvent_Convergence();

		/**
		 * The meta object literal for the '<em><b>Refines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_EVENT__REFINES = eINSTANCE.getComposedEvent_Refines();

		/**
		 * The meta object literal for the '<em><b>Combined Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSED_EVENT__COMBINED_EVENTS = eINSTANCE.getComposedEvent_CombinedEvents();

		/**
		 * The meta object literal for the '{@link ComposedMachine.impl.CombinedEventImpl <em>Combined Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComposedMachine.impl.CombinedEventImpl
		 * @see ComposedMachine.impl.ComposedMachinePackageImpl#getCombinedEvent()
		 * @generated
		 */
		EClass COMBINED_EVENT = eINSTANCE.getCombinedEvent();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_EVENT__PROJECT = eINSTANCE.getCombinedEvent_Project();

		/**
		 * The meta object literal for the '<em><b>Machine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_EVENT__MACHINE = eINSTANCE.getCombinedEvent_Machine();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBINED_EVENT__EVENT = eINSTANCE.getCombinedEvent_Event();

		/**
		 * The meta object literal for the '{@link ComposedMachine.HasInvariant <em>Has Invariant</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ComposedMachine.HasInvariant
		 * @see ComposedMachine.impl.ComposedMachinePackageImpl#getHasInvariant()
		 * @generated
		 */
		EEnum HAS_INVARIANT = eINSTANCE.getHasInvariant();

	}

} //ComposedMachinePackage
