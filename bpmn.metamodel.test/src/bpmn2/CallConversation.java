/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Conversation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.CallConversation#getParticipantAssociations <em>Participant Associations</em>}</li>
 *   <li>{@link bpmn2.CallConversation#getCalledCollaborationRef <em>Called Collaboration Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getCallConversation()
 * @model extendedMetaData="name='tCallConversation' kind='elementOnly'"
 * @generated
 */
public interface CallConversation extends ConversationNode {
	/**
	 * Returns the value of the '<em><b>Participant Associations</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn2.ParticipantAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Associations</em>' containment reference list.
	 * @see bpmn2.Bpmn2Package#getCallConversation_ParticipantAssociations()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='participantAssociation' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<ParticipantAssociation> getParticipantAssociations();

	/**
	 * Returns the value of the '<em><b>Called Collaboration Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called Collaboration Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Collaboration Ref</em>' reference.
	 * @see #setCalledCollaborationRef(Collaboration)
	 * @see bpmn2.Bpmn2Package#getCallConversation_CalledCollaborationRef()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='calledCollaborationRef'"
	 * @generated
	 */
	Collaboration getCalledCollaborationRef();

	/**
	 * Sets the value of the '{@link bpmn2.CallConversation#getCalledCollaborationRef <em>Called Collaboration Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Collaboration Ref</em>' reference.
	 * @see #getCalledCollaborationRef()
	 * @generated
	 */
	void setCalledCollaborationRef(Collaboration value);

} // CallConversation
