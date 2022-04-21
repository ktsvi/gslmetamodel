/**
 */
package gamamodel.impl;

import gamamodel.GamamodelPackage;
import gamamodel.Propertie;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Propertie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.impl.PropertieImpl#getPropertieName <em>Propertie Name</em>}</li>
 *   <li>{@link gamamodel.impl.PropertieImpl#getType <em>Type</em>}</li>
 *   <li>{@link gamamodel.impl.PropertieImpl#getInitValue <em>Init Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertieImpl extends MinimalEObjectImpl.Container implements Propertie {
	/**
	 * The default value of the '{@link #getPropertieName() <em>Propertie Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertieName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTIE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertieName() <em>Propertie Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertieName()
	 * @generated
	 * @ordered
	 */
	protected String propertieName = PROPERTIE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

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
	 * The default value of the '{@link #getInitValue() <em>Init Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitValue()
	 * @generated
	 * @ordered
	 */
	protected static final String INIT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitValue() <em>Init Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitValue()
	 * @generated
	 * @ordered
	 */
	protected String initValue = INIT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamamodelPackage.Literals.PROPERTIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPropertieName() {
		return propertieName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertieName(String newPropertieName) {
		String oldPropertieName = propertieName;
		propertieName = newPropertieName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.PROPERTIE__PROPERTIE_NAME, oldPropertieName, propertieName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.PROPERTIE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInitValue() {
		return initValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitValue(String newInitValue) {
		String oldInitValue = initValue;
		initValue = newInitValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.PROPERTIE__INIT_VALUE, oldInitValue, initValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GamamodelPackage.PROPERTIE__PROPERTIE_NAME:
				return getPropertieName();
			case GamamodelPackage.PROPERTIE__TYPE:
				return getType();
			case GamamodelPackage.PROPERTIE__INIT_VALUE:
				return getInitValue();
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
			case GamamodelPackage.PROPERTIE__PROPERTIE_NAME:
				setPropertieName((String)newValue);
				return;
			case GamamodelPackage.PROPERTIE__TYPE:
				setType((String)newValue);
				return;
			case GamamodelPackage.PROPERTIE__INIT_VALUE:
				setInitValue((String)newValue);
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
			case GamamodelPackage.PROPERTIE__PROPERTIE_NAME:
				setPropertieName(PROPERTIE_NAME_EDEFAULT);
				return;
			case GamamodelPackage.PROPERTIE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GamamodelPackage.PROPERTIE__INIT_VALUE:
				setInitValue(INIT_VALUE_EDEFAULT);
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
			case GamamodelPackage.PROPERTIE__PROPERTIE_NAME:
				return PROPERTIE_NAME_EDEFAULT == null ? propertieName != null : !PROPERTIE_NAME_EDEFAULT.equals(propertieName);
			case GamamodelPackage.PROPERTIE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case GamamodelPackage.PROPERTIE__INIT_VALUE:
				return INIT_VALUE_EDEFAULT == null ? initValue != null : !INIT_VALUE_EDEFAULT.equals(initValue);
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
		result.append(" (propertieName: ");
		result.append(propertieName);
		result.append(", type: ");
		result.append(type);
		result.append(", initValue: ");
		result.append(initValue);
		result.append(')');
		return result.toString();
	}

} //PropertieImpl
