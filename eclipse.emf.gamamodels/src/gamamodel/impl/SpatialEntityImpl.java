/**
 */
package gamamodel.impl;

import gamamodel.GamamodelPackage;
import gamamodel.SpatialEntity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spatial Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.impl.SpatialEntityImpl#getShapeName <em>Shape Name</em>}</li>
 *   <li>{@link gamamodel.impl.SpatialEntityImpl#getShapePath <em>Shape Path</em>}</li>
 *   <li>{@link gamamodel.impl.SpatialEntityImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpatialEntityImpl extends MinimalEObjectImpl.Container implements SpatialEntity {
	/**
	 * The default value of the '{@link #getShapeName() <em>Shape Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHAPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShapeName() <em>Shape Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeName()
	 * @generated
	 * @ordered
	 */
	protected String shapeName = SHAPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getShapePath() <em>Shape Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapePath()
	 * @generated
	 * @ordered
	 */
	protected static final String SHAPE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShapePath() <em>Shape Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapePath()
	 * @generated
	 * @ordered
	 */
	protected String shapePath = SHAPE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "file";

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpatialEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamamodelPackage.Literals.SPATIAL_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShapeName() {
		return shapeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShapeName(String newShapeName) {
		String oldShapeName = shapeName;
		shapeName = newShapeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.SPATIAL_ENTITY__SHAPE_NAME, oldShapeName, shapeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShapePath() {
		return shapePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShapePath(String newShapePath) {
		String oldShapePath = shapePath;
		shapePath = newShapePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.SPATIAL_ENTITY__SHAPE_PATH, oldShapePath, shapePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.SPATIAL_ENTITY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GamamodelPackage.SPATIAL_ENTITY__SHAPE_NAME:
				return getShapeName();
			case GamamodelPackage.SPATIAL_ENTITY__SHAPE_PATH:
				return getShapePath();
			case GamamodelPackage.SPATIAL_ENTITY__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GamamodelPackage.SPATIAL_ENTITY__SHAPE_NAME:
				setShapeName((String)newValue);
				return;
			case GamamodelPackage.SPATIAL_ENTITY__SHAPE_PATH:
				setShapePath((String)newValue);
				return;
			case GamamodelPackage.SPATIAL_ENTITY__TYPE:
				setType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GamamodelPackage.SPATIAL_ENTITY__SHAPE_NAME:
				setShapeName(SHAPE_NAME_EDEFAULT);
				return;
			case GamamodelPackage.SPATIAL_ENTITY__SHAPE_PATH:
				setShapePath(SHAPE_PATH_EDEFAULT);
				return;
			case GamamodelPackage.SPATIAL_ENTITY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GamamodelPackage.SPATIAL_ENTITY__SHAPE_NAME:
				return SHAPE_NAME_EDEFAULT == null ? shapeName != null : !SHAPE_NAME_EDEFAULT.equals(shapeName);
			case GamamodelPackage.SPATIAL_ENTITY__SHAPE_PATH:
				return SHAPE_PATH_EDEFAULT == null ? shapePath != null : !SHAPE_PATH_EDEFAULT.equals(shapePath);
			case GamamodelPackage.SPATIAL_ENTITY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (shapeName: ");
		result.append(shapeName);
		result.append(", shapePath: ");
		result.append(shapePath);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //SpatialEntityImpl
