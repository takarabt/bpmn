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
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.Event#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getEvent()
 * @model abstract="true"
 *        extendedMetaData="name='tEvent' kind='elementOnly'"
 * @generated
 */
public interface Event extends FlowNode, InteractionNode {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn2.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see bpmn2.Bpmn2Package#getEvent_Properties()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='property' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<Property> getProperties();

} // Event
