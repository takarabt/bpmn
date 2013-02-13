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
 * A representation of the model object '<em><b>Sub Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.SubProcess#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link bpmn2.SubProcess#isTriggeredByEvent <em>Triggered By Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getSubProcess()
 * @model extendedMetaData="name='tSubProcess' kind='elementOnly'"
 * @generated
 */
public interface SubProcess extends Activity, FlowElementsContainer {
	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn2.Artifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts</em>' containment reference list.
	 * @see bpmn2.Bpmn2Package#getSubProcess_Artifacts()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='artifact' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL' group='http://www.omg.org/spec/BPMN/20100524/MODEL#artifact'"
	 * @generated
	 */
	EList<Artifact> getArtifacts();

	/**
	 * Returns the value of the '<em><b>Triggered By Event</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggered By Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggered By Event</em>' attribute.
	 * @see #setTriggeredByEvent(boolean)
	 * @see bpmn2.Bpmn2Package#getSubProcess_TriggeredByEvent()
	 * @model default="false" required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='triggeredByEvent'"
	 * @generated
	 */
	boolean isTriggeredByEvent();

	/**
	 * Sets the value of the '{@link bpmn2.SubProcess#isTriggeredByEvent <em>Triggered By Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggered By Event</em>' attribute.
	 * @see #isTriggeredByEvent()
	 * @generated
	 */
	void setTriggeredByEvent(boolean value);

} // SubProcess
