/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2.provider;


import bpmn2.Bpmn2Factory;
import bpmn2.Bpmn2Package;
import bpmn2.Definitions;

import bpmndi.BpmndiFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link bpmn2.Definitions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DefinitionsItemProvider
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
	public DefinitionsItemProvider(AdapterFactory adapterFactory) {
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

			addExporterPropertyDescriptor(object);
			addExporterVersionPropertyDescriptor(object);
			addExpressionLanguagePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addTargetNamespacePropertyDescriptor(object);
			addTypeLanguagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Exporter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExporterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Definitions_exporter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Definitions_exporter_feature", "_UI_Definitions_type"),
				 Bpmn2Package.eINSTANCE.getDefinitions_Exporter(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exporter Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExporterVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Definitions_exporterVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Definitions_exporterVersion_feature", "_UI_Definitions_type"),
				 Bpmn2Package.eINSTANCE.getDefinitions_ExporterVersion(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Expression Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExpressionLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Definitions_expressionLanguage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Definitions_expressionLanguage_feature", "_UI_Definitions_type"),
				 Bpmn2Package.eINSTANCE.getDefinitions_ExpressionLanguage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Definitions_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Definitions_name_feature", "_UI_Definitions_type"),
				 Bpmn2Package.eINSTANCE.getDefinitions_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Definitions_targetNamespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Definitions_targetNamespace_feature", "_UI_Definitions_type"),
				 Bpmn2Package.eINSTANCE.getDefinitions_TargetNamespace(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Definitions_typeLanguage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Definitions_typeLanguage_feature", "_UI_Definitions_type"),
				 Bpmn2Package.eINSTANCE.getDefinitions_TypeLanguage(),
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
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDefinitions_Imports());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDefinitions_Extensions());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDefinitions_Diagrams());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDefinitions_Relationships());
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
	 * This returns Definitions.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Definitions"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Definitions)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Definitions_type") :
			getString("_UI_Definitions_type") + " " + label;
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

		switch (notification.getFeatureID(Definitions.class)) {
			case Bpmn2Package.DEFINITIONS__EXPORTER:
			case Bpmn2Package.DEFINITIONS__EXPORTER_VERSION:
			case Bpmn2Package.DEFINITIONS__EXPRESSION_LANGUAGE:
			case Bpmn2Package.DEFINITIONS__NAME:
			case Bpmn2Package.DEFINITIONS__TARGET_NAMESPACE:
			case Bpmn2Package.DEFINITIONS__TYPE_LANGUAGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Bpmn2Package.DEFINITIONS__IMPORTS:
			case Bpmn2Package.DEFINITIONS__EXTENSIONS:
			case Bpmn2Package.DEFINITIONS__DIAGRAMS:
			case Bpmn2Package.DEFINITIONS__RELATIONSHIPS:
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
				(Bpmn2Package.eINSTANCE.getDefinitions_Imports(),
				 Bpmn2Factory.eINSTANCE.createImport()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDefinitions_Extensions(),
				 Bpmn2Factory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDefinitions_Diagrams(),
				 BpmndiFactory.eINSTANCE.createBPMNDiagram()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDefinitions_Relationships(),
				 Bpmn2Factory.eINSTANCE.createRelationship()));
	}

}
