/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2.tests;

import bpmn2.Bpmn2Factory;
import bpmn2.SignalEventDefinition;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Signal Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SignalEventDefinitionTest extends EventDefinitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SignalEventDefinitionTest.class);
	}

	/**
	 * Constructs a new Signal Event Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalEventDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Signal Event Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SignalEventDefinition getFixture() {
		return (SignalEventDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Bpmn2Factory.eINSTANCE.createSignalEventDefinition());
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

} //SignalEventDefinitionTest
