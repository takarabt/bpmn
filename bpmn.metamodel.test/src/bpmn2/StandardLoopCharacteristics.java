/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Loop Characteristics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.StandardLoopCharacteristics#getLoopCondition <em>Loop Condition</em>}</li>
 *   <li>{@link bpmn2.StandardLoopCharacteristics#getLoopMaximum <em>Loop Maximum</em>}</li>
 *   <li>{@link bpmn2.StandardLoopCharacteristics#isTestBefore <em>Test Before</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getStandardLoopCharacteristics()
 * @model extendedMetaData="name='tStandardLoopCharacteristics' kind='elementOnly'"
 * @generated
 */
public interface StandardLoopCharacteristics extends LoopCharacteristics {
	/**
	 * Returns the value of the '<em><b>Loop Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Condition</em>' containment reference.
	 * @see #setLoopCondition(Expression)
	 * @see bpmn2.Bpmn2Package#getStandardLoopCharacteristics_LoopCondition()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='loopCondition' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	Expression getLoopCondition();

	/**
	 * Sets the value of the '{@link bpmn2.StandardLoopCharacteristics#getLoopCondition <em>Loop Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Condition</em>' containment reference.
	 * @see #getLoopCondition()
	 * @generated
	 */
	void setLoopCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Loop Maximum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Maximum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Maximum</em>' containment reference.
	 * @see #setLoopMaximum(Expression)
	 * @see bpmn2.Bpmn2Package#getStandardLoopCharacteristics_LoopMaximum()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='loopMaximum'"
	 * @generated
	 */
	Expression getLoopMaximum();

	/**
	 * Sets the value of the '{@link bpmn2.StandardLoopCharacteristics#getLoopMaximum <em>Loop Maximum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Maximum</em>' containment reference.
	 * @see #getLoopMaximum()
	 * @generated
	 */
	void setLoopMaximum(Expression value);

	/**
	 * Returns the value of the '<em><b>Test Before</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Before</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Before</em>' attribute.
	 * @see #setTestBefore(boolean)
	 * @see bpmn2.Bpmn2Package#getStandardLoopCharacteristics_TestBefore()
	 * @model default="false" required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='testBefore'"
	 * @generated
	 */
	boolean isTestBefore();

	/**
	 * Sets the value of the '{@link bpmn2.StandardLoopCharacteristics#isTestBefore <em>Test Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Before</em>' attribute.
	 * @see #isTestBefore()
	 * @generated
	 */
	void setTestBefore(boolean value);

} // StandardLoopCharacteristics
