/**
 */
package gamamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specie Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.SpecieBlock#getSpecieBlockName <em>Specie Block Name</em>}</li>
 *   <li>{@link gamamodel.SpecieBlock#getAspectName <em>Aspect Name</em>}</li>
 *   <li>{@link gamamodel.SpecieBlock#getColor <em>Color</em>}</li>
 *   <li>{@link gamamodel.SpecieBlock#getContainsaction <em>Containsaction</em>}</li>
 *   <li>{@link gamamodel.SpecieBlock#isInitfunction <em>Initfunction</em>}</li>
 *   <li>{@link gamamodel.SpecieBlock#isAspectfunction <em>Aspectfunction</em>}</li>
 *   <li>{@link gamamodel.SpecieBlock#getHaspropertie <em>Haspropertie</em>}</li>
 *   <li>{@link gamamodel.SpecieBlock#getSkillofspecie <em>Skillofspecie</em>}</li>
 * </ul>
 *
 * @see gamamodel.GamamodelPackage#getSpecieBlock()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface SpecieBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Specie Block Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specie Block Name</em>' attribute.
	 * @see #setSpecieBlockName(String)
	 * @see gamamodel.GamamodelPackage#getSpecieBlock_SpecieBlockName()
	 * @model id="true"
	 * @generated
	 */
	String getSpecieBlockName();

	/**
	 * Sets the value of the '{@link gamamodel.SpecieBlock#getSpecieBlockName <em>Specie Block Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specie Block Name</em>' attribute.
	 * @see #getSpecieBlockName()
	 * @generated
	 */
	void setSpecieBlockName(String value);

	/**
	 * Returns the value of the '<em><b>Aspect Name</b></em>' attribute.
	 * The default value is <code>"sphere"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspect Name</em>' attribute.
	 * @see #setAspectName(String)
	 * @see gamamodel.GamamodelPackage#getSpecieBlock_AspectName()
	 * @model default="sphere"
	 * @generated
	 */
	String getAspectName();

	/**
	 * Sets the value of the '{@link gamamodel.SpecieBlock#getAspectName <em>Aspect Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspect Name</em>' attribute.
	 * @see #getAspectName()
	 * @generated
	 */
	void setAspectName(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see gamamodel.GamamodelPackage#getSpecieBlock_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link gamamodel.SpecieBlock#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Containsaction</b></em>' containment reference list.
	 * The list contents are of type {@link gamamodel.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsaction</em>' containment reference list.
	 * @see gamamodel.GamamodelPackage#getSpecieBlock_Containsaction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Action> getContainsaction();

	/**
	 * Returns the value of the '<em><b>Initfunction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initfunction</em>' attribute.
	 * @see #setInitfunction(boolean)
	 * @see gamamodel.GamamodelPackage#getSpecieBlock_Initfunction()
	 * @model
	 * @generated
	 */
	boolean isInitfunction();

	/**
	 * Sets the value of the '{@link gamamodel.SpecieBlock#isInitfunction <em>Initfunction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initfunction</em>' attribute.
	 * @see #isInitfunction()
	 * @generated
	 */
	void setInitfunction(boolean value);

	/**
	 * Returns the value of the '<em><b>Aspectfunction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspectfunction</em>' attribute.
	 * @see #setAspectfunction(boolean)
	 * @see gamamodel.GamamodelPackage#getSpecieBlock_Aspectfunction()
	 * @model
	 * @generated
	 */
	boolean isAspectfunction();

	/**
	 * Sets the value of the '{@link gamamodel.SpecieBlock#isAspectfunction <em>Aspectfunction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspectfunction</em>' attribute.
	 * @see #isAspectfunction()
	 * @generated
	 */
	void setAspectfunction(boolean value);

	/**
	 * Returns the value of the '<em><b>Haspropertie</b></em>' containment reference list.
	 * The list contents are of type {@link gamamodel.Propertie}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Haspropertie</em>' containment reference list.
	 * @see gamamodel.GamamodelPackage#getSpecieBlock_Haspropertie()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Propertie> getHaspropertie();

	/**
	 * Returns the value of the '<em><b>Skillofspecie</b></em>' attribute.
	 * The default value is <code>"moving"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skillofspecie</em>' attribute.
	 * @see #setSkillofspecie(String)
	 * @see gamamodel.GamamodelPackage#getSpecieBlock_Skillofspecie()
	 * @model default="moving" unique="false"
	 * @generated
	 */
	String getSkillofspecie();

	/**
	 * Sets the value of the '{@link gamamodel.SpecieBlock#getSkillofspecie <em>Skillofspecie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skillofspecie</em>' attribute.
	 * @see #getSkillofspecie()
	 * @generated
	 */
	void setSkillofspecie(String value);

} // SpecieBlock
