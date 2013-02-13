/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2.tests;

import bpmn2.Bpmn2Factory;
import bpmn2.StandardLoopCharacteristics;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Standard Loop Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StandardLoopCharacteristicsTest extends LoopCharacteristicsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StandardLoopCharacteristicsTest.class);
	}

	/**
	 * Constructs a new Standard Loop Characteristics test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardLoopCharacteristicsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Standard Loop Characteristics test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StandardLoopCharacteristics getFixture() {
		return (StandardLoopCharacteristics)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Bpmn2Factory.eINSTANCE.createStandardLoopCharacteristics());
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

} //StandardLoopCharacteristicsTest
