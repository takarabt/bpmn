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
 * A representation of the model object '<em><b>Correlation Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.CorrelationProperty#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}</li>
 *   <li>{@link bpmn2.CorrelationProperty#getName <em>Name</em>}</li>
 *   <li>{@link bpmn2.CorrelationProperty#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getCorrelationProperty()
 * @model extendedMetaData="name='tCorrelationProperty' kind='elementOnly'"
 * @generated
 */
public interface CorrelationProperty extends RootElement {
	/**
	 * Returns the value of the '<em><b>Correlation Property Retrieval Expression</b></em>' containment reference list.
	 * The list contents are of type {@link bpmn2.CorrelationPropertyRetrievalExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Property Retrieval Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Property Retrieval Expression</em>' containment reference list.
	 * @see bpmn2.Bpmn2Package#getCorrelationProperty_CorrelationPropertyRetrievalExpression()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="kind='element' name='correlationPropertyRetrievalExpression' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<CorrelationPropertyRetrievalExpression> getCorrelationPropertyRetrievalExpression();

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
	 * @see bpmn2.Bpmn2Package#getCorrelationProperty_Name()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bpmn2.CorrelationProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ItemDefinition)
	 * @see bpmn2.Bpmn2Package#getCorrelationProperty_Type()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	ItemDefinition getType();

	/**
	 * Sets the value of the '{@link bpmn2.CorrelationProperty#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ItemDefinition value);

} // CorrelationProperty
