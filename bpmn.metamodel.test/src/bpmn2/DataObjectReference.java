/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Object Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.DataObjectReference#getDataObjectRef <em>Data Object Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getDataObjectReference()
 * @model extendedMetaData="name='tDataObjectReference' kind='elementOnly'"
 * @generated
 */
public interface DataObjectReference extends FlowElement, ItemAwareElement {
	/**
	 * Returns the value of the '<em><b>Data Object Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Object Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Object Ref</em>' reference.
	 * @see #setDataObjectRef(DataObject)
	 * @see bpmn2.Bpmn2Package#getDataObjectReference_DataObjectRef()
	 * @model resolveProxies="false" required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='dataObjectRef'"
	 * @generated
	 */
	DataObject getDataObjectRef();

	/**
	 * Sets the value of the '{@link bpmn2.DataObjectReference#getDataObjectRef <em>Data Object Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Object Ref</em>' reference.
	 * @see #getDataObjectRef()
	 * @generated
	 */
	void setDataObjectRef(DataObject value);

} // DataObjectReference
