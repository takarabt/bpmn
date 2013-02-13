/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2.tests;

import bpmn2.Bpmn2Factory;
import bpmn2.Participant;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Participant</b></em>'.
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
public class ParticipantTest extends BaseElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParticipantTest.class);
	}

	/**
	 * Constructs a new Participant test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Participant test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Participant getFixture() {
		return (Participant)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Bpmn2Factory.eINSTANCE.createParticipant());
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

} //ParticipantTest
