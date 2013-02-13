/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bpmndi.util;

import bpmndi.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see bpmndi.BpmndiPackage
 * @generated
 */
public class BpmndiValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BpmndiValidator INSTANCE = new BpmndiValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "bpmndi";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Plane element type' of 'Plane'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLANE__PLANE_ELEMENT_TYPE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non negative size' of 'Font'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FONT__NON_NEGATIVE_SIZE = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmndiValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return BpmndiPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case BpmndiPackage.DIAGRAM:
				return validateDiagram((Diagram)value, diagnostics, context);
			case BpmndiPackage.DIAGRAM_ELEMENT:
				return validateDiagramElement((DiagramElement)value, diagnostics, context);
			case BpmndiPackage.LABEL:
				return validateLabel((Label)value, diagnostics, context);
			case BpmndiPackage.STYLE:
				return validateStyle((Style)value, diagnostics, context);
			case BpmndiPackage.PLANE:
				return validatePlane((Plane)value, diagnostics, context);
			case BpmndiPackage.BOUNDS:
				return validateBounds((Bounds)value, diagnostics, context);
			case BpmndiPackage.POINT:
				return validatePoint((Point)value, diagnostics, context);
			case BpmndiPackage.FONT:
				return validateFont((Font)value, diagnostics, context);
			case BpmndiPackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case BpmndiPackage.LABELED_SHAPE:
				return validateLabeledShape((LabeledShape)value, diagnostics, context);
			case BpmndiPackage.SHAPE:
				return validateShape((Shape)value, diagnostics, context);
			case BpmndiPackage.LABELED_EDGE:
				return validateLabeledEdge((LabeledEdge)value, diagnostics, context);
			case BpmndiPackage.EDGE:
				return validateEdge((Edge)value, diagnostics, context);
			case BpmndiPackage.BPMN_DIAGRAM:
				return validateBPMNDiagram((BPMNDiagram)value, diagnostics, context);
			case BpmndiPackage.BPMN_EDGE:
				return validateBPMNEdge((BPMNEdge)value, diagnostics, context);
			case BpmndiPackage.BPMN_LABEL:
				return validateBPMNLabel((BPMNLabel)value, diagnostics, context);
			case BpmndiPackage.BPMN_LABEL_STYLE:
				return validateBPMNLabelStyle((BPMNLabelStyle)value, diagnostics, context);
			case BpmndiPackage.BPMN_PLANE:
				return validateBPMNPlane((BPMNPlane)value, diagnostics, context);
			case BpmndiPackage.BPMN_SHAPE:
				return validateBPMNShape((BPMNShape)value, diagnostics, context);
			case BpmndiPackage.MESSAGE_VISIBLE_KIND:
				return validateMessageVisibleKind((MessageVisibleKind)value, diagnostics, context);
			case BpmndiPackage.PARTICIPANT_BAND_KIND:
				return validateParticipantBandKind((ParticipantBandKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagram(Diagram diagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagramElement(DiagramElement diagramElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diagramElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabel(Label label, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(label, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyle(Style style, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(style, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlane(Plane plane, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(plane, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(plane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(plane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(plane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(plane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(plane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(plane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(plane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(plane, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlane_plane_element_type(plane, diagnostics, context);
		return result;
	}

	/**
	 * Validates the plane_element_type constraint of '<em>Plane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlane_plane_element_type(Plane plane, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return plane.plane_element_type(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBounds(Bounds bounds, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bounds, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePoint(Point point, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(point, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFont(Font font, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(font, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(font, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(font, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(font, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(font, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(font, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(font, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(font, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(font, diagnostics, context);
		if (result || diagnostics != null) result &= validateFont_non_negative_size(font, diagnostics, context);
		return result;
	}

	/**
	 * Validates the non_negative_size constraint of '<em>Font</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFont_non_negative_size(Font font, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return font.non_negative_size(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(node, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabeledShape(LabeledShape labeledShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labeledShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShape(Shape shape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabeledEdge(LabeledEdge labeledEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labeledEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdge(Edge edge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(edge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNDiagram(BPMNDiagram bpmnDiagram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bpmnDiagram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNEdge(BPMNEdge bpmnEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bpmnEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNLabel(BPMNLabel bpmnLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bpmnLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNLabelStyle(BPMNLabelStyle bpmnLabelStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bpmnLabelStyle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNPlane(BPMNPlane bpmnPlane, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bpmnPlane, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bpmnPlane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bpmnPlane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bpmnPlane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bpmnPlane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bpmnPlane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bpmnPlane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bpmnPlane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bpmnPlane, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlane_plane_element_type(bpmnPlane, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNShape(BPMNShape bpmnShape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bpmnShape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageVisibleKind(MessageVisibleKind messageVisibleKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantBandKind(ParticipantBandKind participantBandKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //BpmndiValidator
