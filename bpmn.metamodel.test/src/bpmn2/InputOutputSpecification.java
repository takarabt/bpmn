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
 * A representation of the model object '<em><b>Input Output Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.InputOutputSpecification#getDataInputs <em>Data Inputs</em>}</li>
 *   <li>{@link bpmn2.InputOutputSpecification#getDataOutputs <em>Data Outputs</em>}</li>
 *   <li>{@link bpmn2.InputOutputSpecification#getInputSets <em>Input Sets</em>}</li>
 *   <li>{@link bpmn2.InputOutputSpecification#getOutputSets <em>Output Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getInputOutputSpecification()
 * @model extendedMetaData="name='tInputOutputSpecification' kind='elementOnly'"
 * @generated
 */
public interface InputOutputSpecification extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Data Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn2.DataInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Inputs</em>' containment reference list.
	 * @see bpmn2.Bpmn2Package#getInputOutputSpecification_DataInputs()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='dataInput' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<DataInput> getDataInputs();

	/**
	 * Returns the value of the '<em><b>Data Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn2.DataOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Outputs</em>' containment reference list.
	 * @see bpmn2.Bpmn2Package#getInputOutputSpecification_DataOutputs()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='dataOutput' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<DataOutput> getDataOutputs();

	/**
	 * Returns the value of the '<em><b>Input Sets</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn2.InputSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Sets</em>' containment reference list.
	 * @see bpmn2.Bpmn2Package#getInputOutputSpecification_InputSets()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="kind='element' name='inputSet' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<InputSet> getInputSets();

	/**
	 * Returns the value of the '<em><b>Output Sets</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn2.OutputSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Sets</em>' containment reference list.
	 * @see bpmn2.Bpmn2Package#getInputOutputSpecification_OutputSets()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="kind='element' name='outputSet' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<OutputSet> getOutputSets();

} // InputOutputSpecification
