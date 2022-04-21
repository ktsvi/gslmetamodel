/**
 */
package gamamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gamamodel.GamamodelFactory
 * @model kind="package"
 * @generated
 */
public interface GamamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gamamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://GSL/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gamamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GamamodelPackage eINSTANCE = gamamodel.impl.GamamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link gamamodel.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamamodel.impl.ActionImpl
	 * @see gamamodel.impl.GamamodelPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 0;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_NAME = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gamamodel.impl.ExperimentBlockImpl <em>Experiment Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamamodel.impl.ExperimentBlockImpl
	 * @see gamamodel.impl.GamamodelPackageImpl#getExperimentBlock()
	 * @generated
	 */
	int EXPERIMENT_BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_BLOCK__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Experiment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_BLOCK__EXPERIMENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Hasparameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_BLOCK__HASPARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Hasoutput</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_BLOCK__HASOUTPUT = 3;

	/**
	 * The number of structural features of the '<em>Experiment Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_BLOCK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Experiment Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gamamodel.impl.ComplexeActionImpl <em>Complexe Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamamodel.impl.ComplexeActionImpl
	 * @see gamamodel.impl.GamamodelPackageImpl#getComplexeAction()
	 * @generated
	 */
	int COMPLEXE_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEXE_ACTION__ACTION_NAME = ACTION__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEXE_ACTION__ID = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complexe Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEXE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complexe Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEXE_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gamamodel.impl.GamamodelImpl <em>Gamamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamamodel.impl.GamamodelImpl
	 * @see gamamodel.impl.GamamodelPackageImpl#getGamamodel()
	 * @generated
	 */
	int GAMAMODEL = 3;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMAMODEL__MODEL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMAMODEL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMAMODEL__KEYWORDS = 2;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMAMODEL__AUTHOR = 3;

	/**
	 * The feature id for the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMAMODEL__CREATED_ON = 4;

	/**
	 * The feature id for the '<em><b>Containsglobal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMAMODEL__CONTAINSGLOBAL = 5;

	/**
	 * The feature id for the '<em><b>Containsspecie</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMAMODEL__CONTAINSSPECIE = 6;

	/**
	 * The feature id for the '<em><b>Containsexperiment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMAMODEL__CONTAINSEXPERIMENT = 7;

	/**
	 * The number of structural features of the '<em>Gamamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMAMODEL_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Gamamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMAMODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gamamodel.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamamodel.impl.OutputImpl
	 * @see gamamodel.impl.GamamodelPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ID = 0;

	/**
	 * The feature id for the '<em><b>Hasdisplays</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__HASDISPLAYS = 1;

	/**
	 * The feature id for the '<em><b>Hasexportfile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__HASEXPORTFILE = 2;

	/**
	 * The feature id for the '<em><b>Hasmonitor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__HASMONITOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = 4;

	/**
	 * The feature id for the '<em><b>Framerate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__FRAMERATE = 5;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gamamodel.impl.ReflexImpl <em>Reflex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamamodel.impl.ReflexImpl
	 * @see gamamodel.impl.GamamodelPackageImpl#getReflex()
	 * @generated
	 */
	int REFLEX = 5;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX__ACTION_NAME = ACTION__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX__ID = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX__CONDITION = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reflex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reflex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLEX_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gamamodel.impl.SpecieBlockImpl <em>Specie Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamamodel.impl.SpecieBlockImpl
	 * @see gamamodel.impl.GamamodelPackageImpl#getSpecieBlock()
	 * @generated
	 */
	int SPECIE_BLOCK = 6;

	/**
	 * The feature id for the '<em><b>Specie Block Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIE_BLOCK__SPECIE_BLOCK_NAME = 0;

	/**
	 * The feature id for the '<em><b>Aspect Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIE_BLOCK__ASPECT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIE_BLOCK__COLOR = 2;

	/**
	 * The feature id for the '<em><b>Containsaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIE_BLOCK__CONTAINSACTION = 3;

	/**
	 * The feature id for the '<em><b>Initfunction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIE_BLOCK__INITFUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Aspectfunction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIE_BLOCK__ASPECTFUNCTION = 5;

	/**
	 * The feature id for the '<em><b>Haspropertie</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIE_BLOCK__HASPROPERTIE = 6;

	/**
	 * The feature id for the '<em><b>Skillofspecie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIE_BLOCK__SKILLOFSPECIE = 7;

	/**
	 * The number of structural features of the '<em>Specie Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIE_BLOCK_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Specie Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIE_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gamamodel.impl.DisplayImpl <em>Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamamodel.impl.DisplayImpl
	 * @see gamamodel.impl.GamamodelPackageImpl#getDisplay()
	 * @generated
	 */
	int DISPLAY = 7;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__DISPLAY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Display Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__DISPLAY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Specieblock</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__SPECIEBLOCK = 2;

	/**
	 * The number of structural features of the '<em>Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gamamodel.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamamodel.impl.GlobalVariableImpl
	 * @see gamamodel.impl.GamamodelPackageImpl#getGlobalVariable()
	 * @generated
	 */
	int GLOBAL_VARIABLE = 8;

	/**
	 * The feature id for the '<em><b>Gvar Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__GVAR_NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Init Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__INIT_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gamamodel.impl.GlobalBlockImpl <em>Global Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamamodel.impl.GlobalBlockImpl
	 * @see gamamodel.impl.GamamodelPackageImpl#getGlobalBlock()
	 * @generated
	 */
	int GLOBAL_BLOCK = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK__ID = 0;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK__INIT = 1;

	/**
	 * The feature id for the '<em><b>Containsglobalvariable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK__CONTAINSGLOBALVARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Hasspatialentity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK__HASSPATIALENTITY = 3;

	/**
	 * The number of structural features of the '<em>Global Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Global Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gamamodel.impl.ExportfileImpl <em>Exportfile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamamodel.impl.ExportfileImpl
	 * @see gamamodel.impl.GamamodelPackageImpl#getExportfile()
	 * @generated
	 */
	int EXPORTFILE = 10;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTFILE__FILE_NAME = 0;

	/**
	 * The feature id for the '<em><b>File Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTFILE__FILE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Exportfile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTFILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Exportfile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORTFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gamamodel.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamamodel.impl.ParameterImpl
	 * @see gamamodel.impl.GamamodelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 11;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Target Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TARGET_VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gamamodel.impl.simpleActionImpl <em>simple Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamamodel.impl.simpleActionImpl
	 * @see gamamodel.impl.GamamodelPackageImpl#getsimpleAction()
	 * @generated
	 */
	int SIMPLE_ACTION = 12;

	/**
	 * The feature id for the '<em><b>Action Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION__ACTION_NAME = ACTION__ACTION_NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION__ID = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION__RETURN_TYPE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>simple Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>simple Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gamamodel.impl.PropertieImpl <em>Propertie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamamodel.impl.PropertieImpl
	 * @see gamamodel.impl.GamamodelPackageImpl#getPropertie()
	 * @generated
	 */
	int PROPERTIE = 13;

	/**
	 * The feature id for the '<em><b>Propertie Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIE__PROPERTIE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Init Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIE__INIT_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Propertie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Propertie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gamamodel.impl.SpatialEntityImpl <em>Spatial Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamamodel.impl.SpatialEntityImpl
	 * @see gamamodel.impl.GamamodelPackageImpl#getSpatialEntity()
	 * @generated
	 */
	int SPATIAL_ENTITY = 14;

	/**
	 * The feature id for the '<em><b>Shape Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_ENTITY__SHAPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Shape Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_ENTITY__SHAPE_PATH = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_ENTITY__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Spatial Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_ENTITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Spatial Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gamamodel.impl.InspectorImpl <em>Inspector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamamodel.impl.InspectorImpl
	 * @see gamamodel.impl.GamamodelPackageImpl#getInspector()
	 * @generated
	 */
	int INSPECTOR = 15;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTOR__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Specie Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTOR__SPECIE_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTOR__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Hasinspector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTOR__HASINSPECTOR = 3;

	/**
	 * The number of structural features of the '<em>Inspector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Inspector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gamamodel.impl.MonitorImpl <em>Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gamamodel.impl.MonitorImpl
	 * @see gamamodel.impl.GamamodelPackageImpl#getMonitor()
	 * @generated
	 */
	int MONITOR = 16;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Target Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__TARGET_VAR = 1;

	/**
	 * The number of structural features of the '<em>Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link gamamodel.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see gamamodel.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Action#getActionName <em>Action Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Name</em>'.
	 * @see gamamodel.Action#getActionName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_ActionName();

	/**
	 * Returns the meta object for class '{@link gamamodel.ExperimentBlock <em>Experiment Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Block</em>'.
	 * @see gamamodel.ExperimentBlock
	 * @generated
	 */
	EClass getExperimentBlock();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.ExperimentBlock#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gamamodel.ExperimentBlock#getType()
	 * @see #getExperimentBlock()
	 * @generated
	 */
	EAttribute getExperimentBlock_Type();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.ExperimentBlock#getExperimentName <em>Experiment Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Experiment Name</em>'.
	 * @see gamamodel.ExperimentBlock#getExperimentName()
	 * @see #getExperimentBlock()
	 * @generated
	 */
	EAttribute getExperimentBlock_ExperimentName();

	/**
	 * Returns the meta object for the containment reference list '{@link gamamodel.ExperimentBlock#getHasparameter <em>Hasparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hasparameter</em>'.
	 * @see gamamodel.ExperimentBlock#getHasparameter()
	 * @see #getExperimentBlock()
	 * @generated
	 */
	EReference getExperimentBlock_Hasparameter();

	/**
	 * Returns the meta object for the containment reference list '{@link gamamodel.ExperimentBlock#getHasoutput <em>Hasoutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hasoutput</em>'.
	 * @see gamamodel.ExperimentBlock#getHasoutput()
	 * @see #getExperimentBlock()
	 * @generated
	 */
	EReference getExperimentBlock_Hasoutput();

	/**
	 * Returns the meta object for class '{@link gamamodel.ComplexeAction <em>Complexe Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complexe Action</em>'.
	 * @see gamamodel.ComplexeAction
	 * @generated
	 */
	EClass getComplexeAction();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.ComplexeAction#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gamamodel.ComplexeAction#getId()
	 * @see #getComplexeAction()
	 * @generated
	 */
	EAttribute getComplexeAction_Id();

	/**
	 * Returns the meta object for class '{@link gamamodel.Gamamodel <em>Gamamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gamamodel</em>'.
	 * @see gamamodel.Gamamodel
	 * @generated
	 */
	EClass getGamamodel();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Gamamodel#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see gamamodel.Gamamodel#getModelName()
	 * @see #getGamamodel()
	 * @generated
	 */
	EAttribute getGamamodel_ModelName();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Gamamodel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see gamamodel.Gamamodel#getDescription()
	 * @see #getGamamodel()
	 * @generated
	 */
	EAttribute getGamamodel_Description();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Gamamodel#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keywords</em>'.
	 * @see gamamodel.Gamamodel#getKeywords()
	 * @see #getGamamodel()
	 * @generated
	 */
	EAttribute getGamamodel_Keywords();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Gamamodel#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see gamamodel.Gamamodel#getAuthor()
	 * @see #getGamamodel()
	 * @generated
	 */
	EAttribute getGamamodel_Author();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Gamamodel#getCreatedOn <em>Created On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created On</em>'.
	 * @see gamamodel.Gamamodel#getCreatedOn()
	 * @see #getGamamodel()
	 * @generated
	 */
	EAttribute getGamamodel_CreatedOn();

	/**
	 * Returns the meta object for the containment reference '{@link gamamodel.Gamamodel#getContainsglobal <em>Containsglobal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Containsglobal</em>'.
	 * @see gamamodel.Gamamodel#getContainsglobal()
	 * @see #getGamamodel()
	 * @generated
	 */
	EReference getGamamodel_Containsglobal();

	/**
	 * Returns the meta object for the containment reference list '{@link gamamodel.Gamamodel#getContainsspecie <em>Containsspecie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsspecie</em>'.
	 * @see gamamodel.Gamamodel#getContainsspecie()
	 * @see #getGamamodel()
	 * @generated
	 */
	EReference getGamamodel_Containsspecie();

	/**
	 * Returns the meta object for the containment reference list '{@link gamamodel.Gamamodel#getContainsexperiment <em>Containsexperiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsexperiment</em>'.
	 * @see gamamodel.Gamamodel#getContainsexperiment()
	 * @see #getGamamodel()
	 * @generated
	 */
	EReference getGamamodel_Containsexperiment();

	/**
	 * Returns the meta object for class '{@link gamamodel.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see gamamodel.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Output#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gamamodel.Output#getId()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link gamamodel.Output#getHasdisplays <em>Hasdisplays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hasdisplays</em>'.
	 * @see gamamodel.Output#getHasdisplays()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Hasdisplays();

	/**
	 * Returns the meta object for the containment reference list '{@link gamamodel.Output#getHasexportfile <em>Hasexportfile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hasexportfile</em>'.
	 * @see gamamodel.Output#getHasexportfile()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Hasexportfile();

	/**
	 * Returns the meta object for the containment reference list '{@link gamamodel.Output#getHasmonitor <em>Hasmonitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hasmonitor</em>'.
	 * @see gamamodel.Output#getHasmonitor()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Hasmonitor();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Output#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gamamodel.Output#getName()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Name();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Output#getFramerate <em>Framerate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Framerate</em>'.
	 * @see gamamodel.Output#getFramerate()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Framerate();

	/**
	 * Returns the meta object for class '{@link gamamodel.Reflex <em>Reflex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reflex</em>'.
	 * @see gamamodel.Reflex
	 * @generated
	 */
	EClass getReflex();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Reflex#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gamamodel.Reflex#getId()
	 * @see #getReflex()
	 * @generated
	 */
	EAttribute getReflex_Id();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Reflex#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see gamamodel.Reflex#getCondition()
	 * @see #getReflex()
	 * @generated
	 */
	EAttribute getReflex_Condition();

	/**
	 * Returns the meta object for class '{@link gamamodel.SpecieBlock <em>Specie Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specie Block</em>'.
	 * @see gamamodel.SpecieBlock
	 * @generated
	 */
	EClass getSpecieBlock();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.SpecieBlock#getSpecieBlockName <em>Specie Block Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specie Block Name</em>'.
	 * @see gamamodel.SpecieBlock#getSpecieBlockName()
	 * @see #getSpecieBlock()
	 * @generated
	 */
	EAttribute getSpecieBlock_SpecieBlockName();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.SpecieBlock#getAspectName <em>Aspect Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aspect Name</em>'.
	 * @see gamamodel.SpecieBlock#getAspectName()
	 * @see #getSpecieBlock()
	 * @generated
	 */
	EAttribute getSpecieBlock_AspectName();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.SpecieBlock#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see gamamodel.SpecieBlock#getColor()
	 * @see #getSpecieBlock()
	 * @generated
	 */
	EAttribute getSpecieBlock_Color();

	/**
	 * Returns the meta object for the containment reference list '{@link gamamodel.SpecieBlock#getContainsaction <em>Containsaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsaction</em>'.
	 * @see gamamodel.SpecieBlock#getContainsaction()
	 * @see #getSpecieBlock()
	 * @generated
	 */
	EReference getSpecieBlock_Containsaction();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.SpecieBlock#getInitfunction <em>Initfunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initfunction</em>'.
	 * @see gamamodel.SpecieBlock#getInitfunction()
	 * @see #getSpecieBlock()
	 * @generated
	 */
	EAttribute getSpecieBlock_Initfunction();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.SpecieBlock#isAspectfunction <em>Aspectfunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aspectfunction</em>'.
	 * @see gamamodel.SpecieBlock#isAspectfunction()
	 * @see #getSpecieBlock()
	 * @generated
	 */
	EAttribute getSpecieBlock_Aspectfunction();

	/**
	 * Returns the meta object for the containment reference list '{@link gamamodel.SpecieBlock#getHaspropertie <em>Haspropertie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Haspropertie</em>'.
	 * @see gamamodel.SpecieBlock#getHaspropertie()
	 * @see #getSpecieBlock()
	 * @generated
	 */
	EReference getSpecieBlock_Haspropertie();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.SpecieBlock#getSkillofspecie <em>Skillofspecie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skillofspecie</em>'.
	 * @see gamamodel.SpecieBlock#getSkillofspecie()
	 * @see #getSpecieBlock()
	 * @generated
	 */
	EAttribute getSpecieBlock_Skillofspecie();

	/**
	 * Returns the meta object for class '{@link gamamodel.Display <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display</em>'.
	 * @see gamamodel.Display
	 * @generated
	 */
	EClass getDisplay();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Display#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see gamamodel.Display#getDisplayName()
	 * @see #getDisplay()
	 * @generated
	 */
	EAttribute getDisplay_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Display#getDisplayType <em>Display Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Type</em>'.
	 * @see gamamodel.Display#getDisplayType()
	 * @see #getDisplay()
	 * @generated
	 */
	EAttribute getDisplay_DisplayType();

	/**
	 * Returns the meta object for the containment reference list '{@link gamamodel.Display#getSpecieblock <em>Specieblock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specieblock</em>'.
	 * @see gamamodel.Display#getSpecieblock()
	 * @see #getDisplay()
	 * @generated
	 */
	EReference getDisplay_Specieblock();

	/**
	 * Returns the meta object for class '{@link gamamodel.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Variable</em>'.
	 * @see gamamodel.GlobalVariable
	 * @generated
	 */
	EClass getGlobalVariable();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.GlobalVariable#getGvarName <em>Gvar Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gvar Name</em>'.
	 * @see gamamodel.GlobalVariable#getGvarName()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EAttribute getGlobalVariable_GvarName();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.GlobalVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gamamodel.GlobalVariable#getType()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EAttribute getGlobalVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.GlobalVariable#getInitValue <em>Init Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Value</em>'.
	 * @see gamamodel.GlobalVariable#getInitValue()
	 * @see #getGlobalVariable()
	 * @generated
	 */
	EAttribute getGlobalVariable_InitValue();

	/**
	 * Returns the meta object for class '{@link gamamodel.GlobalBlock <em>Global Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Block</em>'.
	 * @see gamamodel.GlobalBlock
	 * @generated
	 */
	EClass getGlobalBlock();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.GlobalBlock#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gamamodel.GlobalBlock#getId()
	 * @see #getGlobalBlock()
	 * @generated
	 */
	EAttribute getGlobalBlock_Id();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.GlobalBlock#isInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init</em>'.
	 * @see gamamodel.GlobalBlock#isInit()
	 * @see #getGlobalBlock()
	 * @generated
	 */
	EAttribute getGlobalBlock_Init();

	/**
	 * Returns the meta object for the containment reference list '{@link gamamodel.GlobalBlock#getContainsglobalvariable <em>Containsglobalvariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsglobalvariable</em>'.
	 * @see gamamodel.GlobalBlock#getContainsglobalvariable()
	 * @see #getGlobalBlock()
	 * @generated
	 */
	EReference getGlobalBlock_Containsglobalvariable();

	/**
	 * Returns the meta object for the containment reference list '{@link gamamodel.GlobalBlock#getHasspatialentity <em>Hasspatialentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hasspatialentity</em>'.
	 * @see gamamodel.GlobalBlock#getHasspatialentity()
	 * @see #getGlobalBlock()
	 * @generated
	 */
	EReference getGlobalBlock_Hasspatialentity();

	/**
	 * Returns the meta object for class '{@link gamamodel.Exportfile <em>Exportfile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exportfile</em>'.
	 * @see gamamodel.Exportfile
	 * @generated
	 */
	EClass getExportfile();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Exportfile#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see gamamodel.Exportfile#getFileName()
	 * @see #getExportfile()
	 * @generated
	 */
	EAttribute getExportfile_FileName();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Exportfile#getFileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Type</em>'.
	 * @see gamamodel.Exportfile#getFileType()
	 * @see #getExportfile()
	 * @generated
	 */
	EAttribute getExportfile_FileType();

	/**
	 * Returns the meta object for class '{@link gamamodel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see gamamodel.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Parameter#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see gamamodel.Parameter#getParameterName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ParameterName();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Parameter#getTargetVariable <em>Target Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Variable</em>'.
	 * @see gamamodel.Parameter#getTargetVariable()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_TargetVariable();

	/**
	 * Returns the meta object for class '{@link gamamodel.simpleAction <em>simple Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>simple Action</em>'.
	 * @see gamamodel.simpleAction
	 * @generated
	 */
	EClass getsimpleAction();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.simpleAction#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gamamodel.simpleAction#getId()
	 * @see #getsimpleAction()
	 * @generated
	 */
	EAttribute getsimpleAction_Id();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.simpleAction#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see gamamodel.simpleAction#getReturnType()
	 * @see #getsimpleAction()
	 * @generated
	 */
	EAttribute getsimpleAction_ReturnType();

	/**
	 * Returns the meta object for class '{@link gamamodel.Propertie <em>Propertie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propertie</em>'.
	 * @see gamamodel.Propertie
	 * @generated
	 */
	EClass getPropertie();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Propertie#getPropertieName <em>Propertie Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Propertie Name</em>'.
	 * @see gamamodel.Propertie#getPropertieName()
	 * @see #getPropertie()
	 * @generated
	 */
	EAttribute getPropertie_PropertieName();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Propertie#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gamamodel.Propertie#getType()
	 * @see #getPropertie()
	 * @generated
	 */
	EAttribute getPropertie_Type();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Propertie#getInitValue <em>Init Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Value</em>'.
	 * @see gamamodel.Propertie#getInitValue()
	 * @see #getPropertie()
	 * @generated
	 */
	EAttribute getPropertie_InitValue();

	/**
	 * Returns the meta object for class '{@link gamamodel.SpatialEntity <em>Spatial Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spatial Entity</em>'.
	 * @see gamamodel.SpatialEntity
	 * @generated
	 */
	EClass getSpatialEntity();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.SpatialEntity#getShapeName <em>Shape Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape Name</em>'.
	 * @see gamamodel.SpatialEntity#getShapeName()
	 * @see #getSpatialEntity()
	 * @generated
	 */
	EAttribute getSpatialEntity_ShapeName();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.SpatialEntity#getShapePath <em>Shape Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape Path</em>'.
	 * @see gamamodel.SpatialEntity#getShapePath()
	 * @see #getSpatialEntity()
	 * @generated
	 */
	EAttribute getSpatialEntity_ShapePath();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.SpatialEntity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gamamodel.SpatialEntity#getType()
	 * @see #getSpatialEntity()
	 * @generated
	 */
	EAttribute getSpatialEntity_Type();

	/**
	 * Returns the meta object for class '{@link gamamodel.Inspector <em>Inspector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inspector</em>'.
	 * @see gamamodel.Inspector
	 * @generated
	 */
	EClass getInspector();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Inspector#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see gamamodel.Inspector#getLabel()
	 * @see #getInspector()
	 * @generated
	 */
	EAttribute getInspector_Label();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Inspector#getSpecieValue <em>Specie Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specie Value</em>'.
	 * @see gamamodel.Inspector#getSpecieValue()
	 * @see #getInspector()
	 * @generated
	 */
	EAttribute getInspector_SpecieValue();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Inspector#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gamamodel.Inspector#getType()
	 * @see #getInspector()
	 * @generated
	 */
	EAttribute getInspector_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link gamamodel.Inspector#getHasinspector <em>Hasinspector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hasinspector</em>'.
	 * @see gamamodel.Inspector#getHasinspector()
	 * @see #getInspector()
	 * @generated
	 */
	EReference getInspector_Hasinspector();

	/**
	 * Returns the meta object for class '{@link gamamodel.Monitor <em>Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitor</em>'.
	 * @see gamamodel.Monitor
	 * @generated
	 */
	EClass getMonitor();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Monitor#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see gamamodel.Monitor#getLabel()
	 * @see #getMonitor()
	 * @generated
	 */
	EAttribute getMonitor_Label();

	/**
	 * Returns the meta object for the attribute '{@link gamamodel.Monitor#getTargetVar <em>Target Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Var</em>'.
	 * @see gamamodel.Monitor#getTargetVar()
	 * @see #getMonitor()
	 * @generated
	 */
	EAttribute getMonitor_TargetVar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GamamodelFactory getGamamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gamamodel.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamamodel.impl.ActionImpl
		 * @see gamamodel.impl.GamamodelPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__ACTION_NAME = eINSTANCE.getAction_ActionName();

		/**
		 * The meta object literal for the '{@link gamamodel.impl.ExperimentBlockImpl <em>Experiment Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamamodel.impl.ExperimentBlockImpl
		 * @see gamamodel.impl.GamamodelPackageImpl#getExperimentBlock()
		 * @generated
		 */
		EClass EXPERIMENT_BLOCK = eINSTANCE.getExperimentBlock();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_BLOCK__TYPE = eINSTANCE.getExperimentBlock_Type();

		/**
		 * The meta object literal for the '<em><b>Experiment Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT_BLOCK__EXPERIMENT_NAME = eINSTANCE.getExperimentBlock_ExperimentName();

		/**
		 * The meta object literal for the '<em><b>Hasparameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_BLOCK__HASPARAMETER = eINSTANCE.getExperimentBlock_Hasparameter();

		/**
		 * The meta object literal for the '<em><b>Hasoutput</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_BLOCK__HASOUTPUT = eINSTANCE.getExperimentBlock_Hasoutput();

		/**
		 * The meta object literal for the '{@link gamamodel.impl.ComplexeActionImpl <em>Complexe Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamamodel.impl.ComplexeActionImpl
		 * @see gamamodel.impl.GamamodelPackageImpl#getComplexeAction()
		 * @generated
		 */
		EClass COMPLEXE_ACTION = eINSTANCE.getComplexeAction();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEXE_ACTION__ID = eINSTANCE.getComplexeAction_Id();

		/**
		 * The meta object literal for the '{@link gamamodel.impl.GamamodelImpl <em>Gamamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamamodel.impl.GamamodelImpl
		 * @see gamamodel.impl.GamamodelPackageImpl#getGamamodel()
		 * @generated
		 */
		EClass GAMAMODEL = eINSTANCE.getGamamodel();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMAMODEL__MODEL_NAME = eINSTANCE.getGamamodel_ModelName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMAMODEL__DESCRIPTION = eINSTANCE.getGamamodel_Description();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMAMODEL__KEYWORDS = eINSTANCE.getGamamodel_Keywords();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMAMODEL__AUTHOR = eINSTANCE.getGamamodel_Author();

		/**
		 * The meta object literal for the '<em><b>Created On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAMAMODEL__CREATED_ON = eINSTANCE.getGamamodel_CreatedOn();

		/**
		 * The meta object literal for the '<em><b>Containsglobal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMAMODEL__CONTAINSGLOBAL = eINSTANCE.getGamamodel_Containsglobal();

		/**
		 * The meta object literal for the '<em><b>Containsspecie</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMAMODEL__CONTAINSSPECIE = eINSTANCE.getGamamodel_Containsspecie();

		/**
		 * The meta object literal for the '<em><b>Containsexperiment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMAMODEL__CONTAINSEXPERIMENT = eINSTANCE.getGamamodel_Containsexperiment();

		/**
		 * The meta object literal for the '{@link gamamodel.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamamodel.impl.OutputImpl
		 * @see gamamodel.impl.GamamodelPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__ID = eINSTANCE.getOutput_Id();

		/**
		 * The meta object literal for the '<em><b>Hasdisplays</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__HASDISPLAYS = eINSTANCE.getOutput_Hasdisplays();

		/**
		 * The meta object literal for the '<em><b>Hasexportfile</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__HASEXPORTFILE = eINSTANCE.getOutput_Hasexportfile();

		/**
		 * The meta object literal for the '<em><b>Hasmonitor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__HASMONITOR = eINSTANCE.getOutput_Hasmonitor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__NAME = eINSTANCE.getOutput_Name();

		/**
		 * The meta object literal for the '<em><b>Framerate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__FRAMERATE = eINSTANCE.getOutput_Framerate();

		/**
		 * The meta object literal for the '{@link gamamodel.impl.ReflexImpl <em>Reflex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamamodel.impl.ReflexImpl
		 * @see gamamodel.impl.GamamodelPackageImpl#getReflex()
		 * @generated
		 */
		EClass REFLEX = eINSTANCE.getReflex();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFLEX__ID = eINSTANCE.getReflex_Id();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFLEX__CONDITION = eINSTANCE.getReflex_Condition();

		/**
		 * The meta object literal for the '{@link gamamodel.impl.SpecieBlockImpl <em>Specie Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamamodel.impl.SpecieBlockImpl
		 * @see gamamodel.impl.GamamodelPackageImpl#getSpecieBlock()
		 * @generated
		 */
		EClass SPECIE_BLOCK = eINSTANCE.getSpecieBlock();

		/**
		 * The meta object literal for the '<em><b>Specie Block Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIE_BLOCK__SPECIE_BLOCK_NAME = eINSTANCE.getSpecieBlock_SpecieBlockName();

		/**
		 * The meta object literal for the '<em><b>Aspect Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIE_BLOCK__ASPECT_NAME = eINSTANCE.getSpecieBlock_AspectName();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIE_BLOCK__COLOR = eINSTANCE.getSpecieBlock_Color();

		/**
		 * The meta object literal for the '<em><b>Containsaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIE_BLOCK__CONTAINSACTION = eINSTANCE.getSpecieBlock_Containsaction();

		/**
		 * The meta object literal for the '<em><b>Initfunction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIE_BLOCK__INITFUNCTION = eINSTANCE.getSpecieBlock_Initfunction();

		/**
		 * The meta object literal for the '<em><b>Aspectfunction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIE_BLOCK__ASPECTFUNCTION = eINSTANCE.getSpecieBlock_Aspectfunction();

		/**
		 * The meta object literal for the '<em><b>Haspropertie</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIE_BLOCK__HASPROPERTIE = eINSTANCE.getSpecieBlock_Haspropertie();

		/**
		 * The meta object literal for the '<em><b>Skillofspecie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIE_BLOCK__SKILLOFSPECIE = eINSTANCE.getSpecieBlock_Skillofspecie();

		/**
		 * The meta object literal for the '{@link gamamodel.impl.DisplayImpl <em>Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamamodel.impl.DisplayImpl
		 * @see gamamodel.impl.GamamodelPackageImpl#getDisplay()
		 * @generated
		 */
		EClass DISPLAY = eINSTANCE.getDisplay();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY__DISPLAY_NAME = eINSTANCE.getDisplay_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Display Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY__DISPLAY_TYPE = eINSTANCE.getDisplay_DisplayType();

		/**
		 * The meta object literal for the '<em><b>Specieblock</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY__SPECIEBLOCK = eINSTANCE.getDisplay_Specieblock();

		/**
		 * The meta object literal for the '{@link gamamodel.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamamodel.impl.GlobalVariableImpl
		 * @see gamamodel.impl.GamamodelPackageImpl#getGlobalVariable()
		 * @generated
		 */
		EClass GLOBAL_VARIABLE = eINSTANCE.getGlobalVariable();

		/**
		 * The meta object literal for the '<em><b>Gvar Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_VARIABLE__GVAR_NAME = eINSTANCE.getGlobalVariable_GvarName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_VARIABLE__TYPE = eINSTANCE.getGlobalVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Init Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_VARIABLE__INIT_VALUE = eINSTANCE.getGlobalVariable_InitValue();

		/**
		 * The meta object literal for the '{@link gamamodel.impl.GlobalBlockImpl <em>Global Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamamodel.impl.GlobalBlockImpl
		 * @see gamamodel.impl.GamamodelPackageImpl#getGlobalBlock()
		 * @generated
		 */
		EClass GLOBAL_BLOCK = eINSTANCE.getGlobalBlock();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_BLOCK__ID = eINSTANCE.getGlobalBlock_Id();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_BLOCK__INIT = eINSTANCE.getGlobalBlock_Init();

		/**
		 * The meta object literal for the '<em><b>Containsglobalvariable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_BLOCK__CONTAINSGLOBALVARIABLE = eINSTANCE.getGlobalBlock_Containsglobalvariable();

		/**
		 * The meta object literal for the '<em><b>Hasspatialentity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_BLOCK__HASSPATIALENTITY = eINSTANCE.getGlobalBlock_Hasspatialentity();

		/**
		 * The meta object literal for the '{@link gamamodel.impl.ExportfileImpl <em>Exportfile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamamodel.impl.ExportfileImpl
		 * @see gamamodel.impl.GamamodelPackageImpl#getExportfile()
		 * @generated
		 */
		EClass EXPORTFILE = eINSTANCE.getExportfile();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORTFILE__FILE_NAME = eINSTANCE.getExportfile_FileName();

		/**
		 * The meta object literal for the '<em><b>File Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPORTFILE__FILE_TYPE = eINSTANCE.getExportfile_FileType();

		/**
		 * The meta object literal for the '{@link gamamodel.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamamodel.impl.ParameterImpl
		 * @see gamamodel.impl.GamamodelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PARAMETER_NAME = eINSTANCE.getParameter_ParameterName();

		/**
		 * The meta object literal for the '<em><b>Target Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TARGET_VARIABLE = eINSTANCE.getParameter_TargetVariable();

		/**
		 * The meta object literal for the '{@link gamamodel.impl.simpleActionImpl <em>simple Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamamodel.impl.simpleActionImpl
		 * @see gamamodel.impl.GamamodelPackageImpl#getsimpleAction()
		 * @generated
		 */
		EClass SIMPLE_ACTION = eINSTANCE.getsimpleAction();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_ACTION__ID = eINSTANCE.getsimpleAction_Id();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_ACTION__RETURN_TYPE = eINSTANCE.getsimpleAction_ReturnType();

		/**
		 * The meta object literal for the '{@link gamamodel.impl.PropertieImpl <em>Propertie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamamodel.impl.PropertieImpl
		 * @see gamamodel.impl.GamamodelPackageImpl#getPropertie()
		 * @generated
		 */
		EClass PROPERTIE = eINSTANCE.getPropertie();

		/**
		 * The meta object literal for the '<em><b>Propertie Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIE__PROPERTIE_NAME = eINSTANCE.getPropertie_PropertieName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIE__TYPE = eINSTANCE.getPropertie_Type();

		/**
		 * The meta object literal for the '<em><b>Init Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIE__INIT_VALUE = eINSTANCE.getPropertie_InitValue();

		/**
		 * The meta object literal for the '{@link gamamodel.impl.SpatialEntityImpl <em>Spatial Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamamodel.impl.SpatialEntityImpl
		 * @see gamamodel.impl.GamamodelPackageImpl#getSpatialEntity()
		 * @generated
		 */
		EClass SPATIAL_ENTITY = eINSTANCE.getSpatialEntity();

		/**
		 * The meta object literal for the '<em><b>Shape Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_ENTITY__SHAPE_NAME = eINSTANCE.getSpatialEntity_ShapeName();

		/**
		 * The meta object literal for the '<em><b>Shape Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_ENTITY__SHAPE_PATH = eINSTANCE.getSpatialEntity_ShapePath();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_ENTITY__TYPE = eINSTANCE.getSpatialEntity_Type();

		/**
		 * The meta object literal for the '{@link gamamodel.impl.InspectorImpl <em>Inspector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamamodel.impl.InspectorImpl
		 * @see gamamodel.impl.GamamodelPackageImpl#getInspector()
		 * @generated
		 */
		EClass INSPECTOR = eINSTANCE.getInspector();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSPECTOR__LABEL = eINSTANCE.getInspector_Label();

		/**
		 * The meta object literal for the '<em><b>Specie Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSPECTOR__SPECIE_VALUE = eINSTANCE.getInspector_SpecieValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSPECTOR__TYPE = eINSTANCE.getInspector_Type();

		/**
		 * The meta object literal for the '<em><b>Hasinspector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSPECTOR__HASINSPECTOR = eINSTANCE.getInspector_Hasinspector();

		/**
		 * The meta object literal for the '{@link gamamodel.impl.MonitorImpl <em>Monitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gamamodel.impl.MonitorImpl
		 * @see gamamodel.impl.GamamodelPackageImpl#getMonitor()
		 * @generated
		 */
		EClass MONITOR = eINSTANCE.getMonitor();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITOR__LABEL = eINSTANCE.getMonitor_Label();

		/**
		 * The meta object literal for the '<em><b>Target Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITOR__TARGET_VAR = eINSTANCE.getMonitor_TargetVar();

	}

} //GamamodelPackage
