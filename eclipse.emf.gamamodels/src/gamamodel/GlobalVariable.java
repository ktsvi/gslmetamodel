/**
 */
package gamamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.GlobalVariable#getGvarName <em>Gvar Name</em>}</li>
 *   <li>{@link gamamodel.GlobalVariable#getType <em>Type</em>}</li>
 *   <li>{@link gamamodel.GlobalVariable#getInitValue <em>Init Value</em>}</li>
 * </ul>
 *
 * @see gamamodel.GamamodelPackage#getGlobalVariable()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface GlobalVariable extends EObject {
	/**
	 * Returns the value of the '<em><b>Gvar Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gvar Name</em>' attribute.
	 * @see #setGvarName(String)
	 * @see gamamodel.GamamodelPackage#getGlobalVariable_GvarName()
	 * @model id="true"
	 * @generated
	 */
	String getGvarName();

	/**
	 * Sets the value of the '{@link gamamodel.GlobalVariable#getGvarName <em>Gvar Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gvar Name</em>' attribute.
	 * @see #getGvarName()
	 * @generated
	 */
	void setGvarName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see gamamodel.GamamodelPackage#getGlobalVariable_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link gamamodel.GlobalVariable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Init Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Value</em>' attribute.
	 * @see #setInitValue(String)
	 * @see gamamodel.GamamodelPackage#getGlobalVariable_InitValue()
	 * @model
	 * @generated
	 */
	String getInitValue();

	/**
	 * Sets the value of the '{@link gamamodel.GlobalVariable#getInitValue <em>Init Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Value</em>' attribute.
	 * @see #getInitValue()
	 * @generated
	 */
	void setInitValue(String value);

} // GlobalVariable
