/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.ParticipantAssociation#getInnerParticipantRef <em>Inner Participant Ref</em>}</li>
 *   <li>{@link bpmn2.ParticipantAssociation#getOuterParticipantRef <em>Outer Participant Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getParticipantAssociation()
 * @model extendedMetaData="name='tParticipantAssociation' kind='elementOnly'"
 * @generated
 */
public interface ParticipantAssociation extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Inner Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Participant Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Participant Ref</em>' reference.
	 * @see #setInnerParticipantRef(Participant)
	 * @see bpmn2.Bpmn2Package#getParticipantAssociation_InnerParticipantRef()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='element' name='innerParticipantRef' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	Participant getInnerParticipantRef();

	/**
	 * Sets the value of the '{@link bpmn2.ParticipantAssociation#getInnerParticipantRef <em>Inner Participant Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Participant Ref</em>' reference.
	 * @see #getInnerParticipantRef()
	 * @generated
	 */
	void setInnerParticipantRef(Participant value);

	/**
	 * Returns the value of the '<em><b>Outer Participant Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Participant Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Participant Ref</em>' reference.
	 * @see #setOuterParticipantRef(Participant)
	 * @see bpmn2.Bpmn2Package#getParticipantAssociation_OuterParticipantRef()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='element' name='outerParticipantRef' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	Participant getOuterParticipantRef();

	/**
	 * Sets the value of the '{@link bpmn2.ParticipantAssociation#getOuterParticipantRef <em>Outer Participant Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Participant Ref</em>' reference.
	 * @see #getOuterParticipantRef()
	 * @generated
	 */
	void setOuterParticipantRef(Participant value);

} // ParticipantAssociation
