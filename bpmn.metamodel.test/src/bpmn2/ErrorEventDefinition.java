/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.ErrorEventDefinition#getErrorRef <em>Error Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getErrorEventDefinition()
 * @model extendedMetaData="name='tErrorEventDefinition' kind='elementOnly'"
 * @generated
 */
public interface ErrorEventDefinition extends EventDefinition {
	/**
	 * Returns the value of the '<em><b>Error Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Ref</em>' reference.
	 * @see #setErrorRef(bpmn2.Error)
	 * @see bpmn2.Bpmn2Package#getErrorEventDefinition_ErrorRef()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='errorRef'"
	 * @generated
	 */
	bpmn2.Error getErrorRef();

	/**
	 * Sets the value of the '{@link bpmn2.ErrorEventDefinition#getErrorRef <em>Error Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Ref</em>' reference.
	 * @see #getErrorRef()
	 * @generated
	 */
	void setErrorRef(bpmn2.Error value);

} // ErrorEventDefinition
