/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmndi.impl;

import bpmndi.BpmndiPackage;
import bpmndi.Label;
import bpmndi.LabeledEdge;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Labeled Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bpmndi.impl.LabeledEdgeImpl#getOwnedLabel <em>Owned Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LabeledEdgeImpl extends EdgeImpl implements LabeledEdge {
	/**
	 * The cached value of the '{@link #getOwnedLabel() <em>Owned Label</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<Label> ownedLabel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabeledEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmndiPackage.Literals.LABELED_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Label> getOwnedLabel() {
		if (ownedLabel == null) {
			ownedLabel = new EObjectResolvingEList<Label>(Label.class, this, BpmndiPackage.LABELED_EDGE__OWNED_LABEL);
		}
		return ownedLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmndiPackage.LABELED_EDGE__OWNED_LABEL:
				return getOwnedLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BpmndiPackage.LABELED_EDGE__OWNED_LABEL:
				return ownedLabel != null && !ownedLabel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LabeledEdgeImpl
