/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmn2.validation;

import bpmn2.DataInput;
import bpmn2.DataInputAssociation;
import bpmn2.EventDefinition;
import bpmn2.InputSet;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link bpmn2.ThrowEvent}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ThrowEventValidator {
	boolean validate();

	boolean validateDataInputs(EList<DataInput> value);
	boolean validateDataInputAssociation(EList<DataInputAssociation> value);
	boolean validateInputSet(InputSet value);
	boolean validateEventDefinitions(EList<EventDefinition> value);
	boolean validateEventDefinitionRefs(EList<EventDefinition> value);
}