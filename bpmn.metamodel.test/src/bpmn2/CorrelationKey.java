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
 * A representation of the model object '<em><b>Correlation Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.CorrelationKey#getCorrelationPropertyRef <em>Correlation Property Ref</em>}</li>
 *   <li>{@link bpmn2.CorrelationKey#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getCorrelationKey()
 * @model extendedMetaData="name='tCorrelationKey' kind='elementOnly'"
 * @generated
 */
public interface CorrelationKey extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Correlation Property Ref</b></em>' reference list.
	 * The list contents are of type {@link bpmn2.CorrelationProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Property Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Property Ref</em>' reference list.
	 * @see bpmn2.Bpmn2Package#getCorrelationKey_CorrelationPropertyRef()
	 * @model ordered="false"
	 *        extendedMetaData="kind='element' name='correlationPropertyRef' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<CorrelationProperty> getCorrelationPropertyRef();

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
	 * @see bpmn2.Bpmn2Package#getCorrelationKey_Name()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bpmn2.CorrelationKey#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CorrelationKey
