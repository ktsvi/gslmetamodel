/**
 */
package gamamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reflex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.Reflex#getId <em>Id</em>}</li>
 *   <li>{@link gamamodel.Reflex#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see gamamodel.GamamodelPackage#getReflex()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface Reflex extends Action {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see gamamodel.GamamodelPackage#getReflex_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link gamamodel.Reflex#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The default value is <code>"id!=nil"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see gamamodel.GamamodelPackage#getReflex_Condition()
	 * @model default="id!=nil" unique="false"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link gamamodel.Reflex#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // Reflex
