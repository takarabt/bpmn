/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2.tests;

import bpmn2.Bpmn2Factory;
import bpmn2.IntermediateThrowEvent;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Intermediate Throw Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntermediateThrowEventTest extends ThrowEventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntermediateThrowEventTest.class);
	}

	/**
	 * Constructs a new Intermediate Throw Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateThrowEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Intermediate Throw Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntermediateThrowEvent getFixture() {
		return (IntermediateThrowEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent());
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

} //IntermediateThrowEventTest
