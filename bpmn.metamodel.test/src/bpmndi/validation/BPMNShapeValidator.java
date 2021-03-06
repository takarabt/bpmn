/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmndi.validation;

import bpmn2.BaseElement;

import bpmndi.BPMNLabel;
import bpmndi.BPMNShape;
import bpmndi.ParticipantBandKind;

/**
 * A sample validator interface for {@link bpmndi.BPMNShape}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BPMNShapeValidator {
	boolean validate();

	boolean validateLabel(BPMNLabel value);
	boolean validateBpmnElement(BaseElement value);
	boolean validateChoreographyActivityShape(BPMNShape value);
	boolean validateIsExpanded(boolean value);
	boolean validateIsHorizontal(boolean value);
	boolean validateIsMarkerVisible(boolean value);
	boolean validateIsMessageVisible(boolean value);
	boolean validateParticipantBandKind(ParticipantBandKind value);
}
