/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2.provider;


import bpmn2.Bpmn2Factory;
import bpmn2.Bpmn2Package;
import bpmn2.InputOutputSpecification;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link bpmn2.InputOutputSpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InputOutputSpecificationItemProvider
	extends BaseElementItemProvider
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
	public InputOutputSpecificationItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getInputOutputSpecification_DataInputs());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getInputOutputSpecification_DataOutputs());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getInputOutputSpecification_InputSets());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getInputOutputSpecification_OutputSets());
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
	 * This returns InputOutputSpecification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InputOutputSpecification"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((InputOutputSpecification)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_InputOutputSpecification_type") :
			getString("_UI_InputOutputSpecification_type") + " " + label;
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

		switch (notification.getFeatureID(InputOutputSpecification.class)) {
			case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_INPUTS:
			case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUTS:
			case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__INPUT_SETS:
			case Bpmn2Package.INPUT_OUTPUT_SPECIFICATION__OUTPUT_SETS:
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
				(Bpmn2Package.eINSTANCE.getInputOutputSpecification_DataInputs(),
				 Bpmn2Factory.eINSTANCE.createDataInput()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getInputOutputSpecification_DataOutputs(),
				 Bpmn2Factory.eINSTANCE.createDataOutput()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getInputOutputSpecification_InputSets(),
				 Bpmn2Factory.eINSTANCE.createInputSet()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getInputOutputSpecification_OutputSets(),
				 Bpmn2Factory.eINSTANCE.createOutputSet()));
	}

}
