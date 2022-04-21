/**
 */
package gamamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spatial Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.SpatialEntity#getShapeName <em>Shape Name</em>}</li>
 *   <li>{@link gamamodel.SpatialEntity#getShapePath <em>Shape Path</em>}</li>
 *   <li>{@link gamamodel.SpatialEntity#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see gamamodel.GamamodelPackage#getSpatialEntity()
 * @model
 * @generated
 */
public interface SpatialEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Shape Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Name</em>' attribute.
	 * @see #setShapeName(String)
	 * @see gamamodel.GamamodelPackage#getSpatialEntity_ShapeName()
	 * @model id="true"
	 * @generated
	 */
	String getShapeName();

	/**
	 * Sets the value of the '{@link gamamodel.SpatialEntity#getShapeName <em>Shape Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Name</em>' attribute.
	 * @see #getShapeName()
	 * @generated
	 */
	void setShapeName(String value);

	/**
	 * Returns the value of the '<em><b>Shape Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Path</em>' attribute.
	 * @see #setShapePath(String)
	 * @see gamamodel.GamamodelPackage#getSpatialEntity_ShapePath()
	 * @model
	 * @generated
	 */
	String getShapePath();

	/**
	 * Sets the value of the '{@link gamamodel.SpatialEntity#getShapePath <em>Shape Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Path</em>' attribute.
	 * @see #getShapePath()
	 * @generated
	 */
	void setShapePath(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"file"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see gamamodel.GamamodelPackage#getSpatialEntity_Type()
	 * @model default="file"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link gamamodel.SpatialEntity#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // SpatialEntity
