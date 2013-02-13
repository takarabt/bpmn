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
 * A representation of the model object '<em><b>Global Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.GlobalTask#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getGlobalTask()
 * @model extendedMetaData="name='tGlobalTask' kind='elementOnly'"
 * @generated
 */
public interface GlobalTask extends CallableElement {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn2.ResourceRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see bpmn2.Bpmn2Package#getGlobalTask_Resources()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='resourceRole' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL' group='http://www.omg.org/spec/BPMN/20100524/MODEL#resourceRole'"
	 * @generated
	 */
	EList<ResourceRole> getResources();

} // GlobalTask
