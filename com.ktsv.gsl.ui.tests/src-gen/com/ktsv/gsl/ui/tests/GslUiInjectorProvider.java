/*
 * generated by Xtext 2.21.0
 */
package com.ktsv.gsl.ui.tests;

import com.google.inject.Injector;
import com.ktsv.gsl.ui.internal.GslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class GslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return GslActivator.getInstance().getInjector("com.ktsv.gsl.Gsl");
	}

}
