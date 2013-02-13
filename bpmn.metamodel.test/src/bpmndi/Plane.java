/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmndi;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmndi.Plane#getPlaneElement <em>Plane Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmndi.BpmndiPackage#getPlane()
 * @model abstract="true"
 *        extendedMetaData="name='Plane' kind='elementOnly'"
 * @generated
 */
public interface Plane extends Node {
	/**
	 * Returns the value of the '<em><b>Plane Element</b></em>' containment reference list.
	 * The list contents are of type {@link bpmndi.DiagramElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plane Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plane Element</em>' containment reference list.
	 * @see bpmndi.BpmndiPackage#getPlane_PlaneElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DiagramElement' namespace='http://www.omg.org/spec/DD/20100524/BPMNDI' group='http://www.omg.org/spec/DD/20100524/BPMNDI#DiagramElement'"
	 * @generated
	 */
	EList<DiagramElement> getPlaneElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * planeElement->forAll(oclIsKindOf(Shape) or oclIsKindOf(Edge))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean plane_element_type(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Plane
