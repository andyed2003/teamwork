/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ComposedMachine;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ComposedMachine.ComposedMachinePackage
 * @generated
 */
public interface ComposedMachineFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComposedMachineFactory eINSTANCE = ComposedMachine.impl.ComposedMachineFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Composed Machine </em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composed Machine </em>'.
	 * @generated
	 */
	ComposedMachine_ createComposedMachine_();

	/**
	 * Returns a new object of class '<em>Included Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Included Machine</em>'.
	 * @generated
	 */
	IncludedMachine createIncludedMachine();

	/**
	 * Returns a new object of class '<em>Composed Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composed Event</em>'.
	 * @generated
	 */
	ComposedEvent createComposedEvent();

	/**
	 * Returns a new object of class '<em>Combined Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combined Event</em>'.
	 * @generated
	 */
	CombinedEvent createCombinedEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComposedMachinePackage getComposedMachinePackage();

} //ComposedMachineFactory
