/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.ConditionalEventDefinition#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getConditionalEventDefinition()
 * @model extendedMetaData="name='tConditionalEventDefinition' kind='elementOnly'"
 * @generated
 */
public interface ConditionalEventDefinition extends EventDefinition {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see bpmn2.Bpmn2Package#getConditionalEventDefinition_Condition()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="kind='element' name='condition' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link bpmn2.ConditionalEventDefinition#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

} // ConditionalEventDefinition
