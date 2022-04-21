/**
 */
package gamamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.GlobalBlock#getId <em>Id</em>}</li>
 *   <li>{@link gamamodel.GlobalBlock#isInit <em>Init</em>}</li>
 *   <li>{@link gamamodel.GlobalBlock#getContainsglobalvariable <em>Containsglobalvariable</em>}</li>
 *   <li>{@link gamamodel.GlobalBlock#getHasspatialentity <em>Hasspatialentity</em>}</li>
 * </ul>
 *
 * @see gamamodel.GamamodelPackage#getGlobalBlock()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface GlobalBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see gamamodel.GamamodelPackage#getGlobalBlock_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link gamamodel.GlobalBlock#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' attribute.
	 * @see #setInit(boolean)
	 * @see gamamodel.GamamodelPackage#getGlobalBlock_Init()
	 * @model
	 * @generated
	 */
	boolean isInit();

	/**
	 * Sets the value of the '{@link gamamodel.GlobalBlock#isInit <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' attribute.
	 * @see #isInit()
	 * @generated
	 */
	void setInit(boolean value);

	/**
	 * Returns the value of the '<em><b>Containsglobalvariable</b></em>' containment reference list.
	 * The list contents are of type {@link gamamodel.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsglobalvariable</em>' containment reference list.
	 * @see gamamodel.GamamodelPackage#getGlobalBlock_Containsglobalvariable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GlobalVariable> getContainsglobalvariable();

	/**
	 * Returns the value of the '<em><b>Hasspatialentity</b></em>' containment reference list.
	 * The list contents are of type {@link gamamodel.SpatialEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hasspatialentity</em>' containment reference list.
	 * @see gamamodel.GamamodelPackage#getGlobalBlock_Hasspatialentity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SpatialEntity> getHasspatialentity();

} // GlobalBlock
