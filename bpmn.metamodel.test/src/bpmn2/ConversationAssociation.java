/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversation Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.ConversationAssociation#getInnerConversationNodeRef <em>Inner Conversation Node Ref</em>}</li>
 *   <li>{@link bpmn2.ConversationAssociation#getOuterConversationNodeRef <em>Outer Conversation Node Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getConversationAssociation()
 * @model extendedMetaData="name='tConversationAssociation' kind='elementOnly'"
 * @generated
 */
public interface ConversationAssociation extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Inner Conversation Node Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Conversation Node Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Conversation Node Ref</em>' reference.
	 * @see #setInnerConversationNodeRef(ConversationNode)
	 * @see bpmn2.Bpmn2Package#getConversationAssociation_InnerConversationNodeRef()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='innerConversationNodeRef'"
	 * @generated
	 */
	ConversationNode getInnerConversationNodeRef();

	/**
	 * Sets the value of the '{@link bpmn2.ConversationAssociation#getInnerConversationNodeRef <em>Inner Conversation Node Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Conversation Node Ref</em>' reference.
	 * @see #getInnerConversationNodeRef()
	 * @generated
	 */
	void setInnerConversationNodeRef(ConversationNode value);

	/**
	 * Returns the value of the '<em><b>Outer Conversation Node Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Conversation Node Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Conversation Node Ref</em>' reference.
	 * @see #setOuterConversationNodeRef(ConversationNode)
	 * @see bpmn2.Bpmn2Package#getConversationAssociation_OuterConversationNodeRef()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='outerConversationNodeRef'"
	 * @generated
	 */
	ConversationNode getOuterConversationNodeRef();

	/**
	 * Sets the value of the '{@link bpmn2.ConversationAssociation#getOuterConversationNodeRef <em>Outer Conversation Node Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Conversation Node Ref</em>' reference.
	 * @see #getOuterConversationNodeRef()
	 * @generated
	 */
	void setOuterConversationNodeRef(ConversationNode value);

} // ConversationAssociation
