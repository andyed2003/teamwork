/**
 */
package ComposedMachine.impl;

import ComposedMachine.CombinedEvent;
import ComposedMachine.ComposedEvent;
import ComposedMachine.ComposedMachineFactory;
import ComposedMachine.ComposedMachinePackage;
import ComposedMachine.ComposedMachine_;
import ComposedMachine.HasInvariant;
import ComposedMachine.IncludedMachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eventb.emf.core.CorePackage;

import org.eventb.emf.core.context.ContextPackage;

import org.eventb.emf.core.machine.MachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComposedMachinePackageImpl extends EPackageImpl implements ComposedMachinePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composedMachine_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includedMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composedEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinedEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hasInvariantEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ComposedMachine.ComposedMachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComposedMachinePackageImpl() {
		super(eNS_URI, ComposedMachineFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ComposedMachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComposedMachinePackage init() {
		if (isInited) return (ComposedMachinePackage)EPackage.Registry.INSTANCE.getEPackage(ComposedMachinePackage.eNS_URI);

		// Obtain or create and register package
		ComposedMachinePackageImpl theComposedMachinePackage = (ComposedMachinePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComposedMachinePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComposedMachinePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComposedMachinePackage.createPackageContents();

		// Initialize created meta-data
		theComposedMachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComposedMachinePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComposedMachinePackage.eNS_URI, theComposedMachinePackage);
		return theComposedMachinePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposedMachine_() {
		return composedMachine_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedMachine__Refines() {
		return (EReference)composedMachine_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedMachine__Sees() {
		return (EReference)composedMachine_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedMachine__Includes() {
		return (EReference)composedMachine_EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedMachine__Invariants() {
		return (EReference)composedMachine_EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedMachine__ComposedEvents() {
		return (EReference)composedMachine_EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludedMachine() {
		return includedMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncludedMachine_Project() {
		return (EReference)includedMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncludedMachine_Machine() {
		return (EReference)includedMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludedMachine_HasInvariant() {
		return (EAttribute)includedMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludedMachine_Comment() {
		return (EAttribute)includedMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposedEvent() {
		return composedEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComposedEvent_Convergence() {
		return (EAttribute)composedEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComposedEvent_Comment() {
		return (EAttribute)composedEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedEvent_Refines() {
		return (EReference)composedEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposedEvent_CombinedEvents() {
		return (EReference)composedEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinedEvent() {
		return combinedEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedEvent_Project() {
		return (EReference)combinedEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedEvent_Machine() {
		return (EReference)combinedEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedEvent_Event() {
		return (EReference)combinedEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHasInvariant() {
		return hasInvariantEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedMachineFactory getComposedMachineFactory() {
		return (ComposedMachineFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		composedMachine_EClass = createEClass(COMPOSED_MACHINE_);
		createEReference(composedMachine_EClass, COMPOSED_MACHINE___REFINES);
		createEReference(composedMachine_EClass, COMPOSED_MACHINE___SEES);
		createEReference(composedMachine_EClass, COMPOSED_MACHINE___INCLUDES);
		createEReference(composedMachine_EClass, COMPOSED_MACHINE___INVARIANTS);
		createEReference(composedMachine_EClass, COMPOSED_MACHINE___COMPOSED_EVENTS);

		includedMachineEClass = createEClass(INCLUDED_MACHINE);
		createEReference(includedMachineEClass, INCLUDED_MACHINE__PROJECT);
		createEReference(includedMachineEClass, INCLUDED_MACHINE__MACHINE);
		createEAttribute(includedMachineEClass, INCLUDED_MACHINE__HAS_INVARIANT);
		createEAttribute(includedMachineEClass, INCLUDED_MACHINE__COMMENT);

		composedEventEClass = createEClass(COMPOSED_EVENT);
		createEAttribute(composedEventEClass, COMPOSED_EVENT__CONVERGENCE);
		createEAttribute(composedEventEClass, COMPOSED_EVENT__COMMENT);
		createEReference(composedEventEClass, COMPOSED_EVENT__REFINES);
		createEReference(composedEventEClass, COMPOSED_EVENT__COMBINED_EVENTS);

		combinedEventEClass = createEClass(COMBINED_EVENT);
		createEReference(combinedEventEClass, COMBINED_EVENT__PROJECT);
		createEReference(combinedEventEClass, COMBINED_EVENT__MACHINE);
		createEReference(combinedEventEClass, COMBINED_EVENT__EVENT);

		// Create enums
		hasInvariantEEnum = createEEnum(HAS_INVARIANT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		MachinePackage theMachinePackage = (MachinePackage)EPackage.Registry.INSTANCE.getEPackage(MachinePackage.eNS_URI);
		ContextPackage theContextPackage = (ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		composedMachine_EClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(composedMachine_EClass, ComposedMachine_.class, "ComposedMachine_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComposedMachine__Refines(), theMachinePackage.getMachine(), null, "refines", null, 0, -1, ComposedMachine_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposedMachine__Sees(), theContextPackage.getContext(), null, "sees", null, 0, -1, ComposedMachine_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposedMachine__Includes(), this.getIncludedMachine(), null, "includes", null, 0, -1, ComposedMachine_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposedMachine__Invariants(), theMachinePackage.getInvariant(), null, "invariants", null, 0, -1, ComposedMachine_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposedMachine__ComposedEvents(), this.getComposedEvent(), null, "composedEvents", null, 0, -1, ComposedMachine_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(includedMachineEClass, IncludedMachine.class, "IncludedMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncludedMachine_Project(), theCorePackage.getProject(), null, "project", null, 0, 1, IncludedMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncludedMachine_Machine(), theMachinePackage.getMachine(), null, "machine", null, 0, 1, IncludedMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludedMachine_HasInvariant(), this.getHasInvariant(), "hasInvariant", "NoInvariant", 0, 1, IncludedMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncludedMachine_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, IncludedMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(composedEventEClass, ComposedEvent.class, "ComposedEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComposedEvent_Convergence(), theMachinePackage.getConvergence(), "convergence", null, 0, 1, ComposedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComposedEvent_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, ComposedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposedEvent_Refines(), theMachinePackage.getEvent(), null, "refines", null, 0, -1, ComposedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposedEvent_CombinedEvents(), this.getCombinedEvent(), null, "combinedEvents", null, 0, -1, ComposedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(combinedEventEClass, CombinedEvent.class, "CombinedEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCombinedEvent_Project(), theCorePackage.getProject(), null, "project", null, 0, 1, CombinedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombinedEvent_Machine(), theMachinePackage.getMachine(), null, "machine", null, 0, 1, CombinedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombinedEvent_Event(), theMachinePackage.getEvent(), null, "event", null, 0, 1, CombinedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(hasInvariantEEnum, HasInvariant.class, "HasInvariant");
		addEEnumLiteral(hasInvariantEEnum, HasInvariant.NO_INVARIANT);
		addEEnumLiteral(hasInvariantEEnum, HasInvariant.INCLUDE_INVARIANT);

		// Create resource
		createResource(eNS_URI);
	}

} //ComposedMachinePackageImpl
