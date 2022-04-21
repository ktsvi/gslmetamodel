/**
 */
package gamamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.Display#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link gamamodel.Display#getDisplayType <em>Display Type</em>}</li>
 *   <li>{@link gamamodel.Display#getSpecieblock <em>Specieblock</em>}</li>
 * </ul>
 *
 * @see gamamodel.GamamodelPackage#getDisplay()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface Display extends EObject {
	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see gamamodel.GamamodelPackage#getDisplay_DisplayName()
	 * @model id="true"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link gamamodel.Display#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Display Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Type</em>' attribute.
	 * @see #setDisplayType(String)
	 * @see gamamodel.GamamodelPackage#getDisplay_DisplayType()
	 * @model
	 * @generated
	 */
	String getDisplayType();

	/**
	 * Sets the value of the '{@link gamamodel.Display#getDisplayType <em>Display Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Type</em>' attribute.
	 * @see #getDisplayType()
	 * @generated
	 */
	void setDisplayType(String value);

	/**
	 * Returns the value of the '<em><b>Specieblock</b></em>' containment reference list.
	 * The list contents are of type {@link gamamodel.SpecieBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specieblock</em>' containment reference list.
	 * @see gamamodel.GamamodelPackage#getDisplay_Specieblock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SpecieBlock> getSpecieblock();

} // Display
