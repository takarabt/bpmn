/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2.tests;

import bpmn2.Bpmn2Factory;
import bpmn2.DataOutputAssociation;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Output Association</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataOutputAssociationTest extends DataAssociationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataOutputAssociationTest.class);
	}

	/**
	 * Constructs a new Data Output Association test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOutputAssociationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Output Association test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataOutputAssociation getFixture() {
		return (DataOutputAssociation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Bpmn2Factory.eINSTANCE.createDataOutputAssociation());
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

} //DataOutputAssociationTest
