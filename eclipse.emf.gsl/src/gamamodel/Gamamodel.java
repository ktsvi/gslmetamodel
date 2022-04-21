/**
 */
package gamamodel;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gamamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.Gamamodel#getModelName <em>Model Name</em>}</li>
 *   <li>{@link gamamodel.Gamamodel#getDescription <em>Description</em>}</li>
 *   <li>{@link gamamodel.Gamamodel#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link gamamodel.Gamamodel#getAuthor <em>Author</em>}</li>
 *   <li>{@link gamamodel.Gamamodel#getCreatedOn <em>Created On</em>}</li>
 *   <li>{@link gamamodel.Gamamodel#getContainsglobal <em>Containsglobal</em>}</li>
 *   <li>{@link gamamodel.Gamamodel#getContainsspecie <em>Containsspecie</em>}</li>
 *   <li>{@link gamamodel.Gamamodel#getContainsexperiment <em>Containsexperiment</em>}</li>
 * </ul>
 *
 * @see gamamodel.GamamodelPackage#getGamamodel()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface Gamamodel extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see gamamodel.GamamodelPackage#getGamamodel_ModelName()
	 * @model id="true" transient="true"
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link gamamodel.Gamamodel#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see gamamodel.GamamodelPackage#getGamamodel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link gamamodel.Gamamodel#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' attribute.
	 * @see #setKeywords(String)
	 * @see gamamodel.GamamodelPackage#getGamamodel_Keywords()
	 * @model
	 * @generated
	 */
	String getKeywords();

	/**
	 * Sets the value of the '{@link gamamodel.Gamamodel#getKeywords <em>Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keywords</em>' attribute.
	 * @see #getKeywords()
	 * @generated
	 */
	void setKeywords(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * The default value is <code>"kts"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see gamamodel.GamamodelPackage#getGamamodel_Author()
	 * @model default="kts"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link gamamodel.Gamamodel#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created On</em>' attribute.
	 * @see #setCreatedOn(Date)
	 * @see gamamodel.GamamodelPackage#getGamamodel_CreatedOn()
	 * @model unique="false"
	 * @generated
	 */
	Date getCreatedOn();

	/**
	 * Sets the value of the '{@link gamamodel.Gamamodel#getCreatedOn <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created On</em>' attribute.
	 * @see #getCreatedOn()
	 * @generated
	 */
	void setCreatedOn(Date value);

	/**
	 * Returns the value of the '<em><b>Containsglobal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsglobal</em>' containment reference.
	 * @see #setContainsglobal(GlobalBlock)
	 * @see gamamodel.GamamodelPackage#getGamamodel_Containsglobal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GlobalBlock getContainsglobal();

	/**
	 * Sets the value of the '{@link gamamodel.Gamamodel#getContainsglobal <em>Containsglobal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containsglobal</em>' containment reference.
	 * @see #getContainsglobal()
	 * @generated
	 */
	void setContainsglobal(GlobalBlock value);

	/**
	 * Returns the value of the '<em><b>Containsspecie</b></em>' containment reference list.
	 * The list contents are of type {@link gamamodel.SpecieBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsspecie</em>' containment reference list.
	 * @see gamamodel.GamamodelPackage#getGamamodel_Containsspecie()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SpecieBlock> getContainsspecie();

	/**
	 * Returns the value of the '<em><b>Containsexperiment</b></em>' containment reference list.
	 * The list contents are of type {@link gamamodel.ExperimentBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsexperiment</em>' containment reference list.
	 * @see gamamodel.GamamodelPackage#getGamamodel_Containsexperiment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ExperimentBlock> getContainsexperiment();

} // Gamamodel
