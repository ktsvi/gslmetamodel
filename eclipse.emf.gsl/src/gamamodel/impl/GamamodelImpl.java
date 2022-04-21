/**
 */
package gamamodel.impl;

import gamamodel.ExperimentBlock;
import gamamodel.Gamamodel;
import gamamodel.GamamodelPackage;
import gamamodel.GlobalBlock;
import gamamodel.SpecieBlock;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Gamamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.impl.GamamodelImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link gamamodel.impl.GamamodelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gamamodel.impl.GamamodelImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link gamamodel.impl.GamamodelImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link gamamodel.impl.GamamodelImpl#getCreatedOn <em>Created On</em>}</li>
 *   <li>{@link gamamodel.impl.GamamodelImpl#getContainsglobal <em>Containsglobal</em>}</li>
 *   <li>{@link gamamodel.impl.GamamodelImpl#getContainsspecie <em>Containsspecie</em>}</li>
 *   <li>{@link gamamodel.impl.GamamodelImpl#getContainsexperiment <em>Containsexperiment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GamamodelImpl extends MinimalEObjectImpl.Container implements Gamamodel {
	/**
	 * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected String modelName = MODEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeywords() <em>Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYWORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeywords() <em>Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected String keywords = KEYWORDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = "kts";

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedOn() <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedOn()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedOn() <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedOn()
	 * @generated
	 * @ordered
	 */
	protected Date createdOn = CREATED_ON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainsglobal() <em>Containsglobal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsglobal()
	 * @generated
	 * @ordered
	 */
	protected GlobalBlock containsglobal;

	/**
	 * The cached value of the '{@link #getContainsspecie() <em>Containsspecie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsspecie()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecieBlock> containsspecie;

	/**
	 * The cached value of the '{@link #getContainsexperiment() <em>Containsexperiment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsexperiment()
	 * @generated
	 * @ordered
	 */
	protected EList<ExperimentBlock> containsexperiment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GamamodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamamodelPackage.Literals.GAMAMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModelName() {
		return modelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelName(String newModelName) {
		String oldModelName = modelName;
		modelName = newModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.GAMAMODEL__MODEL_NAME, oldModelName, modelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.GAMAMODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeywords() {
		return keywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeywords(String newKeywords) {
		String oldKeywords = keywords;
		keywords = newKeywords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.GAMAMODEL__KEYWORDS, oldKeywords, keywords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.GAMAMODEL__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedOn() {
		return createdOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedOn(Date newCreatedOn) {
		Date oldCreatedOn = createdOn;
		createdOn = newCreatedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.GAMAMODEL__CREATED_ON, oldCreatedOn, createdOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlobalBlock getContainsglobal() {
		return containsglobal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainsglobal(GlobalBlock newContainsglobal, NotificationChain msgs) {
		GlobalBlock oldContainsglobal = containsglobal;
		containsglobal = newContainsglobal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamamodelPackage.GAMAMODEL__CONTAINSGLOBAL, oldContainsglobal, newContainsglobal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainsglobal(GlobalBlock newContainsglobal) {
		if (newContainsglobal != containsglobal) {
			NotificationChain msgs = null;
			if (containsglobal != null)
				msgs = ((InternalEObject)containsglobal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamamodelPackage.GAMAMODEL__CONTAINSGLOBAL, null, msgs);
			if (newContainsglobal != null)
				msgs = ((InternalEObject)newContainsglobal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamamodelPackage.GAMAMODEL__CONTAINSGLOBAL, null, msgs);
			msgs = basicSetContainsglobal(newContainsglobal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.GAMAMODEL__CONTAINSGLOBAL, newContainsglobal, newContainsglobal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpecieBlock> getContainsspecie() {
		if (containsspecie == null) {
			containsspecie = new EObjectContainmentEList<SpecieBlock>(SpecieBlock.class, this, GamamodelPackage.GAMAMODEL__CONTAINSSPECIE);
		}
		return containsspecie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExperimentBlock> getContainsexperiment() {
		if (containsexperiment == null) {
			containsexperiment = new EObjectContainmentEList<ExperimentBlock>(ExperimentBlock.class, this, GamamodelPackage.GAMAMODEL__CONTAINSEXPERIMENT);
		}
		return containsexperiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamamodelPackage.GAMAMODEL__CONTAINSGLOBAL:
				return basicSetContainsglobal(null, msgs);
			case GamamodelPackage.GAMAMODEL__CONTAINSSPECIE:
				return ((InternalEList<?>)getContainsspecie()).basicRemove(otherEnd, msgs);
			case GamamodelPackage.GAMAMODEL__CONTAINSEXPERIMENT:
				return ((InternalEList<?>)getContainsexperiment()).basicRemove(otherEnd, msgs);
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
			case GamamodelPackage.GAMAMODEL__MODEL_NAME:
				return getModelName();
			case GamamodelPackage.GAMAMODEL__DESCRIPTION:
				return getDescription();
			case GamamodelPackage.GAMAMODEL__KEYWORDS:
				return getKeywords();
			case GamamodelPackage.GAMAMODEL__AUTHOR:
				return getAuthor();
			case GamamodelPackage.GAMAMODEL__CREATED_ON:
				return getCreatedOn();
			case GamamodelPackage.GAMAMODEL__CONTAINSGLOBAL:
				return getContainsglobal();
			case GamamodelPackage.GAMAMODEL__CONTAINSSPECIE:
				return getContainsspecie();
			case GamamodelPackage.GAMAMODEL__CONTAINSEXPERIMENT:
				return getContainsexperiment();
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
			case GamamodelPackage.GAMAMODEL__MODEL_NAME:
				setModelName((String)newValue);
				return;
			case GamamodelPackage.GAMAMODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GamamodelPackage.GAMAMODEL__KEYWORDS:
				setKeywords((String)newValue);
				return;
			case GamamodelPackage.GAMAMODEL__AUTHOR:
				setAuthor((String)newValue);
				return;
			case GamamodelPackage.GAMAMODEL__CREATED_ON:
				setCreatedOn((Date)newValue);
				return;
			case GamamodelPackage.GAMAMODEL__CONTAINSGLOBAL:
				setContainsglobal((GlobalBlock)newValue);
				return;
			case GamamodelPackage.GAMAMODEL__CONTAINSSPECIE:
				getContainsspecie().clear();
				getContainsspecie().addAll((Collection<? extends SpecieBlock>)newValue);
				return;
			case GamamodelPackage.GAMAMODEL__CONTAINSEXPERIMENT:
				getContainsexperiment().clear();
				getContainsexperiment().addAll((Collection<? extends ExperimentBlock>)newValue);
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
			case GamamodelPackage.GAMAMODEL__MODEL_NAME:
				setModelName(MODEL_NAME_EDEFAULT);
				return;
			case GamamodelPackage.GAMAMODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GamamodelPackage.GAMAMODEL__KEYWORDS:
				setKeywords(KEYWORDS_EDEFAULT);
				return;
			case GamamodelPackage.GAMAMODEL__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case GamamodelPackage.GAMAMODEL__CREATED_ON:
				setCreatedOn(CREATED_ON_EDEFAULT);
				return;
			case GamamodelPackage.GAMAMODEL__CONTAINSGLOBAL:
				setContainsglobal((GlobalBlock)null);
				return;
			case GamamodelPackage.GAMAMODEL__CONTAINSSPECIE:
				getContainsspecie().clear();
				return;
			case GamamodelPackage.GAMAMODEL__CONTAINSEXPERIMENT:
				getContainsexperiment().clear();
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
			case GamamodelPackage.GAMAMODEL__MODEL_NAME:
				return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
			case GamamodelPackage.GAMAMODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GamamodelPackage.GAMAMODEL__KEYWORDS:
				return KEYWORDS_EDEFAULT == null ? keywords != null : !KEYWORDS_EDEFAULT.equals(keywords);
			case GamamodelPackage.GAMAMODEL__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case GamamodelPackage.GAMAMODEL__CREATED_ON:
				return CREATED_ON_EDEFAULT == null ? createdOn != null : !CREATED_ON_EDEFAULT.equals(createdOn);
			case GamamodelPackage.GAMAMODEL__CONTAINSGLOBAL:
				return containsglobal != null;
			case GamamodelPackage.GAMAMODEL__CONTAINSSPECIE:
				return containsspecie != null && !containsspecie.isEmpty();
			case GamamodelPackage.GAMAMODEL__CONTAINSEXPERIMENT:
				return containsexperiment != null && !containsexperiment.isEmpty();
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
		result.append(" (modelName: ");
		result.append(modelName);
		result.append(", description: ");
		result.append(description);
		result.append(", keywords: ");
		result.append(keywords);
		result.append(", author: ");
		result.append(author);
		result.append(", createdOn: ");
		result.append(createdOn);
		result.append(')');
		return result.toString();
	}

} //GamamodelImpl
