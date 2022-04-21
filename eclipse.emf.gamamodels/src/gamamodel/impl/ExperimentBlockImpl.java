/**
 */
package gamamodel.impl;

import gamamodel.ExperimentBlock;
import gamamodel.GamamodelPackage;
import gamamodel.Output;
import gamamodel.Parameter;

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
 * An implementation of the model object '<em><b>Experiment Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.impl.ExperimentBlockImpl#getType <em>Type</em>}</li>
 *   <li>{@link gamamodel.impl.ExperimentBlockImpl#getExperimentName <em>Experiment Name</em>}</li>
 *   <li>{@link gamamodel.impl.ExperimentBlockImpl#getHasparameter <em>Hasparameter</em>}</li>
 *   <li>{@link gamamodel.impl.ExperimentBlockImpl#getHasoutput <em>Hasoutput</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExperimentBlockImpl extends MinimalEObjectImpl.Container implements ExperimentBlock {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "gui";

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
	 * The default value of the '{@link #getExperimentName() <em>Experiment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimentName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPERIMENT_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getExperimentName() <em>Experiment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperimentName()
	 * @generated
	 * @ordered
	 */
	protected String experimentName = EXPERIMENT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasparameter() <em>Hasparameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasparameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> hasparameter;

	/**
	 * The cached value of the '{@link #getHasoutput() <em>Hasoutput</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasoutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> hasoutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamamodelPackage.Literals.EXPERIMENT_BLOCK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.EXPERIMENT_BLOCK__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExperimentName() {
		return experimentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExperimentName(String newExperimentName) {
		String oldExperimentName = experimentName;
		experimentName = newExperimentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.EXPERIMENT_BLOCK__EXPERIMENT_NAME, oldExperimentName, experimentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getHasparameter() {
		if (hasparameter == null) {
			hasparameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, GamamodelPackage.EXPERIMENT_BLOCK__HASPARAMETER);
		}
		return hasparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Output> getHasoutput() {
		if (hasoutput == null) {
			hasoutput = new EObjectContainmentEList<Output>(Output.class, this, GamamodelPackage.EXPERIMENT_BLOCK__HASOUTPUT);
		}
		return hasoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamamodelPackage.EXPERIMENT_BLOCK__HASPARAMETER:
				return ((InternalEList<?>)getHasparameter()).basicRemove(otherEnd, msgs);
			case GamamodelPackage.EXPERIMENT_BLOCK__HASOUTPUT:
				return ((InternalEList<?>)getHasoutput()).basicRemove(otherEnd, msgs);
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
			case GamamodelPackage.EXPERIMENT_BLOCK__TYPE:
				return getType();
			case GamamodelPackage.EXPERIMENT_BLOCK__EXPERIMENT_NAME:
				return getExperimentName();
			case GamamodelPackage.EXPERIMENT_BLOCK__HASPARAMETER:
				return getHasparameter();
			case GamamodelPackage.EXPERIMENT_BLOCK__HASOUTPUT:
				return getHasoutput();
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
			case GamamodelPackage.EXPERIMENT_BLOCK__TYPE:
				setType((String)newValue);
				return;
			case GamamodelPackage.EXPERIMENT_BLOCK__EXPERIMENT_NAME:
				setExperimentName((String)newValue);
				return;
			case GamamodelPackage.EXPERIMENT_BLOCK__HASPARAMETER:
				getHasparameter().clear();
				getHasparameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case GamamodelPackage.EXPERIMENT_BLOCK__HASOUTPUT:
				getHasoutput().clear();
				getHasoutput().addAll((Collection<? extends Output>)newValue);
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
			case GamamodelPackage.EXPERIMENT_BLOCK__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GamamodelPackage.EXPERIMENT_BLOCK__EXPERIMENT_NAME:
				setExperimentName(EXPERIMENT_NAME_EDEFAULT);
				return;
			case GamamodelPackage.EXPERIMENT_BLOCK__HASPARAMETER:
				getHasparameter().clear();
				return;
			case GamamodelPackage.EXPERIMENT_BLOCK__HASOUTPUT:
				getHasoutput().clear();
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
			case GamamodelPackage.EXPERIMENT_BLOCK__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case GamamodelPackage.EXPERIMENT_BLOCK__EXPERIMENT_NAME:
				return EXPERIMENT_NAME_EDEFAULT == null ? experimentName != null : !EXPERIMENT_NAME_EDEFAULT.equals(experimentName);
			case GamamodelPackage.EXPERIMENT_BLOCK__HASPARAMETER:
				return hasparameter != null && !hasparameter.isEmpty();
			case GamamodelPackage.EXPERIMENT_BLOCK__HASOUTPUT:
				return hasoutput != null && !hasoutput.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(", experimentName: ");
		result.append(experimentName);
		result.append(')');
		return result.toString();
	}

} //ExperimentBlockImpl
