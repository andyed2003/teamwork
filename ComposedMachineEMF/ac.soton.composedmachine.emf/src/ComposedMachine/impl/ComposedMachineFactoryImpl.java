/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComposedMachine.impl;

import ComposedMachine.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComposedMachineFactoryImpl extends EFactoryImpl implements ComposedMachineFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComposedMachineFactory init() {
		try {
			ComposedMachineFactory theComposedMachineFactory = (ComposedMachineFactory)EPackage.Registry.INSTANCE.getEFactory("http://ac.soton.composedmachine.emf.ecore"); 
			if (theComposedMachineFactory != null) {
				return theComposedMachineFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComposedMachineFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedMachineFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ComposedMachinePackage.COMPOSED_MACHINE_: return createComposedMachine_();
			case ComposedMachinePackage.INCLUDED_MACHINE: return createIncludedMachine();
			case ComposedMachinePackage.COMPOSED_EVENT: return createComposedEvent();
			case ComposedMachinePackage.COMBINED_EVENT: return createCombinedEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ComposedMachinePackage.HAS_INVARIANT:
				return createHasInvariantFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ComposedMachinePackage.HAS_INVARIANT:
				return convertHasInvariantToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedMachine_ createComposedMachine_() {
		ComposedMachine_Impl composedMachine_ = new ComposedMachine_Impl();
		return composedMachine_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludedMachine createIncludedMachine() {
		IncludedMachineImpl includedMachine = new IncludedMachineImpl();
		return includedMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedEvent createComposedEvent() {
		ComposedEventImpl composedEvent = new ComposedEventImpl();
		return composedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedEvent createCombinedEvent() {
		CombinedEventImpl combinedEvent = new CombinedEventImpl();
		return combinedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasInvariant createHasInvariantFromString(EDataType eDataType, String initialValue) {
		HasInvariant result = HasInvariant.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHasInvariantToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposedMachinePackage getComposedMachinePackage() {
		return (ComposedMachinePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComposedMachinePackage getPackage() {
		return ComposedMachinePackage.eINSTANCE;
	}

} //ComposedMachineFactoryImpl
