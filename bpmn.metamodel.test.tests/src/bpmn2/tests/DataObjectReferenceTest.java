/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2.tests;

import bpmn2.Bpmn2Factory;
import bpmn2.DataObjectReference;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Object Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataObjectReferenceTest extends FlowElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataObjectReferenceTest.class);
	}

	/**
	 * Constructs a new Data Object Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObjectReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Object Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataObjectReference getFixture() {
		return (DataObjectReference)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Bpmn2Factory.eINSTANCE.createDataObjectReference());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DataObjectReferenceTest
