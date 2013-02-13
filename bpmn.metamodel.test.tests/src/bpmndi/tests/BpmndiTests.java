/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmndi.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>bpmndi</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class BpmndiTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new BpmndiTests("bpmndi Tests");
		suite.addTestSuite(DiagramElementTest.class);
		suite.addTestSuite(FontTest.class);
		suite.addTestSuite(BPMNDiagramTest.class);
		suite.addTestSuite(BPMNEdgeTest.class);
		suite.addTestSuite(BPMNLabelTest.class);
		suite.addTestSuite(BPMNPlaneTest.class);
		suite.addTestSuite(BPMNShapeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmndiTests(String name) {
		super(name);
	}

} //BpmndiTests
