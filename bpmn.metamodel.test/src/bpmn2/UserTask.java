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
 * A representation of the model object '<em><b>User Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.UserTask#getRenderings <em>Renderings</em>}</li>
 *   <li>{@link bpmn2.UserTask#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getUserTask()
 * @model extendedMetaData="name='tUserTask' kind='elementOnly'"
 * @generated
 */
public interface UserTask extends Task {
	/**
	 * Returns the value of the '<em><b>Renderings</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn2.Rendering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Renderings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renderings</em>' containment reference list.
	 * @see bpmn2.Bpmn2Package#getUserTask_Renderings()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='rendering' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<Rendering> getRenderings();

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' attribute.
	 * @see #setImplementation(String)
	 * @see bpmn2.Bpmn2Package#getUserTask_Implementation()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='implementation'"
	 * @generated
	 */
	String getImplementation();

	/**
	 * Sets the value of the '{@link bpmn2.UserTask#getImplementation <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' attribute.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(String value);

} // UserTask
