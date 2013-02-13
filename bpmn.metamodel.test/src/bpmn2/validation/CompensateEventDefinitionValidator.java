/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2.validation;

import bpmn2.Activity;

/**
 * A sample validator interface for {@link bpmn2.CompensateEventDefinition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CompensateEventDefinitionValidator {
	boolean validate();

	boolean validateActivityRef(Activity value);
	boolean validateWaitForCompletion(boolean value);
}
