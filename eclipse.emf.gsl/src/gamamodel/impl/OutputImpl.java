/**
 */
package gamamodel.impl;

import gamamodel.Display;
import gamamodel.Exportfile;
import gamamodel.GamamodelPackage;
import gamamodel.Monitor;
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
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gamamodel.impl.OutputImpl#getId <em>Id</em>}</li>
 *   <li>{@link gamamodel.impl.OutputImpl#getHasdisplays <em>Hasdisplays</em>}</li>
 *   <li>{@link gamamodel.impl.OutputImpl#getHasexportfile <em>Hasexportfile</em>}</li>
 *   <li>{@link gamamodel.impl.OutputImpl#getHasmonitor <em>Hasmonitor</em>}</li>
 *   <li>{@link gamamodel.impl.OutputImpl#getOutputName <em>Output Name</em>}</li>
 *   <li>{@link gamamodel.impl.OutputImpl#getFramerate <em>Framerate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputImpl extends MinimalEObjectImpl.Container implements Output {
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
	 * The cached value of the '{@link #getHasdisplays() <em>Hasdisplays</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasdisplays()
	 * @generated
	 * @ordered
	 */
	protected EList<Display> hasdisplays;

	/**
	 * The cached value of the '{@link #getHasexportfile() <em>Hasexportfile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasexportfile()
	 * @generated
	 * @ordered
	 */
	protected EList<Exportfile> hasexportfile;

	/**
	 * The cached value of the '{@link #getHasmonitor() <em>Hasmonitor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasmonitor()
	 * @generated
	 * @ordered
	 */
	protected EList<Monitor> hasmonitor;

	/**
	 * The default value of the '{@link #getOutputName() <em>Output Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputName()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputName() <em>Output Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputName()
	 * @generated
	 * @ordered
	 */
	protected String outputName = OUTPUT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFramerate() <em>Framerate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramerate()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAMERATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFramerate() <em>Framerate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramerate()
	 * @generated
	 * @ordered
	 */
	protected String framerate = FRAMERATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamamodelPackage.Literals.OUTPUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.OUTPUT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Display> getHasdisplays() {
		if (hasdisplays == null) {
			hasdisplays = new EObjectContainmentEList<Display>(Display.class, this, GamamodelPackage.OUTPUT__HASDISPLAYS);
		}
		return hasdisplays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Exportfile> getHasexportfile() {
		if (hasexportfile == null) {
			hasexportfile = new EObjectContainmentEList<Exportfile>(Exportfile.class, this, GamamodelPackage.OUTPUT__HASEXPORTFILE);
		}
		return hasexportfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Monitor> getHasmonitor() {
		if (hasmonitor == null) {
			hasmonitor = new EObjectContainmentEList<Monitor>(Monitor.class, this, GamamodelPackage.OUTPUT__HASMONITOR);
		}
		return hasmonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutputName() {
		return outputName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputName(String newOutputName) {
		String oldOutputName = outputName;
		outputName = newOutputName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.OUTPUT__OUTPUT_NAME, oldOutputName, outputName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFramerate() {
		return framerate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFramerate(String newFramerate) {
		String oldFramerate = framerate;
		framerate = newFramerate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamamodelPackage.OUTPUT__FRAMERATE, oldFramerate, framerate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GamamodelPackage.OUTPUT__HASDISPLAYS:
				return ((InternalEList<?>)getHasdisplays()).basicRemove(otherEnd, msgs);
			case GamamodelPackage.OUTPUT__HASEXPORTFILE:
				return ((InternalEList<?>)getHasexportfile()).basicRemove(otherEnd, msgs);
			case GamamodelPackage.OUTPUT__HASMONITOR:
				return ((InternalEList<?>)getHasmonitor()).basicRemove(otherEnd, msgs);
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
			case GamamodelPackage.OUTPUT__ID:
				return getId();
			case GamamodelPackage.OUTPUT__HASDISPLAYS:
				return getHasdisplays();
			case GamamodelPackage.OUTPUT__HASEXPORTFILE:
				return getHasexportfile();
			case GamamodelPackage.OUTPUT__HASMONITOR:
				return getHasmonitor();
			case GamamodelPackage.OUTPUT__OUTPUT_NAME:
				return getOutputName();
			case GamamodelPackage.OUTPUT__FRAMERATE:
				return getFramerate();
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
			case GamamodelPackage.OUTPUT__ID:
				setId((Integer)newValue);
				return;
			case GamamodelPackage.OUTPUT__HASDISPLAYS:
				getHasdisplays().clear();
				getHasdisplays().addAll((Collection<? extends Display>)newValue);
				return;
			case GamamodelPackage.OUTPUT__HASEXPORTFILE:
				getHasexportfile().clear();
				getHasexportfile().addAll((Collection<? extends Exportfile>)newValue);
				return;
			case GamamodelPackage.OUTPUT__HASMONITOR:
				getHasmonitor().clear();
				getHasmonitor().addAll((Collection<? extends Monitor>)newValue);
				return;
			case GamamodelPackage.OUTPUT__OUTPUT_NAME:
				setOutputName((String)newValue);
				return;
			case GamamodelPackage.OUTPUT__FRAMERATE:
				setFramerate((String)newValue);
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
			case GamamodelPackage.OUTPUT__ID:
				setId(ID_EDEFAULT);
				return;
			case GamamodelPackage.OUTPUT__HASDISPLAYS:
				getHasdisplays().clear();
				return;
			case GamamodelPackage.OUTPUT__HASEXPORTFILE:
				getHasexportfile().clear();
				return;
			case GamamodelPackage.OUTPUT__HASMONITOR:
				getHasmonitor().clear();
				return;
			case GamamodelPackage.OUTPUT__OUTPUT_NAME:
				setOutputName(OUTPUT_NAME_EDEFAULT);
				return;
			case GamamodelPackage.OUTPUT__FRAMERATE:
				setFramerate(FRAMERATE_EDEFAULT);
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
			case GamamodelPackage.OUTPUT__ID:
				return id != ID_EDEFAULT;
			case GamamodelPackage.OUTPUT__HASDISPLAYS:
				return hasdisplays != null && !hasdisplays.isEmpty();
			case GamamodelPackage.OUTPUT__HASEXPORTFILE:
				return hasexportfile != null && !hasexportfile.isEmpty();
			case GamamodelPackage.OUTPUT__HASMONITOR:
				return hasmonitor != null && !hasmonitor.isEmpty();
			case GamamodelPackage.OUTPUT__OUTPUT_NAME:
				return OUTPUT_NAME_EDEFAULT == null ? outputName != null : !OUTPUT_NAME_EDEFAULT.equals(outputName);
			case GamamodelPackage.OUTPUT__FRAMERATE:
				return FRAMERATE_EDEFAULT == null ? framerate != null : !FRAMERATE_EDEFAULT.equals(framerate);
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
		result.append(", outputName: ");
		result.append(outputName);
		result.append(", framerate: ");
		result.append(framerate);
		result.append(')');
		return result.toString();
	}

} //OutputImpl
