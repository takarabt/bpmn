/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmndi.tests;

import bpmndi.BPMNLabel;
import bpmndi.BpmndiFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BPMN Label</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BPMNLabelTest extends LabelTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BPMNLabelTest.class);
	}

	/**
	 * Constructs a new BPMN Label test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNLabelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BPMN Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BPMNLabel getFixture() {
		return (BPMNLabel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BpmndiFactory.eINSTANCE.createBPMNLabel());
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

} //BPMNLabelTest
