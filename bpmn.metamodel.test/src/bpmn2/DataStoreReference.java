/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Store Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmn2.DataStoreReference#getDataStoreRef <em>Data Store Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmn2.Bpmn2Package#getDataStoreReference()
 * @model extendedMetaData="name='tDataStoreReference' kind='elementOnly'"
 * @generated
 */
public interface DataStoreReference extends FlowElement, ItemAwareElement {
	/**
	 * Returns the value of the '<em><b>Data Store Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Store Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Store Ref</em>' reference.
	 * @see #setDataStoreRef(DataStore)
	 * @see bpmn2.Bpmn2Package#getDataStoreReference_DataStoreRef()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='dataStoreRef'"
	 * @generated
	 */
	DataStore getDataStoreRef();

	/**
	 * Sets the value of the '{@link bpmn2.DataStoreReference#getDataStoreRef <em>Data Store Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Store Ref</em>' reference.
	 * @see #getDataStoreRef()
	 * @generated
	 */
	void setDataStoreRef(DataStore value);

} // DataStoreReference
