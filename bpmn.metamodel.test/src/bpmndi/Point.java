/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmndi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bpmndi.Point#getX <em>X</em>}</li>
 *   <li>{@link bpmndi.Point#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see bpmndi.BpmndiPackage#getPoint()
 * @model extendedMetaData="name='Point' kind='empty'"
 * @generated
 */
public interface Point extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(float)
	 * @see bpmndi.BpmndiPackage#getPoint_X()
	 * @model default="0" required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='x'"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link bpmndi.Point#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(float)
	 * @see bpmndi.BpmndiPackage#getPoint_Y()
	 * @model default="0" required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='y'"
	 * @generated
	 */
	float getY();

	/**
	 * Sets the value of the '{@link bpmndi.Point#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(float value);

} // Point
