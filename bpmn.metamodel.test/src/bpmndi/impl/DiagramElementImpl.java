/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmndi.impl;

import bpmndi.BpmndiPackage;
import bpmndi.Diagram;
import bpmndi.DiagramElement;
import bpmndi.Style;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bpmndi.impl.DiagramElementImpl#getOwningDiagram <em>Owning Diagram</em>}</li>
 *   <li>{@link bpmndi.impl.DiagramElementImpl#getOwningElement <em>Owning Element</em>}</li>
 *   <li>{@link bpmndi.impl.DiagramElementImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link bpmndi.impl.DiagramElementImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link bpmndi.impl.DiagramElementImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link bpmndi.impl.DiagramElementImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramElementImpl extends EObjectImpl implements DiagramElement {
	/**
	 * The cached value of the '{@link #getOwningDiagram() <em>Owning Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningDiagram()
	 * @generated
	 * @ordered
	 */
	protected Diagram owningDiagram;

	/**
	 * The cached value of the '{@link #getOwningElement() <em>Owning Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningElement()
	 * @generated
	 * @ordered
	 */
	protected DiagramElement owningElement;

	/**
	 * The cached value of the '{@link #getOwnedElement() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<DiagramElement> ownedElement;

	/**
	 * The cached value of the '{@link #getModelElement() <em>Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElement()
	 * @generated
	 * @ordered
	 */
	protected EObject modelElement;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected Style style;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmndiPackage.Literals.DIAGRAM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram getOwningDiagram() {
		return owningDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningDiagram(Diagram newOwningDiagram, NotificationChain msgs) {
		Diagram oldOwningDiagram = owningDiagram;
		owningDiagram = newOwningDiagram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmndiPackage.DIAGRAM_ELEMENT__OWNING_DIAGRAM, oldOwningDiagram, newOwningDiagram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElement getOwningElement() {
		return owningElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningElement(DiagramElement newOwningElement, NotificationChain msgs) {
		DiagramElement oldOwningElement = owningElement;
		owningElement = newOwningElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmndiPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT, oldOwningElement, newOwningElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DiagramElement> getOwnedElement() {
		if (ownedElement == null) {
			ownedElement = new EObjectWithInverseEList<DiagramElement>(DiagramElement.class, this, BpmndiPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT, BpmndiPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT);
		}
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getModelElement() {
		if (modelElement != null && modelElement.eIsProxy()) {
			InternalEObject oldModelElement = (InternalEObject)modelElement;
			modelElement = eResolveProxy(oldModelElement);
			if (modelElement != oldModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmndiPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT, oldModelElement, modelElement));
			}
		}
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetModelElement() {
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Style getStyle() {
		if (style != null && style.eIsProxy()) {
			InternalEObject oldStyle = (InternalEObject)style;
			style = (Style)eResolveProxy(oldStyle);
			if (style != oldStyle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmndiPackage.DIAGRAM_ELEMENT__STYLE, oldStyle, style));
			}
		}
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Style basicGetStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmndiPackage.DIAGRAM_ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpmndiPackage.DIAGRAM_ELEMENT__OWNING_DIAGRAM:
				if (owningDiagram != null)
					msgs = ((InternalEObject)owningDiagram).eInverseRemove(this, BpmndiPackage.DIAGRAM__ROOT_ELEMENT, Diagram.class, msgs);
				return basicSetOwningDiagram((Diagram)otherEnd, msgs);
			case BpmndiPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT:
				if (owningElement != null)
					msgs = ((InternalEObject)owningElement).eInverseRemove(this, BpmndiPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT, DiagramElement.class, msgs);
				return basicSetOwningElement((DiagramElement)otherEnd, msgs);
			case BpmndiPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedElement()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpmndiPackage.DIAGRAM_ELEMENT__OWNING_DIAGRAM:
				return basicSetOwningDiagram(null, msgs);
			case BpmndiPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT:
				return basicSetOwningElement(null, msgs);
			case BpmndiPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT:
				return ((InternalEList<?>)getOwnedElement()).basicRemove(otherEnd, msgs);
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
			case BpmndiPackage.DIAGRAM_ELEMENT__OWNING_DIAGRAM:
				return getOwningDiagram();
			case BpmndiPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT:
				return getOwningElement();
			case BpmndiPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT:
				return getOwnedElement();
			case BpmndiPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT:
				if (resolve) return getModelElement();
				return basicGetModelElement();
			case BpmndiPackage.DIAGRAM_ELEMENT__STYLE:
				if (resolve) return getStyle();
				return basicGetStyle();
			case BpmndiPackage.DIAGRAM_ELEMENT__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BpmndiPackage.DIAGRAM_ELEMENT__ID:
				setId((String)newValue);
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
			case BpmndiPackage.DIAGRAM_ELEMENT__ID:
				setId(ID_EDEFAULT);
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
			case BpmndiPackage.DIAGRAM_ELEMENT__OWNING_DIAGRAM:
				return owningDiagram != null;
			case BpmndiPackage.DIAGRAM_ELEMENT__OWNING_ELEMENT:
				return owningElement != null;
			case BpmndiPackage.DIAGRAM_ELEMENT__OWNED_ELEMENT:
				return ownedElement != null && !ownedElement.isEmpty();
			case BpmndiPackage.DIAGRAM_ELEMENT__MODEL_ELEMENT:
				return modelElement != null;
			case BpmndiPackage.DIAGRAM_ELEMENT__STYLE:
				return style != null;
			case BpmndiPackage.DIAGRAM_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //DiagramElementImpl
