/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Assignment Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.ResourceAssignmentExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getResourceAssignmentExpression()
 * @model extendedMetaData="name='tResourceAssignmentExpression' kind='elementOnly'"
 * @generated
 */
public interface ResourceAssignmentExpression extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see bpmn2.Bpmn2Package#getResourceAssignmentExpression_Expression()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="kind='element' name='expression' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL' group='http://www.omg.org/spec/BPMN/20100524/MODEL#expression'"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link bpmn2.ResourceAssignmentExpression#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // ResourceAssignmentExpression
