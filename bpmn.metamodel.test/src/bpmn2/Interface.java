/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.Interface#getOperations <em>Operations</em>}</li>
 *   <li>{@link bpmn2.Interface#getImplementationRef <em>Implementation Ref</em>}</li>
 *   <li>{@link bpmn2.Interface#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getInterface()
 * @model extendedMetaData="name='tInterface' kind='elementOnly'"
 * @generated
 */
public interface Interface extends RootElement {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn2.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see bpmn2.Bpmn2Package#getInterface_Operations()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="kind='element' name='operation' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Implementation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Ref</em>' reference.
	 * @see #setImplementationRef(EObject)
	 * @see bpmn2.Bpmn2Package#getInterface_ImplementationRef()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='implementationRef'"
	 * @generated
	 */
	EObject getImplementationRef();

	/**
	 * Sets the value of the '{@link bpmn2.Interface#getImplementationRef <em>Implementation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Ref</em>' reference.
	 * @see #getImplementationRef()
	 * @generated
	 */
	void setImplementationRef(EObject value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bpmn2.Bpmn2Package#getInterface_Name()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bpmn2.Interface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Interface
