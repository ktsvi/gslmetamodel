/**
 */
package gamamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.Parameter#getParameterName <em>Parameter Name</em>}</li>
 *   <li>{@link gamamodel.Parameter#getTargetVariable <em>Target Variable</em>}</li>
 * </ul>
 *
 * @see gamamodel.GamamodelPackage#getParameter()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Name</em>' attribute.
	 * @see #setParameterName(String)
	 * @see gamamodel.GamamodelPackage#getParameter_ParameterName()
	 * @model id="true"
	 * @generated
	 */
	String getParameterName();

	/**
	 * Sets the value of the '{@link gamamodel.Parameter#getParameterName <em>Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Name</em>' attribute.
	 * @see #getParameterName()
	 * @generated
	 */
	void setParameterName(String value);

	/**
	 * Returns the value of the '<em><b>Target Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Variable</em>' attribute.
	 * @see #setTargetVariable(String)
	 * @see gamamodel.GamamodelPackage#getParameter_TargetVariable()
	 * @model
	 * @generated
	 */
	String getTargetVariable();

	/**
	 * Sets the value of the '{@link gamamodel.Parameter#getTargetVariable <em>Target Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Variable</em>' attribute.
	 * @see #getTargetVariable()
	 * @generated
	 */
	void setTargetVariable(String value);

} // Parameter
