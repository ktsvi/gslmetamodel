/*
 * generated by Xtext 2.21.0
 */
package com.ktsv.gsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/ktsv/gsl/parser/antlr/internal/InternalGsl.tokens");
	}
}
