/**
 */
package gamamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inspector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.Inspector#getLabel <em>Label</em>}</li>
 *   <li>{@link gamamodel.Inspector#getSpecieValue <em>Specie Value</em>}</li>
 *   <li>{@link gamamodel.Inspector#getType <em>Type</em>}</li>
 *   <li>{@link gamamodel.Inspector#getHasinspector <em>Hasinspector</em>}</li>
 * </ul>
 *
 * @see gamamodel.GamamodelPackage#getInspector()
 * @model
 * @generated
 */
public interface Inspector extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see gamamodel.GamamodelPackage#getInspector_Label()
	 * @model id="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link gamamodel.Inspector#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Specie Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specie Value</em>' attribute.
	 * @see #setSpecieValue(String)
	 * @see gamamodel.GamamodelPackage#getInspector_SpecieValue()
	 * @model
	 * @generated
	 */
	String getSpecieValue();

	/**
	 * Sets the value of the '{@link gamamodel.Inspector#getSpecieValue <em>Specie Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specie Value</em>' attribute.
	 * @see #getSpecieValue()
	 * @generated
	 */
	void setSpecieValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see gamamodel.GamamodelPackage#getInspector_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link gamamodel.Inspector#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Hasinspector</b></em>' containment reference list.
	 * The list contents are of type {@link gamamodel.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hasinspector</em>' containment reference list.
	 * @see gamamodel.GamamodelPackage#getInspector_Hasinspector()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Output> getHasinspector();

} // Inspector
