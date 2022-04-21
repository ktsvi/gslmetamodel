/**
 */
package gamamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propertie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.Propertie#getPropertieName <em>Propertie Name</em>}</li>
 *   <li>{@link gamamodel.Propertie#getType <em>Type</em>}</li>
 *   <li>{@link gamamodel.Propertie#getInitValue <em>Init Value</em>}</li>
 * </ul>
 *
 * @see gamamodel.GamamodelPackage#getPropertie()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface Propertie extends EObject {
	/**
	 * Returns the value of the '<em><b>Propertie Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propertie Name</em>' attribute.
	 * @see #setPropertieName(String)
	 * @see gamamodel.GamamodelPackage#getPropertie_PropertieName()
	 * @model
	 * @generated
	 */
	String getPropertieName();

	/**
	 * Sets the value of the '{@link gamamodel.Propertie#getPropertieName <em>Propertie Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propertie Name</em>' attribute.
	 * @see #getPropertieName()
	 * @generated
	 */
	void setPropertieName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see gamamodel.GamamodelPackage#getPropertie_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link gamamodel.Propertie#getType <em>Type</em>}' attribute.
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
	 * @see gamamodel.GamamodelPackage#getPropertie_InitValue()
	 * @model
	 * @generated
	 */
	String getInitValue();

	/**
	 * Sets the value of the '{@link gamamodel.Propertie#getInitValue <em>Init Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Value</em>' attribute.
	 * @see #getInitValue()
	 * @generated
	 */
	void setInitValue(String value);

} // Propertie
