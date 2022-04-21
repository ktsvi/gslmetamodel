/**
 */
package gamamodel.impl;

import gamamodel.GamamodelPackage;
import gamamodel.GlobalBlock;
import gamamodel.GlobalVariable;
import gamamodel.SpatialEntity;

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
 * An implementation of the model object '<em><b>Global Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.impl.GlobalBlockImpl#getId <em>Id</em>}</li>
 *   <li>{@link gamamodel.impl.GlobalBlockImpl#isInit <em>Init</em>}</li>
 *   <li>{@link gamamodel.impl.GlobalBlockImpl#getContainsglobalvariable <em>Containsglobalvariable</em>}</li>
 *   <li>{@link gamamodel.impl.GlobalBlockImpl#getHasspatialentity <em>Hasspatialentity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalBlockImpl extends MinimalEObjectImpl.Container implements GlobalBlock {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInit()
	 * @generated
	 * @ordered
	 */
	protected boolean init = INIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainsglobalvariable() <em>Containsglobalvariable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsglobalvariable()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> containsglobalvariable;

	/**
	 * The cached value of the '{@link #getHasspatialentity() <em>Hasspatialentity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasspatialentity()
	 * @generated
	 * @ordered
	 */
	protected EList<SpatialEntity> hasspatialentity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamamodelPackage.Literals.GLOBAL_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.GLOBAL_BLOCK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInit(boolean newInit) {
		boolean oldInit = init;
		init = newInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.GLOBAL_BLOCK__INIT, oldInit, init));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlobalVariable> getContainsglobalvariable() {
		if (containsglobalvariable == null) {
			containsglobalvariable = new EObjectContainmentEList<GlobalVariable>(GlobalVariable.class, this, GamamodelPackage.GLOBAL_BLOCK__CONTAINSGLOBALVARIABLE);
		}
		return containsglobalvariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpatialEntity> getHasspatialentity() {
		if (hasspatialentity == null) {
			hasspatialentity = new EObjectContainmentEList<SpatialEntity>(SpatialEntity.class, this, GamamodelPackage.GLOBAL_BLOCK__HASSPATIALENTITY);
		}
		return hasspatialentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamamodelPackage.GLOBAL_BLOCK__CONTAINSGLOBALVARIABLE:
				return ((InternalEList<?>)getContainsglobalvariable()).basicRemove(otherEnd, msgs);
			case GamamodelPackage.GLOBAL_BLOCK__HASSPATIALENTITY:
				return ((InternalEList<?>)getHasspatialentity()).basicRemove(otherEnd, msgs);
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
			case GamamodelPackage.GLOBAL_BLOCK__ID:
				return getId();
			case GamamodelPackage.GLOBAL_BLOCK__INIT:
				return isInit();
			case GamamodelPackage.GLOBAL_BLOCK__CONTAINSGLOBALVARIABLE:
				return getContainsglobalvariable();
			case GamamodelPackage.GLOBAL_BLOCK__HASSPATIALENTITY:
				return getHasspatialentity();
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
			case GamamodelPackage.GLOBAL_BLOCK__ID:
				setId((Integer)newValue);
				return;
			case GamamodelPackage.GLOBAL_BLOCK__INIT:
				setInit((Boolean)newValue);
				return;
			case GamamodelPackage.GLOBAL_BLOCK__CONTAINSGLOBALVARIABLE:
				getContainsglobalvariable().clear();
				getContainsglobalvariable().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case GamamodelPackage.GLOBAL_BLOCK__HASSPATIALENTITY:
				getHasspatialentity().clear();
				getHasspatialentity().addAll((Collection<? extends SpatialEntity>)newValue);
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
			case GamamodelPackage.GLOBAL_BLOCK__ID:
				setId(ID_EDEFAULT);
				return;
			case GamamodelPackage.GLOBAL_BLOCK__INIT:
				setInit(INIT_EDEFAULT);
				return;
			case GamamodelPackage.GLOBAL_BLOCK__CONTAINSGLOBALVARIABLE:
				getContainsglobalvariable().clear();
				return;
			case GamamodelPackage.GLOBAL_BLOCK__HASSPATIALENTITY:
				getHasspatialentity().clear();
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
			case GamamodelPackage.GLOBAL_BLOCK__ID:
				return id != ID_EDEFAULT;
			case GamamodelPackage.GLOBAL_BLOCK__INIT:
				return init != INIT_EDEFAULT;
			case GamamodelPackage.GLOBAL_BLOCK__CONTAINSGLOBALVARIABLE:
				return containsglobalvariable != null && !containsglobalvariable.isEmpty();
			case GamamodelPackage.GLOBAL_BLOCK__HASSPATIALENTITY:
				return hasspatialentity != null && !hasspatialentity.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", init: ");
		result.append(init);
		result.append(')');
		return result.toString();
	}

} //GlobalBlockImpl
