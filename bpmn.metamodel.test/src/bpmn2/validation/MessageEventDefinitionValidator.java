/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2.validation;

import bpmn2.Message;
import bpmn2.Operation;

/**
 * A sample validator interface for {@link bpmn2.MessageEventDefinition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MessageEventDefinitionValidator {
	boolean validate();

	boolean validateOperationRef(Operation value);
	boolean validateMessageRef(Message value);
}
