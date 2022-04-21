/**
 */
package gamamodel.util;

import gamamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gamamodel.GamamodelPackage
 * @generated
 */
public class GamamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GamamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GamamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GamamodelSwitch<Adapter> modelSwitch =
		new GamamodelSwitch<Adapter>() {
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseExperimentBlock(ExperimentBlock object) {
				return createExperimentBlockAdapter();
			}
			@Override
			public Adapter caseComplexeAction(ComplexeAction object) {
				return createComplexeActionAdapter();
			}
			@Override
			public Adapter caseGamamodel(Gamamodel object) {
				return createGamamodelAdapter();
			}
			@Override
			public Adapter caseOutput(Output object) {
				return createOutputAdapter();
			}
			@Override
			public Adapter caseReflex(Reflex object) {
				return createReflexAdapter();
			}
			@Override
			public Adapter caseSpecieBlock(SpecieBlock object) {
				return createSpecieBlockAdapter();
			}
			@Override
			public Adapter caseDisplay(Display object) {
				return createDisplayAdapter();
			}
			@Override
			public Adapter caseGlobalVariable(GlobalVariable object) {
				return createGlobalVariableAdapter();
			}
			@Override
			public Adapter caseGlobalBlock(GlobalBlock object) {
				return createGlobalBlockAdapter();
			}
			@Override
			public Adapter caseExportfile(Exportfile object) {
				return createExportfileAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter casesimpleAction(simpleAction object) {
				return createsimpleActionAdapter();
			}
			@Override
			public Adapter casePropertie(Propertie object) {
				return createPropertieAdapter();
			}
			@Override
			public Adapter caseSpatialEntity(SpatialEntity object) {
				return createSpatialEntityAdapter();
			}
			@Override
			public Adapter caseInspector(Inspector object) {
				return createInspectorAdapter();
			}
			@Override
			public Adapter caseMonitor(Monitor object) {
				return createMonitorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gamamodel.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamamodel.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamamodel.ExperimentBlock <em>Experiment Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamamodel.ExperimentBlock
	 * @generated
	 */
	public Adapter createExperimentBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamamodel.ComplexeAction <em>Complexe Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamamodel.ComplexeAction
	 * @generated
	 */
	public Adapter createComplexeActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamamodel.Gamamodel <em>Gamamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamamodel.Gamamodel
	 * @generated
	 */
	public Adapter createGamamodelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamamodel.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamamodel.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamamodel.Reflex <em>Reflex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamamodel.Reflex
	 * @generated
	 */
	public Adapter createReflexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamamodel.SpecieBlock <em>Specie Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamamodel.SpecieBlock
	 * @generated
	 */
	public Adapter createSpecieBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamamodel.Display <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamamodel.Display
	 * @generated
	 */
	public Adapter createDisplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamamodel.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamamodel.GlobalVariable
	 * @generated
	 */
	public Adapter createGlobalVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamamodel.GlobalBlock <em>Global Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamamodel.GlobalBlock
	 * @generated
	 */
	public Adapter createGlobalBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamamodel.Exportfile <em>Exportfile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamamodel.Exportfile
	 * @generated
	 */
	public Adapter createExportfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamamodel.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamamodel.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamamodel.simpleAction <em>simple Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamamodel.simpleAction
	 * @generated
	 */
	public Adapter createsimpleActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamamodel.Propertie <em>Propertie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamamodel.Propertie
	 * @generated
	 */
	public Adapter createPropertieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamamodel.SpatialEntity <em>Spatial Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamamodel.SpatialEntity
	 * @generated
	 */
	public Adapter createSpatialEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamamodel.Inspector <em>Inspector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamamodel.Inspector
	 * @generated
	 */
	public Adapter createInspectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gamamodel.Monitor <em>Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gamamodel.Monitor
	 * @generated
	 */
	public Adapter createMonitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GamamodelAdapterFactory
