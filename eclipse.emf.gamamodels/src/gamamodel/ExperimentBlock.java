/**
 */
package gamamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.ExperimentBlock#getType <em>Type</em>}</li>
 *   <li>{@link gamamodel.ExperimentBlock#getExperimentName <em>Experiment Name</em>}</li>
 *   <li>{@link gamamodel.ExperimentBlock#getHasparameter <em>Hasparameter</em>}</li>
 *   <li>{@link gamamodel.ExperimentBlock#getHasoutput <em>Hasoutput</em>}</li>
 * </ul>
 *
 * @see gamamodel.GamamodelPackage#getExperimentBlock()
 * @model
 * @generated
 */
public interface ExperimentBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"gui"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see gamamodel.GamamodelPackage#getExperimentBlock_Type()
	 * @model default="gui"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link gamamodel.ExperimentBlock#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Experiment Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experiment Name</em>' attribute.
	 * @see #setExperimentName(String)
	 * @see gamamodel.GamamodelPackage#getExperimentBlock_ExperimentName()
	 * @model default=""
	 * @generated
	 */
	String getExperimentName();

	/**
	 * Sets the value of the '{@link gamamodel.ExperimentBlock#getExperimentName <em>Experiment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experiment Name</em>' attribute.
	 * @see #getExperimentName()
	 * @generated
	 */
	void setExperimentName(String value);

	/**
	 * Returns the value of the '<em><b>Hasparameter</b></em>' containment reference list.
	 * The list contents are of type {@link gamamodel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hasparameter</em>' containment reference list.
	 * @see gamamodel.GamamodelPackage#getExperimentBlock_Hasparameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Parameter> getHasparameter();

	/**
	 * Returns the value of the '<em><b>Hasoutput</b></em>' containment reference list.
	 * The list contents are of type {@link gamamodel.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hasoutput</em>' containment reference list.
	 * @see gamamodel.GamamodelPackage#getExperimentBlock_Hasoutput()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Output> getHasoutput();

} // ExperimentBlock
