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
 * A representation of the model object '<em><b>Data Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.DataInput#getInputSetWithOptional <em>Input Set With Optional</em>}</li>
 *   <li>{@link bpmn2.DataInput#getInputSetWithWhileExecuting <em>Input Set With While Executing</em>}</li>
 *   <li>{@link bpmn2.DataInput#getInputSetRefs <em>Input Set Refs</em>}</li>
 *   <li>{@link bpmn2.DataInput#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link bpmn2.DataInput#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getDataInput()
 * @model extendedMetaData="name='tDataInput' kind='elementOnly'"
 * @generated
 */
public interface DataInput extends ItemAwareElement {
	/**
	 * Returns the value of the '<em><b>Input Set With Optional</b></em>' reference list.
	 * The list contents are of type {@link bpmn2.InputSet}.
	 * It is bidirectional and its opposite is '{@link bpmn2.InputSet#getOptionalInputRefs <em>Optional Input Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Set With Optional</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Set With Optional</em>' reference list.
	 * @see bpmn2.Bpmn2Package#getDataInput_InputSetWithOptional()
	 * @see bpmn2.InputSet#getOptionalInputRefs
	 * @model opposite="optionalInputRefs" transient="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<InputSet> getInputSetWithOptional();

	/**
	 * Returns the value of the '<em><b>Input Set With While Executing</b></em>' reference list.
	 * The list contents are of type {@link bpmn2.InputSet}.
	 * It is bidirectional and its opposite is '{@link bpmn2.InputSet#getWhileExecutingInputRefs <em>While Executing Input Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Set With While Executing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Set With While Executing</em>' reference list.
	 * @see bpmn2.Bpmn2Package#getDataInput_InputSetWithWhileExecuting()
	 * @see bpmn2.InputSet#getWhileExecutingInputRefs
	 * @model opposite="whileExecutingInputRefs" transient="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<InputSet> getInputSetWithWhileExecuting();

	/**
	 * Returns the value of the '<em><b>Input Set Refs</b></em>' reference list.
	 * The list contents are of type {@link bpmn2.InputSet}.
	 * It is bidirectional and its opposite is '{@link bpmn2.InputSet#getDataInputRefs <em>Data Input Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Set Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Set Refs</em>' reference list.
	 * @see bpmn2.Bpmn2Package#getDataInput_InputSetRefs()
	 * @see bpmn2.InputSet#getDataInputRefs
	 * @model opposite="dataInputRefs" required="true" transient="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<InputSet> getInputSetRefs();

	/**
	 * Returns the value of the '<em><b>Is Collection</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Collection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Collection</em>' attribute.
	 * @see #setIsCollection(boolean)
	 * @see bpmn2.Bpmn2Package#getDataInput_IsCollection()
	 * @model default="false" required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='isCollection'"
	 * @generated
	 */
	boolean isIsCollection();

	/**
	 * Sets the value of the '{@link bpmn2.DataInput#isIsCollection <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Collection</em>' attribute.
	 * @see #isIsCollection()
	 * @generated
	 */
	void setIsCollection(boolean value);

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
	 * @see bpmn2.Bpmn2Package#getDataInput_Name()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bpmn2.DataInput#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DataInput
