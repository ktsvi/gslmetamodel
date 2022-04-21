/**
 */
package gamamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.Output#getId <em>Id</em>}</li>
 *   <li>{@link gamamodel.Output#getHasdisplays <em>Hasdisplays</em>}</li>
 *   <li>{@link gamamodel.Output#getHasexportfile <em>Hasexportfile</em>}</li>
 *   <li>{@link gamamodel.Output#getHasmonitor <em>Hasmonitor</em>}</li>
 *   <li>{@link gamamodel.Output#getOutputName <em>Output Name</em>}</li>
 *   <li>{@link gamamodel.Output#getFramerate <em>Framerate</em>}</li>
 * </ul>
 *
 * @see gamamodel.GamamodelPackage#getOutput()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface Output extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see gamamodel.GamamodelPackage#getOutput_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link gamamodel.Output#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Hasdisplays</b></em>' containment reference list.
	 * The list contents are of type {@link gamamodel.Display}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hasdisplays</em>' containment reference list.
	 * @see gamamodel.GamamodelPackage#getOutput_Hasdisplays()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Display> getHasdisplays();

	/**
	 * Returns the value of the '<em><b>Hasexportfile</b></em>' containment reference list.
	 * The list contents are of type {@link gamamodel.Exportfile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hasexportfile</em>' containment reference list.
	 * @see gamamodel.GamamodelPackage#getOutput_Hasexportfile()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Exportfile> getHasexportfile();

	/**
	 * Returns the value of the '<em><b>Hasmonitor</b></em>' containment reference list.
	 * The list contents are of type {@link gamamodel.Monitor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hasmonitor</em>' containment reference list.
	 * @see gamamodel.GamamodelPackage#getOutput_Hasmonitor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Monitor> getHasmonitor();

	/**
	 * Returns the value of the '<em><b>Output Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Name</em>' attribute.
	 * @see #setOutputName(String)
	 * @see gamamodel.GamamodelPackage#getOutput_OutputName()
	 * @model
	 * @generated
	 */
	String getOutputName();

	/**
	 * Sets the value of the '{@link gamamodel.Output#getOutputName <em>Output Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Name</em>' attribute.
	 * @see #getOutputName()
	 * @generated
	 */
	void setOutputName(String value);

	/**
	 * Returns the value of the '<em><b>Framerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framerate</em>' attribute.
	 * @see #setFramerate(String)
	 * @see gamamodel.GamamodelPackage#getOutput_Framerate()
	 * @model
	 * @generated
	 */
	String getFramerate();

	/**
	 * Sets the value of the '{@link gamamodel.Output#getFramerate <em>Framerate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framerate</em>' attribute.
	 * @see #getFramerate()
	 * @generated
	 */
	void setFramerate(String value);

} // Output
