/**
 */
package gamamodel.impl;

import gamamodel.Display;
import gamamodel.GamamodelPackage;
import gamamodel.SpecieBlock;

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
 * An implementation of the model object '<em><b>Display</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.impl.DisplayImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link gamamodel.impl.DisplayImpl#getDisplayType <em>Display Type</em>}</li>
 *   <li>{@link gamamodel.impl.DisplayImpl#getSpecieblock <em>Specieblock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisplayImpl extends MinimalEObjectImpl.Container implements Display {
	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayType() <em>Display Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayType()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayType() <em>Display Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayType()
	 * @generated
	 * @ordered
	 */
	protected String displayType = DISPLAY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecieblock() <em>Specieblock</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecieblock()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecieBlock> specieblock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisplayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamamodelPackage.Literals.DISPLAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.DISPLAY__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisplayType() {
		return displayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayType(String newDisplayType) {
		String oldDisplayType = displayType;
		displayType = newDisplayType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.DISPLAY__DISPLAY_TYPE, oldDisplayType, displayType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpecieBlock> getSpecieblock() {
		if (specieblock == null) {
			specieblock = new EObjectContainmentEList<SpecieBlock>(SpecieBlock.class, this, GamamodelPackage.DISPLAY__SPECIEBLOCK);
		}
		return specieblock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamamodelPackage.DISPLAY__SPECIEBLOCK:
				return ((InternalEList<?>)getSpecieblock()).basicRemove(otherEnd, msgs);
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
			case GamamodelPackage.DISPLAY__DISPLAY_NAME:
				return getDisplayName();
			case GamamodelPackage.DISPLAY__DISPLAY_TYPE:
				return getDisplayType();
			case GamamodelPackage.DISPLAY__SPECIEBLOCK:
				return getSpecieblock();
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
			case GamamodelPackage.DISPLAY__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case GamamodelPackage.DISPLAY__DISPLAY_TYPE:
				setDisplayType((String)newValue);
				return;
			case GamamodelPackage.DISPLAY__SPECIEBLOCK:
				getSpecieblock().clear();
				getSpecieblock().addAll((Collection<? extends SpecieBlock>)newValue);
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
			case GamamodelPackage.DISPLAY__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case GamamodelPackage.DISPLAY__DISPLAY_TYPE:
				setDisplayType(DISPLAY_TYPE_EDEFAULT);
				return;
			case GamamodelPackage.DISPLAY__SPECIEBLOCK:
				getSpecieblock().clear();
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
			case GamamodelPackage.DISPLAY__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case GamamodelPackage.DISPLAY__DISPLAY_TYPE:
				return DISPLAY_TYPE_EDEFAULT == null ? displayType != null : !DISPLAY_TYPE_EDEFAULT.equals(displayType);
			case GamamodelPackage.DISPLAY__SPECIEBLOCK:
				return specieblock != null && !specieblock.isEmpty();
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
		result.append(" (displayName: ");
		result.append(displayName);
		result.append(", displayType: ");
		result.append(displayType);
		result.append(')');
		return result.toString();
	}

} //DisplayImpl
