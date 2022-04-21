/**
 */
package gamamodel.impl;

import gamamodel.Action;
import gamamodel.GamamodelPackage;
import gamamodel.Propertie;
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
 * An implementation of the model object '<em><b>Specie Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.impl.SpecieBlockImpl#getSpecieBlockName <em>Specie Block Name</em>}</li>
 *   <li>{@link gamamodel.impl.SpecieBlockImpl#getAspectName <em>Aspect Name</em>}</li>
 *   <li>{@link gamamodel.impl.SpecieBlockImpl#getColor <em>Color</em>}</li>
 *   <li>{@link gamamodel.impl.SpecieBlockImpl#getContainsaction <em>Containsaction</em>}</li>
 *   <li>{@link gamamodel.impl.SpecieBlockImpl#isInitfunction <em>Initfunction</em>}</li>
 *   <li>{@link gamamodel.impl.SpecieBlockImpl#isAspectfunction <em>Aspectfunction</em>}</li>
 *   <li>{@link gamamodel.impl.SpecieBlockImpl#getHaspropertie <em>Haspropertie</em>}</li>
 *   <li>{@link gamamodel.impl.SpecieBlockImpl#getSkillofspecie <em>Skillofspecie</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecieBlockImpl extends MinimalEObjectImpl.Container implements SpecieBlock {
	/**
	 * The default value of the '{@link #getSpecieBlockName() <em>Specie Block Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecieBlockName()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIE_BLOCK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecieBlockName() <em>Specie Block Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecieBlockName()
	 * @generated
	 * @ordered
	 */
	protected String specieBlockName = SPECIE_BLOCK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAspectName() <em>Aspect Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectName()
	 * @generated
	 * @ordered
	 */
	protected static final String ASPECT_NAME_EDEFAULT = "sphere";

	/**
	 * The cached value of the '{@link #getAspectName() <em>Aspect Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectName()
	 * @generated
	 * @ordered
	 */
	protected String aspectName = ASPECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainsaction() <em>Containsaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsaction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> containsaction;

	/**
	 * The default value of the '{@link #isInitfunction() <em>Initfunction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitfunction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITFUNCTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitfunction() <em>Initfunction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitfunction()
	 * @generated
	 * @ordered
	 */
	protected boolean initfunction = INITFUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isAspectfunction() <em>Aspectfunction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAspectfunction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASPECTFUNCTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAspectfunction() <em>Aspectfunction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAspectfunction()
	 * @generated
	 * @ordered
	 */
	protected boolean aspectfunction = ASPECTFUNCTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHaspropertie() <em>Haspropertie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaspropertie()
	 * @generated
	 * @ordered
	 */
	protected EList<Propertie> haspropertie;

	/**
	 * The default value of the '{@link #getSkillofspecie() <em>Skillofspecie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillofspecie()
	 * @generated
	 * @ordered
	 */
	protected static final String SKILLOFSPECIE_EDEFAULT = "moving";

	/**
	 * The cached value of the '{@link #getSkillofspecie() <em>Skillofspecie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillofspecie()
	 * @generated
	 * @ordered
	 */
	protected String skillofspecie = SKILLOFSPECIE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecieBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamamodelPackage.Literals.SPECIE_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecieBlockName() {
		return specieBlockName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecieBlockName(String newSpecieBlockName) {
		String oldSpecieBlockName = specieBlockName;
		specieBlockName = newSpecieBlockName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.SPECIE_BLOCK__SPECIE_BLOCK_NAME, oldSpecieBlockName, specieBlockName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAspectName() {
		return aspectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAspectName(String newAspectName) {
		String oldAspectName = aspectName;
		aspectName = newAspectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.SPECIE_BLOCK__ASPECT_NAME, oldAspectName, aspectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.SPECIE_BLOCK__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getContainsaction() {
		if (containsaction == null) {
			containsaction = new EObjectContainmentEList<Action>(Action.class, this, GamamodelPackage.SPECIE_BLOCK__CONTAINSACTION);
		}
		return containsaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInitfunction() {
		return initfunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitfunction(boolean newInitfunction) {
		boolean oldInitfunction = initfunction;
		initfunction = newInitfunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.SPECIE_BLOCK__INITFUNCTION, oldInitfunction, initfunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAspectfunction() {
		return aspectfunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAspectfunction(boolean newAspectfunction) {
		boolean oldAspectfunction = aspectfunction;
		aspectfunction = newAspectfunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.SPECIE_BLOCK__ASPECTFUNCTION, oldAspectfunction, aspectfunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Propertie> getHaspropertie() {
		if (haspropertie == null) {
			haspropertie = new EObjectContainmentEList<Propertie>(Propertie.class, this, GamamodelPackage.SPECIE_BLOCK__HASPROPERTIE);
		}
		return haspropertie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSkillofspecie() {
		return skillofspecie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkillofspecie(String newSkillofspecie) {
		String oldSkillofspecie = skillofspecie;
		skillofspecie = newSkillofspecie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.SPECIE_BLOCK__SKILLOFSPECIE, oldSkillofspecie, skillofspecie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamamodelPackage.SPECIE_BLOCK__CONTAINSACTION:
				return ((InternalEList<?>)getContainsaction()).basicRemove(otherEnd, msgs);
			case GamamodelPackage.SPECIE_BLOCK__HASPROPERTIE:
				return ((InternalEList<?>)getHaspropertie()).basicRemove(otherEnd, msgs);
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
			case GamamodelPackage.SPECIE_BLOCK__SPECIE_BLOCK_NAME:
				return getSpecieBlockName();
			case GamamodelPackage.SPECIE_BLOCK__ASPECT_NAME:
				return getAspectName();
			case GamamodelPackage.SPECIE_BLOCK__COLOR:
				return getColor();
			case GamamodelPackage.SPECIE_BLOCK__CONTAINSACTION:
				return getContainsaction();
			case GamamodelPackage.SPECIE_BLOCK__INITFUNCTION:
				return isInitfunction();
			case GamamodelPackage.SPECIE_BLOCK__ASPECTFUNCTION:
				return isAspectfunction();
			case GamamodelPackage.SPECIE_BLOCK__HASPROPERTIE:
				return getHaspropertie();
			case GamamodelPackage.SPECIE_BLOCK__SKILLOFSPECIE:
				return getSkillofspecie();
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
			case GamamodelPackage.SPECIE_BLOCK__SPECIE_BLOCK_NAME:
				setSpecieBlockName((String)newValue);
				return;
			case GamamodelPackage.SPECIE_BLOCK__ASPECT_NAME:
				setAspectName((String)newValue);
				return;
			case GamamodelPackage.SPECIE_BLOCK__COLOR:
				setColor((String)newValue);
				return;
			case GamamodelPackage.SPECIE_BLOCK__CONTAINSACTION:
				getContainsaction().clear();
				getContainsaction().addAll((Collection<? extends Action>)newValue);
				return;
			case GamamodelPackage.SPECIE_BLOCK__INITFUNCTION:
				setInitfunction((Boolean)newValue);
				return;
			case GamamodelPackage.SPECIE_BLOCK__ASPECTFUNCTION:
				setAspectfunction((Boolean)newValue);
				return;
			case GamamodelPackage.SPECIE_BLOCK__HASPROPERTIE:
				getHaspropertie().clear();
				getHaspropertie().addAll((Collection<? extends Propertie>)newValue);
				return;
			case GamamodelPackage.SPECIE_BLOCK__SKILLOFSPECIE:
				setSkillofspecie((String)newValue);
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
			case GamamodelPackage.SPECIE_BLOCK__SPECIE_BLOCK_NAME:
				setSpecieBlockName(SPECIE_BLOCK_NAME_EDEFAULT);
				return;
			case GamamodelPackage.SPECIE_BLOCK__ASPECT_NAME:
				setAspectName(ASPECT_NAME_EDEFAULT);
				return;
			case GamamodelPackage.SPECIE_BLOCK__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case GamamodelPackage.SPECIE_BLOCK__CONTAINSACTION:
				getContainsaction().clear();
				return;
			case GamamodelPackage.SPECIE_BLOCK__INITFUNCTION:
				setInitfunction(INITFUNCTION_EDEFAULT);
				return;
			case GamamodelPackage.SPECIE_BLOCK__ASPECTFUNCTION:
				setAspectfunction(ASPECTFUNCTION_EDEFAULT);
				return;
			case GamamodelPackage.SPECIE_BLOCK__HASPROPERTIE:
				getHaspropertie().clear();
				return;
			case GamamodelPackage.SPECIE_BLOCK__SKILLOFSPECIE:
				setSkillofspecie(SKILLOFSPECIE_EDEFAULT);
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
			case GamamodelPackage.SPECIE_BLOCK__SPECIE_BLOCK_NAME:
				return SPECIE_BLOCK_NAME_EDEFAULT == null ? specieBlockName != null : !SPECIE_BLOCK_NAME_EDEFAULT.equals(specieBlockName);
			case GamamodelPackage.SPECIE_BLOCK__ASPECT_NAME:
				return ASPECT_NAME_EDEFAULT == null ? aspectName != null : !ASPECT_NAME_EDEFAULT.equals(aspectName);
			case GamamodelPackage.SPECIE_BLOCK__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case GamamodelPackage.SPECIE_BLOCK__CONTAINSACTION:
				return containsaction != null && !containsaction.isEmpty();
			case GamamodelPackage.SPECIE_BLOCK__INITFUNCTION:
				return initfunction != INITFUNCTION_EDEFAULT;
			case GamamodelPackage.SPECIE_BLOCK__ASPECTFUNCTION:
				return aspectfunction != ASPECTFUNCTION_EDEFAULT;
			case GamamodelPackage.SPECIE_BLOCK__HASPROPERTIE:
				return haspropertie != null && !haspropertie.isEmpty();
			case GamamodelPackage.SPECIE_BLOCK__SKILLOFSPECIE:
				return SKILLOFSPECIE_EDEFAULT == null ? skillofspecie != null : !SKILLOFSPECIE_EDEFAULT.equals(skillofspecie);
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
		result.append(" (specieBlockName: ");
		result.append(specieBlockName);
		result.append(", aspectName: ");
		result.append(aspectName);
		result.append(", Color: ");
		result.append(color);
		result.append(", initfunction: ");
		result.append(initfunction);
		result.append(", aspectfunction: ");
		result.append(aspectfunction);
		result.append(", skillofspecie: ");
		result.append(skillofspecie);
		result.append(')');
		return result.toString();
	}

} //SpecieBlockImpl
