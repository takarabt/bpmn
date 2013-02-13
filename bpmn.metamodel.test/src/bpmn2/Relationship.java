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
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.Relationship#getSources <em>Sources</em>}</li>
 *   <li>{@link bpmn2.Relationship#getTargets <em>Targets</em>}</li>
 *   <li>{@link bpmn2.Relationship#getDirection <em>Direction</em>}</li>
 *   <li>{@link bpmn2.Relationship#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getRelationship()
 * @model extendedMetaData="name='tRelationship' kind='elementOnly'"
 * @generated
 */
public interface Relationship extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Sources</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' reference list.
	 * @see bpmn2.Bpmn2Package#getRelationship_Sources()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='element' name='source' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<EObject> getSources();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see bpmn2.Bpmn2Package#getRelationship_Targets()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='element' name='target' namespace='http://www.omg.org/spec/BPMN/20100524/MODEL'"
	 * @generated
	 */
	EList<EObject> getTargets();

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmn2.RelationshipDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see bpmn2.RelationshipDirection
	 * @see #setDirection(RelationshipDirection)
	 * @see bpmn2.Bpmn2Package#getRelationship_Direction()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='direction'"
	 * @generated
	 */
	RelationshipDirection getDirection();

	/**
	 * Sets the value of the '{@link bpmn2.Relationship#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see bpmn2.RelationshipDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(RelationshipDirection value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see bpmn2.Bpmn2Package#getRelationship_Type()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link bpmn2.Relationship#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Relationship
