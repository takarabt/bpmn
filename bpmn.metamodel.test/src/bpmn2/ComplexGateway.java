/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.ComplexGateway#getActivationCondition <em>Activation Condition</em>}</li>
 *   <li>{@link bpmn2.ComplexGateway#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getComplexGateway()
 * @model extendedMetaData="name='tComplexGateway' kind='elementOnly'"
 * @generated
 */
public interface ComplexGateway extends Gateway {
	/**
	 * Returns the value of the '<em><b>Activation Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Condition</em>' containment reference.
	 * @see #setActivationCondition(Expression)
	 * @see bpmn2.Bpmn2Package#getComplexGateway_ActivationCondition()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='activationCondition' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	Expression getActivationCondition();

	/**
	 * Sets the value of the '{@link bpmn2.ComplexGateway#getActivationCondition <em>Activation Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Condition</em>' containment reference.
	 * @see #getActivationCondition()
	 * @generated
	 */
	void setActivationCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' reference.
	 * @see #setDefault(SequenceFlow)
	 * @see bpmn2.Bpmn2Package#getComplexGateway_Default()
	 * @model resolveProxies="false" ordered="false"
	 *        extendedMetaData="kind='attribute' name='default'"
	 * @generated
	 */
	SequenceFlow getDefault();

	/**
	 * Sets the value of the '{@link bpmn2.ComplexGateway#getDefault <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(SequenceFlow value);

} // ComplexGateway
