/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2.tests;

import bpmn2.Bpmn2Factory;
import bpmn2.ConversationNode;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Conversation Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link bpmn2.InteractionNode#getIncomingConversationLinks() <em>Incoming Conversation Links</em>}</li>
 *   <li>{@link bpmn2.InteractionNode#getOutgoingConversationLinks() <em>Outgoing Conversation Links</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ConversationNodeTest extends BaseElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConversationNodeTest.class);
	}

	/**
	 * Constructs a new Conversation Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Conversation Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConversationNode getFixture() {
		return (ConversationNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Bpmn2Factory.eINSTANCE.createConversationNode());
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

	/**
	 * Tests the '{@link bpmn2.InteractionNode#getIncomingConversationLinks() <em>Incoming Conversation Links</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn2.InteractionNode#getIncomingConversationLinks()
	 * @generated
	 */
	public void testGetIncomingConversationLinks() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link bpmn2.InteractionNode#getOutgoingConversationLinks() <em>Outgoing Conversation Links</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bpmn2.InteractionNode#getOutgoingConversationLinks()
	 * @generated
	 */
	public void testGetOutgoingConversationLinks() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ConversationNodeTest
