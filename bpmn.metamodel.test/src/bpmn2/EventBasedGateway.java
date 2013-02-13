/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Based Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.EventBasedGateway#getEventGatewayType <em>Event Gateway Type</em>}</li>
 *   <li>{@link bpmn2.EventBasedGateway#isInstantiate <em>Instantiate</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getEventBasedGateway()
 * @model extendedMetaData="name='tEventBasedGateway' kind='elementOnly'"
 * @generated
 */
public interface EventBasedGateway extends Gateway {
	/**
	 * Returns the value of the '<em><b>Event Gateway Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bpmn2.EventBasedGatewayType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Gateway Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Gateway Type</em>' attribute.
	 * @see bpmn2.EventBasedGatewayType
	 * @see #setEventGatewayType(EventBasedGatewayType)
	 * @see bpmn2.Bpmn2Package#getEventBasedGateway_EventGatewayType()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='eventGatewayType'"
	 * @generated
	 */
	EventBasedGatewayType getEventGatewayType();

	/**
	 * Sets the value of the '{@link bpmn2.EventBasedGateway#getEventGatewayType <em>Event Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Gateway Type</em>' attribute.
	 * @see bpmn2.EventBasedGatewayType
	 * @see #getEventGatewayType()
	 * @generated
	 */
	void setEventGatewayType(EventBasedGatewayType value);

	/**
	 * Returns the value of the '<em><b>Instantiate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiate</em>' attribute.
	 * @see #setInstantiate(boolean)
	 * @see bpmn2.Bpmn2Package#getEventBasedGateway_Instantiate()
	 * @model default="false" required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='instantiate'"
	 * @generated
	 */
	boolean isInstantiate();

	/**
	 * Sets the value of the '{@link bpmn2.EventBasedGateway#isInstantiate <em>Instantiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiate</em>' attribute.
	 * @see #isInstantiate()
	 * @generated
	 */
	void setInstantiate(boolean value);

} // EventBasedGateway
