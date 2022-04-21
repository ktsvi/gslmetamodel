/**
 */
package gamamodel.impl;

import gamamodel.GamamodelPackage;
import gamamodel.Inspector;
import gamamodel.Output;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inspector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.impl.InspectorImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link gamamodel.impl.InspectorImpl#getSpecieValue <em>Specie Value</em>}</li>
 *   <li>{@link gamamodel.impl.InspectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link gamamodel.impl.InspectorImpl#getHasinspector <em>Hasinspector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InspectorImpl extends MinimalEObjectImpl.Container implements Inspector {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpecieValue() <em>Specie Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecieValue()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecieValue() <em>Specie Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecieValue()
	 * @generated
	 * @ordered
	 */
	protected String specieValue = SPECIE_VALUE_EDEFAULT;

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
	 * The cached value of the '{@link #getHasinspector() <em>Hasinspector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasinspector()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> hasinspector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InspectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamamodelPackage.Literals.INSPECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.INSPECTOR__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecieValue() {
		return specieValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecieValue(String newSpecieValue) {
		String oldSpecieValue = specieValue;
		specieValue = newSpecieValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.INSPECTOR__SPECIE_VALUE, oldSpecieValue, specieValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.INSPECTOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Output> getHasinspector() {
		if (hasinspector == null) {
			hasinspector = new EObjectContainmentEList<Output>(Output.class, this, GamamodelPackage.INSPECTOR__HASINSPECTOR);
		}
		return hasinspector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamamodelPackage.INSPECTOR__HASINSPECTOR:
				return ((InternalEList<?>)getHasinspector()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GamamodelPackage.INSPECTOR__LABEL:
				return getLabel();
			case GamamodelPackage.INSPECTOR__SPECIE_VALUE:
				return getSpecieValue();
			case GamamodelPackage.INSPECTOR__TYPE:
				return getType();
			case GamamodelPackage.INSPECTOR__HASINSPECTOR:
				return getHasinspector();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GamamodelPackage.INSPECTOR__LABEL:
				setLabel((String)newValue);
				return;
			case GamamodelPackage.INSPECTOR__SPECIE_VALUE:
				setSpecieValue((String)newValue);
				return;
			case GamamodelPackage.INSPECTOR__TYPE:
				setType((String)newValue);
				return;
			case GamamodelPackage.INSPECTOR__HASINSPECTOR:
				getHasinspector().clear();
				getHasinspector().addAll((Collection<? extends Output>)newValue);
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
			case GamamodelPackage.INSPECTOR__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case GamamodelPackage.INSPECTOR__SPECIE_VALUE:
				setSpecieValue(SPECIE_VALUE_EDEFAULT);
				return;
			case GamamodelPackage.INSPECTOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GamamodelPackage.INSPECTOR__HASINSPECTOR:
				getHasinspector().clear();
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
			case GamamodelPackage.INSPECTOR__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case GamamodelPackage.INSPECTOR__SPECIE_VALUE:
				return SPECIE_VALUE_EDEFAULT == null ? specieValue != null : !SPECIE_VALUE_EDEFAULT.equals(specieValue);
			case GamamodelPackage.INSPECTOR__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case GamamodelPackage.INSPECTOR__HASINSPECTOR:
				return hasinspector != null && !hasinspector.isEmpty();
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
		result.append(" (label: ");
		result.append(label);
		result.append(", specieValue: ");
		result.append(specieValue);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //InspectorImpl
