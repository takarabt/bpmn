/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.MessageEventDefinition#getOperationRef <em>Operation Ref</em>}</li>
 *   <li>{@link bpmn2.MessageEventDefinition#getMessageRef <em>Message Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getMessageEventDefinition()
 * @model extendedMetaData="name='tMessageEventDefinition' kind='elementOnly'"
 * @generated
 */
public interface MessageEventDefinition extends EventDefinition {
	/**
	 * Returns the value of the '<em><b>Operation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Ref</em>' reference.
	 * @see #setOperationRef(Operation)
	 * @see bpmn2.Bpmn2Package#getMessageEventDefinition_OperationRef()
	 * @model ordered="false"
	 *        extendedMetaData="kind='element' name='operationRef' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	Operation getOperationRef();

	/**
	 * Sets the value of the '{@link bpmn2.MessageEventDefinition#getOperationRef <em>Operation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Ref</em>' reference.
	 * @see #getOperationRef()
	 * @generated
	 */
	void setOperationRef(Operation value);

	/**
	 * Returns the value of the '<em><b>Message Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Ref</em>' reference.
	 * @see #setMessageRef(Message)
	 * @see bpmn2.Bpmn2Package#getMessageEventDefinition_MessageRef()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='messageRef'"
	 * @generated
	 */
	Message getMessageRef();

	/**
	 * Sets the value of the '{@link bpmn2.MessageEventDefinition#getMessageRef <em>Message Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Ref</em>' reference.
	 * @see #getMessageRef()
	 * @generated
	 */
	void setMessageRef(Message value);

} // MessageEventDefinition
