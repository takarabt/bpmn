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
 * A representation of the model object '<em><b>Choreography Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.ChoreographyTask#getMessageFlowRef <em>Message Flow Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getChoreographyTask()
 * @model extendedMetaData="name='tChoreographyTask' kind='elementOnly'"
 * @generated
 */
public interface ChoreographyTask extends ChoreographyActivity {
	/**
	 * Returns the value of the '<em><b>Message Flow Ref</b></em>' reference list.
	 * The list contents are of type {@link bpmn2.MessageFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Flow Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Flow Ref</em>' reference list.
	 * @see bpmn2.Bpmn2Package#getChoreographyTask_MessageFlowRef()
	 * @model required="true" upper="2" ordered="false"
	 *        extendedMetaData="kind='element' name='messageFlowRef' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<MessageFlow> getMessageFlowRef();

} // ChoreographyTask
