/**
 */
package gamamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.Monitor#getLabel <em>Label</em>}</li>
 *   <li>{@link gamamodel.Monitor#getTargetVar <em>Target Var</em>}</li>
 * </ul>
 *
 * @see gamamodel.GamamodelPackage#getMonitor()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface Monitor extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see gamamodel.GamamodelPackage#getMonitor_Label()
	 * @model id="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link gamamodel.Monitor#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Target Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Var</em>' attribute.
	 * @see #setTargetVar(String)
	 * @see gamamodel.GamamodelPackage#getMonitor_TargetVar()
	 * @model
	 * @generated
	 */
	String getTargetVar();

	/**
	 * Sets the value of the '{@link gamamodel.Monitor#getTargetVar <em>Target Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Var</em>' attribute.
	 * @see #getTargetVar()
	 * @generated
	 */
	void setTargetVar(String value);

} // Monitor
