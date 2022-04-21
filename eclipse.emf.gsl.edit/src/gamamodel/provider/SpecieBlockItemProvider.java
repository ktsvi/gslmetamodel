/**
 */
package gamamodel.provider;


import gamamodel.GamamodelFactory;
import gamamodel.GamamodelPackage;
import gamamodel.SpecieBlock;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link gamamodel.SpecieBlock} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecieBlockItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecieBlockItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSpecieBlockNamePropertyDescriptor(object);
			addAspectNamePropertyDescriptor(object);
			addColorPropertyDescriptor(object);
			addInitfunctionPropertyDescriptor(object);
			addAspectfunctionPropertyDescriptor(object);
			addSkillofspeciePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Specie Block Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecieBlockNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpecieBlock_specieBlockName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpecieBlock_specieBlockName_feature", "_UI_SpecieBlock_type"),
				 GamamodelPackage.Literals.SPECIE_BLOCK__SPECIE_BLOCK_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aspect Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAspectNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpecieBlock_aspectName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpecieBlock_aspectName_feature", "_UI_SpecieBlock_type"),
				 GamamodelPackage.Literals.SPECIE_BLOCK__ASPECT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpecieBlock_Color_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpecieBlock_Color_feature", "_UI_SpecieBlock_type"),
				 GamamodelPackage.Literals.SPECIE_BLOCK__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initfunction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitfunctionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpecieBlock_initfunction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpecieBlock_initfunction_feature", "_UI_SpecieBlock_type"),
				 GamamodelPackage.Literals.SPECIE_BLOCK__INITFUNCTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aspectfunction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAspectfunctionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpecieBlock_aspectfunction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpecieBlock_aspectfunction_feature", "_UI_SpecieBlock_type"),
				 GamamodelPackage.Literals.SPECIE_BLOCK__ASPECTFUNCTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Skillofspecie feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSkillofspeciePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpecieBlock_skillofspecie_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpecieBlock_skillofspecie_feature", "_UI_SpecieBlock_type"),
				 GamamodelPackage.Literals.SPECIE_BLOCK__SKILLOFSPECIE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GamamodelPackage.Literals.SPECIE_BLOCK__CONTAINSACTION);
			childrenFeatures.add(GamamodelPackage.Literals.SPECIE_BLOCK__HASPROPERTIE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SpecieBlock.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SpecieBlock"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SpecieBlock)object).getSpecieBlockName();
		return label == null || label.length() == 0 ?
			getString("_UI_SpecieBlock_type") :
			getString("_UI_SpecieBlock_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SpecieBlock.class)) {
			case GamamodelPackage.SPECIE_BLOCK__SPECIE_BLOCK_NAME:
			case GamamodelPackage.SPECIE_BLOCK__ASPECT_NAME:
			case GamamodelPackage.SPECIE_BLOCK__COLOR:
			case GamamodelPackage.SPECIE_BLOCK__INITFUNCTION:
			case GamamodelPackage.SPECIE_BLOCK__ASPECTFUNCTION:
			case GamamodelPackage.SPECIE_BLOCK__SKILLOFSPECIE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GamamodelPackage.SPECIE_BLOCK__CONTAINSACTION:
			case GamamodelPackage.SPECIE_BLOCK__HASPROPERTIE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GamamodelPackage.Literals.SPECIE_BLOCK__CONTAINSACTION,
				 GamamodelFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(GamamodelPackage.Literals.SPECIE_BLOCK__CONTAINSACTION,
				 GamamodelFactory.eINSTANCE.createComplexeAction()));

		newChildDescriptors.add
			(createChildParameter
				(GamamodelPackage.Literals.SPECIE_BLOCK__CONTAINSACTION,
				 GamamodelFactory.eINSTANCE.createReflex()));

		newChildDescriptors.add
			(createChildParameter
				(GamamodelPackage.Literals.SPECIE_BLOCK__CONTAINSACTION,
				 GamamodelFactory.eINSTANCE.createsimpleAction()));

		newChildDescriptors.add
			(createChildParameter
				(GamamodelPackage.Literals.SPECIE_BLOCK__HASPROPERTIE,
				 GamamodelFactory.eINSTANCE.createPropertie()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GslEditPlugin.INSTANCE;
	}

}
