/**
 */
package gamamodel.impl;

import gamamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GamamodelFactoryImpl extends EFactoryImpl implements GamamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GamamodelFactory init() {
		try {
			GamamodelFactory theGamamodelFactory = (GamamodelFactory)EPackage.Registry.INSTANCE.getEFactory(GamamodelPackage.eNS_URI);
			if (theGamamodelFactory != null) {
				return theGamamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GamamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GamamodelPackage.ACTION: return createAction();
			case GamamodelPackage.EXPERIMENT_BLOCK: return createExperimentBlock();
			case GamamodelPackage.COMPLEXE_ACTION: return createComplexeAction();
			case GamamodelPackage.GAMAMODEL: return createGamamodel();
			case GamamodelPackage.OUTPUT: return createOutput();
			case GamamodelPackage.REFLEX: return createReflex();
			case GamamodelPackage.SPECIE_BLOCK: return createSpecieBlock();
			case GamamodelPackage.DISPLAY: return createDisplay();
			case GamamodelPackage.GLOBAL_VARIABLE: return createGlobalVariable();
			case GamamodelPackage.GLOBAL_BLOCK: return createGlobalBlock();
			case GamamodelPackage.EXPORTFILE: return createExportfile();
			case GamamodelPackage.PARAMETER: return createParameter();
			case GamamodelPackage.SIMPLE_ACTION: return createsimpleAction();
			case GamamodelPackage.PROPERTIE: return createPropertie();
			case GamamodelPackage.SPATIAL_ENTITY: return createSpatialEntity();
			case GamamodelPackage.INSPECTOR: return createInspector();
			case GamamodelPackage.MONITOR: return createMonitor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentBlock createExperimentBlock() {
		ExperimentBlockImpl experimentBlock = new ExperimentBlockImpl();
		return experimentBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplexeAction createComplexeAction() {
		ComplexeActionImpl complexeAction = new ComplexeActionImpl();
		return complexeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gamamodel createGamamodel() {
		GamamodelImpl gamamodel = new GamamodelImpl();
		return gamamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reflex createReflex() {
		ReflexImpl reflex = new ReflexImpl();
		return reflex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecieBlock createSpecieBlock() {
		SpecieBlockImpl specieBlock = new SpecieBlockImpl();
		return specieBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Display createDisplay() {
		DisplayImpl display = new DisplayImpl();
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlobalVariable createGlobalVariable() {
		GlobalVariableImpl globalVariable = new GlobalVariableImpl();
		return globalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlobalBlock createGlobalBlock() {
		GlobalBlockImpl globalBlock = new GlobalBlockImpl();
		return globalBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Exportfile createExportfile() {
		ExportfileImpl exportfile = new ExportfileImpl();
		return exportfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public simpleAction createsimpleAction() {
		simpleActionImpl simpleAction = new simpleActionImpl();
		return simpleAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Propertie createPropertie() {
		PropertieImpl propertie = new PropertieImpl();
		return propertie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpatialEntity createSpatialEntity() {
		SpatialEntityImpl spatialEntity = new SpatialEntityImpl();
		return spatialEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inspector createInspector() {
		InspectorImpl inspector = new InspectorImpl();
		return inspector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Monitor createMonitor() {
		MonitorImpl monitor = new MonitorImpl();
		return monitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GamamodelPackage getGamamodelPackage() {
		return (GamamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GamamodelPackage getPackage() {
		return GamamodelPackage.eINSTANCE;
	}

} //GamamodelFactoryImpl
