/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Aware Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.ItemAwareElement#getDataState <em>Data State</em>}</li>
 *   <li>{@link bpmn2.ItemAwareElement#getItemSubjectRef <em>Item Subject Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getItemAwareElement()
 * @model
 * @generated
 */
public interface ItemAwareElement extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data State</em>' containment reference.
	 * @see #setDataState(DataState)
	 * @see bpmn2.Bpmn2Package#getItemAwareElement_DataState()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='dataState' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	DataState getDataState();

	/**
	 * Sets the value of the '{@link bpmn2.ItemAwareElement#getDataState <em>Data State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data State</em>' containment reference.
	 * @see #getDataState()
	 * @generated
	 */
	void setDataState(DataState value);

	/**
	 * Returns the value of the '<em><b>Item Subject Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Subject Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Subject Ref</em>' reference.
	 * @see #setItemSubjectRef(ItemDefinition)
	 * @see bpmn2.Bpmn2Package#getItemAwareElement_ItemSubjectRef()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='itemSubjectRef'"
	 * @generated
	 */
	ItemDefinition getItemSubjectRef();

	/**
	 * Sets the value of the '{@link bpmn2.ItemAwareElement#getItemSubjectRef <em>Item Subject Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Subject Ref</em>' reference.
	 * @see #getItemSubjectRef()
	 * @generated
	 */
	void setItemSubjectRef(ItemDefinition value);

} // ItemAwareElement
